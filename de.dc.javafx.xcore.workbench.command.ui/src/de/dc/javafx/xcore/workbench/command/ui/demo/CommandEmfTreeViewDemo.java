package de.dc.javafx.xcore.workbench.command.ui.demo;

import de.dc.javafx.xcore.workbench.command.ui.CommandEmfTreeView;
import de.dc.javafx.xcore.workbench.di.DIPlatform;
import de.dc.javafx.xcore.workbench.ui.WorkbenchModule;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class CommandEmfTreeViewDemo extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// Dependency Injection initialization, is required for the workbench ui, here
		// for handle selection service and events
		DIPlatform.add(new WorkbenchModule());
		DIPlatform.init();
		
		CommandEmfTreeView treeView = new CommandEmfTreeView();
		
		primaryStage.setScene(new Scene(treeView, 1200, 800));
		primaryStage.show();
	}

}