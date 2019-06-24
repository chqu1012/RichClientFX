/**
 */
package de.dc.javafx.xcore.workbench.extensions;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Command Extension</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dc.javafx.xcore.workbench.extensions.CommandExtension#getCommands <em>Commands</em>}</li>
 * </ul>
 *
 * @see de.dc.javafx.xcore.workbench.extensions.ExtensionsPackage#getCommandExtension()
 * @model
 * @generated
 */
public interface CommandExtension extends ExtensionPoint {
	/**
	 * Returns the value of the '<em><b>Commands</b></em>' containment reference list.
	 * The list contents are of type {@link de.dc.javafx.xcore.workbench.extensions.Command}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Commands</em>' containment reference list.
	 * @see de.dc.javafx.xcore.workbench.extensions.ExtensionsPackage#getCommandExtension_Commands()
	 * @model containment="true"
	 * @generated
	 */
	EList<Command> getCommands();

} // CommandExtension
