/**
 */
package de.dc.javafx.xcore.workbench.chart;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Surface Chart3d FX</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dc.javafx.xcore.workbench.chart.SurfaceChart3dFX#getFunction <em>Function</em>}</li>
 * </ul>
 *
 * @see de.dc.javafx.xcore.workbench.chart.ChartPackage#getSurfaceChart3dFX()
 * @model
 * @generated
 */
public interface SurfaceChart3dFX extends CategoryRowChartFX {
	/**
	 * Returns the value of the '<em><b>Function</b></em>' attribute.
	 * The default value is <code>"Math.cos(x) * Math.sin(z)"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Function</em>' attribute.
	 * @see #setFunction(String)
	 * @see de.dc.javafx.xcore.workbench.chart.ChartPackage#getSurfaceChart3dFX_Function()
	 * @model default="Math.cos(x) * Math.sin(z)" unique="false"
	 * @generated
	 */
	String getFunction();

	/**
	 * Sets the value of the '{@link de.dc.javafx.xcore.workbench.chart.SurfaceChart3dFX#getFunction <em>Function</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Function</em>' attribute.
	 * @see #getFunction()
	 * @generated
	 */
	void setFunction(String value);

} // SurfaceChart3dFX
