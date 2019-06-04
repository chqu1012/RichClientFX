/**
 */
package de.dc.javafx.xcore.workbench.impl;

import de.dc.javafx.xcore.workbench.View;
import de.dc.javafx.xcore.workbench.WorkbenchPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dc.javafx.xcore.workbench.impl.ViewImpl#getViewClass <em>View Class</em>}</li>
 *   <li>{@link de.dc.javafx.xcore.workbench.impl.ViewImpl#getIcon <em>Icon</em>}</li>
 *   <li>{@link de.dc.javafx.xcore.workbench.impl.ViewImpl#isIsClosable <em>Is Closable</em>}</li>
 *   <li>{@link de.dc.javafx.xcore.workbench.impl.ViewImpl#isRegistrateChangeListener <em>Registrate Change Listener</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ViewImpl extends NamedElementImpl implements View {
	/**
	 * The default value of the '{@link #getViewClass() <em>View Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViewClass()
	 * @generated
	 * @ordered
	 */
	protected static final String VIEW_CLASS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getViewClass() <em>View Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViewClass()
	 * @generated
	 * @ordered
	 */
	protected String viewClass = VIEW_CLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getIcon() <em>Icon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIcon()
	 * @generated
	 * @ordered
	 */
	protected static final String ICON_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIcon() <em>Icon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIcon()
	 * @generated
	 * @ordered
	 */
	protected String icon = ICON_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsClosable() <em>Is Closable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsClosable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_CLOSABLE_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isIsClosable() <em>Is Closable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsClosable()
	 * @generated
	 * @ordered
	 */
	protected boolean isClosable = IS_CLOSABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #isRegistrateChangeListener() <em>Registrate Change Listener</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRegistrateChangeListener()
	 * @generated
	 * @ordered
	 */
	protected static final boolean REGISTRATE_CHANGE_LISTENER_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRegistrateChangeListener() <em>Registrate Change Listener</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRegistrateChangeListener()
	 * @generated
	 * @ordered
	 */
	protected boolean registrateChangeListener = REGISTRATE_CHANGE_LISTENER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ViewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WorkbenchPackage.Literals.VIEW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getViewClass() {
		return viewClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setViewClass(String newViewClass) {
		String oldViewClass = viewClass;
		viewClass = newViewClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkbenchPackage.VIEW__VIEW_CLASS, oldViewClass,
					viewClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getIcon() {
		return icon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIcon(String newIcon) {
		String oldIcon = icon;
		icon = newIcon;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkbenchPackage.VIEW__ICON, oldIcon, icon));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsClosable() {
		return isClosable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsClosable(boolean newIsClosable) {
		boolean oldIsClosable = isClosable;
		isClosable = newIsClosable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkbenchPackage.VIEW__IS_CLOSABLE, oldIsClosable,
					isClosable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isRegistrateChangeListener() {
		return registrateChangeListener;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRegistrateChangeListener(boolean newRegistrateChangeListener) {
		boolean oldRegistrateChangeListener = registrateChangeListener;
		registrateChangeListener = newRegistrateChangeListener;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkbenchPackage.VIEW__REGISTRATE_CHANGE_LISTENER,
					oldRegistrateChangeListener, registrateChangeListener));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case WorkbenchPackage.VIEW__VIEW_CLASS:
			return getViewClass();
		case WorkbenchPackage.VIEW__ICON:
			return getIcon();
		case WorkbenchPackage.VIEW__IS_CLOSABLE:
			return isIsClosable();
		case WorkbenchPackage.VIEW__REGISTRATE_CHANGE_LISTENER:
			return isRegistrateChangeListener();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case WorkbenchPackage.VIEW__VIEW_CLASS:
			setViewClass((String) newValue);
			return;
		case WorkbenchPackage.VIEW__ICON:
			setIcon((String) newValue);
			return;
		case WorkbenchPackage.VIEW__IS_CLOSABLE:
			setIsClosable((Boolean) newValue);
			return;
		case WorkbenchPackage.VIEW__REGISTRATE_CHANGE_LISTENER:
			setRegistrateChangeListener((Boolean) newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
		case WorkbenchPackage.VIEW__VIEW_CLASS:
			setViewClass(VIEW_CLASS_EDEFAULT);
			return;
		case WorkbenchPackage.VIEW__ICON:
			setIcon(ICON_EDEFAULT);
			return;
		case WorkbenchPackage.VIEW__IS_CLOSABLE:
			setIsClosable(IS_CLOSABLE_EDEFAULT);
			return;
		case WorkbenchPackage.VIEW__REGISTRATE_CHANGE_LISTENER:
			setRegistrateChangeListener(REGISTRATE_CHANGE_LISTENER_EDEFAULT);
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case WorkbenchPackage.VIEW__VIEW_CLASS:
			return VIEW_CLASS_EDEFAULT == null ? viewClass != null : !VIEW_CLASS_EDEFAULT.equals(viewClass);
		case WorkbenchPackage.VIEW__ICON:
			return ICON_EDEFAULT == null ? icon != null : !ICON_EDEFAULT.equals(icon);
		case WorkbenchPackage.VIEW__IS_CLOSABLE:
			return isClosable != IS_CLOSABLE_EDEFAULT;
		case WorkbenchPackage.VIEW__REGISTRATE_CHANGE_LISTENER:
			return registrateChangeListener != REGISTRATE_CHANGE_LISTENER_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (viewClass: ");
		result.append(viewClass);
		result.append(", icon: ");
		result.append(icon);
		result.append(", isClosable: ");
		result.append(isClosable);
		result.append(", registrateChangeListener: ");
		result.append(registrateChangeListener);
		result.append(')');
		return result.toString();
	}

} //ViewImpl
