package de.dc.javafx.xcore.example.demo;

import de.dc.javafx.xcore.example.BaseContactListView;
import de.dc.javafx.xcore.example.model.Contact;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

@SuppressWarnings("all")
public class ContactListViewApplication extends Application {
  @Override
  public void start(final Stage primaryStage) {
    primaryStage.setScene(new Scene(getRoot(), 600, 400));
    primaryStage.show();
  }
  
  public Parent getRoot() {
    BaseContactListView view = new BaseContactListView();
    ObservableList<Contact> items = FXCollections.observableArrayList();
    for (int i = 0; i < 50; i++) {
    	items.add(new Contact());
    }
    view.setInput(items);
    return view;
  }
  
  public static void main(final String[] args) {
    launch(args);
  }
}
