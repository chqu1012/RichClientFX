/**
 */
package de.dc.javafx.xcore.resource;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Recently Open File History</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dc.javafx.xcore.resource.RecentlyOpenFileHistory#getFiles <em>Files</em>}</li>
 * </ul>
 *
 * @see de.dc.javafx.xcore.resource.ResourcePackage#getRecentlyOpenFileHistory()
 * @model
 * @generated
 */
public interface RecentlyOpenFileHistory extends EObject {
	/**
	 * Returns the value of the '<em><b>Files</b></em>' containment reference list.
	 * The list contents are of type {@link de.dc.javafx.xcore.resource.OpenedFile}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Files</em>' containment reference list.
	 * @see de.dc.javafx.xcore.resource.ResourcePackage#getRecentlyOpenFileHistory_Files()
	 * @model containment="true"
	 * @generated
	 */
	EList<OpenedFile> getFiles();

} // RecentlyOpenFileHistory
