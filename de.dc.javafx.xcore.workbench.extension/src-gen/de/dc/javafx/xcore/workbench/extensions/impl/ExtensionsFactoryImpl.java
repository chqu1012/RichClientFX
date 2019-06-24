/**
 */
package de.dc.javafx.xcore.workbench.extensions.impl;

import de.dc.javafx.xcore.workbench.extensions.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ExtensionsFactoryImpl extends EFactoryImpl implements ExtensionsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ExtensionsFactory init() {
		try {
			ExtensionsFactory theExtensionsFactory = (ExtensionsFactory) EPackage.Registry.INSTANCE
					.getEFactory(ExtensionsPackage.eNS_URI);
			if (theExtensionsFactory != null) {
				return theExtensionsFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ExtensionsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtensionsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case ExtensionsPackage.EXTENSION_MANAGER:
			return createExtensionManager();
		case ExtensionsPackage.VIEW_EXTENSION:
			return createViewExtension();
		case ExtensionsPackage.EDITOR_EXTENSION:
			return createEditorExtension();
		case ExtensionsPackage.MENU_EXTENSION:
			return createMenuExtension();
		case ExtensionsPackage.TOOLBAR_EXTENSION:
			return createToolbarExtension();
		case ExtensionsPackage.PERSPECTIVE_EXTENSION:
			return createPerspectiveExtension();
		case ExtensionsPackage.VIEW:
			return createView();
		case ExtensionsPackage.EDITOR:
			return createEditor();
		case ExtensionsPackage.PERSPECTIVE:
			return createPerspective();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExtensionManager createExtensionManager() {
		ExtensionManagerImpl extensionManager = new ExtensionManagerImpl();
		return extensionManager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ViewExtension createViewExtension() {
		ViewExtensionImpl viewExtension = new ViewExtensionImpl();
		return viewExtension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EditorExtension createEditorExtension() {
		EditorExtensionImpl editorExtension = new EditorExtensionImpl();
		return editorExtension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MenuExtension createMenuExtension() {
		MenuExtensionImpl menuExtension = new MenuExtensionImpl();
		return menuExtension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ToolbarExtension createToolbarExtension() {
		ToolbarExtensionImpl toolbarExtension = new ToolbarExtensionImpl();
		return toolbarExtension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PerspectiveExtension createPerspectiveExtension() {
		PerspectiveExtensionImpl perspectiveExtension = new PerspectiveExtensionImpl();
		return perspectiveExtension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public View createView() {
		ViewImpl view = new ViewImpl();
		return view;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Editor createEditor() {
		EditorImpl editor = new EditorImpl();
		return editor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Perspective createPerspective() {
		PerspectiveImpl perspective = new PerspectiveImpl();
		return perspective;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExtensionsPackage getExtensionsPackage() {
		return (ExtensionsPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ExtensionsPackage getPackage() {
		return ExtensionsPackage.eINSTANCE;
	}

} //ExtensionsFactoryImpl
