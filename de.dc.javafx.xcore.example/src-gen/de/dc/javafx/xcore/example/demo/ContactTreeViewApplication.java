package de.dc.javafx.xcore.example.demo;

import de.dc.javafx.xcore.example.BaseContactTreeView;
import de.dc.javafx.xcore.example.model.Contact;
import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

@SuppressWarnings("all")
public class ContactTreeViewApplication extends Application {
  @Override
  public void start(final Stage primaryStage) {
    primaryStage.setScene(new Scene(getRoot(), 600, 400));
    primaryStage.show();
  }
  
  public Parent getRoot() {
    BaseContactTreeView view = new BaseContactTreeView();
    for (int i = 0; i < 20; i++) {
    	String key = "Eins"+i;
    	view.addItemTo(BaseContactTreeView.ROOT_KEY, new Contact(key, 1, true));
    	for (int j = 0; j < 30; j++) {
    		view.addItemTo(key, new Contact("Zwei"+j, i+j, true));
    	}
    	
    }
    return view;
  }
  
  public static void main(final String[] args) {
    launch(args);
  }
}
