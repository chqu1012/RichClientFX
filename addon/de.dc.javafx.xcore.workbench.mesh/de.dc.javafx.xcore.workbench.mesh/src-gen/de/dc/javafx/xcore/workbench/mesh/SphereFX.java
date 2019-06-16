/**
 */
package de.dc.javafx.xcore.workbench.mesh;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sphere FX</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dc.javafx.xcore.workbench.mesh.SphereFX#getRadius <em>Radius</em>}</li>
 * </ul>
 *
 * @see de.dc.javafx.xcore.workbench.mesh.MeshPackage#getSphereFX()
 * @model
 * @generated
 */
public interface SphereFX extends ShapeFX {
	/**
	 * Returns the value of the '<em><b>Radius</b></em>' attribute.
	 * The default value is <code>"50"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Radius</em>' attribute.
	 * @see #setRadius(double)
	 * @see de.dc.javafx.xcore.workbench.mesh.MeshPackage#getSphereFX_Radius()
	 * @model default="50" unique="false"
	 * @generated
	 */
	double getRadius();

	/**
	 * Sets the value of the '{@link de.dc.javafx.xcore.workbench.mesh.SphereFX#getRadius <em>Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Radius</em>' attribute.
	 * @see #getRadius()
	 * @generated
	 */
	void setRadius(double value);

} // SphereFX
