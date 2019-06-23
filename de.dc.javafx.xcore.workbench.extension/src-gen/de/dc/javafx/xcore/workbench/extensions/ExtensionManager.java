/**
 */
package de.dc.javafx.xcore.workbench.extensions;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Extension Manager</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dc.javafx.xcore.workbench.extensions.ExtensionManager#getExtensionPoints <em>Extension Points</em>}</li>
 * </ul>
 *
 * @see de.dc.javafx.xcore.workbench.extensions.ExtensionsPackage#getExtensionManager()
 * @model
 * @generated
 */
public interface ExtensionManager extends EObject {
	/**
	 * Returns the value of the '<em><b>Extension Points</b></em>' containment reference list.
	 * The list contents are of type {@link de.dc.javafx.xcore.workbench.extensions.ExtensionPoint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extension Points</em>' containment reference list.
	 * @see de.dc.javafx.xcore.workbench.extensions.ExtensionsPackage#getExtensionManager_ExtensionPoints()
	 * @model containment="true"
	 * @generated
	 */
	EList<ExtensionPoint> getExtensionPoints();

} // ExtensionManager
