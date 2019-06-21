/**
 */
package de.dc.javafx.xcore.workbench.chart;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Category Row Chart FX</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dc.javafx.xcore.workbench.chart.CategoryRowChartFX#getSeries <em>Series</em>}</li>
 * </ul>
 *
 * @see de.dc.javafx.xcore.workbench.chart.ChartPackage#getCategoryRowChartFX()
 * @model abstract="true"
 * @generated
 */
public interface CategoryRowChartFX extends ChartFX {
	/**
	 * Returns the value of the '<em><b>Series</b></em>' containment reference list.
	 * The list contents are of type {@link de.dc.javafx.xcore.workbench.chart.CategoryRowSeriesFX}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Series</em>' containment reference list.
	 * @see de.dc.javafx.xcore.workbench.chart.ChartPackage#getCategoryRowChartFX_Series()
	 * @model containment="true"
	 * @generated
	 */
	EList<CategoryRowSeriesFX> getSeries();

} // CategoryRowChartFX
