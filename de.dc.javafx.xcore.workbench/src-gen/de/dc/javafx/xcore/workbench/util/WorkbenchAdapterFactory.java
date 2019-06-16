/**
 */
package de.dc.javafx.xcore.workbench.util;

import de.dc.javafx.xcore.workbench.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.dc.javafx.xcore.workbench.WorkbenchPackage
 * @generated
 */
public class WorkbenchAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static WorkbenchPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkbenchAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = WorkbenchPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorkbenchSwitch<Adapter> modelSwitch = new WorkbenchSwitch<Adapter>() {
		@Override
		public Adapter caseIActionListener(IActionListener object) {
			return createIActionListenerAdapter();
		}

		@Override
		public Adapter caseNamedElement(NamedElement object) {
			return createNamedElementAdapter();
		}

		@Override
		public Adapter caseWorkbench(Workbench object) {
			return createWorkbenchAdapter();
		}

		@Override
		public Adapter caseEditorRegistry(EditorRegistry object) {
			return createEditorRegistryAdapter();
		}

		@Override
		public Adapter caseEditor(Editor object) {
			return createEditorAdapter();
		}

		@Override
		public Adapter casePerspective(Perspective object) {
			return createPerspectiveAdapter();
		}

		@Override
		public Adapter caseCommand(Command object) {
			return createCommandAdapter();
		}

		@Override
		public Adapter caseViewContainer(ViewContainer object) {
			return createViewContainerAdapter();
		}

		@Override
		public Adapter caseView(View object) {
			return createViewAdapter();
		}

		@Override
		public Adapter caseEditorArea(EditorArea object) {
			return createEditorAreaAdapter();
		}

		@Override
		public Adapter caseLeftPane(LeftPane object) {
			return createLeftPaneAdapter();
		}

		@Override
		public Adapter caseRightPane(RightPane object) {
			return createRightPaneAdapter();
		}

		@Override
		public Adapter caseBottomPane(BottomPane object) {
			return createBottomPaneAdapter();
		}

		@Override
		public Adapter caseToolbar(Toolbar object) {
			return createToolbarAdapter();
		}

		@Override
		public Adapter caseToolbarItem(ToolbarItem object) {
			return createToolbarItemAdapter();
		}

		@Override
		public Adapter caseStatusline(Statusline object) {
			return createStatuslineAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dc.javafx.xcore.workbench.IActionListener <em>IAction Listener</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dc.javafx.xcore.workbench.IActionListener
	 * @generated
	 */
	public Adapter createIActionListenerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dc.javafx.xcore.workbench.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dc.javafx.xcore.workbench.NamedElement
	 * @generated
	 */
	public Adapter createNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dc.javafx.xcore.workbench.Workbench <em>Workbench</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dc.javafx.xcore.workbench.Workbench
	 * @generated
	 */
	public Adapter createWorkbenchAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dc.javafx.xcore.workbench.EditorRegistry <em>Editor Registry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dc.javafx.xcore.workbench.EditorRegistry
	 * @generated
	 */
	public Adapter createEditorRegistryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dc.javafx.xcore.workbench.Editor <em>Editor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dc.javafx.xcore.workbench.Editor
	 * @generated
	 */
	public Adapter createEditorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dc.javafx.xcore.workbench.Perspective <em>Perspective</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dc.javafx.xcore.workbench.Perspective
	 * @generated
	 */
	public Adapter createPerspectiveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dc.javafx.xcore.workbench.Command <em>Command</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dc.javafx.xcore.workbench.Command
	 * @generated
	 */
	public Adapter createCommandAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dc.javafx.xcore.workbench.ViewContainer <em>View Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dc.javafx.xcore.workbench.ViewContainer
	 * @generated
	 */
	public Adapter createViewContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dc.javafx.xcore.workbench.View <em>View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dc.javafx.xcore.workbench.View
	 * @generated
	 */
	public Adapter createViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dc.javafx.xcore.workbench.EditorArea <em>Editor Area</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dc.javafx.xcore.workbench.EditorArea
	 * @generated
	 */
	public Adapter createEditorAreaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dc.javafx.xcore.workbench.LeftPane <em>Left Pane</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dc.javafx.xcore.workbench.LeftPane
	 * @generated
	 */
	public Adapter createLeftPaneAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dc.javafx.xcore.workbench.RightPane <em>Right Pane</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dc.javafx.xcore.workbench.RightPane
	 * @generated
	 */
	public Adapter createRightPaneAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dc.javafx.xcore.workbench.BottomPane <em>Bottom Pane</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dc.javafx.xcore.workbench.BottomPane
	 * @generated
	 */
	public Adapter createBottomPaneAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dc.javafx.xcore.workbench.Toolbar <em>Toolbar</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dc.javafx.xcore.workbench.Toolbar
	 * @generated
	 */
	public Adapter createToolbarAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dc.javafx.xcore.workbench.ToolbarItem <em>Toolbar Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dc.javafx.xcore.workbench.ToolbarItem
	 * @generated
	 */
	public Adapter createToolbarItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dc.javafx.xcore.workbench.Statusline <em>Statusline</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dc.javafx.xcore.workbench.Statusline
	 * @generated
	 */
	public Adapter createStatuslineAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //WorkbenchAdapterFactory
