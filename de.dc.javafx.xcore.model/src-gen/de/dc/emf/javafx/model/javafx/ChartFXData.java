/**
 */
package de.dc.emf.javafx.model.javafx;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Chart FX Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dc.emf.javafx.model.javafx.ChartFXData#getXValue <em>XValue</em>}</li>
 *   <li>{@link de.dc.emf.javafx.model.javafx.ChartFXData#getYValue <em>YValue</em>}</li>
 * </ul>
 *
 * @see de.dc.emf.javafx.model.javafx.JavafxPackage#getChartFXData()
 * @model
 * @generated
 */
public interface ChartFXData extends EObject {
	/**
	 * Returns the value of the '<em><b>XValue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XValue</em>' attribute.
	 * @see #setXValue(String)
	 * @see de.dc.emf.javafx.model.javafx.JavafxPackage#getChartFXData_XValue()
	 * @model unique="false"
	 * @generated
	 */
	String getXValue();

	/**
	 * Sets the value of the '{@link de.dc.emf.javafx.model.javafx.ChartFXData#getXValue <em>XValue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XValue</em>' attribute.
	 * @see #getXValue()
	 * @generated
	 */
	void setXValue(String value);

	/**
	 * Returns the value of the '<em><b>YValue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>YValue</em>' attribute.
	 * @see #setYValue(String)
	 * @see de.dc.emf.javafx.model.javafx.JavafxPackage#getChartFXData_YValue()
	 * @model unique="false"
	 * @generated
	 */
	String getYValue();

	/**
	 * Sets the value of the '{@link de.dc.emf.javafx.model.javafx.ChartFXData#getYValue <em>YValue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>YValue</em>' attribute.
	 * @see #getYValue()
	 * @generated
	 */
	void setYValue(String value);

} // ChartFXData
