package de.dc.javafx.xcore.lang.edit.generator

import de.dc.javafx.xcore.lang.edit.generator.ICustomerGenerator
import de.dc.javafx.xcore.lang.edit.emfSupportDsl.Ecore

class ModelViewTemplate implements ICustomerGenerator<Ecore> {
	
	override code(Ecore ecore)'''
		package �ecore.packagePath.replace('\'', '')�.view;
		
		import de.dc.javafx.efxclipse.runtime.EMFModelView;
		import de.dc.javafx.efxclipse.runtime.model.IEmfManager;
		import �ecore.rootType.qualifiedName�;
		
		public class �ecore.name�ModelView extends EMFModelView<�ecore.rootType.simpleName�> {
		
			public �ecore.name�ModelView(IEmfManager<�ecore.rootType.simpleName�> manager) {
				super(manager);
			}
		}
		'''
		
		override path(Ecore ecore)'''�ecore.packagePath.replace('.', '/').replace('\'', '')�/view/�ecore.name�ModelView.java'''
	
}