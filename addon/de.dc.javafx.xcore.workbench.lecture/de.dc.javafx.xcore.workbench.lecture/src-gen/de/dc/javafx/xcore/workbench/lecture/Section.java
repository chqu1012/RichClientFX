/**
 */
package de.dc.javafx.xcore.workbench.lecture;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Section</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dc.javafx.xcore.workbench.lecture.Section#getName <em>Name</em>}</li>
 *   <li>{@link de.dc.javafx.xcore.workbench.lecture.Section#isUseMarkDown <em>Use Mark Down</em>}</li>
 *   <li>{@link de.dc.javafx.xcore.workbench.lecture.Section#getContent <em>Content</em>}</li>
 * </ul>
 *
 * @see de.dc.javafx.xcore.workbench.lecture.LecturePackage#getSection()
 * @model
 * @generated
 */
public interface Section extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see de.dc.javafx.xcore.workbench.lecture.LecturePackage#getSection_Name()
	 * @model unique="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.dc.javafx.xcore.workbench.lecture.Section#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Use Mark Down</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use Mark Down</em>' attribute.
	 * @see #setUseMarkDown(boolean)
	 * @see de.dc.javafx.xcore.workbench.lecture.LecturePackage#getSection_UseMarkDown()
	 * @model default="true" unique="false"
	 * @generated
	 */
	boolean isUseMarkDown();

	/**
	 * Sets the value of the '{@link de.dc.javafx.xcore.workbench.lecture.Section#isUseMarkDown <em>Use Mark Down</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use Mark Down</em>' attribute.
	 * @see #isUseMarkDown()
	 * @generated
	 */
	void setUseMarkDown(boolean value);

	/**
	 * Returns the value of the '<em><b>Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content</em>' containment reference.
	 * @see #setContent(Content)
	 * @see de.dc.javafx.xcore.workbench.lecture.LecturePackage#getSection_Content()
	 * @model containment="true"
	 * @generated
	 */
	Content getContent();

	/**
	 * Sets the value of the '{@link de.dc.javafx.xcore.workbench.lecture.Section#getContent <em>Content</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content</em>' containment reference.
	 * @see #getContent()
	 * @generated
	 */
	void setContent(Content value);

} // Section
