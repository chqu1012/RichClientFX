package de.dc.javafx.xcore.lang.edit.generator

import de.dc.javafx.xcore.lang.edit.emfSupportDsl.Ecore

class ExtendedFactoryImplTemplate implements ICustomerGenerator<Ecore>{
	
	override path(Ecore input)'''«input.packagePath.replace('.', '/').replace('\'', '')»/factory/Extended«input.name»FactoryImpl.java'''
	
	override code(Ecore input)'''
	package «input.packagePath.replace('\'', '')».factory;
	
	import org.eclipse.emf.ecore.*;
	
	import «input.modelPackage.qualifiedName»;
	import de.dc.javafx.xcore.resource.impl.ResourceFactoryImpl;
	
	public class Extended«input.name»FactoryImpl extends «input.name»FactoryImpl implements Extended«input.name»Factory {
	
		public static Extended«input.name»Factory init() {
			try {
				Extended«input.name»Factory factory = (Extended«input.name»Factory) EPackage.Registry.INSTANCE
						.getEFactory(«input.name»Package.eNS_URI);
				if (factory != null) {
					return factory;
				}
			} catch (Exception exception) {
			}
			return new Extended«input.name»FactoryImpl();
		}
	
		/**
		* Copy the case content from {@link «input.modelFactory.qualifiedName»Impl «input.modelFactory.simpleName»Impl}
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
	'''
	
}