package de.dc.javafx.xcore.lang.lib;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public abstract class AbstractApplication extends Application{

	public static final String DEFAULT_TITLE = "JavaFX Application";
	public static final int DEFAULT_HEIGHT = 700;
	public static final int DEFAULT_WIDTH = 1200;
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setScene(new Scene(getRoot(), width(), height()));
		primaryStage.setTitle(getTitle());
		primaryStage.show();
	}

	protected String getTitle() {
		return DEFAULT_TITLE;
	}

	protected abstract Parent getRoot();
	
	protected double height() {
		return DEFAULT_HEIGHT;
	}
	
	protected int width() {
		return DEFAULT_WIDTH;
	}
}
