/**
 */
package de.dc.emf.javafx.model.javafx.impl;

import de.dc.emf.javafx.model.javafx.AttributeFX;
import de.dc.emf.javafx.model.javafx.FilteredElement;
import de.dc.emf.javafx.model.javafx.JavafxPackage;
import de.dc.emf.javafx.model.javafx.TableColumnFX;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Table Column FX</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dc.emf.javafx.model.javafx.impl.TableColumnFXImpl#isUseFilter <em>Use Filter</em>}</li>
 *   <li>{@link de.dc.emf.javafx.model.javafx.impl.TableColumnFXImpl#getWidth <em>Width</em>}</li>
 *   <li>{@link de.dc.emf.javafx.model.javafx.impl.TableColumnFXImpl#getUsedAttribute <em>Used Attribute</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TableColumnFXImpl extends NamedElementImpl implements TableColumnFX {
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
	 * The default value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected static final int WIDTH_EDEFAULT = 200;

	/**
	 * The cached value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected int width = WIDTH_EDEFAULT;

	/**
	 * The cached value of the '{@link #getUsedAttribute() <em>Used Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsedAttribute()
	 * @generated
	 * @ordered
	 */
	protected AttributeFX usedAttribute;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TableColumnFXImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JavafxPackage.Literals.TABLE_COLUMN_FX;
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
			eNotify(new ENotificationImpl(this, Notification.SET, JavafxPackage.TABLE_COLUMN_FX__USE_FILTER,
					oldUseFilter, useFilter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getWidth() {
		return width;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWidth(int newWidth) {
		int oldWidth = width;
		width = newWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavafxPackage.TABLE_COLUMN_FX__WIDTH, oldWidth,
					width));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeFX getUsedAttribute() {
		if (usedAttribute != null && usedAttribute.eIsProxy()) {
			InternalEObject oldUsedAttribute = (InternalEObject) usedAttribute;
			usedAttribute = (AttributeFX) eResolveProxy(oldUsedAttribute);
			if (usedAttribute != oldUsedAttribute) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							JavafxPackage.TABLE_COLUMN_FX__USED_ATTRIBUTE, oldUsedAttribute, usedAttribute));
			}
		}
		return usedAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeFX basicGetUsedAttribute() {
		return usedAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsedAttribute(AttributeFX newUsedAttribute) {
		AttributeFX oldUsedAttribute = usedAttribute;
		usedAttribute = newUsedAttribute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavafxPackage.TABLE_COLUMN_FX__USED_ATTRIBUTE,
					oldUsedAttribute, usedAttribute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case JavafxPackage.TABLE_COLUMN_FX__USE_FILTER:
			return isUseFilter();
		case JavafxPackage.TABLE_COLUMN_FX__WIDTH:
			return getWidth();
		case JavafxPackage.TABLE_COLUMN_FX__USED_ATTRIBUTE:
			if (resolve)
				return getUsedAttribute();
			return basicGetUsedAttribute();
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
		case JavafxPackage.TABLE_COLUMN_FX__USE_FILTER:
			setUseFilter((Boolean) newValue);
			return;
		case JavafxPackage.TABLE_COLUMN_FX__WIDTH:
			setWidth((Integer) newValue);
			return;
		case JavafxPackage.TABLE_COLUMN_FX__USED_ATTRIBUTE:
			setUsedAttribute((AttributeFX) newValue);
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
		case JavafxPackage.TABLE_COLUMN_FX__USE_FILTER:
			setUseFilter(USE_FILTER_EDEFAULT);
			return;
		case JavafxPackage.TABLE_COLUMN_FX__WIDTH:
			setWidth(WIDTH_EDEFAULT);
			return;
		case JavafxPackage.TABLE_COLUMN_FX__USED_ATTRIBUTE:
			setUsedAttribute((AttributeFX) null);
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
		case JavafxPackage.TABLE_COLUMN_FX__USE_FILTER:
			return useFilter != USE_FILTER_EDEFAULT;
		case JavafxPackage.TABLE_COLUMN_FX__WIDTH:
			return width != WIDTH_EDEFAULT;
		case JavafxPackage.TABLE_COLUMN_FX__USED_ATTRIBUTE:
			return usedAttribute != null;
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
			case JavafxPackage.TABLE_COLUMN_FX__USE_FILTER:
				return JavafxPackage.FILTERED_ELEMENT__USE_FILTER;
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
				return JavafxPackage.TABLE_COLUMN_FX__USE_FILTER;
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
		result.append(", width: ");
		result.append(width);
		result.append(')');
		return result.toString();
	}

} //TableColumnFXImpl
