/**
 */
package de.dc.javafx.emfsupport.website.model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Website</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dc.javafx.emfsupport.website.model.Website#getName <em>Name</em>}</li>
 *   <li>{@link de.dc.javafx.emfsupport.website.model.Website#getPages <em>Pages</em>}</li>
 * </ul>
 *
 * @see de.dc.javafx.emfsupport.website.model.ModelPackage#getWebsite()
 * @model
 * @generated
 */
public interface Website extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see de.dc.javafx.emfsupport.website.model.ModelPackage#getWebsite_Name()
	 * @model unique="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.dc.javafx.emfsupport.website.model.Website#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Pages</b></em>' containment reference list.
	 * The list contents are of type {@link de.dc.javafx.emfsupport.website.model.Page}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pages</em>' containment reference list.
	 * @see de.dc.javafx.emfsupport.website.model.ModelPackage#getWebsite_Pages()
	 * @model containment="true"
	 * @generated
	 */
	EList<Page> getPages();

} // Website
