/**
 */
package de.dc.javafx.xcore.workbench.lecture;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Project</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dc.javafx.xcore.workbench.lecture.LectureProject#getSections <em>Sections</em>}</li>
 * </ul>
 *
 * @see de.dc.javafx.xcore.workbench.lecture.LecturePackage#getLectureProject()
 * @model
 * @generated
 */
public interface LectureProject extends EObject {
	/**
	 * Returns the value of the '<em><b>Sections</b></em>' containment reference list.
	 * The list contents are of type {@link de.dc.javafx.xcore.workbench.lecture.Section}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sections</em>' containment reference list.
	 * @see de.dc.javafx.xcore.workbench.lecture.LecturePackage#getLectureProject_Sections()
	 * @model containment="true"
	 * @generated
	 */
	EList<Section> getSections();

} // LectureProject
