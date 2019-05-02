/**
 */
package de.dc.javafx.emfsupport.website.model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Page</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dc.javafx.emfsupport.website.model.Page#getName <em>Name</em>}</li>
 *   <li>{@link de.dc.javafx.emfsupport.website.model.Page#getBody <em>Body</em>}</li>
 *   <li>{@link de.dc.javafx.emfsupport.website.model.Page#getUrl <em>Url</em>}</li>
 *   <li>{@link de.dc.javafx.emfsupport.website.model.Page#getAuthor <em>Author</em>}</li>
 * </ul>
 *
 * @see de.dc.javafx.emfsupport.website.model.ModelPackage#getPage()
 * @model
 * @generated
 */
public interface Page extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see de.dc.javafx.emfsupport.website.model.ModelPackage#getPage_Name()
	 * @model unique="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.dc.javafx.emfsupport.website.model.Page#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' attribute.
	 * @see #setBody(String)
	 * @see de.dc.javafx.emfsupport.website.model.ModelPackage#getPage_Body()
	 * @model unique="false"
	 * @generated
	 */
	String getBody();

	/**
	 * Sets the value of the '{@link de.dc.javafx.emfsupport.website.model.Page#getBody <em>Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' attribute.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(String value);

	/**
	 * Returns the value of the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Url</em>' attribute.
	 * @see #setUrl(String)
	 * @see de.dc.javafx.emfsupport.website.model.ModelPackage#getPage_Url()
	 * @model unique="false"
	 * @generated
	 */
	String getUrl();

	/**
	 * Sets the value of the '{@link de.dc.javafx.emfsupport.website.model.Page#getUrl <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url</em>' attribute.
	 * @see #getUrl()
	 * @generated
	 */
	void setUrl(String value);

	/**
	 * Returns the value of the '<em><b>Author</b></em>' containment reference list.
	 * The list contents are of type {@link de.dc.javafx.emfsupport.website.model.Author}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Author</em>' containment reference list.
	 * @see de.dc.javafx.emfsupport.website.model.ModelPackage#getPage_Author()
	 * @model containment="true"
	 * @generated
	 */
	EList<Author> getAuthor();

} // Page
