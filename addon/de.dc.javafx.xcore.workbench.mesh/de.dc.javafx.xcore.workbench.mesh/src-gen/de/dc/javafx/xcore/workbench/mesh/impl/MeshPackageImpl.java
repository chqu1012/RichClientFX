/**
 */
package de.dc.javafx.xcore.workbench.mesh.impl;

import de.dc.javafx.xcore.workbench.mesh.BoxFX;
import de.dc.javafx.xcore.workbench.mesh.CameraFX;
import de.dc.javafx.xcore.workbench.mesh.CoordinateSystem;
import de.dc.javafx.xcore.workbench.mesh.MeshContainer;
import de.dc.javafx.xcore.workbench.mesh.MeshFactory;
import de.dc.javafx.xcore.workbench.mesh.MeshNode;
import de.dc.javafx.xcore.workbench.mesh.MeshPackage;
import de.dc.javafx.xcore.workbench.mesh.ShapeFX;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MeshPackageImpl extends EPackageImpl implements MeshPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass meshContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cameraFXEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass meshNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass coordinateSystemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass shapeFXEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass boxFXEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see de.dc.javafx.xcore.workbench.mesh.MeshPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MeshPackageImpl() {
		super(eNS_URI, MeshFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link MeshPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static MeshPackage init() {
		if (isInited)
			return (MeshPackage) EPackage.Registry.INSTANCE.getEPackage(MeshPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredMeshPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		MeshPackageImpl theMeshPackage = registeredMeshPackage instanceof MeshPackageImpl
				? (MeshPackageImpl) registeredMeshPackage
				: new MeshPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theMeshPackage.createPackageContents();

		// Initialize created meta-data
		theMeshPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theMeshPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MeshPackage.eNS_URI, theMeshPackage);
		return theMeshPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMeshContainer() {
		return meshContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMeshContainer_Nodes() {
		return (EReference) meshContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMeshContainer_Camera() {
		return (EReference) meshContainerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCameraFX() {
		return cameraFXEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMeshNode() {
		return meshNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMeshNode_TranslateX() {
		return (EAttribute) meshNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMeshNode_TranslateY() {
		return (EAttribute) meshNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMeshNode_TranslateZ() {
		return (EAttribute) meshNodeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCoordinateSystem() {
		return coordinateSystemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCoordinateSystem_XAxisWidth() {
		return (EAttribute) coordinateSystemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCoordinateSystem_YAxisWidth() {
		return (EAttribute) coordinateSystemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCoordinateSystem_ZAxisWidth() {
		return (EAttribute) coordinateSystemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCoordinateSystem_Shapes() {
		return (EReference) coordinateSystemEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getShapeFX() {
		return shapeFXEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBoxFX() {
		return boxFXEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBoxFX_Width() {
		return (EAttribute) boxFXEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBoxFX_Height() {
		return (EAttribute) boxFXEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBoxFX_Depth() {
		return (EAttribute) boxFXEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MeshFactory getMeshFactory() {
		return (MeshFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		meshContainerEClass = createEClass(MESH_CONTAINER);
		createEReference(meshContainerEClass, MESH_CONTAINER__NODES);
		createEReference(meshContainerEClass, MESH_CONTAINER__CAMERA);

		cameraFXEClass = createEClass(CAMERA_FX);

		meshNodeEClass = createEClass(MESH_NODE);
		createEAttribute(meshNodeEClass, MESH_NODE__TRANSLATE_X);
		createEAttribute(meshNodeEClass, MESH_NODE__TRANSLATE_Y);
		createEAttribute(meshNodeEClass, MESH_NODE__TRANSLATE_Z);

		coordinateSystemEClass = createEClass(COORDINATE_SYSTEM);
		createEAttribute(coordinateSystemEClass, COORDINATE_SYSTEM__XAXIS_WIDTH);
		createEAttribute(coordinateSystemEClass, COORDINATE_SYSTEM__YAXIS_WIDTH);
		createEAttribute(coordinateSystemEClass, COORDINATE_SYSTEM__ZAXIS_WIDTH);
		createEReference(coordinateSystemEClass, COORDINATE_SYSTEM__SHAPES);

		shapeFXEClass = createEClass(SHAPE_FX);

		boxFXEClass = createEClass(BOX_FX);
		createEAttribute(boxFXEClass, BOX_FX__WIDTH);
		createEAttribute(boxFXEClass, BOX_FX__HEIGHT);
		createEAttribute(boxFXEClass, BOX_FX__DEPTH);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		EcorePackage theEcorePackage = (EcorePackage) EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		cameraFXEClass.getESuperTypes().add(this.getMeshNode());
		coordinateSystemEClass.getESuperTypes().add(this.getMeshNode());
		shapeFXEClass.getESuperTypes().add(this.getMeshNode());
		boxFXEClass.getESuperTypes().add(this.getShapeFX());

		// Initialize classes, features, and operations; add parameters
		initEClass(meshContainerEClass, MeshContainer.class, "MeshContainer", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMeshContainer_Nodes(), this.getMeshNode(), null, "nodes", null, 0, -1, MeshContainer.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMeshContainer_Camera(), this.getCameraFX(), null, "camera", null, 0, 1, MeshContainer.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cameraFXEClass, CameraFX.class, "CameraFX", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(meshNodeEClass, MeshNode.class, "MeshNode", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMeshNode_TranslateX(), theEcorePackage.getEDouble(), "translateX", "0", 0, 1, MeshNode.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getMeshNode_TranslateY(), theEcorePackage.getEDouble(), "translateY", "0", 0, 1, MeshNode.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getMeshNode_TranslateZ(), theEcorePackage.getEDouble(), "translateZ", "0", 0, 1, MeshNode.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(coordinateSystemEClass, CoordinateSystem.class, "CoordinateSystem", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCoordinateSystem_XAxisWidth(), theEcorePackage.getEDouble(), "xAxisWidth", "100", 0, 1,
				CoordinateSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getCoordinateSystem_YAxisWidth(), theEcorePackage.getEDouble(), "yAxisWidth", "100", 0, 1,
				CoordinateSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getCoordinateSystem_ZAxisWidth(), theEcorePackage.getEDouble(), "zAxisWidth", "100", 0, 1,
				CoordinateSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getCoordinateSystem_Shapes(), this.getShapeFX(), null, "shapes", null, 0, -1,
				CoordinateSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(shapeFXEClass, ShapeFX.class, "ShapeFX", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(boxFXEClass, BoxFX.class, "BoxFX", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBoxFX_Width(), theEcorePackage.getEDouble(), "width", "100", 0, 1, BoxFX.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBoxFX_Height(), theEcorePackage.getEDouble(), "height", "100", 0, 1, BoxFX.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getBoxFX_Depth(), theEcorePackage.getEDouble(), "depth", "100", 0, 1, BoxFX.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //MeshPackageImpl
