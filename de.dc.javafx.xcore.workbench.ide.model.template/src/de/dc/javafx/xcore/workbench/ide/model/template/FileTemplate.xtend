package de.dc.javafx.xcore.workbench.ide.model.template

import de.dc.javafx.xcore.workbench.ide.model.IdeContainer

class FileTemplate implements IGenerator<IdeContainer> {
	
	override gen(IdeContainer project)'''
	package «project.packagePath».file;
	
	import org.eclipse.emf.ecore.*;
	
	import «project.modelEFactory.class.package.name».*;
	import de.dc.javafx.xcore.workbench.emf.file.EmfFile;
	«val modelName = project.modelName»
	public class «modelName»File extends EmfFile<«modelName»>{
	
		@Override
		public EPackage getEPackageEInstance() {
			return «modelName»Package.eINSTANCE;
		}
	
		@Override
		public EFactory getEFactoryEInstance() {
			return «modelName»Factory.eINSTANCE;
		}
	
		@Override
		public String getExtension() {
			return "«project.ext»";
		}
	}
	'''
	
	override genName(IdeContainer t)'''«t.modelName»File'''
	
	override genPath(IdeContainer t)'''«t.packagePath.replace('.', '/')»/file/''' 
	
	override getSourceType() {SourceType::SRC}
}