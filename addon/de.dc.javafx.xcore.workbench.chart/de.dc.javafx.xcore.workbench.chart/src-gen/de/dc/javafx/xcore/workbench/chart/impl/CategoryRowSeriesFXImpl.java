/**
 */
package de.dc.javafx.xcore.workbench.chart.impl;

import de.dc.javafx.xcore.workbench.chart.CategoryRowSeriesFX;
import de.dc.javafx.xcore.workbench.chart.ChartPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Category Row Series FX</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dc.javafx.xcore.workbench.chart.impl.CategoryRowSeriesFXImpl#getRowKey <em>Row Key</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CategoryRowSeriesFXImpl extends CategorySeriesFXImpl implements CategoryRowSeriesFX {
	/**
	 * The default value of the '{@link #getRowKey() <em>Row Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRowKey()
	 * @generated
	 * @ordered
	 */
	protected static final String ROW_KEY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRowKey() <em>Row Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRowKey()
	 * @generated
	 * @ordered
	 */
	protected String rowKey = ROW_KEY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CategoryRowSeriesFXImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ChartPackage.Literals.CATEGORY_ROW_SERIES_FX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRowKey() {
		return rowKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRowKey(String newRowKey) {
		String oldRowKey = rowKey;
		rowKey = newRowKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChartPackage.CATEGORY_ROW_SERIES_FX__ROW_KEY,
					oldRowKey, rowKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ChartPackage.CATEGORY_ROW_SERIES_FX__ROW_KEY:
			return getRowKey();
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
		case ChartPackage.CATEGORY_ROW_SERIES_FX__ROW_KEY:
			setRowKey((String) newValue);
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
		case ChartPackage.CATEGORY_ROW_SERIES_FX__ROW_KEY:
			setRowKey(ROW_KEY_EDEFAULT);
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
		case ChartPackage.CATEGORY_ROW_SERIES_FX__ROW_KEY:
			return ROW_KEY_EDEFAULT == null ? rowKey != null : !ROW_KEY_EDEFAULT.equals(rowKey);
		}
		return super.eIsSet(featureID);
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
		result.append(" (rowKey: ");
		result.append(rowKey);
		result.append(')');
		return result.toString();
	}

} //CategoryRowSeriesFXImpl
