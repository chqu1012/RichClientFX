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
 *   <li>{@link de.dc.emf.javafx.model.javafx.impl.TreeViewFXImpl#getCellValueFactory <em>Cell Value Factory</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TreeViewFXImpl extends BaseViewFXImpl implements TreeViewFX {
	/**
	 * The cached value of the '{@link #getCellValueFactory() <em>Cell Value Factory</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCellValueFactory()
	 * @generated
	 * @ordered
	 */
	protected JvmTypeReference cellValueFactory;

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
	public JvmTypeReference getCellValueFactory() {
		return cellValueFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCellValueFactory(JvmTypeReference newCellValueFactory, NotificationChain msgs) {
		JvmTypeReference oldCellValueFactory = cellValueFactory;
		cellValueFactory = newCellValueFactory;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					JavafxPackage.TREE_VIEW_FX__CELL_VALUE_FACTORY, oldCellValueFactory, newCellValueFactory);
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
	public void setCellValueFactory(JvmTypeReference newCellValueFactory) {
		if (newCellValueFactory != cellValueFactory) {
			NotificationChain msgs = null;
			if (cellValueFactory != null)
				msgs = ((InternalEObject) cellValueFactory).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - JavafxPackage.TREE_VIEW_FX__CELL_VALUE_FACTORY, null, msgs);
			if (newCellValueFactory != null)
				msgs = ((InternalEObject) newCellValueFactory).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - JavafxPackage.TREE_VIEW_FX__CELL_VALUE_FACTORY, null, msgs);
			msgs = basicSetCellValueFactory(newCellValueFactory, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavafxPackage.TREE_VIEW_FX__CELL_VALUE_FACTORY,
					newCellValueFactory, newCellValueFactory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case JavafxPackage.TREE_VIEW_FX__CELL_VALUE_FACTORY:
			return basicSetCellValueFactory(null, msgs);
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
		case JavafxPackage.TREE_VIEW_FX__CELL_VALUE_FACTORY:
			return getCellValueFactory();
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
		case JavafxPackage.TREE_VIEW_FX__CELL_VALUE_FACTORY:
			setCellValueFactory((JvmTypeReference) newValue);
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
		case JavafxPackage.TREE_VIEW_FX__CELL_VALUE_FACTORY:
			setCellValueFactory((JvmTypeReference) null);
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
		case JavafxPackage.TREE_VIEW_FX__CELL_VALUE_FACTORY:
			return cellValueFactory != null;
		}
		return super.eIsSet(featureID);
	}

} //TreeViewFXImpl
