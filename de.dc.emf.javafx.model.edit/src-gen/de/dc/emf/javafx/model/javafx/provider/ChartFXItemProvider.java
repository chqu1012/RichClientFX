/**
 */
package de.dc.emf.javafx.model.javafx.provider;

import de.dc.emf.javafx.model.javafx.ChartFX;
import de.dc.emf.javafx.model.javafx.JavafxFactory;
import de.dc.emf.javafx.model.javafx.JavafxPackage;

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
 * This is the item provider adapter for a {@link de.dc.emf.javafx.model.javafx.ChartFX} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ChartFXItemProvider extends NamedElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChartFXItemProvider(AdapterFactory adapterFactory) {
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

			addTitlePropertyDescriptor(object);
			addTitleSidePropertyDescriptor(object);
			addShowLegendPropertyDescriptor(object);
			addLegendSidePropertyDescriptor(object);
			addXAxisTypePropertyDescriptor(object);
			addYAxisTypePropertyDescriptor(object);
			addXAxisLabelPropertyDescriptor(object);
			addYAxisLabelPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Title feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTitlePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_ChartFX_title_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_ChartFX_title_feature",
								"_UI_ChartFX_type"),
						JavafxPackage.Literals.CHART_FX__TITLE, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Title Side feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTitleSidePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_ChartFX_titleSide_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_ChartFX_titleSide_feature",
								"_UI_ChartFX_type"),
						JavafxPackage.Literals.CHART_FX__TITLE_SIDE, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Show Legend feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addShowLegendPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_ChartFX_showLegend_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_ChartFX_showLegend_feature",
								"_UI_ChartFX_type"),
						JavafxPackage.Literals.CHART_FX__SHOW_LEGEND, true, false, false,
						ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Legend Side feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLegendSidePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_ChartFX_legendSide_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_ChartFX_legendSide_feature",
								"_UI_ChartFX_type"),
						JavafxPackage.Literals.CHART_FX__LEGEND_SIDE, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the XAxis Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addXAxisTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_ChartFX_xAxisType_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_ChartFX_xAxisType_feature",
								"_UI_ChartFX_type"),
						JavafxPackage.Literals.CHART_FX__XAXIS_TYPE, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the YAxis Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addYAxisTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_ChartFX_yAxisType_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_ChartFX_yAxisType_feature",
								"_UI_ChartFX_type"),
						JavafxPackage.Literals.CHART_FX__YAXIS_TYPE, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the XAxis Label feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addXAxisLabelPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_ChartFX_xAxisLabel_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_ChartFX_xAxisLabel_feature",
								"_UI_ChartFX_type"),
						JavafxPackage.Literals.CHART_FX__XAXIS_LABEL, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the YAxis Label feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addYAxisLabelPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_ChartFX_yAxisLabel_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_ChartFX_yAxisLabel_feature",
								"_UI_ChartFX_type"),
						JavafxPackage.Literals.CHART_FX__YAXIS_LABEL, true, false, false,
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
			childrenFeatures.add(JavafxPackage.Literals.CHART_FX__SERIES);
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
		String label = ((ChartFX) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_ChartFX_type")
				: getString("_UI_ChartFX_type") + " " + label;
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

		switch (notification.getFeatureID(ChartFX.class)) {
		case JavafxPackage.CHART_FX__TITLE:
		case JavafxPackage.CHART_FX__TITLE_SIDE:
		case JavafxPackage.CHART_FX__SHOW_LEGEND:
		case JavafxPackage.CHART_FX__LEGEND_SIDE:
		case JavafxPackage.CHART_FX__XAXIS_TYPE:
		case JavafxPackage.CHART_FX__YAXIS_TYPE:
		case JavafxPackage.CHART_FX__XAXIS_LABEL:
		case JavafxPackage.CHART_FX__YAXIS_LABEL:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case JavafxPackage.CHART_FX__SERIES:
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

		newChildDescriptors.add(createChildParameter(JavafxPackage.Literals.CHART_FX__SERIES,
				JavafxFactory.eINSTANCE.createChartSeries()));
	}

}
