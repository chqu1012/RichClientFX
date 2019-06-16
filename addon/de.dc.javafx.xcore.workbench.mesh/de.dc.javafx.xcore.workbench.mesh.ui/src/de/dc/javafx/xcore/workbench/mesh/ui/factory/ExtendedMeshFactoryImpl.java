package de.dc.javafx.xcore.workbench.mesh.ui.factory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import de.dc.javafx.xcore.workbench.mesh.MeshPackage;
import de.dc.javafx.xcore.workbench.mesh.impl.MeshFactoryImpl;

public class ExtendedMeshFactoryImpl extends MeshFactoryImpl implements ExtendedMeshFactory {

	public static ExtendedMeshFactoryImpl init() {
		try {
			ExtendedMeshFactoryImpl theResourceFactory = (ExtendedMeshFactoryImpl) EPackage.Registry.INSTANCE
					.getEFactory(MeshPackage.eNS_URI);
			if (theResourceFactory != null) {
				return theResourceFactory;
			}
		} catch (Exception exception) {
		}
		return new ExtendedMeshFactoryImpl();
	}

	// Todo: This Method is override from the base ModelFactoryImpl, because it doesn't support #create method for ids
	@Override
	public EObject create(int classifierId) {
		switch (classifierId) {
		case MeshPackage.MESH_CONTAINER:
			return createMeshContainer();
		case MeshPackage.CAMERA_FX:
			return createCameraFX();
		case MeshPackage.COORDINATE_SYSTEM:
			return createCoordinateSystem();
		case MeshPackage.BOX_FX:
			return createBoxFX();
		default:
			throw new IllegalArgumentException("The class '" + classifierId + "' is not a valid classifier, please enhanced the class "+getClass().getSimpleName()+"#create(classifierId) in switch case!");
		}
	}
}