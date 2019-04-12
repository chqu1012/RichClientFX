/**
 */
package de.dc.emf.javafx.model.javafx;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Control FX</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dc.emf.javafx.model.javafx.ControlFX#isGenerateDemo <em>Generate Demo</em>}</li>
 * </ul>
 *
 * @see de.dc.emf.javafx.model.javafx.JavafxPackage#getControlFX()
 * @model abstract="true"
 * @generated
 */
public interface ControlFX extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Generate Demo</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generate Demo</em>' attribute.
	 * @see #setGenerateDemo(boolean)
	 * @see de.dc.emf.javafx.model.javafx.JavafxPackage#getControlFX_GenerateDemo()
	 * @model default="false" unique="false"
	 * @generated
	 */
	boolean isGenerateDemo();

	/**
	 * Sets the value of the '{@link de.dc.emf.javafx.model.javafx.ControlFX#isGenerateDemo <em>Generate Demo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generate Demo</em>' attribute.
	 * @see #isGenerateDemo()
	 * @generated
	 */
	void setGenerateDemo(boolean value);

} // ControlFX
