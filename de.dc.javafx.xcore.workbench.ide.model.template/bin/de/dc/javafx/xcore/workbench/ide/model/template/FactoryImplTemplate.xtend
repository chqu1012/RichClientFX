package de.dc.javafx.xcore.workbench.ide.model.template

import de.dc.javafx.xcore.workbench.ide.model.IdeContainer

class FactoryImplTemplate implements IGenerator<IdeContainer> {
	
	override gen(IdeContainer project)'''
	package «project.packagePath».factory;
	
	import org.eclipse.emf.ecore.*;
	
	import «project.modelEPackage.class.package.name».*;
	import «project.modelEPackage.class.package.name».impl.*;
	«val modelName = project.modelName»
	public class Extended«modelName»FactoryImpl extends «modelName»FactoryImpl implements Extended«modelName»Factory {
	
		public static Extended«modelName»Factory init() {
			try {
				Extended«modelName»Factory theResourceFactory = (Extended«modelName»Factory) EPackage.Registry.INSTANCE
						.getEFactory(«modelName»Package.eNS_URI);
				if (theResourceFactory != null) {
					return theResourceFactory;
				}
			} catch (Exception exception) {
			}
			return new Extended«modelName»FactoryImpl();
		}
	
		// TODO: This Method is override from the base ModelFactoryImpl, because it doesn't support #create method for ids
		@Override
		public EObject create(int classifierId) {
			switch (classifierId) {
			// TODO: Should be replaced
			default:
				throw new IllegalArgumentException("The class '" + classifierId + "' is not a valid classifier, please enhanced the class "+getClass().getSimpleName()+"#create(classifierId) in switch case!");
			}
		}
	}
	'''
	
	override genName(IdeContainer t)'''Extended«t.modelName»FactoryImpl'''
	
	override genPath(IdeContainer t)'''«t.packagePath.replace('.', '/')»/factory/'''
	
	override getSourceType() {SourceType::SRC}
}