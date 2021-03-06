/**
 * generated by Xtext 2.17.0
 */
package de.dc.javafx.xcore.lang.edit.emfSupportDsl.util;

import de.dc.javafx.xcore.lang.edit.emfSupportDsl.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see de.dc.javafx.xcore.lang.edit.emfSupportDsl.EmfSupportDslPackage
 * @generated
 */
public class EmfSupportDslSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static EmfSupportDslPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EmfSupportDslSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = EmfSupportDslPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case EmfSupportDslPackage.MODEL:
      {
        Model model = (Model)theEObject;
        T result = caseModel(model);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EmfSupportDslPackage.ECORE:
      {
        Ecore ecore = (Ecore)theEObject;
        T result = caseEcore(ecore);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EmfSupportDslPackage.EDITABLE_EATTRIBUTES:
      {
        EditableEAttributes editableEAttributes = (EditableEAttributes)theEObject;
        T result = caseEditableEAttributes(editableEAttributes);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EmfSupportDslPackage.CONTEXT_MENU:
      {
        ContextMenu contextMenu = (ContextMenu)theEObject;
        T result = caseContextMenu(contextMenu);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EmfSupportDslPackage.COPY_CONTEXT_MENU:
      {
        CopyContextMenu copyContextMenu = (CopyContextMenu)theEObject;
        T result = caseCopyContextMenu(copyContextMenu);
        if (result == null) result = caseContextMenu(copyContextMenu);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EmfSupportDslPackage.ADD_CONTEXT_MENU:
      {
        AddContextMenu addContextMenu = (AddContextMenu)theEObject;
        T result = caseAddContextMenu(addContextMenu);
        if (result == null) result = caseContextMenu(addContextMenu);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EmfSupportDslPackage.SUPPORTED_CONTROL:
      {
        SupportedControl supportedControl = (SupportedControl)theEObject;
        T result = caseSupportedControl(supportedControl);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EmfSupportDslPackage.TREE_VIEW_FX:
      {
        TreeViewFX treeViewFX = (TreeViewFX)theEObject;
        T result = caseTreeViewFX(treeViewFX);
        if (result == null) result = caseSupportedControl(treeViewFX);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EmfSupportDslPackage.LIST_VIEW_FX:
      {
        ListViewFX listViewFX = (ListViewFX)theEObject;
        T result = caseListViewFX(listViewFX);
        if (result == null) result = caseSupportedControl(listViewFX);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EmfSupportDslPackage.TABLE_VIEW_FX:
      {
        TableViewFX tableViewFX = (TableViewFX)theEObject;
        T result = caseTableViewFX(tableViewFX);
        if (result == null) result = caseSupportedControl(tableViewFX);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EmfSupportDslPackage.TREE_TABLE:
      {
        TreeTable treeTable = (TreeTable)theEObject;
        T result = caseTreeTable(treeTable);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Model</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModel(Model object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Ecore</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Ecore</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEcore(Ecore object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Editable EAttributes</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Editable EAttributes</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEditableEAttributes(EditableEAttributes object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Context Menu</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Context Menu</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseContextMenu(ContextMenu object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Copy Context Menu</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Copy Context Menu</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCopyContextMenu(CopyContextMenu object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Add Context Menu</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Add Context Menu</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAddContextMenu(AddContextMenu object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Supported Control</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Supported Control</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSupportedControl(SupportedControl object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Tree View FX</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Tree View FX</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTreeViewFX(TreeViewFX object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>List View FX</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>List View FX</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseListViewFX(ListViewFX object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Table View FX</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Table View FX</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTableViewFX(TableViewFX object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Tree Table</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Tree Table</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTreeTable(TreeTable object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //EmfSupportDslSwitch
