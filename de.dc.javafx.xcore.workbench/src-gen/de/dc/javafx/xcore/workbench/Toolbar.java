/**
 */
package de.dc.javafx.xcore.workbench;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Toolbar</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dc.javafx.xcore.workbench.Toolbar#getItems <em>Items</em>}</li>
 * </ul>
 *
 * @see de.dc.javafx.xcore.workbench.WorkbenchPackage#getToolbar()
 * @model
 * @generated
 */
public interface Toolbar extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Items</b></em>' containment reference list.
	 * The list contents are of type {@link de.dc.javafx.xcore.workbench.ToolbarItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Items</em>' containment reference list.
	 * @see de.dc.javafx.xcore.workbench.WorkbenchPackage#getToolbar_Items()
	 * @model containment="true"
	 * @generated
	 */
	EList<ToolbarItem> getItems();

} // Toolbar
