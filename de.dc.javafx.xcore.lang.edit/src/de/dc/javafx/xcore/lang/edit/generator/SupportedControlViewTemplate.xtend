package de.dc.javafx.xcore.lang.edit.generator

import de.dc.javafx.xcore.lang.edit.emfSupportDsl.Ecore
import de.dc.javafx.xcore.lang.edit.emfSupportDsl.SupportedControl
import de.dc.javafx.xcore.lang.lib.AbstractApplication

class SupportedControlViewTemplate implements ICustomerGenerator<SupportedControl>{
	
	override code(SupportedControl control)'''
		«val ecore = control.eContainer as Ecore»
		«val packagePath = ecore.packagePath.replace('\'', '')»
		package «packagePath»;
		
		import de.dc.javafx.efxclipse.runtime.EmfTreeView;
		import de.dc.javafx.efxclipse.runtime.model.IEmfManager;
		import «ecore.modelPackage.qualifiedName»;
		import «ecore.rootType.qualifiedName»;
		«val rootName = ecore.rootType.simpleName»
		public class «control.name»TreeView extends EmfTreeView<«rootName»> {
		
			public «control.name»TreeView(IEmfManager<«rootName»> manager) {
				super(manager);
				
				// addEditableFor(ModelPackage.eINSTANCE.getPage_Name());
			}
		}
		'''
		
		override path(SupportedControl control)'''«(control.eContainer as Ecore).packagePath.replace('\'', '').replace('.', '/')»/«control.name»TreeView.java'''
}