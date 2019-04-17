package de.dc.javafx.efxclipse.runtime;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class EMFModelViewApplication extends Application {
	
	@Override
	public void start(final Stage primaryStage) {
		primaryStage.setScene(new Scene(getRoot(), 1200, 700));
		primaryStage.show();
	}

	public Parent getRoot() {
		return new EMFModelView();
	}

	public static void main(final String[] args) {
		launch(args);
	}
}
