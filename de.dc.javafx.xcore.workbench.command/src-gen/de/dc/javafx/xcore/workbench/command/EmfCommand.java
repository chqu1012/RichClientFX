/**
 */
package de.dc.javafx.xcore.workbench.command;

import java.time.LocalDateTime;

import org.eclipse.emf.common.command.Command;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Emf Command</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dc.javafx.xcore.workbench.command.EmfCommand#getName <em>Name</em>}</li>
 *   <li>{@link de.dc.javafx.xcore.workbench.command.EmfCommand#getDescription <em>Description</em>}</li>
 *   <li>{@link de.dc.javafx.xcore.workbench.command.EmfCommand#getTimestamp <em>Timestamp</em>}</li>
 *   <li>{@link de.dc.javafx.xcore.workbench.command.EmfCommand#getCommand <em>Command</em>}</li>
 *   <li>{@link de.dc.javafx.xcore.workbench.command.EmfCommand#getResults <em>Results</em>}</li>
 * </ul>
 *
 * @see de.dc.javafx.xcore.workbench.command.CommandPackage#getEmfCommand()
 * @model
 * @generated
 */
public interface EmfCommand extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see de.dc.javafx.xcore.workbench.command.CommandPackage#getEmfCommand_Name()
	 * @model unique="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.dc.javafx.xcore.workbench.command.EmfCommand#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see de.dc.javafx.xcore.workbench.command.CommandPackage#getEmfCommand_Description()
	 * @model unique="false"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link de.dc.javafx.xcore.workbench.command.EmfCommand#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timestamp</em>' attribute.
	 * @see #setTimestamp(LocalDateTime)
	 * @see de.dc.javafx.xcore.workbench.command.CommandPackage#getEmfCommand_Timestamp()
	 * @model unique="false" dataType="de.dc.javafx.xcore.workbench.command.Timestamp"
	 * @generated
	 */
	LocalDateTime getTimestamp();

	/**
	 * Sets the value of the '{@link de.dc.javafx.xcore.workbench.command.EmfCommand#getTimestamp <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timestamp</em>' attribute.
	 * @see #getTimestamp()
	 * @generated
	 */
	void setTimestamp(LocalDateTime value);

	/**
	 * Returns the value of the '<em><b>Command</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Command</em>' attribute.
	 * @see #setCommand(Command)
	 * @see de.dc.javafx.xcore.workbench.command.CommandPackage#getEmfCommand_Command()
	 * @model unique="false" dataType="de.dc.javafx.xcore.workbench.command.Command"
	 * @generated
	 */
	Command getCommand();

	/**
	 * Sets the value of the '{@link de.dc.javafx.xcore.workbench.command.EmfCommand#getCommand <em>Command</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Command</em>' attribute.
	 * @see #getCommand()
	 * @generated
	 */
	void setCommand(Command value);

	/**
	 * Returns the value of the '<em><b>Results</b></em>' containment reference list.
	 * The list contents are of type {@link de.dc.javafx.xcore.workbench.command.EmfResult}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Results</em>' containment reference list.
	 * @see de.dc.javafx.xcore.workbench.command.CommandPackage#getEmfCommand_Results()
	 * @model containment="true"
	 * @generated
	 */
	EList<EmfResult> getResults();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false"
	 * @generated
	 */
	boolean canUndo();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void undo();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void redo();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 * @generated
	 */
	String getMessage();

} // EmfCommand
