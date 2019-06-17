package de.dc.javafx.xcore.workbench.ide.model.template

import de.dc.javafx.xcore.workbench.ide.model.IdeContainer

class ManagerTemplate implements IGenerator<IdeContainer> {
	
	override gen(IdeContainer project)'''
	package «project.packagePath».manager;
	
	import org.eclipse.emf.common.notify.AdapterFactory;
	import org.eclipse.emf.ecore.EPackage;
	
	import «project.modelEFactory.class.package.name».*;
	import «project.modelEFactory.class.package.name».provider.ChartItemProviderAdapterFactory;
	import «project.packagePath».factory.*;
	import «project.packagePath».file.*;
	import de.dc.javafx.xcore.workbench.emf.AbstractEmfManager;
	import de.dc.javafx.xcore.workbench.emf.factory.ExtendedFactory;
	import de.dc.javafx.xcore.workbench.emf.file.IEmfFile;
	«val modelName = project.modelName»
	public class «modelName»EmfManager extends AbstractEmfManager<«modelName»> {
		@Override
		protected AdapterFactory getModelItemProviderAdapterFactory() {
			return new «modelName»ItemProviderAdapterFactory();
		}
	
		@Override
		protected «modelName» initModel() {
			return «modelName»Factory.eINSTANCE.createChartProject();
		}
	
		@Override
		protected ChartProject createNewModelOnNullCheck() {
			return initModel();
		}
	
		@Override
		public EPackage getModelPackage() {
			return «modelName»Package.eINSTANCE;
		}
	
		@Override
		public ExtendedFactory getExtendedModelFactory() {
			return Extended«modelName»Factory.eINSTANCE;
		}
	
		@Override
		public IEmfFile<ChartProject> initFile() {
			return new «modelName»File();
		}
	}
	'''
	
	override genName(IdeContainer t)'''«t.modelName»EmfManager'''
	
	override genPath(IdeContainer t)'''«t.packagePath.replace('.', '/')»/manager/''' 
	
	override getSourceType() {SourceType::SRC}
}