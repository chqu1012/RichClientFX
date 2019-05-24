package de.dc.javafx.xcore.lang.edit.generator

import de.dc.javafx.xcore.lang.edit.emfSupportDsl.Ecore

class ExtendedFactoryImplTemplate implements ICustomerGenerator<Ecore>{
	
	override path(Ecore input)'''«input.packagePath.replace('.', '/').replace('\'', '')»/factory/Extended«input.name»FactoryImpl.java'''
	
	override code(Ecore input)'''
	package «input.packagePath.replace('\'', '')».factory;
	«val name = input.modelFactory.simpleName»
	import org.eclipse.emf.ecore.*;
	
	import «input.modelPackage.qualifiedName»;
	
	public class Extended«name»Impl extends «name»Impl implements Extended«name» {
	
		public static Extended«name» init() {
			try {
				Extended«name» factory = (Extended«name») EPackage.Registry.INSTANCE.getEFactory(«input.name»Package.eNS_URI);
				if (factory != null) {
					return factory;
				}
			} catch (Exception exception) {
			}
			return new Extended.name»Impl();
		}
	
		/**
		* Copy the case content from {@link «input.modelFactory.qualifiedName»Impl «name»Impl}
		**/
		@Override
		public EObject create(int classifierId) {
			switch (classifierId) {
				
			// Case Content
			
			default:
				throw new IllegalArgumentException("The class '" + classifierId + "' is not a valid classifier, please enhanced the class "+Extended«name»Impl.class.getSimpleName()+"#create(classifierId) in switch case!");
			}
		}
		
	}
	'''
	
}