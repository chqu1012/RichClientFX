/**
 */
package de.dc.emf.javafx.model.javafx;

import org.eclipse.xtext.common.types.JvmTypeReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Table Column FX</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dc.emf.javafx.model.javafx.TableColumnFX#getWidth <em>Width</em>}</li>
 *   <li>{@link de.dc.emf.javafx.model.javafx.TableColumnFX#getUsedAttribute <em>Used Attribute</em>}</li>
 *   <li>{@link de.dc.emf.javafx.model.javafx.TableColumnFX#getCellValueFactory <em>Cell Value Factory</em>}</li>
 *   <li>{@link de.dc.emf.javafx.model.javafx.TableColumnFX#isUseFilter <em>Use Filter</em>}</li>
 * </ul>
 *
 * @see de.dc.emf.javafx.model.javafx.JavafxPackage#getTableColumnFX()
 * @model
 * @generated
 */
public interface TableColumnFX extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Width</b></em>' attribute.
	 * The default value is <code>"200"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Width</em>' attribute.
	 * @see #setWidth(int)
	 * @see de.dc.emf.javafx.model.javafx.JavafxPackage#getTableColumnFX_Width()
	 * @model default="200" unique="false"
	 * @generated
	 */
	int getWidth();

	/**
	 * Sets the value of the '{@link de.dc.emf.javafx.model.javafx.TableColumnFX#getWidth <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Width</em>' attribute.
	 * @see #getWidth()
	 * @generated
	 */
	void setWidth(int value);

	/**
	 * Returns the value of the '<em><b>Used Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Used Attribute</em>' reference.
	 * @see #setUsedAttribute(AttributeFX)
	 * @see de.dc.emf.javafx.model.javafx.JavafxPackage#getTableColumnFX_UsedAttribute()
	 * @model
	 * @generated
	 */
	AttributeFX getUsedAttribute();

	/**
	 * Sets the value of the '{@link de.dc.emf.javafx.model.javafx.TableColumnFX#getUsedAttribute <em>Used Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Used Attribute</em>' reference.
	 * @see #getUsedAttribute()
	 * @generated
	 */
	void setUsedAttribute(AttributeFX value);

	/**
	 * Returns the value of the '<em><b>Cell Value Factory</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cell Value Factory</em>' containment reference.
	 * @see #setCellValueFactory(JvmTypeReference)
	 * @see de.dc.emf.javafx.model.javafx.JavafxPackage#getTableColumnFX_CellValueFactory()
	 * @model containment="true"
	 * @generated
	 */
	JvmTypeReference getCellValueFactory();

	/**
	 * Sets the value of the '{@link de.dc.emf.javafx.model.javafx.TableColumnFX#getCellValueFactory <em>Cell Value Factory</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cell Value Factory</em>' containment reference.
	 * @see #getCellValueFactory()
	 * @generated
	 */
	void setCellValueFactory(JvmTypeReference value);

	/**
	 * Returns the value of the '<em><b>Use Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use Filter</em>' attribute.
	 * @see #setUseFilter(boolean)
	 * @see de.dc.emf.javafx.model.javafx.JavafxPackage#getTableColumnFX_UseFilter()
	 * @model unique="false"
	 * @generated
	 */
	boolean isUseFilter();

	/**
	 * Sets the value of the '{@link de.dc.emf.javafx.model.javafx.TableColumnFX#isUseFilter <em>Use Filter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use Filter</em>' attribute.
	 * @see #isUseFilter()
	 * @generated
	 */
	void setUseFilter(boolean value);

} // TableColumnFX
