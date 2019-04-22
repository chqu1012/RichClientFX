package de.dc.javafx.emfsupport.website.model.ui;

import de.dc.javafx.efxclipse.runtime.EMFModelView;
import de.dc.javafx.efxclipse.runtime.model.IEmfManager;
import de.dc.javafx.emfsupport.website.model.ModelFactory;
import de.dc.javafx.emfsupport.website.model.ModelPackage;
import de.dc.javafx.emfsupport.website.model.Page;
import de.dc.javafx.emfsupport.website.model.Website;
import javafx.scene.control.TreeItem;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.domain.EditingDomain;

@SuppressWarnings("all")
public class BaseWebsiteModelView extends EMFModelView<Website> {
  public BaseWebsiteModelView(final IEmfManager<Website> manager) {
    super(manager);
  }
  
  public Integer getAddPageId() {
    return ModelPackage.PAGE;
  }
  
  public Page createAddPage() {
    return ModelFactory.eINSTANCE.createPage();
  }
  
  public void execute() {
    TreeItem<Object> selection = treeView.getSelectionModel().getSelectedItem();
    EditingDomain editingDomain = manager.getEditingDomain();
    if (selection!=null) {
    	Object owner = selection.getValue();
    	Command command = null;
    	if (owner instanceof Website) {
    		command = AddCommand.create(editingDomain, owner, getAddPageId(), createAddPage());
    	}
    	manager.getCommandStack().execute(command);
    	selection.setExpanded(true);
    }
  }
}
