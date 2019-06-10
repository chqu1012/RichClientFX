/**
 */
package de.dc.javafx.xcore.workbench.command;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Emf Command History</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dc.javafx.xcore.workbench.command.EmfCommandHistory#getCommands <em>Commands</em>}</li>
 * </ul>
 *
 * @see de.dc.javafx.xcore.workbench.command.CommandPackage#getEmfCommandHistory()
 * @model
 * @generated
 */
public interface EmfCommandHistory extends EObject {
	/**
	 * Returns the value of the '<em><b>Commands</b></em>' containment reference list.
	 * The list contents are of type {@link de.dc.javafx.xcore.workbench.command.EmfCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Commands</em>' containment reference list.
	 * @see de.dc.javafx.xcore.workbench.command.CommandPackage#getEmfCommandHistory_Commands()
	 * @model containment="true"
	 * @generated
	 */
	EList<EmfCommand> getCommands();

} // EmfCommandHistory
