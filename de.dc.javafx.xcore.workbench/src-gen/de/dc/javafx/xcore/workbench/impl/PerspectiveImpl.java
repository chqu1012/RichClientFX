/**
 */
package de.dc.javafx.xcore.workbench.impl;

import de.dc.javafx.xcore.workbench.BottomPane;
import de.dc.javafx.xcore.workbench.EditorArea;
import de.dc.javafx.xcore.workbench.LeftPane;
import de.dc.javafx.xcore.workbench.Perspective;
import de.dc.javafx.xcore.workbench.RightPane;
import de.dc.javafx.xcore.workbench.WorkbenchPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Perspective</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dc.javafx.xcore.workbench.impl.PerspectiveImpl#getLeftPane <em>Left Pane</em>}</li>
 *   <li>{@link de.dc.javafx.xcore.workbench.impl.PerspectiveImpl#getRightPane <em>Right Pane</em>}</li>
 *   <li>{@link de.dc.javafx.xcore.workbench.impl.PerspectiveImpl#getBottomPane <em>Bottom Pane</em>}</li>
 *   <li>{@link de.dc.javafx.xcore.workbench.impl.PerspectiveImpl#getEditorArea <em>Editor Area</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PerspectiveImpl extends NamedElementImpl implements Perspective {
	/**
	 * The cached value of the '{@link #getLeftPane() <em>Left Pane</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeftPane()
	 * @generated
	 * @ordered
	 */
	protected LeftPane leftPane;

	/**
	 * The cached value of the '{@link #getRightPane() <em>Right Pane</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRightPane()
	 * @generated
	 * @ordered
	 */
	protected RightPane rightPane;

	/**
	 * The cached value of the '{@link #getBottomPane() <em>Bottom Pane</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBottomPane()
	 * @generated
	 * @ordered
	 */
	protected BottomPane bottomPane;

	/**
	 * The cached value of the '{@link #getEditorArea() <em>Editor Area</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEditorArea()
	 * @generated
	 * @ordered
	 */
	protected EditorArea editorArea;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PerspectiveImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WorkbenchPackage.Literals.PERSPECTIVE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LeftPane getLeftPane() {
		return leftPane;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLeftPane(LeftPane newLeftPane, NotificationChain msgs) {
		LeftPane oldLeftPane = leftPane;
		leftPane = newLeftPane;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					WorkbenchPackage.PERSPECTIVE__LEFT_PANE, oldLeftPane, newLeftPane);
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
	public void setLeftPane(LeftPane newLeftPane) {
		if (newLeftPane != leftPane) {
			NotificationChain msgs = null;
			if (leftPane != null)
				msgs = ((InternalEObject) leftPane).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - WorkbenchPackage.PERSPECTIVE__LEFT_PANE, null, msgs);
			if (newLeftPane != null)
				msgs = ((InternalEObject) newLeftPane).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - WorkbenchPackage.PERSPECTIVE__LEFT_PANE, null, msgs);
			msgs = basicSetLeftPane(newLeftPane, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkbenchPackage.PERSPECTIVE__LEFT_PANE, newLeftPane,
					newLeftPane));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RightPane getRightPane() {
		return rightPane;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRightPane(RightPane newRightPane, NotificationChain msgs) {
		RightPane oldRightPane = rightPane;
		rightPane = newRightPane;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					WorkbenchPackage.PERSPECTIVE__RIGHT_PANE, oldRightPane, newRightPane);
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
	public void setRightPane(RightPane newRightPane) {
		if (newRightPane != rightPane) {
			NotificationChain msgs = null;
			if (rightPane != null)
				msgs = ((InternalEObject) rightPane).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - WorkbenchPackage.PERSPECTIVE__RIGHT_PANE, null, msgs);
			if (newRightPane != null)
				msgs = ((InternalEObject) newRightPane).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - WorkbenchPackage.PERSPECTIVE__RIGHT_PANE, null, msgs);
			msgs = basicSetRightPane(newRightPane, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkbenchPackage.PERSPECTIVE__RIGHT_PANE,
					newRightPane, newRightPane));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BottomPane getBottomPane() {
		return bottomPane;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBottomPane(BottomPane newBottomPane, NotificationChain msgs) {
		BottomPane oldBottomPane = bottomPane;
		bottomPane = newBottomPane;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					WorkbenchPackage.PERSPECTIVE__BOTTOM_PANE, oldBottomPane, newBottomPane);
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
	public void setBottomPane(BottomPane newBottomPane) {
		if (newBottomPane != bottomPane) {
			NotificationChain msgs = null;
			if (bottomPane != null)
				msgs = ((InternalEObject) bottomPane).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - WorkbenchPackage.PERSPECTIVE__BOTTOM_PANE, null, msgs);
			if (newBottomPane != null)
				msgs = ((InternalEObject) newBottomPane).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - WorkbenchPackage.PERSPECTIVE__BOTTOM_PANE, null, msgs);
			msgs = basicSetBottomPane(newBottomPane, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkbenchPackage.PERSPECTIVE__BOTTOM_PANE,
					newBottomPane, newBottomPane));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EditorArea getEditorArea() {
		return editorArea;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEditorArea(EditorArea newEditorArea, NotificationChain msgs) {
		EditorArea oldEditorArea = editorArea;
		editorArea = newEditorArea;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					WorkbenchPackage.PERSPECTIVE__EDITOR_AREA, oldEditorArea, newEditorArea);
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
	public void setEditorArea(EditorArea newEditorArea) {
		if (newEditorArea != editorArea) {
			NotificationChain msgs = null;
			if (editorArea != null)
				msgs = ((InternalEObject) editorArea).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - WorkbenchPackage.PERSPECTIVE__EDITOR_AREA, null, msgs);
			if (newEditorArea != null)
				msgs = ((InternalEObject) newEditorArea).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - WorkbenchPackage.PERSPECTIVE__EDITOR_AREA, null, msgs);
			msgs = basicSetEditorArea(newEditorArea, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkbenchPackage.PERSPECTIVE__EDITOR_AREA,
					newEditorArea, newEditorArea));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case WorkbenchPackage.PERSPECTIVE__LEFT_PANE:
			return basicSetLeftPane(null, msgs);
		case WorkbenchPackage.PERSPECTIVE__RIGHT_PANE:
			return basicSetRightPane(null, msgs);
		case WorkbenchPackage.PERSPECTIVE__BOTTOM_PANE:
			return basicSetBottomPane(null, msgs);
		case WorkbenchPackage.PERSPECTIVE__EDITOR_AREA:
			return basicSetEditorArea(null, msgs);
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
		case WorkbenchPackage.PERSPECTIVE__LEFT_PANE:
			return getLeftPane();
		case WorkbenchPackage.PERSPECTIVE__RIGHT_PANE:
			return getRightPane();
		case WorkbenchPackage.PERSPECTIVE__BOTTOM_PANE:
			return getBottomPane();
		case WorkbenchPackage.PERSPECTIVE__EDITOR_AREA:
			return getEditorArea();
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
		case WorkbenchPackage.PERSPECTIVE__LEFT_PANE:
			setLeftPane((LeftPane) newValue);
			return;
		case WorkbenchPackage.PERSPECTIVE__RIGHT_PANE:
			setRightPane((RightPane) newValue);
			return;
		case WorkbenchPackage.PERSPECTIVE__BOTTOM_PANE:
			setBottomPane((BottomPane) newValue);
			return;
		case WorkbenchPackage.PERSPECTIVE__EDITOR_AREA:
			setEditorArea((EditorArea) newValue);
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
		case WorkbenchPackage.PERSPECTIVE__LEFT_PANE:
			setLeftPane((LeftPane) null);
			return;
		case WorkbenchPackage.PERSPECTIVE__RIGHT_PANE:
			setRightPane((RightPane) null);
			return;
		case WorkbenchPackage.PERSPECTIVE__BOTTOM_PANE:
			setBottomPane((BottomPane) null);
			return;
		case WorkbenchPackage.PERSPECTIVE__EDITOR_AREA:
			setEditorArea((EditorArea) null);
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
		case WorkbenchPackage.PERSPECTIVE__LEFT_PANE:
			return leftPane != null;
		case WorkbenchPackage.PERSPECTIVE__RIGHT_PANE:
			return rightPane != null;
		case WorkbenchPackage.PERSPECTIVE__BOTTOM_PANE:
			return bottomPane != null;
		case WorkbenchPackage.PERSPECTIVE__EDITOR_AREA:
			return editorArea != null;
		}
		return super.eIsSet(featureID);
	}

} //PerspectiveImpl
