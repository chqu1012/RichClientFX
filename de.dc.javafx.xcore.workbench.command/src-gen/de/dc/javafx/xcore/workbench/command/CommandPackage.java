/**
 */
package de.dc.javafx.xcore.workbench.command;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.dc.javafx.xcore.workbench.command.CommandFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel multipleEditorPages='false' creationIcons='false' editDirectory='/de.dc.javafx.xcore.workbench.command.edit/src-gen' editorDirectory='/de.dc.javafx.xcore.workbench.command.editor/src-gen' richClientPlatform='true' codeFormatting='true' importerID='org.eclipse.emf.importer.ecore' runtimePlatform='RCP' fileExtensions='command' basePackage='de.dc.javafx.xcore.workbench'"
 * @generated
 */
public interface CommandPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "command";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.frateranatis.org/workbench/commands";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "command";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CommandPackage eINSTANCE = de.dc.javafx.xcore.workbench.command.impl.CommandPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.dc.javafx.xcore.workbench.command.impl.EmfCommandHistoryImpl <em>Emf Command History</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.javafx.xcore.workbench.command.impl.EmfCommandHistoryImpl
	 * @see de.dc.javafx.xcore.workbench.command.impl.CommandPackageImpl#getEmfCommandHistory()
	 * @generated
	 */
	int EMF_COMMAND_HISTORY = 0;

	/**
	 * The feature id for the '<em><b>Commands</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_COMMAND_HISTORY__COMMANDS = 0;

	/**
	 * The number of structural features of the '<em>Emf Command History</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_COMMAND_HISTORY_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Emf Command History</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_COMMAND_HISTORY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dc.javafx.xcore.workbench.command.impl.EmfCommandImpl <em>Emf Command</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.javafx.xcore.workbench.command.impl.EmfCommandImpl
	 * @see de.dc.javafx.xcore.workbench.command.impl.CommandPackageImpl#getEmfCommand()
	 * @generated
	 */
	int EMF_COMMAND = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_COMMAND__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_COMMAND__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_COMMAND__TIMESTAMP = 2;

	/**
	 * The feature id for the '<em><b>Command</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_COMMAND__COMMAND = 3;

	/**
	 * The feature id for the '<em><b>Results</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_COMMAND__RESULTS = 4;

	/**
	 * The number of structural features of the '<em>Emf Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_COMMAND_FEATURE_COUNT = 5;

	/**
	 * The operation id for the '<em>Can Undo</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_COMMAND___CAN_UNDO = 0;

	/**
	 * The operation id for the '<em>Undo</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_COMMAND___UNDO = 1;

	/**
	 * The operation id for the '<em>Redo</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_COMMAND___REDO = 2;

	/**
	 * The operation id for the '<em>Get Message</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_COMMAND___GET_MESSAGE = 3;

	/**
	 * The number of operations of the '<em>Emf Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_COMMAND_OPERATION_COUNT = 4;

	/**
	 * The meta object id for the '{@link de.dc.javafx.xcore.workbench.command.impl.EmfResultImpl <em>Emf Result</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.javafx.xcore.workbench.command.impl.EmfResultImpl
	 * @see de.dc.javafx.xcore.workbench.command.impl.CommandPackageImpl#getEmfResult()
	 * @generated
	 */
	int EMF_RESULT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_RESULT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_RESULT__OBJECT = 1;

	/**
	 * The number of structural features of the '<em>Emf Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_RESULT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Emf Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_RESULT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '<em>Timestamp</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.time.LocalDateTime
	 * @see de.dc.javafx.xcore.workbench.command.impl.CommandPackageImpl#getTimestamp()
	 * @generated
	 */
	int TIMESTAMP = 3;

	/**
	 * The meta object id for the '<em>Command</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.command.Command
	 * @see de.dc.javafx.xcore.workbench.command.impl.CommandPackageImpl#getCommand()
	 * @generated
	 */
	int COMMAND = 4;

	/**
	 * Returns the meta object for class '{@link de.dc.javafx.xcore.workbench.command.EmfCommandHistory <em>Emf Command History</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Emf Command History</em>'.
	 * @see de.dc.javafx.xcore.workbench.command.EmfCommandHistory
	 * @generated
	 */
	EClass getEmfCommandHistory();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dc.javafx.xcore.workbench.command.EmfCommandHistory#getCommands <em>Commands</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Commands</em>'.
	 * @see de.dc.javafx.xcore.workbench.command.EmfCommandHistory#getCommands()
	 * @see #getEmfCommandHistory()
	 * @generated
	 */
	EReference getEmfCommandHistory_Commands();

	/**
	 * Returns the meta object for class '{@link de.dc.javafx.xcore.workbench.command.EmfCommand <em>Emf Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Emf Command</em>'.
	 * @see de.dc.javafx.xcore.workbench.command.EmfCommand
	 * @generated
	 */
	EClass getEmfCommand();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.javafx.xcore.workbench.command.EmfCommand#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.dc.javafx.xcore.workbench.command.EmfCommand#getName()
	 * @see #getEmfCommand()
	 * @generated
	 */
	EAttribute getEmfCommand_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.javafx.xcore.workbench.command.EmfCommand#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see de.dc.javafx.xcore.workbench.command.EmfCommand#getDescription()
	 * @see #getEmfCommand()
	 * @generated
	 */
	EAttribute getEmfCommand_Description();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.javafx.xcore.workbench.command.EmfCommand#getTimestamp <em>Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timestamp</em>'.
	 * @see de.dc.javafx.xcore.workbench.command.EmfCommand#getTimestamp()
	 * @see #getEmfCommand()
	 * @generated
	 */
	EAttribute getEmfCommand_Timestamp();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.javafx.xcore.workbench.command.EmfCommand#getCommand <em>Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Command</em>'.
	 * @see de.dc.javafx.xcore.workbench.command.EmfCommand#getCommand()
	 * @see #getEmfCommand()
	 * @generated
	 */
	EAttribute getEmfCommand_Command();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dc.javafx.xcore.workbench.command.EmfCommand#getResults <em>Results</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Results</em>'.
	 * @see de.dc.javafx.xcore.workbench.command.EmfCommand#getResults()
	 * @see #getEmfCommand()
	 * @generated
	 */
	EReference getEmfCommand_Results();

	/**
	 * Returns the meta object for the '{@link de.dc.javafx.xcore.workbench.command.EmfCommand#canUndo() <em>Can Undo</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Can Undo</em>' operation.
	 * @see de.dc.javafx.xcore.workbench.command.EmfCommand#canUndo()
	 * @generated
	 */
	EOperation getEmfCommand__CanUndo();

	/**
	 * Returns the meta object for the '{@link de.dc.javafx.xcore.workbench.command.EmfCommand#undo() <em>Undo</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Undo</em>' operation.
	 * @see de.dc.javafx.xcore.workbench.command.EmfCommand#undo()
	 * @generated
	 */
	EOperation getEmfCommand__Undo();

	/**
	 * Returns the meta object for the '{@link de.dc.javafx.xcore.workbench.command.EmfCommand#redo() <em>Redo</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Redo</em>' operation.
	 * @see de.dc.javafx.xcore.workbench.command.EmfCommand#redo()
	 * @generated
	 */
	EOperation getEmfCommand__Redo();

	/**
	 * Returns the meta object for the '{@link de.dc.javafx.xcore.workbench.command.EmfCommand#getMessage() <em>Get Message</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Message</em>' operation.
	 * @see de.dc.javafx.xcore.workbench.command.EmfCommand#getMessage()
	 * @generated
	 */
	EOperation getEmfCommand__GetMessage();

	/**
	 * Returns the meta object for class '{@link de.dc.javafx.xcore.workbench.command.EmfResult <em>Emf Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Emf Result</em>'.
	 * @see de.dc.javafx.xcore.workbench.command.EmfResult
	 * @generated
	 */
	EClass getEmfResult();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.javafx.xcore.workbench.command.EmfResult#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.dc.javafx.xcore.workbench.command.EmfResult#getName()
	 * @see #getEmfResult()
	 * @generated
	 */
	EAttribute getEmfResult_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.javafx.xcore.workbench.command.EmfResult#getObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Object</em>'.
	 * @see de.dc.javafx.xcore.workbench.command.EmfResult#getObject()
	 * @see #getEmfResult()
	 * @generated
	 */
	EAttribute getEmfResult_Object();

	/**
	 * Returns the meta object for data type '{@link java.time.LocalDateTime <em>Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Timestamp</em>'.
	 * @see java.time.LocalDateTime
	 * @model instanceClass="java.time.LocalDateTime"
	 * @generated
	 */
	EDataType getTimestamp();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.emf.common.command.Command <em>Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Command</em>'.
	 * @see org.eclipse.emf.common.command.Command
	 * @model instanceClass="org.eclipse.emf.common.command.Command"
	 * @generated
	 */
	EDataType getCommand();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CommandFactory getCommandFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link de.dc.javafx.xcore.workbench.command.impl.EmfCommandHistoryImpl <em>Emf Command History</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.javafx.xcore.workbench.command.impl.EmfCommandHistoryImpl
		 * @see de.dc.javafx.xcore.workbench.command.impl.CommandPackageImpl#getEmfCommandHistory()
		 * @generated
		 */
		EClass EMF_COMMAND_HISTORY = eINSTANCE.getEmfCommandHistory();

		/**
		 * The meta object literal for the '<em><b>Commands</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMF_COMMAND_HISTORY__COMMANDS = eINSTANCE.getEmfCommandHistory_Commands();

		/**
		 * The meta object literal for the '{@link de.dc.javafx.xcore.workbench.command.impl.EmfCommandImpl <em>Emf Command</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.javafx.xcore.workbench.command.impl.EmfCommandImpl
		 * @see de.dc.javafx.xcore.workbench.command.impl.CommandPackageImpl#getEmfCommand()
		 * @generated
		 */
		EClass EMF_COMMAND = eINSTANCE.getEmfCommand();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMF_COMMAND__NAME = eINSTANCE.getEmfCommand_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMF_COMMAND__DESCRIPTION = eINSTANCE.getEmfCommand_Description();

		/**
		 * The meta object literal for the '<em><b>Timestamp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMF_COMMAND__TIMESTAMP = eINSTANCE.getEmfCommand_Timestamp();

		/**
		 * The meta object literal for the '<em><b>Command</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMF_COMMAND__COMMAND = eINSTANCE.getEmfCommand_Command();

		/**
		 * The meta object literal for the '<em><b>Results</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMF_COMMAND__RESULTS = eINSTANCE.getEmfCommand_Results();

		/**
		 * The meta object literal for the '<em><b>Can Undo</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EMF_COMMAND___CAN_UNDO = eINSTANCE.getEmfCommand__CanUndo();

		/**
		 * The meta object literal for the '<em><b>Undo</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EMF_COMMAND___UNDO = eINSTANCE.getEmfCommand__Undo();

		/**
		 * The meta object literal for the '<em><b>Redo</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EMF_COMMAND___REDO = eINSTANCE.getEmfCommand__Redo();

		/**
		 * The meta object literal for the '<em><b>Get Message</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EMF_COMMAND___GET_MESSAGE = eINSTANCE.getEmfCommand__GetMessage();

		/**
		 * The meta object literal for the '{@link de.dc.javafx.xcore.workbench.command.impl.EmfResultImpl <em>Emf Result</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.javafx.xcore.workbench.command.impl.EmfResultImpl
		 * @see de.dc.javafx.xcore.workbench.command.impl.CommandPackageImpl#getEmfResult()
		 * @generated
		 */
		EClass EMF_RESULT = eINSTANCE.getEmfResult();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMF_RESULT__NAME = eINSTANCE.getEmfResult_Name();

		/**
		 * The meta object literal for the '<em><b>Object</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMF_RESULT__OBJECT = eINSTANCE.getEmfResult_Object();

		/**
		 * The meta object literal for the '<em>Timestamp</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.time.LocalDateTime
		 * @see de.dc.javafx.xcore.workbench.command.impl.CommandPackageImpl#getTimestamp()
		 * @generated
		 */
		EDataType TIMESTAMP = eINSTANCE.getTimestamp();

		/**
		 * The meta object literal for the '<em>Command</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.common.command.Command
		 * @see de.dc.javafx.xcore.workbench.command.impl.CommandPackageImpl#getCommand()
		 * @generated
		 */
		EDataType COMMAND = eINSTANCE.getCommand();

	}

} //CommandPackage
