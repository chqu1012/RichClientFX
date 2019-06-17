/**
 */
package de.dc.javafx.xcore.workbench.ide.model.impl;

import de.dc.javafx.xcore.workbench.ide.model.IdeContainer;
import de.dc.javafx.xcore.workbench.ide.model.IdeFactory;
import de.dc.javafx.xcore.workbench.ide.model.IdePackage;

import org.eclipse.emf.common.notify.AdapterFactory;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class IdePackageImpl extends EPackageImpl implements IdePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ideContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType modelEFactoryEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType modelEPackageEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType adapterEFactoryEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType rendererEDataType = null;

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
	 * @see de.dc.javafx.xcore.workbench.ide.model.IdePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private IdePackageImpl() {
		super(eNS_URI, IdeFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link IdePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static IdePackage init() {
		if (isInited)
			return (IdePackage) EPackage.Registry.INSTANCE.getEPackage(IdePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredIdePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		IdePackageImpl theIdePackage = registeredIdePackage instanceof IdePackageImpl
				? (IdePackageImpl) registeredIdePackage
				: new IdePackageImpl();

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theIdePackage.createPackageContents();

		// Initialize created meta-data
		theIdePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theIdePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(IdePackage.eNS_URI, theIdePackage);
		return theIdePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIdeContainer() {
		return ideContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIdeContainer_PackagePath() {
		return (EAttribute) ideContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIdeContainer_Name() {
		return (EAttribute) ideContainerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIdeContainer_ModelName() {
		return (EAttribute) ideContainerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIdeContainer_Ext() {
		return (EAttribute) ideContainerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIdeContainer_PreviewName() {
		return (EAttribute) ideContainerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIdeContainer_ModelEFactory() {
		return (EAttribute) ideContainerEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIdeContainer_ModelEPackage() {
		return (EAttribute) ideContainerEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIdeContainer_ModelItemProviderAdapterFactor() {
		return (EAttribute) ideContainerEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIdeContainer_Renderer() {
		return (EAttribute) ideContainerEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getModelEFactory() {
		return modelEFactoryEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getModelEPackage() {
		return modelEPackageEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getAdapterEFactory() {
		return adapterEFactoryEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getRenderer() {
		return rendererEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IdeFactory getIdeFactory() {
		return (IdeFactory) getEFactoryInstance();
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
		ideContainerEClass = createEClass(IDE_CONTAINER);
		createEAttribute(ideContainerEClass, IDE_CONTAINER__PACKAGE_PATH);
		createEAttribute(ideContainerEClass, IDE_CONTAINER__NAME);
		createEAttribute(ideContainerEClass, IDE_CONTAINER__MODEL_NAME);
		createEAttribute(ideContainerEClass, IDE_CONTAINER__EXT);
		createEAttribute(ideContainerEClass, IDE_CONTAINER__PREVIEW_NAME);
		createEAttribute(ideContainerEClass, IDE_CONTAINER__MODEL_EFACTORY);
		createEAttribute(ideContainerEClass, IDE_CONTAINER__MODEL_EPACKAGE);
		createEAttribute(ideContainerEClass, IDE_CONTAINER__MODEL_ITEM_PROVIDER_ADAPTER_FACTOR);
		createEAttribute(ideContainerEClass, IDE_CONTAINER__RENDERER);

		// Create data types
		modelEFactoryEDataType = createEDataType(MODEL_EFACTORY);
		modelEPackageEDataType = createEDataType(MODEL_EPACKAGE);
		adapterEFactoryEDataType = createEDataType(ADAPTER_EFACTORY);
		rendererEDataType = createEDataType(RENDERER);
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

		// Initialize classes, features, and operations; add parameters
		initEClass(ideContainerEClass, IdeContainer.class, "IdeContainer", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIdeContainer_PackagePath(), theEcorePackage.getEString(), "packagePath", null, 0, 1,
				IdeContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getIdeContainer_Name(), theEcorePackage.getEString(), "name", null, 0, 1, IdeContainer.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getIdeContainer_ModelName(), theEcorePackage.getEString(), "modelName", null, 0, 1,
				IdeContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getIdeContainer_Ext(), theEcorePackage.getEString(), "ext", null, 0, 1, IdeContainer.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getIdeContainer_PreviewName(), theEcorePackage.getEString(), "previewName", null, 0, 1,
				IdeContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getIdeContainer_ModelEFactory(), this.getModelEFactory(), "modelEFactory", null, 0, 1,
				IdeContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getIdeContainer_ModelEPackage(), this.getModelEPackage(), "modelEPackage", null, 0, 1,
				IdeContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getIdeContainer_ModelItemProviderAdapterFactor(), this.getAdapterEFactory(),
				"modelItemProviderAdapterFactor", null, 0, 1, IdeContainer.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIdeContainer_Renderer(), this.getRenderer(), "renderer", null, 0, 1, IdeContainer.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		// Initialize data types
		initEDataType(modelEFactoryEDataType, EFactory.class, "ModelEFactory", IS_SERIALIZABLE,
				!IS_GENERATED_INSTANCE_CLASS);
		initEDataType(modelEPackageEDataType, EPackage.class, "ModelEPackage", IS_SERIALIZABLE,
				!IS_GENERATED_INSTANCE_CLASS);
		initEDataType(adapterEFactoryEDataType, AdapterFactory.class, "AdapterEFactory", IS_SERIALIZABLE,
				!IS_GENERATED_INSTANCE_CLASS);
		initEDataType(rendererEDataType, Switch.class, "Renderer", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //IdePackageImpl
