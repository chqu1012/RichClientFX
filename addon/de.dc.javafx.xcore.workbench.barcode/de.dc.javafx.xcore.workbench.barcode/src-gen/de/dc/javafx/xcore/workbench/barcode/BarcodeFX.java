/**
 */
package de.dc.javafx.xcore.workbench.barcode;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>FX</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dc.javafx.xcore.workbench.barcode.BarcodeFX#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see de.dc.javafx.xcore.workbench.barcode.BarcodePackage#getBarcodeFX()
 * @model abstract="true"
 * @generated
 */
public interface BarcodeFX extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see de.dc.javafx.xcore.workbench.barcode.BarcodePackage#getBarcodeFX_Name()
	 * @model unique="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.dc.javafx.xcore.workbench.barcode.BarcodeFX#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // BarcodeFX
