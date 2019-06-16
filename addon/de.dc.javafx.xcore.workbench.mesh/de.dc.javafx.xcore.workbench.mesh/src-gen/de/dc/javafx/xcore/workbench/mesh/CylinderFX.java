/**
 */
package de.dc.javafx.xcore.workbench.mesh;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cylinder FX</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dc.javafx.xcore.workbench.mesh.CylinderFX#getRadius <em>Radius</em>}</li>
 *   <li>{@link de.dc.javafx.xcore.workbench.mesh.CylinderFX#getHeight <em>Height</em>}</li>
 * </ul>
 *
 * @see de.dc.javafx.xcore.workbench.mesh.MeshPackage#getCylinderFX()
 * @model
 * @generated
 */
public interface CylinderFX extends ShapeFX {
	/**
	 * Returns the value of the '<em><b>Radius</b></em>' attribute.
	 * The default value is <code>"50"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Radius</em>' attribute.
	 * @see #setRadius(double)
	 * @see de.dc.javafx.xcore.workbench.mesh.MeshPackage#getCylinderFX_Radius()
	 * @model default="50" unique="false"
	 * @generated
	 */
	double getRadius();

	/**
	 * Sets the value of the '{@link de.dc.javafx.xcore.workbench.mesh.CylinderFX#getRadius <em>Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Radius</em>' attribute.
	 * @see #getRadius()
	 * @generated
	 */
	void setRadius(double value);

	/**
	 * Returns the value of the '<em><b>Height</b></em>' attribute.
	 * The default value is <code>"100"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Height</em>' attribute.
	 * @see #setHeight(double)
	 * @see de.dc.javafx.xcore.workbench.mesh.MeshPackage#getCylinderFX_Height()
	 * @model default="100" unique="false"
	 * @generated
	 */
	double getHeight();

	/**
	 * Sets the value of the '{@link de.dc.javafx.xcore.workbench.mesh.CylinderFX#getHeight <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Height</em>' attribute.
	 * @see #getHeight()
	 * @generated
	 */
	void setHeight(double value);

} // CylinderFX
