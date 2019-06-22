/**
 */
package de.dc.javafx.xcore.workbench.provider;

import de.dc.javafx.xcore.workbench.Workbench;
import de.dc.javafx.xcore.workbench.WorkbenchFactory;
import de.dc.javafx.xcore.workbench.WorkbenchPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link de.dc.javafx.xcore.workbench.Workbench} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class WorkbenchItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkbenchItemProvider(AdapterFactory adapterFactory) {
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

		}
		return itemPropertyDescriptors;
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
			childrenFeatures.add(WorkbenchPackage.Literals.WORKBENCH__TOOLBAR);
			childrenFeatures.add(WorkbenchPackage.Literals.WORKBENCH__STATUSLINE);
			childrenFeatures.add(WorkbenchPackage.Literals.WORKBENCH__PERSPECTIVES);
			childrenFeatures.add(WorkbenchPackage.Literals.WORKBENCH__COMMANDS);
			childrenFeatures.add(WorkbenchPackage.Literals.WORKBENCH__EDITOR_REGISTRY);
			childrenFeatures.add(WorkbenchPackage.Literals.WORKBENCH__COMMAND_REGISTRY);
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
	 * This returns Workbench.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Workbench"));
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
		return getString("_UI_Workbench_type");
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

		switch (notification.getFeatureID(Workbench.class)) {
		case WorkbenchPackage.WORKBENCH__TOOLBAR:
		case WorkbenchPackage.WORKBENCH__STATUSLINE:
		case WorkbenchPackage.WORKBENCH__PERSPECTIVES:
		case WorkbenchPackage.WORKBENCH__COMMANDS:
		case WorkbenchPackage.WORKBENCH__EDITOR_REGISTRY:
		case WorkbenchPackage.WORKBENCH__COMMAND_REGISTRY:
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

		newChildDescriptors.add(createChildParameter(WorkbenchPackage.Literals.WORKBENCH__TOOLBAR,
				WorkbenchFactory.eINSTANCE.createToolbar()));

		newChildDescriptors.add(createChildParameter(WorkbenchPackage.Literals.WORKBENCH__STATUSLINE,
				WorkbenchFactory.eINSTANCE.createStatusline()));

		newChildDescriptors.add(createChildParameter(WorkbenchPackage.Literals.WORKBENCH__PERSPECTIVES,
				WorkbenchFactory.eINSTANCE.createPerspective()));

		newChildDescriptors.add(createChildParameter(WorkbenchPackage.Literals.WORKBENCH__COMMANDS,
				WorkbenchFactory.eINSTANCE.createCommand()));

		newChildDescriptors.add(createChildParameter(WorkbenchPackage.Literals.WORKBENCH__EDITOR_REGISTRY,
				WorkbenchFactory.eINSTANCE.createEditorRegistry()));

		newChildDescriptors.add(createChildParameter(WorkbenchPackage.Literals.WORKBENCH__COMMAND_REGISTRY,
				WorkbenchFactory.eINSTANCE.createCommandRegistry()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return WorkbenchEditPlugin.INSTANCE;
	}

}
