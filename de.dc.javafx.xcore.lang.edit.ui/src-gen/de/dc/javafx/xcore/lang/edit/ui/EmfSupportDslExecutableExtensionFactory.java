/*
 * generated by Xtext 2.17.0
 */
package de.dc.javafx.xcore.lang.edit.ui;

import com.google.inject.Injector;
import de.dc.javafx.xcore.lang.edit.ui.internal.EditActivator;
import org.eclipse.core.runtime.Platform;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class EmfSupportDslExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return Platform.getBundle(EditActivator.PLUGIN_ID);
	}
	
	@Override
	protected Injector getInjector() {
		EditActivator activator = EditActivator.getInstance();
		return activator != null ? activator.getInjector(EditActivator.DE_DC_JAVAFX_XCORE_LANG_EDIT_EMFSUPPORTDSL) : null;
	}

}
