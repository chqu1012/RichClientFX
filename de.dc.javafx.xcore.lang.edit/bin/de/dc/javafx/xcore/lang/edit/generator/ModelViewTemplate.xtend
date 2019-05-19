package de.dc.javafx.xcore.lang.edit.generator

import de.dc.javafx.xcore.lang.edit.generator.ICustomerGenerator
import de.dc.javafx.xcore.lang.edit.emfSupportDsl.Ecore

class ModelViewTemplate implements ICustomerGenerator<Ecore> {
	
	override code(Ecore ecore)'''
		package «ecore.packagePath.replace('\'', '')»;
		
		import de.dc.javafx.efxclipse.runtime.model.IEmfManager;
		import «ecore.rootType.qualifiedName»;
		
<<<<<<< HEAD
		public class «ecore.rootType.simpleName»ModelView extends Base«ecore.name»View {
=======
		public class «ecore.rootType.simpleName»View extends Base«ecore.name»View {
>>>>>>> branch 'master' of https://github.com/chqu1012/de.dc.emf.javafx.xtext.lang.git
		
			public  «ecore.rootType.simpleName»ModelView(IEmfManager<«ecore.rootType.simpleName»> manager) {
				super(manager);
			}
		}
		'''
		
		override path(Ecore ecore)'''«ecore.packagePath.replace('.', '/').replace('\'', '')»/«ecore.rootType.simpleName»ModelView.java'''
	
}