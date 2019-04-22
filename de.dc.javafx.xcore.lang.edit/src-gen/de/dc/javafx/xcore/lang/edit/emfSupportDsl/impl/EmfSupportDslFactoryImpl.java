/**
 * generated by Xtext 2.17.0
 */
package de.dc.javafx.xcore.lang.edit.emfSupportDsl.impl;

import de.dc.javafx.xcore.lang.edit.emfSupportDsl.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EmfSupportDslFactoryImpl extends EFactoryImpl implements EmfSupportDslFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static EmfSupportDslFactory init()
  {
    try
    {
      EmfSupportDslFactory theEmfSupportDslFactory = (EmfSupportDslFactory)EPackage.Registry.INSTANCE.getEFactory(EmfSupportDslPackage.eNS_URI);
      if (theEmfSupportDslFactory != null)
      {
        return theEmfSupportDslFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new EmfSupportDslFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EmfSupportDslFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case EmfSupportDslPackage.MODEL: return createModel();
      case EmfSupportDslPackage.ECORE: return createEcore();
      case EmfSupportDslPackage.EDITABLE_EATTRIBUTES: return createEditableEAttributes();
      case EmfSupportDslPackage.CONTEXT_MENU: return createContextMenu();
      case EmfSupportDslPackage.ADD_CONTEXT_MENU: return createAddContextMenu();
      case EmfSupportDslPackage.SUPPORTED_CONTROL: return createSupportedControl();
      case EmfSupportDslPackage.TREE_VIEW_FX: return createTreeViewFX();
      case EmfSupportDslPackage.TABLE_VIEW_FX: return createTableViewFX();
      case EmfSupportDslPackage.TREE_TABLE: return createTreeTable();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Ecore createEcore()
  {
    EcoreImpl ecore = new EcoreImpl();
    return ecore;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EditableEAttributes createEditableEAttributes()
  {
    EditableEAttributesImpl editableEAttributes = new EditableEAttributesImpl();
    return editableEAttributes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ContextMenu createContextMenu()
  {
    ContextMenuImpl contextMenu = new ContextMenuImpl();
    return contextMenu;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public AddContextMenu createAddContextMenu()
  {
    AddContextMenuImpl addContextMenu = new AddContextMenuImpl();
    return addContextMenu;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SupportedControl createSupportedControl()
  {
    SupportedControlImpl supportedControl = new SupportedControlImpl();
    return supportedControl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public TreeViewFX createTreeViewFX()
  {
    TreeViewFXImpl treeViewFX = new TreeViewFXImpl();
    return treeViewFX;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public TableViewFX createTableViewFX()
  {
    TableViewFXImpl tableViewFX = new TableViewFXImpl();
    return tableViewFX;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public TreeTable createTreeTable()
  {
    TreeTableImpl treeTable = new TreeTableImpl();
    return treeTable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EmfSupportDslPackage getEmfSupportDslPackage()
  {
    return (EmfSupportDslPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static EmfSupportDslPackage getPackage()
  {
    return EmfSupportDslPackage.eINSTANCE;
  }

} //EmfSupportDslFactoryImpl
