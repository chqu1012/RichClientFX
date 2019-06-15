/**
 */
package de.dc.javafx.xcore.workbench.chart;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.dc.javafx.xcore.workbench.chart.ChartPackage
 * @generated
 */
public interface ChartFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ChartFactory eINSTANCE = de.dc.javafx.xcore.workbench.chart.impl.ChartFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Series FX</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Series FX</em>'.
	 * @generated
	 */
	SeriesFX createSeriesFX();

	/**
	 * Returns a new object of class '<em>XY Value FX</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>XY Value FX</em>'.
	 * @generated
	 */
	XYValueFX createXYValueFX();

	/**
	 * Returns a new object of class '<em>Line Chart FX</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Line Chart FX</em>'.
	 * @generated
	 */
	LineChartFX createLineChartFX();

	/**
	 * Returns a new object of class '<em>FX Config</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>FX Config</em>'.
	 * @generated
	 */
	ChartFXConfig createChartFXConfig();

	/**
	 * Returns an instance of data type '<em>Side</em>' corresponding the given literal.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal a literal of the data type.
	 * @return a new instance value of the data type.
	 * @generated
	 */
	ChartSide createChartSide(String literal);

	/**
	 * Returns a literal representation of an instance of data type '<em>Side</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param instanceValue an instance value of the data type.
	 * @return a literal representation of the instance value.
	 * @generated
	 */
	String convertChartSide(ChartSide instanceValue);

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ChartPackage getChartPackage();

} //ChartFactory
