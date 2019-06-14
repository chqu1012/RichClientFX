/**
 */
package de.dc.javafx.xcore.workbench.chart;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>XY Chart FX</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dc.javafx.xcore.workbench.chart.XYChartFX#getXAxisLabel <em>XAxis Label</em>}</li>
 *   <li>{@link de.dc.javafx.xcore.workbench.chart.XYChartFX#getYAxisLabel <em>YAxis Label</em>}</li>
 *   <li>{@link de.dc.javafx.xcore.workbench.chart.XYChartFX#getSeries <em>Series</em>}</li>
 * </ul>
 *
 * @see de.dc.javafx.xcore.workbench.chart.ChartPackage#getXYChartFX()
 * @model abstract="true"
 * @generated
 */
public interface XYChartFX extends ChartFX {
	/**
	 * Returns the value of the '<em><b>XAxis Label</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XAxis Label</em>' attribute.
	 * @see #setXAxisLabel(String)
	 * @see de.dc.javafx.xcore.workbench.chart.ChartPackage#getXYChartFX_XAxisLabel()
	 * @model default="" unique="false"
	 * @generated
	 */
	String getXAxisLabel();

	/**
	 * Sets the value of the '{@link de.dc.javafx.xcore.workbench.chart.XYChartFX#getXAxisLabel <em>XAxis Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XAxis Label</em>' attribute.
	 * @see #getXAxisLabel()
	 * @generated
	 */
	void setXAxisLabel(String value);

	/**
	 * Returns the value of the '<em><b>YAxis Label</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>YAxis Label</em>' attribute.
	 * @see #setYAxisLabel(String)
	 * @see de.dc.javafx.xcore.workbench.chart.ChartPackage#getXYChartFX_YAxisLabel()
	 * @model default="" unique="false"
	 * @generated
	 */
	String getYAxisLabel();

	/**
	 * Sets the value of the '{@link de.dc.javafx.xcore.workbench.chart.XYChartFX#getYAxisLabel <em>YAxis Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>YAxis Label</em>' attribute.
	 * @see #getYAxisLabel()
	 * @generated
	 */
	void setYAxisLabel(String value);

	/**
	 * Returns the value of the '<em><b>Series</b></em>' containment reference list.
	 * The list contents are of type {@link de.dc.javafx.xcore.workbench.chart.SeriesFX}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Series</em>' containment reference list.
	 * @see de.dc.javafx.xcore.workbench.chart.ChartPackage#getXYChartFX_Series()
	 * @model containment="true"
	 * @generated
	 */
	EList<SeriesFX> getSeries();

} // XYChartFX
