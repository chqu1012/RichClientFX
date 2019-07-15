/**
 */
package de.dc.javafx.xcore.workbench.lecture.provider;

import de.dc.javafx.xcore.workbench.lecture.LectureFactory;
import de.dc.javafx.xcore.workbench.lecture.LecturePackage;
import de.dc.javafx.xcore.workbench.lecture.Section;

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
 * This is the item provider adapter for a {@link de.dc.javafx.xcore.workbench.lecture.Section} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SectionItemProvider extends ContentItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SectionItemProvider(AdapterFactory adapterFactory) {
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

			addTransitionPropertyDescriptor(object);
			addNamePropertyDescriptor(object);
			addUseMarkDownPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Transition feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTransitionPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_TransitionElement_transition_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_TransitionElement_transition_feature",
								"_UI_TransitionElement_type"),
						LecturePackage.Literals.TRANSITION_ELEMENT__TRANSITION, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Section_name_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Section_name_feature", "_UI_Section_type"),
						LecturePackage.Literals.SECTION__NAME, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Use Mark Down feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUseMarkDownPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Section_useMarkDown_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Section_useMarkDown_feature",
								"_UI_Section_type"),
						LecturePackage.Literals.SECTION__USE_MARK_DOWN, true, false, false,
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
			childrenFeatures.add(LecturePackage.Literals.SECTION__CONTENTS);
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
	 * This returns Section.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Section"));
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
		String label = ((Section) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_Section_type")
				: getString("_UI_Section_type") + " " + label;
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

		switch (notification.getFeatureID(Section.class)) {
		case LecturePackage.SECTION__TRANSITION:
		case LecturePackage.SECTION__NAME:
		case LecturePackage.SECTION__USE_MARK_DOWN:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case LecturePackage.SECTION__CONTENTS:
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

		newChildDescriptors.add(createChildParameter(LecturePackage.Literals.SECTION__CONTENTS,
				LectureFactory.eINSTANCE.createSection()));

		newChildDescriptors.add(createChildParameter(LecturePackage.Literals.SECTION__CONTENTS,
				LectureFactory.eINSTANCE.createOrderedListContent()));

		newChildDescriptors.add(createChildParameter(LecturePackage.Literals.SECTION__CONTENTS,
				LectureFactory.eINSTANCE.createUnorderedListContent()));

		newChildDescriptors.add(createChildParameter(LecturePackage.Literals.SECTION__CONTENTS,
				LectureFactory.eINSTANCE.createFileContent()));

		newChildDescriptors.add(createChildParameter(LecturePackage.Literals.SECTION__CONTENTS,
				LectureFactory.eINSTANCE.createStringContent()));

		newChildDescriptors.add(createChildParameter(LecturePackage.Literals.SECTION__CONTENTS,
				LectureFactory.eINSTANCE.createHeader()));

		newChildDescriptors.add(createChildParameter(LecturePackage.Literals.SECTION__CONTENTS,
				LectureFactory.eINSTANCE.createParagraph()));

		newChildDescriptors.add(
				createChildParameter(LecturePackage.Literals.SECTION__CONTENTS, LectureFactory.eINSTANCE.createLink()));
	}

}
