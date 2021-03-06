/**
 */
package de.dc.emf.javafx.model.javafx.provider;

import de.dc.emf.javafx.model.javafx.JavafxPackage;
import de.dc.emf.javafx.model.javafx.TableColumnFX;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.eclipse.xtext.common.types.TypesFactory;

/**
 * This is the item provider adapter for a {@link de.dc.emf.javafx.model.javafx.TableColumnFX} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TableColumnFXItemProvider extends NamedElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TableColumnFXItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addWidthPropertyDescriptor(object);
			addUsedAttributePropertyDescriptor(object);
			addUseFilterPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Width feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addWidthPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_TableColumnFX_width_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_TableColumnFX_width_feature",
								"_UI_TableColumnFX_type"),
						JavafxPackage.Literals.TABLE_COLUMN_FX__WIDTH, true, false, false,
						ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Used Attribute feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUsedAttributePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_TableColumnFX_usedAttribute_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_TableColumnFX_usedAttribute_feature",
								"_UI_TableColumnFX_type"),
						JavafxPackage.Literals.TABLE_COLUMN_FX__USED_ATTRIBUTE, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Use Filter feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUseFilterPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_TableColumnFX_useFilter_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_TableColumnFX_useFilter_feature",
								"_UI_TableColumnFX_type"),
						JavafxPackage.Literals.TABLE_COLUMN_FX__USE_FILTER, true, false, false,
						ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(JavafxPackage.Literals.TABLE_COLUMN_FX__CELL_VALUE_FACTORY);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns TableColumnFX.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/TableColumnFX"));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean shouldComposeCreationImage() {
		return true;
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((TableColumnFX) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_TableColumnFX_type")
				: getString("_UI_TableColumnFX_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(TableColumnFX.class)) {
		case JavafxPackage.TABLE_COLUMN_FX__WIDTH:
		case JavafxPackage.TABLE_COLUMN_FX__USE_FILTER:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case JavafxPackage.TABLE_COLUMN_FX__CELL_VALUE_FACTORY:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
			return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add(createChildParameter(JavafxPackage.Literals.TABLE_COLUMN_FX__CELL_VALUE_FACTORY,
				TypesFactory.eINSTANCE.createJvmParameterizedTypeReference()));

		newChildDescriptors.add(createChildParameter(JavafxPackage.Literals.TABLE_COLUMN_FX__CELL_VALUE_FACTORY,
				TypesFactory.eINSTANCE.createJvmGenericArrayTypeReference()));

		newChildDescriptors.add(createChildParameter(JavafxPackage.Literals.TABLE_COLUMN_FX__CELL_VALUE_FACTORY,
				TypesFactory.eINSTANCE.createJvmWildcardTypeReference()));

		newChildDescriptors.add(createChildParameter(JavafxPackage.Literals.TABLE_COLUMN_FX__CELL_VALUE_FACTORY,
				TypesFactory.eINSTANCE.createJvmAnyTypeReference()));

		newChildDescriptors.add(createChildParameter(JavafxPackage.Literals.TABLE_COLUMN_FX__CELL_VALUE_FACTORY,
				TypesFactory.eINSTANCE.createJvmMultiTypeReference()));

		newChildDescriptors.add(createChildParameter(JavafxPackage.Literals.TABLE_COLUMN_FX__CELL_VALUE_FACTORY,
				TypesFactory.eINSTANCE.createJvmDelegateTypeReference()));

		newChildDescriptors.add(createChildParameter(JavafxPackage.Literals.TABLE_COLUMN_FX__CELL_VALUE_FACTORY,
				TypesFactory.eINSTANCE.createJvmSynonymTypeReference()));

		newChildDescriptors.add(createChildParameter(JavafxPackage.Literals.TABLE_COLUMN_FX__CELL_VALUE_FACTORY,
				TypesFactory.eINSTANCE.createJvmUnknownTypeReference()));

		newChildDescriptors.add(createChildParameter(JavafxPackage.Literals.TABLE_COLUMN_FX__CELL_VALUE_FACTORY,
				TypesFactory.eINSTANCE.createJvmInnerTypeReference()));
	}

}
