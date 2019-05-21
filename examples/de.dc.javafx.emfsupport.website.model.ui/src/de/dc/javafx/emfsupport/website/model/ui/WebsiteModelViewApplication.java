package de.dc.javafx.emfsupport.website.model.ui;

import java.io.File;

import de.dc.javafx.efxclipse.runtime.EMFModelView;
import de.dc.javafx.efxclipse.runtime.model.IEmfManager;
import de.dc.javafx.emfsupport.website.model.Website;

public class WebsiteModelViewApplication extends BaseWebsiteModelViewApplication{

	@Override
	public EMFModelView<Website> getView(IEmfManager<Website> manager) {
		return new WebsiteModelView(manager);
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
