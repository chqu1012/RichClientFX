package de.dc.javafx.xcore.resource.ui;

import de.dc.javafx.efxclipse.runtime.model.IEmfManager;
import de.dc.javafx.xcore.resource.Workspace;
import de.dc.javafx.xcore.resource.ui.view.ProjectExplorerTreeView;
import javafx.scene.control.Tab;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

public class ProjectExplorer extends Tab {

	public ProjectExplorer(IEmfManager<Workspace> manager) {
		setText("ProjectExplorer");
		setGraphic(new ImageView("images/jworkingSet_obj.png"));
		ProjectExplorerTreeView explorer = new ProjectExplorerTreeView(manager);
		AnchorPane.setBottomAnchor(explorer, 0d);
		AnchorPane.setTopAnchor(explorer, 0d);
		AnchorPane.setLeftAnchor(explorer, 0d);
		AnchorPane.setRightAnchor(explorer, 0d);
		setContent(new AnchorPane(explorer));
	}
}
