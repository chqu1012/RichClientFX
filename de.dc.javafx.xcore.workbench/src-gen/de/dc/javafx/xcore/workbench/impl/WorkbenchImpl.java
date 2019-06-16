/**
 */
package de.dc.javafx.xcore.workbench.impl;

import de.dc.javafx.xcore.workbench.Command;
import de.dc.javafx.xcore.workbench.EditorRegistry;
import de.dc.javafx.xcore.workbench.Perspective;
import de.dc.javafx.xcore.workbench.Statusline;
import de.dc.javafx.xcore.workbench.Toolbar;
import de.dc.javafx.xcore.workbench.Workbench;
import de.dc.javafx.xcore.workbench.WorkbenchPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Workbench</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dc.javafx.xcore.workbench.impl.WorkbenchImpl#getToolbar <em>Toolbar</em>}</li>
 *   <li>{@link de.dc.javafx.xcore.workbench.impl.WorkbenchImpl#getStatusline <em>Statusline</em>}</li>
 *   <li>{@link de.dc.javafx.xcore.workbench.impl.WorkbenchImpl#getPerspectives <em>Perspectives</em>}</li>
 *   <li>{@link de.dc.javafx.xcore.workbench.impl.WorkbenchImpl#getCommands <em>Commands</em>}</li>
 *   <li>{@link de.dc.javafx.xcore.workbench.impl.WorkbenchImpl#getEditorRegistry <em>Editor Registry</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WorkbenchImpl extends MinimalEObjectImpl.Container implements Workbench {
	/**
	 * The cached value of the '{@link #getToolbar() <em>Toolbar</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToolbar()
	 * @generated
	 * @ordered
	 */
	protected Toolbar toolbar;

	/**
	 * The cached value of the '{@link #getStatusline() <em>Statusline</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatusline()
	 * @generated
	 * @ordered
	 */
	protected Statusline statusline;

	/**
	 * The cached value of the '{@link #getPerspectives() <em>Perspectives</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerspectives()
	 * @generated
	 * @ordered
	 */
	protected EList<Perspective> perspectives;

	/**
	 * The cached value of the '{@link #getCommands() <em>Commands</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommands()
	 * @generated
	 * @ordered
	 */
	protected EList<Command> commands;

	/**
	 * The cached value of the '{@link #getEditorRegistry() <em>Editor Registry</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEditorRegistry()
	 * @generated
	 * @ordered
	 */
	protected EditorRegistry editorRegistry;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorkbenchImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WorkbenchPackage.Literals.WORKBENCH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Toolbar getToolbar() {
		return toolbar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetToolbar(Toolbar newToolbar, NotificationChain msgs) {
		Toolbar oldToolbar = toolbar;
		toolbar = newToolbar;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					WorkbenchPackage.WORKBENCH__TOOLBAR, oldToolbar, newToolbar);
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
	public void setToolbar(Toolbar newToolbar) {
		if (newToolbar != toolbar) {
			NotificationChain msgs = null;
			if (toolbar != null)
				msgs = ((InternalEObject) toolbar).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - WorkbenchPackage.WORKBENCH__TOOLBAR, null, msgs);
			if (newToolbar != null)
				msgs = ((InternalEObject) newToolbar).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - WorkbenchPackage.WORKBENCH__TOOLBAR, null, msgs);
			msgs = basicSetToolbar(newToolbar, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkbenchPackage.WORKBENCH__TOOLBAR, newToolbar,
					newToolbar));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Statusline getStatusline() {
		return statusline;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatusline(Statusline newStatusline, NotificationChain msgs) {
		Statusline oldStatusline = statusline;
		statusline = newStatusline;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					WorkbenchPackage.WORKBENCH__STATUSLINE, oldStatusline, newStatusline);
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
	public void setStatusline(Statusline newStatusline) {
		if (newStatusline != statusline) {
			NotificationChain msgs = null;
			if (statusline != null)
				msgs = ((InternalEObject) statusline).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - WorkbenchPackage.WORKBENCH__STATUSLINE, null, msgs);
			if (newStatusline != null)
				msgs = ((InternalEObject) newStatusline).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - WorkbenchPackage.WORKBENCH__STATUSLINE, null, msgs);
			msgs = basicSetStatusline(newStatusline, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkbenchPackage.WORKBENCH__STATUSLINE, newStatusline,
					newStatusline));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Perspective> getPerspectives() {
		if (perspectives == null) {
			perspectives = new EObjectContainmentEList<Perspective>(Perspective.class, this,
					WorkbenchPackage.WORKBENCH__PERSPECTIVES);
		}
		return perspectives;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Command> getCommands() {
		if (commands == null) {
			commands = new EObjectContainmentEList<Command>(Command.class, this, WorkbenchPackage.WORKBENCH__COMMANDS);
		}
		return commands;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EditorRegistry getEditorRegistry() {
		return editorRegistry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEditorRegistry(EditorRegistry newEditorRegistry, NotificationChain msgs) {
		EditorRegistry oldEditorRegistry = editorRegistry;
		editorRegistry = newEditorRegistry;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					WorkbenchPackage.WORKBENCH__EDITOR_REGISTRY, oldEditorRegistry, newEditorRegistry);
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
	public void setEditorRegistry(EditorRegistry newEditorRegistry) {
		if (newEditorRegistry != editorRegistry) {
			NotificationChain msgs = null;
			if (editorRegistry != null)
				msgs = ((InternalEObject) editorRegistry).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - WorkbenchPackage.WORKBENCH__EDITOR_REGISTRY, null, msgs);
			if (newEditorRegistry != null)
				msgs = ((InternalEObject) newEditorRegistry).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - WorkbenchPackage.WORKBENCH__EDITOR_REGISTRY, null, msgs);
			msgs = basicSetEditorRegistry(newEditorRegistry, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkbenchPackage.WORKBENCH__EDITOR_REGISTRY,
					newEditorRegistry, newEditorRegistry));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case WorkbenchPackage.WORKBENCH__TOOLBAR:
			return basicSetToolbar(null, msgs);
		case WorkbenchPackage.WORKBENCH__STATUSLINE:
			return basicSetStatusline(null, msgs);
		case WorkbenchPackage.WORKBENCH__PERSPECTIVES:
			return ((InternalEList<?>) getPerspectives()).basicRemove(otherEnd, msgs);
		case WorkbenchPackage.WORKBENCH__COMMANDS:
			return ((InternalEList<?>) getCommands()).basicRemove(otherEnd, msgs);
		case WorkbenchPackage.WORKBENCH__EDITOR_REGISTRY:
			return basicSetEditorRegistry(null, msgs);
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
		case WorkbenchPackage.WORKBENCH__TOOLBAR:
			return getToolbar();
		case WorkbenchPackage.WORKBENCH__STATUSLINE:
			return getStatusline();
		case WorkbenchPackage.WORKBENCH__PERSPECTIVES:
			return getPerspectives();
		case WorkbenchPackage.WORKBENCH__COMMANDS:
			return getCommands();
		case WorkbenchPackage.WORKBENCH__EDITOR_REGISTRY:
			return getEditorRegistry();
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
		case WorkbenchPackage.WORKBENCH__TOOLBAR:
			setToolbar((Toolbar) newValue);
			return;
		case WorkbenchPackage.WORKBENCH__STATUSLINE:
			setStatusline((Statusline) newValue);
			return;
		case WorkbenchPackage.WORKBENCH__PERSPECTIVES:
			getPerspectives().clear();
			getPerspectives().addAll((Collection<? extends Perspective>) newValue);
			return;
		case WorkbenchPackage.WORKBENCH__COMMANDS:
			getCommands().clear();
			getCommands().addAll((Collection<? extends Command>) newValue);
			return;
		case WorkbenchPackage.WORKBENCH__EDITOR_REGISTRY:
			setEditorRegistry((EditorRegistry) newValue);
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
		case WorkbenchPackage.WORKBENCH__TOOLBAR:
			setToolbar((Toolbar) null);
			return;
		case WorkbenchPackage.WORKBENCH__STATUSLINE:
			setStatusline((Statusline) null);
			return;
		case WorkbenchPackage.WORKBENCH__PERSPECTIVES:
			getPerspectives().clear();
			return;
		case WorkbenchPackage.WORKBENCH__COMMANDS:
			getCommands().clear();
			return;
		case WorkbenchPackage.WORKBENCH__EDITOR_REGISTRY:
			setEditorRegistry((EditorRegistry) null);
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
		case WorkbenchPackage.WORKBENCH__TOOLBAR:
			return toolbar != null;
		case WorkbenchPackage.WORKBENCH__STATUSLINE:
			return statusline != null;
		case WorkbenchPackage.WORKBENCH__PERSPECTIVES:
			return perspectives != null && !perspectives.isEmpty();
		case WorkbenchPackage.WORKBENCH__COMMANDS:
			return commands != null && !commands.isEmpty();
		case WorkbenchPackage.WORKBENCH__EDITOR_REGISTRY:
			return editorRegistry != null;
		}
		return super.eIsSet(featureID);
	}

} //WorkbenchImpl
