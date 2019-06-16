/**
 */
package de.dc.javafx.xcore.workbench.mesh;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Coordinate System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dc.javafx.xcore.workbench.mesh.CoordinateSystem#getXAxisWidth <em>XAxis Width</em>}</li>
 *   <li>{@link de.dc.javafx.xcore.workbench.mesh.CoordinateSystem#getYAxisWidth <em>YAxis Width</em>}</li>
 *   <li>{@link de.dc.javafx.xcore.workbench.mesh.CoordinateSystem#getZAxisWidth <em>ZAxis Width</em>}</li>
 *   <li>{@link de.dc.javafx.xcore.workbench.mesh.CoordinateSystem#getShapes <em>Shapes</em>}</li>
 * </ul>
 *
 * @see de.dc.javafx.xcore.workbench.mesh.MeshPackage#getCoordinateSystem()
 * @model
 * @generated
 */
public interface CoordinateSystem extends MeshNode {
	/**
	 * Returns the value of the '<em><b>XAxis Width</b></em>' attribute.
	 * The default value is <code>"100"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XAxis Width</em>' attribute.
	 * @see #setXAxisWidth(double)
	 * @see de.dc.javafx.xcore.workbench.mesh.MeshPackage#getCoordinateSystem_XAxisWidth()
	 * @model default="100" unique="false"
	 * @generated
	 */
	double getXAxisWidth();

	/**
	 * Sets the value of the '{@link de.dc.javafx.xcore.workbench.mesh.CoordinateSystem#getXAxisWidth <em>XAxis Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XAxis Width</em>' attribute.
	 * @see #getXAxisWidth()
	 * @generated
	 */
	void setXAxisWidth(double value);

	/**
	 * Returns the value of the '<em><b>YAxis Width</b></em>' attribute.
	 * The default value is <code>"100"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>YAxis Width</em>' attribute.
	 * @see #setYAxisWidth(double)
	 * @see de.dc.javafx.xcore.workbench.mesh.MeshPackage#getCoordinateSystem_YAxisWidth()
	 * @model default="100" unique="false"
	 * @generated
	 */
	double getYAxisWidth();

	/**
	 * Sets the value of the '{@link de.dc.javafx.xcore.workbench.mesh.CoordinateSystem#getYAxisWidth <em>YAxis Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>YAxis Width</em>' attribute.
	 * @see #getYAxisWidth()
	 * @generated
	 */
	void setYAxisWidth(double value);

	/**
	 * Returns the value of the '<em><b>ZAxis Width</b></em>' attribute.
	 * The default value is <code>"100"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ZAxis Width</em>' attribute.
	 * @see #setZAxisWidth(double)
	 * @see de.dc.javafx.xcore.workbench.mesh.MeshPackage#getCoordinateSystem_ZAxisWidth()
	 * @model default="100" unique="false"
	 * @generated
	 */
	double getZAxisWidth();

	/**
	 * Sets the value of the '{@link de.dc.javafx.xcore.workbench.mesh.CoordinateSystem#getZAxisWidth <em>ZAxis Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ZAxis Width</em>' attribute.
	 * @see #getZAxisWidth()
	 * @generated
	 */
	void setZAxisWidth(double value);

	/**
	 * Returns the value of the '<em><b>Shapes</b></em>' containment reference list.
	 * The list contents are of type {@link de.dc.javafx.xcore.workbench.mesh.ShapeFX}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shapes</em>' containment reference list.
	 * @see de.dc.javafx.xcore.workbench.mesh.MeshPackage#getCoordinateSystem_Shapes()
	 * @model containment="true"
	 * @generated
	 */
	EList<ShapeFX> getShapes();

} // CoordinateSystem
