/**
 */
package de.dc.javafx.xcore.workbench.extensions;

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
 * @see de.dc.javafx.xcore.workbench.extensions.ExtensionsFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel multipleEditorPages='false' creationIcons='false' editDirectory='/de.dc.javafx.xcore.workbench.extension.edit/src-gen' editorDirectory='/de.dc.javafx.xcore.workbench.extension.editor/src-gen' richClientPlatform='true' codeFormatting='true' importerID='org.eclipse.emf.importer.ecore' runtimePlatform='RCP' fileExtensions='extension' basePackage='de.dc.javafx.xcore.workbench'"
 * @generated
 */
public interface ExtensionsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "extensions";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.frateranatis.org/workbench/extensions";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "extensions";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ExtensionsPackage eINSTANCE = de.dc.javafx.xcore.workbench.extensions.impl.ExtensionsPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.dc.javafx.xcore.workbench.extensions.impl.ExtensionManagerImpl <em>Extension Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.javafx.xcore.workbench.extensions.impl.ExtensionManagerImpl
	 * @see de.dc.javafx.xcore.workbench.extensions.impl.ExtensionsPackageImpl#getExtensionManager()
	 * @generated
	 */
	int EXTENSION_MANAGER = 0;

	/**
	 * The feature id for the '<em><b>Extension Points</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_MANAGER__EXTENSION_POINTS = 0;

	/**
	 * The number of structural features of the '<em>Extension Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_MANAGER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Extension Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_MANAGER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dc.javafx.xcore.workbench.extensions.impl.ExtensionImpl <em>Extension</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.javafx.xcore.workbench.extensions.impl.ExtensionImpl
	 * @see de.dc.javafx.xcore.workbench.extensions.impl.ExtensionsPackageImpl#getExtension()
	 * @generated
	 */
	int EXTENSION = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION__NAME = 1;

	/**
	 * The feature id for the '<em><b>Extension Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION__EXTENSION_URI = 2;

	/**
	 * The number of structural features of the '<em>Extension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Extension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dc.javafx.xcore.workbench.extensions.impl.ExtensionPointImpl <em>Extension Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.javafx.xcore.workbench.extensions.impl.ExtensionPointImpl
	 * @see de.dc.javafx.xcore.workbench.extensions.impl.ExtensionsPackageImpl#getExtensionPoint()
	 * @generated
	 */
	int EXTENSION_POINT = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_POINT__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_POINT__NAME = 1;

	/**
	 * The number of structural features of the '<em>Extension Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_POINT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Extension Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_POINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dc.javafx.xcore.workbench.extensions.impl.ViewExtensionImpl <em>View Extension</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.javafx.xcore.workbench.extensions.impl.ViewExtensionImpl
	 * @see de.dc.javafx.xcore.workbench.extensions.impl.ExtensionsPackageImpl#getViewExtension()
	 * @generated
	 */
	int VIEW_EXTENSION = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_EXTENSION__ID = EXTENSION_POINT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_EXTENSION__NAME = EXTENSION_POINT__NAME;

	/**
	 * The feature id for the '<em><b>Views</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_EXTENSION__VIEWS = EXTENSION_POINT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>View Extension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_EXTENSION_FEATURE_COUNT = EXTENSION_POINT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>View Extension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_EXTENSION_OPERATION_COUNT = EXTENSION_POINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dc.javafx.xcore.workbench.extensions.impl.EditorExtensionImpl <em>Editor Extension</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.javafx.xcore.workbench.extensions.impl.EditorExtensionImpl
	 * @see de.dc.javafx.xcore.workbench.extensions.impl.ExtensionsPackageImpl#getEditorExtension()
	 * @generated
	 */
	int EDITOR_EXTENSION = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDITOR_EXTENSION__ID = EXTENSION_POINT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDITOR_EXTENSION__NAME = EXTENSION_POINT__NAME;

	/**
	 * The feature id for the '<em><b>Editors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDITOR_EXTENSION__EDITORS = EXTENSION_POINT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Editor Extension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDITOR_EXTENSION_FEATURE_COUNT = EXTENSION_POINT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Editor Extension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDITOR_EXTENSION_OPERATION_COUNT = EXTENSION_POINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dc.javafx.xcore.workbench.extensions.impl.MenuExtensionImpl <em>Menu Extension</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.javafx.xcore.workbench.extensions.impl.MenuExtensionImpl
	 * @see de.dc.javafx.xcore.workbench.extensions.impl.ExtensionsPackageImpl#getMenuExtension()
	 * @generated
	 */
	int MENU_EXTENSION = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_EXTENSION__ID = EXTENSION_POINT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_EXTENSION__NAME = EXTENSION_POINT__NAME;

	/**
	 * The number of structural features of the '<em>Menu Extension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_EXTENSION_FEATURE_COUNT = EXTENSION_POINT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Menu Extension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_EXTENSION_OPERATION_COUNT = EXTENSION_POINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dc.javafx.xcore.workbench.extensions.impl.ToolbarExtensionImpl <em>Toolbar Extension</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.javafx.xcore.workbench.extensions.impl.ToolbarExtensionImpl
	 * @see de.dc.javafx.xcore.workbench.extensions.impl.ExtensionsPackageImpl#getToolbarExtension()
	 * @generated
	 */
	int TOOLBAR_EXTENSION = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOLBAR_EXTENSION__ID = EXTENSION_POINT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOLBAR_EXTENSION__NAME = EXTENSION_POINT__NAME;

	/**
	 * The number of structural features of the '<em>Toolbar Extension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOLBAR_EXTENSION_FEATURE_COUNT = EXTENSION_POINT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Toolbar Extension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOLBAR_EXTENSION_OPERATION_COUNT = EXTENSION_POINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dc.javafx.xcore.workbench.extensions.impl.PerspectiveExtensionImpl <em>Perspective Extension</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.javafx.xcore.workbench.extensions.impl.PerspectiveExtensionImpl
	 * @see de.dc.javafx.xcore.workbench.extensions.impl.ExtensionsPackageImpl#getPerspectiveExtension()
	 * @generated
	 */
	int PERSPECTIVE_EXTENSION = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSPECTIVE_EXTENSION__ID = EXTENSION_POINT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSPECTIVE_EXTENSION__NAME = EXTENSION_POINT__NAME;

	/**
	 * The feature id for the '<em><b>Perspectives</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSPECTIVE_EXTENSION__PERSPECTIVES = EXTENSION_POINT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Perspective Extension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSPECTIVE_EXTENSION_FEATURE_COUNT = EXTENSION_POINT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Perspective Extension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSPECTIVE_EXTENSION_OPERATION_COUNT = EXTENSION_POINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dc.javafx.xcore.workbench.extensions.impl.ViewImpl <em>View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.javafx.xcore.workbench.extensions.impl.ViewImpl
	 * @see de.dc.javafx.xcore.workbench.extensions.impl.ExtensionsPackageImpl#getView()
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
	int VIEW__ID = EXTENSION__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__NAME = EXTENSION__NAME;

	/**
	 * The feature id for the '<em><b>Extension Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__EXTENSION_URI = EXTENSION__EXTENSION_URI;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__ICON = EXTENSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_FEATURE_COUNT = EXTENSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_OPERATION_COUNT = EXTENSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dc.javafx.xcore.workbench.extensions.impl.EditorImpl <em>Editor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.javafx.xcore.workbench.extensions.impl.EditorImpl
	 * @see de.dc.javafx.xcore.workbench.extensions.impl.ExtensionsPackageImpl#getEditor()
	 * @generated
	 */
	int EDITOR = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDITOR__ID = EXTENSION__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDITOR__NAME = EXTENSION__NAME;

	/**
	 * The feature id for the '<em><b>Extension Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDITOR__EXTENSION_URI = EXTENSION__EXTENSION_URI;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDITOR__ICON = EXTENSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>File Extension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDITOR__FILE_EXTENSION = EXTENSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Editor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDITOR_FEATURE_COUNT = EXTENSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Editor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDITOR_OPERATION_COUNT = EXTENSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dc.javafx.xcore.workbench.extensions.impl.PerspectiveImpl <em>Perspective</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.javafx.xcore.workbench.extensions.impl.PerspectiveImpl
	 * @see de.dc.javafx.xcore.workbench.extensions.impl.ExtensionsPackageImpl#getPerspective()
	 * @generated
	 */
	int PERSPECTIVE = 10;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSPECTIVE__ID = EXTENSION__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSPECTIVE__NAME = EXTENSION__NAME;

	/**
	 * The feature id for the '<em><b>Extension Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSPECTIVE__EXTENSION_URI = EXTENSION__EXTENSION_URI;

	/**
	 * The feature id for the '<em><b>Left</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSPECTIVE__LEFT = EXTENSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSPECTIVE__RIGHT = EXTENSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Bottom</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSPECTIVE__BOTTOM = EXTENSION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Editor Area</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSPECTIVE__EDITOR_AREA = EXTENSION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Perspective</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSPECTIVE_FEATURE_COUNT = EXTENSION_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Perspective</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSPECTIVE_OPERATION_COUNT = EXTENSION_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link de.dc.javafx.xcore.workbench.extensions.ExtensionManager <em>Extension Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Extension Manager</em>'.
	 * @see de.dc.javafx.xcore.workbench.extensions.ExtensionManager
	 * @generated
	 */
	EClass getExtensionManager();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dc.javafx.xcore.workbench.extensions.ExtensionManager#getExtensionPoints <em>Extension Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Extension Points</em>'.
	 * @see de.dc.javafx.xcore.workbench.extensions.ExtensionManager#getExtensionPoints()
	 * @see #getExtensionManager()
	 * @generated
	 */
	EReference getExtensionManager_ExtensionPoints();

	/**
	 * Returns the meta object for class '{@link de.dc.javafx.xcore.workbench.extensions.Extension <em>Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Extension</em>'.
	 * @see de.dc.javafx.xcore.workbench.extensions.Extension
	 * @generated
	 */
	EClass getExtension();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.javafx.xcore.workbench.extensions.Extension#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see de.dc.javafx.xcore.workbench.extensions.Extension#getId()
	 * @see #getExtension()
	 * @generated
	 */
	EAttribute getExtension_Id();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.javafx.xcore.workbench.extensions.Extension#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.dc.javafx.xcore.workbench.extensions.Extension#getName()
	 * @see #getExtension()
	 * @generated
	 */
	EAttribute getExtension_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.javafx.xcore.workbench.extensions.Extension#getExtensionUri <em>Extension Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Extension Uri</em>'.
	 * @see de.dc.javafx.xcore.workbench.extensions.Extension#getExtensionUri()
	 * @see #getExtension()
	 * @generated
	 */
	EAttribute getExtension_ExtensionUri();

	/**
	 * Returns the meta object for class '{@link de.dc.javafx.xcore.workbench.extensions.ExtensionPoint <em>Extension Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Extension Point</em>'.
	 * @see de.dc.javafx.xcore.workbench.extensions.ExtensionPoint
	 * @generated
	 */
	EClass getExtensionPoint();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.javafx.xcore.workbench.extensions.ExtensionPoint#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see de.dc.javafx.xcore.workbench.extensions.ExtensionPoint#getId()
	 * @see #getExtensionPoint()
	 * @generated
	 */
	EAttribute getExtensionPoint_Id();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.javafx.xcore.workbench.extensions.ExtensionPoint#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.dc.javafx.xcore.workbench.extensions.ExtensionPoint#getName()
	 * @see #getExtensionPoint()
	 * @generated
	 */
	EAttribute getExtensionPoint_Name();

	/**
	 * Returns the meta object for class '{@link de.dc.javafx.xcore.workbench.extensions.ViewExtension <em>View Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>View Extension</em>'.
	 * @see de.dc.javafx.xcore.workbench.extensions.ViewExtension
	 * @generated
	 */
	EClass getViewExtension();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dc.javafx.xcore.workbench.extensions.ViewExtension#getViews <em>Views</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Views</em>'.
	 * @see de.dc.javafx.xcore.workbench.extensions.ViewExtension#getViews()
	 * @see #getViewExtension()
	 * @generated
	 */
	EReference getViewExtension_Views();

	/**
	 * Returns the meta object for class '{@link de.dc.javafx.xcore.workbench.extensions.EditorExtension <em>Editor Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Editor Extension</em>'.
	 * @see de.dc.javafx.xcore.workbench.extensions.EditorExtension
	 * @generated
	 */
	EClass getEditorExtension();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dc.javafx.xcore.workbench.extensions.EditorExtension#getEditors <em>Editors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Editors</em>'.
	 * @see de.dc.javafx.xcore.workbench.extensions.EditorExtension#getEditors()
	 * @see #getEditorExtension()
	 * @generated
	 */
	EReference getEditorExtension_Editors();

	/**
	 * Returns the meta object for class '{@link de.dc.javafx.xcore.workbench.extensions.MenuExtension <em>Menu Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Menu Extension</em>'.
	 * @see de.dc.javafx.xcore.workbench.extensions.MenuExtension
	 * @generated
	 */
	EClass getMenuExtension();

	/**
	 * Returns the meta object for class '{@link de.dc.javafx.xcore.workbench.extensions.ToolbarExtension <em>Toolbar Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Toolbar Extension</em>'.
	 * @see de.dc.javafx.xcore.workbench.extensions.ToolbarExtension
	 * @generated
	 */
	EClass getToolbarExtension();

	/**
	 * Returns the meta object for class '{@link de.dc.javafx.xcore.workbench.extensions.PerspectiveExtension <em>Perspective Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Perspective Extension</em>'.
	 * @see de.dc.javafx.xcore.workbench.extensions.PerspectiveExtension
	 * @generated
	 */
	EClass getPerspectiveExtension();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dc.javafx.xcore.workbench.extensions.PerspectiveExtension#getPerspectives <em>Perspectives</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Perspectives</em>'.
	 * @see de.dc.javafx.xcore.workbench.extensions.PerspectiveExtension#getPerspectives()
	 * @see #getPerspectiveExtension()
	 * @generated
	 */
	EReference getPerspectiveExtension_Perspectives();

	/**
	 * Returns the meta object for class '{@link de.dc.javafx.xcore.workbench.extensions.View <em>View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>View</em>'.
	 * @see de.dc.javafx.xcore.workbench.extensions.View
	 * @generated
	 */
	EClass getView();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.javafx.xcore.workbench.extensions.View#getIcon <em>Icon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Icon</em>'.
	 * @see de.dc.javafx.xcore.workbench.extensions.View#getIcon()
	 * @see #getView()
	 * @generated
	 */
	EAttribute getView_Icon();

	/**
	 * Returns the meta object for class '{@link de.dc.javafx.xcore.workbench.extensions.Editor <em>Editor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Editor</em>'.
	 * @see de.dc.javafx.xcore.workbench.extensions.Editor
	 * @generated
	 */
	EClass getEditor();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.javafx.xcore.workbench.extensions.Editor#getIcon <em>Icon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Icon</em>'.
	 * @see de.dc.javafx.xcore.workbench.extensions.Editor#getIcon()
	 * @see #getEditor()
	 * @generated
	 */
	EAttribute getEditor_Icon();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.javafx.xcore.workbench.extensions.Editor#getFileExtension <em>File Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>File Extension</em>'.
	 * @see de.dc.javafx.xcore.workbench.extensions.Editor#getFileExtension()
	 * @see #getEditor()
	 * @generated
	 */
	EAttribute getEditor_FileExtension();

	/**
	 * Returns the meta object for class '{@link de.dc.javafx.xcore.workbench.extensions.Perspective <em>Perspective</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Perspective</em>'.
	 * @see de.dc.javafx.xcore.workbench.extensions.Perspective
	 * @generated
	 */
	EClass getPerspective();

	/**
	 * Returns the meta object for the reference list '{@link de.dc.javafx.xcore.workbench.extensions.Perspective#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Left</em>'.
	 * @see de.dc.javafx.xcore.workbench.extensions.Perspective#getLeft()
	 * @see #getPerspective()
	 * @generated
	 */
	EReference getPerspective_Left();

	/**
	 * Returns the meta object for the reference list '{@link de.dc.javafx.xcore.workbench.extensions.Perspective#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Right</em>'.
	 * @see de.dc.javafx.xcore.workbench.extensions.Perspective#getRight()
	 * @see #getPerspective()
	 * @generated
	 */
	EReference getPerspective_Right();

	/**
	 * Returns the meta object for the reference list '{@link de.dc.javafx.xcore.workbench.extensions.Perspective#getBottom <em>Bottom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Bottom</em>'.
	 * @see de.dc.javafx.xcore.workbench.extensions.Perspective#getBottom()
	 * @see #getPerspective()
	 * @generated
	 */
	EReference getPerspective_Bottom();

	/**
	 * Returns the meta object for the reference list '{@link de.dc.javafx.xcore.workbench.extensions.Perspective#getEditorArea <em>Editor Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Editor Area</em>'.
	 * @see de.dc.javafx.xcore.workbench.extensions.Perspective#getEditorArea()
	 * @see #getPerspective()
	 * @generated
	 */
	EReference getPerspective_EditorArea();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ExtensionsFactory getExtensionsFactory();

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
		 * The meta object literal for the '{@link de.dc.javafx.xcore.workbench.extensions.impl.ExtensionManagerImpl <em>Extension Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.javafx.xcore.workbench.extensions.impl.ExtensionManagerImpl
		 * @see de.dc.javafx.xcore.workbench.extensions.impl.ExtensionsPackageImpl#getExtensionManager()
		 * @generated
		 */
		EClass EXTENSION_MANAGER = eINSTANCE.getExtensionManager();

		/**
		 * The meta object literal for the '<em><b>Extension Points</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENSION_MANAGER__EXTENSION_POINTS = eINSTANCE.getExtensionManager_ExtensionPoints();

		/**
		 * The meta object literal for the '{@link de.dc.javafx.xcore.workbench.extensions.impl.ExtensionImpl <em>Extension</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.javafx.xcore.workbench.extensions.impl.ExtensionImpl
		 * @see de.dc.javafx.xcore.workbench.extensions.impl.ExtensionsPackageImpl#getExtension()
		 * @generated
		 */
		EClass EXTENSION = eINSTANCE.getExtension();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTENSION__ID = eINSTANCE.getExtension_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTENSION__NAME = eINSTANCE.getExtension_Name();

		/**
		 * The meta object literal for the '<em><b>Extension Uri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTENSION__EXTENSION_URI = eINSTANCE.getExtension_ExtensionUri();

		/**
		 * The meta object literal for the '{@link de.dc.javafx.xcore.workbench.extensions.impl.ExtensionPointImpl <em>Extension Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.javafx.xcore.workbench.extensions.impl.ExtensionPointImpl
		 * @see de.dc.javafx.xcore.workbench.extensions.impl.ExtensionsPackageImpl#getExtensionPoint()
		 * @generated
		 */
		EClass EXTENSION_POINT = eINSTANCE.getExtensionPoint();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTENSION_POINT__ID = eINSTANCE.getExtensionPoint_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTENSION_POINT__NAME = eINSTANCE.getExtensionPoint_Name();

		/**
		 * The meta object literal for the '{@link de.dc.javafx.xcore.workbench.extensions.impl.ViewExtensionImpl <em>View Extension</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.javafx.xcore.workbench.extensions.impl.ViewExtensionImpl
		 * @see de.dc.javafx.xcore.workbench.extensions.impl.ExtensionsPackageImpl#getViewExtension()
		 * @generated
		 */
		EClass VIEW_EXTENSION = eINSTANCE.getViewExtension();

		/**
		 * The meta object literal for the '<em><b>Views</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIEW_EXTENSION__VIEWS = eINSTANCE.getViewExtension_Views();

		/**
		 * The meta object literal for the '{@link de.dc.javafx.xcore.workbench.extensions.impl.EditorExtensionImpl <em>Editor Extension</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.javafx.xcore.workbench.extensions.impl.EditorExtensionImpl
		 * @see de.dc.javafx.xcore.workbench.extensions.impl.ExtensionsPackageImpl#getEditorExtension()
		 * @generated
		 */
		EClass EDITOR_EXTENSION = eINSTANCE.getEditorExtension();

		/**
		 * The meta object literal for the '<em><b>Editors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDITOR_EXTENSION__EDITORS = eINSTANCE.getEditorExtension_Editors();

		/**
		 * The meta object literal for the '{@link de.dc.javafx.xcore.workbench.extensions.impl.MenuExtensionImpl <em>Menu Extension</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.javafx.xcore.workbench.extensions.impl.MenuExtensionImpl
		 * @see de.dc.javafx.xcore.workbench.extensions.impl.ExtensionsPackageImpl#getMenuExtension()
		 * @generated
		 */
		EClass MENU_EXTENSION = eINSTANCE.getMenuExtension();

		/**
		 * The meta object literal for the '{@link de.dc.javafx.xcore.workbench.extensions.impl.ToolbarExtensionImpl <em>Toolbar Extension</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.javafx.xcore.workbench.extensions.impl.ToolbarExtensionImpl
		 * @see de.dc.javafx.xcore.workbench.extensions.impl.ExtensionsPackageImpl#getToolbarExtension()
		 * @generated
		 */
		EClass TOOLBAR_EXTENSION = eINSTANCE.getToolbarExtension();

		/**
		 * The meta object literal for the '{@link de.dc.javafx.xcore.workbench.extensions.impl.PerspectiveExtensionImpl <em>Perspective Extension</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.javafx.xcore.workbench.extensions.impl.PerspectiveExtensionImpl
		 * @see de.dc.javafx.xcore.workbench.extensions.impl.ExtensionsPackageImpl#getPerspectiveExtension()
		 * @generated
		 */
		EClass PERSPECTIVE_EXTENSION = eINSTANCE.getPerspectiveExtension();

		/**
		 * The meta object literal for the '<em><b>Perspectives</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSPECTIVE_EXTENSION__PERSPECTIVES = eINSTANCE.getPerspectiveExtension_Perspectives();

		/**
		 * The meta object literal for the '{@link de.dc.javafx.xcore.workbench.extensions.impl.ViewImpl <em>View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.javafx.xcore.workbench.extensions.impl.ViewImpl
		 * @see de.dc.javafx.xcore.workbench.extensions.impl.ExtensionsPackageImpl#getView()
		 * @generated
		 */
		EClass VIEW = eINSTANCE.getView();

		/**
		 * The meta object literal for the '<em><b>Icon</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIEW__ICON = eINSTANCE.getView_Icon();

		/**
		 * The meta object literal for the '{@link de.dc.javafx.xcore.workbench.extensions.impl.EditorImpl <em>Editor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.javafx.xcore.workbench.extensions.impl.EditorImpl
		 * @see de.dc.javafx.xcore.workbench.extensions.impl.ExtensionsPackageImpl#getEditor()
		 * @generated
		 */
		EClass EDITOR = eINSTANCE.getEditor();

		/**
		 * The meta object literal for the '<em><b>Icon</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EDITOR__ICON = eINSTANCE.getEditor_Icon();

		/**
		 * The meta object literal for the '<em><b>File Extension</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EDITOR__FILE_EXTENSION = eINSTANCE.getEditor_FileExtension();

		/**
		 * The meta object literal for the '{@link de.dc.javafx.xcore.workbench.extensions.impl.PerspectiveImpl <em>Perspective</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.javafx.xcore.workbench.extensions.impl.PerspectiveImpl
		 * @see de.dc.javafx.xcore.workbench.extensions.impl.ExtensionsPackageImpl#getPerspective()
		 * @generated
		 */
		EClass PERSPECTIVE = eINSTANCE.getPerspective();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSPECTIVE__LEFT = eINSTANCE.getPerspective_Left();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSPECTIVE__RIGHT = eINSTANCE.getPerspective_Right();

		/**
		 * The meta object literal for the '<em><b>Bottom</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSPECTIVE__BOTTOM = eINSTANCE.getPerspective_Bottom();

		/**
		 * The meta object literal for the '<em><b>Editor Area</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSPECTIVE__EDITOR_AREA = eINSTANCE.getPerspective_EditorArea();

	}

} //ExtensionsPackage
