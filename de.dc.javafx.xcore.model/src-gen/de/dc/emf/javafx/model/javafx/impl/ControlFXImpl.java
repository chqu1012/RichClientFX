/**
 */
package de.dc.emf.javafx.model.javafx.impl;

import de.dc.emf.javafx.model.javafx.ControlFX;
import de.dc.emf.javafx.model.javafx.JavafxPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Control FX</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dc.emf.javafx.model.javafx.impl.ControlFXImpl#isGenerateDemo <em>Generate Demo</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ControlFXImpl extends NamedElementImpl implements ControlFX {
	/**
	 * The default value of the '{@link #isGenerateDemo() <em>Generate Demo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGenerateDemo()
	 * @generated
	 * @ordered
	 */
	protected static final boolean GENERATE_DEMO_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isGenerateDemo() <em>Generate Demo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGenerateDemo()
	 * @generated
	 * @ordered
	 */
	protected boolean generateDemo = GENERATE_DEMO_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ControlFXImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JavafxPackage.Literals.CONTROL_FX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isGenerateDemo() {
		return generateDemo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGenerateDemo(boolean newGenerateDemo) {
		boolean oldGenerateDemo = generateDemo;
		generateDemo = newGenerateDemo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavafxPackage.CONTROL_FX__GENERATE_DEMO,
					oldGenerateDemo, generateDemo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case JavafxPackage.CONTROL_FX__GENERATE_DEMO:
			return isGenerateDemo();
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
		case JavafxPackage.CONTROL_FX__GENERATE_DEMO:
			setGenerateDemo((Boolean) newValue);
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
		case JavafxPackage.CONTROL_FX__GENERATE_DEMO:
			setGenerateDemo(GENERATE_DEMO_EDEFAULT);
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
		case JavafxPackage.CONTROL_FX__GENERATE_DEMO:
			return generateDemo != GENERATE_DEMO_EDEFAULT;
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
		result.append(" (generateDemo: ");
		result.append(generateDemo);
		result.append(')');
		return result.toString();
	}

} //ControlFXImpl
