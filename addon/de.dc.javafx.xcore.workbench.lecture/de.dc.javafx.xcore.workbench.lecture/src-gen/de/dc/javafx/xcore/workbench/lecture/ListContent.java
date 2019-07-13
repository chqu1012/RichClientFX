/**
 */
package de.dc.javafx.xcore.workbench.lecture;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Content</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dc.javafx.xcore.workbench.lecture.ListContent#getItem <em>Item</em>}</li>
 * </ul>
 *
 * @see de.dc.javafx.xcore.workbench.lecture.LecturePackage#getListContent()
 * @model abstract="true"
 * @generated
 */
public interface ListContent extends Content {
	/**
	 * Returns the value of the '<em><b>Item</b></em>' containment reference list.
	 * The list contents are of type {@link de.dc.javafx.xcore.workbench.lecture.ListItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Item</em>' containment reference list.
	 * @see de.dc.javafx.xcore.workbench.lecture.LecturePackage#getListContent_Item()
	 * @model containment="true"
	 * @generated
	 */
	EList<ListItem> getItem();

} // ListContent
