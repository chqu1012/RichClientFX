/**
 */
package de.dc.emf.javafx.model.javafx;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Project FX</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dc.emf.javafx.model.javafx.ProjectFX#getControls <em>Controls</em>}</li>
 *   <li>{@link de.dc.emf.javafx.model.javafx.ProjectFX#getPackagePath <em>Package Path</em>}</li>
 *   <li>{@link de.dc.emf.javafx.model.javafx.ProjectFX#getModels <em>Models</em>}</li>
 *   <li>{@link de.dc.emf.javafx.model.javafx.ProjectFX#getBindings <em>Bindings</em>}</li>
 *   <li>{@link de.dc.emf.javafx.model.javafx.ProjectFX#getCharts <em>Charts</em>}</li>
 * </ul>
 *
 * @see de.dc.emf.javafx.model.javafx.JavafxPackage#getProjectFX()
 * @model
 * @generated
 */
public interface ProjectFX extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Controls</b></em>' containment reference list.
	 * The list contents are of type {@link de.dc.emf.javafx.model.javafx.ControlFX}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Controls</em>' containment reference list.
	 * @see de.dc.emf.javafx.model.javafx.JavafxPackage#getProjectFX_Controls()
	 * @model containment="true"
	 * @generated
	 */
	EList<ControlFX> getControls();

	/**
	 * Returns the value of the '<em><b>Package Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Package Path</em>' attribute.
	 * @see #setPackagePath(String)
	 * @see de.dc.emf.javafx.model.javafx.JavafxPackage#getProjectFX_PackagePath()
	 * @model unique="false"
	 * @generated
	 */
	String getPackagePath();

	/**
	 * Sets the value of the '{@link de.dc.emf.javafx.model.javafx.ProjectFX#getPackagePath <em>Package Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Package Path</em>' attribute.
	 * @see #getPackagePath()
	 * @generated
	 */
	void setPackagePath(String value);

	/**
	 * Returns the value of the '<em><b>Models</b></em>' containment reference list.
	 * The list contents are of type {@link de.dc.emf.javafx.model.javafx.ModelFX}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Models</em>' containment reference list.
	 * @see de.dc.emf.javafx.model.javafx.JavafxPackage#getProjectFX_Models()
	 * @model containment="true"
	 * @generated
	 */
	EList<ModelFX> getModels();

	/**
	 * Returns the value of the '<em><b>Bindings</b></em>' containment reference list.
	 * The list contents are of type {@link de.dc.emf.javafx.model.javafx.Binding}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bindings</em>' containment reference list.
	 * @see de.dc.emf.javafx.model.javafx.JavafxPackage#getProjectFX_Bindings()
	 * @model containment="true"
	 * @generated
	 */
	EList<Binding> getBindings();

	/**
	 * Returns the value of the '<em><b>Charts</b></em>' containment reference list.
	 * The list contents are of type {@link de.dc.emf.javafx.model.javafx.ChartFX}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Charts</em>' containment reference list.
	 * @see de.dc.emf.javafx.model.javafx.JavafxPackage#getProjectFX_Charts()
	 * @model containment="true"
	 * @generated
	 */
	EList<ChartFX> getCharts();

} // ProjectFX
