/**
 */
package de.dc.javafx.xcore.workbench.impl;

import de.dc.javafx.xcore.workbench.View;
import de.dc.javafx.xcore.workbench.WorkbenchPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.xtext.common.types.JvmTypeReference;

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
 * </ul>
 *
 * @generated
 */
public class ViewImpl extends NamedElementImpl implements View {
	/**
	 * The cached value of the '{@link #getViewClass() <em>View Class</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViewClass()
	 * @generated
	 * @ordered
	 */
	protected JvmTypeReference viewClass;

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
	public JvmTypeReference getViewClass() {
		return viewClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetViewClass(JvmTypeReference newViewClass, NotificationChain msgs) {
		JvmTypeReference oldViewClass = viewClass;
		viewClass = newViewClass;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					WorkbenchPackage.VIEW__VIEW_CLASS, oldViewClass, newViewClass);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setViewClass(JvmTypeReference newViewClass) {
		if (newViewClass != viewClass) {
			NotificationChain msgs = null;
			if (viewClass != null)
				msgs = ((InternalEObject) viewClass).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - WorkbenchPackage.VIEW__VIEW_CLASS, null, msgs);
			if (newViewClass != null)
				msgs = ((InternalEObject) newViewClass).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - WorkbenchPackage.VIEW__VIEW_CLASS, null, msgs);
			msgs = basicSetViewClass(newViewClass, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkbenchPackage.VIEW__VIEW_CLASS, newViewClass,
					newViewClass));
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
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case WorkbenchPackage.VIEW__VIEW_CLASS:
			return basicSetViewClass(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
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
			setViewClass((JvmTypeReference) newValue);
			return;
		case WorkbenchPackage.VIEW__ICON:
			setIcon((String) newValue);
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
			setViewClass((JvmTypeReference) null);
			return;
		case WorkbenchPackage.VIEW__ICON:
			setIcon(ICON_EDEFAULT);
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
			return viewClass != null;
		case WorkbenchPackage.VIEW__ICON:
			return ICON_EDEFAULT == null ? icon != null : !ICON_EDEFAULT.equals(icon);
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
		result.append(" (icon: ");
		result.append(icon);
		result.append(')');
		return result.toString();
	}

} //ViewImpl
