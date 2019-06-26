/**
 */
package de.dc.javafx.xcore.workbench.barcode.impl;

import de.dc.javafx.xcore.workbench.barcode.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BarcodeFactoryImpl extends EFactoryImpl implements BarcodeFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BarcodeFactory init() {
		try {
			BarcodeFactory theBarcodeFactory = (BarcodeFactory) EPackage.Registry.INSTANCE
					.getEFactory(BarcodePackage.eNS_URI);
			if (theBarcodeFactory != null) {
				return theBarcodeFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new BarcodeFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BarcodeFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case BarcodePackage.BARCODE_FX_PROJECT:
			return createBarcodeFXProject();
		case BarcodePackage.QR_CODE_FX:
			return createQRCodeFX();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BarcodeFXProject createBarcodeFXProject() {
		BarcodeFXProjectImpl barcodeFXProject = new BarcodeFXProjectImpl();
		return barcodeFXProject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QRCodeFX createQRCodeFX() {
		QRCodeFXImpl qrCodeFX = new QRCodeFXImpl();
		return qrCodeFX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BarcodePackage getBarcodePackage() {
		return (BarcodePackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static BarcodePackage getPackage() {
		return BarcodePackage.eINSTANCE;
	}

} //BarcodeFactoryImpl
