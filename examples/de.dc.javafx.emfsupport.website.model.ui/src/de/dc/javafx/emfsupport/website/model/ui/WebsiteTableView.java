package de.dc.javafx.emfsupport.website.model.ui;

import de.dc.javafx.efxclipse.runtime.EmfTableView;
import de.dc.javafx.efxclipse.runtime.model.IEmfManager;
import de.dc.javafx.emfsupport.website.model.Website;
import de.dc.javafx.emfsupport.website.model.ui.feature.NameTableCellFactory;

public class WebsiteTableView extends EmfTableView<Website>{

	public WebsiteTableView(IEmfManager<Website> manager) {
		super(manager);
		
		createColumn("LastName", 1).setCellValueFactory(new NameTableCellFactory());
		createColumn("Address", 2);
		createColumn("Email", 3);
	}

}
