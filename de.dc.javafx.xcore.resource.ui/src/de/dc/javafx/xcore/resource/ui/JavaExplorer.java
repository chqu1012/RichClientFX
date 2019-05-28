package de.dc.javafx.xcore.resource.ui;

import de.dc.javafx.efxclipse.runtime.model.IEmfManager;
import de.dc.javafx.xcore.resource.Workspace;
import de.dc.javafx.xcore.resource.ui.view.JavaExplorerTreeView;
import javafx.scene.control.Tab;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

public class JavaExplorer extends Tab {

	public JavaExplorer(IEmfManager<Workspace> manager) {
		setText("JavaExplorer");
		setGraphic(new ImageView("images/jworkingSet_obj.png"));
		JavaExplorerTreeView explorer = new JavaExplorerTreeView(manager);
		AnchorPane.setBottomAnchor(explorer, 0d);
		AnchorPane.setTopAnchor(explorer, 0d);
		AnchorPane.setLeftAnchor(explorer, 0d);
		AnchorPane.setRightAnchor(explorer, 0d);
		setContent(new AnchorPane(explorer));
	}
}
