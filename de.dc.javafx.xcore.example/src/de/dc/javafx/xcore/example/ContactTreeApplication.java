package de.dc.javafx.xcore.example;

import de.dc.javafx.xcore.example.model.Contact;
import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ContactTreeApplication extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setScene(new Scene(getRoot(), 600, 400));
		primaryStage.show();
	}

	private Parent getRoot() {
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

	public static void main(String[] args) {
		launch(args);
	}
}
