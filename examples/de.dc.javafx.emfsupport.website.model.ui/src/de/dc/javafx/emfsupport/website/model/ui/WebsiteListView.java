package de.dc.javafx.emfsupport.website.model.ui;

import de.dc.javafx.efxclipse.runtime.EmfListView;
import de.dc.javafx.efxclipse.runtime.model.IEmfManager;
import de.dc.javafx.emfsupport.website.model.ModelPackage;
import de.dc.javafx.emfsupport.website.model.Website;

public class WebsiteListView extends EmfListView<Website> {

	public WebsiteListView(IEmfManager<Website> manager) {
		super(manager);
		
		addEditableFor(ModelPackage.eINSTANCE.getPage_Name());
	}

}
