/**
 */
package de.dc.javafx.xcore.workbench.command.impl;

import de.dc.javafx.xcore.workbench.command.CommandPackage;
import de.dc.javafx.xcore.workbench.command.EmfCommand;
import de.dc.javafx.xcore.workbench.command.EmfResult;

import java.lang.reflect.InvocationTargetException;

import java.time.LocalDateTime;

import java.util.Collection;

import org.eclipse.emf.common.command.Command;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Emf Command</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dc.javafx.xcore.workbench.command.impl.EmfCommandImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.dc.javafx.xcore.workbench.command.impl.EmfCommandImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link de.dc.javafx.xcore.workbench.command.impl.EmfCommandImpl#getTimestamp <em>Timestamp</em>}</li>
 *   <li>{@link de.dc.javafx.xcore.workbench.command.impl.EmfCommandImpl#getCommand <em>Command</em>}</li>
 *   <li>{@link de.dc.javafx.xcore.workbench.command.impl.EmfCommandImpl#getResults <em>Results</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EmfCommandImpl extends MinimalEObjectImpl.Container implements EmfCommand {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getTimestamp() <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimestamp()
	 * @generated
	 * @ordered
	 */
	protected static final LocalDateTime TIMESTAMP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTimestamp() <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimestamp()
	 * @generated
	 * @ordered
	 */
	protected LocalDateTime timestamp = TIMESTAMP_EDEFAULT;

	/**
	 * The default value of the '{@link #getCommand() <em>Command</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommand()
	 * @generated
	 * @ordered
	 */
	protected static final Command COMMAND_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCommand() <em>Command</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommand()
	 * @generated
	 * @ordered
	 */
	protected Command command = COMMAND_EDEFAULT;

	/**
	 * The cached value of the '{@link #getResults() <em>Results</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResults()
	 * @generated
	 * @ordered
	 */
	protected EList<EmfResult> results;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EmfCommandImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CommandPackage.Literals.EMF_COMMAND;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommandPackage.EMF_COMMAND__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommandPackage.EMF_COMMAND__DESCRIPTION,
					oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LocalDateTime getTimestamp() {
		return timestamp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTimestamp(LocalDateTime newTimestamp) {
		LocalDateTime oldTimestamp = timestamp;
		timestamp = newTimestamp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommandPackage.EMF_COMMAND__TIMESTAMP, oldTimestamp,
					timestamp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Command getCommand() {
		return command;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCommand(Command newCommand) {
		Command oldCommand = command;
		command = newCommand;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommandPackage.EMF_COMMAND__COMMAND, oldCommand,
					command));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EmfResult> getResults() {
		if (results == null) {
			results = new EObjectContainmentEList<EmfResult>(EmfResult.class, this,
					CommandPackage.EMF_COMMAND__RESULTS);
		}
		return results;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canUndo() {
		return this.getCommand().canUndo();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void undo() {
		boolean _canUndo = this.canUndo();
		if (_canUndo) {
			this.getCommand().undo();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void redo() {
		this.getCommand().redo();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMessage() {
		String _label = this.getCommand().getLabel();
		String _plus = (_label + " ");
		int _size = this.getCommand().getResult().size();
		String _plus_1 = (_plus + Integer.valueOf(_size));
		return (_plus_1 + " selection(s)");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CommandPackage.EMF_COMMAND__RESULTS:
			return ((InternalEList<?>) getResults()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case CommandPackage.EMF_COMMAND__NAME:
			return getName();
		case CommandPackage.EMF_COMMAND__DESCRIPTION:
			return getDescription();
		case CommandPackage.EMF_COMMAND__TIMESTAMP:
			return getTimestamp();
		case CommandPackage.EMF_COMMAND__COMMAND:
			return getCommand();
		case CommandPackage.EMF_COMMAND__RESULTS:
			return getResults();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case CommandPackage.EMF_COMMAND__NAME:
			setName((String) newValue);
			return;
		case CommandPackage.EMF_COMMAND__DESCRIPTION:
			setDescription((String) newValue);
			return;
		case CommandPackage.EMF_COMMAND__TIMESTAMP:
			setTimestamp((LocalDateTime) newValue);
			return;
		case CommandPackage.EMF_COMMAND__COMMAND:
			setCommand((Command) newValue);
			return;
		case CommandPackage.EMF_COMMAND__RESULTS:
			getResults().clear();
			getResults().addAll((Collection<? extends EmfResult>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case CommandPackage.EMF_COMMAND__NAME:
			setName(NAME_EDEFAULT);
			return;
		case CommandPackage.EMF_COMMAND__DESCRIPTION:
			setDescription(DESCRIPTION_EDEFAULT);
			return;
		case CommandPackage.EMF_COMMAND__TIMESTAMP:
			setTimestamp(TIMESTAMP_EDEFAULT);
			return;
		case CommandPackage.EMF_COMMAND__COMMAND:
			setCommand(COMMAND_EDEFAULT);
			return;
		case CommandPackage.EMF_COMMAND__RESULTS:
			getResults().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case CommandPackage.EMF_COMMAND__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case CommandPackage.EMF_COMMAND__DESCRIPTION:
			return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
		case CommandPackage.EMF_COMMAND__TIMESTAMP:
			return TIMESTAMP_EDEFAULT == null ? timestamp != null : !TIMESTAMP_EDEFAULT.equals(timestamp);
		case CommandPackage.EMF_COMMAND__COMMAND:
			return COMMAND_EDEFAULT == null ? command != null : !COMMAND_EDEFAULT.equals(command);
		case CommandPackage.EMF_COMMAND__RESULTS:
			return results != null && !results.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case CommandPackage.EMF_COMMAND___CAN_UNDO:
			return canUndo();
		case CommandPackage.EMF_COMMAND___UNDO:
			undo();
			return null;
		case CommandPackage.EMF_COMMAND___REDO:
			redo();
			return null;
		case CommandPackage.EMF_COMMAND___GET_MESSAGE:
			return getMessage();
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", description: ");
		result.append(description);
		result.append(", timestamp: ");
		result.append(timestamp);
		result.append(", command: ");
		result.append(command);
		result.append(')');
		return result.toString();
	}

} //EmfCommandImpl
