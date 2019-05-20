package de.dc.javafx.efxclipse.runtime;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EventObject;
import java.util.List;
import java.util.Optional;
import java.util.logging.Logger;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CommandStack;
import org.eclipse.emf.common.command.CommandStackListener;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.fx.emf.edit.ui.AdapterFactoryTreeCellFactory;
import org.eclipse.fx.emf.edit.ui.AdapterFactoryTreeItem;
import org.eclipse.fx.emf.edit.ui.dnd.CellDragAdapter;
import org.eclipse.fx.emf.edit.ui.dnd.EditingDomainCellDropAdapter;

import de.dc.javafx.efxclipse.runtime.factory.CommandListCellFactory;
import de.dc.javafx.efxclipse.runtime.handler.CustomFeedbackHandler;
import de.dc.javafx.efxclipse.runtime.model.IEmfManager;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ListView;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.util.StringConverter;

public class EMFModelView<T> extends BorderPane implements CommandStackListener, ChangeListener<Object> {

	private Logger LOG = Logger.getLogger(EMFModelView.class.getSimpleName());
	
	@FXML
	protected TreeView<Object> treeView;

	@FXML
	protected ListView<Command> historyList;

	@FXML
	protected TableView<EAttribute> tableView;

	@FXML
	protected TableColumn<EAttribute, String> propertyColumn;

	@FXML
	protected TableColumn<EAttribute, String> valueColumn;

	@FXML
	protected TextField propertySearchText;

	@FXML
	protected MenuItem newMenuItem;
	
	protected IEmfManager<T> manager;

	protected EObject currentEObject;
	protected EditingDomain editingDomain;
	protected ObservableList<EAttribute> eAttributeList = FXCollections.observableArrayList();
	protected ObservableList<EAttribute> properties = FXCollections.observableArrayList();
	protected FilteredList<EAttribute> filteredProperties = new FilteredList<>(properties, p -> true);

	protected AdapterFactoryTreeCellFactory<Object> treeCellFactory;

	public EMFModelView(IEmfManager<T> manager) {
		this.manager = manager;
		this.editingDomain = manager.getEditingDomain();
		FXMLLoader fxmlLoader = new FXMLLoader(
				getClass().getResource("/de/dc/javafx/efxclipse/runtime/EMFModelView.fxml"));
		fxmlLoader.setRoot(this);
		fxmlLoader.setController(this);

		try {
			fxmlLoader.load();
		} catch (IOException exception) {
			throw new RuntimeException(exception);
		}

		manager.getCommandStack().addCommandStackListener(this);
		historyList.setCellFactory(
				new CommandListCellFactory(manager.getAdapterFactory(), manager.getEditingDomain().getCommandStack()));
		historyList.setEditable(false);

		treeView.getSelectionModel().selectedItemProperty().addListener(this);

		TreeItem<Object> rootItem = new AdapterFactoryTreeItem<>(manager.getRoot(), manager.getAdapterFactory());

		treeView.setRoot(rootItem);

		treeCellFactory = new AdapterFactoryTreeCellFactory<Object>(manager.getAdapterFactory());

		// adds drag support
		treeCellFactory.addCellCreationListener(new CellDragAdapter());

		// adds drop support
		EditingDomainCellDropAdapter dropAdapter = new EditingDomainCellDropAdapter(manager.getEditingDomain());
		dropAdapter.setFeedbackHandler(new CustomFeedbackHandler());
		treeCellFactory.addCellCreationListener(dropAdapter);

		treeView.setCellFactory(treeCellFactory);
		rootItem.setExpanded(true);
		treeView.setEditable(false);

		propertyColumn.setCellValueFactory(param -> new SimpleStringProperty(param.getValue().getName()));
		valueColumn.setCellFactory(TextFieldTableCell.<EAttribute>forTableColumn());
		valueColumn.setOnEditCommit(evt -> {
			EAttribute selectedAttribute = tableView.getSelectionModel().getSelectedItem();
			Object value = EcoreUtil.createFromString(selectedAttribute.getEAttributeType(), evt.getNewValue());
			SetCommand command = new SetCommand(manager.getEditingDomain(), currentEObject, selectedAttribute, value);
			manager.getEditingDomain().getCommandStack().execute(command);
		});
		valueColumn.setCellValueFactory(param -> {
			TreeItem<Object> selectedItem = treeView.getSelectionModel().getSelectedItem();
			if (selectedItem != null) {
				Object itemValue = selectedItem.getValue();
				if (itemValue instanceof EObject) {
					EObject element = (EObject) itemValue;
					return new SimpleStringProperty(element.eGet(param.getValue()) + "");
				}
			}
			return new SimpleStringProperty("");
		});
		tableView.setItems(filteredProperties);
		treeView.getSelectionModel().selectedItemProperty()
				.addListener((ChangeListener<Object>) (observable, oldValue, newValue) -> updateProperties());

		// Displays EAttributes in a readable way
		StringConverter<EAttribute> stringConverter = new StringConverter<EAttribute>() {

			@Override
			public String toString(EAttribute attribute) {
				return attribute.getName();
			}

			@Override
			public EAttribute fromString(String attributeName) {
				return (EAttribute) currentEObject.eClass().getEStructuralFeature(attributeName);
			}
		};

		eAttributeList = FXCollections.observableArrayList();
	}

	@FXML
	protected void onPropertyTextFieldKeyReleased() {
		String searchContent = propertySearchText.getText().toLowerCase();
		filteredProperties.setPredicate(p -> {
			if (searchContent == null || searchContent.isEmpty()) {
				return true;
			}
			boolean filterProperties = filterProperties(searchContent, p);
			return filterProperties;
		});
	}

	/**
	 * Search for property name of EAttribute with lowercase
	 * @param searchContent
	 * @param p
	 * @return
	 */
	protected boolean filterProperties(String searchContent, EAttribute p) {
		return p.getName().toLowerCase().contains(searchContent);
	}

	@Override
	public void changed(ObservableValue<? extends Object> arg0, Object oldValue, Object newValue) {
		if (newValue instanceof TreeItem<?>) {
			Object value = ((TreeItem<?>) newValue).getValue();
			if (value instanceof EObject) {
				currentEObject = (EObject) value;
				eAttributeList.clear();
				EList<EAttribute> eAllAttributes = currentEObject.eClass().getEAllAttributes();
				eAttributeList.addAll(eAllAttributes);
				return;
			}
		}
		currentEObject = null;
	}

	@Override
	public void commandStackChanged(EventObject event) {
		historyList.getItems().clear();
		List<Command> commandList = new ArrayList<>(manager.getCommandStack().getCommandList());
		Collections.reverse(commandList);
		historyList.getItems().addAll(commandList);
	}

	private void refreshButtons() {
//		undoButton.setDisable(!manager.getCommandStack().canUndo());
//		redoButton.setDisable(!manager.getCommandStack().canRedo());
	}

	private void updateProperties() {
		properties.clear();
		TreeItem<Object> selectedItem = treeView.getSelectionModel().getSelectedItem();
		if (selectedItem != null) {
			Object itemValue = selectedItem.getValue();
			if (itemValue instanceof EObject) {
				EObject element = (EObject) itemValue;
				for (EAttribute attr : element.eClass().getEAllAttributes()) {
					properties.add(attr);
				}
				return;
			}
		}
	}

	@FXML
	protected void onDeleteMenuItemClicked(ActionEvent event) {

	}

	@FXML
	protected void onEditMenuItemClicked(ActionEvent event) {

	}

	@FXML
	protected void onNewMenuItemClicked(ActionEvent event) {

	}

	@FXML
	protected void onCopyMenuItemClicked(ActionEvent event) {

	}

	@FXML
	protected void onPasteMenuItemClicked(ActionEvent event) {

	}

	@FXML
	protected void onHistoryMenuItemDeleteClicked(ActionEvent event) {
		Command selection = historyList.getSelectionModel().getSelectedItem();
    	historyList.getItems().remove(selection);
	}

	@FXML
	protected void onHistoryMenuItemRedoClicked(ActionEvent event) {

	}

	@FXML
	protected void onHistoryMenuItemUndoClicked(ActionEvent event) {

	}

	@FXML
	protected void onUndoMenuItemClicked(ActionEvent event) {
		CommandStack commandStack = editingDomain.getCommandStack();
		if (commandStack.canUndo()) {
			commandStack.undo();
			LOG.info("Undo successfully executed!");
		}
	}

	@FXML
	protected void onRedoMenuItemClicked(ActionEvent event) {
		CommandStack commandStack = editingDomain.getCommandStack();
		if (commandStack.canRedo()) {
			commandStack.redo();
			LOG.info("Redo successfully executed!");
		}
	}

	@FXML
	protected void onHistoryListViewClicked(MouseEvent event) {
		if (event.getClickCount() == 2) {
			Command selection = historyList.getSelectionModel().getSelectedItem();
			if (selection != null) {
				Alert alert = new Alert(AlertType.CONFIRMATION);
				alert.setTitle("Confirmation Dialog");
				alert.setHeaderText("Undo to " + selection.getDescription());
				alert.setContentText("Are you ok with this?");

				Optional<ButtonType> result = alert.showAndWait();
				if (result.get() == ButtonType.OK) {
					if (selection.canUndo()) {
						selection.undo();
					}
				}
			}
		}
	}
}
