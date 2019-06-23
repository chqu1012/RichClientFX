/**
 */
package de.dc.javafx.xcore.workbench.extensions.util;

import de.dc.javafx.xcore.workbench.extensions.*;

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
 * @see de.dc.javafx.xcore.workbench.extensions.ExtensionsPackage
 * @generated
 */
public class ExtensionsSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ExtensionsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtensionsSwitch() {
		if (modelPackage == null) {
			modelPackage = ExtensionsPackage.eINSTANCE;
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
	protected boolean isSwitchFor(EPackage ePackage) {
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
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case ExtensionsPackage.EXTENSION_MANAGER: {
			ExtensionManager extensionManager = (ExtensionManager) theEObject;
			T result = caseExtensionManager(extensionManager);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ExtensionsPackage.EXTENSION: {
			Extension extension = (Extension) theEObject;
			T result = caseExtension(extension);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ExtensionsPackage.EXTENSION_POINT: {
			ExtensionPoint extensionPoint = (ExtensionPoint) theEObject;
			T result = caseExtensionPoint(extensionPoint);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ExtensionsPackage.VIEW_EXTENSION: {
			ViewExtension viewExtension = (ViewExtension) theEObject;
			T result = caseViewExtension(viewExtension);
			if (result == null)
				result = caseExtensionPoint(viewExtension);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ExtensionsPackage.EDITOR_EXTENSION: {
			EditorExtension editorExtension = (EditorExtension) theEObject;
			T result = caseEditorExtension(editorExtension);
			if (result == null)
				result = caseExtensionPoint(editorExtension);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ExtensionsPackage.MENU_EXTENSION: {
			MenuExtension menuExtension = (MenuExtension) theEObject;
			T result = caseMenuExtension(menuExtension);
			if (result == null)
				result = caseExtensionPoint(menuExtension);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ExtensionsPackage.TOOLBAR_EXTENSION: {
			ToolbarExtension toolbarExtension = (ToolbarExtension) theEObject;
			T result = caseToolbarExtension(toolbarExtension);
			if (result == null)
				result = caseExtensionPoint(toolbarExtension);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ExtensionsPackage.PERSPECTIVE_EXTENSION: {
			PerspectiveExtension perspectiveExtension = (PerspectiveExtension) theEObject;
			T result = casePerspectiveExtension(perspectiveExtension);
			if (result == null)
				result = caseExtensionPoint(perspectiveExtension);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ExtensionsPackage.VIEW: {
			View view = (View) theEObject;
			T result = caseView(view);
			if (result == null)
				result = caseExtension(view);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ExtensionsPackage.EDITOR: {
			Editor editor = (Editor) theEObject;
			T result = caseEditor(editor);
			if (result == null)
				result = caseExtension(editor);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Extension Manager</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Extension Manager</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExtensionManager(ExtensionManager object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Extension</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Extension</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExtension(Extension object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Extension Point</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Extension Point</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExtensionPoint(ExtensionPoint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>View Extension</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>View Extension</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseViewExtension(ViewExtension object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Editor Extension</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Editor Extension</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEditorExtension(EditorExtension object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Menu Extension</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Menu Extension</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMenuExtension(MenuExtension object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Toolbar Extension</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Toolbar Extension</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseToolbarExtension(ToolbarExtension object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Perspective Extension</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Perspective Extension</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePerspectiveExtension(PerspectiveExtension object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseView(View object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Editor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Editor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEditor(Editor object) {
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
	public T defaultCase(EObject object) {
		return null;
	}

} //ExtensionsSwitch
