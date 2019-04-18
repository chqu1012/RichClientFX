package de.dc.javafx.emfsupport.website.model.ui;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.edit.command.AddCommand;

import de.dc.javafx.efxclipse.runtime.model.IEmfManager;
import de.dc.javafx.emfsupport.website.model.Author;
import de.dc.javafx.emfsupport.website.model.ModelFactory;
import de.dc.javafx.emfsupport.website.model.ModelPackage;
import de.dc.javafx.emfsupport.website.model.Page;
import de.dc.javafx.emfsupport.website.model.Website;
import javafx.event.ActionEvent;
import javafx.scene.control.TreeItem;

public class WebsiteView extends WebsiteModelView{

	public WebsiteView(IEmfManager<Website> manager) {
		super(manager);
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
		}
	}
}
