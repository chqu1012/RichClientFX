/**
 */
package de.dc.javafx.xcore.workbench.mesh.impl;

import de.dc.javafx.xcore.workbench.mesh.CoordinateSystem;
import de.dc.javafx.xcore.workbench.mesh.MeshPackage;
import de.dc.javafx.xcore.workbench.mesh.ShapeFX;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

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
 *   <li>{@link de.dc.javafx.xcore.workbench.mesh.impl.CoordinateSystemImpl#getShapes <em>Shapes</em>}</li>
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
	 * The cached value of the '{@link #getShapes() <em>Shapes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShapes()
	 * @generated
	 * @ordered
	 */
	protected EList<ShapeFX> shapes;

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
	public EList<ShapeFX> getShapes() {
		if (shapes == null) {
			shapes = new EObjectContainmentEList<ShapeFX>(ShapeFX.class, this, MeshPackage.COORDINATE_SYSTEM__SHAPES);
		}
		return shapes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case MeshPackage.COORDINATE_SYSTEM__SHAPES:
			return ((InternalEList<?>) getShapes()).basicRemove(otherEnd, msgs);
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
		case MeshPackage.COORDINATE_SYSTEM__XAXIS_WIDTH:
			return getXAxisWidth();
		case MeshPackage.COORDINATE_SYSTEM__YAXIS_WIDTH:
			return getYAxisWidth();
		case MeshPackage.COORDINATE_SYSTEM__ZAXIS_WIDTH:
			return getZAxisWidth();
		case MeshPackage.COORDINATE_SYSTEM__SHAPES:
			return getShapes();
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
		case MeshPackage.COORDINATE_SYSTEM__XAXIS_WIDTH:
			setXAxisWidth((Double) newValue);
			return;
		case MeshPackage.COORDINATE_SYSTEM__YAXIS_WIDTH:
			setYAxisWidth((Double) newValue);
			return;
		case MeshPackage.COORDINATE_SYSTEM__ZAXIS_WIDTH:
			setZAxisWidth((Double) newValue);
			return;
		case MeshPackage.COORDINATE_SYSTEM__SHAPES:
			getShapes().clear();
			getShapes().addAll((Collection<? extends ShapeFX>) newValue);
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
		case MeshPackage.COORDINATE_SYSTEM__SHAPES:
			getShapes().clear();
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
		case MeshPackage.COORDINATE_SYSTEM__SHAPES:
			return shapes != null && !shapes.isEmpty();
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
