/*
 * generated by Xtext 2.17.0
 */
package de.dc.javafx.xcore.lang.edit;

import com.google.inject.Guice;
import com.google.inject.Injector;
import de.dc.javafx.xcore.lang.edit.emfSupportDsl.EmfSupportDslPackage;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.ISetup;
import org.eclipse.xtext.resource.IResourceFactory;
import org.eclipse.xtext.resource.IResourceServiceProvider;
import org.eclipse.xtext.xbase.annotations.XbaseWithAnnotationsStandaloneSetup;

@SuppressWarnings("all")
public class EmfSupportDslStandaloneSetupGenerated implements ISetup {

	@Override
	public Injector createInjectorAndDoEMFRegistration() {
		XbaseWithAnnotationsStandaloneSetup.doSetup();

		Injector injector = createInjector();
		register(injector);
		return injector;
	}
	
	public Injector createInjector() {
		return Guice.createInjector(new EmfSupportDslRuntimeModule());
	}
	
	public void register(Injector injector) {
		if (!EPackage.Registry.INSTANCE.containsKey("http://www.dc.de/javafx/xcore/lang/edit/EmfSupportDsl")) {
			EPackage.Registry.INSTANCE.put("http://www.dc.de/javafx/xcore/lang/edit/EmfSupportDsl", EmfSupportDslPackage.eINSTANCE);
		}
		IResourceFactory resourceFactory = injector.getInstance(IResourceFactory.class);
		IResourceServiceProvider serviceProvider = injector.getInstance(IResourceServiceProvider.class);
		
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("javafxemf", resourceFactory);
		IResourceServiceProvider.Registry.INSTANCE.getExtensionToFactoryMap().put("javafxemf", serviceProvider);
	}
}
