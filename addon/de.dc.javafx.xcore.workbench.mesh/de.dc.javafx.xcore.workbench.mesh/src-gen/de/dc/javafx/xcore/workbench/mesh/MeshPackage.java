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
	 * The feature id for the '<em><b>Camera</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESH_CONTAINER__CAMERA = 1;

	/**
	 * The feature id for the '<em><b>Point Light</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESH_CONTAINER__POINT_LIGHT = 2;

	/**
	 * The number of structural features of the '<em>Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESH_CONTAINER_FEATURE_COUNT = 3;

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
	int MESH_NODE = 3;

	/**
	 * The feature id for the '<em><b>Translate X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESH_NODE__TRANSLATE_X = 0;

	/**
	 * The feature id for the '<em><b>Translate Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESH_NODE__TRANSLATE_Y = 1;

	/**
	 * The feature id for the '<em><b>Translate Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESH_NODE__TRANSLATE_Z = 2;

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
	 * The meta object id for the '{@link de.dc.javafx.xcore.workbench.mesh.impl.PointLightFXImpl <em>Point Light FX</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.javafx.xcore.workbench.mesh.impl.PointLightFXImpl
	 * @see de.dc.javafx.xcore.workbench.mesh.impl.MeshPackageImpl#getPointLightFX()
	 * @generated
	 */
	int POINT_LIGHT_FX = 1;

	/**
	 * The feature id for the '<em><b>Translate X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_LIGHT_FX__TRANSLATE_X = MESH_NODE__TRANSLATE_X;

	/**
	 * The feature id for the '<em><b>Translate Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_LIGHT_FX__TRANSLATE_Y = MESH_NODE__TRANSLATE_Y;

	/**
	 * The feature id for the '<em><b>Translate Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_LIGHT_FX__TRANSLATE_Z = MESH_NODE__TRANSLATE_Z;

	/**
	 * The number of structural features of the '<em>Point Light FX</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_LIGHT_FX_FEATURE_COUNT = MESH_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Point Light FX</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_LIGHT_FX_OPERATION_COUNT = MESH_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dc.javafx.xcore.workbench.mesh.impl.CameraFXImpl <em>Camera FX</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.javafx.xcore.workbench.mesh.impl.CameraFXImpl
	 * @see de.dc.javafx.xcore.workbench.mesh.impl.MeshPackageImpl#getCameraFX()
	 * @generated
	 */
	int CAMERA_FX = 2;

	/**
	 * The feature id for the '<em><b>Translate X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA_FX__TRANSLATE_X = MESH_NODE__TRANSLATE_X;

	/**
	 * The feature id for the '<em><b>Translate Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA_FX__TRANSLATE_Y = MESH_NODE__TRANSLATE_Y;

	/**
	 * The feature id for the '<em><b>Translate Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA_FX__TRANSLATE_Z = MESH_NODE__TRANSLATE_Z;

	/**
	 * The number of structural features of the '<em>Camera FX</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA_FX_FEATURE_COUNT = MESH_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Camera FX</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA_FX_OPERATION_COUNT = MESH_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dc.javafx.xcore.workbench.mesh.impl.CoordinateSystemImpl <em>Coordinate System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.javafx.xcore.workbench.mesh.impl.CoordinateSystemImpl
	 * @see de.dc.javafx.xcore.workbench.mesh.impl.MeshPackageImpl#getCoordinateSystem()
	 * @generated
	 */
	int COORDINATE_SYSTEM = 4;

	/**
	 * The feature id for the '<em><b>Translate X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATE_SYSTEM__TRANSLATE_X = MESH_NODE__TRANSLATE_X;

	/**
	 * The feature id for the '<em><b>Translate Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATE_SYSTEM__TRANSLATE_Y = MESH_NODE__TRANSLATE_Y;

	/**
	 * The feature id for the '<em><b>Translate Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATE_SYSTEM__TRANSLATE_Z = MESH_NODE__TRANSLATE_Z;

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
	 * The feature id for the '<em><b>Shapes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATE_SYSTEM__SHAPES = MESH_NODE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Coordinate System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATE_SYSTEM_FEATURE_COUNT = MESH_NODE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Coordinate System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATE_SYSTEM_OPERATION_COUNT = MESH_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dc.javafx.xcore.workbench.mesh.impl.ShapeFXImpl <em>Shape FX</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.javafx.xcore.workbench.mesh.impl.ShapeFXImpl
	 * @see de.dc.javafx.xcore.workbench.mesh.impl.MeshPackageImpl#getShapeFX()
	 * @generated
	 */
	int SHAPE_FX = 5;

	/**
	 * The feature id for the '<em><b>Translate X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE_FX__TRANSLATE_X = MESH_NODE__TRANSLATE_X;

	/**
	 * The feature id for the '<em><b>Translate Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE_FX__TRANSLATE_Y = MESH_NODE__TRANSLATE_Y;

	/**
	 * The feature id for the '<em><b>Translate Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE_FX__TRANSLATE_Z = MESH_NODE__TRANSLATE_Z;

	/**
	 * The number of structural features of the '<em>Shape FX</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE_FX_FEATURE_COUNT = MESH_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Shape FX</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE_FX_OPERATION_COUNT = MESH_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dc.javafx.xcore.workbench.mesh.impl.BoxFXImpl <em>Box FX</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.javafx.xcore.workbench.mesh.impl.BoxFXImpl
	 * @see de.dc.javafx.xcore.workbench.mesh.impl.MeshPackageImpl#getBoxFX()
	 * @generated
	 */
	int BOX_FX = 6;

	/**
	 * The feature id for the '<em><b>Translate X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOX_FX__TRANSLATE_X = SHAPE_FX__TRANSLATE_X;

	/**
	 * The feature id for the '<em><b>Translate Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOX_FX__TRANSLATE_Y = SHAPE_FX__TRANSLATE_Y;

	/**
	 * The feature id for the '<em><b>Translate Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOX_FX__TRANSLATE_Z = SHAPE_FX__TRANSLATE_Z;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOX_FX__WIDTH = SHAPE_FX_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOX_FX__HEIGHT = SHAPE_FX_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Depth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOX_FX__DEPTH = SHAPE_FX_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Box FX</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOX_FX_FEATURE_COUNT = SHAPE_FX_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Box FX</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOX_FX_OPERATION_COUNT = SHAPE_FX_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dc.javafx.xcore.workbench.mesh.impl.CylinderFXImpl <em>Cylinder FX</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.javafx.xcore.workbench.mesh.impl.CylinderFXImpl
	 * @see de.dc.javafx.xcore.workbench.mesh.impl.MeshPackageImpl#getCylinderFX()
	 * @generated
	 */
	int CYLINDER_FX = 7;

	/**
	 * The feature id for the '<em><b>Translate X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYLINDER_FX__TRANSLATE_X = SHAPE_FX__TRANSLATE_X;

	/**
	 * The feature id for the '<em><b>Translate Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYLINDER_FX__TRANSLATE_Y = SHAPE_FX__TRANSLATE_Y;

	/**
	 * The feature id for the '<em><b>Translate Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYLINDER_FX__TRANSLATE_Z = SHAPE_FX__TRANSLATE_Z;

	/**
	 * The feature id for the '<em><b>Radius</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYLINDER_FX__RADIUS = SHAPE_FX_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYLINDER_FX__HEIGHT = SHAPE_FX_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Cylinder FX</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYLINDER_FX_FEATURE_COUNT = SHAPE_FX_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Cylinder FX</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYLINDER_FX_OPERATION_COUNT = SHAPE_FX_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dc.javafx.xcore.workbench.mesh.impl.SphereFXImpl <em>Sphere FX</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.javafx.xcore.workbench.mesh.impl.SphereFXImpl
	 * @see de.dc.javafx.xcore.workbench.mesh.impl.MeshPackageImpl#getSphereFX()
	 * @generated
	 */
	int SPHERE_FX = 8;

	/**
	 * The feature id for the '<em><b>Translate X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPHERE_FX__TRANSLATE_X = SHAPE_FX__TRANSLATE_X;

	/**
	 * The feature id for the '<em><b>Translate Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPHERE_FX__TRANSLATE_Y = SHAPE_FX__TRANSLATE_Y;

	/**
	 * The feature id for the '<em><b>Translate Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPHERE_FX__TRANSLATE_Z = SHAPE_FX__TRANSLATE_Z;

	/**
	 * The feature id for the '<em><b>Radius</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPHERE_FX__RADIUS = SHAPE_FX_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Sphere FX</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPHERE_FX_FEATURE_COUNT = SHAPE_FX_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Sphere FX</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPHERE_FX_OPERATION_COUNT = SHAPE_FX_OPERATION_COUNT + 0;

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
	 * Returns the meta object for the containment reference '{@link de.dc.javafx.xcore.workbench.mesh.MeshContainer#getCamera <em>Camera</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Camera</em>'.
	 * @see de.dc.javafx.xcore.workbench.mesh.MeshContainer#getCamera()
	 * @see #getMeshContainer()
	 * @generated
	 */
	EReference getMeshContainer_Camera();

	/**
	 * Returns the meta object for the containment reference '{@link de.dc.javafx.xcore.workbench.mesh.MeshContainer#getPointLight <em>Point Light</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Point Light</em>'.
	 * @see de.dc.javafx.xcore.workbench.mesh.MeshContainer#getPointLight()
	 * @see #getMeshContainer()
	 * @generated
	 */
	EReference getMeshContainer_PointLight();

	/**
	 * Returns the meta object for class '{@link de.dc.javafx.xcore.workbench.mesh.PointLightFX <em>Point Light FX</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Point Light FX</em>'.
	 * @see de.dc.javafx.xcore.workbench.mesh.PointLightFX
	 * @generated
	 */
	EClass getPointLightFX();

	/**
	 * Returns the meta object for class '{@link de.dc.javafx.xcore.workbench.mesh.CameraFX <em>Camera FX</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Camera FX</em>'.
	 * @see de.dc.javafx.xcore.workbench.mesh.CameraFX
	 * @generated
	 */
	EClass getCameraFX();

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
	 * Returns the meta object for the attribute '{@link de.dc.javafx.xcore.workbench.mesh.MeshNode#getTranslateX <em>Translate X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Translate X</em>'.
	 * @see de.dc.javafx.xcore.workbench.mesh.MeshNode#getTranslateX()
	 * @see #getMeshNode()
	 * @generated
	 */
	EAttribute getMeshNode_TranslateX();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.javafx.xcore.workbench.mesh.MeshNode#getTranslateY <em>Translate Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Translate Y</em>'.
	 * @see de.dc.javafx.xcore.workbench.mesh.MeshNode#getTranslateY()
	 * @see #getMeshNode()
	 * @generated
	 */
	EAttribute getMeshNode_TranslateY();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.javafx.xcore.workbench.mesh.MeshNode#getTranslateZ <em>Translate Z</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Translate Z</em>'.
	 * @see de.dc.javafx.xcore.workbench.mesh.MeshNode#getTranslateZ()
	 * @see #getMeshNode()
	 * @generated
	 */
	EAttribute getMeshNode_TranslateZ();

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
	 * Returns the meta object for the containment reference list '{@link de.dc.javafx.xcore.workbench.mesh.CoordinateSystem#getShapes <em>Shapes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Shapes</em>'.
	 * @see de.dc.javafx.xcore.workbench.mesh.CoordinateSystem#getShapes()
	 * @see #getCoordinateSystem()
	 * @generated
	 */
	EReference getCoordinateSystem_Shapes();

	/**
	 * Returns the meta object for class '{@link de.dc.javafx.xcore.workbench.mesh.ShapeFX <em>Shape FX</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shape FX</em>'.
	 * @see de.dc.javafx.xcore.workbench.mesh.ShapeFX
	 * @generated
	 */
	EClass getShapeFX();

	/**
	 * Returns the meta object for class '{@link de.dc.javafx.xcore.workbench.mesh.BoxFX <em>Box FX</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Box FX</em>'.
	 * @see de.dc.javafx.xcore.workbench.mesh.BoxFX
	 * @generated
	 */
	EClass getBoxFX();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.javafx.xcore.workbench.mesh.BoxFX#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see de.dc.javafx.xcore.workbench.mesh.BoxFX#getWidth()
	 * @see #getBoxFX()
	 * @generated
	 */
	EAttribute getBoxFX_Width();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.javafx.xcore.workbench.mesh.BoxFX#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see de.dc.javafx.xcore.workbench.mesh.BoxFX#getHeight()
	 * @see #getBoxFX()
	 * @generated
	 */
	EAttribute getBoxFX_Height();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.javafx.xcore.workbench.mesh.BoxFX#getDepth <em>Depth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Depth</em>'.
	 * @see de.dc.javafx.xcore.workbench.mesh.BoxFX#getDepth()
	 * @see #getBoxFX()
	 * @generated
	 */
	EAttribute getBoxFX_Depth();

	/**
	 * Returns the meta object for class '{@link de.dc.javafx.xcore.workbench.mesh.CylinderFX <em>Cylinder FX</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cylinder FX</em>'.
	 * @see de.dc.javafx.xcore.workbench.mesh.CylinderFX
	 * @generated
	 */
	EClass getCylinderFX();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.javafx.xcore.workbench.mesh.CylinderFX#getRadius <em>Radius</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Radius</em>'.
	 * @see de.dc.javafx.xcore.workbench.mesh.CylinderFX#getRadius()
	 * @see #getCylinderFX()
	 * @generated
	 */
	EAttribute getCylinderFX_Radius();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.javafx.xcore.workbench.mesh.CylinderFX#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see de.dc.javafx.xcore.workbench.mesh.CylinderFX#getHeight()
	 * @see #getCylinderFX()
	 * @generated
	 */
	EAttribute getCylinderFX_Height();

	/**
	 * Returns the meta object for class '{@link de.dc.javafx.xcore.workbench.mesh.SphereFX <em>Sphere FX</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sphere FX</em>'.
	 * @see de.dc.javafx.xcore.workbench.mesh.SphereFX
	 * @generated
	 */
	EClass getSphereFX();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.javafx.xcore.workbench.mesh.SphereFX#getRadius <em>Radius</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Radius</em>'.
	 * @see de.dc.javafx.xcore.workbench.mesh.SphereFX#getRadius()
	 * @see #getSphereFX()
	 * @generated
	 */
	EAttribute getSphereFX_Radius();

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
		 * The meta object literal for the '<em><b>Camera</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESH_CONTAINER__CAMERA = eINSTANCE.getMeshContainer_Camera();

		/**
		 * The meta object literal for the '<em><b>Point Light</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESH_CONTAINER__POINT_LIGHT = eINSTANCE.getMeshContainer_PointLight();

		/**
		 * The meta object literal for the '{@link de.dc.javafx.xcore.workbench.mesh.impl.PointLightFXImpl <em>Point Light FX</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.javafx.xcore.workbench.mesh.impl.PointLightFXImpl
		 * @see de.dc.javafx.xcore.workbench.mesh.impl.MeshPackageImpl#getPointLightFX()
		 * @generated
		 */
		EClass POINT_LIGHT_FX = eINSTANCE.getPointLightFX();

		/**
		 * The meta object literal for the '{@link de.dc.javafx.xcore.workbench.mesh.impl.CameraFXImpl <em>Camera FX</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.javafx.xcore.workbench.mesh.impl.CameraFXImpl
		 * @see de.dc.javafx.xcore.workbench.mesh.impl.MeshPackageImpl#getCameraFX()
		 * @generated
		 */
		EClass CAMERA_FX = eINSTANCE.getCameraFX();

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
		 * The meta object literal for the '<em><b>Translate X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESH_NODE__TRANSLATE_X = eINSTANCE.getMeshNode_TranslateX();

		/**
		 * The meta object literal for the '<em><b>Translate Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESH_NODE__TRANSLATE_Y = eINSTANCE.getMeshNode_TranslateY();

		/**
		 * The meta object literal for the '<em><b>Translate Z</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESH_NODE__TRANSLATE_Z = eINSTANCE.getMeshNode_TranslateZ();

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

		/**
		 * The meta object literal for the '<em><b>Shapes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COORDINATE_SYSTEM__SHAPES = eINSTANCE.getCoordinateSystem_Shapes();

		/**
		 * The meta object literal for the '{@link de.dc.javafx.xcore.workbench.mesh.impl.ShapeFXImpl <em>Shape FX</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.javafx.xcore.workbench.mesh.impl.ShapeFXImpl
		 * @see de.dc.javafx.xcore.workbench.mesh.impl.MeshPackageImpl#getShapeFX()
		 * @generated
		 */
		EClass SHAPE_FX = eINSTANCE.getShapeFX();

		/**
		 * The meta object literal for the '{@link de.dc.javafx.xcore.workbench.mesh.impl.BoxFXImpl <em>Box FX</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.javafx.xcore.workbench.mesh.impl.BoxFXImpl
		 * @see de.dc.javafx.xcore.workbench.mesh.impl.MeshPackageImpl#getBoxFX()
		 * @generated
		 */
		EClass BOX_FX = eINSTANCE.getBoxFX();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOX_FX__WIDTH = eINSTANCE.getBoxFX_Width();

		/**
		 * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOX_FX__HEIGHT = eINSTANCE.getBoxFX_Height();

		/**
		 * The meta object literal for the '<em><b>Depth</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOX_FX__DEPTH = eINSTANCE.getBoxFX_Depth();

		/**
		 * The meta object literal for the '{@link de.dc.javafx.xcore.workbench.mesh.impl.CylinderFXImpl <em>Cylinder FX</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.javafx.xcore.workbench.mesh.impl.CylinderFXImpl
		 * @see de.dc.javafx.xcore.workbench.mesh.impl.MeshPackageImpl#getCylinderFX()
		 * @generated
		 */
		EClass CYLINDER_FX = eINSTANCE.getCylinderFX();

		/**
		 * The meta object literal for the '<em><b>Radius</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CYLINDER_FX__RADIUS = eINSTANCE.getCylinderFX_Radius();

		/**
		 * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CYLINDER_FX__HEIGHT = eINSTANCE.getCylinderFX_Height();

		/**
		 * The meta object literal for the '{@link de.dc.javafx.xcore.workbench.mesh.impl.SphereFXImpl <em>Sphere FX</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.javafx.xcore.workbench.mesh.impl.SphereFXImpl
		 * @see de.dc.javafx.xcore.workbench.mesh.impl.MeshPackageImpl#getSphereFX()
		 * @generated
		 */
		EClass SPHERE_FX = eINSTANCE.getSphereFX();

		/**
		 * The meta object literal for the '<em><b>Radius</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPHERE_FX__RADIUS = eINSTANCE.getSphereFX_Radius();

	}

} //MeshPackage
