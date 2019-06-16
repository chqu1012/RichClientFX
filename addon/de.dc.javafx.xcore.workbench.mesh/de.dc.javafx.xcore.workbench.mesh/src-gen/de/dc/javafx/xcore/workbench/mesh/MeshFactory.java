/**
 */
package de.dc.javafx.xcore.workbench.mesh;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.dc.javafx.xcore.workbench.mesh.MeshPackage
 * @generated
 */
public interface MeshFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MeshFactory eINSTANCE = de.dc.javafx.xcore.workbench.mesh.impl.MeshFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Container</em>'.
	 * @generated
	 */
	MeshContainer createMeshContainer();

	/**
	 * Returns a new object of class '<em>Point Light FX</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Point Light FX</em>'.
	 * @generated
	 */
	PointLightFX createPointLightFX();

	/**
	 * Returns a new object of class '<em>Camera FX</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Camera FX</em>'.
	 * @generated
	 */
	CameraFX createCameraFX();

	/**
	 * Returns a new object of class '<em>Coordinate System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Coordinate System</em>'.
	 * @generated
	 */
	CoordinateSystem createCoordinateSystem();

	/**
	 * Returns a new object of class '<em>Box FX</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Box FX</em>'.
	 * @generated
	 */
	BoxFX createBoxFX();

	/**
	 * Returns a new object of class '<em>Cylinder FX</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cylinder FX</em>'.
	 * @generated
	 */
	CylinderFX createCylinderFX();

	/**
	 * Returns a new object of class '<em>Sphere FX</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sphere FX</em>'.
	 * @generated
	 */
	SphereFX createSphereFX();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	MeshPackage getMeshPackage();

} //MeshFactory
