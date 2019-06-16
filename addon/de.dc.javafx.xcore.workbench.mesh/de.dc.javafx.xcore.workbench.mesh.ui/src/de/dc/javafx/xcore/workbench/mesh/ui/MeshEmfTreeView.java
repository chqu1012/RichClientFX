package de.dc.javafx.xcore.workbench.mesh.ui;

import de.dc.javafx.xcore.workbench.emf.IEmfManager;
import de.dc.javafx.xcore.workbench.mesh.MeshContainer;
import de.dc.javafx.xcore.workbench.mesh.ui.manager.MeshEmfManager;
import de.dc.javafx.xcore.workbench.ui.control.EmfTreeModelView;

public class MeshEmfTreeView  extends EmfTreeModelView<MeshContainer> {

	@Override
	protected IEmfManager<MeshContainer> getEmfManager() {
		if (manager==null) {
			manager = new MeshEmfManager();
		}
		return manager;
	}

}
