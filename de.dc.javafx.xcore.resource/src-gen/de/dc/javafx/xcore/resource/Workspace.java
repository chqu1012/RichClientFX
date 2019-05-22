/**
 */
package de.dc.javafx.xcore.resource;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Workspace</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dc.javafx.xcore.resource.Workspace#getProjects <em>Projects</em>}</li>
 * </ul>
 *
 * @see de.dc.javafx.xcore.resource.ResourcePackage#getWorkspace()
 * @model
 * @generated
 */
public interface Workspace extends EObject {
	/**
	 * Returns the value of the '<em><b>Projects</b></em>' containment reference list.
	 * The list contents are of type {@link de.dc.javafx.xcore.resource.Project}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Projects</em>' containment reference list.
	 * @see de.dc.javafx.xcore.resource.ResourcePackage#getWorkspace_Projects()
	 * @model containment="true"
	 * @generated
	 */
	EList<Project> getProjects();

} // Workspace
