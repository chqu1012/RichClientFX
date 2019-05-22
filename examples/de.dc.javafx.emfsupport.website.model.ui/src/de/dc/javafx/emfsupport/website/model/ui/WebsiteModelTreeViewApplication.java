package de.dc.javafx.emfsupport.website.model.ui;

import java.io.File;

import javafx.scene.Parent;

public class WebsiteModelTreeViewApplication extends BaseWebsiteModelViewApplication {

	@Override
	public Parent getRoot() {
		return new WebsiteModelTreeView(getManager());
	}

	@Override
	protected String getTitle() {
		return "EmfSupport Model Editor with PropertySheet, Editing Support, Undo/Redo";
	}

	public static void main(String[] args) {
		new File("./workspace").mkdirs();
		launch(args);
	}
}
