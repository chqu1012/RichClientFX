/**
 */
package de.dc.spring.bootstrap.blog.model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Blog</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dc.spring.bootstrap.blog.model.Blog#getTitle <em>Title</em>}</li>
 *   <li>{@link de.dc.spring.bootstrap.blog.model.Blog#getSections <em>Sections</em>}</li>
 * </ul>
 *
 * @see de.dc.spring.bootstrap.blog.model.ModelPackage#getBlog()
 * @model
 * @generated
 */
public interface Blog extends EObject {
	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see de.dc.spring.bootstrap.blog.model.ModelPackage#getBlog_Title()
	 * @model unique="false"
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link de.dc.spring.bootstrap.blog.model.Blog#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Sections</b></em>' containment reference list.
	 * The list contents are of type {@link de.dc.spring.bootstrap.blog.model.Section}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sections</em>' containment reference list.
	 * @see de.dc.spring.bootstrap.blog.model.ModelPackage#getBlog_Sections()
	 * @model containment="true"
	 * @generated
	 */
	EList<Section> getSections();

} // Blog
