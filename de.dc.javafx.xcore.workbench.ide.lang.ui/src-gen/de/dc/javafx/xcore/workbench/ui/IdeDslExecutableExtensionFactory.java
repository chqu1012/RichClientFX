/*
 * generated by Xtext 2.17.0
 */
package de.dc.javafx.xcore.workbench.ui;

import com.google.inject.Injector;
import de.dc.javafx.xcore.workbench.ide.lang.ui.internal.LangActivator;
import org.eclipse.core.runtime.Platform;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class IdeDslExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return Platform.getBundle(LangActivator.PLUGIN_ID);
	}
	
	@Override
	protected Injector getInjector() {
		LangActivator activator = LangActivator.getInstance();
		return activator != null ? activator.getInjector(LangActivator.DE_DC_JAVAFX_XCORE_WORKBENCH_IDEDSL) : null;
	}

}
