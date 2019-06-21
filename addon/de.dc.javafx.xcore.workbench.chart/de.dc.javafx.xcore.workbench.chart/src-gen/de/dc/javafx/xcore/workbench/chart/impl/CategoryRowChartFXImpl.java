/**
 */
package de.dc.javafx.xcore.workbench.chart.impl;

import de.dc.javafx.xcore.workbench.chart.CategoryRowChartFX;
import de.dc.javafx.xcore.workbench.chart.CategoryRowSeriesFX;
import de.dc.javafx.xcore.workbench.chart.ChartPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Category Row Chart FX</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dc.javafx.xcore.workbench.chart.impl.CategoryRowChartFXImpl#getSeries <em>Series</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class CategoryRowChartFXImpl extends ChartFXImpl implements CategoryRowChartFX {
	/**
	 * The cached value of the '{@link #getSeries() <em>Series</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeries()
	 * @generated
	 * @ordered
	 */
	protected EList<CategoryRowSeriesFX> series;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CategoryRowChartFXImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ChartPackage.Literals.CATEGORY_ROW_CHART_FX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CategoryRowSeriesFX> getSeries() {
		if (series == null) {
			series = new EObjectContainmentEList<CategoryRowSeriesFX>(CategoryRowSeriesFX.class, this,
					ChartPackage.CATEGORY_ROW_CHART_FX__SERIES);
		}
		return series;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ChartPackage.CATEGORY_ROW_CHART_FX__SERIES:
			return ((InternalEList<?>) getSeries()).basicRemove(otherEnd, msgs);
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
		case ChartPackage.CATEGORY_ROW_CHART_FX__SERIES:
			return getSeries();
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
		case ChartPackage.CATEGORY_ROW_CHART_FX__SERIES:
			getSeries().clear();
			getSeries().addAll((Collection<? extends CategoryRowSeriesFX>) newValue);
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
		case ChartPackage.CATEGORY_ROW_CHART_FX__SERIES:
			getSeries().clear();
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
		case ChartPackage.CATEGORY_ROW_CHART_FX__SERIES:
			return series != null && !series.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CategoryRowChartFXImpl
