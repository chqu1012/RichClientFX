package de.dc.javafx.xcore.lang.lib;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public abstract class AbstractApplication extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setScene(new Scene(getRoot(), width(), height()));
		primaryStage.setTitle(getTitle());
		primaryStage.show();
	}

	protected String getTitle() {
		return "JavaFX Application";
	}

	protected abstract Parent getRoot();
	
	protected double height() {
		return 700;
	}
	
	protected int width() {
		return 1200;
	}
}
