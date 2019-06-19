package de.dc.javafx.xcore.resource.ui.demo;

import de.dc.javafx.xcore.lang.lib.AbstractApplication;
import de.dc.javafx.xcore.resource.ui.view.JavaExplorerTreeView;
import de.dc.javafx.xcore.workbench.di.DIPlatform;
import javafx.scene.Parent;

public class JavaExplorerTreeViewApplication extends AbstractApplication{

	@Override
	protected Parent getRoot() {
		return new JavaExplorerTreeView();
	}

	public static void main(String[] args) {
		DIPlatform.init();
		launch(args);
	}
}
