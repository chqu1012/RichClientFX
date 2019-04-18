package de.dc.javafx.emfsupport.website.model.ui;

import javafx.scene.Parent;

public class WebsiteViewApplication extends WebsiteModelViewApplication{

	@Override
	public Parent getRoot() {
		WebsiteModelManager manager = new WebsiteModelManager();
		return new WebsiteView(manager);
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
