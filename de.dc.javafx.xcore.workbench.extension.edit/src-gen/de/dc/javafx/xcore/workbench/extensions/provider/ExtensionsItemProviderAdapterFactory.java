/**
 */
package de.dc.javafx.xcore.workbench.extensions.provider;

import de.dc.javafx.xcore.workbench.extensions.util.ExtensionsAdapterFactory;

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
public class ExtensionsItemProviderAdapterFactory extends ExtensionsAdapterFactory
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
	public ExtensionsItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dc.javafx.xcore.workbench.extensions.ExtensionManager} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExtensionManagerItemProvider extensionManagerItemProvider;

	/**
	 * This creates an adapter for a {@link de.dc.javafx.xcore.workbench.extensions.ExtensionManager}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createExtensionManagerAdapter() {
		if (extensionManagerItemProvider == null) {
			extensionManagerItemProvider = new ExtensionManagerItemProvider(this);
		}

		return extensionManagerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dc.javafx.xcore.workbench.extensions.ViewExtension} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ViewExtensionItemProvider viewExtensionItemProvider;

	/**
	 * This creates an adapter for a {@link de.dc.javafx.xcore.workbench.extensions.ViewExtension}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createViewExtensionAdapter() {
		if (viewExtensionItemProvider == null) {
			viewExtensionItemProvider = new ViewExtensionItemProvider(this);
		}

		return viewExtensionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dc.javafx.xcore.workbench.extensions.EditorExtension} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EditorExtensionItemProvider editorExtensionItemProvider;

	/**
	 * This creates an adapter for a {@link de.dc.javafx.xcore.workbench.extensions.EditorExtension}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEditorExtensionAdapter() {
		if (editorExtensionItemProvider == null) {
			editorExtensionItemProvider = new EditorExtensionItemProvider(this);
		}

		return editorExtensionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dc.javafx.xcore.workbench.extensions.MenuExtension} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MenuExtensionItemProvider menuExtensionItemProvider;

	/**
	 * This creates an adapter for a {@link de.dc.javafx.xcore.workbench.extensions.MenuExtension}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMenuExtensionAdapter() {
		if (menuExtensionItemProvider == null) {
			menuExtensionItemProvider = new MenuExtensionItemProvider(this);
		}

		return menuExtensionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dc.javafx.xcore.workbench.extensions.ToolbarExtension} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ToolbarExtensionItemProvider toolbarExtensionItemProvider;

	/**
	 * This creates an adapter for a {@link de.dc.javafx.xcore.workbench.extensions.ToolbarExtension}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createToolbarExtensionAdapter() {
		if (toolbarExtensionItemProvider == null) {
			toolbarExtensionItemProvider = new ToolbarExtensionItemProvider(this);
		}

		return toolbarExtensionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dc.javafx.xcore.workbench.extensions.PerspectiveExtension} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PerspectiveExtensionItemProvider perspectiveExtensionItemProvider;

	/**
	 * This creates an adapter for a {@link de.dc.javafx.xcore.workbench.extensions.PerspectiveExtension}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPerspectiveExtensionAdapter() {
		if (perspectiveExtensionItemProvider == null) {
			perspectiveExtensionItemProvider = new PerspectiveExtensionItemProvider(this);
		}

		return perspectiveExtensionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dc.javafx.xcore.workbench.extensions.View} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ViewItemProvider viewItemProvider;

	/**
	 * This creates an adapter for a {@link de.dc.javafx.xcore.workbench.extensions.View}.
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
	 * This keeps track of the one adapter used for all {@link de.dc.javafx.xcore.workbench.extensions.Editor} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EditorItemProvider editorItemProvider;

	/**
	 * This creates an adapter for a {@link de.dc.javafx.xcore.workbench.extensions.Editor}.
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
	 * This keeps track of the one adapter used for all {@link de.dc.javafx.xcore.workbench.extensions.Perspective} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PerspectiveItemProvider perspectiveItemProvider;

	/**
	 * This creates an adapter for a {@link de.dc.javafx.xcore.workbench.extensions.Perspective}.
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
		if (extensionManagerItemProvider != null)
			extensionManagerItemProvider.dispose();
		if (viewExtensionItemProvider != null)
			viewExtensionItemProvider.dispose();
		if (editorExtensionItemProvider != null)
			editorExtensionItemProvider.dispose();
		if (menuExtensionItemProvider != null)
			menuExtensionItemProvider.dispose();
		if (toolbarExtensionItemProvider != null)
			toolbarExtensionItemProvider.dispose();
		if (perspectiveExtensionItemProvider != null)
			perspectiveExtensionItemProvider.dispose();
		if (viewItemProvider != null)
			viewItemProvider.dispose();
		if (editorItemProvider != null)
			editorItemProvider.dispose();
		if (perspectiveItemProvider != null)
			perspectiveItemProvider.dispose();
	}

}
