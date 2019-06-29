package de.dc.javafx.xcore.workbench.event.ui;

import java.io.IOException;

import de.dc.javafx.xcore.workbench.event.ui.model.SelectionProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.TreeTableColumn;
import javafx.scene.control.TreeTableView;
import javafx.scene.layout.VBox;

public class SelectionViewer extends VBox {

	public static final String ID = "de.dc.javafx.xcore.workbench.event.ui.SelectionViewer";
	
	@FXML
	protected CheckBox showAllSuperClassFieldsCheckBox;
	
	@FXML
	protected CheckBox showNullValuesCheckBox;
	
	@FXML
	protected TextField searchText;

	@FXML
	protected Label selectedTypeLabel;

	@FXML
	protected TableView<SelectionProperty> attributeTableView;

	@FXML
	protected TableColumn<SelectionProperty, String> attributeNameColumn;

	@FXML
	protected TableColumn<SelectionProperty, String> attributeValueColumn;

	@FXML
	protected TableView<SelectionProperty> methodTableVIew;

	@FXML
	protected TableColumn<SelectionProperty, String> methodNameColumn;

	@FXML
	protected TableColumn<SelectionProperty, String> methodValueColumn;

	@FXML
	protected TreeTableView<SelectionProperty> typeTreeTableView;

	@FXML
	protected TreeTableColumn<SelectionProperty, String> typeNameColumn;

	@FXML
	protected TreeTableColumn<SelectionProperty, String> typeMethodColumn;

	@FXML
	protected TreeTableColumn<SelectionProperty, String> typeValueColumn;

	public SelectionViewer() {
		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/de/dc/javafx/xcore/workbench/event/ui/SelectionViewer.fxml"));
		fxmlLoader.setRoot(this);
		fxmlLoader.setController(this);

		try {
			fxmlLoader.load();
		} catch (IOException exception) {
			throw new RuntimeException(exception);
		}
	}

	@FXML
	protected void onAttributeValueAction(ActionEvent event) {

	}

	@FXML
	protected void onMethodValueAction(ActionEvent event) {

	}

	@FXML
	protected void onTypeValueClipboardAction(ActionEvent event) {

	}
}
