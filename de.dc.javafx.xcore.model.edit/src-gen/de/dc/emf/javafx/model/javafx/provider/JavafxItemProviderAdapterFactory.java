/**
 */
package de.dc.emf.javafx.model.javafx.provider;

import de.dc.emf.javafx.model.javafx.util.JavafxAdapterFactory;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class JavafxItemProviderAdapterFactory extends JavafxAdapterFactory
		implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavafxItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dc.emf.javafx.model.javafx.ProjectFX} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProjectFXItemProvider projectFXItemProvider;

	/**
	 * This creates an adapter for a {@link de.dc.emf.javafx.model.javafx.ProjectFX}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createProjectFXAdapter() {
		if (projectFXItemProvider == null) {
			projectFXItemProvider = new ProjectFXItemProvider(this);
		}

		return projectFXItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dc.emf.javafx.model.javafx.TableColumnFX} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TableColumnFXItemProvider tableColumnFXItemProvider;

	/**
	 * This creates an adapter for a {@link de.dc.emf.javafx.model.javafx.TableColumnFX}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTableColumnFXAdapter() {
		if (tableColumnFXItemProvider == null) {
			tableColumnFXItemProvider = new TableColumnFXItemProvider(this);
		}

		return tableColumnFXItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dc.emf.javafx.model.javafx.AttributeFX} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttributeFXItemProvider attributeFXItemProvider;

	/**
	 * This creates an adapter for a {@link de.dc.emf.javafx.model.javafx.AttributeFX}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAttributeFXAdapter() {
		if (attributeFXItemProvider == null) {
			attributeFXItemProvider = new AttributeFXItemProvider(this);
		}

		return attributeFXItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dc.emf.javafx.model.javafx.Bean} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BeanItemProvider beanItemProvider;

	/**
	 * This creates an adapter for a {@link de.dc.emf.javafx.model.javafx.Bean}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBeanAdapter() {
		if (beanItemProvider == null) {
			beanItemProvider = new BeanItemProvider(this);
		}

		return beanItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dc.emf.javafx.model.javafx.DerivedBean} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DerivedBeanItemProvider derivedBeanItemProvider;

	/**
	 * This creates an adapter for a {@link de.dc.emf.javafx.model.javafx.DerivedBean}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDerivedBeanAdapter() {
		if (derivedBeanItemProvider == null) {
			derivedBeanItemProvider = new DerivedBeanItemProvider(this);
		}

		return derivedBeanItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dc.emf.javafx.model.javafx.Binding} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BindingItemProvider bindingItemProvider;

	/**
	 * This creates an adapter for a {@link de.dc.emf.javafx.model.javafx.Binding}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBindingAdapter() {
		if (bindingItemProvider == null) {
			bindingItemProvider = new BindingItemProvider(this);
		}

		return bindingItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dc.emf.javafx.model.javafx.BindingProperty} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BindingPropertyItemProvider bindingPropertyItemProvider;

	/**
	 * This creates an adapter for a {@link de.dc.emf.javafx.model.javafx.BindingProperty}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBindingPropertyAdapter() {
		if (bindingPropertyItemProvider == null) {
			bindingPropertyItemProvider = new BindingPropertyItemProvider(this);
		}

		return bindingPropertyItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dc.emf.javafx.model.javafx.TableViewFX} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TableViewFXItemProvider tableViewFXItemProvider;

	/**
	 * This creates an adapter for a {@link de.dc.emf.javafx.model.javafx.TableViewFX}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTableViewFXAdapter() {
		if (tableViewFXItemProvider == null) {
			tableViewFXItemProvider = new TableViewFXItemProvider(this);
		}

		return tableViewFXItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dc.emf.javafx.model.javafx.TreeViewFX} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TreeViewFXItemProvider treeViewFXItemProvider;

	/**
	 * This creates an adapter for a {@link de.dc.emf.javafx.model.javafx.TreeViewFX}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTreeViewFXAdapter() {
		if (treeViewFXItemProvider == null) {
			treeViewFXItemProvider = new TreeViewFXItemProvider(this);
		}

		return treeViewFXItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dc.emf.javafx.model.javafx.ListViewFX} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ListViewFXItemProvider listViewFXItemProvider;

	/**
	 * This creates an adapter for a {@link de.dc.emf.javafx.model.javafx.ListViewFX}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createListViewFXAdapter() {
		if (listViewFXItemProvider == null) {
			listViewFXItemProvider = new ListViewFXItemProvider(this);
		}

		return listViewFXItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dc.emf.javafx.model.javafx.NamedElement} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NamedElementItemProvider namedElementItemProvider;

	/**
	 * This creates an adapter for a {@link de.dc.emf.javafx.model.javafx.NamedElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createNamedElementAdapter() {
		if (namedElementItemProvider == null) {
			namedElementItemProvider = new NamedElementItemProvider(this);
		}

		return namedElementItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dc.emf.javafx.model.javafx.FilteredElement} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FilteredElementItemProvider filteredElementItemProvider;

	/**
	 * This creates an adapter for a {@link de.dc.emf.javafx.model.javafx.FilteredElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFilteredElementAdapter() {
		if (filteredElementItemProvider == null) {
			filteredElementItemProvider = new FilteredElementItemProvider(this);
		}

		return filteredElementItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dc.emf.javafx.model.javafx.ChartSeries} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChartSeriesItemProvider chartSeriesItemProvider;

	/**
	 * This creates an adapter for a {@link de.dc.emf.javafx.model.javafx.ChartSeries}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createChartSeriesAdapter() {
		if (chartSeriesItemProvider == null) {
			chartSeriesItemProvider = new ChartSeriesItemProvider(this);
		}

		return chartSeriesItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dc.emf.javafx.model.javafx.ChartFXData} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChartFXDataItemProvider chartFXDataItemProvider;

	/**
	 * This creates an adapter for a {@link de.dc.emf.javafx.model.javafx.ChartFXData}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createChartFXDataAdapter() {
		if (chartFXDataItemProvider == null) {
			chartFXDataItemProvider = new ChartFXDataItemProvider(this);
		}

		return chartFXDataItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dc.emf.javafx.model.javafx.LineChartFX} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LineChartFXItemProvider lineChartFXItemProvider;

	/**
	 * This creates an adapter for a {@link de.dc.emf.javafx.model.javafx.LineChartFX}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLineChartFXAdapter() {
		if (lineChartFXItemProvider == null) {
			lineChartFXItemProvider = new LineChartFXItemProvider(this);
		}

		return lineChartFXItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dc.emf.javafx.model.javafx.PieChartFX} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PieChartFXItemProvider pieChartFXItemProvider;

	/**
	 * This creates an adapter for a {@link de.dc.emf.javafx.model.javafx.PieChartFX}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPieChartFXAdapter() {
		if (pieChartFXItemProvider == null) {
			pieChartFXItemProvider = new PieChartFXItemProvider(this);
		}

		return pieChartFXItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dc.emf.javafx.model.javafx.AreaChartFX} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AreaChartFXItemProvider areaChartFXItemProvider;

	/**
	 * This creates an adapter for a {@link de.dc.emf.javafx.model.javafx.AreaChartFX}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAreaChartFXAdapter() {
		if (areaChartFXItemProvider == null) {
			areaChartFXItemProvider = new AreaChartFXItemProvider(this);
		}

		return areaChartFXItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dc.emf.javafx.model.javafx.BubbleChartFX} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BubbleChartFXItemProvider bubbleChartFXItemProvider;

	/**
	 * This creates an adapter for a {@link de.dc.emf.javafx.model.javafx.BubbleChartFX}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBubbleChartFXAdapter() {
		if (bubbleChartFXItemProvider == null) {
			bubbleChartFXItemProvider = new BubbleChartFXItemProvider(this);
		}

		return bubbleChartFXItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dc.emf.javafx.model.javafx.ScatterChartFX} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScatterChartFXItemProvider scatterChartFXItemProvider;

	/**
	 * This creates an adapter for a {@link de.dc.emf.javafx.model.javafx.ScatterChartFX}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createScatterChartFXAdapter() {
		if (scatterChartFXItemProvider == null) {
			scatterChartFXItemProvider = new ScatterChartFXItemProvider(this);
		}

		return scatterChartFXItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dc.emf.javafx.model.javafx.BarChartFX} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BarChartFXItemProvider barChartFXItemProvider;

	/**
	 * This creates an adapter for a {@link de.dc.emf.javafx.model.javafx.BarChartFX}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBarChartFXAdapter() {
		if (barChartFXItemProvider == null) {
			barChartFXItemProvider = new BarChartFXItemProvider(this);
		}

		return barChartFXItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>) type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void dispose() {
		if (projectFXItemProvider != null)
			projectFXItemProvider.dispose();
		if (tableColumnFXItemProvider != null)
			tableColumnFXItemProvider.dispose();
		if (attributeFXItemProvider != null)
			attributeFXItemProvider.dispose();
		if (beanItemProvider != null)
			beanItemProvider.dispose();
		if (derivedBeanItemProvider != null)
			derivedBeanItemProvider.dispose();
		if (bindingItemProvider != null)
			bindingItemProvider.dispose();
		if (bindingPropertyItemProvider != null)
			bindingPropertyItemProvider.dispose();
		if (tableViewFXItemProvider != null)
			tableViewFXItemProvider.dispose();
		if (treeViewFXItemProvider != null)
			treeViewFXItemProvider.dispose();
		if (listViewFXItemProvider != null)
			listViewFXItemProvider.dispose();
		if (namedElementItemProvider != null)
			namedElementItemProvider.dispose();
		if (filteredElementItemProvider != null)
			filteredElementItemProvider.dispose();
		if (chartSeriesItemProvider != null)
			chartSeriesItemProvider.dispose();
		if (chartFXDataItemProvider != null)
			chartFXDataItemProvider.dispose();
		if (lineChartFXItemProvider != null)
			lineChartFXItemProvider.dispose();
		if (pieChartFXItemProvider != null)
			pieChartFXItemProvider.dispose();
		if (areaChartFXItemProvider != null)
			areaChartFXItemProvider.dispose();
		if (bubbleChartFXItemProvider != null)
			bubbleChartFXItemProvider.dispose();
		if (scatterChartFXItemProvider != null)
			scatterChartFXItemProvider.dispose();
		if (barChartFXItemProvider != null)
			barChartFXItemProvider.dispose();
	}

}
