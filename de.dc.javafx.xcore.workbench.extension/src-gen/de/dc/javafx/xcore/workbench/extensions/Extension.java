/**
 */
package de.dc.javafx.xcore.workbench.extensions;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Extension</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dc.javafx.xcore.workbench.extensions.Extension#getId <em>Id</em>}</li>
 *   <li>{@link de.dc.javafx.xcore.workbench.extensions.Extension#getName <em>Name</em>}</li>
 *   <li>{@link de.dc.javafx.xcore.workbench.extensions.Extension#getExtensionUri <em>Extension Uri</em>}</li>
 * </ul>
 *
 * @see de.dc.javafx.xcore.workbench.extensions.ExtensionsPackage#getExtension()
 * @model abstract="true"
 * @generated
 */
public interface Extension extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see de.dc.javafx.xcore.workbench.extensions.ExtensionsPackage#getExtension_Id()
	 * @model unique="false"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link de.dc.javafx.xcore.workbench.extensions.Extension#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see de.dc.javafx.xcore.workbench.extensions.ExtensionsPackage#getExtension_Name()
	 * @model unique="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.dc.javafx.xcore.workbench.extensions.Extension#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Extension Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extension Uri</em>' attribute.
	 * @see #setExtensionUri(String)
	 * @see de.dc.javafx.xcore.workbench.extensions.ExtensionsPackage#getExtension_ExtensionUri()
	 * @model unique="false"
	 * @generated
	 */
	String getExtensionUri();

	/**
	 * Sets the value of the '{@link de.dc.javafx.xcore.workbench.extensions.Extension#getExtensionUri <em>Extension Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extension Uri</em>' attribute.
	 * @see #getExtensionUri()
	 * @generated
	 */
	void setExtensionUri(String value);

} // Extension
