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
 *   <li>{@link de.dc.javafx.xcore.workbench.extensions.PerspectiveExtension#getPerspectives <em>Perspectives</em>}</li>
 * </ul>
 *
 * @see de.dc.javafx.xcore.workbench.extensions.ExtensionsPackage#getPerspectiveExtension()
 * @model
 * @generated
 */
public interface PerspectiveExtension extends ExtensionPoint {
	/**
	 * Returns the value of the '<em><b>Perspectives</b></em>' containment reference list.
	 * The list contents are of type {@link de.dc.javafx.xcore.workbench.extensions.Perspective}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Perspectives</em>' containment reference list.
	 * @see de.dc.javafx.xcore.workbench.extensions.ExtensionsPackage#getPerspectiveExtension_Perspectives()
	 * @model containment="true"
	 * @generated
	 */
	EList<Perspective> getPerspectives();

} // PerspectiveExtension
