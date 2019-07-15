/**
 */
package de.dc.javafx.xcore.workbench.lecture;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dc.javafx.xcore.workbench.lecture.Link#getHref <em>Href</em>}</li>
 *   <li>{@link de.dc.javafx.xcore.workbench.lecture.Link#getAlt <em>Alt</em>}</li>
 * </ul>
 *
 * @see de.dc.javafx.xcore.workbench.lecture.LecturePackage#getLink()
 * @model
 * @generated
 */
public interface Link extends HtmlElement, Content {
	/**
	 * Returns the value of the '<em><b>Href</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Href</em>' attribute.
	 * @see #setHref(String)
	 * @see de.dc.javafx.xcore.workbench.lecture.LecturePackage#getLink_Href()
	 * @model default="" unique="false"
	 * @generated
	 */
	String getHref();

	/**
	 * Sets the value of the '{@link de.dc.javafx.xcore.workbench.lecture.Link#getHref <em>Href</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Href</em>' attribute.
	 * @see #getHref()
	 * @generated
	 */
	void setHref(String value);

	/**
	 * Returns the value of the '<em><b>Alt</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alt</em>' attribute.
	 * @see #setAlt(String)
	 * @see de.dc.javafx.xcore.workbench.lecture.LecturePackage#getLink_Alt()
	 * @model default="" unique="false"
	 * @generated
	 */
	String getAlt();

	/**
	 * Sets the value of the '{@link de.dc.javafx.xcore.workbench.lecture.Link#getAlt <em>Alt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alt</em>' attribute.
	 * @see #getAlt()
	 * @generated
	 */
	void setAlt(String value);

} // Link
