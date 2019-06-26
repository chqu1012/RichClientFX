/**
 */
package de.dc.javafx.xcore.workbench.barcode;

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
 * @see de.dc.javafx.xcore.workbench.barcode.BarcodeFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel multipleEditorPages='false' creationIcons='false' editDirectory='/de.dc.javafx.xcore.workbench.barcode.edit/src-gen' editorDirectory='/de.dc.javafx.xcore.workbench.barcode.editor/src-gen' richClientPlatform='true' codeFormatting='true' importerID='org.eclipse.emf.importer.ecore' runtimePlatform='RCP' fileExtensions='barcode' tableProviders='true' dataTypeConverters='true' basePackage='de.dc.javafx.xcore.workbench'"
 * @generated
 */
public interface BarcodePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "barcode";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.frateranatis.org/workbench/barcode";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "barcode";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BarcodePackage eINSTANCE = de.dc.javafx.xcore.workbench.barcode.impl.BarcodePackageImpl.init();

	/**
	 * The meta object id for the '{@link de.dc.javafx.xcore.workbench.barcode.impl.BarcodeFXProjectImpl <em>FX Project</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.javafx.xcore.workbench.barcode.impl.BarcodeFXProjectImpl
	 * @see de.dc.javafx.xcore.workbench.barcode.impl.BarcodePackageImpl#getBarcodeFXProject()
	 * @generated
	 */
	int BARCODE_FX_PROJECT = 0;

	/**
	 * The feature id for the '<em><b>Barcodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BARCODE_FX_PROJECT__BARCODES = 0;

	/**
	 * The number of structural features of the '<em>FX Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BARCODE_FX_PROJECT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>FX Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BARCODE_FX_PROJECT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dc.javafx.xcore.workbench.barcode.impl.BarcodeFXImpl <em>FX</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.javafx.xcore.workbench.barcode.impl.BarcodeFXImpl
	 * @see de.dc.javafx.xcore.workbench.barcode.impl.BarcodePackageImpl#getBarcodeFX()
	 * @generated
	 */
	int BARCODE_FX = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BARCODE_FX__NAME = 0;

	/**
	 * The number of structural features of the '<em>FX</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BARCODE_FX_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>FX</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BARCODE_FX_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dc.javafx.xcore.workbench.barcode.impl.QRCodeFXImpl <em>QR Code FX</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.javafx.xcore.workbench.barcode.impl.QRCodeFXImpl
	 * @see de.dc.javafx.xcore.workbench.barcode.impl.BarcodePackageImpl#getQRCodeFX()
	 * @generated
	 */
	int QR_CODE_FX = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QR_CODE_FX__NAME = BARCODE_FX__NAME;

	/**
	 * The number of structural features of the '<em>QR Code FX</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QR_CODE_FX_FEATURE_COUNT = BARCODE_FX_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>QR Code FX</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QR_CODE_FX_OPERATION_COUNT = BARCODE_FX_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link de.dc.javafx.xcore.workbench.barcode.BarcodeFXProject <em>FX Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>FX Project</em>'.
	 * @see de.dc.javafx.xcore.workbench.barcode.BarcodeFXProject
	 * @generated
	 */
	EClass getBarcodeFXProject();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dc.javafx.xcore.workbench.barcode.BarcodeFXProject#getBarcodes <em>Barcodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Barcodes</em>'.
	 * @see de.dc.javafx.xcore.workbench.barcode.BarcodeFXProject#getBarcodes()
	 * @see #getBarcodeFXProject()
	 * @generated
	 */
	EReference getBarcodeFXProject_Barcodes();

	/**
	 * Returns the meta object for class '{@link de.dc.javafx.xcore.workbench.barcode.BarcodeFX <em>FX</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>FX</em>'.
	 * @see de.dc.javafx.xcore.workbench.barcode.BarcodeFX
	 * @generated
	 */
	EClass getBarcodeFX();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.javafx.xcore.workbench.barcode.BarcodeFX#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.dc.javafx.xcore.workbench.barcode.BarcodeFX#getName()
	 * @see #getBarcodeFX()
	 * @generated
	 */
	EAttribute getBarcodeFX_Name();

	/**
	 * Returns the meta object for class '{@link de.dc.javafx.xcore.workbench.barcode.QRCodeFX <em>QR Code FX</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>QR Code FX</em>'.
	 * @see de.dc.javafx.xcore.workbench.barcode.QRCodeFX
	 * @generated
	 */
	EClass getQRCodeFX();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	BarcodeFactory getBarcodeFactory();

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
		 * The meta object literal for the '{@link de.dc.javafx.xcore.workbench.barcode.impl.BarcodeFXProjectImpl <em>FX Project</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.javafx.xcore.workbench.barcode.impl.BarcodeFXProjectImpl
		 * @see de.dc.javafx.xcore.workbench.barcode.impl.BarcodePackageImpl#getBarcodeFXProject()
		 * @generated
		 */
		EClass BARCODE_FX_PROJECT = eINSTANCE.getBarcodeFXProject();

		/**
		 * The meta object literal for the '<em><b>Barcodes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BARCODE_FX_PROJECT__BARCODES = eINSTANCE.getBarcodeFXProject_Barcodes();

		/**
		 * The meta object literal for the '{@link de.dc.javafx.xcore.workbench.barcode.impl.BarcodeFXImpl <em>FX</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.javafx.xcore.workbench.barcode.impl.BarcodeFXImpl
		 * @see de.dc.javafx.xcore.workbench.barcode.impl.BarcodePackageImpl#getBarcodeFX()
		 * @generated
		 */
		EClass BARCODE_FX = eINSTANCE.getBarcodeFX();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BARCODE_FX__NAME = eINSTANCE.getBarcodeFX_Name();

		/**
		 * The meta object literal for the '{@link de.dc.javafx.xcore.workbench.barcode.impl.QRCodeFXImpl <em>QR Code FX</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.javafx.xcore.workbench.barcode.impl.QRCodeFXImpl
		 * @see de.dc.javafx.xcore.workbench.barcode.impl.BarcodePackageImpl#getQRCodeFX()
		 * @generated
		 */
		EClass QR_CODE_FX = eINSTANCE.getQRCodeFX();

	}

} //BarcodePackage
