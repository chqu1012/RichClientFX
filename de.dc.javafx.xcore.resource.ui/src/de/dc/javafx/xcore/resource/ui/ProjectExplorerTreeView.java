package de.dc.javafx.xcore.resource.ui;

import de.dc.javafx.efxclipse.runtime.EmfTreeView;
import de.dc.javafx.efxclipse.runtime.model.IEmfManager;
import de.dc.javafx.xcore.resource.Workspace;
public class ProjectExplorerTreeView extends EmfTreeView<Workspace> {

	public ProjectExplorerTreeView(IEmfManager<Workspace> manager) {
		super(manager);
		
		// addEditableFor(ModelPackage.eINSTANCE.getPage_Name());
	}
}
