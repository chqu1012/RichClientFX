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
  }
  
  @Override
  public void onDeleteMenuItemClicked(final ActionEvent action) {
  }
  
  @Override
  public void onCopyMenuItemClicked(final ActionEvent action) {
  }
}
