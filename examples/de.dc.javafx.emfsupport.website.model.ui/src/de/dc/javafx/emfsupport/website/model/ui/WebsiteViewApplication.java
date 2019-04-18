package de.dc.javafx.emfsupport.website.model.ui;

import de.dc.javafx.efxclipse.runtime.EMFModelView;
import de.dc.javafx.efxclipse.runtime.model.IEmfManager;
import de.dc.javafx.emfsupport.website.model.Website;

public class WebsiteViewApplication extends BaseWebsiteModelViewApplication{

	@Override
	public EMFModelView<Website> getView(IEmfManager<Website> manager) {
		return new WebsiteView(manager);
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
