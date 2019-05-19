package de.dc.javafx.lang.chart.ui;

import de.dc.javafx.efxclipse.runtime.EMFModelView;
import de.dc.javafx.efxclipse.runtime.model.IEmfManager;
import de.dc.javafx.emfsupport.website.model.Website;
import de.dc.javafx.lang.chart.ui.website.BaseModelViewApplication;

public class ModelViewApplication extends BaseModelViewApplication{

	@Override
	public EMFModelView<Website> getView(IEmfManager<Website> manager) {
		return new WebsiteModelView(manager);
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
