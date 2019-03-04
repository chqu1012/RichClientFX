package de.dc.emf.javafx.xtext.demo.contact.demo;

import java.util.*;

import de.dc.emf.javafx.xtext.demo.contact.controls.*;
import de.dc.emf.javafx.xtext.demo.contact.model.*;
import javafx.application.*;
import javafx.collections.*;
import javafx.scene.*;
import javafx.stage.*;

public class FilteredContactTableViewApplication extends Application{

	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		FilteredContactTableView filteredContactTableView = new FilteredContactTableView();
		List<Contact> masterData = new ArrayList<>();
		for (int i = 0; i < 20; i++) {
			masterData.add(new Contact());
		}
		filteredContactTableView.setItems(FXCollections.observableArrayList(masterData));
		Scene scene = new Scene(filteredContactTableView, 600, 600);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

}
