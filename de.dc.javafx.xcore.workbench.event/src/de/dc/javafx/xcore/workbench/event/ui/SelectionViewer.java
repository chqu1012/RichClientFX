package de.dc.javafx.xcore.workbench.event.ui;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
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
	protected TextField searchText;

	@FXML
	protected Label selectedTypeLabel;

	@FXML
	protected TableView<?> attributeTableView;

	@FXML
	protected TableColumn<?, ?> attributeNameColumn;

	@FXML
	protected TableColumn<?, ?> attributeValueColumn;

	@FXML
	protected TableView<?> methodTableVIew;

	@FXML
	protected TableColumn<?, ?> methodNameColumn;

	@FXML
	protected TableColumn<?, ?> methodValueColumn;

	@FXML
	protected TreeTableView<?> typeTreeTableView;

	@FXML
	protected TreeTableColumn<?, ?> typeNameColumn;

	@FXML
	protected TreeTableColumn<?, ?> typeMethodColumn;

	@FXML
	protected TreeTableColumn<?, ?> typeValueColumn;

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
