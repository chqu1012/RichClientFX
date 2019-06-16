/**
 */
package de.dc.javafx.xcore.workbench.chart;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Category Chart FX</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dc.javafx.xcore.workbench.chart.CategoryChartFX#getSeries <em>Series</em>}</li>
 * </ul>
 *
 * @see de.dc.javafx.xcore.workbench.chart.ChartPackage#getCategoryChartFX()
 * @model abstract="true"
 * @generated
 */
public interface CategoryChartFX extends ChartFX {
	/**
	 * Returns the value of the '<em><b>Series</b></em>' containment reference list.
	 * The list contents are of type {@link de.dc.javafx.xcore.workbench.chart.CategorySeriesFX}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Series</em>' containment reference list.
	 * @see de.dc.javafx.xcore.workbench.chart.ChartPackage#getCategoryChartFX_Series()
	 * @model containment="true"
	 * @generated
	 */
	EList<CategorySeriesFX> getSeries();

} // CategoryChartFX
