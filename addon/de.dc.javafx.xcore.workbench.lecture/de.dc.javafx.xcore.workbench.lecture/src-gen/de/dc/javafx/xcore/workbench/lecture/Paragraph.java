/**
 */
package de.dc.javafx.xcore.workbench.lecture;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Paragraph</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dc.javafx.xcore.workbench.lecture.Paragraph#getChildren <em>Children</em>}</li>
 * </ul>
 *
 * @see de.dc.javafx.xcore.workbench.lecture.LecturePackage#getParagraph()
 * @model
 * @generated
 */
public interface Paragraph extends Content, HtmlElement {
	/**
	 * Returns the value of the '<em><b>Children</b></em>' containment reference list.
	 * The list contents are of type {@link de.dc.javafx.xcore.workbench.lecture.HtmlElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' containment reference list.
	 * @see de.dc.javafx.xcore.workbench.lecture.LecturePackage#getParagraph_Children()
	 * @model containment="true"
	 * @generated
	 */
	EList<HtmlElement> getChildren();

} // Paragraph
