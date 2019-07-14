/**
 */
package de.dc.javafx.xcore.workbench.lecture;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Transition</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see de.dc.javafx.xcore.workbench.lecture.LecturePackage#getTransition()
 * @model
 * @generated
 */
public enum Transition implements Enumerator {
	/**
	 * The '<em><b>NONE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NONE_VALUE
	 * @generated
	 * @ordered
	 */
	NONE(0, "NONE", "none"),

	/**
	 * The '<em><b>SLIDE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SLIDE_VALUE
	 * @generated
	 * @ordered
	 */
	SLIDE(0, "SLIDE", "slide"),

	/**
	 * The '<em><b>FADE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FADE_VALUE
	 * @generated
	 * @ordered
	 */
	FADE(0, "FADE", "fade"),

	/**
	 * The '<em><b>CONVEX</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONVEX_VALUE
	 * @generated
	 * @ordered
	 */
	CONVEX(0, "CONVEX", "convex"),

	/**
	 * The '<em><b>CONCAVE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONCAVE_VALUE
	 * @generated
	 * @ordered
	 */
	CONCAVE(0, "CONCAVE", "concave"),

	/**
	 * The '<em><b>ZOOM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ZOOM_VALUE
	 * @generated
	 * @ordered
	 */
	ZOOM(0, "ZOOM", "zoom");

	/**
	 * The '<em><b>NONE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NONE
	 * @model literal="none"
	 * @generated
	 * @ordered
	 */
	public static final int NONE_VALUE = 0;

	/**
	 * The '<em><b>SLIDE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SLIDE
	 * @model literal="slide"
	 * @generated
	 * @ordered
	 */
	public static final int SLIDE_VALUE = 0;

	/**
	 * The '<em><b>FADE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FADE
	 * @model literal="fade"
	 * @generated
	 * @ordered
	 */
	public static final int FADE_VALUE = 0;

	/**
	 * The '<em><b>CONVEX</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONVEX
	 * @model literal="convex"
	 * @generated
	 * @ordered
	 */
	public static final int CONVEX_VALUE = 0;

	/**
	 * The '<em><b>CONCAVE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONCAVE
	 * @model literal="concave"
	 * @generated
	 * @ordered
	 */
	public static final int CONCAVE_VALUE = 0;

	/**
	 * The '<em><b>ZOOM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ZOOM
	 * @model literal="zoom"
	 * @generated
	 * @ordered
	 */
	public static final int ZOOM_VALUE = 0;

	/**
	 * An array of all the '<em><b>Transition</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Transition[] VALUES_ARRAY = new Transition[] { NONE, SLIDE, FADE, CONVEX, CONCAVE, ZOOM, };

	/**
	 * A public read-only list of all the '<em><b>Transition</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Transition> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Transition</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Transition get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Transition result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Transition</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Transition getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Transition result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Transition</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Transition get(int value) {
		switch (value) {
		case NONE_VALUE:
			return NONE;
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
	private Transition(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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

} //Transition
