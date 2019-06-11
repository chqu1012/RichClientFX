/**
 */
package de.dc.spring.bootstrap.blog.model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Section</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dc.spring.bootstrap.blog.model.Section#getUuid <em>Uuid</em>}</li>
 * </ul>
 *
 * @see de.dc.spring.bootstrap.blog.model.ModelPackage#getSection()
 * @model abstract="true"
 * @generated
 */
public interface Section extends EObject {
	/**
	 * Returns the value of the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uuid</em>' attribute.
	 * @see #setUuid(String)
	 * @see de.dc.spring.bootstrap.blog.model.ModelPackage#getSection_Uuid()
	 * @model unique="false"
	 * @generated
	 */
	String getUuid();

	/**
	 * Sets the value of the '{@link de.dc.spring.bootstrap.blog.model.Section#getUuid <em>Uuid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uuid</em>' attribute.
	 * @see #getUuid()
	 * @generated
	 */
	void setUuid(String value);

} // Section
