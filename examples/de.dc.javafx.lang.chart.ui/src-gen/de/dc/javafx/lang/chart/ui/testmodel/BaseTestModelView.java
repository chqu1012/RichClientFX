package de.dc.javafx.lang.chart.ui.testmodel;

import de.dc.javafx.efxclipse.runtime.EMFModelView;
import de.dc.javafx.efxclipse.runtime.model.IEmfManager;
import de.dc.javafx.emfsupport.website.model.Author;
import de.dc.javafx.emfsupport.website.model.ModelFactory;
import de.dc.javafx.emfsupport.website.model.ModelPackage;
import de.dc.javafx.emfsupport.website.model.Page;
import de.dc.javafx.emfsupport.website.model.Website;
import javafx.event.ActionEvent;
import javafx.scene.control.TreeItem;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.CopyToClipboardCommand;
import org.eclipse.emf.edit.command.DeleteCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.fx.emf.edit.ui.EAttributeCellEditHandler;

@SuppressWarnings("all")
public class BaseTestModelView extends EMFModelView<Website> {
  public BaseTestModelView(final IEmfManager<Website> manager) {
    super(manager);
    
    EditingDomain editDomain = manager.getEditingDomain();
    
    // add edit support
    treeView.setEditable(true);
    treeCellFactory.addCellEditHandler(new EAttributeCellEditHandler(ModelPackage.eINSTANCE.getWebsite_Name(), editDomain));
    treeCellFactory.addCellEditHandler(new EAttributeCellEditHandler(ModelPackage.eINSTANCE.getPage_Name(), editDomain));
    treeCellFactory.addCellEditHandler(new EAttributeCellEditHandler(ModelPackage.eINSTANCE.getAuthor_Firstname(), editDomain));
  }
  
  public Integer getAddPageId() {
    return ModelPackage.PAGE;
  }
  
  public Page createAddPage() {
    return ModelFactory.eINSTANCE.createPage();
  }
  
  public Integer getAddAuthorId() {
    return ModelPackage.AUTHOR;
  }
  
  public Author createAddAuthor() {
    return ModelFactory.eINSTANCE.createAuthor();
  }
  
  @Override
  public void onNewMenuItemClicked(final ActionEvent action) {
    TreeItem<Object> selection = treeView.getSelectionModel().getSelectedItem();
    if (selection!=null) {
    	Object owner = selection.getValue();
    	Command command = null;
    	if (owner instanceof Website) {
    		command = AddCommand.create(editingDomain, owner, getAddPageId(), createAddPage());
    	}
    	if (owner instanceof Page) {
    		command = AddCommand.create(editingDomain, owner, getAddAuthorId(), createAddAuthor());
    	}
    	if(command.canExecute()){
    		manager.getCommandStack().execute(command);
    	}
    	selection.setExpanded(true);
    }
  }
  
  @Override
  public void onDeleteMenuItemClicked(final ActionEvent action) {
    TreeItem<Object> selection = treeView.getSelectionModel().getSelectedItem();
    if (selection!=null) {
    	Command command = DeleteCommand.create(editingDomain, selection.getValue());
    	if(command.canExecute()){
    		manager.getCommandStack().execute(command);
    	}
    }
  }
  
  @Override
  public void onCopyMenuItemClicked(final ActionEvent action) {
    TreeItem<Object> selection = treeView.getSelectionModel().getSelectedItem();
    if(selection!=null){
     	Command command = CopyToClipboardCommand.create(editingDomain, selection.getValue());
     	if(command.canExecute()){
     		manager.getCommandStack().execute(command);
     	}
    }
  }
}
