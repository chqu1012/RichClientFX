/**
 */
package de.dc.javafx.xcore.workbench.chart;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>FX</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dc.javafx.xcore.workbench.chart.ChartFX#getName <em>Name</em>}</li>
 *   <li>{@link de.dc.javafx.xcore.workbench.chart.ChartFX#isShowLegend <em>Show Legend</em>}</li>
 * </ul>
 *
 * @see de.dc.javafx.xcore.workbench.chart.ChartPackage#getChartFX()
 * @model abstract="true"
 * @generated
 */
public interface ChartFX extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see de.dc.javafx.xcore.workbench.chart.ChartPackage#getChartFX_Name()
	 * @model unique="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.dc.javafx.xcore.workbench.chart.ChartFX#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Show Legend</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Show Legend</em>' attribute.
	 * @see #setShowLegend(boolean)
	 * @see de.dc.javafx.xcore.workbench.chart.ChartPackage#getChartFX_ShowLegend()
	 * @model default="true" unique="false"
	 * @generated
	 */
	boolean isShowLegend();

	/**
	 * Sets the value of the '{@link de.dc.javafx.xcore.workbench.chart.ChartFX#isShowLegend <em>Show Legend</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Show Legend</em>' attribute.
	 * @see #isShowLegend()
	 * @generated
	 */
	void setShowLegend(boolean value);

} // ChartFX
