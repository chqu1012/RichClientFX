package de.dc.javafx.lang.chart.ui.testmodel.factory;
import org.eclipse.emf.ecore.*;

import de.dc.javafx.emfsupport.website.model.impl.*;
import de.dc.javafx.emfsupport.website.model.ModelPackage;

public class ExtendedModelFactoryImpl extends ModelFactoryImpl implements ExtendedModelFactory {

	public static ExtendedModelFactory init() {
		try {
			ExtendedModelFactory factory = (ExtendedModelFactory) EPackage.Registry.INSTANCE.getEFactory(TestModelPackage.eNS_URI);
			if (factory != null) {
				return factory;
			}
		} catch (Exception exception) {
		}
		return new ExtendedModelFactoryImpl();
	}

	/**
	* Copy the case content from {@link de.dc.javafx.emfsupport.website.model.ModelFactoryImpl ModelFactoryImpl}
	**/
	@Override
	public EObject create(int classifierId) {
		switch (classifierId) {
			
		// Case Content
		
		default:
			throw new IllegalArgumentException("The class '" + classifierId + "' is not a valid classifier, please enhanced the class "+ExtendedModelFactoryImpl.class.getSimpleName()+"#create(classifierId) in switch case!");
		}
	}
	
}
