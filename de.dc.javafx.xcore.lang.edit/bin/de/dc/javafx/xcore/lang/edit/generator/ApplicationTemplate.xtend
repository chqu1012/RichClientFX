package de.dc.javafx.xcore.lang.edit.generator

import de.dc.javafx.xcore.lang.edit.emfSupportDsl.Ecore

class ApplicationTemplate implements ICustomerGenerator<Ecore>{
	
	override code(Ecore ecore)'''
		package «ecore.packagePath.replace('\'', '')».demo;
		
		import java.io.File;
		
		import «ecore.packagePath.replace('\'', '')».*;
		import «ecore.packagePath.replace('\'', '')».view.*;
		import de.dc.javafx.xcore.di.ApplicationContext;
		import de.dc.javafx.xcore.lang.lib.AbstractApplication;
		import javafx.scene.Parent;
		
		public class «ecore.name»ViewApplication extends AbstractApplication{
		
			@Override
			public Parent getRoot() {
				Base«ecore.name»Manager manager = new Base«ecore.name»Manager();
				return new «ecore.name»ModelView(manager);
			}
			
			public static void main(String[] args) {
				ApplicationContext.init();
				// TODO: Should be implement dynamically!
				new File("./workspace").mkdirs();
				launch(args);
			}
		}
		'''
		
		override path(Ecore ecore)'''«ecore.packagePath.replace('.', '/').replace('\'', '')»/demo/«ecore.name»ViewApplication.java'''
}