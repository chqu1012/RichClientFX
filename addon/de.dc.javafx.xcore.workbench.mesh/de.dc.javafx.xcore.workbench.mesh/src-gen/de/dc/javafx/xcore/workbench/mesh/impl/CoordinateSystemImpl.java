/**
 */
package de.dc.javafx.xcore.workbench.mesh.impl;

import de.dc.javafx.xcore.workbench.mesh.CoordinateSystem;
import de.dc.javafx.xcore.workbench.mesh.MeshPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Coordinate System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dc.javafx.xcore.workbench.mesh.impl.CoordinateSystemImpl#getXAxisWidth <em>XAxis Width</em>}</li>
 *   <li>{@link de.dc.javafx.xcore.workbench.mesh.impl.CoordinateSystemImpl#getYAxisWidth <em>YAxis Width</em>}</li>
 *   <li>{@link de.dc.javafx.xcore.workbench.mesh.impl.CoordinateSystemImpl#getZAxisWidth <em>ZAxis Width</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CoordinateSystemImpl extends MeshNodeImpl implements CoordinateSystem {
	/**
	 * The default value of the '{@link #getXAxisWidth() <em>XAxis Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXAxisWidth()
	 * @generated
	 * @ordered
	 */
	protected static final double XAXIS_WIDTH_EDEFAULT = 100.0;

	/**
	 * The cached value of the '{@link #getXAxisWidth() <em>XAxis Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXAxisWidth()
	 * @generated
	 * @ordered
	 */
	protected double xAxisWidth = XAXIS_WIDTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getYAxisWidth() <em>YAxis Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYAxisWidth()
	 * @generated
	 * @ordered
	 */
	protected static final double YAXIS_WIDTH_EDEFAULT = 100.0;

	/**
	 * The cached value of the '{@link #getYAxisWidth() <em>YAxis Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYAxisWidth()
	 * @generated
	 * @ordered
	 */
	protected double yAxisWidth = YAXIS_WIDTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getZAxisWidth() <em>ZAxis Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZAxisWidth()
	 * @generated
	 * @ordered
	 */
	protected static final double ZAXIS_WIDTH_EDEFAULT = 100.0;

	/**
	 * The cached value of the '{@link #getZAxisWidth() <em>ZAxis Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZAxisWidth()
	 * @generated
	 * @ordered
	 */
	protected double zAxisWidth = ZAXIS_WIDTH_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CoordinateSystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MeshPackage.Literals.COORDINATE_SYSTEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getXAxisWidth() {
		return xAxisWidth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setXAxisWidth(double newXAxisWidth) {
		double oldXAxisWidth = xAxisWidth;
		xAxisWidth = newXAxisWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MeshPackage.COORDINATE_SYSTEM__XAXIS_WIDTH,
					oldXAxisWidth, xAxisWidth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getYAxisWidth() {
		return yAxisWidth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setYAxisWidth(double newYAxisWidth) {
		double oldYAxisWidth = yAxisWidth;
		yAxisWidth = newYAxisWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MeshPackage.COORDINATE_SYSTEM__YAXIS_WIDTH,
					oldYAxisWidth, yAxisWidth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getZAxisWidth() {
		return zAxisWidth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setZAxisWidth(double newZAxisWidth) {
		double oldZAxisWidth = zAxisWidth;
		zAxisWidth = newZAxisWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MeshPackage.COORDINATE_SYSTEM__ZAXIS_WIDTH,
					oldZAxisWidth, zAxisWidth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MeshPackage.COORDINATE_SYSTEM__XAXIS_WIDTH:
			return getXAxisWidth();
		case MeshPackage.COORDINATE_SYSTEM__YAXIS_WIDTH:
			return getYAxisWidth();
		case MeshPackage.COORDINATE_SYSTEM__ZAXIS_WIDTH:
			return getZAxisWidth();
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
		case MeshPackage.COORDINATE_SYSTEM__XAXIS_WIDTH:
			setXAxisWidth((Double) newValue);
			return;
		case MeshPackage.COORDINATE_SYSTEM__YAXIS_WIDTH:
			setYAxisWidth((Double) newValue);
			return;
		case MeshPackage.COORDINATE_SYSTEM__ZAXIS_WIDTH:
			setZAxisWidth((Double) newValue);
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
		case MeshPackage.COORDINATE_SYSTEM__XAXIS_WIDTH:
			setXAxisWidth(XAXIS_WIDTH_EDEFAULT);
			return;
		case MeshPackage.COORDINATE_SYSTEM__YAXIS_WIDTH:
			setYAxisWidth(YAXIS_WIDTH_EDEFAULT);
			return;
		case MeshPackage.COORDINATE_SYSTEM__ZAXIS_WIDTH:
			setZAxisWidth(ZAXIS_WIDTH_EDEFAULT);
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
		case MeshPackage.COORDINATE_SYSTEM__XAXIS_WIDTH:
			return xAxisWidth != XAXIS_WIDTH_EDEFAULT;
		case MeshPackage.COORDINATE_SYSTEM__YAXIS_WIDTH:
			return yAxisWidth != YAXIS_WIDTH_EDEFAULT;
		case MeshPackage.COORDINATE_SYSTEM__ZAXIS_WIDTH:
			return zAxisWidth != ZAXIS_WIDTH_EDEFAULT;
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
		result.append(" (xAxisWidth: ");
		result.append(xAxisWidth);
		result.append(", yAxisWidth: ");
		result.append(yAxisWidth);
		result.append(", zAxisWidth: ");
		result.append(zAxisWidth);
		result.append(')');
		return result.toString();
	}

} //CoordinateSystemImpl
