package de.dc.javafx.xcore.resource.ui;

import de.dc.javafx.efxclipse.runtime.EMFModelView;
import de.dc.javafx.efxclipse.runtime.model.IEmfManager;
import de.dc.javafx.xcore.lang.lib.AbstractApplication;
import de.dc.javafx.xcore.resource.ResourcePackage;
import de.dc.javafx.xcore.resource.Workspace;
import javafx.scene.Parent;

@SuppressWarnings("all")
public class BaseResourceViewApplication extends AbstractApplication {
  @Override
  public Parent getRoot() {
    return getView(getManager());
  }
  
  public IEmfManager<Workspace> getManager() {
    return new BaseResourceManager();
  }
  
  public EMFModelView<Workspace> getView(final IEmfManager<Workspace> manager) {
    return new BaseResourceView(manager);
  }
  
  public static void main(final String[] args) {
    launch(args);
  }
}
