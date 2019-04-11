/**
 */
package de.dc.emf.javafx.model.javafx;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.dc.emf.javafx.model.javafx.JavafxPackage
 * @generated
 */
public interface JavafxFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	JavafxFactory eINSTANCE = de.dc.emf.javafx.model.javafx.impl.JavafxFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Project FX</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Project FX</em>'.
	 * @generated
	 */
	ProjectFX createProjectFX();

	/**
	 * Returns a new object of class '<em>Table Column FX</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Table Column FX</em>'.
	 * @generated
	 */
	TableColumnFX createTableColumnFX();

	/**
	 * Returns a new object of class '<em>Attribute FX</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribute FX</em>'.
	 * @generated
	 */
	AttributeFX createAttributeFX();

	/**
	 * Returns a new object of class '<em>Bean</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bean</em>'.
	 * @generated
	 */
	Bean createBean();

	/**
	 * Returns a new object of class '<em>Derived Bean</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Derived Bean</em>'.
	 * @generated
	 */
	DerivedBean createDerivedBean();

	/**
	 * Returns a new object of class '<em>Binding</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Binding</em>'.
	 * @generated
	 */
	Binding createBinding();

	/**
	 * Returns a new object of class '<em>Binding Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Binding Property</em>'.
	 * @generated
	 */
	BindingProperty createBindingProperty();

	/**
	 * Returns a new object of class '<em>Table View FX</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Table View FX</em>'.
	 * @generated
	 */
	TableViewFX createTableViewFX();

	/**
	 * Returns a new object of class '<em>Filtered Table View FX</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Filtered Table View FX</em>'.
	 * @generated
	 */
	FilteredTableViewFX createFilteredTableViewFX();

	/**
	 * Returns a new object of class '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Named Element</em>'.
	 * @generated
	 */
	NamedElement createNamedElement();

	/**
	 * Returns a new object of class '<em>Filtered Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Filtered Element</em>'.
	 * @generated
	 */
	FilteredElement createFilteredElement();

	/**
	 * Returns a new object of class '<em>Chart Series</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Chart Series</em>'.
	 * @generated
	 */
	ChartSeries createChartSeries();

	/**
	 * Returns a new object of class '<em>Chart FX Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Chart FX Data</em>'.
	 * @generated
	 */
	ChartFXData createChartFXData();

	/**
	 * Returns a new object of class '<em>Line Chart FX</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Line Chart FX</em>'.
	 * @generated
	 */
	LineChartFX createLineChartFX();

	/**
	 * Returns a new object of class '<em>Pie Chart FX</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pie Chart FX</em>'.
	 * @generated
	 */
	PieChartFX createPieChartFX();

	/**
	 * Returns a new object of class '<em>Area Chart FX</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Area Chart FX</em>'.
	 * @generated
	 */
	AreaChartFX createAreaChartFX();

	/**
	 * Returns a new object of class '<em>Bubble Chart FX</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bubble Chart FX</em>'.
	 * @generated
	 */
	BubbleChartFX createBubbleChartFX();

	/**
	 * Returns a new object of class '<em>Scatter Chart FX</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Scatter Chart FX</em>'.
	 * @generated
	 */
	ScatterChartFX createScatterChartFX();

	/**
	 * Returns a new object of class '<em>Bar Chart FX</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bar Chart FX</em>'.
	 * @generated
	 */
	BarChartFX createBarChartFX();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	JavafxPackage getJavafxPackage();

} //JavafxFactory
