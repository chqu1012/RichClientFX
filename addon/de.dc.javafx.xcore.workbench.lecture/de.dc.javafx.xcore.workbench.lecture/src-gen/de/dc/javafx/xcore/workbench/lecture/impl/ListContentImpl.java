/**
 */
package de.dc.javafx.xcore.workbench.lecture.impl;

import de.dc.javafx.xcore.workbench.lecture.LecturePackage;
import de.dc.javafx.xcore.workbench.lecture.ListContent;
import de.dc.javafx.xcore.workbench.lecture.ListItem;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>List Content</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dc.javafx.xcore.workbench.lecture.impl.ListContentImpl#getItem <em>Item</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ListContentImpl extends ContentImpl implements ListContent {
	/**
	 * The cached value of the '{@link #getItem() <em>Item</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItem()
	 * @generated
	 * @ordered
	 */
	protected EList<ListItem> item;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ListContentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LecturePackage.Literals.LIST_CONTENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ListItem> getItem() {
		if (item == null) {
			item = new EObjectContainmentEList<ListItem>(ListItem.class, this, LecturePackage.LIST_CONTENT__ITEM);
		}
		return item;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case LecturePackage.LIST_CONTENT__ITEM:
			return ((InternalEList<?>) getItem()).basicRemove(otherEnd, msgs);
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
		case LecturePackage.LIST_CONTENT__ITEM:
			return getItem();
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
		case LecturePackage.LIST_CONTENT__ITEM:
			getItem().clear();
			getItem().addAll((Collection<? extends ListItem>) newValue);
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
		case LecturePackage.LIST_CONTENT__ITEM:
			getItem().clear();
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
		case LecturePackage.LIST_CONTENT__ITEM:
			return item != null && !item.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ListContentImpl
