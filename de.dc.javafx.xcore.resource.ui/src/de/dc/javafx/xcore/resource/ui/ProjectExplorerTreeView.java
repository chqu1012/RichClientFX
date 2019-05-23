package de.dc.javafx.xcore.resource.ui;

import de.dc.javafx.efxclipse.runtime.EMFModelTreeView;
import de.dc.javafx.efxclipse.runtime.EmfTreeView;
import de.dc.javafx.efxclipse.runtime.model.IEmfManager;
import de.dc.javafx.xcore.resource.ResourcePackage;
import de.dc.javafx.xcore.resource.Workspace;

public class ProjectExplorerTreeView extends EMFModelTreeView<Workspace> {

	public ProjectExplorerTreeView(IEmfManager<Workspace> manager) {
		super(manager);

//		addEditableFor(ResourcePackage.eINSTANCE.getProject_Name());
	}
}
