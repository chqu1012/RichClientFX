package de.dc.javafx.xcore.workbench.mesh.ui.factory;
import de.dc.javafx.xcore.workbench.emf.factory.ExtendedFactory;
import de.dc.javafx.xcore.workbench.mesh.MeshFactory;

public interface ExtendedMeshFactory extends MeshFactory, ExtendedFactory {

	ExtendedMeshFactory eINSTANCE = ExtendedMeshFactoryImpl.init();
}