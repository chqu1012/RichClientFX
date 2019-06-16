/**
 */
package de.dc.javafx.xcore.workbench.impl;

import de.dc.javafx.xcore.workbench.Editor;
import de.dc.javafx.xcore.workbench.WorkbenchPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Editor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dc.javafx.xcore.workbench.impl.EditorImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.dc.javafx.xcore.workbench.impl.EditorImpl#getFileExtension <em>File Extension</em>}</li>
 *   <li>{@link de.dc.javafx.xcore.workbench.impl.EditorImpl#getEditorUri <em>Editor Uri</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EditorImpl extends MinimalEObjectImpl.Container implements Editor {
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
	 * The default value of the '{@link #getEditorUri() <em>Editor Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEditorUri()
	 * @generated
	 * @ordered
	 */
	protected static final String EDITOR_URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEditorUri() <em>Editor Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEditorUri()
	 * @generated
	 * @ordered
	 */
	protected String editorUri = EDITOR_URI_EDEFAULT;

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
		return WorkbenchPackage.Literals.EDITOR;
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
			eNotify(new ENotificationImpl(this, Notification.SET, WorkbenchPackage.EDITOR__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WorkbenchPackage.EDITOR__FILE_EXTENSION,
					oldFileExtension, fileExtension));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEditorUri() {
		return editorUri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEditorUri(String newEditorUri) {
		String oldEditorUri = editorUri;
		editorUri = newEditorUri;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkbenchPackage.EDITOR__EDITOR_URI, oldEditorUri,
					editorUri));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case WorkbenchPackage.EDITOR__NAME:
			return getName();
		case WorkbenchPackage.EDITOR__FILE_EXTENSION:
			return getFileExtension();
		case WorkbenchPackage.EDITOR__EDITOR_URI:
			return getEditorUri();
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
		case WorkbenchPackage.EDITOR__NAME:
			setName((String) newValue);
			return;
		case WorkbenchPackage.EDITOR__FILE_EXTENSION:
			setFileExtension((String) newValue);
			return;
		case WorkbenchPackage.EDITOR__EDITOR_URI:
			setEditorUri((String) newValue);
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
		case WorkbenchPackage.EDITOR__NAME:
			setName(NAME_EDEFAULT);
			return;
		case WorkbenchPackage.EDITOR__FILE_EXTENSION:
			setFileExtension(FILE_EXTENSION_EDEFAULT);
			return;
		case WorkbenchPackage.EDITOR__EDITOR_URI:
			setEditorUri(EDITOR_URI_EDEFAULT);
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
		case WorkbenchPackage.EDITOR__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case WorkbenchPackage.EDITOR__FILE_EXTENSION:
			return FILE_EXTENSION_EDEFAULT == null ? fileExtension != null
					: !FILE_EXTENSION_EDEFAULT.equals(fileExtension);
		case WorkbenchPackage.EDITOR__EDITOR_URI:
			return EDITOR_URI_EDEFAULT == null ? editorUri != null : !EDITOR_URI_EDEFAULT.equals(editorUri);
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
		result.append(" (name: ");
		result.append(name);
		result.append(", fileExtension: ");
		result.append(fileExtension);
		result.append(", editorUri: ");
		result.append(editorUri);
		result.append(')');
		return result.toString();
	}

} //EditorImpl
