/**
 */
package de.dc.emf.javafx.model.javafx.impl;

import de.dc.emf.javafx.model.javafx.AttributeFX;
import de.dc.emf.javafx.model.javafx.JavafxPackage;
import de.dc.emf.javafx.model.javafx.ModelFX;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model FX</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dc.emf.javafx.model.javafx.impl.ModelFXImpl#getAttributes <em>Attributes</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ModelFXImpl extends NamedElementImpl implements ModelFX {
	/**
	 * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<AttributeFX> attributes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelFXImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JavafxPackage.Literals.MODEL_FX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AttributeFX> getAttributes() {
		if (attributes == null) {
			attributes = new EObjectContainmentEList<AttributeFX>(AttributeFX.class, this,
					JavafxPackage.MODEL_FX__ATTRIBUTES);
		}
		return attributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case JavafxPackage.MODEL_FX__ATTRIBUTES:
			return ((InternalEList<?>) getAttributes()).basicRemove(otherEnd, msgs);
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
		case JavafxPackage.MODEL_FX__ATTRIBUTES:
			return getAttributes();
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
		case JavafxPackage.MODEL_FX__ATTRIBUTES:
			getAttributes().clear();
			getAttributes().addAll((Collection<? extends AttributeFX>) newValue);
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
		case JavafxPackage.MODEL_FX__ATTRIBUTES:
			getAttributes().clear();
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
		case JavafxPackage.MODEL_FX__ATTRIBUTES:
			return attributes != null && !attributes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ModelFXImpl
