package de.dc.javafx.xcore.workbench.mesh.ui.file;

import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EPackage;

import de.dc.javafx.xcore.workbench.emf.file.EmfFile;
import de.dc.javafx.xcore.workbench.mesh.MeshContainer;
import de.dc.javafx.xcore.workbench.mesh.MeshFactory;
import de.dc.javafx.xcore.workbench.mesh.MeshPackage;

public class MeshFile extends EmfFile<MeshContainer>{

	@Override
	public EPackage getEPackageEInstance() {
		return MeshPackage.eINSTANCE;
	}

	@Override
	public EFactory getEFactoryEInstance() {
		return MeshFactory.eINSTANCE;
	}

	@Override
	public String getExtension() {
		return "mesh";
	}

}
