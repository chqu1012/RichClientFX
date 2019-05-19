package de.dc.javafx.lang.chart.ui.testmodel;

import de.dc.javafx.efxclipse.runtime.EMFModelView;
import de.dc.javafx.efxclipse.runtime.model.IEmfManager;
import de.dc.javafx.emfsupport.website.model.Website;

public class TestModelViewApplication extends BaseTestModelViewApplication{

	@Override
	public EMFModelView<Website> getView(IEmfManager<Website> manager) {
		return new TestModelView(manager);
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
