/**
 */
package de.dc.javafx.xcore.workbench.extensions;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Perspective Extension</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dc.javafx.xcore.workbench.extensions.PerspectiveExtension#getLeft <em>Left</em>}</li>
 *   <li>{@link de.dc.javafx.xcore.workbench.extensions.PerspectiveExtension#getRight <em>Right</em>}</li>
 *   <li>{@link de.dc.javafx.xcore.workbench.extensions.PerspectiveExtension#getBottom <em>Bottom</em>}</li>
 *   <li>{@link de.dc.javafx.xcore.workbench.extensions.PerspectiveExtension#getEditorArea <em>Editor Area</em>}</li>
 * </ul>
 *
 * @see de.dc.javafx.xcore.workbench.extensions.ExtensionsPackage#getPerspectiveExtension()
 * @model
 * @generated
 */
public interface PerspectiveExtension extends ExtensionPoint {
	/**
	 * Returns the value of the '<em><b>Left</b></em>' reference list.
	 * The list contents are of type {@link de.dc.javafx.xcore.workbench.extensions.View}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left</em>' reference list.
	 * @see de.dc.javafx.xcore.workbench.extensions.ExtensionsPackage#getPerspectiveExtension_Left()
	 * @model
	 * @generated
	 */
	EList<View> getLeft();

	/**
	 * Returns the value of the '<em><b>Right</b></em>' reference list.
	 * The list contents are of type {@link de.dc.javafx.xcore.workbench.extensions.View}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right</em>' reference list.
	 * @see de.dc.javafx.xcore.workbench.extensions.ExtensionsPackage#getPerspectiveExtension_Right()
	 * @model
	 * @generated
	 */
	EList<View> getRight();

	/**
	 * Returns the value of the '<em><b>Bottom</b></em>' reference list.
	 * The list contents are of type {@link de.dc.javafx.xcore.workbench.extensions.View}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bottom</em>' reference list.
	 * @see de.dc.javafx.xcore.workbench.extensions.ExtensionsPackage#getPerspectiveExtension_Bottom()
	 * @model
	 * @generated
	 */
	EList<View> getBottom();

	/**
	 * Returns the value of the '<em><b>Editor Area</b></em>' reference list.
	 * The list contents are of type {@link de.dc.javafx.xcore.workbench.extensions.Editor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Editor Area</em>' reference list.
	 * @see de.dc.javafx.xcore.workbench.extensions.ExtensionsPackage#getPerspectiveExtension_EditorArea()
	 * @model
	 * @generated
	 */
	EList<Editor> getEditorArea();

} // PerspectiveExtension
