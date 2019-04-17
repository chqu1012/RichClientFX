package de.dc.javafx.efxclipse.runtime;

import java.io.IOException;
import java.util.EventObject;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CommandStackListener;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.fx.emf.edit.ui.AdapterFactoryTreeCellFactory;
import org.eclipse.fx.emf.edit.ui.AdapterFactoryTreeItem;
import org.eclipse.fx.emf.edit.ui.EAttributeCellEditHandler;
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
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.ListView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.control.TableColumn.CellDataFeatures;
import javafx.scene.layout.BorderPane;
import javafx.util.Callback;
import javafx.util.StringConverter;

public class EMFModelView<T> extends BorderPane implements CommandStackListener, ChangeListener<Object> {

	@FXML
	private TreeView<Object> treeView;

	@FXML
	private ListView<Command> historyList;

	@FXML
	private TableView<EAttribute> tableView;

	@FXML
	private TableColumn<EAttribute, EAttribute> propertyColumn;

	@FXML
	private TableColumn<EAttribute, EAttribute> valueColumn;

	private IEmfManager<T> manager;

	private EObject currentEObject;
	private ObservableList<EAttribute> eAttributeList = FXCollections.observableArrayList();
	private ObservableList<EAttribute> properties = FXCollections.observableArrayList();
	
	public EMFModelView(IEmfManager<T> manager) {
		this.manager = manager;
		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/de/dc/javafx/efxclipse/runtime/EMFModelView.fxml"));
		fxmlLoader.setRoot(this);
		fxmlLoader.setController(this);

		try {
			fxmlLoader.load();
		} catch (IOException exception) {
			throw new RuntimeException(exception);
		}
		
		manager.getCommandStack().addCommandStackListener(this);
		historyList.setCellFactory(new CommandListCellFactory(manager.getAdapterFactory(), manager.getEditingDomain().getCommandStack()));
		historyList.setEditable(false);

		treeView.getSelectionModel().selectedItemProperty().addListener(this);

		TreeItem<Object> rootItem = new AdapterFactoryTreeItem<>(manager.getRoot(), manager.getAdapterFactory());

		treeView.setRoot(rootItem);

		// connect to EMF.edit providers
		AdapterFactoryTreeCellFactory<Object> treeCellFactory = new AdapterFactoryTreeCellFactory<Object>(manager.getAdapterFactory());
		
//		treeCellFactory.addCellEditHandler(new EAttributeCellEditHandler(ModelPackage.eINSTANCE.getContact_Firstname(), manager.getEditingDomain()));

		// adds drag support
		treeCellFactory.addCellCreationListener(new CellDragAdapter());

		// adds drop support
		EditingDomainCellDropAdapter dropAdapter = new EditingDomainCellDropAdapter(manager.getEditingDomain());
		dropAdapter.setFeedbackHandler(new CustomFeedbackHandler());
		treeCellFactory.addCellCreationListener(dropAdapter);
		
		treeView.setCellFactory(treeCellFactory);
		rootItem.setExpanded(true);
		treeView.setEditable(false);

		/*
		 * Properties
		 */
		propertyColumn.setCellValueFactory(new Callback<TableColumn.CellDataFeatures<EAttribute,EAttribute>, ObservableValue<EAttribute>>() {
			@Override
			public ObservableValue call(CellDataFeatures<EAttribute, EAttribute> param) {
				return new SimpleStringProperty(param.getValue().getName());
			}
		});
		valueColumn.setCellValueFactory(new Callback<TableColumn.CellDataFeatures<EAttribute,EAttribute>, ObservableValue<EAttribute>>() {
			@Override
			public ObservableValue call(CellDataFeatures<EAttribute, EAttribute> param) {
				TreeItem<Object> selectedItem = treeView.getSelectionModel().getSelectedItem();
				if (selectedItem != null) {
					Object itemValue = selectedItem.getValue();
					if (itemValue instanceof EObject) {
						EObject element = (EObject) itemValue;
						return new SimpleStringProperty(element.eGet(param.getValue())+"");
					}
				}
				return new SimpleStringProperty("");
			}
		});
		tableView.setItems(properties);
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
//		eattributeComboBox.setItems(eAttributeList);
//		eattributeComboBox.setConverter(stringConverter);

		setDisable(true);
	}

	@Override
	public void changed(ObservableValue<? extends Object> arg0, Object arg1, Object arg2) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void commandStackChanged(EventObject event) {
		// TODO Auto-generated method stub
		
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
}
