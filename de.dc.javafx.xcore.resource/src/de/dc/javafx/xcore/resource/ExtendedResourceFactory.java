package de.dc.javafx.xcore.resource;

import org.eclipse.emf.ecore.EObject;

public interface ExtendedResourceFactory extends ResourceFactory {

	ExtendedResourceFactory eINSTANCE = de.dc.javafx.xcore.resource.ExtendedResourceFactoryImpl.init();
	
	EObject create(int classifierId);
}
