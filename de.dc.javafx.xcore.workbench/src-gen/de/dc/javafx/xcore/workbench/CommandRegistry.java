/**
 */
package de.dc.javafx.xcore.workbench;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Command Registry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dc.javafx.xcore.workbench.CommandRegistry#getUsedCommands <em>Used Commands</em>}</li>
 * </ul>
 *
 * @see de.dc.javafx.xcore.workbench.WorkbenchPackage#getCommandRegistry()
 * @model
 * @generated
 */
public interface CommandRegistry extends EObject {
	/**
	 * Returns the value of the '<em><b>Used Commands</b></em>' reference list.
	 * The list contents are of type {@link de.dc.javafx.xcore.workbench.Command}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Used Commands</em>' reference list.
	 * @see de.dc.javafx.xcore.workbench.WorkbenchPackage#getCommandRegistry_UsedCommands()
	 * @model
	 * @generated
	 */
	EList<Command> getUsedCommands();

} // CommandRegistry
