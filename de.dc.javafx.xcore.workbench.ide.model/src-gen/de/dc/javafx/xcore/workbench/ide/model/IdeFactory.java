/**
 */
package de.dc.javafx.xcore.workbench.ide.model;

import org.eclipse.emf.common.notify.AdapterFactory;

import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.dc.javafx.xcore.workbench.ide.model.IdePackage
 * @generated
 */
public interface IdeFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	IdeFactory eINSTANCE = de.dc.javafx.xcore.workbench.ide.model.impl.IdeFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Container</em>'.
	 * @generated
	 */
	IdeContainer createIdeContainer();

	/**
	 * Returns an instance of data type '<em>Model EFactory</em>' corresponding the given literal.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal a literal of the data type.
	 * @return a new instance value of the data type.
	 * @generated
	 */
	EFactory createModelEFactory(String literal);

	/**
	 * Returns a literal representation of an instance of data type '<em>Model EFactory</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param instanceValue an instance value of the data type.
	 * @return a literal representation of the instance value.
	 * @generated
	 */
	String convertModelEFactory(EFactory instanceValue);

	/**
	 * Returns an instance of data type '<em>Model EPackage</em>' corresponding the given literal.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal a literal of the data type.
	 * @return a new instance value of the data type.
	 * @generated
	 */
	EPackage createModelEPackage(String literal);

	/**
	 * Returns a literal representation of an instance of data type '<em>Model EPackage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param instanceValue an instance value of the data type.
	 * @return a literal representation of the instance value.
	 * @generated
	 */
	String convertModelEPackage(EPackage instanceValue);

	/**
	 * Returns an instance of data type '<em>Adapter EFactory</em>' corresponding the given literal.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal a literal of the data type.
	 * @return a new instance value of the data type.
	 * @generated
	 */
	AdapterFactory createAdapterEFactory(String literal);

	/**
	 * Returns a literal representation of an instance of data type '<em>Adapter EFactory</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param instanceValue an instance value of the data type.
	 * @return a literal representation of the instance value.
	 * @generated
	 */
	String convertAdapterEFactory(AdapterFactory instanceValue);

	/**
	 * Returns an instance of data type '<em>Renderer</em>' corresponding the given literal.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal a literal of the data type.
	 * @return a new instance value of the data type.
	 * @generated
	 */
	Switch createRenderer(String literal);

	/**
	 * Returns a literal representation of an instance of data type '<em>Renderer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param instanceValue an instance value of the data type.
	 * @return a literal representation of the instance value.
	 * @generated
	 */
	String convertRenderer(Switch instanceValue);

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	IdePackage getIdePackage();

} //IdeFactory
