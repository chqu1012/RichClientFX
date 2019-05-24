package de.dc.javafx.emfsupport.website.model.ui.factory;

import org.eclipse.emf.ecore.EObject;

import de.dc.javafx.emfsupport.website.model.ModelFactory;

public interface ExtendedWebsiteModelFactory extends ModelFactory {

	ExtendedWebsiteModelFactory eINSTANCE = ExtendedWebsiteModelFactoryImpl.init();
	
	EObject create(int classifierId);
}
