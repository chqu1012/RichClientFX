package de.dc.javafx.emfsupport.website.model.ui.factory;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import de.dc.javafx.emfsupport.website.model.ModelPackage;
import de.dc.javafx.emfsupport.website.model.impl.ModelFactoryImpl;

public class ExtendedWebsiteModelFactoryImpl extends ModelFactoryImpl implements ExtendedWebsiteModelFactory {

	public static ExtendedWebsiteModelFactory init() {
		try {
			ExtendedWebsiteModelFactory factory = (ExtendedWebsiteModelFactory) EPackage.Registry.INSTANCE
					.getEFactory(ModelPackage.eNS_URI);
			if (factory != null) {
				return factory;
			}
		} catch (Exception exception) {
		}
		return new ExtendedWebsiteModelFactoryImpl();
	}

	/**
	* Copy the case content from {@link de.dc.javafx.emfsupport.website.model.ModelPackageImpl}
	**/
	@Override
	public EObject create(int classifierId) {
		switch (classifierId) {
			
		// Case Content
		
		default:
			throw new IllegalArgumentException("The class '" + classifierId + "' is not a valid classifier");
		}
	}
	
}
