package de.dc.javafx.xcore.resource.ui.view;

import de.dc.javafx.xcore.resource.ResourcePackage;
import de.dc.javafx.xcore.resource.Workspace;
import de.dc.javafx.xcore.resource.ui.manager.ResourceEmfManager;
import de.dc.javafx.xcore.workbench.emf.IEmfManager;
import de.dc.javafx.xcore.workbench.emf.ui.EmfTreeModelView;

public class JavaExplorerTreeView extends EmfTreeModelView<Workspace> {

	public JavaExplorerTreeView() {
		// add edit support
		addEditableFor(ResourcePackage.eINSTANCE.getProject_Name());
		addEditableFor(ResourcePackage.eINSTANCE.getFolder_Name());
		addEditableFor(ResourcePackage.eINSTANCE.getFile_Name());
		addEditableFor(ResourcePackage.eINSTANCE.getPackageFolder_Name());
	}

	@Override
	public IEmfManager<Workspace> initEmfManager() {
		return new ResourceEmfManager();
	}
}
