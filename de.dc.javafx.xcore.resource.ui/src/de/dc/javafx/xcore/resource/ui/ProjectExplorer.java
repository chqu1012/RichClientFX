package de.dc.javafx.xcore.resource.ui;

import de.dc.javafx.efxclipse.runtime.model.IEmfManager;
import de.dc.javafx.xcore.resource.Workspace;
import de.dc.javafx.xcore.resource.ui.view.ProjectExplorerTreeView;
import javafx.scene.control.Tab;
import javafx.scene.image.ImageView;

public class ProjectExplorer extends Tab {

	public ProjectExplorer(IEmfManager<Workspace> manager) {
		setText("ProjectExplorer");
		setGraphic(new ImageView("images/jworkingSet_obj.png"));
		setContent(new ProjectExplorerTreeView(manager));
	}
}
