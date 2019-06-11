/**
 */
package de.dc.javafx.xcore.workbench.chart;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>XY Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dc.javafx.xcore.workbench.chart.XYValue#getX <em>X</em>}</li>
 *   <li>{@link de.dc.javafx.xcore.workbench.chart.XYValue#getY <em>Y</em>}</li>
 * </ul>
 *
 * @see de.dc.javafx.xcore.workbench.chart.ChartPackage#getXYValue()
 * @model
 * @generated
 */
public interface XYValue extends EObject {
	/**
	 * Returns the value of the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>X</em>' attribute.
	 * @see #setX(String)
	 * @see de.dc.javafx.xcore.workbench.chart.ChartPackage#getXYValue_X()
	 * @model unique="false"
	 * @generated
	 */
	String getX();

	/**
	 * Sets the value of the '{@link de.dc.javafx.xcore.workbench.chart.XYValue#getX <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>X</em>' attribute.
	 * @see #getX()
	 * @generated
	 */
	void setX(String value);

	/**
	 * Returns the value of the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Y</em>' attribute.
	 * @see #setY(String)
	 * @see de.dc.javafx.xcore.workbench.chart.ChartPackage#getXYValue_Y()
	 * @model unique="false"
	 * @generated
	 */
	String getY();

	/**
	 * Sets the value of the '{@link de.dc.javafx.xcore.workbench.chart.XYValue#getY <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Y</em>' attribute.
	 * @see #getY()
	 * @generated
	 */
	void setY(String value);

} // XYValue
