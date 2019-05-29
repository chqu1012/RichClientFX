/**
 */
package de.dc.javafx.xcore.workbench.provider;

import de.dc.javafx.xcore.workbench.View;
import de.dc.javafx.xcore.workbench.WorkbenchPackage;

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
 * This is the item provider adapter for a {@link de.dc.javafx.xcore.workbench.View} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ViewItemProvider extends NamedElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ViewItemProvider(AdapterFactory adapterFactory) {
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

			addIconPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Icon feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIconPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_View_icon_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_View_icon_feature", "_UI_View_type"),
						WorkbenchPackage.Literals.VIEW__ICON, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
			childrenFeatures.add(WorkbenchPackage.Literals.VIEW__VIEW_CLASS);
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
	 * This returns View.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/View"));
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
		String label = ((View) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_View_type")
				: getString("_UI_View_type") + " " + label;
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

		switch (notification.getFeatureID(View.class)) {
		case WorkbenchPackage.VIEW__ICON:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case WorkbenchPackage.VIEW__VIEW_CLASS:
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

		newChildDescriptors.add(createChildParameter(WorkbenchPackage.Literals.VIEW__VIEW_CLASS,
				TypesFactory.eINSTANCE.createJvmParameterizedTypeReference()));

		newChildDescriptors.add(createChildParameter(WorkbenchPackage.Literals.VIEW__VIEW_CLASS,
				TypesFactory.eINSTANCE.createJvmGenericArrayTypeReference()));

		newChildDescriptors.add(createChildParameter(WorkbenchPackage.Literals.VIEW__VIEW_CLASS,
				TypesFactory.eINSTANCE.createJvmWildcardTypeReference()));

		newChildDescriptors.add(createChildParameter(WorkbenchPackage.Literals.VIEW__VIEW_CLASS,
				TypesFactory.eINSTANCE.createJvmAnyTypeReference()));

		newChildDescriptors.add(createChildParameter(WorkbenchPackage.Literals.VIEW__VIEW_CLASS,
				TypesFactory.eINSTANCE.createJvmMultiTypeReference()));

		newChildDescriptors.add(createChildParameter(WorkbenchPackage.Literals.VIEW__VIEW_CLASS,
				TypesFactory.eINSTANCE.createJvmDelegateTypeReference()));

		newChildDescriptors.add(createChildParameter(WorkbenchPackage.Literals.VIEW__VIEW_CLASS,
				TypesFactory.eINSTANCE.createJvmSynonymTypeReference()));

		newChildDescriptors.add(createChildParameter(WorkbenchPackage.Literals.VIEW__VIEW_CLASS,
				TypesFactory.eINSTANCE.createJvmUnknownTypeReference()));

		newChildDescriptors.add(createChildParameter(WorkbenchPackage.Literals.VIEW__VIEW_CLASS,
				TypesFactory.eINSTANCE.createJvmInnerTypeReference()));
	}

}
