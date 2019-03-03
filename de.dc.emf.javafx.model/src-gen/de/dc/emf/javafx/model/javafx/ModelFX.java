/**
 */
package de.dc.emf.javafx.model.javafx;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model FX</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dc.emf.javafx.model.javafx.ModelFX#getAttributes <em>Attributes</em>}</li>
 * </ul>
 *
 * @see de.dc.emf.javafx.model.javafx.JavafxPackage#getModelFX()
 * @model abstract="true"
 * @generated
 */
public interface ModelFX extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link de.dc.emf.javafx.model.javafx.AttributeFX}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attributes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' containment reference list.
	 * @see de.dc.emf.javafx.model.javafx.JavafxPackage#getModelFX_Attributes()
	 * @model containment="true"
	 * @generated
	 */
	EList<AttributeFX> getAttributes();

} // ModelFX
