/**
 * generated by Xtext 2.17.0
 */
package de.dc.javafx.xcore.lang.edit.emfSupportDsl;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.dc.javafx.xcore.lang.edit.emfSupportDsl.EmfSupportDslPackage
 * @generated
 */
public interface EmfSupportDslFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  EmfSupportDslFactory eINSTANCE = de.dc.javafx.xcore.lang.edit.emfSupportDsl.impl.EmfSupportDslFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Model</em>'.
   * @generated
   */
  Model createModel();

  /**
   * Returns a new object of class '<em>Ecore</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ecore</em>'.
   * @generated
   */
  Ecore createEcore();

  /**
   * Returns a new object of class '<em>Editable EAttributes</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Editable EAttributes</em>'.
   * @generated
   */
  EditableEAttributes createEditableEAttributes();

  /**
   * Returns a new object of class '<em>Context Menu</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Context Menu</em>'.
   * @generated
   */
  ContextMenu createContextMenu();

  /**
   * Returns a new object of class '<em>Add Context Menu</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Add Context Menu</em>'.
   * @generated
   */
  AddContextMenu createAddContextMenu();

  /**
   * Returns a new object of class '<em>Supported Control</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Supported Control</em>'.
   * @generated
   */
  SupportedControl createSupportedControl();

  /**
   * Returns a new object of class '<em>Tree View FX</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Tree View FX</em>'.
   * @generated
   */
  TreeViewFX createTreeViewFX();

  /**
   * Returns a new object of class '<em>Table View FX</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Table View FX</em>'.
   * @generated
   */
  TableViewFX createTableViewFX();

  /**
   * Returns a new object of class '<em>Tree Table</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Tree Table</em>'.
   * @generated
   */
  TreeTable createTreeTable();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  EmfSupportDslPackage getEmfSupportDslPackage();

} //EmfSupportDslFactory
