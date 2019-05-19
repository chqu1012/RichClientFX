package de.dc.javafx.lang.chart.ui.testmodel;

import de.dc.javafx.efxclipse.runtime.EMFModelView;
import de.dc.javafx.efxclipse.runtime.model.IEmfManager;
import de.dc.javafx.emfsupport.website.model.Website;
import de.dc.javafx.xcore.lang.lib.AbstractApplication;
import javafx.scene.Parent;

@SuppressWarnings("all")
public class BaseTestModelViewApplication extends AbstractApplication {
  @Override
  public Parent getRoot() {
    return getView(getManager());
  }
  
  public IEmfManager<Website> getManager() {
    return new BaseTestModelManager();
  }
  
  public EMFModelView<Website> getView(final IEmfManager<Website> manager) {
    return new BaseTestModelView(manager);
  }
  
  public static void main(final String[] args) {
    launch(args);
  }
}
