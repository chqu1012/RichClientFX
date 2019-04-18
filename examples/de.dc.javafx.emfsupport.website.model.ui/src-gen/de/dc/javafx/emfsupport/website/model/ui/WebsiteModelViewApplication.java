package de.dc.javafx.emfsupport.website.model.ui;

import de.dc.javafx.efxclipse.runtime.model.IEmfManager;
import de.dc.javafx.emfsupport.website.model.Website;
import de.dc.javafx.xcore.lang.lib.AbstractApplication;
import javafx.scene.Parent;

@SuppressWarnings("all")
public class WebsiteModelViewApplication extends AbstractApplication {
  @Override
  public Parent getRoot() {
    IEmfManager<Website> manager = new WebsiteModelManager();
    return new WebsiteModelView(manager );
  }
  
  public static void main(final String[] args) {
    launch(args);
  }
}
