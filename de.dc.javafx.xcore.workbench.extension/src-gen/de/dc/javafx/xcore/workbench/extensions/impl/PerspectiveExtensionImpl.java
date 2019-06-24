/**
 */
package de.dc.javafx.xcore.workbench.extensions.impl;

import de.dc.javafx.xcore.workbench.extensions.ExtensionsPackage;
import de.dc.javafx.xcore.workbench.extensions.Perspective;
import de.dc.javafx.xcore.workbench.extensions.PerspectiveExtension;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Perspective Extension</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dc.javafx.xcore.workbench.extensions.impl.PerspectiveExtensionImpl#getPerspectives <em>Perspectives</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PerspectiveExtensionImpl extends ExtensionPointImpl implements PerspectiveExtension {
	/**
	 * The cached value of the '{@link #getPerspectives() <em>Perspectives</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerspectives()
	 * @generated
	 * @ordered
	 */
	protected EList<Perspective> perspectives;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PerspectiveExtensionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExtensionsPackage.Literals.PERSPECTIVE_EXTENSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Perspective> getPerspectives() {
		if (perspectives == null) {
			perspectives = new EObjectContainmentEList<Perspective>(Perspective.class, this,
					ExtensionsPackage.PERSPECTIVE_EXTENSION__PERSPECTIVES);
		}
		return perspectives;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ExtensionsPackage.PERSPECTIVE_EXTENSION__PERSPECTIVES:
			return ((InternalEList<?>) getPerspectives()).basicRemove(otherEnd, msgs);
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
		case ExtensionsPackage.PERSPECTIVE_EXTENSION__PERSPECTIVES:
			return getPerspectives();
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
		case ExtensionsPackage.PERSPECTIVE_EXTENSION__PERSPECTIVES:
			getPerspectives().clear();
			getPerspectives().addAll((Collection<? extends Perspective>) newValue);
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
		case ExtensionsPackage.PERSPECTIVE_EXTENSION__PERSPECTIVES:
			getPerspectives().clear();
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
		case ExtensionsPackage.PERSPECTIVE_EXTENSION__PERSPECTIVES:
			return perspectives != null && !perspectives.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PerspectiveExtensionImpl
