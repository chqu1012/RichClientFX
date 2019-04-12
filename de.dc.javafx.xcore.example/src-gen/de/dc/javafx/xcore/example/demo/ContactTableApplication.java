package de.dc.javafx.xcore.example.demo;

import de.dc.javafx.xcore.example.BaseContactTable;
import de.dc.javafx.xcore.example.model.Contact;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

@SuppressWarnings("all")
public class ContactTableApplication extends Application {
  @Override
  public void start(final Stage primaryStage) {
    primaryStage.setScene(new Scene(getRoot(), 600, 400));
    primaryStage.show();
  }
  
  public Parent getRoot() {
    BaseContactTable view = new BaseContactTable();
    ObservableList<Contact> items = FXCollections.observableArrayList();
    for (int i = 0; i < 50; i++) {
    	items.add(new Contact("Peter"+i, i, true));
    }
    view.setInput(items);
    return view;
  }
  
  public static void main(final String[] args) {
    launch(args);
  }
}
