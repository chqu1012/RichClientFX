/**
 */
package de.dc.javafx.xcore.workbench.mesh.impl;

import de.dc.javafx.xcore.workbench.mesh.CameraFX;
import de.dc.javafx.xcore.workbench.mesh.MeshContainer;
import de.dc.javafx.xcore.workbench.mesh.MeshNode;
import de.dc.javafx.xcore.workbench.mesh.MeshPackage;
import de.dc.javafx.xcore.workbench.mesh.PointLightFX;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dc.javafx.xcore.workbench.mesh.impl.MeshContainerImpl#getNodes <em>Nodes</em>}</li>
 *   <li>{@link de.dc.javafx.xcore.workbench.mesh.impl.MeshContainerImpl#getCamera <em>Camera</em>}</li>
 *   <li>{@link de.dc.javafx.xcore.workbench.mesh.impl.MeshContainerImpl#getPointLight <em>Point Light</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MeshContainerImpl extends MinimalEObjectImpl.Container implements MeshContainer {
	/**
	 * The cached value of the '{@link #getNodes() <em>Nodes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodes()
	 * @generated
	 * @ordered
	 */
	protected EList<MeshNode> nodes;

	/**
	 * The cached value of the '{@link #getCamera() <em>Camera</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCamera()
	 * @generated
	 * @ordered
	 */
	protected CameraFX camera;

	/**
	 * The cached value of the '{@link #getPointLight() <em>Point Light</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPointLight()
	 * @generated
	 * @ordered
	 */
	protected PointLightFX pointLight;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MeshContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MeshPackage.Literals.MESH_CONTAINER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MeshNode> getNodes() {
		if (nodes == null) {
			nodes = new EObjectContainmentEList<MeshNode>(MeshNode.class, this, MeshPackage.MESH_CONTAINER__NODES);
		}
		return nodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CameraFX getCamera() {
		return camera;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCamera(CameraFX newCamera, NotificationChain msgs) {
		CameraFX oldCamera = camera;
		camera = newCamera;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					MeshPackage.MESH_CONTAINER__CAMERA, oldCamera, newCamera);
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
	public void setCamera(CameraFX newCamera) {
		if (newCamera != camera) {
			NotificationChain msgs = null;
			if (camera != null)
				msgs = ((InternalEObject) camera).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - MeshPackage.MESH_CONTAINER__CAMERA, null, msgs);
			if (newCamera != null)
				msgs = ((InternalEObject) newCamera).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - MeshPackage.MESH_CONTAINER__CAMERA, null, msgs);
			msgs = basicSetCamera(newCamera, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MeshPackage.MESH_CONTAINER__CAMERA, newCamera,
					newCamera));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PointLightFX getPointLight() {
		return pointLight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPointLight(PointLightFX newPointLight, NotificationChain msgs) {
		PointLightFX oldPointLight = pointLight;
		pointLight = newPointLight;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					MeshPackage.MESH_CONTAINER__POINT_LIGHT, oldPointLight, newPointLight);
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
	public void setPointLight(PointLightFX newPointLight) {
		if (newPointLight != pointLight) {
			NotificationChain msgs = null;
			if (pointLight != null)
				msgs = ((InternalEObject) pointLight).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - MeshPackage.MESH_CONTAINER__POINT_LIGHT, null, msgs);
			if (newPointLight != null)
				msgs = ((InternalEObject) newPointLight).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - MeshPackage.MESH_CONTAINER__POINT_LIGHT, null, msgs);
			msgs = basicSetPointLight(newPointLight, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MeshPackage.MESH_CONTAINER__POINT_LIGHT,
					newPointLight, newPointLight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case MeshPackage.MESH_CONTAINER__NODES:
			return ((InternalEList<?>) getNodes()).basicRemove(otherEnd, msgs);
		case MeshPackage.MESH_CONTAINER__CAMERA:
			return basicSetCamera(null, msgs);
		case MeshPackage.MESH_CONTAINER__POINT_LIGHT:
			return basicSetPointLight(null, msgs);
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
		case MeshPackage.MESH_CONTAINER__NODES:
			return getNodes();
		case MeshPackage.MESH_CONTAINER__CAMERA:
			return getCamera();
		case MeshPackage.MESH_CONTAINER__POINT_LIGHT:
			return getPointLight();
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
		case MeshPackage.MESH_CONTAINER__NODES:
			getNodes().clear();
			getNodes().addAll((Collection<? extends MeshNode>) newValue);
			return;
		case MeshPackage.MESH_CONTAINER__CAMERA:
			setCamera((CameraFX) newValue);
			return;
		case MeshPackage.MESH_CONTAINER__POINT_LIGHT:
			setPointLight((PointLightFX) newValue);
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
		case MeshPackage.MESH_CONTAINER__NODES:
			getNodes().clear();
			return;
		case MeshPackage.MESH_CONTAINER__CAMERA:
			setCamera((CameraFX) null);
			return;
		case MeshPackage.MESH_CONTAINER__POINT_LIGHT:
			setPointLight((PointLightFX) null);
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
		case MeshPackage.MESH_CONTAINER__NODES:
			return nodes != null && !nodes.isEmpty();
		case MeshPackage.MESH_CONTAINER__CAMERA:
			return camera != null;
		case MeshPackage.MESH_CONTAINER__POINT_LIGHT:
			return pointLight != null;
		}
		return super.eIsSet(featureID);
	}

} //MeshContainerImpl
