/**
 */
package de.dc.javafx.xcore.workbench;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>View Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dc.javafx.xcore.workbench.ViewContainer#getViews <em>Views</em>}</li>
 * </ul>
 *
 * @see de.dc.javafx.xcore.workbench.WorkbenchPackage#getViewContainer()
 * @model abstract="true"
 * @generated
 */
public interface ViewContainer extends EObject {
	/**
	 * Returns the value of the '<em><b>Views</b></em>' containment reference list.
	 * The list contents are of type {@link de.dc.javafx.xcore.workbench.View}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Views</em>' containment reference list.
	 * @see de.dc.javafx.xcore.workbench.WorkbenchPackage#getViewContainer_Views()
	 * @model containment="true"
	 * @generated
	 */
	EList<View> getViews();

} // ViewContainer
