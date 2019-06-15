/**
 */
package de.dc.javafx.xcore.workbench.chart;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>XY Value FX</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dc.javafx.xcore.workbench.chart.XYValueFX#getX <em>X</em>}</li>
 *   <li>{@link de.dc.javafx.xcore.workbench.chart.XYValueFX#getY <em>Y</em>}</li>
 * </ul>
 *
 * @see de.dc.javafx.xcore.workbench.chart.ChartPackage#getXYValueFX()
 * @model
 * @generated
 */
public interface XYValueFX extends EObject {
	/**
	 * Returns the value of the '<em><b>X</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>X</em>' attribute.
	 * @see #setX(double)
	 * @see de.dc.javafx.xcore.workbench.chart.ChartPackage#getXYValueFX_X()
	 * @model default="0" unique="false"
	 * @generated
	 */
	double getX();

	/**
	 * Sets the value of the '{@link de.dc.javafx.xcore.workbench.chart.XYValueFX#getX <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>X</em>' attribute.
	 * @see #getX()
	 * @generated
	 */
	void setX(double value);

	/**
	 * Returns the value of the '<em><b>Y</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Y</em>' attribute.
	 * @see #setY(double)
	 * @see de.dc.javafx.xcore.workbench.chart.ChartPackage#getXYValueFX_Y()
	 * @model default="0" unique="false"
	 * @generated
	 */
	double getY();

	/**
	 * Sets the value of the '{@link de.dc.javafx.xcore.workbench.chart.XYValueFX#getY <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Y</em>' attribute.
	 * @see #getY()
	 * @generated
	 */
	void setY(double value);

} // XYValueFX
