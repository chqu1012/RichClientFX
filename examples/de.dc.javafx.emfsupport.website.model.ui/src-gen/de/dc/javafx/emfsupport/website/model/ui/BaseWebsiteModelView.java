package de.dc.javafx.emfsupport.website.model.ui;

import de.dc.javafx.efxclipse.runtime.EMFModelView;
import de.dc.javafx.efxclipse.runtime.model.IEmfManager;
import de.dc.javafx.emfsupport.website.model.Author;
import de.dc.javafx.emfsupport.website.model.ModelFactory;
import de.dc.javafx.emfsupport.website.model.ModelPackage;
import de.dc.javafx.emfsupport.website.model.Page;
import de.dc.javafx.emfsupport.website.model.Website;
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
  
  public Integer getAddAuthorId() {
    return ModelPackage.AUTHOR;
  }
  
  public Author createAddAuthor() {
    return ModelFactory.eINSTANCE.createAuthor();
  }
}
