package de.dc.javafx.xcore.workbench.mesh.ui;

import de.dc.javafx.xcore.workbench.emf.IEmfManager;
import de.dc.javafx.xcore.workbench.emf.ui.EmfTreeModelView;
import de.dc.javafx.xcore.workbench.mesh.MeshContainer;
import de.dc.javafx.xcore.workbench.mesh.ui.manager.MeshEmfManager;

public class MeshEmfTreeView extends EmfTreeModelView<MeshContainer> {

	@Override
	public IEmfManager<MeshContainer> initEmfManager() {
		return new MeshEmfManager();
	}

}
