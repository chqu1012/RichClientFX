package de.dc.javafx.xcore.example;

import de.dc.javafx.xcore.example.model.Contact;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ContactApplication extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setScene(new Scene(getRoot(), 600, 400));
		primaryStage.show();
	}

	private Parent getRoot() {
		BaseContactTable table = new BaseContactTable();
		ObservableList<Contact> items = FXCollections.observableArrayList();
		for (int i = 0; i < 50; i++) {
			items.add(new Contact("Peter"+i, i, true));
		}
		table.setInput(items);
		return table;
	}

	public static void main(String[] args) {
		launch(args);
	}
}
