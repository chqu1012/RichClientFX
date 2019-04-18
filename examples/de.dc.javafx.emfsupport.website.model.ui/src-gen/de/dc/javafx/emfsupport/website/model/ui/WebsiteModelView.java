package de.dc.javafx.emfsupport.website.model.ui;

import de.dc.javafx.efxclipse.runtime.EMFModelView;
import de.dc.javafx.efxclipse.runtime.model.IEmfManager;
import de.dc.javafx.emfsupport.website.model.Website;

@SuppressWarnings("all")
public class WebsiteModelView extends EMFModelView<Website> {
  public WebsiteModelView(final IEmfManager<Website> manager) {
    super(manager);
  }
}
