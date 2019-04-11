/**
 */
package de.dc.emf.javafx.model.javafx.impl;

import de.dc.emf.javafx.model.javafx.ChartFXData;
import de.dc.emf.javafx.model.javafx.JavafxPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Chart FX Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dc.emf.javafx.model.javafx.impl.ChartFXDataImpl#getXValue <em>XValue</em>}</li>
 *   <li>{@link de.dc.emf.javafx.model.javafx.impl.ChartFXDataImpl#getYValue <em>YValue</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ChartFXDataImpl extends MinimalEObjectImpl.Container implements ChartFXData {
	/**
	 * The default value of the '{@link #getXValue() <em>XValue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXValue()
	 * @generated
	 * @ordered
	 */
	protected static final String XVALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getXValue() <em>XValue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXValue()
	 * @generated
	 * @ordered
	 */
	protected String xValue = XVALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getYValue() <em>YValue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYValue()
	 * @generated
	 * @ordered
	 */
	protected static final String YVALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getYValue() <em>YValue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYValue()
	 * @generated
	 * @ordered
	 */
	protected String yValue = YVALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChartFXDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JavafxPackage.Literals.CHART_FX_DATA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getXValue() {
		return xValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setXValue(String newXValue) {
		String oldXValue = xValue;
		xValue = newXValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavafxPackage.CHART_FX_DATA__XVALUE, oldXValue,
					xValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getYValue() {
		return yValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setYValue(String newYValue) {
		String oldYValue = yValue;
		yValue = newYValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavafxPackage.CHART_FX_DATA__YVALUE, oldYValue,
					yValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case JavafxPackage.CHART_FX_DATA__XVALUE:
			return getXValue();
		case JavafxPackage.CHART_FX_DATA__YVALUE:
			return getYValue();
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
		case JavafxPackage.CHART_FX_DATA__XVALUE:
			setXValue((String) newValue);
			return;
		case JavafxPackage.CHART_FX_DATA__YVALUE:
			setYValue((String) newValue);
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
		case JavafxPackage.CHART_FX_DATA__XVALUE:
			setXValue(XVALUE_EDEFAULT);
			return;
		case JavafxPackage.CHART_FX_DATA__YVALUE:
			setYValue(YVALUE_EDEFAULT);
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
		case JavafxPackage.CHART_FX_DATA__XVALUE:
			return XVALUE_EDEFAULT == null ? xValue != null : !XVALUE_EDEFAULT.equals(xValue);
		case JavafxPackage.CHART_FX_DATA__YVALUE:
			return YVALUE_EDEFAULT == null ? yValue != null : !YVALUE_EDEFAULT.equals(yValue);
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
		result.append(" (xValue: ");
		result.append(xValue);
		result.append(", yValue: ");
		result.append(yValue);
		result.append(')');
		return result.toString();
	}

} //ChartFXDataImpl
