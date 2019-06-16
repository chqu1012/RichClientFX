/**
 */
package de.dc.javafx.xcore.workbench.mesh;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.dc.javafx.xcore.workbench.mesh.MeshFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel multipleEditorPages='false' creationIcons='false' editDirectory='/de.dc.javafx.xcore.workbench.mesh.edit/src-gen' editorDirectory='/de.dc.javafx.xcore.workbench.mesh.editor/src-gen' richClientPlatform='true' codeFormatting='true' importerID='org.eclipse.emf.importer.ecore' runtimePlatform='RCP' fileExtensions='mesh' tableProviders='true' dataTypeConverters='true' basePackage='de.dc.javafx.xcore.workbench'"
 * @generated
 */
public interface MeshPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "mesh";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.frateranatis.org/workbench/mesh";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "mesh";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MeshPackage eINSTANCE = de.dc.javafx.xcore.workbench.mesh.impl.MeshPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.dc.javafx.xcore.workbench.mesh.impl.MeshContainerImpl <em>Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.javafx.xcore.workbench.mesh.impl.MeshContainerImpl
	 * @see de.dc.javafx.xcore.workbench.mesh.impl.MeshPackageImpl#getMeshContainer()
	 * @generated
	 */
	int MESH_CONTAINER = 0;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESH_CONTAINER__NODES = 0;

	/**
	 * The number of structural features of the '<em>Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESH_CONTAINER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESH_CONTAINER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dc.javafx.xcore.workbench.mesh.impl.MeshNodeImpl <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.javafx.xcore.workbench.mesh.impl.MeshNodeImpl
	 * @see de.dc.javafx.xcore.workbench.mesh.impl.MeshPackageImpl#getMeshNode()
	 * @generated
	 */
	int MESH_NODE = 1;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESH_NODE__X = 0;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESH_NODE__Y = 1;

	/**
	 * The feature id for the '<em><b>Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESH_NODE__Z = 2;

	/**
	 * The number of structural features of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESH_NODE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESH_NODE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dc.javafx.xcore.workbench.mesh.impl.CoordinateSystemImpl <em>Coordinate System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.javafx.xcore.workbench.mesh.impl.CoordinateSystemImpl
	 * @see de.dc.javafx.xcore.workbench.mesh.impl.MeshPackageImpl#getCoordinateSystem()
	 * @generated
	 */
	int COORDINATE_SYSTEM = 2;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATE_SYSTEM__X = MESH_NODE__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATE_SYSTEM__Y = MESH_NODE__Y;

	/**
	 * The feature id for the '<em><b>Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATE_SYSTEM__Z = MESH_NODE__Z;

	/**
	 * The feature id for the '<em><b>XAxis Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATE_SYSTEM__XAXIS_WIDTH = MESH_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>YAxis Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATE_SYSTEM__YAXIS_WIDTH = MESH_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>ZAxis Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATE_SYSTEM__ZAXIS_WIDTH = MESH_NODE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Coordinate System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATE_SYSTEM_FEATURE_COUNT = MESH_NODE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Coordinate System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATE_SYSTEM_OPERATION_COUNT = MESH_NODE_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link de.dc.javafx.xcore.workbench.mesh.MeshContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Container</em>'.
	 * @see de.dc.javafx.xcore.workbench.mesh.MeshContainer
	 * @generated
	 */
	EClass getMeshContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dc.javafx.xcore.workbench.mesh.MeshContainer#getNodes <em>Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nodes</em>'.
	 * @see de.dc.javafx.xcore.workbench.mesh.MeshContainer#getNodes()
	 * @see #getMeshContainer()
	 * @generated
	 */
	EReference getMeshContainer_Nodes();

	/**
	 * Returns the meta object for class '{@link de.dc.javafx.xcore.workbench.mesh.MeshNode <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see de.dc.javafx.xcore.workbench.mesh.MeshNode
	 * @generated
	 */
	EClass getMeshNode();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.javafx.xcore.workbench.mesh.MeshNode#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see de.dc.javafx.xcore.workbench.mesh.MeshNode#getX()
	 * @see #getMeshNode()
	 * @generated
	 */
	EAttribute getMeshNode_X();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.javafx.xcore.workbench.mesh.MeshNode#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see de.dc.javafx.xcore.workbench.mesh.MeshNode#getY()
	 * @see #getMeshNode()
	 * @generated
	 */
	EAttribute getMeshNode_Y();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.javafx.xcore.workbench.mesh.MeshNode#getZ <em>Z</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Z</em>'.
	 * @see de.dc.javafx.xcore.workbench.mesh.MeshNode#getZ()
	 * @see #getMeshNode()
	 * @generated
	 */
	EAttribute getMeshNode_Z();

	/**
	 * Returns the meta object for class '{@link de.dc.javafx.xcore.workbench.mesh.CoordinateSystem <em>Coordinate System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Coordinate System</em>'.
	 * @see de.dc.javafx.xcore.workbench.mesh.CoordinateSystem
	 * @generated
	 */
	EClass getCoordinateSystem();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.javafx.xcore.workbench.mesh.CoordinateSystem#getXAxisWidth <em>XAxis Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>XAxis Width</em>'.
	 * @see de.dc.javafx.xcore.workbench.mesh.CoordinateSystem#getXAxisWidth()
	 * @see #getCoordinateSystem()
	 * @generated
	 */
	EAttribute getCoordinateSystem_XAxisWidth();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.javafx.xcore.workbench.mesh.CoordinateSystem#getYAxisWidth <em>YAxis Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>YAxis Width</em>'.
	 * @see de.dc.javafx.xcore.workbench.mesh.CoordinateSystem#getYAxisWidth()
	 * @see #getCoordinateSystem()
	 * @generated
	 */
	EAttribute getCoordinateSystem_YAxisWidth();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.javafx.xcore.workbench.mesh.CoordinateSystem#getZAxisWidth <em>ZAxis Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ZAxis Width</em>'.
	 * @see de.dc.javafx.xcore.workbench.mesh.CoordinateSystem#getZAxisWidth()
	 * @see #getCoordinateSystem()
	 * @generated
	 */
	EAttribute getCoordinateSystem_ZAxisWidth();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MeshFactory getMeshFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link de.dc.javafx.xcore.workbench.mesh.impl.MeshContainerImpl <em>Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.javafx.xcore.workbench.mesh.impl.MeshContainerImpl
		 * @see de.dc.javafx.xcore.workbench.mesh.impl.MeshPackageImpl#getMeshContainer()
		 * @generated
		 */
		EClass MESH_CONTAINER = eINSTANCE.getMeshContainer();

		/**
		 * The meta object literal for the '<em><b>Nodes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESH_CONTAINER__NODES = eINSTANCE.getMeshContainer_Nodes();

		/**
		 * The meta object literal for the '{@link de.dc.javafx.xcore.workbench.mesh.impl.MeshNodeImpl <em>Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.javafx.xcore.workbench.mesh.impl.MeshNodeImpl
		 * @see de.dc.javafx.xcore.workbench.mesh.impl.MeshPackageImpl#getMeshNode()
		 * @generated
		 */
		EClass MESH_NODE = eINSTANCE.getMeshNode();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESH_NODE__X = eINSTANCE.getMeshNode_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESH_NODE__Y = eINSTANCE.getMeshNode_Y();

		/**
		 * The meta object literal for the '<em><b>Z</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESH_NODE__Z = eINSTANCE.getMeshNode_Z();

		/**
		 * The meta object literal for the '{@link de.dc.javafx.xcore.workbench.mesh.impl.CoordinateSystemImpl <em>Coordinate System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.javafx.xcore.workbench.mesh.impl.CoordinateSystemImpl
		 * @see de.dc.javafx.xcore.workbench.mesh.impl.MeshPackageImpl#getCoordinateSystem()
		 * @generated
		 */
		EClass COORDINATE_SYSTEM = eINSTANCE.getCoordinateSystem();

		/**
		 * The meta object literal for the '<em><b>XAxis Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COORDINATE_SYSTEM__XAXIS_WIDTH = eINSTANCE.getCoordinateSystem_XAxisWidth();

		/**
		 * The meta object literal for the '<em><b>YAxis Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COORDINATE_SYSTEM__YAXIS_WIDTH = eINSTANCE.getCoordinateSystem_YAxisWidth();

		/**
		 * The meta object literal for the '<em><b>ZAxis Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COORDINATE_SYSTEM__ZAXIS_WIDTH = eINSTANCE.getCoordinateSystem_ZAxisWidth();

	}

} //MeshPackage
