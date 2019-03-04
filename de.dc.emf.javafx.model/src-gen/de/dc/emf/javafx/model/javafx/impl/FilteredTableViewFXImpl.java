/**
 */
package de.dc.emf.javafx.model.javafx.impl;

import de.dc.emf.javafx.model.javafx.FilteredElement;
import de.dc.emf.javafx.model.javafx.FilteredTableViewFX;
import de.dc.emf.javafx.model.javafx.JavafxPackage;
import de.dc.emf.javafx.model.javafx.ModelFX;
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

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Filtered Table View FX</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dc.emf.javafx.model.javafx.impl.FilteredTableViewFXImpl#isUseFilter <em>Use Filter</em>}</li>
 *   <li>{@link de.dc.emf.javafx.model.javafx.impl.FilteredTableViewFXImpl#getColumns <em>Columns</em>}</li>
 *   <li>{@link de.dc.emf.javafx.model.javafx.impl.FilteredTableViewFXImpl#getUsedModel <em>Used Model</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FilteredTableViewFXImpl extends ControlFXImpl implements FilteredTableViewFX {
	/**
	 * The default value of the '{@link #isUseFilter() <em>Use Filter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUseFilter()
	 * @generated
	 * @ordered
	 */
	protected static final boolean USE_FILTER_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isUseFilter() <em>Use Filter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUseFilter()
	 * @generated
	 * @ordered
	 */
	protected boolean useFilter = USE_FILTER_EDEFAULT;

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
	 * The cached value of the '{@link #getUsedModel() <em>Used Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsedModel()
	 * @generated
	 * @ordered
	 */
	protected ModelFX usedModel;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FilteredTableViewFXImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JavafxPackage.Literals.FILTERED_TABLE_VIEW_FX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isUseFilter() {
		return useFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUseFilter(boolean newUseFilter) {
		boolean oldUseFilter = useFilter;
		useFilter = newUseFilter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavafxPackage.FILTERED_TABLE_VIEW_FX__USE_FILTER,
					oldUseFilter, useFilter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TableColumnFX> getColumns() {
		if (columns == null) {
			columns = new EObjectContainmentEList<TableColumnFX>(TableColumnFX.class, this,
					JavafxPackage.FILTERED_TABLE_VIEW_FX__COLUMNS);
		}
		return columns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelFX getUsedModel() {
		if (usedModel != null && usedModel.eIsProxy()) {
			InternalEObject oldUsedModel = (InternalEObject) usedModel;
			usedModel = (ModelFX) eResolveProxy(oldUsedModel);
			if (usedModel != oldUsedModel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							JavafxPackage.FILTERED_TABLE_VIEW_FX__USED_MODEL, oldUsedModel, usedModel));
			}
		}
		return usedModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelFX basicGetUsedModel() {
		return usedModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsedModel(ModelFX newUsedModel) {
		ModelFX oldUsedModel = usedModel;
		usedModel = newUsedModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavafxPackage.FILTERED_TABLE_VIEW_FX__USED_MODEL,
					oldUsedModel, usedModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case JavafxPackage.FILTERED_TABLE_VIEW_FX__COLUMNS:
			return ((InternalEList<?>) getColumns()).basicRemove(otherEnd, msgs);
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
		case JavafxPackage.FILTERED_TABLE_VIEW_FX__USE_FILTER:
			return isUseFilter();
		case JavafxPackage.FILTERED_TABLE_VIEW_FX__COLUMNS:
			return getColumns();
		case JavafxPackage.FILTERED_TABLE_VIEW_FX__USED_MODEL:
			if (resolve)
				return getUsedModel();
			return basicGetUsedModel();
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
		case JavafxPackage.FILTERED_TABLE_VIEW_FX__USE_FILTER:
			setUseFilter((Boolean) newValue);
			return;
		case JavafxPackage.FILTERED_TABLE_VIEW_FX__COLUMNS:
			getColumns().clear();
			getColumns().addAll((Collection<? extends TableColumnFX>) newValue);
			return;
		case JavafxPackage.FILTERED_TABLE_VIEW_FX__USED_MODEL:
			setUsedModel((ModelFX) newValue);
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
		case JavafxPackage.FILTERED_TABLE_VIEW_FX__USE_FILTER:
			setUseFilter(USE_FILTER_EDEFAULT);
			return;
		case JavafxPackage.FILTERED_TABLE_VIEW_FX__COLUMNS:
			getColumns().clear();
			return;
		case JavafxPackage.FILTERED_TABLE_VIEW_FX__USED_MODEL:
			setUsedModel((ModelFX) null);
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
		case JavafxPackage.FILTERED_TABLE_VIEW_FX__USE_FILTER:
			return useFilter != USE_FILTER_EDEFAULT;
		case JavafxPackage.FILTERED_TABLE_VIEW_FX__COLUMNS:
			return columns != null && !columns.isEmpty();
		case JavafxPackage.FILTERED_TABLE_VIEW_FX__USED_MODEL:
			return usedModel != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == FilteredElement.class) {
			switch (derivedFeatureID) {
			case JavafxPackage.FILTERED_TABLE_VIEW_FX__USE_FILTER:
				return JavafxPackage.FILTERED_ELEMENT__USE_FILTER;
			default:
				return -1;
			}
		}
		if (baseClass == TableViewFX.class) {
			switch (derivedFeatureID) {
			case JavafxPackage.FILTERED_TABLE_VIEW_FX__COLUMNS:
				return JavafxPackage.TABLE_VIEW_FX__COLUMNS;
			case JavafxPackage.FILTERED_TABLE_VIEW_FX__USED_MODEL:
				return JavafxPackage.TABLE_VIEW_FX__USED_MODEL;
			default:
				return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == FilteredElement.class) {
			switch (baseFeatureID) {
			case JavafxPackage.FILTERED_ELEMENT__USE_FILTER:
				return JavafxPackage.FILTERED_TABLE_VIEW_FX__USE_FILTER;
			default:
				return -1;
			}
		}
		if (baseClass == TableViewFX.class) {
			switch (baseFeatureID) {
			case JavafxPackage.TABLE_VIEW_FX__COLUMNS:
				return JavafxPackage.FILTERED_TABLE_VIEW_FX__COLUMNS;
			case JavafxPackage.TABLE_VIEW_FX__USED_MODEL:
				return JavafxPackage.FILTERED_TABLE_VIEW_FX__USED_MODEL;
			default:
				return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (useFilter: ");
		result.append(useFilter);
		result.append(')');
		return result.toString();
	}

} //FilteredTableViewFXImpl
