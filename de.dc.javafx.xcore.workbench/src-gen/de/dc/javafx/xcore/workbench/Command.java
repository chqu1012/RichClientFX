/**
 */
package de.dc.javafx.xcore.workbench;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Command</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dc.javafx.xcore.workbench.Command#getCommandClass <em>Command Class</em>}</li>
 * </ul>
 *
 * @see de.dc.javafx.xcore.workbench.WorkbenchPackage#getCommand()
 * @model
 * @generated
 */
public interface Command extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Command Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Command Class</em>' attribute.
	 * @see #setCommandClass(String)
	 * @see de.dc.javafx.xcore.workbench.WorkbenchPackage#getCommand_CommandClass()
	 * @model unique="false"
	 * @generated
	 */
	String getCommandClass();

	/**
	 * Sets the value of the '{@link de.dc.javafx.xcore.workbench.Command#getCommandClass <em>Command Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Command Class</em>' attribute.
	 * @see #getCommandClass()
	 * @generated
	 */
	void setCommandClass(String value);

} // Command
