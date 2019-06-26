/**
 */
package de.dc.javafx.xcore.workbench.barcode;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>FX Project</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dc.javafx.xcore.workbench.barcode.BarcodeFXProject#getBarcodes <em>Barcodes</em>}</li>
 * </ul>
 *
 * @see de.dc.javafx.xcore.workbench.barcode.BarcodePackage#getBarcodeFXProject()
 * @model
 * @generated
 */
public interface BarcodeFXProject extends EObject {
	/**
	 * Returns the value of the '<em><b>Barcodes</b></em>' containment reference list.
	 * The list contents are of type {@link de.dc.javafx.xcore.workbench.barcode.BarcodeFX}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Barcodes</em>' containment reference list.
	 * @see de.dc.javafx.xcore.workbench.barcode.BarcodePackage#getBarcodeFXProject_Barcodes()
	 * @model containment="true"
	 * @generated
	 */
	EList<BarcodeFX> getBarcodes();

} // BarcodeFXProject
