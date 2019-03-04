package de.dc.emf.javafx.xtext.demo;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public abstract class BaseChartApplication extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		Parent root = getRoot();
		primaryStage.setScene(new Scene(root , 1000, 800));
		primaryStage.show();
	}

	protected abstract Parent getRoot();

}
