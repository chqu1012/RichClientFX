package de.dc.javafx.xcore.lang.edit.generator

import de.dc.javafx.xcore.lang.edit.emfSupportDsl.Ecore

class ExtendedFactoryTemplate implements ICustomerGenerator<Ecore>{
	
	override path(Ecore input)'''«input.packagePath.replace('.', '/').replace('\'', '')»/factory/Extended«input.name»Factory.java'''
	
	override code(Ecore input)'''
	package «input.packagePath.replace('\'', '')».factory;
	
	import org.eclipse.emf.ecore.EObject;
	
	import «input.modelFactory.qualifiedName»;
	
	public interface Extended«input.name»Factory extends «input.name»Factory {
	
		Extended«input.name»Factory eINSTANCE = Extended«input.name»FactoryImpl.init();
		
		EObject create(int classifierId);
	}
	'''
	
}