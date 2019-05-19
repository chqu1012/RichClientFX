package de.dc.javafx.lang.chart.ui.testmodel;

import de.dc.javafx.efxclipse.runtime.EmfTreeView;
import de.dc.javafx.efxclipse.runtime.model.IEmfManager;
import de.dc.javafx.emfsupport.website.model.ModelPackage;
import de.dc.javafx.emfsupport.website.model.Website;
public class PageTreeView extends EmfTreeView<Website> {

	public PageTreeView(IEmfManager<Website> manager) {
		super(manager);
		
		// addEditableFor(ModelPackage.eINSTANCE.getPage_Name());
	}
}
