/**
 */
package de.dc.emf.javafx.model.javafx;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>XY Chart FX</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dc.emf.javafx.model.javafx.XYChartFX#getXAxisType <em>XAxis Type</em>}</li>
 *   <li>{@link de.dc.emf.javafx.model.javafx.XYChartFX#getYAxisType <em>YAxis Type</em>}</li>
 *   <li>{@link de.dc.emf.javafx.model.javafx.XYChartFX#getXAxisLabel <em>XAxis Label</em>}</li>
 *   <li>{@link de.dc.emf.javafx.model.javafx.XYChartFX#getYAxisLabel <em>YAxis Label</em>}</li>
 * </ul>
 *
 * @see de.dc.emf.javafx.model.javafx.JavafxPackage#getXYChartFX()
 * @model abstract="true"
 * @generated
 */
public interface XYChartFX extends ChartFX {
	/**
	 * Returns the value of the '<em><b>XAxis Type</b></em>' attribute.
	 * The literals are from the enumeration {@link de.dc.emf.javafx.model.javafx.AxisType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XAxis Type</em>' attribute.
	 * @see de.dc.emf.javafx.model.javafx.AxisType
	 * @see #setXAxisType(AxisType)
	 * @see de.dc.emf.javafx.model.javafx.JavafxPackage#getXYChartFX_XAxisType()
	 * @model unique="false"
	 * @generated
	 */
	AxisType getXAxisType();

	/**
	 * Sets the value of the '{@link de.dc.emf.javafx.model.javafx.XYChartFX#getXAxisType <em>XAxis Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XAxis Type</em>' attribute.
	 * @see de.dc.emf.javafx.model.javafx.AxisType
	 * @see #getXAxisType()
	 * @generated
	 */
	void setXAxisType(AxisType value);

	/**
	 * Returns the value of the '<em><b>YAxis Type</b></em>' attribute.
	 * The literals are from the enumeration {@link de.dc.emf.javafx.model.javafx.AxisType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>YAxis Type</em>' attribute.
	 * @see de.dc.emf.javafx.model.javafx.AxisType
	 * @see #setYAxisType(AxisType)
	 * @see de.dc.emf.javafx.model.javafx.JavafxPackage#getXYChartFX_YAxisType()
	 * @model unique="false"
	 * @generated
	 */
	AxisType getYAxisType();

	/**
	 * Sets the value of the '{@link de.dc.emf.javafx.model.javafx.XYChartFX#getYAxisType <em>YAxis Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>YAxis Type</em>' attribute.
	 * @see de.dc.emf.javafx.model.javafx.AxisType
	 * @see #getYAxisType()
	 * @generated
	 */
	void setYAxisType(AxisType value);

	/**
	 * Returns the value of the '<em><b>XAxis Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XAxis Label</em>' attribute.
	 * @see #setXAxisLabel(String)
	 * @see de.dc.emf.javafx.model.javafx.JavafxPackage#getXYChartFX_XAxisLabel()
	 * @model unique="false"
	 * @generated
	 */
	String getXAxisLabel();

	/**
	 * Sets the value of the '{@link de.dc.emf.javafx.model.javafx.XYChartFX#getXAxisLabel <em>XAxis Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XAxis Label</em>' attribute.
	 * @see #getXAxisLabel()
	 * @generated
	 */
	void setXAxisLabel(String value);

	/**
	 * Returns the value of the '<em><b>YAxis Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>YAxis Label</em>' attribute.
	 * @see #setYAxisLabel(String)
	 * @see de.dc.emf.javafx.model.javafx.JavafxPackage#getXYChartFX_YAxisLabel()
	 * @model unique="false"
	 * @generated
	 */
	String getYAxisLabel();

	/**
	 * Sets the value of the '{@link de.dc.emf.javafx.model.javafx.XYChartFX#getYAxisLabel <em>YAxis Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>YAxis Label</em>' attribute.
	 * @see #getYAxisLabel()
	 * @generated
	 */
	void setYAxisLabel(String value);

} // XYChartFX
