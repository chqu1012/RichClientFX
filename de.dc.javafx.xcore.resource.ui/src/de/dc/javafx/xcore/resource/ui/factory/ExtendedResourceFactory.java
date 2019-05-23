package de.dc.javafx.xcore.resource.ui.factory;

import org.eclipse.emf.ecore.EObject;

import de.dc.javafx.xcore.resource.ResourceFactory;

public interface ExtendedResourceFactory extends ResourceFactory {

	ExtendedResourceFactory eINSTANCE = ExtendedResourceFactoryImpl.init();
	
	EObject create(int classifierId);
}
