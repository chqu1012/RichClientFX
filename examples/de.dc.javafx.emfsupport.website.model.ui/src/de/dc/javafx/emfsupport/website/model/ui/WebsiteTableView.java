package de.dc.javafx.emfsupport.website.model.ui;

import de.dc.javafx.efxclipse.runtime.EmfTableView;
import de.dc.javafx.efxclipse.runtime.model.IEmfManager;
import de.dc.javafx.emfsupport.website.model.Website;
import de.dc.javafx.emfsupport.website.model.ui.feature.NameTableCellFactory;

public class WebsiteTableView extends EmfTableView<Website>{

	public WebsiteTableView(IEmfManager<Website> manager) {
		super(manager);
		
		createColumn("LastName").setCellValueFactory(new NameTableCellFactory());
		createColumn("Address");
		createColumn("Email");
	}

}
