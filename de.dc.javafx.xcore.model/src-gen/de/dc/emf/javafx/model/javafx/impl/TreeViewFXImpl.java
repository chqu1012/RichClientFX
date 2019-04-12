/**
 */
package de.dc.emf.javafx.model.javafx.impl;

import de.dc.emf.javafx.model.javafx.JavafxPackage;
import de.dc.emf.javafx.model.javafx.TreeViewFX;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.xtext.common.types.JvmTypeReference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tree View FX</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dc.emf.javafx.model.javafx.impl.TreeViewFXImpl#getUsedModel <em>Used Model</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TreeViewFXImpl extends ControlFXImpl implements TreeViewFX {
	/**
	 * The cached value of the '{@link #getUsedModel() <em>Used Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsedModel()
	 * @generated
	 * @ordered
	 */
	protected JvmTypeReference usedModel;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TreeViewFXImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JavafxPackage.Literals.TREE_VIEW_FX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public JvmTypeReference getUsedModel() {
		return usedModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUsedModel(JvmTypeReference newUsedModel, NotificationChain msgs) {
		JvmTypeReference oldUsedModel = usedModel;
		usedModel = newUsedModel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					JavafxPackage.TREE_VIEW_FX__USED_MODEL, oldUsedModel, newUsedModel);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUsedModel(JvmTypeReference newUsedModel) {
		if (newUsedModel != usedModel) {
			NotificationChain msgs = null;
			if (usedModel != null)
				msgs = ((InternalEObject) usedModel).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - JavafxPackage.TREE_VIEW_FX__USED_MODEL, null, msgs);
			if (newUsedModel != null)
				msgs = ((InternalEObject) newUsedModel).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - JavafxPackage.TREE_VIEW_FX__USED_MODEL, null, msgs);
			msgs = basicSetUsedModel(newUsedModel, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavafxPackage.TREE_VIEW_FX__USED_MODEL, newUsedModel,
					newUsedModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case JavafxPackage.TREE_VIEW_FX__USED_MODEL:
			return basicSetUsedModel(null, msgs);
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
		case JavafxPackage.TREE_VIEW_FX__USED_MODEL:
			return getUsedModel();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case JavafxPackage.TREE_VIEW_FX__USED_MODEL:
			setUsedModel((JvmTypeReference) newValue);
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
		case JavafxPackage.TREE_VIEW_FX__USED_MODEL:
			setUsedModel((JvmTypeReference) null);
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
		case JavafxPackage.TREE_VIEW_FX__USED_MODEL:
			return usedModel != null;
		}
		return super.eIsSet(featureID);
	}

} //TreeViewFXImpl
