package de.dc.javafx.xcore.resource.ui.demo;

import java.io.File;

import de.dc.javafx.xcore.di.ApplicationContext;
import de.dc.javafx.xcore.lang.lib.AbstractApplication;
import de.dc.javafx.xcore.resource.ui.BaseResourceManager;
import de.dc.javafx.xcore.resource.ui.view.ProjectExplorerTreeView;
import javafx.scene.Parent;

public class ProjectExplorerApplication extends AbstractApplication{

	@Override
	public Parent getRoot() {
		BaseResourceManager manager = new BaseResourceManager();
		return new ProjectExplorerTreeView(manager);
	}
	
	public static void main(String[] args) {
		ApplicationContext.init();
		// TODO: Should be implement dynamically!
		new File("./workspace").mkdirs();
		launch(args);
	}
}
