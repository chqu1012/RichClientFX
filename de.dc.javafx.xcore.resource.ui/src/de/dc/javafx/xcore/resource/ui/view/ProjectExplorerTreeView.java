package de.dc.javafx.xcore.resource.ui.view;

import de.dc.javafx.xcore.resource.File;
import de.dc.javafx.xcore.resource.ResourcePackage;
import de.dc.javafx.xcore.resource.Workspace;
import de.dc.javafx.xcore.resource.ui.manager.ResourceEmfManager;
import de.dc.javafx.xcore.workbench.emf.IEmfManager;
import de.dc.javafx.xcore.workbench.emf.ui.EmfTreeModelView;
import de.dc.javafx.xcore.workbench.event.EventContext;
import de.dc.javafx.xcore.workbench.event.EventTopic;
import javafx.scene.control.TreeItem;
import javafx.scene.input.MouseEvent;

public class ProjectExplorerTreeView extends EmfTreeModelView<Workspace> {

	public ProjectExplorerTreeView() {
		addEditableFor(ResourcePackage.eINSTANCE.getProject_Name());
		addEditableFor(ResourcePackage.eINSTANCE.getFolder_Name());
		addEditableFor(ResourcePackage.eINSTANCE.getFile_Name());
		addEditableFor(ResourcePackage.eINSTANCE.getPackageFolder_Name());
	}

	@Override
	protected void onTreeViewMouseClicked(MouseEvent event) {
		if (treeView.isEditable()) {
			treeView.setEditable(false);
		}
		if (event.getClickCount() == 2) {
			TreeItem<Object> selection = treeView.getSelectionModel().getSelectedItem();
			if (selection.getValue() instanceof File) {
				File file = (File) selection.getValue();
				eventBroker.post(new EventContext<File>(EventTopic.OPEN_EDITOR, file));
			}
		}
	}

	@Override
	public IEmfManager<Workspace> getEmfManager() {
		return new ResourceEmfManager();
	}
}
