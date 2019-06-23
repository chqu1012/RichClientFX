/**
 */
package de.dc.javafx.xcore.workbench.extensions;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>View Extension</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dc.javafx.xcore.workbench.extensions.ViewExtension#getViews <em>Views</em>}</li>
 * </ul>
 *
 * @see de.dc.javafx.xcore.workbench.extensions.ExtensionsPackage#getViewExtension()
 * @model
 * @generated
 */
public interface ViewExtension extends ExtensionPoint {
	/**
	 * Returns the value of the '<em><b>Views</b></em>' containment reference list.
	 * The list contents are of type {@link de.dc.javafx.xcore.workbench.extensions.View}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Views</em>' containment reference list.
	 * @see de.dc.javafx.xcore.workbench.extensions.ExtensionsPackage#getViewExtension_Views()
	 * @model containment="true"
	 * @generated
	 */
	EList<View> getViews();

} // ViewExtension
