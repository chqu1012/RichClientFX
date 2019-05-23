package de.dc.javafx.xcore.lang.edit.generator

import de.dc.javafx.xcore.lang.edit.emfSupportDsl.Ecore
import de.dc.javafx.xcore.lang.edit.emfSupportDsl.SupportedControl
import de.dc.javafx.xcore.lang.lib.AbstractApplication

class SupportedControlApplicationTemplate implements ICustomerGenerator<SupportedControl>{
	
	override code(SupportedControl control)'''
		«val ecore = control.eContainer as Ecore»
		«val packagePath = ecore.packagePath.replace('\'', '')»
		package «packagePath»;
		
		import de.dc.javafx.efxclipse.runtime.model.*;
		import javafx.scene.Parent;
		import «control.model.qualifiedName»;
		import «AbstractApplication.name»;

		«val className = control.name»
		«val model = ecore.rootType.simpleName»
		public class «className»TreeViewApplication extends AbstractApplication{
		
			@Override
			protected Parent getRoot() {
				IEmfManager<«model»> manager = new Base«ecore.name»Manager();
				// ObservableList<«className»> «className»s = FXCollections.observableArrayList();
				// for (int i = 0; i < 20; i++) {
				// 	«className» item = «ecore.modelFactory.qualifiedName».eINSTANCE.create«className»();
				// 	«className»s.add(item);
				// }
				// manager.getRoot().get«className»s().addAll(«className»s);
				return new «className»TreeView(manager);
			}
		
			public static void main(String[] args) {
				launch(args);
			}
		}
		'''
		
		override path(SupportedControl control)'''«(control.eContainer as Ecore).packagePath.replace('\'', '').replace('.', '/')»/«control.name»TreeViewApplication.java'''
}