/**
 */
package de.dc.emf.javafx.model.javafx;

import org.eclipse.xtext.common.types.JvmTypeReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tree View FX</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dc.emf.javafx.model.javafx.TreeViewFX#isShowPropertyView <em>Show Property View</em>}</li>
 *   <li>{@link de.dc.emf.javafx.model.javafx.TreeViewFX#getUsedModel <em>Used Model</em>}</li>
 * </ul>
 *
 * @see de.dc.emf.javafx.model.javafx.JavafxPackage#getTreeViewFX()
 * @model
 * @generated
 */
public interface TreeViewFX extends ControlFX {
	/**
	 * Returns the value of the '<em><b>Show Property View</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Show Property View</em>' attribute.
	 * @see #setShowPropertyView(boolean)
	 * @see de.dc.emf.javafx.model.javafx.JavafxPackage#getTreeViewFX_ShowPropertyView()
	 * @model default="true" unique="false"
	 * @generated
	 */
	boolean isShowPropertyView();

	/**
	 * Sets the value of the '{@link de.dc.emf.javafx.model.javafx.TreeViewFX#isShowPropertyView <em>Show Property View</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Show Property View</em>' attribute.
	 * @see #isShowPropertyView()
	 * @generated
	 */
	void setShowPropertyView(boolean value);

	/**
	 * Returns the value of the '<em><b>Used Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Used Model</em>' containment reference.
	 * @see #setUsedModel(JvmTypeReference)
	 * @see de.dc.emf.javafx.model.javafx.JavafxPackage#getTreeViewFX_UsedModel()
	 * @model containment="true"
	 * @generated
	 */
	JvmTypeReference getUsedModel();

	/**
	 * Sets the value of the '{@link de.dc.emf.javafx.model.javafx.TreeViewFX#getUsedModel <em>Used Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Used Model</em>' containment reference.
	 * @see #getUsedModel()
	 * @generated
	 */
	void setUsedModel(JvmTypeReference value);

} // TreeViewFX
