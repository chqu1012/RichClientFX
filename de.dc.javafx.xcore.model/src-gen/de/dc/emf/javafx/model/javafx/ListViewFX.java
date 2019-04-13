/**
 */
package de.dc.emf.javafx.model.javafx;

import org.eclipse.xtext.common.types.JvmTypeReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List View FX</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dc.emf.javafx.model.javafx.ListViewFX#getOrientation <em>Orientation</em>}</li>
 *   <li>{@link de.dc.emf.javafx.model.javafx.ListViewFX#getCellFactory <em>Cell Factory</em>}</li>
 * </ul>
 *
 * @see de.dc.emf.javafx.model.javafx.JavafxPackage#getListViewFX()
 * @model
 * @generated
 */
public interface ListViewFX extends BaseViewFX {
	/**
	 * Returns the value of the '<em><b>Orientation</b></em>' attribute.
	 * The literals are from the enumeration {@link de.dc.emf.javafx.model.javafx.Orientation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Orientation</em>' attribute.
	 * @see de.dc.emf.javafx.model.javafx.Orientation
	 * @see #setOrientation(Orientation)
	 * @see de.dc.emf.javafx.model.javafx.JavafxPackage#getListViewFX_Orientation()
	 * @model unique="false"
	 * @generated
	 */
	Orientation getOrientation();

	/**
	 * Sets the value of the '{@link de.dc.emf.javafx.model.javafx.ListViewFX#getOrientation <em>Orientation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Orientation</em>' attribute.
	 * @see de.dc.emf.javafx.model.javafx.Orientation
	 * @see #getOrientation()
	 * @generated
	 */
	void setOrientation(Orientation value);

	/**
	 * Returns the value of the '<em><b>Cell Factory</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cell Factory</em>' containment reference.
	 * @see #setCellFactory(JvmTypeReference)
	 * @see de.dc.emf.javafx.model.javafx.JavafxPackage#getListViewFX_CellFactory()
	 * @model containment="true"
	 * @generated
	 */
	JvmTypeReference getCellFactory();

	/**
	 * Sets the value of the '{@link de.dc.emf.javafx.model.javafx.ListViewFX#getCellFactory <em>Cell Factory</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cell Factory</em>' containment reference.
	 * @see #getCellFactory()
	 * @generated
	 */
	void setCellFactory(JvmTypeReference value);

} // ListViewFX
