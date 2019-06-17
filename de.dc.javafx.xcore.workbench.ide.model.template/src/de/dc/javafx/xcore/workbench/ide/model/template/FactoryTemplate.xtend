package de.dc.javafx.xcore.workbench.ide.model.template

import de.dc.javafx.xcore.workbench.ide.model.IdeContainer

class FactoryTemplate implements IGenerator<IdeContainer> {
	
	override gen(IdeContainer t)'''
	package «t.packagePath».factory;
	
	import «t.modelItemProviderAdapterFactor.class.canonicalName»;«»
	import «t.packagePath».factory.Extended«t.modelName»Factory;
	
	public interface Extended«t.modelName»Factory extends «t.modelName»Factory, ExtendedFactory {
	
		Extended«t.modelName»Factory eINSTANCE = Extended«t.modelName»FactoryImpl.init();
	}
	'''
	
	override genName(IdeContainer t)'''Extended«t.modelName»Factory'''
	
	override genPath(IdeContainer t)'''«t.packagePath.replace('.', '/')»/factory/''' 
	
	override getSourceType() {SourceType::SRC}
}