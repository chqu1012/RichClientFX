/*
 * generated by Xtext 2.17.0
 */
package de.dc.javafx.xcore.workbench;

import com.google.inject.Guice;
import com.google.inject.Injector;
import de.dc.javafx.xcore.workbench.ide.IdePackage;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.ISetup;
import org.eclipse.xtext.resource.IResourceFactory;
import org.eclipse.xtext.resource.IResourceServiceProvider;
import org.eclipse.xtext.xbase.annotations.XbaseWithAnnotationsStandaloneSetup;

@SuppressWarnings("all")
public class IdeDslStandaloneSetupGenerated implements ISetup {

	@Override
	public Injector createInjectorAndDoEMFRegistration() {
		XbaseWithAnnotationsStandaloneSetup.doSetup();

		Injector injector = createInjector();
		register(injector);
		return injector;
	}
	
	public Injector createInjector() {
		return Guice.createInjector(new IdeDslRuntimeModule());
	}
	
	public void register(Injector injector) {
		if (!EPackage.Registry.INSTANCE.containsKey("http://www.frateranatis.org/workbench/ide/IdeDsl")) {
			EPackage.Registry.INSTANCE.put("http://www.frateranatis.org/workbench/ide/IdeDsl", IdePackage.eINSTANCE);
		}
		IResourceFactory resourceFactory = injector.getInstance(IResourceFactory.class);
		IResourceServiceProvider serviceProvider = injector.getInstance(IResourceServiceProvider.class);
		
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("ide", resourceFactory);
		IResourceServiceProvider.Registry.INSTANCE.getExtensionToFactoryMap().put("ide", serviceProvider);
	}
}