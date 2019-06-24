/**
 */
package de.dc.javafx.xcore.workbench.extensions;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.dc.javafx.xcore.workbench.extensions.ExtensionsPackage
 * @generated
 */
public interface ExtensionsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ExtensionsFactory eINSTANCE = de.dc.javafx.xcore.workbench.extensions.impl.ExtensionsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Extension Manager</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Extension Manager</em>'.
	 * @generated
	 */
	ExtensionManager createExtensionManager();

	/**
	 * Returns a new object of class '<em>View Extension</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>View Extension</em>'.
	 * @generated
	 */
	ViewExtension createViewExtension();

	/**
	 * Returns a new object of class '<em>Editor Extension</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Editor Extension</em>'.
	 * @generated
	 */
	EditorExtension createEditorExtension();

	/**
	 * Returns a new object of class '<em>Menu Extension</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Menu Extension</em>'.
	 * @generated
	 */
	MenuExtension createMenuExtension();

	/**
	 * Returns a new object of class '<em>Toolbar Extension</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Toolbar Extension</em>'.
	 * @generated
	 */
	ToolbarExtension createToolbarExtension();

	/**
	 * Returns a new object of class '<em>Perspective Extension</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Perspective Extension</em>'.
	 * @generated
	 */
	PerspectiveExtension createPerspectiveExtension();

	/**
	 * Returns a new object of class '<em>View</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>View</em>'.
	 * @generated
	 */
	View createView();

	/**
	 * Returns a new object of class '<em>Editor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Editor</em>'.
	 * @generated
	 */
	Editor createEditor();

	/**
	 * Returns a new object of class '<em>Perspective</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Perspective</em>'.
	 * @generated
	 */
	Perspective createPerspective();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ExtensionsPackage getExtensionsPackage();

} //ExtensionsFactory
