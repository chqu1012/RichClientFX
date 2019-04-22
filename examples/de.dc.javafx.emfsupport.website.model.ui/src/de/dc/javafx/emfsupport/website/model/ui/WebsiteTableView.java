package de.dc.javafx.emfsupport.website.model.ui;

import de.dc.javafx.efxclipse.runtime.EmfTableView;
import de.dc.javafx.efxclipse.runtime.model.IEmfManager;
import de.dc.javafx.emfsupport.website.model.ModelPackage;
import de.dc.javafx.emfsupport.website.model.Website;
import javafx.scene.control.TableColumn;

public class WebsiteTableView extends EmfTableView<Website>{

	protected TableColumn<Object, Object> pageNameColumn = new TableColumn<>("Name");
	
	public WebsiteTableView(IEmfManager<Website> manager) {
		super(manager);
		
		createColumn("LastName", 1 , ModelPackage.eINSTANCE.getPage_Name());
		createColumn("Address", 2);
		createColumn("Email", 3);
	}

}
