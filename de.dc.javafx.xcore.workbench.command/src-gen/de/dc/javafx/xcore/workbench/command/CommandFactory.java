/**
 */
package de.dc.javafx.xcore.workbench.command;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.dc.javafx.xcore.workbench.command.CommandPackage
 * @generated
 */
public interface CommandFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CommandFactory eINSTANCE = de.dc.javafx.xcore.workbench.command.impl.CommandFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Emf Command History</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Emf Command History</em>'.
	 * @generated
	 */
	EmfCommandHistory createEmfCommandHistory();

	/**
	 * Returns a new object of class '<em>Emf Command</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Emf Command</em>'.
	 * @generated
	 */
	EmfCommand createEmfCommand();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CommandPackage getCommandPackage();

} //CommandFactory
