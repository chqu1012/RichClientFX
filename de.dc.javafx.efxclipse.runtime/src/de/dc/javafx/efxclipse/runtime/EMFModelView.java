package de.dc.javafx.efxclipse.runtime;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.ListView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TreeView;

public class EMFModelView {

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
		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("EMFModelView.fxml"));
		fxmlLoader.setRoot(this);
		fxmlLoader.setController(this);

		try {
			fxmlLoader.load();
		} catch (IOException exception) {
			throw new RuntimeException(exception);
		}
	}
}
