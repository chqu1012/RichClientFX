/**
 */
package de.dc.javafx.xcore.workbench;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Toolbar Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dc.javafx.xcore.workbench.ToolbarItem#getIcon <em>Icon</em>}</li>
 *   <li>{@link de.dc.javafx.xcore.workbench.ToolbarItem#getCommand <em>Command</em>}</li>
 * </ul>
 *
 * @see de.dc.javafx.xcore.workbench.WorkbenchPackage#getToolbarItem()
 * @model
 * @generated
 */
public interface ToolbarItem extends NamedElement, IActionListener {
	/**
	 * Returns the value of the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Icon</em>' attribute.
	 * @see #setIcon(String)
	 * @see de.dc.javafx.xcore.workbench.WorkbenchPackage#getToolbarItem_Icon()
	 * @model unique="false"
	 * @generated
	 */
	String getIcon();

	/**
	 * Sets the value of the '{@link de.dc.javafx.xcore.workbench.ToolbarItem#getIcon <em>Icon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Icon</em>' attribute.
	 * @see #getIcon()
	 * @generated
	 */
	void setIcon(String value);

	/**
	 * Returns the value of the '<em><b>Command</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Command</em>' reference.
	 * @see #setCommand(Command)
	 * @see de.dc.javafx.xcore.workbench.WorkbenchPackage#getToolbarItem_Command()
	 * @model
	 * @generated
	 */
	Command getCommand();

	/**
	 * Sets the value of the '{@link de.dc.javafx.xcore.workbench.ToolbarItem#getCommand <em>Command</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Command</em>' reference.
	 * @see #getCommand()
	 * @generated
	 */
	void setCommand(Command value);

} // ToolbarItem
