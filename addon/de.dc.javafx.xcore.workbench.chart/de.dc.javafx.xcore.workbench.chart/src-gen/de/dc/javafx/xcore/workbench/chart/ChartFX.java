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
 *   <li>{@link de.dc.javafx.xcore.workbench.chart.ChartFX#getXAxisLabel <em>XAxis Label</em>}</li>
 *   <li>{@link de.dc.javafx.xcore.workbench.chart.ChartFX#getYAxisLabel <em>YAxis Label</em>}</li>
 *   <li>{@link de.dc.javafx.xcore.workbench.chart.ChartFX#getZAxisLabel <em>ZAxis Label</em>}</li>
 *   <li>{@link de.dc.javafx.xcore.workbench.chart.ChartFX#getConfig <em>Config</em>}</li>
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
	 * Returns the value of the '<em><b>XAxis Label</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XAxis Label</em>' attribute.
	 * @see #setXAxisLabel(String)
	 * @see de.dc.javafx.xcore.workbench.chart.ChartPackage#getChartFX_XAxisLabel()
	 * @model default="" unique="false"
	 * @generated
	 */
	String getXAxisLabel();

	/**
	 * Sets the value of the '{@link de.dc.javafx.xcore.workbench.chart.ChartFX#getXAxisLabel <em>XAxis Label</em>}' attribute.
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
	 * @see de.dc.javafx.xcore.workbench.chart.ChartPackage#getChartFX_YAxisLabel()
	 * @model default="" unique="false"
	 * @generated
	 */
	String getYAxisLabel();

	/**
	 * Sets the value of the '{@link de.dc.javafx.xcore.workbench.chart.ChartFX#getYAxisLabel <em>YAxis Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>YAxis Label</em>' attribute.
	 * @see #getYAxisLabel()
	 * @generated
	 */
	void setYAxisLabel(String value);

	/**
	 * Returns the value of the '<em><b>ZAxis Label</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ZAxis Label</em>' attribute.
	 * @see #setZAxisLabel(String)
	 * @see de.dc.javafx.xcore.workbench.chart.ChartPackage#getChartFX_ZAxisLabel()
	 * @model default="" unique="false"
	 * @generated
	 */
	String getZAxisLabel();

	/**
	 * Sets the value of the '{@link de.dc.javafx.xcore.workbench.chart.ChartFX#getZAxisLabel <em>ZAxis Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ZAxis Label</em>' attribute.
	 * @see #getZAxisLabel()
	 * @generated
	 */
	void setZAxisLabel(String value);

	/**
	 * Returns the value of the '<em><b>Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Config</em>' containment reference.
	 * @see #setConfig(ChartFXConfig)
	 * @see de.dc.javafx.xcore.workbench.chart.ChartPackage#getChartFX_Config()
	 * @model containment="true"
	 * @generated
	 */
	ChartFXConfig getConfig();

	/**
	 * Sets the value of the '{@link de.dc.javafx.xcore.workbench.chart.ChartFX#getConfig <em>Config</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Config</em>' containment reference.
	 * @see #getConfig()
	 * @generated
	 */
	void setConfig(ChartFXConfig value);

} // ChartFX
