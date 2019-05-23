package de.dc.javafx.xcore.resource;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import de.dc.javafx.xcore.resource.impl.ResourceFactoryImpl;

public class ExtendedResourceFactoryImpl extends ResourceFactoryImpl implements ExtendedResourceFactory {

	public static ExtendedResourceFactory init() {
		try {
			ExtendedResourceFactory theResourceFactory = (ExtendedResourceFactory) EPackage.Registry.INSTANCE
					.getEFactory(ResourcePackage.eNS_URI);
			if (theResourceFactory != null) {
				return theResourceFactory;
			}
		} catch (Exception exception) {
		}
		return new ExtendedResourceFactoryImpl();
	}

	@Override
	public EObject create(int classifierId) {
		switch (classifierId) {
		case ResourcePackage.WORKSPACE:
			return createWorkspace();
		case ResourcePackage.PROJECT:
			return createProject();
		case ResourcePackage.NATURE:
			return createNature();
		case ResourcePackage.SOURCE_FOLDER:
			return createSourceFolder();
		case ResourcePackage.RESOURCE_FOLDER:
			return createResourceFolder();
		default:
			throw new IllegalArgumentException("The class '" + classifierId + "' is not a valid classifier");
		}
	}
	
}
