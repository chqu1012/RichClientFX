package de.dc.javafx.xcore.resource.ui;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.command.SetCommand;

import de.dc.javafx.efxclipse.runtime.model.IEmfManager;
import de.dc.javafx.xcore.workbench.di.DIPlatform;
import de.dc.javafx.xcore.workbench.event.ISelectionService;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Tab;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.TreeItem;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.scene.input.KeyEvent;

public class PropertyView extends Tab implements ChangeListener<Object>{

	private Logger log = Logger.getLogger(PropertyView.class.getSimpleName());

	@FXML
	protected TableView<EAttribute> tableView;

	@FXML
	protected TableColumn<EAttribute, String> propertyColumn;

	@FXML
	protected TableColumn<EAttribute, String> valueColumn;

	@FXML
	protected TextField propertySearchText;

	protected EObject currentEObject;
	protected ObservableList<EAttribute> eAttributeList = FXCollections.observableArrayList();
	protected ObservableList<EAttribute> properties = FXCollections.observableArrayList();
	protected FilteredList<EAttribute> filteredProperties = new FilteredList<>(properties, p -> true);
	
	private IEmfManager<?> manager;
	
	public PropertyView(IEmfManager<?> manager) {
		this.manager=manager;

		initFxml();
		initTableView();
		setText("PropertyView");
		
		DIPlatform.getInstance(ISelectionService.class).addListener(this);
	}

	private void initTableView() {
		propertyColumn.setCellValueFactory(param -> new SimpleStringProperty(param.getValue().getName()));		
		valueColumn.setCellValueFactory(param ->new SimpleStringProperty(currentEObject.eGet(param.getValue()) + ""));
		valueColumn.setCellFactory(TextFieldTableCell.<EAttribute>forTableColumn());
		valueColumn.setOnEditCommit(evt -> {
			EAttribute selectedAttribute = tableView.getSelectionModel().getSelectedItem();
			Object value = EcoreUtil.createFromString(selectedAttribute.getEAttributeType(), evt.getNewValue());
			SetCommand command = new SetCommand(manager.getEditingDomain(), currentEObject, selectedAttribute, value);
			manager.getEditingDomain().getCommandStack().execute(command);
		});
		tableView.setItems(filteredProperties);
	}

	private void initFxml() {
		FXMLLoader fxmlLoader = new FXMLLoader(
				getClass().getResource("/de/dc/javafx/xcore/resource/ui/PropertyView.fxml"));
		fxmlLoader.setRoot(this);
		fxmlLoader.setController(this);

		try {
			fxmlLoader.load();
		} catch (IOException exception) {
			log.log(Level.SEVERE, "Error loading fxml " + exception.getLocalizedMessage());
		}
	}
	
	@FXML
	protected void onPropertyTextFieldKeyReleased(KeyEvent event) {
		String searchContent = propertySearchText.getText().toLowerCase();
		filteredProperties.setPredicate(p -> {
			if (searchContent == null || searchContent.isEmpty()) {
				return true;
			}
			return filterProperties(searchContent, p);
		});
	}
	
	/**
	 * Search for property name of EAttribute with lowercase
	 * 
	 * @param searchContent
	 * @param p
	 * @return
	 */
	protected boolean filterProperties(String searchContent, EAttribute p) {
		return p.getName().toLowerCase().contains(searchContent);
	}

	@Override
	public void changed(ObservableValue<? extends Object> observable, Object oldValue, Object newValue) {
		if (newValue instanceof TreeItem) {
			properties.clear();
			TreeItem<Object> treeItem = (TreeItem) newValue;
			if (treeItem.getValue() instanceof EObject) {
				currentEObject = (EObject) treeItem.getValue();
				for (EAttribute attr : currentEObject.eClass().getEAllAttributes()) {
					properties.add(attr);
				}
			}
		}
	}

}
