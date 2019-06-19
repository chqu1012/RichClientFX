package de.dc.javafx.xcore.resource.ui.demo;

import de.dc.javafx.xcore.lang.lib.AbstractApplication;
import de.dc.javafx.xcore.resource.ui.view.ProjectExplorerTreeView;
import javafx.scene.Parent;

public class ProjectExplorerTreeViewApplication extends AbstractApplication{

	@Override
	protected Parent getRoot() {
		return new ProjectExplorerTreeView();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
