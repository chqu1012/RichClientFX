package de.dc.javafx.xcore.workbench.ui.demo;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public abstract class AbstractDemoApplication extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setScene(new Scene(getRoot(), 800, 600));
		primaryStage.show();
	}

	protected abstract Parent getRoot();
}
