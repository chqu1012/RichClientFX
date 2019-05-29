/**
 */
package de.dc.javafx.xcore.workbench;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Named Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dc.javafx.xcore.workbench.NamedElement#get_Id <em>Id</em>}</li>
 *   <li>{@link de.dc.javafx.xcore.workbench.NamedElement#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see de.dc.javafx.xcore.workbench.WorkbenchPackage#getNamedElement()
 * @model
 * @generated
 */
public interface NamedElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #set_Id(String)
	 * @see de.dc.javafx.xcore.workbench.WorkbenchPackage#getNamedElement__Id()
	 * @model unique="false"
	 * @generated
	 */
	String get_Id();

	/**
	 * Sets the value of the '{@link de.dc.javafx.xcore.workbench.NamedElement#get_Id <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #get_Id()
	 * @generated
	 */
	void set_Id(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see de.dc.javafx.xcore.workbench.WorkbenchPackage#getNamedElement_Name()
	 * @model unique="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.dc.javafx.xcore.workbench.NamedElement#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // NamedElement
