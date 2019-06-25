/**
 */
package de.dc.javafx.xcore.resource;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Opened File</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dc.javafx.xcore.resource.OpenedFile#getPerspectiveId <em>Perspective Id</em>}</li>
 *   <li>{@link de.dc.javafx.xcore.resource.OpenedFile#getTimestamp <em>Timestamp</em>}</li>
 *   <li>{@link de.dc.javafx.xcore.resource.OpenedFile#getName <em>Name</em>}</li>
 *   <li>{@link de.dc.javafx.xcore.resource.OpenedFile#getPath <em>Path</em>}</li>
 * </ul>
 *
 * @see de.dc.javafx.xcore.resource.ResourcePackage#getOpenedFile()
 * @model
 * @generated
 */
public interface OpenedFile extends EObject {
	/**
	 * Returns the value of the '<em><b>Perspective Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Perspective Id</em>' attribute.
	 * @see #setPerspectiveId(String)
	 * @see de.dc.javafx.xcore.resource.ResourcePackage#getOpenedFile_PerspectiveId()
	 * @model unique="false"
	 * @generated
	 */
	String getPerspectiveId();

	/**
	 * Sets the value of the '{@link de.dc.javafx.xcore.resource.OpenedFile#getPerspectiveId <em>Perspective Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Perspective Id</em>' attribute.
	 * @see #getPerspectiveId()
	 * @generated
	 */
	void setPerspectiveId(String value);

	/**
	 * Returns the value of the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timestamp</em>' attribute.
	 * @see #setTimestamp(String)
	 * @see de.dc.javafx.xcore.resource.ResourcePackage#getOpenedFile_Timestamp()
	 * @model unique="false"
	 * @generated
	 */
	String getTimestamp();

	/**
	 * Sets the value of the '{@link de.dc.javafx.xcore.resource.OpenedFile#getTimestamp <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timestamp</em>' attribute.
	 * @see #getTimestamp()
	 * @generated
	 */
	void setTimestamp(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see de.dc.javafx.xcore.resource.ResourcePackage#getOpenedFile_Name()
	 * @model unique="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.dc.javafx.xcore.resource.OpenedFile#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path</em>' attribute.
	 * @see #setPath(String)
	 * @see de.dc.javafx.xcore.resource.ResourcePackage#getOpenedFile_Path()
	 * @model unique="false"
	 * @generated
	 */
	String getPath();

	/**
	 * Sets the value of the '{@link de.dc.javafx.xcore.resource.OpenedFile#getPath <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path</em>' attribute.
	 * @see #getPath()
	 * @generated
	 */
	void setPath(String value);

} // OpenedFile
