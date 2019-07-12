package de.dc.javafx.lang.chart.ui.testmodel.factory;
import org.eclipse.emf.ecore.EObject;

import de.dc.javafx.emfsupport.website.model.ModelFactory;

public interface ExtendedModelFactory extends ModelFactory{

	ExtendedModelFactory eINSTANCE = ExtendedModelFactoryImpl.init();
	
	EObject create(int classifierId);
}
