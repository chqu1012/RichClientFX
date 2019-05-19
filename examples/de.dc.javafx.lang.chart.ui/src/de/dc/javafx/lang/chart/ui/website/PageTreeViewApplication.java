package de.dc.javafx.lang.chart.ui.website;

import de.dc.javafx.efxclipse.runtime.model.*;
import de.dc.javafx.efxclipse.runtime.*;
import javafx.collections.*;
import javafx.scene.Parent;
import de.dc.javafx.emfsupport.website.model.Page;
import de.dc.javafx.emfsupport.website.model.Website;
import de.dc.javafx.xcore.lang.lib.AbstractApplication;

public class PageTreeViewApplication extends AbstractApplication{

	@Override
	protected Parent getRoot() {
		IEmfManager<Website> manager = new WebsiteModelManager();
		ObservableList<Page> Pages = FXCollections.observableArrayList();
		for (int i = 0; i < 20; i++) {
			Page item = de.dc.javafx.emfsupport.website.model.ModelFactory.eINSTANCE.createPage();
			Pages.add(item);
		}
		manager.getRoot().getPages().addAll(Pages);
		return new PageTreeView(manager);
	}

	public static void main(String[] args) {
		launch(args);
	}
}
