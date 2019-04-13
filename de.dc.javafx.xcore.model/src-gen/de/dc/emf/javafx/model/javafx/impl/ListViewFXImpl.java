/**
 */
package de.dc.emf.javafx.model.javafx.impl;

import de.dc.emf.javafx.model.javafx.JavafxPackage;
import de.dc.emf.javafx.model.javafx.ListViewFX;
import de.dc.emf.javafx.model.javafx.Orientation;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.xtext.common.types.JvmTypeReference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>List View FX</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dc.emf.javafx.model.javafx.impl.ListViewFXImpl#getOrientation <em>Orientation</em>}</li>
 *   <li>{@link de.dc.emf.javafx.model.javafx.impl.ListViewFXImpl#getCellFactory <em>Cell Factory</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ListViewFXImpl extends BaseViewFXImpl implements ListViewFX {
	/**
	 * The default value of the '{@link #getOrientation() <em>Orientation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrientation()
	 * @generated
	 * @ordered
	 */
	protected static final Orientation ORIENTATION_EDEFAULT = Orientation.LEFT;

	/**
	 * The cached value of the '{@link #getOrientation() <em>Orientation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrientation()
	 * @generated
	 * @ordered
	 */
	protected Orientation orientation = ORIENTATION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCellFactory() <em>Cell Factory</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCellFactory()
	 * @generated
	 * @ordered
	 */
	protected JvmTypeReference cellFactory;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ListViewFXImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JavafxPackage.Literals.LIST_VIEW_FX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Orientation getOrientation() {
		return orientation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrientation(Orientation newOrientation) {
		Orientation oldOrientation = orientation;
		orientation = newOrientation == null ? ORIENTATION_EDEFAULT : newOrientation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavafxPackage.LIST_VIEW_FX__ORIENTATION,
					oldOrientation, orientation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public JvmTypeReference getCellFactory() {
		return cellFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCellFactory(JvmTypeReference newCellFactory, NotificationChain msgs) {
		JvmTypeReference oldCellFactory = cellFactory;
		cellFactory = newCellFactory;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					JavafxPackage.LIST_VIEW_FX__CELL_FACTORY, oldCellFactory, newCellFactory);
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
	public void setCellFactory(JvmTypeReference newCellFactory) {
		if (newCellFactory != cellFactory) {
			NotificationChain msgs = null;
			if (cellFactory != null)
				msgs = ((InternalEObject) cellFactory).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - JavafxPackage.LIST_VIEW_FX__CELL_FACTORY, null, msgs);
			if (newCellFactory != null)
				msgs = ((InternalEObject) newCellFactory).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - JavafxPackage.LIST_VIEW_FX__CELL_FACTORY, null, msgs);
			msgs = basicSetCellFactory(newCellFactory, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavafxPackage.LIST_VIEW_FX__CELL_FACTORY,
					newCellFactory, newCellFactory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case JavafxPackage.LIST_VIEW_FX__CELL_FACTORY:
			return basicSetCellFactory(null, msgs);
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
		case JavafxPackage.LIST_VIEW_FX__ORIENTATION:
			return getOrientation();
		case JavafxPackage.LIST_VIEW_FX__CELL_FACTORY:
			return getCellFactory();
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
		case JavafxPackage.LIST_VIEW_FX__ORIENTATION:
			setOrientation((Orientation) newValue);
			return;
		case JavafxPackage.LIST_VIEW_FX__CELL_FACTORY:
			setCellFactory((JvmTypeReference) newValue);
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
		case JavafxPackage.LIST_VIEW_FX__ORIENTATION:
			setOrientation(ORIENTATION_EDEFAULT);
			return;
		case JavafxPackage.LIST_VIEW_FX__CELL_FACTORY:
			setCellFactory((JvmTypeReference) null);
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
		case JavafxPackage.LIST_VIEW_FX__ORIENTATION:
			return orientation != ORIENTATION_EDEFAULT;
		case JavafxPackage.LIST_VIEW_FX__CELL_FACTORY:
			return cellFactory != null;
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
		result.append(" (orientation: ");
		result.append(orientation);
		result.append(')');
		return result.toString();
	}

} //ListViewFXImpl
