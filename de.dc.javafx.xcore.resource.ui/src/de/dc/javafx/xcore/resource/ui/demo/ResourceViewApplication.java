package de.dc.javafx.xcore.resource.ui.demo;

import java.io.File;

import de.dc.javafx.xcore.resource.ui.*;
import de.dc.javafx.xcore.resource.ui.view.*;
import de.dc.javafx.xcore.di.ApplicationContext;
import de.dc.javafx.xcore.lang.lib.AbstractApplication;
import javafx.scene.Parent;

public class ResourceViewApplication extends AbstractApplication{

	@Override
	public Parent getRoot() {
		BaseResourceManager manager = new BaseResourceManager();
		return new ResourceModelView(manager);
	}
	
	public static void main(String[] args) {
		ApplicationContext.init();
		// TODO: Should be implement dynamically!
		new File("./workspace").mkdirs();
		launch(args);
	}
}
