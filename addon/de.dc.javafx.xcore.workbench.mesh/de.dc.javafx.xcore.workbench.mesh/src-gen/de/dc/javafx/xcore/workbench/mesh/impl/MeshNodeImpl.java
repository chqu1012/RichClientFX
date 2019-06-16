/**
 */
package de.dc.javafx.xcore.workbench.mesh.impl;

import de.dc.javafx.xcore.workbench.mesh.MeshNode;
import de.dc.javafx.xcore.workbench.mesh.MeshPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dc.javafx.xcore.workbench.mesh.impl.MeshNodeImpl#getTranslateX <em>Translate X</em>}</li>
 *   <li>{@link de.dc.javafx.xcore.workbench.mesh.impl.MeshNodeImpl#getTranslateY <em>Translate Y</em>}</li>
 *   <li>{@link de.dc.javafx.xcore.workbench.mesh.impl.MeshNodeImpl#getTranslateZ <em>Translate Z</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class MeshNodeImpl extends MinimalEObjectImpl.Container implements MeshNode {
	/**
	 * The default value of the '{@link #getTranslateX() <em>Translate X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTranslateX()
	 * @generated
	 * @ordered
	 */
	protected static final double TRANSLATE_X_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getTranslateX() <em>Translate X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTranslateX()
	 * @generated
	 * @ordered
	 */
	protected double translateX = TRANSLATE_X_EDEFAULT;

	/**
	 * The default value of the '{@link #getTranslateY() <em>Translate Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTranslateY()
	 * @generated
	 * @ordered
	 */
	protected static final double TRANSLATE_Y_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getTranslateY() <em>Translate Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTranslateY()
	 * @generated
	 * @ordered
	 */
	protected double translateY = TRANSLATE_Y_EDEFAULT;

	/**
	 * The default value of the '{@link #getTranslateZ() <em>Translate Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTranslateZ()
	 * @generated
	 * @ordered
	 */
	protected static final double TRANSLATE_Z_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getTranslateZ() <em>Translate Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTranslateZ()
	 * @generated
	 * @ordered
	 */
	protected double translateZ = TRANSLATE_Z_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MeshNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MeshPackage.Literals.MESH_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getTranslateX() {
		return translateX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTranslateX(double newTranslateX) {
		double oldTranslateX = translateX;
		translateX = newTranslateX;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MeshPackage.MESH_NODE__TRANSLATE_X, oldTranslateX,
					translateX));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getTranslateY() {
		return translateY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTranslateY(double newTranslateY) {
		double oldTranslateY = translateY;
		translateY = newTranslateY;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MeshPackage.MESH_NODE__TRANSLATE_Y, oldTranslateY,
					translateY));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getTranslateZ() {
		return translateZ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTranslateZ(double newTranslateZ) {
		double oldTranslateZ = translateZ;
		translateZ = newTranslateZ;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MeshPackage.MESH_NODE__TRANSLATE_Z, oldTranslateZ,
					translateZ));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MeshPackage.MESH_NODE__TRANSLATE_X:
			return getTranslateX();
		case MeshPackage.MESH_NODE__TRANSLATE_Y:
			return getTranslateY();
		case MeshPackage.MESH_NODE__TRANSLATE_Z:
			return getTranslateZ();
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
		case MeshPackage.MESH_NODE__TRANSLATE_X:
			setTranslateX((Double) newValue);
			return;
		case MeshPackage.MESH_NODE__TRANSLATE_Y:
			setTranslateY((Double) newValue);
			return;
		case MeshPackage.MESH_NODE__TRANSLATE_Z:
			setTranslateZ((Double) newValue);
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
		case MeshPackage.MESH_NODE__TRANSLATE_X:
			setTranslateX(TRANSLATE_X_EDEFAULT);
			return;
		case MeshPackage.MESH_NODE__TRANSLATE_Y:
			setTranslateY(TRANSLATE_Y_EDEFAULT);
			return;
		case MeshPackage.MESH_NODE__TRANSLATE_Z:
			setTranslateZ(TRANSLATE_Z_EDEFAULT);
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
		case MeshPackage.MESH_NODE__TRANSLATE_X:
			return translateX != TRANSLATE_X_EDEFAULT;
		case MeshPackage.MESH_NODE__TRANSLATE_Y:
			return translateY != TRANSLATE_Y_EDEFAULT;
		case MeshPackage.MESH_NODE__TRANSLATE_Z:
			return translateZ != TRANSLATE_Z_EDEFAULT;
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
		result.append(" (translateX: ");
		result.append(translateX);
		result.append(", translateY: ");
		result.append(translateY);
		result.append(", translateZ: ");
		result.append(translateZ);
		result.append(')');
		return result.toString();
	}

} //MeshNodeImpl
