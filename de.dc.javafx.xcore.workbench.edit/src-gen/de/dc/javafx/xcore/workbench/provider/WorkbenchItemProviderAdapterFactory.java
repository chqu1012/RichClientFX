/**
 */
package de.dc.javafx.xcore.workbench.provider;

import de.dc.javafx.xcore.workbench.util.WorkbenchAdapterFactory;

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
public class WorkbenchItemProviderAdapterFactory extends WorkbenchAdapterFactory
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
	public WorkbenchItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dc.javafx.xcore.workbench.IActionListener} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IActionListenerItemProvider iActionListenerItemProvider;

	/**
	 * This creates an adapter for a {@link de.dc.javafx.xcore.workbench.IActionListener}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createIActionListenerAdapter() {
		if (iActionListenerItemProvider == null) {
			iActionListenerItemProvider = new IActionListenerItemProvider(this);
		}

		return iActionListenerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dc.javafx.xcore.workbench.NamedElement} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NamedElementItemProvider namedElementItemProvider;

	/**
	 * This creates an adapter for a {@link de.dc.javafx.xcore.workbench.NamedElement}.
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
	 * This keeps track of the one adapter used for all {@link de.dc.javafx.xcore.workbench.Workbench} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorkbenchItemProvider workbenchItemProvider;

	/**
	 * This creates an adapter for a {@link de.dc.javafx.xcore.workbench.Workbench}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createWorkbenchAdapter() {
		if (workbenchItemProvider == null) {
			workbenchItemProvider = new WorkbenchItemProvider(this);
		}

		return workbenchItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dc.javafx.xcore.workbench.CommandRegistry} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommandRegistryItemProvider commandRegistryItemProvider;

	/**
	 * This creates an adapter for a {@link de.dc.javafx.xcore.workbench.CommandRegistry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCommandRegistryAdapter() {
		if (commandRegistryItemProvider == null) {
			commandRegistryItemProvider = new CommandRegistryItemProvider(this);
		}

		return commandRegistryItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dc.javafx.xcore.workbench.EditorRegistry} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EditorRegistryItemProvider editorRegistryItemProvider;

	/**
	 * This creates an adapter for a {@link de.dc.javafx.xcore.workbench.EditorRegistry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEditorRegistryAdapter() {
		if (editorRegistryItemProvider == null) {
			editorRegistryItemProvider = new EditorRegistryItemProvider(this);
		}

		return editorRegistryItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dc.javafx.xcore.workbench.Editor} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EditorItemProvider editorItemProvider;

	/**
	 * This creates an adapter for a {@link de.dc.javafx.xcore.workbench.Editor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEditorAdapter() {
		if (editorItemProvider == null) {
			editorItemProvider = new EditorItemProvider(this);
		}

		return editorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dc.javafx.xcore.workbench.Perspective} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PerspectiveItemProvider perspectiveItemProvider;

	/**
	 * This creates an adapter for a {@link de.dc.javafx.xcore.workbench.Perspective}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPerspectiveAdapter() {
		if (perspectiveItemProvider == null) {
			perspectiveItemProvider = new PerspectiveItemProvider(this);
		}

		return perspectiveItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dc.javafx.xcore.workbench.Command} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommandItemProvider commandItemProvider;

	/**
	 * This creates an adapter for a {@link de.dc.javafx.xcore.workbench.Command}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCommandAdapter() {
		if (commandItemProvider == null) {
			commandItemProvider = new CommandItemProvider(this);
		}

		return commandItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dc.javafx.xcore.workbench.View} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ViewItemProvider viewItemProvider;

	/**
	 * This creates an adapter for a {@link de.dc.javafx.xcore.workbench.View}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createViewAdapter() {
		if (viewItemProvider == null) {
			viewItemProvider = new ViewItemProvider(this);
		}

		return viewItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dc.javafx.xcore.workbench.EditorArea} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EditorAreaItemProvider editorAreaItemProvider;

	/**
	 * This creates an adapter for a {@link de.dc.javafx.xcore.workbench.EditorArea}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEditorAreaAdapter() {
		if (editorAreaItemProvider == null) {
			editorAreaItemProvider = new EditorAreaItemProvider(this);
		}

		return editorAreaItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dc.javafx.xcore.workbench.LeftPane} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LeftPaneItemProvider leftPaneItemProvider;

	/**
	 * This creates an adapter for a {@link de.dc.javafx.xcore.workbench.LeftPane}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLeftPaneAdapter() {
		if (leftPaneItemProvider == null) {
			leftPaneItemProvider = new LeftPaneItemProvider(this);
		}

		return leftPaneItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dc.javafx.xcore.workbench.RightPane} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RightPaneItemProvider rightPaneItemProvider;

	/**
	 * This creates an adapter for a {@link de.dc.javafx.xcore.workbench.RightPane}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRightPaneAdapter() {
		if (rightPaneItemProvider == null) {
			rightPaneItemProvider = new RightPaneItemProvider(this);
		}

		return rightPaneItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dc.javafx.xcore.workbench.BottomPane} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BottomPaneItemProvider bottomPaneItemProvider;

	/**
	 * This creates an adapter for a {@link de.dc.javafx.xcore.workbench.BottomPane}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBottomPaneAdapter() {
		if (bottomPaneItemProvider == null) {
			bottomPaneItemProvider = new BottomPaneItemProvider(this);
		}

		return bottomPaneItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dc.javafx.xcore.workbench.Toolbar} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ToolbarItemProvider toolbarItemProvider;

	/**
	 * This creates an adapter for a {@link de.dc.javafx.xcore.workbench.Toolbar}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createToolbarAdapter() {
		if (toolbarItemProvider == null) {
			toolbarItemProvider = new ToolbarItemProvider(this);
		}

		return toolbarItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dc.javafx.xcore.workbench.ToolbarItem} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ToolbarItemItemProvider toolbarItemItemProvider;

	/**
	 * This creates an adapter for a {@link de.dc.javafx.xcore.workbench.ToolbarItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createToolbarItemAdapter() {
		if (toolbarItemItemProvider == null) {
			toolbarItemItemProvider = new ToolbarItemItemProvider(this);
		}

		return toolbarItemItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dc.javafx.xcore.workbench.Statusline} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StatuslineItemProvider statuslineItemProvider;

	/**
	 * This creates an adapter for a {@link de.dc.javafx.xcore.workbench.Statusline}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createStatuslineAdapter() {
		if (statuslineItemProvider == null) {
			statuslineItemProvider = new StatuslineItemProvider(this);
		}

		return statuslineItemProvider;
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
		if (iActionListenerItemProvider != null)
			iActionListenerItemProvider.dispose();
		if (namedElementItemProvider != null)
			namedElementItemProvider.dispose();
		if (workbenchItemProvider != null)
			workbenchItemProvider.dispose();
		if (commandRegistryItemProvider != null)
			commandRegistryItemProvider.dispose();
		if (editorRegistryItemProvider != null)
			editorRegistryItemProvider.dispose();
		if (editorItemProvider != null)
			editorItemProvider.dispose();
		if (perspectiveItemProvider != null)
			perspectiveItemProvider.dispose();
		if (commandItemProvider != null)
			commandItemProvider.dispose();
		if (viewItemProvider != null)
			viewItemProvider.dispose();
		if (editorAreaItemProvider != null)
			editorAreaItemProvider.dispose();
		if (leftPaneItemProvider != null)
			leftPaneItemProvider.dispose();
		if (rightPaneItemProvider != null)
			rightPaneItemProvider.dispose();
		if (bottomPaneItemProvider != null)
			bottomPaneItemProvider.dispose();
		if (toolbarItemProvider != null)
			toolbarItemProvider.dispose();
		if (toolbarItemItemProvider != null)
			toolbarItemItemProvider.dispose();
		if (statuslineItemProvider != null)
			statuslineItemProvider.dispose();
	}

}
