/**
 */
package de.dc.emf.javafx.model.javafx.impl;

import de.dc.emf.javafx.model.javafx.JavafxPackage;
import de.dc.emf.javafx.model.javafx.TableColumnFX;
import de.dc.emf.javafx.model.javafx.TableViewFX;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.xtext.common.types.JvmTypeReference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Table View FX</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dc.emf.javafx.model.javafx.impl.TableViewFXImpl#getColumns <em>Columns</em>}</li>
 *   <li>{@link de.dc.emf.javafx.model.javafx.impl.TableViewFXImpl#getUsedModel <em>Used Model</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TableViewFXImpl extends ControlFXImpl implements TableViewFX {
	/**
	 * The cached value of the '{@link #getColumns() <em>Columns</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumns()
	 * @generated
	 * @ordered
	 */
	protected EList<TableColumnFX> columns;

	/**
	 * The cached value of the '{@link #getUsedModel() <em>Used Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsedModel()
	 * @generated
	 * @ordered
	 */
	protected JvmTypeReference usedModel;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TableViewFXImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JavafxPackage.Literals.TABLE_VIEW_FX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TableColumnFX> getColumns() {
		if (columns == null) {
			columns = new EObjectContainmentEList<TableColumnFX>(TableColumnFX.class, this,
					JavafxPackage.TABLE_VIEW_FX__COLUMNS);
		}
		return columns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public JvmTypeReference getUsedModel() {
		return usedModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUsedModel(JvmTypeReference newUsedModel, NotificationChain msgs) {
		JvmTypeReference oldUsedModel = usedModel;
		usedModel = newUsedModel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					JavafxPackage.TABLE_VIEW_FX__USED_MODEL, oldUsedModel, newUsedModel);
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
	public void setUsedModel(JvmTypeReference newUsedModel) {
		if (newUsedModel != usedModel) {
			NotificationChain msgs = null;
			if (usedModel != null)
				msgs = ((InternalEObject) usedModel).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - JavafxPackage.TABLE_VIEW_FX__USED_MODEL, null, msgs);
			if (newUsedModel != null)
				msgs = ((InternalEObject) newUsedModel).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - JavafxPackage.TABLE_VIEW_FX__USED_MODEL, null, msgs);
			msgs = basicSetUsedModel(newUsedModel, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavafxPackage.TABLE_VIEW_FX__USED_MODEL, newUsedModel,
					newUsedModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case JavafxPackage.TABLE_VIEW_FX__COLUMNS:
			return ((InternalEList<?>) getColumns()).basicRemove(otherEnd, msgs);
		case JavafxPackage.TABLE_VIEW_FX__USED_MODEL:
			return basicSetUsedModel(null, msgs);
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
		case JavafxPackage.TABLE_VIEW_FX__COLUMNS:
			return getColumns();
		case JavafxPackage.TABLE_VIEW_FX__USED_MODEL:
			return getUsedModel();
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
		case JavafxPackage.TABLE_VIEW_FX__COLUMNS:
			getColumns().clear();
			getColumns().addAll((Collection<? extends TableColumnFX>) newValue);
			return;
		case JavafxPackage.TABLE_VIEW_FX__USED_MODEL:
			setUsedModel((JvmTypeReference) newValue);
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
		case JavafxPackage.TABLE_VIEW_FX__COLUMNS:
			getColumns().clear();
			return;
		case JavafxPackage.TABLE_VIEW_FX__USED_MODEL:
			setUsedModel((JvmTypeReference) null);
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
		case JavafxPackage.TABLE_VIEW_FX__COLUMNS:
			return columns != null && !columns.isEmpty();
		case JavafxPackage.TABLE_VIEW_FX__USED_MODEL:
			return usedModel != null;
		}
		return super.eIsSet(featureID);
	}

} //TableViewFXImpl
