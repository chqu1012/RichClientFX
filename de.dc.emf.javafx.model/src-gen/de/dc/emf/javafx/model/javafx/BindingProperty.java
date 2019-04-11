/**
 */
package de.dc.emf.javafx.model.javafx;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binding Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dc.emf.javafx.model.javafx.BindingProperty#getName <em>Name</em>}</li>
 *   <li>{@link de.dc.emf.javafx.model.javafx.BindingProperty#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see de.dc.emf.javafx.model.javafx.JavafxPackage#getBindingProperty()
 * @model
 * @generated
 */
public interface BindingProperty extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see de.dc.emf.javafx.model.javafx.JavafxPackage#getBindingProperty_Name()
	 * @model unique="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.dc.emf.javafx.model.javafx.BindingProperty#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link de.dc.emf.javafx.model.javafx.BindingType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see de.dc.emf.javafx.model.javafx.BindingType
	 * @see #setType(BindingType)
	 * @see de.dc.emf.javafx.model.javafx.JavafxPackage#getBindingProperty_Type()
	 * @model unique="false"
	 * @generated
	 */
	BindingType getType();

	/**
	 * Sets the value of the '{@link de.dc.emf.javafx.model.javafx.BindingProperty#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see de.dc.emf.javafx.model.javafx.BindingType
	 * @see #getType()
	 * @generated
	 */
	void setType(BindingType value);

} // BindingProperty
