package de.dc.javafx.xcore.workbench.ui.demo.ui;

import de.dc.javafx.xcore.resource.File;
import de.dc.javafx.xcore.resource.ui.view.JavaExplorerTreeView;
import de.dc.javafx.xcore.workbench.di.DIPlatform;
import de.dc.javafx.xcore.workbench.event.EventContext;
import de.dc.javafx.xcore.workbench.event.EventTopic;
import de.dc.javafx.xcore.workbench.event.IEventBroker;
import javafx.scene.control.TreeItem;
import javafx.scene.input.MouseEvent;

public class ExtendedJavaExplorer extends JavaExplorerTreeView {

	@Override
	protected void onTreeViewMouseClicked(MouseEvent event) {
		if (event.getClickCount() == 2) {
			TreeItem newValue = treeView.getSelectionModel().getSelectedItem();
			if (newValue.getValue() instanceof File) {
				File file = (File) newValue.getValue();
				DIPlatform.getInstance(IEventBroker.class).post(new EventContext<>(EventTopic.OPEN_EDITOR, file));
			}
		}

	}
}
