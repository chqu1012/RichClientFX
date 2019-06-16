/**
 */
package de.dc.javafx.xcore.workbench;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Editor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dc.javafx.xcore.workbench.Editor#getName <em>Name</em>}</li>
 *   <li>{@link de.dc.javafx.xcore.workbench.Editor#getFileExtension <em>File Extension</em>}</li>
 *   <li>{@link de.dc.javafx.xcore.workbench.Editor#getEditorUri <em>Editor Uri</em>}</li>
 * </ul>
 *
 * @see de.dc.javafx.xcore.workbench.WorkbenchPackage#getEditor()
 * @model
 * @generated
 */
public interface Editor extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see de.dc.javafx.xcore.workbench.WorkbenchPackage#getEditor_Name()
	 * @model unique="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.dc.javafx.xcore.workbench.Editor#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>File Extension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>File Extension</em>' attribute.
	 * @see #setFileExtension(String)
	 * @see de.dc.javafx.xcore.workbench.WorkbenchPackage#getEditor_FileExtension()
	 * @model unique="false"
	 * @generated
	 */
	String getFileExtension();

	/**
	 * Sets the value of the '{@link de.dc.javafx.xcore.workbench.Editor#getFileExtension <em>File Extension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File Extension</em>' attribute.
	 * @see #getFileExtension()
	 * @generated
	 */
	void setFileExtension(String value);

	/**
	 * Returns the value of the '<em><b>Editor Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Editor Uri</em>' attribute.
	 * @see #setEditorUri(String)
	 * @see de.dc.javafx.xcore.workbench.WorkbenchPackage#getEditor_EditorUri()
	 * @model unique="false"
	 * @generated
	 */
	String getEditorUri();

	/**
	 * Sets the value of the '{@link de.dc.javafx.xcore.workbench.Editor#getEditorUri <em>Editor Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Editor Uri</em>' attribute.
	 * @see #getEditorUri()
	 * @generated
	 */
	void setEditorUri(String value);

} // Editor
