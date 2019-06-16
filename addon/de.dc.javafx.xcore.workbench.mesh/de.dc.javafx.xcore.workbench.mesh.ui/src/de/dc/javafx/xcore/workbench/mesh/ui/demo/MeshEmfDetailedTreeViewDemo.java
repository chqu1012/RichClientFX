package de.dc.javafx.xcore.workbench.mesh.ui.demo;

import de.dc.javafx.xcore.workbench.di.DIPlatform;
import de.dc.javafx.xcore.workbench.mesh.ui.MeshEmfDetailedTreeView;
import de.dc.javafx.xcore.workbench.ui.WorkbenchModule;
import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MeshEmfDetailedTreeViewDemo extends Application{

	@Override
	public void start(Stage stage) throws Exception {
		Parent root = new MeshEmfDetailedTreeView();
		stage.setScene(new Scene(root , 1200, 800));
		stage.show();
	}

	public static void main(String[] args) {
		DIPlatform.add(new WorkbenchModule());
		DIPlatform.init();
		
		launch(args);
	}
}
