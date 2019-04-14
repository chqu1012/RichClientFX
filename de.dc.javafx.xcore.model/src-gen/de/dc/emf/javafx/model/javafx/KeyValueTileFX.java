/**
 */
package de.dc.emf.javafx.model.javafx;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Key Value Tile FX</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dc.emf.javafx.model.javafx.KeyValueTileFX#getKey <em>Key</em>}</li>
 *   <li>{@link de.dc.emf.javafx.model.javafx.KeyValueTileFX#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see de.dc.emf.javafx.model.javafx.JavafxPackage#getKeyValueTileFX()
 * @model
 * @generated
 */
public interface KeyValueTileFX extends BaseTileFX {
	/**
	 * Returns the value of the '<em><b>Key</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key</em>' attribute.
	 * @see #setKey(String)
	 * @see de.dc.emf.javafx.model.javafx.JavafxPackage#getKeyValueTileFX_Key()
	 * @model default="" unique="false"
	 * @generated
	 */
	String getKey();

	/**
	 * Sets the value of the '{@link de.dc.emf.javafx.model.javafx.KeyValueTileFX#getKey <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key</em>' attribute.
	 * @see #getKey()
	 * @generated
	 */
	void setKey(String value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see de.dc.emf.javafx.model.javafx.JavafxPackage#getKeyValueTileFX_Value()
	 * @model default="" unique="false"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link de.dc.emf.javafx.model.javafx.KeyValueTileFX#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

} // KeyValueTileFX
