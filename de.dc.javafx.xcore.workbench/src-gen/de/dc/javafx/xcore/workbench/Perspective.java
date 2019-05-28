/**
 */
package de.dc.javafx.xcore.workbench;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Perspective</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dc.javafx.xcore.workbench.Perspective#getLeftPane <em>Left Pane</em>}</li>
 *   <li>{@link de.dc.javafx.xcore.workbench.Perspective#getRightPane <em>Right Pane</em>}</li>
 *   <li>{@link de.dc.javafx.xcore.workbench.Perspective#getBottomPane <em>Bottom Pane</em>}</li>
 *   <li>{@link de.dc.javafx.xcore.workbench.Perspective#getEditorArea <em>Editor Area</em>}</li>
 * </ul>
 *
 * @see de.dc.javafx.xcore.workbench.WorkbenchPackage#getPerspective()
 * @model
 * @generated
 */
public interface Perspective extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Left Pane</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left Pane</em>' containment reference.
	 * @see #setLeftPane(LeftPane)
	 * @see de.dc.javafx.xcore.workbench.WorkbenchPackage#getPerspective_LeftPane()
	 * @model containment="true"
	 * @generated
	 */
	LeftPane getLeftPane();

	/**
	 * Sets the value of the '{@link de.dc.javafx.xcore.workbench.Perspective#getLeftPane <em>Left Pane</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left Pane</em>' containment reference.
	 * @see #getLeftPane()
	 * @generated
	 */
	void setLeftPane(LeftPane value);

	/**
	 * Returns the value of the '<em><b>Right Pane</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right Pane</em>' containment reference.
	 * @see #setRightPane(RightPane)
	 * @see de.dc.javafx.xcore.workbench.WorkbenchPackage#getPerspective_RightPane()
	 * @model containment="true"
	 * @generated
	 */
	RightPane getRightPane();

	/**
	 * Sets the value of the '{@link de.dc.javafx.xcore.workbench.Perspective#getRightPane <em>Right Pane</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right Pane</em>' containment reference.
	 * @see #getRightPane()
	 * @generated
	 */
	void setRightPane(RightPane value);

	/**
	 * Returns the value of the '<em><b>Bottom Pane</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bottom Pane</em>' containment reference.
	 * @see #setBottomPane(BottomPane)
	 * @see de.dc.javafx.xcore.workbench.WorkbenchPackage#getPerspective_BottomPane()
	 * @model containment="true"
	 * @generated
	 */
	BottomPane getBottomPane();

	/**
	 * Sets the value of the '{@link de.dc.javafx.xcore.workbench.Perspective#getBottomPane <em>Bottom Pane</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bottom Pane</em>' containment reference.
	 * @see #getBottomPane()
	 * @generated
	 */
	void setBottomPane(BottomPane value);

	/**
	 * Returns the value of the '<em><b>Editor Area</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Editor Area</em>' containment reference.
	 * @see #setEditorArea(EditorArea)
	 * @see de.dc.javafx.xcore.workbench.WorkbenchPackage#getPerspective_EditorArea()
	 * @model containment="true"
	 * @generated
	 */
	EditorArea getEditorArea();

	/**
	 * Sets the value of the '{@link de.dc.javafx.xcore.workbench.Perspective#getEditorArea <em>Editor Area</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Editor Area</em>' containment reference.
	 * @see #getEditorArea()
	 * @generated
	 */
	void setEditorArea(EditorArea value);

} // Perspective
