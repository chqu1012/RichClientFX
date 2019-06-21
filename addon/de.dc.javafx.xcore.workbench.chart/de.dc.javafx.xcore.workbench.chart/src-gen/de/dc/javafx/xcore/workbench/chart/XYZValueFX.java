/**
 */
package de.dc.javafx.xcore.workbench.chart;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>XYZ Value FX</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dc.javafx.xcore.workbench.chart.XYZValueFX#getZ <em>Z</em>}</li>
 * </ul>
 *
 * @see de.dc.javafx.xcore.workbench.chart.ChartPackage#getXYZValueFX()
 * @model
 * @generated
 */
public interface XYZValueFX extends XYValueFX {
	/**
	 * Returns the value of the '<em><b>Z</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Z</em>' attribute.
	 * @see #setZ(double)
	 * @see de.dc.javafx.xcore.workbench.chart.ChartPackage#getXYZValueFX_Z()
	 * @model default="0" unique="false"
	 * @generated
	 */
	double getZ();

	/**
	 * Sets the value of the '{@link de.dc.javafx.xcore.workbench.chart.XYZValueFX#getZ <em>Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Z</em>' attribute.
	 * @see #getZ()
	 * @generated
	 */
	void setZ(double value);

} // XYZValueFX
