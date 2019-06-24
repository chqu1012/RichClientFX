package de.dc.javafx.xcore.resource.ui.demo;

import java.io.File;

import de.dc.javafx.xcore.lang.lib.AbstractApplication;
import de.dc.javafx.xcore.resource.OpenedFile;
import de.dc.javafx.xcore.resource.RecentlyOpenFileHistory;
import de.dc.javafx.xcore.resource.ResourceFactory;
import de.dc.javafx.xcore.resource.ui.view.RecentlyOpenFileHistoryView;
import de.dc.javafx.xcore.workbench.di.DIPlatform;
import javafx.scene.Parent;

public class RecentlyOpenedFilesApplication extends AbstractApplication{

	@Override
	public Parent getRoot() {
		RecentlyOpenFileHistoryView view = new RecentlyOpenFileHistoryView();
		RecentlyOpenFileHistory root = ResourceFactory.eINSTANCE.createRecentlyOpenFileHistory();
		for (int i = 0; i < 20; i++) {
			OpenedFile e = ResourceFactory.eINSTANCE.createOpenedFile();
			e.setName("Hello World Opened File "+i);
			root.getFiles().add(e);
		}
		view.setInput(root);
		return view;
	}

	public static void main(String[] args) {
		DIPlatform.init();
		// TODO: Should be implement dynamically!
		new File("./workspace").mkdirs();
		launch(args);
	}
}
