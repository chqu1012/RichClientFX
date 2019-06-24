/**
 */
package de.dc.javafx.xcore.workbench.extensions;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Command</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dc.javafx.xcore.workbench.extensions.Command#getHandler <em>Handler</em>}</li>
 * </ul>
 *
 * @see de.dc.javafx.xcore.workbench.extensions.ExtensionsPackage#getCommand()
 * @model
 * @generated
 */
public interface Command extends Extension {
	/**
	 * Returns the value of the '<em><b>Handler</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Handler</em>' attribute.
	 * @see #setHandler(String)
	 * @see de.dc.javafx.xcore.workbench.extensions.ExtensionsPackage#getCommand_Handler()
	 * @model unique="false"
	 * @generated
	 */
	String getHandler();

	/**
	 * Sets the value of the '{@link de.dc.javafx.xcore.workbench.extensions.Command#getHandler <em>Handler</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Handler</em>' attribute.
	 * @see #getHandler()
	 * @generated
	 */
	void setHandler(String value);

} // Command
