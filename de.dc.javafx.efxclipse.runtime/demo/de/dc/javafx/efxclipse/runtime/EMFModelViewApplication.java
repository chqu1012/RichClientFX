package de.dc.javafx.efxclipse.runtime;

import de.dc.javafx.efxclipse.runtime.model.IEmfManager;
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
		IEmfManager<Object> manager = null;
		return new EMFModelView<>(manager);
	}

	public static void main(final String[] args) {
		launch(args);
	}
}
