package de.dc.javafx.emfsupport.website.model.ui;

import de.dc.javafx.efxclipse.runtime.model.IEmfManager;
import de.dc.javafx.emfsupport.website.model.ModelFactory;
import de.dc.javafx.emfsupport.website.model.Page;
import de.dc.javafx.emfsupport.website.model.Website;
import de.dc.javafx.xcore.lang.lib.AbstractApplication;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Parent;

public class WebsiteTableViewApplication extends AbstractApplication{

	@Override
	protected Parent getRoot() {
		IEmfManager<Website> manager = new WebsiteModelManager();
		WebsiteTableView tableView = new WebsiteTableView(manager );
		
		ObservableList<Page> pages = FXCollections.observableArrayList();
		for (int i = 0; i < 20; i++) {
			Page createPage = ModelFactory.eINSTANCE.createPage();
			createPage.setName("John Doe");
			createPage.setUrl("www.johndoe.com");
			createPage.setBody("No Content");
			pages.add(createPage);
		}
		manager.getRoot().getPages().addAll(pages);
		return tableView;
	}

	public static void main(String[] args) {
		launch(args);
	}
}
