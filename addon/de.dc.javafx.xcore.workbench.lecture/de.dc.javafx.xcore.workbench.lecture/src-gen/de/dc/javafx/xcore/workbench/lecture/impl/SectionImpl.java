/**
 */
package de.dc.javafx.xcore.workbench.lecture.impl;

import de.dc.javafx.xcore.workbench.lecture.Content;
import de.dc.javafx.xcore.workbench.lecture.LecturePackage;
import de.dc.javafx.xcore.workbench.lecture.Section;
import de.dc.javafx.xcore.workbench.lecture.Transition;
import de.dc.javafx.xcore.workbench.lecture.TransitionElement;

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
 * An implementation of the model object '<em><b>Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dc.javafx.xcore.workbench.lecture.impl.SectionImpl#getTransition <em>Transition</em>}</li>
 *   <li>{@link de.dc.javafx.xcore.workbench.lecture.impl.SectionImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.dc.javafx.xcore.workbench.lecture.impl.SectionImpl#isUseMarkDown <em>Use Mark Down</em>}</li>
 *   <li>{@link de.dc.javafx.xcore.workbench.lecture.impl.SectionImpl#getContents <em>Contents</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SectionImpl extends ContentImpl implements Section {
	/**
	 * The default value of the '{@link #getTransition() <em>Transition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransition()
	 * @generated
	 * @ordered
	 */
	protected static final Transition TRANSITION_EDEFAULT = Transition.NONE;

	/**
	 * The cached value of the '{@link #getTransition() <em>Transition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransition()
	 * @generated
	 * @ordered
	 */
	protected Transition transition = TRANSITION_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = "";

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
	 * The default value of the '{@link #isUseMarkDown() <em>Use Mark Down</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUseMarkDown()
	 * @generated
	 * @ordered
	 */
	protected static final boolean USE_MARK_DOWN_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isUseMarkDown() <em>Use Mark Down</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUseMarkDown()
	 * @generated
	 * @ordered
	 */
	protected boolean useMarkDown = USE_MARK_DOWN_EDEFAULT;

	/**
	 * The cached value of the '{@link #getContents() <em>Contents</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContents()
	 * @generated
	 * @ordered
	 */
	protected EList<Content> contents;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LecturePackage.Literals.SECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Transition getTransition() {
		return transition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTransition(Transition newTransition) {
		Transition oldTransition = transition;
		transition = newTransition == null ? TRANSITION_EDEFAULT : newTransition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LecturePackage.SECTION__TRANSITION, oldTransition,
					transition));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LecturePackage.SECTION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isUseMarkDown() {
		return useMarkDown;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUseMarkDown(boolean newUseMarkDown) {
		boolean oldUseMarkDown = useMarkDown;
		useMarkDown = newUseMarkDown;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LecturePackage.SECTION__USE_MARK_DOWN, oldUseMarkDown,
					useMarkDown));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Content> getContents() {
		if (contents == null) {
			contents = new EObjectContainmentEList<Content>(Content.class, this, LecturePackage.SECTION__CONTENTS);
		}
		return contents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case LecturePackage.SECTION__CONTENTS:
			return ((InternalEList<?>) getContents()).basicRemove(otherEnd, msgs);
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
		case LecturePackage.SECTION__TRANSITION:
			return getTransition();
		case LecturePackage.SECTION__NAME:
			return getName();
		case LecturePackage.SECTION__USE_MARK_DOWN:
			return isUseMarkDown();
		case LecturePackage.SECTION__CONTENTS:
			return getContents();
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
		case LecturePackage.SECTION__TRANSITION:
			setTransition((Transition) newValue);
			return;
		case LecturePackage.SECTION__NAME:
			setName((String) newValue);
			return;
		case LecturePackage.SECTION__USE_MARK_DOWN:
			setUseMarkDown((Boolean) newValue);
			return;
		case LecturePackage.SECTION__CONTENTS:
			getContents().clear();
			getContents().addAll((Collection<? extends Content>) newValue);
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
		case LecturePackage.SECTION__TRANSITION:
			setTransition(TRANSITION_EDEFAULT);
			return;
		case LecturePackage.SECTION__NAME:
			setName(NAME_EDEFAULT);
			return;
		case LecturePackage.SECTION__USE_MARK_DOWN:
			setUseMarkDown(USE_MARK_DOWN_EDEFAULT);
			return;
		case LecturePackage.SECTION__CONTENTS:
			getContents().clear();
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
		case LecturePackage.SECTION__TRANSITION:
			return transition != TRANSITION_EDEFAULT;
		case LecturePackage.SECTION__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case LecturePackage.SECTION__USE_MARK_DOWN:
			return useMarkDown != USE_MARK_DOWN_EDEFAULT;
		case LecturePackage.SECTION__CONTENTS:
			return contents != null && !contents.isEmpty();
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
		if (baseClass == TransitionElement.class) {
			switch (derivedFeatureID) {
			case LecturePackage.SECTION__TRANSITION:
				return LecturePackage.TRANSITION_ELEMENT__TRANSITION;
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
		if (baseClass == TransitionElement.class) {
			switch (baseFeatureID) {
			case LecturePackage.TRANSITION_ELEMENT__TRANSITION:
				return LecturePackage.SECTION__TRANSITION;
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
		result.append(" (transition: ");
		result.append(transition);
		result.append(", name: ");
		result.append(name);
		result.append(", useMarkDown: ");
		result.append(useMarkDown);
		result.append(')');
		return result.toString();
	}

} //SectionImpl
