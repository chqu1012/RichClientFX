/**
 */
package de.dc.javafx.xcore.resource;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Nature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dc.javafx.xcore.resource.Nature#getDescription <em>Description</em>}</li>
 *   <li>{@link de.dc.javafx.xcore.resource.Nature#getProjectType <em>Project Type</em>}</li>
 * </ul>
 *
 * @see de.dc.javafx.xcore.resource.ResourcePackage#getNature()
 * @model
 * @generated
 */
public interface Nature extends EObject {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see de.dc.javafx.xcore.resource.ResourcePackage#getNature_Description()
	 * @model unique="false"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link de.dc.javafx.xcore.resource.Nature#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Project Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Project Type</em>' attribute.
	 * @see #setProjectType(String)
	 * @see de.dc.javafx.xcore.resource.ResourcePackage#getNature_ProjectType()
	 * @model unique="false"
	 * @generated
	 */
	String getProjectType();

	/**
	 * Sets the value of the '{@link de.dc.javafx.xcore.resource.Nature#getProjectType <em>Project Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Project Type</em>' attribute.
	 * @see #getProjectType()
	 * @generated
	 */
	void setProjectType(String value);

} // Nature
