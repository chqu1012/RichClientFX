package de.dc.javafx.emfsupport.website.model.ui;

import de.dc.javafx.efxclipse.runtime.model.IEmfManager;
import de.dc.javafx.emfsupport.website.model.Author;
import de.dc.javafx.emfsupport.website.model.ModelFactory;
import de.dc.javafx.emfsupport.website.model.Page;
import de.dc.javafx.emfsupport.website.model.Website;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Parent;

public class PageTreeViewApplication extends de.dc.javafx.xcore.lang.lib.AbstractApplication{

	@Override
	protected Parent getRoot() {
		IEmfManager<Website> manager = new WebsiteModelManager();
		ObservableList<Page> Pages = FXCollections.observableArrayList();
		for (int i = 0; i < 20; i++) {
			Page item = de.dc.javafx.emfsupport.website.model.ModelFactory.eINSTANCE.createPage();
			item.setName("Hello Page "+i);
			for (int j = 0; j < 10; j++) {
				Author author = ModelFactory.eINSTANCE.createAuthor();
				author.setFirstname("No Name "+i+j);
				item.getAuthor().add(author);
			}
			Pages.add(item);
		}
		manager.getRoot().getPages().addAll(Pages);
		return new PageTreeView(manager);
	}

	@Override
	protected String getTitle() {
		return "EMFSupport TreeView Example";
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
