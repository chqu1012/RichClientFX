/*
 * generated by Xtext 2.17.0
 */
package de.dc.javafx.xcore.lang.edit


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class EmfSupportDslStandaloneSetup extends EmfSupportDslStandaloneSetupGenerated {

	def static void doSetup() {
		new EmfSupportDslStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}
