/**
 */
package de.dc.javafx.xcore.workbench.extensions.impl;

import de.dc.javafx.xcore.workbench.extensions.Editor;
import de.dc.javafx.xcore.workbench.extensions.ExtensionsPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Editor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dc.javafx.xcore.workbench.extensions.impl.EditorImpl#getIcon <em>Icon</em>}</li>
 *   <li>{@link de.dc.javafx.xcore.workbench.extensions.impl.EditorImpl#getFileExtension <em>File Extension</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EditorImpl extends ExtensionImpl implements Editor {
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
	 * The default value of the '{@link #getFileExtension() <em>File Extension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileExtension()
	 * @generated
	 * @ordered
	 */
	protected static final String FILE_EXTENSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFileExtension() <em>File Extension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileExtension()
	 * @generated
	 * @ordered
	 */
	protected String fileExtension = FILE_EXTENSION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EditorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExtensionsPackage.Literals.EDITOR;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ExtensionsPackage.EDITOR__ICON, oldIcon, icon));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFileExtension() {
		return fileExtension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFileExtension(String newFileExtension) {
		String oldFileExtension = fileExtension;
		fileExtension = newFileExtension;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtensionsPackage.EDITOR__FILE_EXTENSION,
					oldFileExtension, fileExtension));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ExtensionsPackage.EDITOR__ICON:
			return getIcon();
		case ExtensionsPackage.EDITOR__FILE_EXTENSION:
			return getFileExtension();
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
		case ExtensionsPackage.EDITOR__ICON:
			setIcon((String) newValue);
			return;
		case ExtensionsPackage.EDITOR__FILE_EXTENSION:
			setFileExtension((String) newValue);
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
		case ExtensionsPackage.EDITOR__ICON:
			setIcon(ICON_EDEFAULT);
			return;
		case ExtensionsPackage.EDITOR__FILE_EXTENSION:
			setFileExtension(FILE_EXTENSION_EDEFAULT);
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
		case ExtensionsPackage.EDITOR__ICON:
			return ICON_EDEFAULT == null ? icon != null : !ICON_EDEFAULT.equals(icon);
		case ExtensionsPackage.EDITOR__FILE_EXTENSION:
			return FILE_EXTENSION_EDEFAULT == null ? fileExtension != null
					: !FILE_EXTENSION_EDEFAULT.equals(fileExtension);
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
		result.append(", fileExtension: ");
		result.append(fileExtension);
		result.append(')');
		return result.toString();
	}

} //EditorImpl
