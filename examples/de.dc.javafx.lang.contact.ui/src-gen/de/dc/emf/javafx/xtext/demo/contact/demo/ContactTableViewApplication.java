package de.dc.emf.javafx.xtext.demo.contact.demo;

import de.dc.emf.javafx.xtext.demo.contact.BaseContactTableView;
import de.dc.emf.javafx.xtext.demo.contact.model.Contact;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

@SuppressWarnings("all")
public class ContactTableViewApplication extends Application {
	@Override
	public void start(final Stage primaryStage) {
		primaryStage.setScene(new Scene(getRoot(), 600, 400));
		primaryStage.show();
	}

	public Parent getRoot() {
		BaseContactTableView view = new BaseContactTableView();
		ObservableList<Contact> items = FXCollections.observableArrayList();
		for (int i = 0; i < 30; i++) {
			Contact item = new Contact();
			items.add(item);
		}
		view.setInput(items);
		return view;
	}

	public static void main(final String[] args) {
		launch(args);
	}
}
