package de.dc.emf.javafx.xtext.demo.contact.demo;

import java.util.*;

import de.dc.emf.javafx.xtext.demo.contact.controls.*;
import de.dc.emf.javafx.xtext.demo.contact.model.*;
import javafx.application.*;
import javafx.collections.*;
import javafx.scene.*;
import javafx.stage.*;

public class ContactTableViewApplication extends Application{

	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		ContactTableView contactTableView = new ContactTableView();
		List<Contact> masterData = new ArrayList<>();
		for (int i = 0; i < 20; i++) {
			masterData.add(new Contact());
		}
		contactTableView.setItems(FXCollections.observableArrayList(masterData));
		Scene scene = new Scene(contactTableView, 600, 600);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

}
