/**
 */
package de.dc.javafx.xcore.workbench.chart.provider;

import de.dc.javafx.xcore.workbench.chart.ChartFXConfig;
import de.dc.javafx.xcore.workbench.chart.ChartPackage;

import de.dc.javafx.xcore.workbench.chart.ChartSide;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

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
 * This is the item provider adapter for a {@link de.dc.javafx.xcore.workbench.chart.ChartFXConfig} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ChartFXConfigItemProvider extends ItemProviderAdapter
		implements IEditingDomainItemProvider, IStructuredItemContentProvider, ITreeItemContentProvider,
		IItemLabelProvider, IItemPropertySource, ITableItemLabelProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChartFXConfigItemProvider(AdapterFactory adapterFactory) {
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

			addSideLegendPropertyDescriptor(object);
			addTitleSidePropertyDescriptor(object);
			addShowLegendPropertyDescriptor(object);
			addIsAnimatedPropertyDescriptor(object);
			addAlternativeColumnFillVisiblePropertyDescriptor(object);
			addAlternativeRowFillVisiblePropertyDescriptor(object);
			addHorizontalGridLinesVisiblePropertyDescriptor(object);
			addHorizontalZeroLinesVisiblePropertyDescriptor(object);
			addVerticalGridLinesVisiblePropertyDescriptor(object);
			addVerticalZeroLinesVisiblePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Side Legend feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSideLegendPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_ChartFXConfig_sideLegend_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_ChartFXConfig_sideLegend_feature",
								"_UI_ChartFXConfig_type"),
						ChartPackage.Literals.CHART_FX_CONFIG__SIDE_LEGEND, true, false, false,
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
						getResourceLocator(), getString("_UI_ChartFXConfig_titleSide_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_ChartFXConfig_titleSide_feature",
								"_UI_ChartFXConfig_type"),
						ChartPackage.Literals.CHART_FX_CONFIG__TITLE_SIDE, true, false, false,
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
						getResourceLocator(), getString("_UI_ChartFXConfig_showLegend_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_ChartFXConfig_showLegend_feature",
								"_UI_ChartFXConfig_type"),
						ChartPackage.Literals.CHART_FX_CONFIG__SHOW_LEGEND, true, false, false,
						ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Is Animated feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsAnimatedPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_ChartFXConfig_isAnimated_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_ChartFXConfig_isAnimated_feature",
								"_UI_ChartFXConfig_type"),
						ChartPackage.Literals.CHART_FX_CONFIG__IS_ANIMATED, true, false, false,
						ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Alternative Column Fill Visible feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAlternativeColumnFillVisiblePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_ChartFXConfig_alternativeColumnFillVisible_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_ChartFXConfig_alternativeColumnFillVisible_feature", "_UI_ChartFXConfig_type"),
						ChartPackage.Literals.CHART_FX_CONFIG__ALTERNATIVE_COLUMN_FILL_VISIBLE, true, false, false,
						ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Alternative Row Fill Visible feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAlternativeRowFillVisiblePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_ChartFXConfig_alternativeRowFillVisible_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_ChartFXConfig_alternativeRowFillVisible_feature",
						"_UI_ChartFXConfig_type"),
				ChartPackage.Literals.CHART_FX_CONFIG__ALTERNATIVE_ROW_FILL_VISIBLE, true, false, false,
				ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Horizontal Grid Lines Visible feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHorizontalGridLinesVisiblePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_ChartFXConfig_horizontalGridLinesVisible_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_ChartFXConfig_horizontalGridLinesVisible_feature",
						"_UI_ChartFXConfig_type"),
				ChartPackage.Literals.CHART_FX_CONFIG__HORIZONTAL_GRID_LINES_VISIBLE, true, false, false,
				ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Horizontal Zero Lines Visible feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHorizontalZeroLinesVisiblePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_ChartFXConfig_horizontalZeroLinesVisible_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_ChartFXConfig_horizontalZeroLinesVisible_feature",
						"_UI_ChartFXConfig_type"),
				ChartPackage.Literals.CHART_FX_CONFIG__HORIZONTAL_ZERO_LINES_VISIBLE, true, false, false,
				ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Vertical Grid Lines Visible feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVerticalGridLinesVisiblePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_ChartFXConfig_verticalGridLinesVisible_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_ChartFXConfig_verticalGridLinesVisible_feature",
						"_UI_ChartFXConfig_type"),
				ChartPackage.Literals.CHART_FX_CONFIG__VERTICAL_GRID_LINES_VISIBLE, true, false, false,
				ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Vertical Zero Lines Visible feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVerticalZeroLinesVisiblePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_ChartFXConfig_verticalZeroLinesVisible_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_ChartFXConfig_verticalZeroLinesVisible_feature",
						"_UI_ChartFXConfig_type"),
				ChartPackage.Literals.CHART_FX_CONFIG__VERTICAL_ZERO_LINES_VISIBLE, true, false, false,
				ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns ChartFXConfig.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ChartFXConfig"));
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
		ChartSide labelValue = ((ChartFXConfig) object).getSideLegend();
		String label = labelValue == null ? null : labelValue.toString();
		return label == null || label.length() == 0 ? getString("_UI_ChartFXConfig_type")
				: getString("_UI_ChartFXConfig_type") + " " + label;
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

		switch (notification.getFeatureID(ChartFXConfig.class)) {
		case ChartPackage.CHART_FX_CONFIG__SIDE_LEGEND:
		case ChartPackage.CHART_FX_CONFIG__TITLE_SIDE:
		case ChartPackage.CHART_FX_CONFIG__SHOW_LEGEND:
		case ChartPackage.CHART_FX_CONFIG__IS_ANIMATED:
		case ChartPackage.CHART_FX_CONFIG__ALTERNATIVE_COLUMN_FILL_VISIBLE:
		case ChartPackage.CHART_FX_CONFIG__ALTERNATIVE_ROW_FILL_VISIBLE:
		case ChartPackage.CHART_FX_CONFIG__HORIZONTAL_GRID_LINES_VISIBLE:
		case ChartPackage.CHART_FX_CONFIG__HORIZONTAL_ZERO_LINES_VISIBLE:
		case ChartPackage.CHART_FX_CONFIG__VERTICAL_GRID_LINES_VISIBLE:
		case ChartPackage.CHART_FX_CONFIG__VERTICAL_ZERO_LINES_VISIBLE:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
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
