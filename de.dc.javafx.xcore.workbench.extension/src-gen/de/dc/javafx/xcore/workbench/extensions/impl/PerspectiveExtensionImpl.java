/**
 */
package de.dc.javafx.xcore.workbench.extensions.impl;

import de.dc.javafx.xcore.workbench.extensions.Editor;
import de.dc.javafx.xcore.workbench.extensions.ExtensionsPackage;
import de.dc.javafx.xcore.workbench.extensions.PerspectiveExtension;
import de.dc.javafx.xcore.workbench.extensions.View;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Perspective Extension</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dc.javafx.xcore.workbench.extensions.impl.PerspectiveExtensionImpl#getLeft <em>Left</em>}</li>
 *   <li>{@link de.dc.javafx.xcore.workbench.extensions.impl.PerspectiveExtensionImpl#getRight <em>Right</em>}</li>
 *   <li>{@link de.dc.javafx.xcore.workbench.extensions.impl.PerspectiveExtensionImpl#getBottom <em>Bottom</em>}</li>
 *   <li>{@link de.dc.javafx.xcore.workbench.extensions.impl.PerspectiveExtensionImpl#getEditorArea <em>Editor Area</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PerspectiveExtensionImpl extends ExtensionPointImpl implements PerspectiveExtension {
	/**
	 * The cached value of the '{@link #getLeft() <em>Left</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeft()
	 * @generated
	 * @ordered
	 */
	protected EList<View> left;

	/**
	 * The cached value of the '{@link #getRight() <em>Right</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRight()
	 * @generated
	 * @ordered
	 */
	protected EList<View> right;

	/**
	 * The cached value of the '{@link #getBottom() <em>Bottom</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBottom()
	 * @generated
	 * @ordered
	 */
	protected EList<View> bottom;

	/**
	 * The cached value of the '{@link #getEditorArea() <em>Editor Area</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEditorArea()
	 * @generated
	 * @ordered
	 */
	protected EList<Editor> editorArea;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PerspectiveExtensionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExtensionsPackage.Literals.PERSPECTIVE_EXTENSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<View> getLeft() {
		if (left == null) {
			left = new EObjectResolvingEList<View>(View.class, this, ExtensionsPackage.PERSPECTIVE_EXTENSION__LEFT);
		}
		return left;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<View> getRight() {
		if (right == null) {
			right = new EObjectResolvingEList<View>(View.class, this, ExtensionsPackage.PERSPECTIVE_EXTENSION__RIGHT);
		}
		return right;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<View> getBottom() {
		if (bottom == null) {
			bottom = new EObjectResolvingEList<View>(View.class, this, ExtensionsPackage.PERSPECTIVE_EXTENSION__BOTTOM);
		}
		return bottom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Editor> getEditorArea() {
		if (editorArea == null) {
			editorArea = new EObjectResolvingEList<Editor>(Editor.class, this,
					ExtensionsPackage.PERSPECTIVE_EXTENSION__EDITOR_AREA);
		}
		return editorArea;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ExtensionsPackage.PERSPECTIVE_EXTENSION__LEFT:
			return getLeft();
		case ExtensionsPackage.PERSPECTIVE_EXTENSION__RIGHT:
			return getRight();
		case ExtensionsPackage.PERSPECTIVE_EXTENSION__BOTTOM:
			return getBottom();
		case ExtensionsPackage.PERSPECTIVE_EXTENSION__EDITOR_AREA:
			return getEditorArea();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case ExtensionsPackage.PERSPECTIVE_EXTENSION__LEFT:
			getLeft().clear();
			getLeft().addAll((Collection<? extends View>) newValue);
			return;
		case ExtensionsPackage.PERSPECTIVE_EXTENSION__RIGHT:
			getRight().clear();
			getRight().addAll((Collection<? extends View>) newValue);
			return;
		case ExtensionsPackage.PERSPECTIVE_EXTENSION__BOTTOM:
			getBottom().clear();
			getBottom().addAll((Collection<? extends View>) newValue);
			return;
		case ExtensionsPackage.PERSPECTIVE_EXTENSION__EDITOR_AREA:
			getEditorArea().clear();
			getEditorArea().addAll((Collection<? extends Editor>) newValue);
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
		case ExtensionsPackage.PERSPECTIVE_EXTENSION__LEFT:
			getLeft().clear();
			return;
		case ExtensionsPackage.PERSPECTIVE_EXTENSION__RIGHT:
			getRight().clear();
			return;
		case ExtensionsPackage.PERSPECTIVE_EXTENSION__BOTTOM:
			getBottom().clear();
			return;
		case ExtensionsPackage.PERSPECTIVE_EXTENSION__EDITOR_AREA:
			getEditorArea().clear();
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
		case ExtensionsPackage.PERSPECTIVE_EXTENSION__LEFT:
			return left != null && !left.isEmpty();
		case ExtensionsPackage.PERSPECTIVE_EXTENSION__RIGHT:
			return right != null && !right.isEmpty();
		case ExtensionsPackage.PERSPECTIVE_EXTENSION__BOTTOM:
			return bottom != null && !bottom.isEmpty();
		case ExtensionsPackage.PERSPECTIVE_EXTENSION__EDITOR_AREA:
			return editorArea != null && !editorArea.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PerspectiveExtensionImpl
