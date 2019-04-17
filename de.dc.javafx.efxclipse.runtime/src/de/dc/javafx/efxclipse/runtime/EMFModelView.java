package de.dc.javafx.efxclipse.runtime;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.ListView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TreeView;
import javafx.scene.layout.BorderPane;

public class EMFModelView extends BorderPane{

	@FXML
	private TreeView<?> treeView;

	@FXML
	private ListView<?> historyList;

	@FXML
	private TableView<?> tableView;

	@FXML
	private TableColumn<?, ?> propertyColumn;

	@FXML
	private TableColumn<?, ?> valueColumn;

	public EMFModelView() {
		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/de/dc/javafx/efxclipse/runtime/EMFModelView.fxml"));
		fxmlLoader.setRoot(this);
		fxmlLoader.setController(this);

		try {
			fxmlLoader.load();
		} catch (IOException exception) {
			throw new RuntimeException(exception);
		}
	}
}
