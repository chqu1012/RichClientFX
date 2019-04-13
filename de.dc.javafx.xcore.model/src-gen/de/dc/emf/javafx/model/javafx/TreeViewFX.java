/**
 */
package de.dc.emf.javafx.model.javafx;

import org.eclipse.xtext.common.types.JvmTypeReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tree View FX</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dc.emf.javafx.model.javafx.TreeViewFX#getCellValueFactory <em>Cell Value Factory</em>}</li>
 * </ul>
 *
 * @see de.dc.emf.javafx.model.javafx.JavafxPackage#getTreeViewFX()
 * @model
 * @generated
 */
public interface TreeViewFX extends BaseViewFX {
	/**
	 * Returns the value of the '<em><b>Cell Value Factory</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cell Value Factory</em>' containment reference.
	 * @see #setCellValueFactory(JvmTypeReference)
	 * @see de.dc.emf.javafx.model.javafx.JavafxPackage#getTreeViewFX_CellValueFactory()
	 * @model containment="true"
	 * @generated
	 */
	JvmTypeReference getCellValueFactory();

	/**
	 * Sets the value of the '{@link de.dc.emf.javafx.model.javafx.TreeViewFX#getCellValueFactory <em>Cell Value Factory</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cell Value Factory</em>' containment reference.
	 * @see #getCellValueFactory()
	 * @generated
	 */
	void setCellValueFactory(JvmTypeReference value);

} // TreeViewFX
