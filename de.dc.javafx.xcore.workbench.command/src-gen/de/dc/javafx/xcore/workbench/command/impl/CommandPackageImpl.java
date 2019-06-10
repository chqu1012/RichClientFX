/**
 */
package de.dc.javafx.xcore.workbench.command.impl;

import de.dc.javafx.xcore.workbench.command.CommandFactory;
import de.dc.javafx.xcore.workbench.command.CommandPackage;
import de.dc.javafx.xcore.workbench.command.EmfCommand;
import de.dc.javafx.xcore.workbench.command.EmfCommandHistory;

import java.time.LocalDateTime;

import org.eclipse.emf.common.command.Command;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CommandPackageImpl extends EPackageImpl implements CommandPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass emfCommandHistoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass emfCommandEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType timestampEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType commandEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see de.dc.javafx.xcore.workbench.command.CommandPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CommandPackageImpl() {
		super(eNS_URI, CommandFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link CommandPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CommandPackage init() {
		if (isInited)
			return (CommandPackage) EPackage.Registry.INSTANCE.getEPackage(CommandPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredCommandPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		CommandPackageImpl theCommandPackage = registeredCommandPackage instanceof CommandPackageImpl
				? (CommandPackageImpl) registeredCommandPackage
				: new CommandPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theCommandPackage.createPackageContents();

		// Initialize created meta-data
		theCommandPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCommandPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CommandPackage.eNS_URI, theCommandPackage);
		return theCommandPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEmfCommandHistory() {
		return emfCommandHistoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEmfCommandHistory_Commands() {
		return (EReference) emfCommandHistoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEmfCommand() {
		return emfCommandEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEmfCommand_Name() {
		return (EAttribute) emfCommandEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEmfCommand_Description() {
		return (EAttribute) emfCommandEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEmfCommand_Timestamp() {
		return (EAttribute) emfCommandEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEmfCommand_Command() {
		return (EAttribute) emfCommandEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEmfCommand__CanUndo() {
		return emfCommandEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEmfCommand__Undo() {
		return emfCommandEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEmfCommand__Redo() {
		return emfCommandEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEmfCommand__GetMessage() {
		return emfCommandEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getTimestamp() {
		return timestampEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getCommand() {
		return commandEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CommandFactory getCommandFactory() {
		return (CommandFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		emfCommandHistoryEClass = createEClass(EMF_COMMAND_HISTORY);
		createEReference(emfCommandHistoryEClass, EMF_COMMAND_HISTORY__COMMANDS);

		emfCommandEClass = createEClass(EMF_COMMAND);
		createEAttribute(emfCommandEClass, EMF_COMMAND__NAME);
		createEAttribute(emfCommandEClass, EMF_COMMAND__DESCRIPTION);
		createEAttribute(emfCommandEClass, EMF_COMMAND__TIMESTAMP);
		createEAttribute(emfCommandEClass, EMF_COMMAND__COMMAND);
		createEOperation(emfCommandEClass, EMF_COMMAND___CAN_UNDO);
		createEOperation(emfCommandEClass, EMF_COMMAND___UNDO);
		createEOperation(emfCommandEClass, EMF_COMMAND___REDO);
		createEOperation(emfCommandEClass, EMF_COMMAND___GET_MESSAGE);

		// Create data types
		timestampEDataType = createEDataType(TIMESTAMP);
		commandEDataType = createEDataType(COMMAND);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		EcorePackage theEcorePackage = (EcorePackage) EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(emfCommandHistoryEClass, EmfCommandHistory.class, "EmfCommandHistory", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEmfCommandHistory_Commands(), this.getEmfCommand(), null, "commands", null, 0, -1,
				EmfCommandHistory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(emfCommandEClass, EmfCommand.class, "EmfCommand", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEmfCommand_Name(), theEcorePackage.getEString(), "name", null, 0, 1, EmfCommand.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getEmfCommand_Description(), theEcorePackage.getEString(), "description", null, 0, 1,
				EmfCommand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getEmfCommand_Timestamp(), this.getTimestamp(), "timestamp", null, 0, 1, EmfCommand.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getEmfCommand_Command(), this.getCommand(), "command", null, 0, 1, EmfCommand.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEOperation(getEmfCommand__CanUndo(), theEcorePackage.getEBoolean(), "canUndo", 0, 1, !IS_UNIQUE,
				IS_ORDERED);

		initEOperation(getEmfCommand__Undo(), null, "undo", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getEmfCommand__Redo(), null, "redo", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getEmfCommand__GetMessage(), theEcorePackage.getEString(), "getMessage", 0, 1, !IS_UNIQUE,
				IS_ORDERED);

		// Initialize data types
		initEDataType(timestampEDataType, LocalDateTime.class, "Timestamp", IS_SERIALIZABLE,
				!IS_GENERATED_INSTANCE_CLASS);
		initEDataType(commandEDataType, Command.class, "Command", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //CommandPackageImpl
