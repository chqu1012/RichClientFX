/**
 */
package de.dc.emf.javafx.model.javafx.provider;

import de.dc.emf.javafx.model.javafx.JavafxFactory;
import de.dc.emf.javafx.model.javafx.JavafxPackage;
import de.dc.emf.javafx.model.javafx.ProjectFX;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link de.dc.emf.javafx.model.javafx.ProjectFX} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ProjectFXItemProvider extends NamedElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProjectFXItemProvider(AdapterFactory adapterFactory) {
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

			addPackagePathPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Package Path feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPackagePathPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_ProjectFX_packagePath_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_ProjectFX_packagePath_feature",
								"_UI_ProjectFX_type"),
						JavafxPackage.Literals.PROJECT_FX__PACKAGE_PATH, true, false, false,
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
			childrenFeatures.add(JavafxPackage.Literals.PROJECT_FX__CONTROLS);
			childrenFeatures.add(JavafxPackage.Literals.PROJECT_FX__MODELS);
			childrenFeatures.add(JavafxPackage.Literals.PROJECT_FX__BINDINGS);
			childrenFeatures.add(JavafxPackage.Literals.PROJECT_FX__CHARTS);
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
	 * This returns ProjectFX.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ProjectFX"));
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
		String label = ((ProjectFX) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_ProjectFX_type")
				: getString("_UI_ProjectFX_type") + " " + label;
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

		switch (notification.getFeatureID(ProjectFX.class)) {
		case JavafxPackage.PROJECT_FX__PACKAGE_PATH:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case JavafxPackage.PROJECT_FX__CONTROLS:
		case JavafxPackage.PROJECT_FX__MODELS:
		case JavafxPackage.PROJECT_FX__BINDINGS:
		case JavafxPackage.PROJECT_FX__CHARTS:
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

		newChildDescriptors.add(createChildParameter(JavafxPackage.Literals.PROJECT_FX__CONTROLS,
				JavafxFactory.eINSTANCE.createTableViewFX()));

		newChildDescriptors.add(
				createChildParameter(JavafxPackage.Literals.PROJECT_FX__MODELS, JavafxFactory.eINSTANCE.createBean()));

		newChildDescriptors.add(createChildParameter(JavafxPackage.Literals.PROJECT_FX__MODELS,
				JavafxFactory.eINSTANCE.createDerivedBean()));

		newChildDescriptors.add(createChildParameter(JavafxPackage.Literals.PROJECT_FX__BINDINGS,
				JavafxFactory.eINSTANCE.createBinding()));

		newChildDescriptors.add(createChildParameter(JavafxPackage.Literals.PROJECT_FX__CHARTS,
				JavafxFactory.eINSTANCE.createLineChartFX()));

		newChildDescriptors.add(createChildParameter(JavafxPackage.Literals.PROJECT_FX__CHARTS,
				JavafxFactory.eINSTANCE.createPieChartFX()));

		newChildDescriptors.add(createChildParameter(JavafxPackage.Literals.PROJECT_FX__CHARTS,
				JavafxFactory.eINSTANCE.createAreaChartFX()));

		newChildDescriptors.add(createChildParameter(JavafxPackage.Literals.PROJECT_FX__CHARTS,
				JavafxFactory.eINSTANCE.createBubbleChartFX()));

		newChildDescriptors.add(createChildParameter(JavafxPackage.Literals.PROJECT_FX__CHARTS,
				JavafxFactory.eINSTANCE.createScatterChartFX()));

		newChildDescriptors.add(createChildParameter(JavafxPackage.Literals.PROJECT_FX__CHARTS,
				JavafxFactory.eINSTANCE.createBarChartFX()));
	}

}
