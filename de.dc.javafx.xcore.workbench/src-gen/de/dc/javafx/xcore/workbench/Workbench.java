/**
 */
package de.dc.javafx.xcore.workbench;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Workbench</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dc.javafx.xcore.workbench.Workbench#getToolbar <em>Toolbar</em>}</li>
 *   <li>{@link de.dc.javafx.xcore.workbench.Workbench#getStatusline <em>Statusline</em>}</li>
 *   <li>{@link de.dc.javafx.xcore.workbench.Workbench#getPerspectives <em>Perspectives</em>}</li>
 *   <li>{@link de.dc.javafx.xcore.workbench.Workbench#getCommands <em>Commands</em>}</li>
 *   <li>{@link de.dc.javafx.xcore.workbench.Workbench#getEditorRegistry <em>Editor Registry</em>}</li>
 *   <li>{@link de.dc.javafx.xcore.workbench.Workbench#getCommandRegistry <em>Command Registry</em>}</li>
 * </ul>
 *
 * @see de.dc.javafx.xcore.workbench.WorkbenchPackage#getWorkbench()
 * @model
 * @generated
 */
public interface Workbench extends EObject {
	/**
	 * Returns the value of the '<em><b>Toolbar</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Toolbar</em>' containment reference.
	 * @see #setToolbar(Toolbar)
	 * @see de.dc.javafx.xcore.workbench.WorkbenchPackage#getWorkbench_Toolbar()
	 * @model containment="true"
	 * @generated
	 */
	Toolbar getToolbar();

	/**
	 * Sets the value of the '{@link de.dc.javafx.xcore.workbench.Workbench#getToolbar <em>Toolbar</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Toolbar</em>' containment reference.
	 * @see #getToolbar()
	 * @generated
	 */
	void setToolbar(Toolbar value);

	/**
	 * Returns the value of the '<em><b>Statusline</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Statusline</em>' containment reference.
	 * @see #setStatusline(Statusline)
	 * @see de.dc.javafx.xcore.workbench.WorkbenchPackage#getWorkbench_Statusline()
	 * @model containment="true"
	 * @generated
	 */
	Statusline getStatusline();

	/**
	 * Sets the value of the '{@link de.dc.javafx.xcore.workbench.Workbench#getStatusline <em>Statusline</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Statusline</em>' containment reference.
	 * @see #getStatusline()
	 * @generated
	 */
	void setStatusline(Statusline value);

	/**
	 * Returns the value of the '<em><b>Perspectives</b></em>' containment reference list.
	 * The list contents are of type {@link de.dc.javafx.xcore.workbench.Perspective}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Perspectives</em>' containment reference list.
	 * @see de.dc.javafx.xcore.workbench.WorkbenchPackage#getWorkbench_Perspectives()
	 * @model containment="true"
	 * @generated
	 */
	EList<Perspective> getPerspectives();

	/**
	 * Returns the value of the '<em><b>Commands</b></em>' containment reference list.
	 * The list contents are of type {@link de.dc.javafx.xcore.workbench.Command}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Commands</em>' containment reference list.
	 * @see de.dc.javafx.xcore.workbench.WorkbenchPackage#getWorkbench_Commands()
	 * @model containment="true"
	 * @generated
	 */
	EList<Command> getCommands();

	/**
	 * Returns the value of the '<em><b>Editor Registry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Editor Registry</em>' containment reference.
	 * @see #setEditorRegistry(EditorRegistry)
	 * @see de.dc.javafx.xcore.workbench.WorkbenchPackage#getWorkbench_EditorRegistry()
	 * @model containment="true"
	 * @generated
	 */
	EditorRegistry getEditorRegistry();

	/**
	 * Sets the value of the '{@link de.dc.javafx.xcore.workbench.Workbench#getEditorRegistry <em>Editor Registry</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Editor Registry</em>' containment reference.
	 * @see #getEditorRegistry()
	 * @generated
	 */
	void setEditorRegistry(EditorRegistry value);

	/**
	 * Returns the value of the '<em><b>Command Registry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Command Registry</em>' containment reference.
	 * @see #setCommandRegistry(CommandRegistry)
	 * @see de.dc.javafx.xcore.workbench.WorkbenchPackage#getWorkbench_CommandRegistry()
	 * @model containment="true"
	 * @generated
	 */
	CommandRegistry getCommandRegistry();

	/**
	 * Sets the value of the '{@link de.dc.javafx.xcore.workbench.Workbench#getCommandRegistry <em>Command Registry</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Command Registry</em>' containment reference.
	 * @see #getCommandRegistry()
	 * @generated
	 */
	void setCommandRegistry(CommandRegistry value);

} // Workbench
