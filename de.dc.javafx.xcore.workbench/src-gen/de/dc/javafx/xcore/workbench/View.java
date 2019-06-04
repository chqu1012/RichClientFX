/**
 */
package de.dc.javafx.xcore.workbench;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dc.javafx.xcore.workbench.View#getViewClass <em>View Class</em>}</li>
 *   <li>{@link de.dc.javafx.xcore.workbench.View#getIcon <em>Icon</em>}</li>
 *   <li>{@link de.dc.javafx.xcore.workbench.View#isIsClosable <em>Is Closable</em>}</li>
 *   <li>{@link de.dc.javafx.xcore.workbench.View#isRegistrateChangeListener <em>Registrate Change Listener</em>}</li>
 * </ul>
 *
 * @see de.dc.javafx.xcore.workbench.WorkbenchPackage#getView()
 * @model
 * @generated
 */
public interface View extends NamedElement {
	/**
	 * Returns the value of the '<em><b>View Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>View Class</em>' attribute.
	 * @see #setViewClass(String)
	 * @see de.dc.javafx.xcore.workbench.WorkbenchPackage#getView_ViewClass()
	 * @model unique="false"
	 * @generated
	 */
	String getViewClass();

	/**
	 * Sets the value of the '{@link de.dc.javafx.xcore.workbench.View#getViewClass <em>View Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>View Class</em>' attribute.
	 * @see #getViewClass()
	 * @generated
	 */
	void setViewClass(String value);

	/**
	 * Returns the value of the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Icon</em>' attribute.
	 * @see #setIcon(String)
	 * @see de.dc.javafx.xcore.workbench.WorkbenchPackage#getView_Icon()
	 * @model unique="false"
	 * @generated
	 */
	String getIcon();

	/**
	 * Sets the value of the '{@link de.dc.javafx.xcore.workbench.View#getIcon <em>Icon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Icon</em>' attribute.
	 * @see #getIcon()
	 * @generated
	 */
	void setIcon(String value);

	/**
	 * Returns the value of the '<em><b>Is Closable</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Closable</em>' attribute.
	 * @see #setIsClosable(boolean)
	 * @see de.dc.javafx.xcore.workbench.WorkbenchPackage#getView_IsClosable()
	 * @model default="true" unique="false"
	 * @generated
	 */
	boolean isIsClosable();

	/**
	 * Sets the value of the '{@link de.dc.javafx.xcore.workbench.View#isIsClosable <em>Is Closable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Closable</em>' attribute.
	 * @see #isIsClosable()
	 * @generated
	 */
	void setIsClosable(boolean value);

	/**
	 * Returns the value of the '<em><b>Registrate Change Listener</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Registrate Change Listener</em>' attribute.
	 * @see #setRegistrateChangeListener(boolean)
	 * @see de.dc.javafx.xcore.workbench.WorkbenchPackage#getView_RegistrateChangeListener()
	 * @model default="false" unique="false"
	 * @generated
	 */
	boolean isRegistrateChangeListener();

	/**
	 * Sets the value of the '{@link de.dc.javafx.xcore.workbench.View#isRegistrateChangeListener <em>Registrate Change Listener</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Registrate Change Listener</em>' attribute.
	 * @see #isRegistrateChangeListener()
	 * @generated
	 */
	void setRegistrateChangeListener(boolean value);

} // View
