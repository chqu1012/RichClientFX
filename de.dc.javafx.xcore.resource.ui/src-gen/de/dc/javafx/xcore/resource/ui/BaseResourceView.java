package de.dc.javafx.xcore.resource.ui;

import de.dc.javafx.efxclipse.runtime.EMFModelView;
import de.dc.javafx.efxclipse.runtime.model.IEmfManager;
import de.dc.javafx.xcore.resource.Project;
import de.dc.javafx.xcore.resource.Resource;
import de.dc.javafx.xcore.resource.ResourceFactory;
import de.dc.javafx.xcore.resource.ResourcePackage;
import de.dc.javafx.xcore.resource.Workspace;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.scene.control.TreeItem;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.CopyToClipboardCommand;
import org.eclipse.emf.edit.command.DeleteCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.fx.emf.edit.ui.EAttributeCellEditHandler;

@SuppressWarnings("all")
public class BaseResourceView extends EMFModelView<Workspace> {
  public BaseResourceView(final IEmfManager<Workspace> manager) {
    super(manager);
    
    EditingDomain editDomain = manager.getEditingDomain();
    
    // add edit support
    treeView.setEditable(true);
    treeCellFactory.addCellEditHandler(new EAttributeCellEditHandler(ResourcePackage.eINSTANCE.getProject_Name(), editDomain));
    treeCellFactory.addCellEditHandler(new EAttributeCellEditHandler(ResourcePackage.eINSTANCE.getFolder_Name(), editDomain));
    treeCellFactory.addCellEditHandler(new EAttributeCellEditHandler(ResourcePackage.eINSTANCE.getFile_Name(), editDomain));
  }
  
  public Integer getAddProjectId() {
    return ResourcePackage.PROJECT;
  }
  
  public Project createAddProject() {
    return ResourceFactory.eINSTANCE.createProject();
  }
  
  public Integer getAddAuthorId() {
    return ResourcePackage.RESOURCE;
  }
  
  public Resource createAddAuthor() {
    return ResourceFactory.eINSTANCE.createFolder();
  }
  
  @Override
  public void onNewMenuItemClicked(final ActionEvent action) {
    TreeItem<Object> selection = treeView.getSelectionModel().getSelectedItem();
    if (selection!=null) {
    	Object owner = selection.getValue();
    	Command command = null;
    	if (owner instanceof Workspace) {
    		command = AddCommand.create(editingDomain, owner, getAddProjectId(), createAddProject());
    	}
    	if (owner instanceof Project) {
    		command = AddCommand.create(editingDomain, owner, getAddAuthorId(), createAddAuthor());
    	}
    	if(command.canExecute()){
    		manager.getCommandStack().execute(command);
    	}
    	selection.setExpanded(true);
    }
  }
  
  @Override
  public void changed(final ObservableValue arg0, final Object oldValue, final Object newValue) {
    super.changed(arg0, oldValue, newValue);
    if (newValue instanceof TreeItem<?>) {
    	Object value = ((TreeItem) newValue).getValue();
    	if(value instanceof Workspace){
    		newMenuItem.setDisable(false);
    		newMenuItem.setText("New Project");
    	}
    	else if(value instanceof Project){
    		newMenuItem.setDisable(false);
    		newMenuItem.setText("New Resource");
    	}
    	else{
    		newMenuItem.setDisable(true);
    		newMenuItem.setText("None");
    	}
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
