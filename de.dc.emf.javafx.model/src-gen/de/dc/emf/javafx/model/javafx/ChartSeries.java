/**
 */
package de.dc.emf.javafx.model.javafx;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Chart Series</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dc.emf.javafx.model.javafx.ChartSeries#getDataList <em>Data List</em>}</li>
 * </ul>
 *
 * @see de.dc.emf.javafx.model.javafx.JavafxPackage#getChartSeries()
 * @model
 * @generated
 */
public interface ChartSeries extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Data List</b></em>' containment reference list.
	 * The list contents are of type {@link de.dc.emf.javafx.model.javafx.ChartFXData}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data List</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data List</em>' containment reference list.
	 * @see de.dc.emf.javafx.model.javafx.JavafxPackage#getChartSeries_DataList()
	 * @model containment="true"
	 * @generated
	 */
	EList<ChartFXData> getDataList();

} // ChartSeries
