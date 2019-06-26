/**
 */
package de.dc.javafx.xcore.workbench.barcode.impl;

import de.dc.javafx.xcore.workbench.barcode.BarcodeFX;
import de.dc.javafx.xcore.workbench.barcode.BarcodeFXProject;
import de.dc.javafx.xcore.workbench.barcode.BarcodePackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>FX Project</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dc.javafx.xcore.workbench.barcode.impl.BarcodeFXProjectImpl#getBarcodes <em>Barcodes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BarcodeFXProjectImpl extends MinimalEObjectImpl.Container implements BarcodeFXProject {
	/**
	 * The cached value of the '{@link #getBarcodes() <em>Barcodes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBarcodes()
	 * @generated
	 * @ordered
	 */
	protected EList<BarcodeFX> barcodes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BarcodeFXProjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BarcodePackage.Literals.BARCODE_FX_PROJECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BarcodeFX> getBarcodes() {
		if (barcodes == null) {
			barcodes = new EObjectContainmentEList<BarcodeFX>(BarcodeFX.class, this,
					BarcodePackage.BARCODE_FX_PROJECT__BARCODES);
		}
		return barcodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case BarcodePackage.BARCODE_FX_PROJECT__BARCODES:
			return ((InternalEList<?>) getBarcodes()).basicRemove(otherEnd, msgs);
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
		case BarcodePackage.BARCODE_FX_PROJECT__BARCODES:
			return getBarcodes();
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
		case BarcodePackage.BARCODE_FX_PROJECT__BARCODES:
			getBarcodes().clear();
			getBarcodes().addAll((Collection<? extends BarcodeFX>) newValue);
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
		case BarcodePackage.BARCODE_FX_PROJECT__BARCODES:
			getBarcodes().clear();
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
		case BarcodePackage.BARCODE_FX_PROJECT__BARCODES:
			return barcodes != null && !barcodes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //BarcodeFXProjectImpl
