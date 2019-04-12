package de.dc.javafx.xcore.example.demo;

import de.dc.javafx.xcore.example.BaseContactTable;
import javafx.application.Application;
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
    return view;
  }
  
  public static void main(final String[] args) {
    launch(args);
  }
}
