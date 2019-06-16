/**
 */
package de.dc.javafx.xcore.workbench;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Editor Registry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dc.javafx.xcore.workbench.EditorRegistry#getEditor <em>Editor</em>}</li>
 * </ul>
 *
 * @see de.dc.javafx.xcore.workbench.WorkbenchPackage#getEditorRegistry()
 * @model
 * @generated
 */
public interface EditorRegistry extends EObject {
	/**
	 * Returns the value of the '<em><b>Editor</b></em>' containment reference list.
	 * The list contents are of type {@link de.dc.javafx.xcore.workbench.Editor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Editor</em>' containment reference list.
	 * @see de.dc.javafx.xcore.workbench.WorkbenchPackage#getEditorRegistry_Editor()
	 * @model containment="true"
	 * @generated
	 */
	EList<Editor> getEditor();

} // EditorRegistry
