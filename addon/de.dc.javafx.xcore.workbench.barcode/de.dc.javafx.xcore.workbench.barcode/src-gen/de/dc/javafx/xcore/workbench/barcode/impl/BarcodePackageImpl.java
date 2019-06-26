/**
 */
package de.dc.javafx.xcore.workbench.barcode.impl;

import de.dc.javafx.xcore.workbench.barcode.BarcodeFX;
import de.dc.javafx.xcore.workbench.barcode.BarcodeFXProject;
import de.dc.javafx.xcore.workbench.barcode.BarcodeFactory;
import de.dc.javafx.xcore.workbench.barcode.BarcodePackage;
import de.dc.javafx.xcore.workbench.barcode.QRCodeFX;

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
public class BarcodePackageImpl extends EPackageImpl implements BarcodePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass barcodeFXProjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass barcodeFXEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass qrCodeFXEClass = null;

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
	 * @see de.dc.javafx.xcore.workbench.barcode.BarcodePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private BarcodePackageImpl() {
		super(eNS_URI, BarcodeFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link BarcodePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static BarcodePackage init() {
		if (isInited)
			return (BarcodePackage) EPackage.Registry.INSTANCE.getEPackage(BarcodePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredBarcodePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		BarcodePackageImpl theBarcodePackage = registeredBarcodePackage instanceof BarcodePackageImpl
				? (BarcodePackageImpl) registeredBarcodePackage
				: new BarcodePackageImpl();

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theBarcodePackage.createPackageContents();

		// Initialize created meta-data
		theBarcodePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theBarcodePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(BarcodePackage.eNS_URI, theBarcodePackage);
		return theBarcodePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBarcodeFXProject() {
		return barcodeFXProjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBarcodeFXProject_Barcodes() {
		return (EReference) barcodeFXProjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBarcodeFX() {
		return barcodeFXEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBarcodeFX_Name() {
		return (EAttribute) barcodeFXEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getQRCodeFX() {
		return qrCodeFXEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BarcodeFactory getBarcodeFactory() {
		return (BarcodeFactory) getEFactoryInstance();
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
		barcodeFXProjectEClass = createEClass(BARCODE_FX_PROJECT);
		createEReference(barcodeFXProjectEClass, BARCODE_FX_PROJECT__BARCODES);

		barcodeFXEClass = createEClass(BARCODE_FX);
		createEAttribute(barcodeFXEClass, BARCODE_FX__NAME);

		qrCodeFXEClass = createEClass(QR_CODE_FX);
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
		qrCodeFXEClass.getESuperTypes().add(this.getBarcodeFX());

		// Initialize classes, features, and operations; add parameters
		initEClass(barcodeFXProjectEClass, BarcodeFXProject.class, "BarcodeFXProject", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBarcodeFXProject_Barcodes(), this.getBarcodeFX(), null, "barcodes", null, 0, -1,
				BarcodeFXProject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(barcodeFXEClass, BarcodeFX.class, "BarcodeFX", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBarcodeFX_Name(), theEcorePackage.getEString(), "name", null, 0, 1, BarcodeFX.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(qrCodeFXEClass, QRCodeFX.class, "QRCodeFX", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //BarcodePackageImpl
