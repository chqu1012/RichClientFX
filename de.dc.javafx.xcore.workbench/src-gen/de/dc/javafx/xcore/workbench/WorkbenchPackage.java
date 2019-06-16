/**
 */
package de.dc.javafx.xcore.workbench;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.dc.javafx.xcore.workbench.WorkbenchFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel multipleEditorPages='false' creationIcons='false' editDirectory='/de.dc.javafx.xcore.workbench.edit/src-gen' editorDirectory='/de.dc.javafx.xcore.workbench.editor/src-gen' richClientPlatform='true' codeFormatting='true' importerID='org.eclipse.emf.importer.ecore' runtimePlatform='RCP' fileExtensions='workbench' basePackage='de.dc.javafx.xcore'"
 * @generated
 */
public interface WorkbenchPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "workbench";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.frateranatis.org/workbench";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "workbench";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	WorkbenchPackage eINSTANCE = de.dc.javafx.xcore.workbench.impl.WorkbenchPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.dc.javafx.xcore.workbench.impl.IActionListenerImpl <em>IAction Listener</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.javafx.xcore.workbench.impl.IActionListenerImpl
	 * @see de.dc.javafx.xcore.workbench.impl.WorkbenchPackageImpl#getIActionListener()
	 * @generated
	 */
	int IACTION_LISTENER = 0;

	/**
	 * The feature id for the '<em><b>On Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IACTION_LISTENER__ON_ACTION = 0;

	/**
	 * The number of structural features of the '<em>IAction Listener</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IACTION_LISTENER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>IAction Listener</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IACTION_LISTENER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dc.javafx.xcore.workbench.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.javafx.xcore.workbench.impl.NamedElementImpl
	 * @see de.dc.javafx.xcore.workbench.impl.WorkbenchPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = 1;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dc.javafx.xcore.workbench.impl.WorkbenchImpl <em>Workbench</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.javafx.xcore.workbench.impl.WorkbenchImpl
	 * @see de.dc.javafx.xcore.workbench.impl.WorkbenchPackageImpl#getWorkbench()
	 * @generated
	 */
	int WORKBENCH = 2;

	/**
	 * The feature id for the '<em><b>Toolbar</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKBENCH__TOOLBAR = 0;

	/**
	 * The feature id for the '<em><b>Statusline</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKBENCH__STATUSLINE = 1;

	/**
	 * The feature id for the '<em><b>Perspectives</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKBENCH__PERSPECTIVES = 2;

	/**
	 * The feature id for the '<em><b>Commands</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKBENCH__COMMANDS = 3;

	/**
	 * The feature id for the '<em><b>Editor Registry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKBENCH__EDITOR_REGISTRY = 4;

	/**
	 * The number of structural features of the '<em>Workbench</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKBENCH_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Workbench</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKBENCH_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dc.javafx.xcore.workbench.impl.EditorRegistryImpl <em>Editor Registry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.javafx.xcore.workbench.impl.EditorRegistryImpl
	 * @see de.dc.javafx.xcore.workbench.impl.WorkbenchPackageImpl#getEditorRegistry()
	 * @generated
	 */
	int EDITOR_REGISTRY = 3;

	/**
	 * The feature id for the '<em><b>Editor</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDITOR_REGISTRY__EDITOR = 0;

	/**
	 * The number of structural features of the '<em>Editor Registry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDITOR_REGISTRY_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Editor Registry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDITOR_REGISTRY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dc.javafx.xcore.workbench.impl.EditorImpl <em>Editor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.javafx.xcore.workbench.impl.EditorImpl
	 * @see de.dc.javafx.xcore.workbench.impl.WorkbenchPackageImpl#getEditor()
	 * @generated
	 */
	int EDITOR = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDITOR__NAME = 0;

	/**
	 * The feature id for the '<em><b>File Extension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDITOR__FILE_EXTENSION = 1;

	/**
	 * The feature id for the '<em><b>Editor Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDITOR__EDITOR_URI = 2;

	/**
	 * The number of structural features of the '<em>Editor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDITOR_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Editor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDITOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dc.javafx.xcore.workbench.impl.PerspectiveImpl <em>Perspective</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.javafx.xcore.workbench.impl.PerspectiveImpl
	 * @see de.dc.javafx.xcore.workbench.impl.WorkbenchPackageImpl#getPerspective()
	 * @generated
	 */
	int PERSPECTIVE = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSPECTIVE__ID = NAMED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSPECTIVE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Left Pane</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSPECTIVE__LEFT_PANE = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right Pane</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSPECTIVE__RIGHT_PANE = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Bottom Pane</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSPECTIVE__BOTTOM_PANE = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Editor Area</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSPECTIVE__EDITOR_AREA = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Perspective</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSPECTIVE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Perspective</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSPECTIVE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dc.javafx.xcore.workbench.impl.CommandImpl <em>Command</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.javafx.xcore.workbench.impl.CommandImpl
	 * @see de.dc.javafx.xcore.workbench.impl.WorkbenchPackageImpl#getCommand()
	 * @generated
	 */
	int COMMAND = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND__ID = NAMED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Command Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND__COMMAND_CLASS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dc.javafx.xcore.workbench.impl.ViewContainerImpl <em>View Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.javafx.xcore.workbench.impl.ViewContainerImpl
	 * @see de.dc.javafx.xcore.workbench.impl.WorkbenchPackageImpl#getViewContainer()
	 * @generated
	 */
	int VIEW_CONTAINER = 7;

	/**
	 * The feature id for the '<em><b>Views</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_CONTAINER__VIEWS = 0;

	/**
	 * The number of structural features of the '<em>View Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_CONTAINER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>View Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_CONTAINER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dc.javafx.xcore.workbench.impl.ViewImpl <em>View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.javafx.xcore.workbench.impl.ViewImpl
	 * @see de.dc.javafx.xcore.workbench.impl.WorkbenchPackageImpl#getView()
	 * @generated
	 */
	int VIEW = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__ID = NAMED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>View Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__VIEW_CLASS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__ICON = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Closable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__IS_CLOSABLE = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Registrate Change Listener</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__REGISTRATE_CHANGE_LISTENER = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dc.javafx.xcore.workbench.impl.EditorAreaImpl <em>Editor Area</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.javafx.xcore.workbench.impl.EditorAreaImpl
	 * @see de.dc.javafx.xcore.workbench.impl.WorkbenchPackageImpl#getEditorArea()
	 * @generated
	 */
	int EDITOR_AREA = 9;

	/**
	 * The feature id for the '<em><b>Views</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDITOR_AREA__VIEWS = VIEW_CONTAINER__VIEWS;

	/**
	 * The number of structural features of the '<em>Editor Area</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDITOR_AREA_FEATURE_COUNT = VIEW_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Editor Area</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDITOR_AREA_OPERATION_COUNT = VIEW_CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dc.javafx.xcore.workbench.impl.LeftPaneImpl <em>Left Pane</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.javafx.xcore.workbench.impl.LeftPaneImpl
	 * @see de.dc.javafx.xcore.workbench.impl.WorkbenchPackageImpl#getLeftPane()
	 * @generated
	 */
	int LEFT_PANE = 10;

	/**
	 * The feature id for the '<em><b>Views</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEFT_PANE__VIEWS = VIEW_CONTAINER__VIEWS;

	/**
	 * The number of structural features of the '<em>Left Pane</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEFT_PANE_FEATURE_COUNT = VIEW_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Left Pane</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEFT_PANE_OPERATION_COUNT = VIEW_CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dc.javafx.xcore.workbench.impl.RightPaneImpl <em>Right Pane</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.javafx.xcore.workbench.impl.RightPaneImpl
	 * @see de.dc.javafx.xcore.workbench.impl.WorkbenchPackageImpl#getRightPane()
	 * @generated
	 */
	int RIGHT_PANE = 11;

	/**
	 * The feature id for the '<em><b>Views</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_PANE__VIEWS = VIEW_CONTAINER__VIEWS;

	/**
	 * The number of structural features of the '<em>Right Pane</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_PANE_FEATURE_COUNT = VIEW_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Right Pane</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_PANE_OPERATION_COUNT = VIEW_CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dc.javafx.xcore.workbench.impl.BottomPaneImpl <em>Bottom Pane</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.javafx.xcore.workbench.impl.BottomPaneImpl
	 * @see de.dc.javafx.xcore.workbench.impl.WorkbenchPackageImpl#getBottomPane()
	 * @generated
	 */
	int BOTTOM_PANE = 12;

	/**
	 * The feature id for the '<em><b>Views</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOTTOM_PANE__VIEWS = VIEW_CONTAINER__VIEWS;

	/**
	 * The number of structural features of the '<em>Bottom Pane</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOTTOM_PANE_FEATURE_COUNT = VIEW_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Bottom Pane</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOTTOM_PANE_OPERATION_COUNT = VIEW_CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dc.javafx.xcore.workbench.impl.ToolbarImpl <em>Toolbar</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.javafx.xcore.workbench.impl.ToolbarImpl
	 * @see de.dc.javafx.xcore.workbench.impl.WorkbenchPackageImpl#getToolbar()
	 * @generated
	 */
	int TOOLBAR = 13;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOLBAR__ID = NAMED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOLBAR__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOLBAR__ITEMS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Toolbar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOLBAR_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Toolbar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOLBAR_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dc.javafx.xcore.workbench.impl.ToolbarItemImpl <em>Toolbar Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.javafx.xcore.workbench.impl.ToolbarItemImpl
	 * @see de.dc.javafx.xcore.workbench.impl.WorkbenchPackageImpl#getToolbarItem()
	 * @generated
	 */
	int TOOLBAR_ITEM = 14;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOLBAR_ITEM__ID = NAMED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOLBAR_ITEM__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>On Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOLBAR_ITEM__ON_ACTION = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOLBAR_ITEM__ICON = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Command</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOLBAR_ITEM__COMMAND = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Toolbar Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOLBAR_ITEM_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Toolbar Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOLBAR_ITEM_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dc.javafx.xcore.workbench.impl.StatuslineImpl <em>Statusline</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.javafx.xcore.workbench.impl.StatuslineImpl
	 * @see de.dc.javafx.xcore.workbench.impl.WorkbenchPackageImpl#getStatusline()
	 * @generated
	 */
	int STATUSLINE = 15;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUSLINE__ID = NAMED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUSLINE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Statusline</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUSLINE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Statusline</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUSLINE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link de.dc.javafx.xcore.workbench.IActionListener <em>IAction Listener</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IAction Listener</em>'.
	 * @see de.dc.javafx.xcore.workbench.IActionListener
	 * @generated
	 */
	EClass getIActionListener();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.javafx.xcore.workbench.IActionListener#getOnAction <em>On Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>On Action</em>'.
	 * @see de.dc.javafx.xcore.workbench.IActionListener#getOnAction()
	 * @see #getIActionListener()
	 * @generated
	 */
	EAttribute getIActionListener_OnAction();

	/**
	 * Returns the meta object for class '{@link de.dc.javafx.xcore.workbench.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see de.dc.javafx.xcore.workbench.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.javafx.xcore.workbench.NamedElement#get_Id <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see de.dc.javafx.xcore.workbench.NamedElement#get_Id()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement__Id();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.javafx.xcore.workbench.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.dc.javafx.xcore.workbench.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link de.dc.javafx.xcore.workbench.Workbench <em>Workbench</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Workbench</em>'.
	 * @see de.dc.javafx.xcore.workbench.Workbench
	 * @generated
	 */
	EClass getWorkbench();

	/**
	 * Returns the meta object for the containment reference '{@link de.dc.javafx.xcore.workbench.Workbench#getToolbar <em>Toolbar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Toolbar</em>'.
	 * @see de.dc.javafx.xcore.workbench.Workbench#getToolbar()
	 * @see #getWorkbench()
	 * @generated
	 */
	EReference getWorkbench_Toolbar();

	/**
	 * Returns the meta object for the containment reference '{@link de.dc.javafx.xcore.workbench.Workbench#getStatusline <em>Statusline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Statusline</em>'.
	 * @see de.dc.javafx.xcore.workbench.Workbench#getStatusline()
	 * @see #getWorkbench()
	 * @generated
	 */
	EReference getWorkbench_Statusline();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dc.javafx.xcore.workbench.Workbench#getPerspectives <em>Perspectives</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Perspectives</em>'.
	 * @see de.dc.javafx.xcore.workbench.Workbench#getPerspectives()
	 * @see #getWorkbench()
	 * @generated
	 */
	EReference getWorkbench_Perspectives();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dc.javafx.xcore.workbench.Workbench#getCommands <em>Commands</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Commands</em>'.
	 * @see de.dc.javafx.xcore.workbench.Workbench#getCommands()
	 * @see #getWorkbench()
	 * @generated
	 */
	EReference getWorkbench_Commands();

	/**
	 * Returns the meta object for the containment reference '{@link de.dc.javafx.xcore.workbench.Workbench#getEditorRegistry <em>Editor Registry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Editor Registry</em>'.
	 * @see de.dc.javafx.xcore.workbench.Workbench#getEditorRegistry()
	 * @see #getWorkbench()
	 * @generated
	 */
	EReference getWorkbench_EditorRegistry();

	/**
	 * Returns the meta object for class '{@link de.dc.javafx.xcore.workbench.EditorRegistry <em>Editor Registry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Editor Registry</em>'.
	 * @see de.dc.javafx.xcore.workbench.EditorRegistry
	 * @generated
	 */
	EClass getEditorRegistry();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dc.javafx.xcore.workbench.EditorRegistry#getEditor <em>Editor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Editor</em>'.
	 * @see de.dc.javafx.xcore.workbench.EditorRegistry#getEditor()
	 * @see #getEditorRegistry()
	 * @generated
	 */
	EReference getEditorRegistry_Editor();

	/**
	 * Returns the meta object for class '{@link de.dc.javafx.xcore.workbench.Editor <em>Editor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Editor</em>'.
	 * @see de.dc.javafx.xcore.workbench.Editor
	 * @generated
	 */
	EClass getEditor();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.javafx.xcore.workbench.Editor#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.dc.javafx.xcore.workbench.Editor#getName()
	 * @see #getEditor()
	 * @generated
	 */
	EAttribute getEditor_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.javafx.xcore.workbench.Editor#getFileExtension <em>File Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>File Extension</em>'.
	 * @see de.dc.javafx.xcore.workbench.Editor#getFileExtension()
	 * @see #getEditor()
	 * @generated
	 */
	EAttribute getEditor_FileExtension();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.javafx.xcore.workbench.Editor#getEditorUri <em>Editor Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Editor Uri</em>'.
	 * @see de.dc.javafx.xcore.workbench.Editor#getEditorUri()
	 * @see #getEditor()
	 * @generated
	 */
	EAttribute getEditor_EditorUri();

	/**
	 * Returns the meta object for class '{@link de.dc.javafx.xcore.workbench.Perspective <em>Perspective</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Perspective</em>'.
	 * @see de.dc.javafx.xcore.workbench.Perspective
	 * @generated
	 */
	EClass getPerspective();

	/**
	 * Returns the meta object for the containment reference '{@link de.dc.javafx.xcore.workbench.Perspective#getLeftPane <em>Left Pane</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left Pane</em>'.
	 * @see de.dc.javafx.xcore.workbench.Perspective#getLeftPane()
	 * @see #getPerspective()
	 * @generated
	 */
	EReference getPerspective_LeftPane();

	/**
	 * Returns the meta object for the containment reference '{@link de.dc.javafx.xcore.workbench.Perspective#getRightPane <em>Right Pane</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right Pane</em>'.
	 * @see de.dc.javafx.xcore.workbench.Perspective#getRightPane()
	 * @see #getPerspective()
	 * @generated
	 */
	EReference getPerspective_RightPane();

	/**
	 * Returns the meta object for the containment reference '{@link de.dc.javafx.xcore.workbench.Perspective#getBottomPane <em>Bottom Pane</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bottom Pane</em>'.
	 * @see de.dc.javafx.xcore.workbench.Perspective#getBottomPane()
	 * @see #getPerspective()
	 * @generated
	 */
	EReference getPerspective_BottomPane();

	/**
	 * Returns the meta object for the containment reference '{@link de.dc.javafx.xcore.workbench.Perspective#getEditorArea <em>Editor Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Editor Area</em>'.
	 * @see de.dc.javafx.xcore.workbench.Perspective#getEditorArea()
	 * @see #getPerspective()
	 * @generated
	 */
	EReference getPerspective_EditorArea();

	/**
	 * Returns the meta object for class '{@link de.dc.javafx.xcore.workbench.Command <em>Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Command</em>'.
	 * @see de.dc.javafx.xcore.workbench.Command
	 * @generated
	 */
	EClass getCommand();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.javafx.xcore.workbench.Command#getCommandClass <em>Command Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Command Class</em>'.
	 * @see de.dc.javafx.xcore.workbench.Command#getCommandClass()
	 * @see #getCommand()
	 * @generated
	 */
	EAttribute getCommand_CommandClass();

	/**
	 * Returns the meta object for class '{@link de.dc.javafx.xcore.workbench.ViewContainer <em>View Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>View Container</em>'.
	 * @see de.dc.javafx.xcore.workbench.ViewContainer
	 * @generated
	 */
	EClass getViewContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dc.javafx.xcore.workbench.ViewContainer#getViews <em>Views</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Views</em>'.
	 * @see de.dc.javafx.xcore.workbench.ViewContainer#getViews()
	 * @see #getViewContainer()
	 * @generated
	 */
	EReference getViewContainer_Views();

	/**
	 * Returns the meta object for class '{@link de.dc.javafx.xcore.workbench.View <em>View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>View</em>'.
	 * @see de.dc.javafx.xcore.workbench.View
	 * @generated
	 */
	EClass getView();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.javafx.xcore.workbench.View#getViewClass <em>View Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>View Class</em>'.
	 * @see de.dc.javafx.xcore.workbench.View#getViewClass()
	 * @see #getView()
	 * @generated
	 */
	EAttribute getView_ViewClass();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.javafx.xcore.workbench.View#getIcon <em>Icon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Icon</em>'.
	 * @see de.dc.javafx.xcore.workbench.View#getIcon()
	 * @see #getView()
	 * @generated
	 */
	EAttribute getView_Icon();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.javafx.xcore.workbench.View#isIsClosable <em>Is Closable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Closable</em>'.
	 * @see de.dc.javafx.xcore.workbench.View#isIsClosable()
	 * @see #getView()
	 * @generated
	 */
	EAttribute getView_IsClosable();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.javafx.xcore.workbench.View#isRegistrateChangeListener <em>Registrate Change Listener</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Registrate Change Listener</em>'.
	 * @see de.dc.javafx.xcore.workbench.View#isRegistrateChangeListener()
	 * @see #getView()
	 * @generated
	 */
	EAttribute getView_RegistrateChangeListener();

	/**
	 * Returns the meta object for class '{@link de.dc.javafx.xcore.workbench.EditorArea <em>Editor Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Editor Area</em>'.
	 * @see de.dc.javafx.xcore.workbench.EditorArea
	 * @generated
	 */
	EClass getEditorArea();

	/**
	 * Returns the meta object for class '{@link de.dc.javafx.xcore.workbench.LeftPane <em>Left Pane</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Left Pane</em>'.
	 * @see de.dc.javafx.xcore.workbench.LeftPane
	 * @generated
	 */
	EClass getLeftPane();

	/**
	 * Returns the meta object for class '{@link de.dc.javafx.xcore.workbench.RightPane <em>Right Pane</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Right Pane</em>'.
	 * @see de.dc.javafx.xcore.workbench.RightPane
	 * @generated
	 */
	EClass getRightPane();

	/**
	 * Returns the meta object for class '{@link de.dc.javafx.xcore.workbench.BottomPane <em>Bottom Pane</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bottom Pane</em>'.
	 * @see de.dc.javafx.xcore.workbench.BottomPane
	 * @generated
	 */
	EClass getBottomPane();

	/**
	 * Returns the meta object for class '{@link de.dc.javafx.xcore.workbench.Toolbar <em>Toolbar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Toolbar</em>'.
	 * @see de.dc.javafx.xcore.workbench.Toolbar
	 * @generated
	 */
	EClass getToolbar();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dc.javafx.xcore.workbench.Toolbar#getItems <em>Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Items</em>'.
	 * @see de.dc.javafx.xcore.workbench.Toolbar#getItems()
	 * @see #getToolbar()
	 * @generated
	 */
	EReference getToolbar_Items();

	/**
	 * Returns the meta object for class '{@link de.dc.javafx.xcore.workbench.ToolbarItem <em>Toolbar Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Toolbar Item</em>'.
	 * @see de.dc.javafx.xcore.workbench.ToolbarItem
	 * @generated
	 */
	EClass getToolbarItem();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.javafx.xcore.workbench.ToolbarItem#getIcon <em>Icon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Icon</em>'.
	 * @see de.dc.javafx.xcore.workbench.ToolbarItem#getIcon()
	 * @see #getToolbarItem()
	 * @generated
	 */
	EAttribute getToolbarItem_Icon();

	/**
	 * Returns the meta object for the reference '{@link de.dc.javafx.xcore.workbench.ToolbarItem#getCommand <em>Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Command</em>'.
	 * @see de.dc.javafx.xcore.workbench.ToolbarItem#getCommand()
	 * @see #getToolbarItem()
	 * @generated
	 */
	EReference getToolbarItem_Command();

	/**
	 * Returns the meta object for class '{@link de.dc.javafx.xcore.workbench.Statusline <em>Statusline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Statusline</em>'.
	 * @see de.dc.javafx.xcore.workbench.Statusline
	 * @generated
	 */
	EClass getStatusline();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	WorkbenchFactory getWorkbenchFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link de.dc.javafx.xcore.workbench.impl.IActionListenerImpl <em>IAction Listener</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.javafx.xcore.workbench.impl.IActionListenerImpl
		 * @see de.dc.javafx.xcore.workbench.impl.WorkbenchPackageImpl#getIActionListener()
		 * @generated
		 */
		EClass IACTION_LISTENER = eINSTANCE.getIActionListener();

		/**
		 * The meta object literal for the '<em><b>On Action</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IACTION_LISTENER__ON_ACTION = eINSTANCE.getIActionListener_OnAction();

		/**
		 * The meta object literal for the '{@link de.dc.javafx.xcore.workbench.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.javafx.xcore.workbench.impl.NamedElementImpl
		 * @see de.dc.javafx.xcore.workbench.impl.WorkbenchPackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__ID = eINSTANCE.getNamedElement__Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '{@link de.dc.javafx.xcore.workbench.impl.WorkbenchImpl <em>Workbench</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.javafx.xcore.workbench.impl.WorkbenchImpl
		 * @see de.dc.javafx.xcore.workbench.impl.WorkbenchPackageImpl#getWorkbench()
		 * @generated
		 */
		EClass WORKBENCH = eINSTANCE.getWorkbench();

		/**
		 * The meta object literal for the '<em><b>Toolbar</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKBENCH__TOOLBAR = eINSTANCE.getWorkbench_Toolbar();

		/**
		 * The meta object literal for the '<em><b>Statusline</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKBENCH__STATUSLINE = eINSTANCE.getWorkbench_Statusline();

		/**
		 * The meta object literal for the '<em><b>Perspectives</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKBENCH__PERSPECTIVES = eINSTANCE.getWorkbench_Perspectives();

		/**
		 * The meta object literal for the '<em><b>Commands</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKBENCH__COMMANDS = eINSTANCE.getWorkbench_Commands();

		/**
		 * The meta object literal for the '<em><b>Editor Registry</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKBENCH__EDITOR_REGISTRY = eINSTANCE.getWorkbench_EditorRegistry();

		/**
		 * The meta object literal for the '{@link de.dc.javafx.xcore.workbench.impl.EditorRegistryImpl <em>Editor Registry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.javafx.xcore.workbench.impl.EditorRegistryImpl
		 * @see de.dc.javafx.xcore.workbench.impl.WorkbenchPackageImpl#getEditorRegistry()
		 * @generated
		 */
		EClass EDITOR_REGISTRY = eINSTANCE.getEditorRegistry();

		/**
		 * The meta object literal for the '<em><b>Editor</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDITOR_REGISTRY__EDITOR = eINSTANCE.getEditorRegistry_Editor();

		/**
		 * The meta object literal for the '{@link de.dc.javafx.xcore.workbench.impl.EditorImpl <em>Editor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.javafx.xcore.workbench.impl.EditorImpl
		 * @see de.dc.javafx.xcore.workbench.impl.WorkbenchPackageImpl#getEditor()
		 * @generated
		 */
		EClass EDITOR = eINSTANCE.getEditor();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EDITOR__NAME = eINSTANCE.getEditor_Name();

		/**
		 * The meta object literal for the '<em><b>File Extension</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EDITOR__FILE_EXTENSION = eINSTANCE.getEditor_FileExtension();

		/**
		 * The meta object literal for the '<em><b>Editor Uri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EDITOR__EDITOR_URI = eINSTANCE.getEditor_EditorUri();

		/**
		 * The meta object literal for the '{@link de.dc.javafx.xcore.workbench.impl.PerspectiveImpl <em>Perspective</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.javafx.xcore.workbench.impl.PerspectiveImpl
		 * @see de.dc.javafx.xcore.workbench.impl.WorkbenchPackageImpl#getPerspective()
		 * @generated
		 */
		EClass PERSPECTIVE = eINSTANCE.getPerspective();

		/**
		 * The meta object literal for the '<em><b>Left Pane</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSPECTIVE__LEFT_PANE = eINSTANCE.getPerspective_LeftPane();

		/**
		 * The meta object literal for the '<em><b>Right Pane</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSPECTIVE__RIGHT_PANE = eINSTANCE.getPerspective_RightPane();

		/**
		 * The meta object literal for the '<em><b>Bottom Pane</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSPECTIVE__BOTTOM_PANE = eINSTANCE.getPerspective_BottomPane();

		/**
		 * The meta object literal for the '<em><b>Editor Area</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSPECTIVE__EDITOR_AREA = eINSTANCE.getPerspective_EditorArea();

		/**
		 * The meta object literal for the '{@link de.dc.javafx.xcore.workbench.impl.CommandImpl <em>Command</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.javafx.xcore.workbench.impl.CommandImpl
		 * @see de.dc.javafx.xcore.workbench.impl.WorkbenchPackageImpl#getCommand()
		 * @generated
		 */
		EClass COMMAND = eINSTANCE.getCommand();

		/**
		 * The meta object literal for the '<em><b>Command Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMAND__COMMAND_CLASS = eINSTANCE.getCommand_CommandClass();

		/**
		 * The meta object literal for the '{@link de.dc.javafx.xcore.workbench.impl.ViewContainerImpl <em>View Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.javafx.xcore.workbench.impl.ViewContainerImpl
		 * @see de.dc.javafx.xcore.workbench.impl.WorkbenchPackageImpl#getViewContainer()
		 * @generated
		 */
		EClass VIEW_CONTAINER = eINSTANCE.getViewContainer();

		/**
		 * The meta object literal for the '<em><b>Views</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIEW_CONTAINER__VIEWS = eINSTANCE.getViewContainer_Views();

		/**
		 * The meta object literal for the '{@link de.dc.javafx.xcore.workbench.impl.ViewImpl <em>View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.javafx.xcore.workbench.impl.ViewImpl
		 * @see de.dc.javafx.xcore.workbench.impl.WorkbenchPackageImpl#getView()
		 * @generated
		 */
		EClass VIEW = eINSTANCE.getView();

		/**
		 * The meta object literal for the '<em><b>View Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIEW__VIEW_CLASS = eINSTANCE.getView_ViewClass();

		/**
		 * The meta object literal for the '<em><b>Icon</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIEW__ICON = eINSTANCE.getView_Icon();

		/**
		 * The meta object literal for the '<em><b>Is Closable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIEW__IS_CLOSABLE = eINSTANCE.getView_IsClosable();

		/**
		 * The meta object literal for the '<em><b>Registrate Change Listener</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIEW__REGISTRATE_CHANGE_LISTENER = eINSTANCE.getView_RegistrateChangeListener();

		/**
		 * The meta object literal for the '{@link de.dc.javafx.xcore.workbench.impl.EditorAreaImpl <em>Editor Area</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.javafx.xcore.workbench.impl.EditorAreaImpl
		 * @see de.dc.javafx.xcore.workbench.impl.WorkbenchPackageImpl#getEditorArea()
		 * @generated
		 */
		EClass EDITOR_AREA = eINSTANCE.getEditorArea();

		/**
		 * The meta object literal for the '{@link de.dc.javafx.xcore.workbench.impl.LeftPaneImpl <em>Left Pane</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.javafx.xcore.workbench.impl.LeftPaneImpl
		 * @see de.dc.javafx.xcore.workbench.impl.WorkbenchPackageImpl#getLeftPane()
		 * @generated
		 */
		EClass LEFT_PANE = eINSTANCE.getLeftPane();

		/**
		 * The meta object literal for the '{@link de.dc.javafx.xcore.workbench.impl.RightPaneImpl <em>Right Pane</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.javafx.xcore.workbench.impl.RightPaneImpl
		 * @see de.dc.javafx.xcore.workbench.impl.WorkbenchPackageImpl#getRightPane()
		 * @generated
		 */
		EClass RIGHT_PANE = eINSTANCE.getRightPane();

		/**
		 * The meta object literal for the '{@link de.dc.javafx.xcore.workbench.impl.BottomPaneImpl <em>Bottom Pane</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.javafx.xcore.workbench.impl.BottomPaneImpl
		 * @see de.dc.javafx.xcore.workbench.impl.WorkbenchPackageImpl#getBottomPane()
		 * @generated
		 */
		EClass BOTTOM_PANE = eINSTANCE.getBottomPane();

		/**
		 * The meta object literal for the '{@link de.dc.javafx.xcore.workbench.impl.ToolbarImpl <em>Toolbar</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.javafx.xcore.workbench.impl.ToolbarImpl
		 * @see de.dc.javafx.xcore.workbench.impl.WorkbenchPackageImpl#getToolbar()
		 * @generated
		 */
		EClass TOOLBAR = eINSTANCE.getToolbar();

		/**
		 * The meta object literal for the '<em><b>Items</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOOLBAR__ITEMS = eINSTANCE.getToolbar_Items();

		/**
		 * The meta object literal for the '{@link de.dc.javafx.xcore.workbench.impl.ToolbarItemImpl <em>Toolbar Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.javafx.xcore.workbench.impl.ToolbarItemImpl
		 * @see de.dc.javafx.xcore.workbench.impl.WorkbenchPackageImpl#getToolbarItem()
		 * @generated
		 */
		EClass TOOLBAR_ITEM = eINSTANCE.getToolbarItem();

		/**
		 * The meta object literal for the '<em><b>Icon</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOOLBAR_ITEM__ICON = eINSTANCE.getToolbarItem_Icon();

		/**
		 * The meta object literal for the '<em><b>Command</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOOLBAR_ITEM__COMMAND = eINSTANCE.getToolbarItem_Command();

		/**
		 * The meta object literal for the '{@link de.dc.javafx.xcore.workbench.impl.StatuslineImpl <em>Statusline</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.javafx.xcore.workbench.impl.StatuslineImpl
		 * @see de.dc.javafx.xcore.workbench.impl.WorkbenchPackageImpl#getStatusline()
		 * @generated
		 */
		EClass STATUSLINE = eINSTANCE.getStatusline();

	}

} //WorkbenchPackage
