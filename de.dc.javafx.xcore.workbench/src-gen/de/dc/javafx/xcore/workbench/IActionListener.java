/**
 */
package de.dc.javafx.xcore.workbench;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IAction Listener</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dc.javafx.xcore.workbench.IActionListener#getOnAction <em>On Action</em>}</li>
 * </ul>
 *
 * @see de.dc.javafx.xcore.workbench.WorkbenchPackage#getIActionListener()
 * @model
 * @generated
 */
public interface IActionListener extends EObject {
	/**
	 * Returns the value of the '<em><b>On Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>On Action</em>' attribute.
	 * @see #setOnAction(String)
	 * @see de.dc.javafx.xcore.workbench.WorkbenchPackage#getIActionListener_OnAction()
	 * @model unique="false"
	 * @generated
	 */
	String getOnAction();

	/**
	 * Sets the value of the '{@link de.dc.javafx.xcore.workbench.IActionListener#getOnAction <em>On Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>On Action</em>' attribute.
	 * @see #getOnAction()
	 * @generated
	 */
	void setOnAction(String value);

} // IActionListener
