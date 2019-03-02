/**
 */
package de.dc.emf.javafx.model.javafx;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.dc.emf.javafx.model.javafx.JavafxPackage
 * @generated
 */
public interface JavafxFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	JavafxFactory eINSTANCE = de.dc.emf.javafx.model.javafx.impl.JavafxFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Project FX</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Project FX</em>'.
	 * @generated
	 */
	ProjectFX createProjectFX();

	/**
	 * Returns a new object of class '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Named Element</em>'.
	 * @generated
	 */
	NamedElement createNamedElement();

	/**
	 * Returns a new object of class '<em>Table View FX</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Table View FX</em>'.
	 * @generated
	 */
	TableViewFX createTableViewFX();

	/**
	 * Returns a new object of class '<em>Table Column FX</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Table Column FX</em>'.
	 * @generated
	 */
	TableColumnFX createTableColumnFX();

	/**
	 * Returns a new object of class '<em>Model FX</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model FX</em>'.
	 * @generated
	 */
	ModelFX createModelFX();

	/**
	 * Returns a new object of class '<em>Attribute FX</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribute FX</em>'.
	 * @generated
	 */
	AttributeFX createAttributeFX();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	JavafxPackage getJavafxPackage();

} //JavafxFactory
