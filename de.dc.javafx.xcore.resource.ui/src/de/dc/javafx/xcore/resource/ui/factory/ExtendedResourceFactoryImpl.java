package de.dc.javafx.xcore.resource.ui.factory;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import de.dc.javafx.xcore.resource.ResourcePackage;
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
		case ResourcePackage.FOLDER:
			return createFolder();
		case ResourcePackage.FILE:
			return createFile();
		case ResourcePackage.PACKAGE_FOLDER:
			return createPackageFolder();
		default:
			throw new IllegalArgumentException("The class '" + classifierId + "' is not a valid classifier, please enhanced the class "+ExtendedResourceFactoryImpl.class.getSimpleName()+"#create(classifierId) in switch case!");
		}
	}
	
}
