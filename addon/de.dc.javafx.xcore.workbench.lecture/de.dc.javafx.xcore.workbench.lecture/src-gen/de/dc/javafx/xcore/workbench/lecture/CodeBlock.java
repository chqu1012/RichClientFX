/**
 */
package de.dc.javafx.xcore.workbench.lecture;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Code Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dc.javafx.xcore.workbench.lecture.CodeBlock#getLanguage <em>Language</em>}</li>
 * </ul>
 *
 * @see de.dc.javafx.xcore.workbench.lecture.LecturePackage#getCodeBlock()
 * @model
 * @generated
 */
public interface CodeBlock extends HtmlElement {
	/**
	 * Returns the value of the '<em><b>Language</b></em>' attribute.
	 * The default value is <code>"java"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Language</em>' attribute.
	 * @see #setLanguage(String)
	 * @see de.dc.javafx.xcore.workbench.lecture.LecturePackage#getCodeBlock_Language()
	 * @model default="java" unique="false"
	 * @generated
	 */
	String getLanguage();

	/**
	 * Sets the value of the '{@link de.dc.javafx.xcore.workbench.lecture.CodeBlock#getLanguage <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Language</em>' attribute.
	 * @see #getLanguage()
	 * @generated
	 */
	void setLanguage(String value);

} // CodeBlock
