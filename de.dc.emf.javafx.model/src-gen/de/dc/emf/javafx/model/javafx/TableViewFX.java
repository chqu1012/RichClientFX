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
 *   <li>{@link de.dc.emf.javafx.model.javafx.TableViewFX#getUsedModel <em>Used Model</em>}</li>
 * </ul>
 *
 * @see de.dc.emf.javafx.model.javafx.JavafxPackage#getTableViewFX()
 * @model
 * @generated
 */
public interface TableViewFX extends ControlFX, FilteredElement {
	/**
	 * Returns the value of the '<em><b>Columns</b></em>' containment reference list.
	 * The list contents are of type {@link de.dc.emf.javafx.model.javafx.TableColumnFX}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Columns</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Columns</em>' containment reference list.
	 * @see de.dc.emf.javafx.model.javafx.JavafxPackage#getTableViewFX_Columns()
	 * @model containment="true"
	 * @generated
	 */
	EList<TableColumnFX> getColumns();

	/**
	 * Returns the value of the '<em><b>Used Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Used Model</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Used Model</em>' reference.
	 * @see #setUsedModel(ModelFX)
	 * @see de.dc.emf.javafx.model.javafx.JavafxPackage#getTableViewFX_UsedModel()
	 * @model
	 * @generated
	 */
	ModelFX getUsedModel();

	/**
	 * Sets the value of the '{@link de.dc.emf.javafx.model.javafx.TableViewFX#getUsedModel <em>Used Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Used Model</em>' reference.
	 * @see #getUsedModel()
	 * @generated
	 */
	void setUsedModel(ModelFX value);

} // TableViewFX
