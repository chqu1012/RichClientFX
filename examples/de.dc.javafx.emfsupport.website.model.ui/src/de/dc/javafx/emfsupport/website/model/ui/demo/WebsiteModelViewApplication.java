package de.dc.javafx.emfsupport.website.model.ui.demo;

iimport java.io.File;

import de.dc.javafx.xcore.di.ApplicationContext;
import de.dc.javafx.xcore.lang.lib.AbstractApplication;
import javafx.scene.Parent;

public class WebsiteModelViewApplication extends AbstractApplication{

	@Override
	public Parent getRoot() {
		BaseWebsiteModelManager manager = new BaseWebsiteModelManager();
		return new WebsiteModelModelView(manager);
	}
	
	public static void main(String[] args) {
		ApplicationContext.init();
		// TODO: Should be implement dynamically!
		new File("./workspace").mkdirs();
		launch(args);
	}
}
