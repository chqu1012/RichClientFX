/**
 */
package de.dc.emf.javafx.model.javafx.impl;

import de.dc.emf.javafx.model.javafx.AxisType;
import de.dc.emf.javafx.model.javafx.JavafxPackage;
import de.dc.emf.javafx.model.javafx.XYChartFX;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>XY Chart FX</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dc.emf.javafx.model.javafx.impl.XYChartFXImpl#getXAxisType <em>XAxis Type</em>}</li>
 *   <li>{@link de.dc.emf.javafx.model.javafx.impl.XYChartFXImpl#getYAxisType <em>YAxis Type</em>}</li>
 *   <li>{@link de.dc.emf.javafx.model.javafx.impl.XYChartFXImpl#getXAxisLabel <em>XAxis Label</em>}</li>
 *   <li>{@link de.dc.emf.javafx.model.javafx.impl.XYChartFXImpl#getYAxisLabel <em>YAxis Label</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class XYChartFXImpl extends ChartFXImpl implements XYChartFX {
	/**
	 * The default value of the '{@link #getXAxisType() <em>XAxis Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXAxisType()
	 * @generated
	 * @ordered
	 */
	protected static final AxisType XAXIS_TYPE_EDEFAULT = AxisType.NUMBER;

	/**
	 * The cached value of the '{@link #getXAxisType() <em>XAxis Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXAxisType()
	 * @generated
	 * @ordered
	 */
	protected AxisType xAxisType = XAXIS_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getYAxisType() <em>YAxis Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYAxisType()
	 * @generated
	 * @ordered
	 */
	protected static final AxisType YAXIS_TYPE_EDEFAULT = AxisType.NUMBER;

	/**
	 * The cached value of the '{@link #getYAxisType() <em>YAxis Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYAxisType()
	 * @generated
	 * @ordered
	 */
	protected AxisType yAxisType = YAXIS_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getXAxisLabel() <em>XAxis Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXAxisLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String XAXIS_LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getXAxisLabel() <em>XAxis Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXAxisLabel()
	 * @generated
	 * @ordered
	 */
	protected String xAxisLabel = XAXIS_LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getYAxisLabel() <em>YAxis Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYAxisLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String YAXIS_LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getYAxisLabel() <em>YAxis Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYAxisLabel()
	 * @generated
	 * @ordered
	 */
	protected String yAxisLabel = YAXIS_LABEL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XYChartFXImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JavafxPackage.Literals.XY_CHART_FX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AxisType getXAxisType() {
		return xAxisType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setXAxisType(AxisType newXAxisType) {
		AxisType oldXAxisType = xAxisType;
		xAxisType = newXAxisType == null ? XAXIS_TYPE_EDEFAULT : newXAxisType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavafxPackage.XY_CHART_FX__XAXIS_TYPE, oldXAxisType,
					xAxisType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AxisType getYAxisType() {
		return yAxisType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setYAxisType(AxisType newYAxisType) {
		AxisType oldYAxisType = yAxisType;
		yAxisType = newYAxisType == null ? YAXIS_TYPE_EDEFAULT : newYAxisType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavafxPackage.XY_CHART_FX__YAXIS_TYPE, oldYAxisType,
					yAxisType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getXAxisLabel() {
		return xAxisLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setXAxisLabel(String newXAxisLabel) {
		String oldXAxisLabel = xAxisLabel;
		xAxisLabel = newXAxisLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavafxPackage.XY_CHART_FX__XAXIS_LABEL, oldXAxisLabel,
					xAxisLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getYAxisLabel() {
		return yAxisLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setYAxisLabel(String newYAxisLabel) {
		String oldYAxisLabel = yAxisLabel;
		yAxisLabel = newYAxisLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavafxPackage.XY_CHART_FX__YAXIS_LABEL, oldYAxisLabel,
					yAxisLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case JavafxPackage.XY_CHART_FX__XAXIS_TYPE:
			return getXAxisType();
		case JavafxPackage.XY_CHART_FX__YAXIS_TYPE:
			return getYAxisType();
		case JavafxPackage.XY_CHART_FX__XAXIS_LABEL:
			return getXAxisLabel();
		case JavafxPackage.XY_CHART_FX__YAXIS_LABEL:
			return getYAxisLabel();
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
		case JavafxPackage.XY_CHART_FX__XAXIS_TYPE:
			setXAxisType((AxisType) newValue);
			return;
		case JavafxPackage.XY_CHART_FX__YAXIS_TYPE:
			setYAxisType((AxisType) newValue);
			return;
		case JavafxPackage.XY_CHART_FX__XAXIS_LABEL:
			setXAxisLabel((String) newValue);
			return;
		case JavafxPackage.XY_CHART_FX__YAXIS_LABEL:
			setYAxisLabel((String) newValue);
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
		case JavafxPackage.XY_CHART_FX__XAXIS_TYPE:
			setXAxisType(XAXIS_TYPE_EDEFAULT);
			return;
		case JavafxPackage.XY_CHART_FX__YAXIS_TYPE:
			setYAxisType(YAXIS_TYPE_EDEFAULT);
			return;
		case JavafxPackage.XY_CHART_FX__XAXIS_LABEL:
			setXAxisLabel(XAXIS_LABEL_EDEFAULT);
			return;
		case JavafxPackage.XY_CHART_FX__YAXIS_LABEL:
			setYAxisLabel(YAXIS_LABEL_EDEFAULT);
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
		case JavafxPackage.XY_CHART_FX__XAXIS_TYPE:
			return xAxisType != XAXIS_TYPE_EDEFAULT;
		case JavafxPackage.XY_CHART_FX__YAXIS_TYPE:
			return yAxisType != YAXIS_TYPE_EDEFAULT;
		case JavafxPackage.XY_CHART_FX__XAXIS_LABEL:
			return XAXIS_LABEL_EDEFAULT == null ? xAxisLabel != null : !XAXIS_LABEL_EDEFAULT.equals(xAxisLabel);
		case JavafxPackage.XY_CHART_FX__YAXIS_LABEL:
			return YAXIS_LABEL_EDEFAULT == null ? yAxisLabel != null : !YAXIS_LABEL_EDEFAULT.equals(yAxisLabel);
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
		result.append(" (xAxisType: ");
		result.append(xAxisType);
		result.append(", yAxisType: ");
		result.append(yAxisType);
		result.append(", xAxisLabel: ");
		result.append(xAxisLabel);
		result.append(", yAxisLabel: ");
		result.append(yAxisLabel);
		result.append(')');
		return result.toString();
	}

} //XYChartFXImpl
