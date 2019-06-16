/**
 */
package de.dc.javafx.xcore.workbench.mesh.util;

import de.dc.javafx.xcore.workbench.mesh.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see de.dc.javafx.xcore.workbench.mesh.MeshPackage
 * @generated
 */
public class MeshSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MeshPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeshSwitch() {
		if (modelPackage == null) {
			modelPackage = MeshPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case MeshPackage.MESH_CONTAINER: {
			MeshContainer meshContainer = (MeshContainer) theEObject;
			T result = caseMeshContainer(meshContainer);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MeshPackage.CAMERA_FX: {
			CameraFX cameraFX = (CameraFX) theEObject;
			T result = caseCameraFX(cameraFX);
			if (result == null)
				result = caseMeshNode(cameraFX);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MeshPackage.MESH_NODE: {
			MeshNode meshNode = (MeshNode) theEObject;
			T result = caseMeshNode(meshNode);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MeshPackage.COORDINATE_SYSTEM: {
			CoordinateSystem coordinateSystem = (CoordinateSystem) theEObject;
			T result = caseCoordinateSystem(coordinateSystem);
			if (result == null)
				result = caseMeshNode(coordinateSystem);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MeshPackage.SHAPE_FX: {
			ShapeFX shapeFX = (ShapeFX) theEObject;
			T result = caseShapeFX(shapeFX);
			if (result == null)
				result = caseMeshNode(shapeFX);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MeshPackage.BOX_FX: {
			BoxFX boxFX = (BoxFX) theEObject;
			T result = caseBoxFX(boxFX);
			if (result == null)
				result = caseShapeFX(boxFX);
			if (result == null)
				result = caseMeshNode(boxFX);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMeshContainer(MeshContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Camera FX</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Camera FX</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCameraFX(CameraFX object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMeshNode(MeshNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Coordinate System</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Coordinate System</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCoordinateSystem(CoordinateSystem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Shape FX</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Shape FX</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseShapeFX(ShapeFX object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Box FX</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Box FX</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBoxFX(BoxFX object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //MeshSwitch
