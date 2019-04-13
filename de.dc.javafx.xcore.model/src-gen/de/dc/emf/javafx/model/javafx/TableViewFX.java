/**
 */
package de.dc.emf.javafx.model.javafx;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Table View FX</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dc.emf.javafx.model.javafx.TableViewFX#getColumns <em>Columns</em>}</li>
 * </ul>
 *
 * @see de.dc.emf.javafx.model.javafx.JavafxPackage#getTableViewFX()
 * @model
 * @generated
 */
public interface TableViewFX extends BaseViewFX {
	/**
	 * Returns the value of the '<em><b>Columns</b></em>' containment reference list.
	 * The list contents are of type {@link de.dc.emf.javafx.model.javafx.TableColumnFX}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Columns</em>' containment reference list.
	 * @see de.dc.emf.javafx.model.javafx.JavafxPackage#getTableViewFX_Columns()
	 * @model containment="true"
	 * @generated
	 */
	EList<TableColumnFX> getColumns();

} // TableViewFX
