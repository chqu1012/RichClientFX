package de.dc.javafx.emfsupport.website.model.ui;

import de.dc.javafx.efxclipse.runtime.EmfTreeView;
import de.dc.javafx.efxclipse.runtime.model.IEmfManager;
import de.dc.javafx.emfsupport.website.model.ModelPackage;
import de.dc.javafx.emfsupport.website.model.Website;

public class WebsiteTreeView extends EmfTreeView<Website> {

	public WebsiteTreeView(IEmfManager<Website> manager) {
		super(manager);
		
		addEditableFor(ModelPackage.eINSTANCE.getPage_Name());
		addEditableFor(ModelPackage.eINSTANCE.getAuthor_Firstname());
	}
}
