/**
 */
package de.dc.javafx.xcore.workbench.chart.provider;

import de.dc.javafx.xcore.workbench.chart.ChartFactory;
import de.dc.javafx.xcore.workbench.chart.ChartPackage;
import de.dc.javafx.xcore.workbench.chart.ChartProject;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITableItemLabelProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link de.dc.javafx.xcore.workbench.chart.ChartProject} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ChartProjectItemProvider extends ItemProviderAdapter
		implements IEditingDomainItemProvider, IStructuredItemContentProvider, ITreeItemContentProvider,
		IItemLabelProvider, IItemPropertySource, ITableItemLabelProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChartProjectItemProvider(AdapterFactory adapterFactory) {
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

			addNamePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
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
						getResourceLocator(), getString("_UI_ChartProject_name_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_ChartProject_name_feature",
								"_UI_ChartProject_type"),
						ChartPackage.Literals.CHART_PROJECT__NAME, true, false, false,
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
			childrenFeatures.add(ChartPackage.Literals.CHART_PROJECT__CHARTS);
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
	 * This returns ChartProject.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ChartProject"));
	}

	/**
	 * This returns <code>getImage(object)</code> for the column index <code>0</code> or <code>super.getImage(object)</code> otherwise.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText(Object)
	 * @see #getColumnText(Object, int)
	 * @generated
	 */
	@Override
	public Object getColumnImage(Object object, int columnIndex) {
		// TODO: implement this method to return appropriate information for each column.
		// Ensure that you remove @generated or mark it @generated NOT
		return columnIndex == 0 ? getImage(object) : super.getImage(object);
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
		String label = ((ChartProject) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_ChartProject_type")
				: getString("_UI_ChartProject_type") + " " + label;
	}

	/**
	 * This returns <code>getText(object)</code> for the column index <code>0</code> or <code>super.getText(object)</code> otherwise.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImage(Object)
	 * @see #getColumnImage(Object, int)
	 * @generated
	 */
	@Override
	public String getColumnText(Object object, int columnIndex) {
		// TODO: implement this method to return appropriate information for each column.
		// Ensure that you remove @generated or mark it @generated NOT
		return columnIndex == 0 ? getText(object) : super.getText(object);
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

		switch (notification.getFeatureID(ChartProject.class)) {
		case ChartPackage.CHART_PROJECT__NAME:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case ChartPackage.CHART_PROJECT__CHARTS:
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

		newChildDescriptors.add(createChildParameter(ChartPackage.Literals.CHART_PROJECT__CHARTS,
				ChartFactory.eINSTANCE.createLineChartFX()));

		newChildDescriptors.add(createChildParameter(ChartPackage.Literals.CHART_PROJECT__CHARTS,
				ChartFactory.eINSTANCE.createAreaChartFX()));

		newChildDescriptors.add(createChildParameter(ChartPackage.Literals.CHART_PROJECT__CHARTS,
				ChartFactory.eINSTANCE.createScatterChartFX()));

		newChildDescriptors.add(createChildParameter(ChartPackage.Literals.CHART_PROJECT__CHARTS,
				ChartFactory.eINSTANCE.createBubbleChartFX()));

		newChildDescriptors.add(createChildParameter(ChartPackage.Literals.CHART_PROJECT__CHARTS,
				ChartFactory.eINSTANCE.createBarChartFX()));

		newChildDescriptors.add(createChildParameter(ChartPackage.Literals.CHART_PROJECT__CHARTS,
				ChartFactory.eINSTANCE.createPieChartFX()));

		newChildDescriptors.add(createChildParameter(ChartPackage.Literals.CHART_PROJECT__CHARTS,
				ChartFactory.eINSTANCE.createAreaChart3dFX()));

		newChildDescriptors.add(createChildParameter(ChartPackage.Literals.CHART_PROJECT__CHARTS,
				ChartFactory.eINSTANCE.createBarChart3dFX()));

		newChildDescriptors.add(createChildParameter(ChartPackage.Literals.CHART_PROJECT__CHARTS,
				ChartFactory.eINSTANCE.createLineChart3dFX()));

		newChildDescriptors.add(createChildParameter(ChartPackage.Literals.CHART_PROJECT__CHARTS,
				ChartFactory.eINSTANCE.createPieChart3dFX()));

		newChildDescriptors.add(createChildParameter(ChartPackage.Literals.CHART_PROJECT__CHARTS,
				ChartFactory.eINSTANCE.createScatterChart3dFX()));

		newChildDescriptors.add(createChildParameter(ChartPackage.Literals.CHART_PROJECT__CHARTS,
				ChartFactory.eINSTANCE.createStackedBarChart3dFX()));

		newChildDescriptors.add(createChildParameter(ChartPackage.Literals.CHART_PROJECT__CHARTS,
				ChartFactory.eINSTANCE.createXYZBarChart3dFX()));

		newChildDescriptors.add(createChildParameter(ChartPackage.Literals.CHART_PROJECT__CHARTS,
				ChartFactory.eINSTANCE.createXYZLineChart3dFX()));

		newChildDescriptors.add(createChildParameter(ChartPackage.Literals.CHART_PROJECT__CHARTS,
				ChartFactory.eINSTANCE.createSurfaceChart3dFX()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return ChartEditPlugin.INSTANCE;
	}

}
