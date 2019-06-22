/**
 */
package de.dc.javafx.xcore.workbench.impl;

import de.dc.javafx.xcore.workbench.Command;
import de.dc.javafx.xcore.workbench.CommandRegistry;
import de.dc.javafx.xcore.workbench.WorkbenchPackage;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Command Registry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dc.javafx.xcore.workbench.impl.CommandRegistryImpl#getUsedCommands <em>Used Commands</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CommandRegistryImpl extends MinimalEObjectImpl.Container implements CommandRegistry {
	/**
	 * The cached value of the '{@link #getUsedCommands() <em>Used Commands</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsedCommands()
	 * @generated
	 * @ordered
	 */
	protected EList<Command> usedCommands;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommandRegistryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WorkbenchPackage.Literals.COMMAND_REGISTRY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Command> getUsedCommands() {
		if (usedCommands == null) {
			usedCommands = new EObjectResolvingEList<Command>(Command.class, this,
					WorkbenchPackage.COMMAND_REGISTRY__USED_COMMANDS);
		}
		return usedCommands;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case WorkbenchPackage.COMMAND_REGISTRY__USED_COMMANDS:
			return getUsedCommands();
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
		case WorkbenchPackage.COMMAND_REGISTRY__USED_COMMANDS:
			getUsedCommands().clear();
			getUsedCommands().addAll((Collection<? extends Command>) newValue);
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
		case WorkbenchPackage.COMMAND_REGISTRY__USED_COMMANDS:
			getUsedCommands().clear();
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
		case WorkbenchPackage.COMMAND_REGISTRY__USED_COMMANDS:
			return usedCommands != null && !usedCommands.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CommandRegistryImpl
