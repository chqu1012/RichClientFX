package de.dc.spring.bootstrap.blog.model.ui.demo;

import de.dc.javafx.xcore.workbench.di.DIPlatform;
import de.dc.javafx.xcore.workbench.ui.WorkbenchModule;
import de.dc.spring.bootstrap.blog.model.ui.BlogEmfTreeView;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class BlogEmfTreeViewDemo extends Application{

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		DIPlatform.add(new WorkbenchModule());
		DIPlatform.init();
		
		primaryStage.setScene(new Scene(new BlogEmfTreeView(), 1200, 800));
		primaryStage.show();
	}

}
