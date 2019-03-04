/**
 */
package de.dc.emf.javafx.model.javafx;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Filtered Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dc.emf.javafx.model.javafx.FilteredElement#isUseFilter <em>Use Filter</em>}</li>
 * </ul>
 *
 * @see de.dc.emf.javafx.model.javafx.JavafxPackage#getFilteredElement()
 * @model
 * @generated
 */
public interface FilteredElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Use Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Use Filter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use Filter</em>' attribute.
	 * @see #setUseFilter(boolean)
	 * @see de.dc.emf.javafx.model.javafx.JavafxPackage#getFilteredElement_UseFilter()
	 * @model
	 * @generated
	 */
	boolean isUseFilter();

	/**
	 * Sets the value of the '{@link de.dc.emf.javafx.model.javafx.FilteredElement#isUseFilter <em>Use Filter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use Filter</em>' attribute.
	 * @see #isUseFilter()
	 * @generated
	 */
	void setUseFilter(boolean value);

} // FilteredElement
