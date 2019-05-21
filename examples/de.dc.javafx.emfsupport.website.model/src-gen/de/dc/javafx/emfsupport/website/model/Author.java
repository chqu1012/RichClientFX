package de.dc.javafx.emfsupport.website.model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Author</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dc.javafx.emfsupport.website.model.Author#getFirstname <em>Firstname</em>}</li>
 *   <li>{@link de.dc.javafx.emfsupport.website.model.Author#getLastname <em>Lastname</em>}</li>
 *   <li>{@link de.dc.javafx.emfsupport.website.model.Author#getEmail <em>Email</em>}</li>
 * </ul>
 *
 * @see de.dc.javafx.emfsupport.website.model.ModelPackage#getAuthor()
 * @model
 * @generated
 */
public interface Author extends EObject {
	/**
	 * Returns the value of the '<em><b>Firstname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Firstname</em>' attribute.
	 * @see #setFirstname(String)
	 * @see de.dc.javafx.emfsupport.website.model.ModelPackage#getAuthor_Firstname()
	 * @model unique="false"
	 * @generated
	 */
	String getFirstname();

	/**
	 * Sets the value of the '{@link de.dc.javafx.emfsupport.website.model.Author#getFirstname <em>Firstname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Firstname</em>' attribute.
	 * @see #getFirstname()
	 * @generated
	 */
	void setFirstname(String value);

	/**
	 * Returns the value of the '<em><b>Lastname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lastname</em>' attribute.
	 * @see #setLastname(String)
	 * @see de.dc.javafx.emfsupport.website.model.ModelPackage#getAuthor_Lastname()
	 * @model unique="false"
	 * @generated
	 */
	String getLastname();

	/**
	 * Sets the value of the '{@link de.dc.javafx.emfsupport.website.model.Author#getLastname <em>Lastname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lastname</em>' attribute.
	 * @see #getLastname()
	 * @generated
	 */
	void setLastname(String value);

	/**
	 * Returns the value of the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Email</em>' attribute.
	 * @see #setEmail(String)
	 * @see de.dc.javafx.emfsupport.website.model.ModelPackage#getAuthor_Email()
	 * @model unique="false"
	 * @generated
	 */
	String getEmail();

	/**
	 * Sets the value of the '{@link de.dc.javafx.emfsupport.website.model.Author#getEmail <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Email</em>' attribute.
	 * @see #getEmail()
	 * @generated
	 */
	void setEmail(String value);

} // Author
