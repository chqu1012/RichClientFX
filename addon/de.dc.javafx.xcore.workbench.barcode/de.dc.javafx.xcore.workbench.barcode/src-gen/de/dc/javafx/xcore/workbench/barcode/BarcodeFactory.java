/**
 */
package de.dc.javafx.xcore.workbench.barcode;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.dc.javafx.xcore.workbench.barcode.BarcodePackage
 * @generated
 */
public interface BarcodeFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BarcodeFactory eINSTANCE = de.dc.javafx.xcore.workbench.barcode.impl.BarcodeFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>FX Project</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>FX Project</em>'.
	 * @generated
	 */
	BarcodeFXProject createBarcodeFXProject();

	/**
	 * Returns a new object of class '<em>QR Code FX</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>QR Code FX</em>'.
	 * @generated
	 */
	QRCodeFX createQRCodeFX();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	BarcodePackage getBarcodePackage();

} //BarcodeFactory
