package de.dc.javafx.xcore.lang.edit.generator

import de.dc.javafx.xcore.lang.edit.emfSupportDsl.Ecore

class ExtendedFactoryTemplate implements ICustomerGenerator<Ecore>{
	
	override path(Ecore input)'''«input.packagePath.replace('.', '/').replace('\'', '')»/factory/Extended«input.name»Factory.java'''
	
	override code(Ecore input)'''
	package «input.packagePath.replace('\'', '')».factory;
	«val name = input.modelFactory.simpleName»
	import org.eclipse.emf.ecore.EObject;
	
	import «input.modelFactory.qualifiedName»;
	
	public interface Extended«name» extends «name»{
	
		Extended«name» eINSTANCE = Extended«name»Impl.init();
		
		EObject create(int classifierId);
	}
	'''
	
}