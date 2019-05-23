/**
 */
package de.dc.javafx.xcore.resource;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dc.javafx.xcore.resource.Resource#getName <em>Name</em>}</li>
 *   <li>{@link de.dc.javafx.xcore.resource.Resource#getExt <em>Ext</em>}</li>
 *   <li>{@link de.dc.javafx.xcore.resource.Resource#isIsDirectory <em>Is Directory</em>}</li>
 * </ul>
 *
 * @see de.dc.javafx.xcore.resource.ResourcePackage#getResource()
 * @model abstract="true"
 * @generated
 */
public interface Resource extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see de.dc.javafx.xcore.resource.ResourcePackage#getResource_Name()
	 * @model unique="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.dc.javafx.xcore.resource.Resource#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Ext</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ext</em>' attribute.
	 * @see #setExt(String)
	 * @see de.dc.javafx.xcore.resource.ResourcePackage#getResource_Ext()
	 * @model unique="false"
	 * @generated
	 */
	String getExt();

	/**
	 * Sets the value of the '{@link de.dc.javafx.xcore.resource.Resource#getExt <em>Ext</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ext</em>' attribute.
	 * @see #getExt()
	 * @generated
	 */
	void setExt(String value);

	/**
	 * Returns the value of the '<em><b>Is Directory</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Directory</em>' attribute.
	 * @see #setIsDirectory(boolean)
	 * @see de.dc.javafx.xcore.resource.ResourcePackage#getResource_IsDirectory()
	 * @model default="false" unique="false"
	 * @generated
	 */
	boolean isIsDirectory();

	/**
	 * Sets the value of the '{@link de.dc.javafx.xcore.resource.Resource#isIsDirectory <em>Is Directory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Directory</em>' attribute.
	 * @see #isIsDirectory()
	 * @generated
	 */
	void setIsDirectory(boolean value);

} // Resource
