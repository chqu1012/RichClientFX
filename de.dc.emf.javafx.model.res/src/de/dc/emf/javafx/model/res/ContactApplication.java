package de.dc.emf.javafx.model.res;

import de.dc.emf.javafx.model.res.controls.ContactTableView;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ContactApplication extends Application{

	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		Scene scene = new Scene(new ContactTableView(), 600, 600);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

}
