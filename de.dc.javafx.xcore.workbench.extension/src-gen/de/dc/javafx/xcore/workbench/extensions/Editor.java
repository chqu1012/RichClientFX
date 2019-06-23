/**
 */
package de.dc.javafx.xcore.workbench.extensions;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Editor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dc.javafx.xcore.workbench.extensions.Editor#getIcon <em>Icon</em>}</li>
 *   <li>{@link de.dc.javafx.xcore.workbench.extensions.Editor#getFileExtension <em>File Extension</em>}</li>
 * </ul>
 *
 * @see de.dc.javafx.xcore.workbench.extensions.ExtensionsPackage#getEditor()
 * @model
 * @generated
 */
public interface Editor extends Extension {
	/**
	 * Returns the value of the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Icon</em>' attribute.
	 * @see #setIcon(String)
	 * @see de.dc.javafx.xcore.workbench.extensions.ExtensionsPackage#getEditor_Icon()
	 * @model unique="false"
	 * @generated
	 */
	String getIcon();

	/**
	 * Sets the value of the '{@link de.dc.javafx.xcore.workbench.extensions.Editor#getIcon <em>Icon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Icon</em>' attribute.
	 * @see #getIcon()
	 * @generated
	 */
	void setIcon(String value);

	/**
	 * Returns the value of the '<em><b>File Extension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>File Extension</em>' attribute.
	 * @see #setFileExtension(String)
	 * @see de.dc.javafx.xcore.workbench.extensions.ExtensionsPackage#getEditor_FileExtension()
	 * @model unique="false"
	 * @generated
	 */
	String getFileExtension();

	/**
	 * Sets the value of the '{@link de.dc.javafx.xcore.workbench.extensions.Editor#getFileExtension <em>File Extension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File Extension</em>' attribute.
	 * @see #getFileExtension()
	 * @generated
	 */
	void setFileExtension(String value);

} // Editor
