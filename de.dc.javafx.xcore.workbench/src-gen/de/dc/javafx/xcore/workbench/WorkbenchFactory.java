/**
 */
package de.dc.javafx.xcore.workbench;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.dc.javafx.xcore.workbench.WorkbenchPackage
 * @generated
 */
public interface WorkbenchFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	WorkbenchFactory eINSTANCE = de.dc.javafx.xcore.workbench.impl.WorkbenchFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Named Element</em>'.
	 * @generated
	 */
	NamedElement createNamedElement();

	/**
	 * Returns a new object of class '<em>Workbench</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Workbench</em>'.
	 * @generated
	 */
	Workbench createWorkbench();

	/**
	 * Returns a new object of class '<em>Perspective</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Perspective</em>'.
	 * @generated
	 */
	Perspective createPerspective();

	/**
	 * Returns a new object of class '<em>Command</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Command</em>'.
	 * @generated
	 */
	Command createCommand();

	/**
	 * Returns a new object of class '<em>View</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>View</em>'.
	 * @generated
	 */
	View createView();

	/**
	 * Returns a new object of class '<em>Editor Area</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Editor Area</em>'.
	 * @generated
	 */
	EditorArea createEditorArea();

	/**
	 * Returns a new object of class '<em>Left Pane</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Left Pane</em>'.
	 * @generated
	 */
	LeftPane createLeftPane();

	/**
	 * Returns a new object of class '<em>Right Pane</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Right Pane</em>'.
	 * @generated
	 */
	RightPane createRightPane();

	/**
	 * Returns a new object of class '<em>Bottom Pane</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bottom Pane</em>'.
	 * @generated
	 */
	BottomPane createBottomPane();

	/**
	 * Returns a new object of class '<em>Toolbar</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Toolbar</em>'.
	 * @generated
	 */
	Toolbar createToolbar();

	/**
	 * Returns a new object of class '<em>Toolbar Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Toolbar Item</em>'.
	 * @generated
	 */
	ToolbarItem createToolbarItem();

	/**
	 * Returns a new object of class '<em>Statusline</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Statusline</em>'.
	 * @generated
	 */
	Statusline createStatusline();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	WorkbenchPackage getWorkbenchPackage();

} //WorkbenchFactory
