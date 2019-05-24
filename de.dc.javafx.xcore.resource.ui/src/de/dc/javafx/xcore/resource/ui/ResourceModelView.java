package de.dc.javafx.xcore.resource.ui;

import de.dc.javafx.efxclipse.runtime.model.IEmfManager;
import de.dc.javafx.xcore.resource.Workspace;

public class ResourceModelView extends BaseResourceView {

	public ResourceModelView(IEmfManager<Workspace> manager) {
		super(manager);
		
		leftTabPane.getTabs().add(new ProjectExplorer(manager));
		bottomTabPane.getTabs().add(new PropertyView(manager));
	}
}
