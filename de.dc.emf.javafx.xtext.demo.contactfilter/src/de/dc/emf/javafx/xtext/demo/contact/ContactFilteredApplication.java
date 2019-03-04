package de.dc.emf.javafx.xtext.demo.contact;

import java.util.ArrayList;
import java.util.List;

import de.dc.emf.javafx.xtext.demo.contact.controls.ContactTableView;
import de.dc.emf.javafx.xtext.demo.contact.model.Contact;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ContactFilteredApplication extends Application{

	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		ContactTableView contactTableView = new ContactTableView();

		List<Contact> contacts = new ArrayList<>();
		for (int i = 0; i < 20; i++) {
			contacts.add(new Contact("Peter", "Jackson", 11, true, ""));
		}
		for (int i = 0; i < 20; i++) {
			contacts.add(new Contact("Ralf", "Monkey", 22, true, ""));
		}
		
		contactTableView.setItems(FXCollections.observableArrayList(contacts));
		Scene scene = new Scene(contactTableView, 600, 600);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

}
