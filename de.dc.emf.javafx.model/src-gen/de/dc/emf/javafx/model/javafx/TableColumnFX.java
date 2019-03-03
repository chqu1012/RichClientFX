/**
 */
package de.dc.emf.javafx.model.javafx;

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
 * </ul>
 *
 * @see de.dc.emf.javafx.model.javafx.JavafxPackage#getTableColumnFX()
 * @model
 * @generated
 */
public interface TableColumnFX extends NamedElement, FilteredElement {
	/**
	 * Returns the value of the '<em><b>Width</b></em>' attribute.
	 * The default value is <code>"200"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Width</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Width</em>' attribute.
	 * @see #setWidth(int)
	 * @see de.dc.emf.javafx.model.javafx.JavafxPackage#getTableColumnFX_Width()
	 * @model default="200"
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
	 * <p>
	 * If the meaning of the '<em>Used Attribute</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
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

} // TableColumnFX
