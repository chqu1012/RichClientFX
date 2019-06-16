/**
 */
package de.dc.javafx.xcore.workbench.mesh;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dc.javafx.xcore.workbench.mesh.MeshNode#getTranslateX <em>Translate X</em>}</li>
 *   <li>{@link de.dc.javafx.xcore.workbench.mesh.MeshNode#getTranslateY <em>Translate Y</em>}</li>
 *   <li>{@link de.dc.javafx.xcore.workbench.mesh.MeshNode#getTranslateZ <em>Translate Z</em>}</li>
 * </ul>
 *
 * @see de.dc.javafx.xcore.workbench.mesh.MeshPackage#getMeshNode()
 * @model abstract="true"
 * @generated
 */
public interface MeshNode extends EObject {
	/**
	 * Returns the value of the '<em><b>Translate X</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Translate X</em>' attribute.
	 * @see #setTranslateX(double)
	 * @see de.dc.javafx.xcore.workbench.mesh.MeshPackage#getMeshNode_TranslateX()
	 * @model default="0" unique="false"
	 * @generated
	 */
	double getTranslateX();

	/**
	 * Sets the value of the '{@link de.dc.javafx.xcore.workbench.mesh.MeshNode#getTranslateX <em>Translate X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Translate X</em>' attribute.
	 * @see #getTranslateX()
	 * @generated
	 */
	void setTranslateX(double value);

	/**
	 * Returns the value of the '<em><b>Translate Y</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Translate Y</em>' attribute.
	 * @see #setTranslateY(double)
	 * @see de.dc.javafx.xcore.workbench.mesh.MeshPackage#getMeshNode_TranslateY()
	 * @model default="0" unique="false"
	 * @generated
	 */
	double getTranslateY();

	/**
	 * Sets the value of the '{@link de.dc.javafx.xcore.workbench.mesh.MeshNode#getTranslateY <em>Translate Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Translate Y</em>' attribute.
	 * @see #getTranslateY()
	 * @generated
	 */
	void setTranslateY(double value);

	/**
	 * Returns the value of the '<em><b>Translate Z</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Translate Z</em>' attribute.
	 * @see #setTranslateZ(double)
	 * @see de.dc.javafx.xcore.workbench.mesh.MeshPackage#getMeshNode_TranslateZ()
	 * @model default="0" unique="false"
	 * @generated
	 */
	double getTranslateZ();

	/**
	 * Sets the value of the '{@link de.dc.javafx.xcore.workbench.mesh.MeshNode#getTranslateZ <em>Translate Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Translate Z</em>' attribute.
	 * @see #getTranslateZ()
	 * @generated
	 */
	void setTranslateZ(double value);

} // MeshNode
