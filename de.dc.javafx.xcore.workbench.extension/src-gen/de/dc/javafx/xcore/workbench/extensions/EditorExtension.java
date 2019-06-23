/**
 */
package de.dc.javafx.xcore.workbench.extensions;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Editor Extension</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dc.javafx.xcore.workbench.extensions.EditorExtension#getEditors <em>Editors</em>}</li>
 * </ul>
 *
 * @see de.dc.javafx.xcore.workbench.extensions.ExtensionsPackage#getEditorExtension()
 * @model
 * @generated
 */
public interface EditorExtension extends ExtensionPoint {
	/**
	 * Returns the value of the '<em><b>Editors</b></em>' containment reference list.
	 * The list contents are of type {@link de.dc.javafx.xcore.workbench.extensions.Editor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Editors</em>' containment reference list.
	 * @see de.dc.javafx.xcore.workbench.extensions.ExtensionsPackage#getEditorExtension_Editors()
	 * @model containment="true"
	 * @generated
	 */
	EList<Editor> getEditors();

} // EditorExtension
