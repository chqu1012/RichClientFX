/**
 */
package de.dc.emf.javafx.model.javafx;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Binding Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see de.dc.emf.javafx.model.javafx.JavafxPackage#getBindingType()
 * @model
 * @generated
 */
public enum BindingType implements Enumerator {
	/**
	 * The '<em><b>String Property</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STRING_PROPERTY_VALUE
	 * @generated
	 * @ordered
	 */
	STRING_PROPERTY(0, "StringProperty", "StringProperty"),

	/**
	 * The '<em><b>Integer Property</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTEGER_PROPERTY_VALUE
	 * @generated
	 * @ordered
	 */
	INTEGER_PROPERTY(1, "IntegerProperty", "IntegerProperty"),

	/**
	 * The '<em><b>Double Property</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOUBLE_PROPERTY_VALUE
	 * @generated
	 * @ordered
	 */
	DOUBLE_PROPERTY(2, "DoubleProperty", "DoubleProperty"),

	/**
	 * The '<em><b>Float Property</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FLOAT_PROPERTY_VALUE
	 * @generated
	 * @ordered
	 */
	FLOAT_PROPERTY(3, "FloatProperty", "FloatProperty"),

	/**
	 * The '<em><b>Boolean Property</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BOOLEAN_PROPERTY_VALUE
	 * @generated
	 * @ordered
	 */
	BOOLEAN_PROPERTY(4, "BooleanProperty", "BooleanProperty"),

	/**
	 * The '<em><b>Object Property</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OBJECT_PROPERTY_VALUE
	 * @generated
	 * @ordered
	 */
	OBJECT_PROPERTY(5, "ObjectProperty", "ObjectProperty"),
	/**
	* The '<em><b>Observable List</b></em>' literal object.
	* <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	* @see #OBSERVABLE_LIST_VALUE
	* @generated
	* @ordered
	*/
	OBSERVABLE_LIST(6, "ObservableList", "ObservableList");

	/**
	 * The '<em><b>String Property</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>String Property</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #STRING_PROPERTY
	 * @model name="StringProperty"
	 * @generated
	 * @ordered
	 */
	public static final int STRING_PROPERTY_VALUE = 0;

	/**
	 * The '<em><b>Integer Property</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Integer Property</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INTEGER_PROPERTY
	 * @model name="IntegerProperty"
	 * @generated
	 * @ordered
	 */
	public static final int INTEGER_PROPERTY_VALUE = 1;

	/**
	 * The '<em><b>Double Property</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Double Property</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DOUBLE_PROPERTY
	 * @model name="DoubleProperty"
	 * @generated
	 * @ordered
	 */
	public static final int DOUBLE_PROPERTY_VALUE = 2;

	/**
	 * The '<em><b>Float Property</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Float Property</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FLOAT_PROPERTY
	 * @model name="FloatProperty"
	 * @generated
	 * @ordered
	 */
	public static final int FLOAT_PROPERTY_VALUE = 3;

	/**
	 * The '<em><b>Boolean Property</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Boolean Property</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BOOLEAN_PROPERTY
	 * @model name="BooleanProperty"
	 * @generated
	 * @ordered
	 */
	public static final int BOOLEAN_PROPERTY_VALUE = 4;

	/**
	 * The '<em><b>Object Property</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Object Property</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OBJECT_PROPERTY
	 * @model name="ObjectProperty"
	 * @generated
	 * @ordered
	 */
	public static final int OBJECT_PROPERTY_VALUE = 5;

	/**
	 * The '<em><b>Observable List</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Observable List</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OBSERVABLE_LIST
	 * @model name="ObservableList"
	 * @generated
	 * @ordered
	 */
	public static final int OBSERVABLE_LIST_VALUE = 6;

	/**
	 * An array of all the '<em><b>Binding Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final BindingType[] VALUES_ARRAY = new BindingType[] { STRING_PROPERTY, INTEGER_PROPERTY,
			DOUBLE_PROPERTY, FLOAT_PROPERTY, BOOLEAN_PROPERTY, OBJECT_PROPERTY, OBSERVABLE_LIST, };

	/**
	 * A public read-only list of all the '<em><b>Binding Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<BindingType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Binding Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static BindingType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			BindingType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Binding Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static BindingType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			BindingType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Binding Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static BindingType get(int value) {
		switch (value) {
		case STRING_PROPERTY_VALUE:
			return STRING_PROPERTY;
		case INTEGER_PROPERTY_VALUE:
			return INTEGER_PROPERTY;
		case DOUBLE_PROPERTY_VALUE:
			return DOUBLE_PROPERTY;
		case FLOAT_PROPERTY_VALUE:
			return FLOAT_PROPERTY;
		case BOOLEAN_PROPERTY_VALUE:
			return BOOLEAN_PROPERTY;
		case OBJECT_PROPERTY_VALUE:
			return OBJECT_PROPERTY;
		case OBSERVABLE_LIST_VALUE:
			return OBSERVABLE_LIST;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private BindingType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
		return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}

} //BindingType
