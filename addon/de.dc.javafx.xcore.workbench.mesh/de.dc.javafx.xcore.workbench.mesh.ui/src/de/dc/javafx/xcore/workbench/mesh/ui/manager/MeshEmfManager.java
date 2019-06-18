package de.dc.javafx.xcore.workbench.mesh.ui.manager;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EPackage;

import de.dc.javafx.xcore.workbench.emf.AbstractEmfManager;
import de.dc.javafx.xcore.workbench.emf.file.IEmfFile;
import de.dc.javafx.xcore.workbench.mesh.MeshContainer;
import de.dc.javafx.xcore.workbench.mesh.MeshFactory;
import de.dc.javafx.xcore.workbench.mesh.MeshPackage;
import de.dc.javafx.xcore.workbench.mesh.provider.MeshItemProviderAdapterFactory;
import de.dc.javafx.xcore.workbench.mesh.ui.file.MeshFile;

public class MeshEmfManager extends AbstractEmfManager<MeshContainer>{

	@Override
	protected AdapterFactory getModelItemProviderAdapterFactory() {
		return new MeshItemProviderAdapterFactory();
	}

	@Override
	protected MeshContainer initModel() {
		return MeshFactory.eINSTANCE.createMeshContainer();
	}

	@Override
	public EPackage getModelPackage() {
		return MeshPackage.eINSTANCE;
	}

	@Override
	public EFactory getExtendedModelFactory() {
		return MeshFactory.eINSTANCE;
	}

	@Override
	public IEmfFile<MeshContainer> initFile() {
		return new MeshFile();
	}
}
