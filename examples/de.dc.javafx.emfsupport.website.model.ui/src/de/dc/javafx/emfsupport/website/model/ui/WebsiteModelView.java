package de.dc.javafx.emfsupport.website.model.ui;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.fx.emf.edit.ui.EAttributeCellEditHandler;

import de.dc.javafx.efxclipse.runtime.model.IEmfManager;
import de.dc.javafx.emfsupport.website.model.Author;
import de.dc.javafx.emfsupport.website.model.ModelFactory;
import de.dc.javafx.emfsupport.website.model.ModelPackage;
import de.dc.javafx.emfsupport.website.model.Page;
import de.dc.javafx.emfsupport.website.model.Website;
import de.dc.javafx.emfsupport.website.model.ui.provider.ContextMenuProvider;
import javafx.event.ActionEvent;
import javafx.scene.control.TreeItem;

public class WebsiteModelView extends BaseWebsiteModelView {

	public WebsiteModelView(IEmfManager<Website> manager) {
		super(manager);
		
		// add edit support
		treeView.setEditable(true);
		treeCellFactory.addCellEditHandler(new EAttributeCellEditHandler(ModelPackage.eINSTANCE.getWebsite_Name(), manager.getEditingDomain()));
		treeCellFactory.addCellEditHandler(new EAttributeCellEditHandler(ModelPackage.eINSTANCE.getPage_Name(), manager.getEditingDomain()));
		treeCellFactory.addCellEditHandler(new EAttributeCellEditHandler(ModelPackage.eINSTANCE.getAuthor_Firstname(), manager.getEditingDomain()));
		
		// add the context menu
		ContextMenuProvider contextMenuProvider = new ContextMenuProvider(manager);
		treeCellFactory.addCellUpdateListener(contextMenuProvider);
	}
	
	@Override
	protected void onNewMenuItemClicked(ActionEvent event) {
		super.onNewMenuItemClicked(event);
		TreeItem<Object> selection = treeView.getSelectionModel().getSelectedItem();
		if (selection!=null) {
			Object owner = selection.getValue();
			Command command = null;
			if (owner instanceof Website) {
				Page item = ModelFactory.eINSTANCE.createPage();
				item.setName("New Page*");
				command = AddCommand.create(manager.getEditingDomain(), owner, ModelPackage.PAGE, item);
			}else if (owner instanceof Page) {
				Author item = ModelFactory.eINSTANCE.createAuthor();
				command = AddCommand.create(manager.getEditingDomain(), owner, ModelPackage.AUTHOR, item);
			}
			manager.getCommandStack().execute(command);
			
			selection.setExpanded(true);
		}
	}
}
