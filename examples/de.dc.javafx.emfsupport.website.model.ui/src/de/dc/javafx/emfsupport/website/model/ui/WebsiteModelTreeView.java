package de.dc.javafx.emfsupport.website.model.ui;

import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.fx.emf.edit.ui.EAttributeCellEditHandler;

import de.dc.javafx.efxclipse.runtime.EMFModelTreeView;
import de.dc.javafx.efxclipse.runtime.model.IEmfManager;
import de.dc.javafx.emfsupport.website.model.ModelPackage;
import de.dc.javafx.emfsupport.website.model.Website;

public class WebsiteModelTreeView extends EMFModelTreeView<Website> {

	public WebsiteModelTreeView(IEmfManager<Website> manager) {
		super(manager);
		
		EditingDomain editDomain = manager.getEditingDomain();
		
		 // add edit support
	    treeView.setEditable(true);
		treeCellFactory.addCellEditHandler(new EAttributeCellEditHandler(ModelPackage.eINSTANCE.getWebsite_Name(), editDomain));
	    treeCellFactory.addCellEditHandler(new EAttributeCellEditHandler(ModelPackage.eINSTANCE.getPage_Name(), editDomain));
	    treeCellFactory.addCellEditHandler(new EAttributeCellEditHandler(ModelPackage.eINSTANCE.getAuthor_Firstname(), editDomain));
	}

}
