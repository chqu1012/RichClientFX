package de.dc.javafx.xcore.resource.ui.view;

import de.dc.javafx.efxclipse.runtime.EMFModelView;
import de.dc.javafx.efxclipse.runtime.model.IEmfManager;
import de.dc.javafx.xcore.resource.Workspace;
import de.dc.javafx.xcore.resource.ui.ProjectExplorer;
import de.dc.javafx.xcore.resource.ui.PropertyView;

public class ResourceModelView extends EMFModelView<Workspace> {

	public ResourceModelView(IEmfManager<Workspace> manager) {
		super(manager);
		
		leftTabPane.getTabs().add(new ProjectExplorer(manager));
		bottomTabPane.getTabs().add(new PropertyView(manager));
	}
}
