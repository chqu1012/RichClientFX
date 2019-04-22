/**
 * generated by Xtext 2.17.0
 */
package de.dc.javafx.xcore.lang.edit.emfSupportDsl.impl;

import de.dc.javafx.xcore.lang.edit.emfSupportDsl.AddContextMenu;
import de.dc.javafx.xcore.lang.edit.emfSupportDsl.EmfSupportDslPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.xtext.common.types.JvmTypeReference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Add Context Menu</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dc.javafx.xcore.lang.edit.emfSupportDsl.impl.AddContextMenuImpl#getId <em>Id</em>}</li>
 *   <li>{@link de.dc.javafx.xcore.lang.edit.emfSupportDsl.impl.AddContextMenuImpl#getParentType <em>Parent Type</em>}</li>
 *   <li>{@link de.dc.javafx.xcore.lang.edit.emfSupportDsl.impl.AddContextMenuImpl#getCreateType <em>Create Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AddContextMenuImpl extends ContextMenuImpl implements AddContextMenu
{
  /**
   * The default value of the '{@link #getId() <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getId()
   * @generated
   * @ordered
   */
  protected static final String ID_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getId()
   * @generated
   * @ordered
   */
  protected String id = ID_EDEFAULT;

  /**
   * The cached value of the '{@link #getParentType() <em>Parent Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParentType()
   * @generated
   * @ordered
   */
  protected JvmTypeReference parentType;

  /**
   * The cached value of the '{@link #getCreateType() <em>Create Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCreateType()
   * @generated
   * @ordered
   */
  protected JvmTypeReference createType;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AddContextMenuImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return EmfSupportDslPackage.Literals.ADD_CONTEXT_MENU;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getId()
  {
    return id;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setId(String newId)
  {
    String oldId = id;
    id = newId;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EmfSupportDslPackage.ADD_CONTEXT_MENU__ID, oldId, id));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public JvmTypeReference getParentType()
  {
    return parentType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetParentType(JvmTypeReference newParentType, NotificationChain msgs)
  {
    JvmTypeReference oldParentType = parentType;
    parentType = newParentType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EmfSupportDslPackage.ADD_CONTEXT_MENU__PARENT_TYPE, oldParentType, newParentType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setParentType(JvmTypeReference newParentType)
  {
    if (newParentType != parentType)
    {
      NotificationChain msgs = null;
      if (parentType != null)
        msgs = ((InternalEObject)parentType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EmfSupportDslPackage.ADD_CONTEXT_MENU__PARENT_TYPE, null, msgs);
      if (newParentType != null)
        msgs = ((InternalEObject)newParentType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EmfSupportDslPackage.ADD_CONTEXT_MENU__PARENT_TYPE, null, msgs);
      msgs = basicSetParentType(newParentType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EmfSupportDslPackage.ADD_CONTEXT_MENU__PARENT_TYPE, newParentType, newParentType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public JvmTypeReference getCreateType()
  {
    return createType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCreateType(JvmTypeReference newCreateType, NotificationChain msgs)
  {
    JvmTypeReference oldCreateType = createType;
    createType = newCreateType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EmfSupportDslPackage.ADD_CONTEXT_MENU__CREATE_TYPE, oldCreateType, newCreateType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setCreateType(JvmTypeReference newCreateType)
  {
    if (newCreateType != createType)
    {
      NotificationChain msgs = null;
      if (createType != null)
        msgs = ((InternalEObject)createType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EmfSupportDslPackage.ADD_CONTEXT_MENU__CREATE_TYPE, null, msgs);
      if (newCreateType != null)
        msgs = ((InternalEObject)newCreateType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EmfSupportDslPackage.ADD_CONTEXT_MENU__CREATE_TYPE, null, msgs);
      msgs = basicSetCreateType(newCreateType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EmfSupportDslPackage.ADD_CONTEXT_MENU__CREATE_TYPE, newCreateType, newCreateType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case EmfSupportDslPackage.ADD_CONTEXT_MENU__PARENT_TYPE:
        return basicSetParentType(null, msgs);
      case EmfSupportDslPackage.ADD_CONTEXT_MENU__CREATE_TYPE:
        return basicSetCreateType(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case EmfSupportDslPackage.ADD_CONTEXT_MENU__ID:
        return getId();
      case EmfSupportDslPackage.ADD_CONTEXT_MENU__PARENT_TYPE:
        return getParentType();
      case EmfSupportDslPackage.ADD_CONTEXT_MENU__CREATE_TYPE:
        return getCreateType();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case EmfSupportDslPackage.ADD_CONTEXT_MENU__ID:
        setId((String)newValue);
        return;
      case EmfSupportDslPackage.ADD_CONTEXT_MENU__PARENT_TYPE:
        setParentType((JvmTypeReference)newValue);
        return;
      case EmfSupportDslPackage.ADD_CONTEXT_MENU__CREATE_TYPE:
        setCreateType((JvmTypeReference)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case EmfSupportDslPackage.ADD_CONTEXT_MENU__ID:
        setId(ID_EDEFAULT);
        return;
      case EmfSupportDslPackage.ADD_CONTEXT_MENU__PARENT_TYPE:
        setParentType((JvmTypeReference)null);
        return;
      case EmfSupportDslPackage.ADD_CONTEXT_MENU__CREATE_TYPE:
        setCreateType((JvmTypeReference)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case EmfSupportDslPackage.ADD_CONTEXT_MENU__ID:
        return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
      case EmfSupportDslPackage.ADD_CONTEXT_MENU__PARENT_TYPE:
        return parentType != null;
      case EmfSupportDslPackage.ADD_CONTEXT_MENU__CREATE_TYPE:
        return createType != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (id: ");
    result.append(id);
    result.append(')');
    return result.toString();
  }

} //AddContextMenuImpl
