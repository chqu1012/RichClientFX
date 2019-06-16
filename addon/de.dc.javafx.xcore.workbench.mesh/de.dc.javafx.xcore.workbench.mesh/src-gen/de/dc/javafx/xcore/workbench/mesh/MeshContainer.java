/**
 */
package de.dc.javafx.xcore.workbench.mesh;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dc.javafx.xcore.workbench.mesh.MeshContainer#getNodes <em>Nodes</em>}</li>
 * </ul>
 *
 * @see de.dc.javafx.xcore.workbench.mesh.MeshPackage#getMeshContainer()
 * @model
 * @generated
 */
public interface MeshContainer extends EObject {
	/**
	 * Returns the value of the '<em><b>Nodes</b></em>' containment reference list.
	 * The list contents are of type {@link de.dc.javafx.xcore.workbench.mesh.MeshNode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nodes</em>' containment reference list.
	 * @see de.dc.javafx.xcore.workbench.mesh.MeshPackage#getMeshContainer_Nodes()
	 * @model containment="true"
	 * @generated
	 */
	EList<MeshNode> getNodes();

} // MeshContainer
