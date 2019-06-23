/**
 */
package de.dc.javafx.xcore.workbench.extensions.impl;

import de.dc.javafx.xcore.workbench.extensions.Editor;
import de.dc.javafx.xcore.workbench.extensions.EditorExtension;
import de.dc.javafx.xcore.workbench.extensions.ExtensionsPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Editor Extension</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dc.javafx.xcore.workbench.extensions.impl.EditorExtensionImpl#getEditors <em>Editors</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EditorExtensionImpl extends ExtensionPointImpl implements EditorExtension {
	/**
	 * The cached value of the '{@link #getEditors() <em>Editors</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEditors()
	 * @generated
	 * @ordered
	 */
	protected EList<Editor> editors;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EditorExtensionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExtensionsPackage.Literals.EDITOR_EXTENSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Editor> getEditors() {
		if (editors == null) {
			editors = new EObjectContainmentEList<Editor>(Editor.class, this,
					ExtensionsPackage.EDITOR_EXTENSION__EDITORS);
		}
		return editors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ExtensionsPackage.EDITOR_EXTENSION__EDITORS:
			return ((InternalEList<?>) getEditors()).basicRemove(otherEnd, msgs);
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
		case ExtensionsPackage.EDITOR_EXTENSION__EDITORS:
			return getEditors();
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
		case ExtensionsPackage.EDITOR_EXTENSION__EDITORS:
			getEditors().clear();
			getEditors().addAll((Collection<? extends Editor>) newValue);
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
		case ExtensionsPackage.EDITOR_EXTENSION__EDITORS:
			getEditors().clear();
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
		case ExtensionsPackage.EDITOR_EXTENSION__EDITORS:
			return editors != null && !editors.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //EditorExtensionImpl
