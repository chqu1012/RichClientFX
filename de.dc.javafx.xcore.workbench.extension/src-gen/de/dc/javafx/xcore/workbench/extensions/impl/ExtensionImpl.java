/**
 */
package de.dc.javafx.xcore.workbench.extensions.impl;

import de.dc.javafx.xcore.workbench.extensions.Extension;
import de.dc.javafx.xcore.workbench.extensions.ExtensionsPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Extension</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dc.javafx.xcore.workbench.extensions.impl.ExtensionImpl#getId <em>Id</em>}</li>
 *   <li>{@link de.dc.javafx.xcore.workbench.extensions.impl.ExtensionImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.dc.javafx.xcore.workbench.extensions.impl.ExtensionImpl#getExtensionUri <em>Extension Uri</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ExtensionImpl extends MinimalEObjectImpl.Container implements Extension {
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
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getExtensionUri() <em>Extension Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtensionUri()
	 * @generated
	 * @ordered
	 */
	protected static final String EXTENSION_URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExtensionUri() <em>Extension Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtensionUri()
	 * @generated
	 * @ordered
	 */
	protected String extensionUri = EXTENSION_URI_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExtensionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExtensionsPackage.Literals.EXTENSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtensionsPackage.EXTENSION__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtensionsPackage.EXTENSION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getExtensionUri() {
		return extensionUri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExtensionUri(String newExtensionUri) {
		String oldExtensionUri = extensionUri;
		extensionUri = newExtensionUri;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtensionsPackage.EXTENSION__EXTENSION_URI,
					oldExtensionUri, extensionUri));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ExtensionsPackage.EXTENSION__ID:
			return getId();
		case ExtensionsPackage.EXTENSION__NAME:
			return getName();
		case ExtensionsPackage.EXTENSION__EXTENSION_URI:
			return getExtensionUri();
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
		case ExtensionsPackage.EXTENSION__ID:
			setId((String) newValue);
			return;
		case ExtensionsPackage.EXTENSION__NAME:
			setName((String) newValue);
			return;
		case ExtensionsPackage.EXTENSION__EXTENSION_URI:
			setExtensionUri((String) newValue);
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
		case ExtensionsPackage.EXTENSION__ID:
			setId(ID_EDEFAULT);
			return;
		case ExtensionsPackage.EXTENSION__NAME:
			setName(NAME_EDEFAULT);
			return;
		case ExtensionsPackage.EXTENSION__EXTENSION_URI:
			setExtensionUri(EXTENSION_URI_EDEFAULT);
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
		case ExtensionsPackage.EXTENSION__ID:
			return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
		case ExtensionsPackage.EXTENSION__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case ExtensionsPackage.EXTENSION__EXTENSION_URI:
			return EXTENSION_URI_EDEFAULT == null ? extensionUri != null : !EXTENSION_URI_EDEFAULT.equals(extensionUri);
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
		result.append(" (Id: ");
		result.append(id);
		result.append(", name: ");
		result.append(name);
		result.append(", extensionUri: ");
		result.append(extensionUri);
		result.append(')');
		return result.toString();
	}

} //ExtensionImpl
