package de.dc.javafx.emfsupport.website.model.ui;

import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.fx.emf.edit.ui.EAttributeCellEditHandler;

import de.dc.javafx.efxclipse.runtime.model.IEmfManager;
import de.dc.javafx.emfsupport.website.model.ModelPackage;
import de.dc.javafx.emfsupport.website.model.Website;
import javafx.event.ActionEvent;

public class WebsiteModelView extends BaseWebsiteModelView {

	public WebsiteModelView(IEmfManager<Website> manager) {
		super(manager);
		EditingDomain editDomain = manager.getEditingDomain();
		
		// add edit support
		treeView.setEditable(true);
		treeCellFactory.addCellEditHandler(new EAttributeCellEditHandler(ModelPackage.eINSTANCE.getWebsite_Name(), editDomain));
		treeCellFactory.addCellEditHandler(new EAttributeCellEditHandler(ModelPackage.eINSTANCE.getPage_Name(), editDomain));
		treeCellFactory.addCellEditHandler(new EAttributeCellEditHandler(ModelPackage.eINSTANCE.getAuthor_Firstname(), editDomain));
		
		// add the context menu
//		ContextMenuProvider contextMenuProvider = new ContextMenuProvider(manager);
//		treeCellFactory.addCellUpdateListener(contextMenuProvider);
	}
	
	@Override
	protected void onNewMenuItemClicked(ActionEvent event) {
		execute();
	}
}
