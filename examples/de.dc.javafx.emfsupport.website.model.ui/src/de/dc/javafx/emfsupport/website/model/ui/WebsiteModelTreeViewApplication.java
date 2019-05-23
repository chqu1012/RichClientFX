package de.dc.javafx.emfsupport.website.model.ui;

import java.io.File;

import de.dc.javafx.efxclipse.runtime.model.IEmfManager;
import de.dc.javafx.emfsupport.website.model.Author;
import de.dc.javafx.emfsupport.website.model.ModelFactory;
import de.dc.javafx.emfsupport.website.model.Page;
import de.dc.javafx.emfsupport.website.model.Website;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Parent;

public class WebsiteModelTreeViewApplication extends BaseWebsiteModelViewApplication {

	@Override
	public Parent getRoot() {
		IEmfManager<Website> manager = new WebsiteModelManager();
		ObservableList<Page> pages = FXCollections.observableArrayList();
		for (int i = 0; i < 20; i++) {
			Page createPage = ModelFactory.eINSTANCE.createPage();
			createPage.setName("John Doe");
			createPage.setUrl("www.johndoe.com");
			createPage.setBody("No Content");
			for (int j = 0; j < 10; j++) {
				Author author = ModelFactory.eINSTANCE.createAuthor();
				author.setFirstname("No");
				author.setLastname("Name");
				author.setEmail("no.name@gmail.com");
				createPage.getAuthor().add(author);
			}
			pages.add(createPage);
		}
		manager.getRoot().getPages().addAll(pages);
		return new WebsiteModelTreeView(manager);
	}

	@Override
	protected String getTitle() {
		return "EmfSupport Model Editor with PropertySheet, Editing Support, Undo/Redo";
	}

	public static void main(String[] args) {
		new File("./workspace").mkdirs();
		launch(args);
	}
}
