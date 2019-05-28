/**
 */
package de.dc.javafx.xcore.workbench.impl;

import de.dc.javafx.xcore.workbench.*;

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
public class WorkbenchFactoryImpl extends EFactoryImpl implements WorkbenchFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static WorkbenchFactory init() {
		try {
			WorkbenchFactory theWorkbenchFactory = (WorkbenchFactory) EPackage.Registry.INSTANCE
					.getEFactory(WorkbenchPackage.eNS_URI);
			if (theWorkbenchFactory != null) {
				return theWorkbenchFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new WorkbenchFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkbenchFactoryImpl() {
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
		case WorkbenchPackage.NAMED_ELEMENT:
			return createNamedElement();
		case WorkbenchPackage.WORKBENCH:
			return createWorkbench();
		case WorkbenchPackage.PERSPECTIVE:
			return createPerspective();
		case WorkbenchPackage.COMMAND:
			return createCommand();
		case WorkbenchPackage.VIEW:
			return createView();
		case WorkbenchPackage.EDITOR_AREA:
			return createEditorArea();
		case WorkbenchPackage.LEFT_PANE:
			return createLeftPane();
		case WorkbenchPackage.RIGHT_PANE:
			return createRightPane();
		case WorkbenchPackage.BOTTOM_PANE:
			return createBottomPane();
		case WorkbenchPackage.TOOLBAR:
			return createToolbar();
		case WorkbenchPackage.TOOLBAR_ITEM:
			return createToolbarItem();
		case WorkbenchPackage.STATUSLINE:
			return createStatusline();
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
	public NamedElement createNamedElement() {
		NamedElementImpl namedElement = new NamedElementImpl();
		return namedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Workbench createWorkbench() {
		WorkbenchImpl workbench = new WorkbenchImpl();
		return workbench;
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
	public Command createCommand() {
		CommandImpl command = new CommandImpl();
		return command;
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
	public EditorArea createEditorArea() {
		EditorAreaImpl editorArea = new EditorAreaImpl();
		return editorArea;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LeftPane createLeftPane() {
		LeftPaneImpl leftPane = new LeftPaneImpl();
		return leftPane;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RightPane createRightPane() {
		RightPaneImpl rightPane = new RightPaneImpl();
		return rightPane;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BottomPane createBottomPane() {
		BottomPaneImpl bottomPane = new BottomPaneImpl();
		return bottomPane;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Toolbar createToolbar() {
		ToolbarImpl toolbar = new ToolbarImpl();
		return toolbar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ToolbarItem createToolbarItem() {
		ToolbarItemImpl toolbarItem = new ToolbarItemImpl();
		return toolbarItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Statusline createStatusline() {
		StatuslineImpl statusline = new StatuslineImpl();
		return statusline;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WorkbenchPackage getWorkbenchPackage() {
		return (WorkbenchPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static WorkbenchPackage getPackage() {
		return WorkbenchPackage.eINSTANCE;
	}

} //WorkbenchFactoryImpl
