package de.dc.javafx.emfsupport.website.model.ui;

import de.dc.javafx.efxclipse.runtime.EMFModelView;
import de.dc.javafx.efxclipse.runtime.model.IEmfManager;
import de.dc.javafx.emfsupport.website.model.Website;
import de.dc.javafx.xcore.lang.lib.AbstractApplication;
import javafx.scene.Parent;

@SuppressWarnings("all")
public class BaseWebsiteModelViewApplication extends AbstractApplication {
  @Override
  public Parent getRoot() {
    return getView(getManager());
  }
  
  public IEmfManager<Website> getManager() {
    BaseWebsiteModelManager manager = new BaseWebsiteModelManager();
	return manager;
  }
  
  public EMFModelView<Website> getView(final IEmfManager<Website> manager) {
    BaseWebsiteModelView view = new BaseWebsiteModelView(manager);
	return view;
  }
  
  public static void main(final String[] args) {
    launch(args);
  }
}
