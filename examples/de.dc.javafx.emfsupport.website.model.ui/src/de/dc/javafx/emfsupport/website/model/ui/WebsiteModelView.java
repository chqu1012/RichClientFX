package de.dc.javafx.emfsupport.website.model.ui;

import de.dc.javafx.efxclipse.runtime.model.IEmfManager;
import de.dc.javafx.emfsupport.website.model.Website;

public class WebsiteModelView extends BaseWebsiteModelView {

	public WebsiteModelView(IEmfManager<Website> manager) {
		super(manager);
		// add the context menu
//		ContextMenuProvider contextMenuProvider = new ContextMenuProvider(manager);
//		treeCellFactory.addCellUpdateListener(contextMenuProvider);
	}

}
