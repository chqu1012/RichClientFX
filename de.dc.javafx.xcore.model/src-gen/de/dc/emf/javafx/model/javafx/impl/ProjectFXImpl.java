/**
 */
package de.dc.emf.javafx.model.javafx.impl;

import de.dc.emf.javafx.model.javafx.Binding;
import de.dc.emf.javafx.model.javafx.ChartFX;
import de.dc.emf.javafx.model.javafx.ControlFX;
import de.dc.emf.javafx.model.javafx.JavafxPackage;
import de.dc.emf.javafx.model.javafx.ModelFX;
import de.dc.emf.javafx.model.javafx.ProjectFX;

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
 * An implementation of the model object '<em><b>Project FX</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dc.emf.javafx.model.javafx.impl.ProjectFXImpl#getControls <em>Controls</em>}</li>
 *   <li>{@link de.dc.emf.javafx.model.javafx.impl.ProjectFXImpl#getPackagePath <em>Package Path</em>}</li>
 *   <li>{@link de.dc.emf.javafx.model.javafx.impl.ProjectFXImpl#getModels <em>Models</em>}</li>
 *   <li>{@link de.dc.emf.javafx.model.javafx.impl.ProjectFXImpl#getBindings <em>Bindings</em>}</li>
 *   <li>{@link de.dc.emf.javafx.model.javafx.impl.ProjectFXImpl#getCharts <em>Charts</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProjectFXImpl extends NamedElementImpl implements ProjectFX {
	/**
	 * The cached value of the '{@link #getControls() <em>Controls</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControls()
	 * @generated
	 * @ordered
	 */
	protected EList<ControlFX> controls;

	/**
	 * The default value of the '{@link #getPackagePath() <em>Package Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackagePath()
	 * @generated
	 * @ordered
	 */
	protected static final String PACKAGE_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPackagePath() <em>Package Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackagePath()
	 * @generated
	 * @ordered
	 */
	protected String packagePath = PACKAGE_PATH_EDEFAULT;

	/**
	 * The cached value of the '{@link #getModels() <em>Models</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModels()
	 * @generated
	 * @ordered
	 */
	protected EList<ModelFX> models;

	/**
	 * The cached value of the '{@link #getBindings() <em>Bindings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBindings()
	 * @generated
	 * @ordered
	 */
	protected EList<Binding> bindings;

	/**
	 * The cached value of the '{@link #getCharts() <em>Charts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCharts()
	 * @generated
	 * @ordered
	 */
	protected EList<ChartFX> charts;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProjectFXImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JavafxPackage.Literals.PROJECT_FX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ControlFX> getControls() {
		if (controls == null) {
			controls = new EObjectContainmentEList<ControlFX>(ControlFX.class, this,
					JavafxPackage.PROJECT_FX__CONTROLS);
		}
		return controls;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPackagePath() {
		return packagePath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPackagePath(String newPackagePath) {
		String oldPackagePath = packagePath;
		packagePath = newPackagePath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavafxPackage.PROJECT_FX__PACKAGE_PATH,
					oldPackagePath, packagePath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ModelFX> getModels() {
		if (models == null) {
			models = new EObjectContainmentEList<ModelFX>(ModelFX.class, this, JavafxPackage.PROJECT_FX__MODELS);
		}
		return models;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Binding> getBindings() {
		if (bindings == null) {
			bindings = new EObjectContainmentEList<Binding>(Binding.class, this, JavafxPackage.PROJECT_FX__BINDINGS);
		}
		return bindings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ChartFX> getCharts() {
		if (charts == null) {
			charts = new EObjectContainmentEList<ChartFX>(ChartFX.class, this, JavafxPackage.PROJECT_FX__CHARTS);
		}
		return charts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case JavafxPackage.PROJECT_FX__CONTROLS:
			return ((InternalEList<?>) getControls()).basicRemove(otherEnd, msgs);
		case JavafxPackage.PROJECT_FX__MODELS:
			return ((InternalEList<?>) getModels()).basicRemove(otherEnd, msgs);
		case JavafxPackage.PROJECT_FX__BINDINGS:
			return ((InternalEList<?>) getBindings()).basicRemove(otherEnd, msgs);
		case JavafxPackage.PROJECT_FX__CHARTS:
			return ((InternalEList<?>) getCharts()).basicRemove(otherEnd, msgs);
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
		case JavafxPackage.PROJECT_FX__CONTROLS:
			return getControls();
		case JavafxPackage.PROJECT_FX__PACKAGE_PATH:
			return getPackagePath();
		case JavafxPackage.PROJECT_FX__MODELS:
			return getModels();
		case JavafxPackage.PROJECT_FX__BINDINGS:
			return getBindings();
		case JavafxPackage.PROJECT_FX__CHARTS:
			return getCharts();
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
		case JavafxPackage.PROJECT_FX__CONTROLS:
			getControls().clear();
			getControls().addAll((Collection<? extends ControlFX>) newValue);
			return;
		case JavafxPackage.PROJECT_FX__PACKAGE_PATH:
			setPackagePath((String) newValue);
			return;
		case JavafxPackage.PROJECT_FX__MODELS:
			getModels().clear();
			getModels().addAll((Collection<? extends ModelFX>) newValue);
			return;
		case JavafxPackage.PROJECT_FX__BINDINGS:
			getBindings().clear();
			getBindings().addAll((Collection<? extends Binding>) newValue);
			return;
		case JavafxPackage.PROJECT_FX__CHARTS:
			getCharts().clear();
			getCharts().addAll((Collection<? extends ChartFX>) newValue);
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
		case JavafxPackage.PROJECT_FX__CONTROLS:
			getControls().clear();
			return;
		case JavafxPackage.PROJECT_FX__PACKAGE_PATH:
			setPackagePath(PACKAGE_PATH_EDEFAULT);
			return;
		case JavafxPackage.PROJECT_FX__MODELS:
			getModels().clear();
			return;
		case JavafxPackage.PROJECT_FX__BINDINGS:
			getBindings().clear();
			return;
		case JavafxPackage.PROJECT_FX__CHARTS:
			getCharts().clear();
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
		case JavafxPackage.PROJECT_FX__CONTROLS:
			return controls != null && !controls.isEmpty();
		case JavafxPackage.PROJECT_FX__PACKAGE_PATH:
			return PACKAGE_PATH_EDEFAULT == null ? packagePath != null : !PACKAGE_PATH_EDEFAULT.equals(packagePath);
		case JavafxPackage.PROJECT_FX__MODELS:
			return models != null && !models.isEmpty();
		case JavafxPackage.PROJECT_FX__BINDINGS:
			return bindings != null && !bindings.isEmpty();
		case JavafxPackage.PROJECT_FX__CHARTS:
			return charts != null && !charts.isEmpty();
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
		result.append(" (packagePath: ");
		result.append(packagePath);
		result.append(')');
		return result.toString();
	}

} //ProjectFXImpl
