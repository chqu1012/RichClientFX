/**
 */
package de.dc.emf.javafx.model.javafx;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see de.dc.emf.javafx.model.javafx.JavafxFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel multipleEditorPages='false' creationIcons='false' editDirectory='/de.dc.javafx.xcore.model.edit/src-gen' editorDirectory='/de.dc.javafx.xcore.model.editor/src-gen' richClientPlatform='true' codeFormatting='true' importerID='org.eclipse.emf.importer.ecore' runtimePlatform='RCP' basePackage='de.dc.emf.javafx.model'"
 * @generated
 */
public interface JavafxPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "javafx";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.frateranatis.org/javafx";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "javafx";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	JavafxPackage eINSTANCE = de.dc.emf.javafx.model.javafx.impl.JavafxPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.dc.emf.javafx.model.javafx.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.emf.javafx.model.javafx.impl.NamedElementImpl
	 * @see de.dc.emf.javafx.model.javafx.impl.JavafxPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dc.emf.javafx.model.javafx.impl.ProjectFXImpl <em>Project FX</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.emf.javafx.model.javafx.impl.ProjectFXImpl
	 * @see de.dc.emf.javafx.model.javafx.impl.JavafxPackageImpl#getProjectFX()
	 * @generated
	 */
	int PROJECT_FX = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_FX__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Controls</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_FX__CONTROLS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Package Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_FX__PACKAGE_PATH = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Models</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_FX__MODELS = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Bindings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_FX__BINDINGS = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Charts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_FX__CHARTS = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Project FX</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_FX_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Project FX</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_FX_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dc.emf.javafx.model.javafx.impl.ControlFXImpl <em>Control FX</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.emf.javafx.model.javafx.impl.ControlFXImpl
	 * @see de.dc.emf.javafx.model.javafx.impl.JavafxPackageImpl#getControlFX()
	 * @generated
	 */
	int CONTROL_FX = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FX__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Generate Demo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FX__GENERATE_DEMO = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Control FX</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FX_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Control FX</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FX_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dc.emf.javafx.model.javafx.impl.TableColumnFXImpl <em>Table Column FX</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.emf.javafx.model.javafx.impl.TableColumnFXImpl
	 * @see de.dc.emf.javafx.model.javafx.impl.JavafxPackageImpl#getTableColumnFX()
	 * @generated
	 */
	int TABLE_COLUMN_FX = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_COLUMN_FX__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_COLUMN_FX__WIDTH = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Used Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_COLUMN_FX__USED_ATTRIBUTE = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Use Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_COLUMN_FX__USE_FILTER = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Table Column FX</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_COLUMN_FX_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Table Column FX</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_COLUMN_FX_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dc.emf.javafx.model.javafx.impl.ModelFXImpl <em>Model FX</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.emf.javafx.model.javafx.impl.ModelFXImpl
	 * @see de.dc.emf.javafx.model.javafx.impl.JavafxPackageImpl#getModelFX()
	 * @generated
	 */
	int MODEL_FX = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FX__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FX__ATTRIBUTES = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Model FX</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FX_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Model FX</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FX_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dc.emf.javafx.model.javafx.impl.AttributeFXImpl <em>Attribute FX</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.emf.javafx.model.javafx.impl.AttributeFXImpl
	 * @see de.dc.emf.javafx.model.javafx.impl.JavafxPackageImpl#getAttributeFX()
	 * @generated
	 */
	int ATTRIBUTE_FX = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_FX__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_FX__TYPE = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Attribute FX</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_FX_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Attribute FX</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_FX_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dc.emf.javafx.model.javafx.impl.BeanImpl <em>Bean</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.emf.javafx.model.javafx.impl.BeanImpl
	 * @see de.dc.emf.javafx.model.javafx.impl.JavafxPackageImpl#getBean()
	 * @generated
	 */
	int BEAN = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEAN__NAME = MODEL_FX__NAME;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEAN__ATTRIBUTES = MODEL_FX__ATTRIBUTES;

	/**
	 * The number of structural features of the '<em>Bean</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEAN_FEATURE_COUNT = MODEL_FX_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Bean</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEAN_OPERATION_COUNT = MODEL_FX_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dc.emf.javafx.model.javafx.impl.DerivedBeanImpl <em>Derived Bean</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.emf.javafx.model.javafx.impl.DerivedBeanImpl
	 * @see de.dc.emf.javafx.model.javafx.impl.JavafxPackageImpl#getDerivedBean()
	 * @generated
	 */
	int DERIVED_BEAN = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_BEAN__NAME = MODEL_FX__NAME;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_BEAN__ATTRIBUTES = MODEL_FX__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Instance Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_BEAN__INSTANCE_TYPE = MODEL_FX_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Derived Bean</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_BEAN_FEATURE_COUNT = MODEL_FX_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Derived Bean</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_BEAN_OPERATION_COUNT = MODEL_FX_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dc.emf.javafx.model.javafx.impl.BindingImpl <em>Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.emf.javafx.model.javafx.impl.BindingImpl
	 * @see de.dc.emf.javafx.model.javafx.impl.JavafxPackageImpl#getBinding()
	 * @generated
	 */
	int BINDING = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING__NAME = 0;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING__PROPERTY = 1;

	/**
	 * The number of structural features of the '<em>Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dc.emf.javafx.model.javafx.impl.BindingPropertyImpl <em>Binding Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.emf.javafx.model.javafx.impl.BindingPropertyImpl
	 * @see de.dc.emf.javafx.model.javafx.impl.JavafxPackageImpl#getBindingProperty()
	 * @generated
	 */
	int BINDING_PROPERTY = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_PROPERTY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_PROPERTY__TYPE = 1;

	/**
	 * The number of structural features of the '<em>Binding Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_PROPERTY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Binding Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_PROPERTY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dc.emf.javafx.model.javafx.impl.TableViewFXImpl <em>Table View FX</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.emf.javafx.model.javafx.impl.TableViewFXImpl
	 * @see de.dc.emf.javafx.model.javafx.impl.JavafxPackageImpl#getTableViewFX()
	 * @generated
	 */
	int TABLE_VIEW_FX = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_VIEW_FX__NAME = CONTROL_FX__NAME;

	/**
	 * The feature id for the '<em><b>Generate Demo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_VIEW_FX__GENERATE_DEMO = CONTROL_FX__GENERATE_DEMO;

	/**
	 * The feature id for the '<em><b>Show Property View</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_VIEW_FX__SHOW_PROPERTY_VIEW = CONTROL_FX_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Show Toolbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_VIEW_FX__SHOW_TOOLBAR = CONTROL_FX_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Columns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_VIEW_FX__COLUMNS = CONTROL_FX_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Used Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_VIEW_FX__USED_MODEL = CONTROL_FX_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Table View FX</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_VIEW_FX_FEATURE_COUNT = CONTROL_FX_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Table View FX</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_VIEW_FX_OPERATION_COUNT = CONTROL_FX_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dc.emf.javafx.model.javafx.impl.TreeViewFXImpl <em>Tree View FX</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.emf.javafx.model.javafx.impl.TreeViewFXImpl
	 * @see de.dc.emf.javafx.model.javafx.impl.JavafxPackageImpl#getTreeViewFX()
	 * @generated
	 */
	int TREE_VIEW_FX = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE_VIEW_FX__NAME = CONTROL_FX__NAME;

	/**
	 * The feature id for the '<em><b>Generate Demo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE_VIEW_FX__GENERATE_DEMO = CONTROL_FX__GENERATE_DEMO;

	/**
	 * The feature id for the '<em><b>Show Property View</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE_VIEW_FX__SHOW_PROPERTY_VIEW = CONTROL_FX_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Used Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE_VIEW_FX__USED_MODEL = CONTROL_FX_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Tree View FX</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE_VIEW_FX_FEATURE_COUNT = CONTROL_FX_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Tree View FX</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE_VIEW_FX_OPERATION_COUNT = CONTROL_FX_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dc.emf.javafx.model.javafx.impl.FilteredElementImpl <em>Filtered Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.emf.javafx.model.javafx.impl.FilteredElementImpl
	 * @see de.dc.emf.javafx.model.javafx.impl.JavafxPackageImpl#getFilteredElement()
	 * @generated
	 */
	int FILTERED_ELEMENT = 12;

	/**
	 * The feature id for the '<em><b>Use Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTERED_ELEMENT__USE_FILTER = 0;

	/**
	 * The number of structural features of the '<em>Filtered Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTERED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Filtered Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTERED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dc.emf.javafx.model.javafx.impl.ChartFXImpl <em>Chart FX</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.emf.javafx.model.javafx.impl.ChartFXImpl
	 * @see de.dc.emf.javafx.model.javafx.impl.JavafxPackageImpl#getChartFX()
	 * @generated
	 */
	int CHART_FX = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART_FX__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART_FX__TITLE = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Title Side</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART_FX__TITLE_SIDE = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Show Legend</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART_FX__SHOW_LEGEND = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Legend Side</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART_FX__LEGEND_SIDE = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Series</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART_FX__SERIES = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Chart FX</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART_FX_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Chart FX</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART_FX_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dc.emf.javafx.model.javafx.impl.XYChartFXImpl <em>XY Chart FX</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.emf.javafx.model.javafx.impl.XYChartFXImpl
	 * @see de.dc.emf.javafx.model.javafx.impl.JavafxPackageImpl#getXYChartFX()
	 * @generated
	 */
	int XY_CHART_FX = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XY_CHART_FX__NAME = CHART_FX__NAME;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XY_CHART_FX__TITLE = CHART_FX__TITLE;

	/**
	 * The feature id for the '<em><b>Title Side</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XY_CHART_FX__TITLE_SIDE = CHART_FX__TITLE_SIDE;

	/**
	 * The feature id for the '<em><b>Show Legend</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XY_CHART_FX__SHOW_LEGEND = CHART_FX__SHOW_LEGEND;

	/**
	 * The feature id for the '<em><b>Legend Side</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XY_CHART_FX__LEGEND_SIDE = CHART_FX__LEGEND_SIDE;

	/**
	 * The feature id for the '<em><b>Series</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XY_CHART_FX__SERIES = CHART_FX__SERIES;

	/**
	 * The feature id for the '<em><b>XAxis Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XY_CHART_FX__XAXIS_TYPE = CHART_FX_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>YAxis Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XY_CHART_FX__YAXIS_TYPE = CHART_FX_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>XAxis Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XY_CHART_FX__XAXIS_LABEL = CHART_FX_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>YAxis Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XY_CHART_FX__YAXIS_LABEL = CHART_FX_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>XY Chart FX</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XY_CHART_FX_FEATURE_COUNT = CHART_FX_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>XY Chart FX</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XY_CHART_FX_OPERATION_COUNT = CHART_FX_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dc.emf.javafx.model.javafx.impl.ChartSeriesImpl <em>Chart Series</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.emf.javafx.model.javafx.impl.ChartSeriesImpl
	 * @see de.dc.emf.javafx.model.javafx.impl.JavafxPackageImpl#getChartSeries()
	 * @generated
	 */
	int CHART_SERIES = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART_SERIES__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Data List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART_SERIES__DATA_LIST = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Chart Series</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART_SERIES_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Chart Series</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART_SERIES_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dc.emf.javafx.model.javafx.impl.ChartFXDataImpl <em>Chart FX Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.emf.javafx.model.javafx.impl.ChartFXDataImpl
	 * @see de.dc.emf.javafx.model.javafx.impl.JavafxPackageImpl#getChartFXData()
	 * @generated
	 */
	int CHART_FX_DATA = 16;

	/**
	 * The feature id for the '<em><b>XValue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART_FX_DATA__XVALUE = 0;

	/**
	 * The feature id for the '<em><b>YValue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART_FX_DATA__YVALUE = 1;

	/**
	 * The number of structural features of the '<em>Chart FX Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART_FX_DATA_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Chart FX Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART_FX_DATA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dc.emf.javafx.model.javafx.impl.LineChartFXImpl <em>Line Chart FX</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.emf.javafx.model.javafx.impl.LineChartFXImpl
	 * @see de.dc.emf.javafx.model.javafx.impl.JavafxPackageImpl#getLineChartFX()
	 * @generated
	 */
	int LINE_CHART_FX = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_CHART_FX__NAME = XY_CHART_FX__NAME;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_CHART_FX__TITLE = XY_CHART_FX__TITLE;

	/**
	 * The feature id for the '<em><b>Title Side</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_CHART_FX__TITLE_SIDE = XY_CHART_FX__TITLE_SIDE;

	/**
	 * The feature id for the '<em><b>Show Legend</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_CHART_FX__SHOW_LEGEND = XY_CHART_FX__SHOW_LEGEND;

	/**
	 * The feature id for the '<em><b>Legend Side</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_CHART_FX__LEGEND_SIDE = XY_CHART_FX__LEGEND_SIDE;

	/**
	 * The feature id for the '<em><b>Series</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_CHART_FX__SERIES = XY_CHART_FX__SERIES;

	/**
	 * The feature id for the '<em><b>XAxis Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_CHART_FX__XAXIS_TYPE = XY_CHART_FX__XAXIS_TYPE;

	/**
	 * The feature id for the '<em><b>YAxis Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_CHART_FX__YAXIS_TYPE = XY_CHART_FX__YAXIS_TYPE;

	/**
	 * The feature id for the '<em><b>XAxis Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_CHART_FX__XAXIS_LABEL = XY_CHART_FX__XAXIS_LABEL;

	/**
	 * The feature id for the '<em><b>YAxis Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_CHART_FX__YAXIS_LABEL = XY_CHART_FX__YAXIS_LABEL;

	/**
	 * The number of structural features of the '<em>Line Chart FX</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_CHART_FX_FEATURE_COUNT = XY_CHART_FX_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Line Chart FX</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_CHART_FX_OPERATION_COUNT = XY_CHART_FX_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dc.emf.javafx.model.javafx.impl.PieChartFXImpl <em>Pie Chart FX</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.emf.javafx.model.javafx.impl.PieChartFXImpl
	 * @see de.dc.emf.javafx.model.javafx.impl.JavafxPackageImpl#getPieChartFX()
	 * @generated
	 */
	int PIE_CHART_FX = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIE_CHART_FX__NAME = CHART_FX__NAME;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIE_CHART_FX__TITLE = CHART_FX__TITLE;

	/**
	 * The feature id for the '<em><b>Title Side</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIE_CHART_FX__TITLE_SIDE = CHART_FX__TITLE_SIDE;

	/**
	 * The feature id for the '<em><b>Show Legend</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIE_CHART_FX__SHOW_LEGEND = CHART_FX__SHOW_LEGEND;

	/**
	 * The feature id for the '<em><b>Legend Side</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIE_CHART_FX__LEGEND_SIDE = CHART_FX__LEGEND_SIDE;

	/**
	 * The feature id for the '<em><b>Series</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIE_CHART_FX__SERIES = CHART_FX__SERIES;

	/**
	 * The number of structural features of the '<em>Pie Chart FX</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIE_CHART_FX_FEATURE_COUNT = CHART_FX_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Pie Chart FX</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIE_CHART_FX_OPERATION_COUNT = CHART_FX_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dc.emf.javafx.model.javafx.impl.AreaChartFXImpl <em>Area Chart FX</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.emf.javafx.model.javafx.impl.AreaChartFXImpl
	 * @see de.dc.emf.javafx.model.javafx.impl.JavafxPackageImpl#getAreaChartFX()
	 * @generated
	 */
	int AREA_CHART_FX = 19;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA_CHART_FX__NAME = XY_CHART_FX__NAME;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA_CHART_FX__TITLE = XY_CHART_FX__TITLE;

	/**
	 * The feature id for the '<em><b>Title Side</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA_CHART_FX__TITLE_SIDE = XY_CHART_FX__TITLE_SIDE;

	/**
	 * The feature id for the '<em><b>Show Legend</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA_CHART_FX__SHOW_LEGEND = XY_CHART_FX__SHOW_LEGEND;

	/**
	 * The feature id for the '<em><b>Legend Side</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA_CHART_FX__LEGEND_SIDE = XY_CHART_FX__LEGEND_SIDE;

	/**
	 * The feature id for the '<em><b>Series</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA_CHART_FX__SERIES = XY_CHART_FX__SERIES;

	/**
	 * The feature id for the '<em><b>XAxis Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA_CHART_FX__XAXIS_TYPE = XY_CHART_FX__XAXIS_TYPE;

	/**
	 * The feature id for the '<em><b>YAxis Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA_CHART_FX__YAXIS_TYPE = XY_CHART_FX__YAXIS_TYPE;

	/**
	 * The feature id for the '<em><b>XAxis Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA_CHART_FX__XAXIS_LABEL = XY_CHART_FX__XAXIS_LABEL;

	/**
	 * The feature id for the '<em><b>YAxis Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA_CHART_FX__YAXIS_LABEL = XY_CHART_FX__YAXIS_LABEL;

	/**
	 * The number of structural features of the '<em>Area Chart FX</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA_CHART_FX_FEATURE_COUNT = XY_CHART_FX_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Area Chart FX</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA_CHART_FX_OPERATION_COUNT = XY_CHART_FX_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dc.emf.javafx.model.javafx.impl.BubbleChartFXImpl <em>Bubble Chart FX</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.emf.javafx.model.javafx.impl.BubbleChartFXImpl
	 * @see de.dc.emf.javafx.model.javafx.impl.JavafxPackageImpl#getBubbleChartFX()
	 * @generated
	 */
	int BUBBLE_CHART_FX = 20;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUBBLE_CHART_FX__NAME = XY_CHART_FX__NAME;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUBBLE_CHART_FX__TITLE = XY_CHART_FX__TITLE;

	/**
	 * The feature id for the '<em><b>Title Side</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUBBLE_CHART_FX__TITLE_SIDE = XY_CHART_FX__TITLE_SIDE;

	/**
	 * The feature id for the '<em><b>Show Legend</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUBBLE_CHART_FX__SHOW_LEGEND = XY_CHART_FX__SHOW_LEGEND;

	/**
	 * The feature id for the '<em><b>Legend Side</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUBBLE_CHART_FX__LEGEND_SIDE = XY_CHART_FX__LEGEND_SIDE;

	/**
	 * The feature id for the '<em><b>Series</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUBBLE_CHART_FX__SERIES = XY_CHART_FX__SERIES;

	/**
	 * The feature id for the '<em><b>XAxis Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUBBLE_CHART_FX__XAXIS_TYPE = XY_CHART_FX__XAXIS_TYPE;

	/**
	 * The feature id for the '<em><b>YAxis Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUBBLE_CHART_FX__YAXIS_TYPE = XY_CHART_FX__YAXIS_TYPE;

	/**
	 * The feature id for the '<em><b>XAxis Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUBBLE_CHART_FX__XAXIS_LABEL = XY_CHART_FX__XAXIS_LABEL;

	/**
	 * The feature id for the '<em><b>YAxis Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUBBLE_CHART_FX__YAXIS_LABEL = XY_CHART_FX__YAXIS_LABEL;

	/**
	 * The number of structural features of the '<em>Bubble Chart FX</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUBBLE_CHART_FX_FEATURE_COUNT = XY_CHART_FX_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Bubble Chart FX</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUBBLE_CHART_FX_OPERATION_COUNT = XY_CHART_FX_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dc.emf.javafx.model.javafx.impl.ScatterChartFXImpl <em>Scatter Chart FX</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.emf.javafx.model.javafx.impl.ScatterChartFXImpl
	 * @see de.dc.emf.javafx.model.javafx.impl.JavafxPackageImpl#getScatterChartFX()
	 * @generated
	 */
	int SCATTER_CHART_FX = 21;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCATTER_CHART_FX__NAME = XY_CHART_FX__NAME;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCATTER_CHART_FX__TITLE = XY_CHART_FX__TITLE;

	/**
	 * The feature id for the '<em><b>Title Side</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCATTER_CHART_FX__TITLE_SIDE = XY_CHART_FX__TITLE_SIDE;

	/**
	 * The feature id for the '<em><b>Show Legend</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCATTER_CHART_FX__SHOW_LEGEND = XY_CHART_FX__SHOW_LEGEND;

	/**
	 * The feature id for the '<em><b>Legend Side</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCATTER_CHART_FX__LEGEND_SIDE = XY_CHART_FX__LEGEND_SIDE;

	/**
	 * The feature id for the '<em><b>Series</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCATTER_CHART_FX__SERIES = XY_CHART_FX__SERIES;

	/**
	 * The feature id for the '<em><b>XAxis Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCATTER_CHART_FX__XAXIS_TYPE = XY_CHART_FX__XAXIS_TYPE;

	/**
	 * The feature id for the '<em><b>YAxis Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCATTER_CHART_FX__YAXIS_TYPE = XY_CHART_FX__YAXIS_TYPE;

	/**
	 * The feature id for the '<em><b>XAxis Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCATTER_CHART_FX__XAXIS_LABEL = XY_CHART_FX__XAXIS_LABEL;

	/**
	 * The feature id for the '<em><b>YAxis Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCATTER_CHART_FX__YAXIS_LABEL = XY_CHART_FX__YAXIS_LABEL;

	/**
	 * The number of structural features of the '<em>Scatter Chart FX</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCATTER_CHART_FX_FEATURE_COUNT = XY_CHART_FX_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Scatter Chart FX</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCATTER_CHART_FX_OPERATION_COUNT = XY_CHART_FX_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dc.emf.javafx.model.javafx.impl.BarChartFXImpl <em>Bar Chart FX</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.emf.javafx.model.javafx.impl.BarChartFXImpl
	 * @see de.dc.emf.javafx.model.javafx.impl.JavafxPackageImpl#getBarChartFX()
	 * @generated
	 */
	int BAR_CHART_FX = 22;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAR_CHART_FX__NAME = CHART_FX__NAME;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAR_CHART_FX__TITLE = CHART_FX__TITLE;

	/**
	 * The feature id for the '<em><b>Title Side</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAR_CHART_FX__TITLE_SIDE = CHART_FX__TITLE_SIDE;

	/**
	 * The feature id for the '<em><b>Show Legend</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAR_CHART_FX__SHOW_LEGEND = CHART_FX__SHOW_LEGEND;

	/**
	 * The feature id for the '<em><b>Legend Side</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAR_CHART_FX__LEGEND_SIDE = CHART_FX__LEGEND_SIDE;

	/**
	 * The feature id for the '<em><b>Series</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAR_CHART_FX__SERIES = CHART_FX__SERIES;

	/**
	 * The number of structural features of the '<em>Bar Chart FX</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAR_CHART_FX_FEATURE_COUNT = CHART_FX_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Bar Chart FX</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAR_CHART_FX_OPERATION_COUNT = CHART_FX_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dc.emf.javafx.model.javafx.BindingType <em>Binding Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.emf.javafx.model.javafx.BindingType
	 * @see de.dc.emf.javafx.model.javafx.impl.JavafxPackageImpl#getBindingType()
	 * @generated
	 */
	int BINDING_TYPE = 23;

	/**
	 * The meta object id for the '{@link de.dc.emf.javafx.model.javafx.Orientation <em>Orientation</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.emf.javafx.model.javafx.Orientation
	 * @see de.dc.emf.javafx.model.javafx.impl.JavafxPackageImpl#getOrientation()
	 * @generated
	 */
	int ORIENTATION = 24;

	/**
	 * The meta object id for the '{@link de.dc.emf.javafx.model.javafx.AxisType <em>Axis Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.emf.javafx.model.javafx.AxisType
	 * @see de.dc.emf.javafx.model.javafx.impl.JavafxPackageImpl#getAxisType()
	 * @generated
	 */
	int AXIS_TYPE = 25;

	/**
	 * Returns the meta object for class '{@link de.dc.emf.javafx.model.javafx.ProjectFX <em>Project FX</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Project FX</em>'.
	 * @see de.dc.emf.javafx.model.javafx.ProjectFX
	 * @generated
	 */
	EClass getProjectFX();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dc.emf.javafx.model.javafx.ProjectFX#getControls <em>Controls</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Controls</em>'.
	 * @see de.dc.emf.javafx.model.javafx.ProjectFX#getControls()
	 * @see #getProjectFX()
	 * @generated
	 */
	EReference getProjectFX_Controls();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.emf.javafx.model.javafx.ProjectFX#getPackagePath <em>Package Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Package Path</em>'.
	 * @see de.dc.emf.javafx.model.javafx.ProjectFX#getPackagePath()
	 * @see #getProjectFX()
	 * @generated
	 */
	EAttribute getProjectFX_PackagePath();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dc.emf.javafx.model.javafx.ProjectFX#getModels <em>Models</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Models</em>'.
	 * @see de.dc.emf.javafx.model.javafx.ProjectFX#getModels()
	 * @see #getProjectFX()
	 * @generated
	 */
	EReference getProjectFX_Models();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dc.emf.javafx.model.javafx.ProjectFX#getBindings <em>Bindings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bindings</em>'.
	 * @see de.dc.emf.javafx.model.javafx.ProjectFX#getBindings()
	 * @see #getProjectFX()
	 * @generated
	 */
	EReference getProjectFX_Bindings();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dc.emf.javafx.model.javafx.ProjectFX#getCharts <em>Charts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Charts</em>'.
	 * @see de.dc.emf.javafx.model.javafx.ProjectFX#getCharts()
	 * @see #getProjectFX()
	 * @generated
	 */
	EReference getProjectFX_Charts();

	/**
	 * Returns the meta object for class '{@link de.dc.emf.javafx.model.javafx.ControlFX <em>Control FX</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control FX</em>'.
	 * @see de.dc.emf.javafx.model.javafx.ControlFX
	 * @generated
	 */
	EClass getControlFX();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.emf.javafx.model.javafx.ControlFX#isGenerateDemo <em>Generate Demo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generate Demo</em>'.
	 * @see de.dc.emf.javafx.model.javafx.ControlFX#isGenerateDemo()
	 * @see #getControlFX()
	 * @generated
	 */
	EAttribute getControlFX_GenerateDemo();

	/**
	 * Returns the meta object for class '{@link de.dc.emf.javafx.model.javafx.TableColumnFX <em>Table Column FX</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table Column FX</em>'.
	 * @see de.dc.emf.javafx.model.javafx.TableColumnFX
	 * @generated
	 */
	EClass getTableColumnFX();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.emf.javafx.model.javafx.TableColumnFX#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see de.dc.emf.javafx.model.javafx.TableColumnFX#getWidth()
	 * @see #getTableColumnFX()
	 * @generated
	 */
	EAttribute getTableColumnFX_Width();

	/**
	 * Returns the meta object for the reference '{@link de.dc.emf.javafx.model.javafx.TableColumnFX#getUsedAttribute <em>Used Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Used Attribute</em>'.
	 * @see de.dc.emf.javafx.model.javafx.TableColumnFX#getUsedAttribute()
	 * @see #getTableColumnFX()
	 * @generated
	 */
	EReference getTableColumnFX_UsedAttribute();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.emf.javafx.model.javafx.TableColumnFX#isUseFilter <em>Use Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Use Filter</em>'.
	 * @see de.dc.emf.javafx.model.javafx.TableColumnFX#isUseFilter()
	 * @see #getTableColumnFX()
	 * @generated
	 */
	EAttribute getTableColumnFX_UseFilter();

	/**
	 * Returns the meta object for class '{@link de.dc.emf.javafx.model.javafx.ModelFX <em>Model FX</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model FX</em>'.
	 * @see de.dc.emf.javafx.model.javafx.ModelFX
	 * @generated
	 */
	EClass getModelFX();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dc.emf.javafx.model.javafx.ModelFX#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributes</em>'.
	 * @see de.dc.emf.javafx.model.javafx.ModelFX#getAttributes()
	 * @see #getModelFX()
	 * @generated
	 */
	EReference getModelFX_Attributes();

	/**
	 * Returns the meta object for class '{@link de.dc.emf.javafx.model.javafx.AttributeFX <em>Attribute FX</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute FX</em>'.
	 * @see de.dc.emf.javafx.model.javafx.AttributeFX
	 * @generated
	 */
	EClass getAttributeFX();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.emf.javafx.model.javafx.AttributeFX#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see de.dc.emf.javafx.model.javafx.AttributeFX#getType()
	 * @see #getAttributeFX()
	 * @generated
	 */
	EAttribute getAttributeFX_Type();

	/**
	 * Returns the meta object for class '{@link de.dc.emf.javafx.model.javafx.Bean <em>Bean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bean</em>'.
	 * @see de.dc.emf.javafx.model.javafx.Bean
	 * @generated
	 */
	EClass getBean();

	/**
	 * Returns the meta object for class '{@link de.dc.emf.javafx.model.javafx.DerivedBean <em>Derived Bean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Derived Bean</em>'.
	 * @see de.dc.emf.javafx.model.javafx.DerivedBean
	 * @generated
	 */
	EClass getDerivedBean();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.emf.javafx.model.javafx.DerivedBean#getInstanceType <em>Instance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instance Type</em>'.
	 * @see de.dc.emf.javafx.model.javafx.DerivedBean#getInstanceType()
	 * @see #getDerivedBean()
	 * @generated
	 */
	EAttribute getDerivedBean_InstanceType();

	/**
	 * Returns the meta object for class '{@link de.dc.emf.javafx.model.javafx.Binding <em>Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binding</em>'.
	 * @see de.dc.emf.javafx.model.javafx.Binding
	 * @generated
	 */
	EClass getBinding();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.emf.javafx.model.javafx.Binding#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.dc.emf.javafx.model.javafx.Binding#getName()
	 * @see #getBinding()
	 * @generated
	 */
	EAttribute getBinding_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dc.emf.javafx.model.javafx.Binding#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Property</em>'.
	 * @see de.dc.emf.javafx.model.javafx.Binding#getProperty()
	 * @see #getBinding()
	 * @generated
	 */
	EReference getBinding_Property();

	/**
	 * Returns the meta object for class '{@link de.dc.emf.javafx.model.javafx.BindingProperty <em>Binding Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binding Property</em>'.
	 * @see de.dc.emf.javafx.model.javafx.BindingProperty
	 * @generated
	 */
	EClass getBindingProperty();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.emf.javafx.model.javafx.BindingProperty#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.dc.emf.javafx.model.javafx.BindingProperty#getName()
	 * @see #getBindingProperty()
	 * @generated
	 */
	EAttribute getBindingProperty_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.emf.javafx.model.javafx.BindingProperty#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see de.dc.emf.javafx.model.javafx.BindingProperty#getType()
	 * @see #getBindingProperty()
	 * @generated
	 */
	EAttribute getBindingProperty_Type();

	/**
	 * Returns the meta object for class '{@link de.dc.emf.javafx.model.javafx.TableViewFX <em>Table View FX</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table View FX</em>'.
	 * @see de.dc.emf.javafx.model.javafx.TableViewFX
	 * @generated
	 */
	EClass getTableViewFX();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.emf.javafx.model.javafx.TableViewFX#isShowPropertyView <em>Show Property View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Show Property View</em>'.
	 * @see de.dc.emf.javafx.model.javafx.TableViewFX#isShowPropertyView()
	 * @see #getTableViewFX()
	 * @generated
	 */
	EAttribute getTableViewFX_ShowPropertyView();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.emf.javafx.model.javafx.TableViewFX#isShowToolbar <em>Show Toolbar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Show Toolbar</em>'.
	 * @see de.dc.emf.javafx.model.javafx.TableViewFX#isShowToolbar()
	 * @see #getTableViewFX()
	 * @generated
	 */
	EAttribute getTableViewFX_ShowToolbar();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dc.emf.javafx.model.javafx.TableViewFX#getColumns <em>Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Columns</em>'.
	 * @see de.dc.emf.javafx.model.javafx.TableViewFX#getColumns()
	 * @see #getTableViewFX()
	 * @generated
	 */
	EReference getTableViewFX_Columns();

	/**
	 * Returns the meta object for the containment reference '{@link de.dc.emf.javafx.model.javafx.TableViewFX#getUsedModel <em>Used Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Used Model</em>'.
	 * @see de.dc.emf.javafx.model.javafx.TableViewFX#getUsedModel()
	 * @see #getTableViewFX()
	 * @generated
	 */
	EReference getTableViewFX_UsedModel();

	/**
	 * Returns the meta object for class '{@link de.dc.emf.javafx.model.javafx.TreeViewFX <em>Tree View FX</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tree View FX</em>'.
	 * @see de.dc.emf.javafx.model.javafx.TreeViewFX
	 * @generated
	 */
	EClass getTreeViewFX();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.emf.javafx.model.javafx.TreeViewFX#isShowPropertyView <em>Show Property View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Show Property View</em>'.
	 * @see de.dc.emf.javafx.model.javafx.TreeViewFX#isShowPropertyView()
	 * @see #getTreeViewFX()
	 * @generated
	 */
	EAttribute getTreeViewFX_ShowPropertyView();

	/**
	 * Returns the meta object for the containment reference '{@link de.dc.emf.javafx.model.javafx.TreeViewFX#getUsedModel <em>Used Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Used Model</em>'.
	 * @see de.dc.emf.javafx.model.javafx.TreeViewFX#getUsedModel()
	 * @see #getTreeViewFX()
	 * @generated
	 */
	EReference getTreeViewFX_UsedModel();

	/**
	 * Returns the meta object for class '{@link de.dc.emf.javafx.model.javafx.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see de.dc.emf.javafx.model.javafx.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.emf.javafx.model.javafx.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.dc.emf.javafx.model.javafx.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link de.dc.emf.javafx.model.javafx.FilteredElement <em>Filtered Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Filtered Element</em>'.
	 * @see de.dc.emf.javafx.model.javafx.FilteredElement
	 * @generated
	 */
	EClass getFilteredElement();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.emf.javafx.model.javafx.FilteredElement#isUseFilter <em>Use Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Use Filter</em>'.
	 * @see de.dc.emf.javafx.model.javafx.FilteredElement#isUseFilter()
	 * @see #getFilteredElement()
	 * @generated
	 */
	EAttribute getFilteredElement_UseFilter();

	/**
	 * Returns the meta object for class '{@link de.dc.emf.javafx.model.javafx.ChartFX <em>Chart FX</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Chart FX</em>'.
	 * @see de.dc.emf.javafx.model.javafx.ChartFX
	 * @generated
	 */
	EClass getChartFX();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.emf.javafx.model.javafx.ChartFX#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see de.dc.emf.javafx.model.javafx.ChartFX#getTitle()
	 * @see #getChartFX()
	 * @generated
	 */
	EAttribute getChartFX_Title();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.emf.javafx.model.javafx.ChartFX#getTitleSide <em>Title Side</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title Side</em>'.
	 * @see de.dc.emf.javafx.model.javafx.ChartFX#getTitleSide()
	 * @see #getChartFX()
	 * @generated
	 */
	EAttribute getChartFX_TitleSide();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.emf.javafx.model.javafx.ChartFX#isShowLegend <em>Show Legend</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Show Legend</em>'.
	 * @see de.dc.emf.javafx.model.javafx.ChartFX#isShowLegend()
	 * @see #getChartFX()
	 * @generated
	 */
	EAttribute getChartFX_ShowLegend();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.emf.javafx.model.javafx.ChartFX#getLegendSide <em>Legend Side</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Legend Side</em>'.
	 * @see de.dc.emf.javafx.model.javafx.ChartFX#getLegendSide()
	 * @see #getChartFX()
	 * @generated
	 */
	EAttribute getChartFX_LegendSide();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dc.emf.javafx.model.javafx.ChartFX#getSeries <em>Series</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Series</em>'.
	 * @see de.dc.emf.javafx.model.javafx.ChartFX#getSeries()
	 * @see #getChartFX()
	 * @generated
	 */
	EReference getChartFX_Series();

	/**
	 * Returns the meta object for class '{@link de.dc.emf.javafx.model.javafx.XYChartFX <em>XY Chart FX</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XY Chart FX</em>'.
	 * @see de.dc.emf.javafx.model.javafx.XYChartFX
	 * @generated
	 */
	EClass getXYChartFX();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.emf.javafx.model.javafx.XYChartFX#getXAxisType <em>XAxis Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>XAxis Type</em>'.
	 * @see de.dc.emf.javafx.model.javafx.XYChartFX#getXAxisType()
	 * @see #getXYChartFX()
	 * @generated
	 */
	EAttribute getXYChartFX_XAxisType();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.emf.javafx.model.javafx.XYChartFX#getYAxisType <em>YAxis Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>YAxis Type</em>'.
	 * @see de.dc.emf.javafx.model.javafx.XYChartFX#getYAxisType()
	 * @see #getXYChartFX()
	 * @generated
	 */
	EAttribute getXYChartFX_YAxisType();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.emf.javafx.model.javafx.XYChartFX#getXAxisLabel <em>XAxis Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>XAxis Label</em>'.
	 * @see de.dc.emf.javafx.model.javafx.XYChartFX#getXAxisLabel()
	 * @see #getXYChartFX()
	 * @generated
	 */
	EAttribute getXYChartFX_XAxisLabel();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.emf.javafx.model.javafx.XYChartFX#getYAxisLabel <em>YAxis Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>YAxis Label</em>'.
	 * @see de.dc.emf.javafx.model.javafx.XYChartFX#getYAxisLabel()
	 * @see #getXYChartFX()
	 * @generated
	 */
	EAttribute getXYChartFX_YAxisLabel();

	/**
	 * Returns the meta object for class '{@link de.dc.emf.javafx.model.javafx.ChartSeries <em>Chart Series</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Chart Series</em>'.
	 * @see de.dc.emf.javafx.model.javafx.ChartSeries
	 * @generated
	 */
	EClass getChartSeries();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dc.emf.javafx.model.javafx.ChartSeries#getDataList <em>Data List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data List</em>'.
	 * @see de.dc.emf.javafx.model.javafx.ChartSeries#getDataList()
	 * @see #getChartSeries()
	 * @generated
	 */
	EReference getChartSeries_DataList();

	/**
	 * Returns the meta object for class '{@link de.dc.emf.javafx.model.javafx.ChartFXData <em>Chart FX Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Chart FX Data</em>'.
	 * @see de.dc.emf.javafx.model.javafx.ChartFXData
	 * @generated
	 */
	EClass getChartFXData();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.emf.javafx.model.javafx.ChartFXData#getXValue <em>XValue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>XValue</em>'.
	 * @see de.dc.emf.javafx.model.javafx.ChartFXData#getXValue()
	 * @see #getChartFXData()
	 * @generated
	 */
	EAttribute getChartFXData_XValue();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.emf.javafx.model.javafx.ChartFXData#getYValue <em>YValue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>YValue</em>'.
	 * @see de.dc.emf.javafx.model.javafx.ChartFXData#getYValue()
	 * @see #getChartFXData()
	 * @generated
	 */
	EAttribute getChartFXData_YValue();

	/**
	 * Returns the meta object for class '{@link de.dc.emf.javafx.model.javafx.LineChartFX <em>Line Chart FX</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Line Chart FX</em>'.
	 * @see de.dc.emf.javafx.model.javafx.LineChartFX
	 * @generated
	 */
	EClass getLineChartFX();

	/**
	 * Returns the meta object for class '{@link de.dc.emf.javafx.model.javafx.PieChartFX <em>Pie Chart FX</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pie Chart FX</em>'.
	 * @see de.dc.emf.javafx.model.javafx.PieChartFX
	 * @generated
	 */
	EClass getPieChartFX();

	/**
	 * Returns the meta object for class '{@link de.dc.emf.javafx.model.javafx.AreaChartFX <em>Area Chart FX</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Area Chart FX</em>'.
	 * @see de.dc.emf.javafx.model.javafx.AreaChartFX
	 * @generated
	 */
	EClass getAreaChartFX();

	/**
	 * Returns the meta object for class '{@link de.dc.emf.javafx.model.javafx.BubbleChartFX <em>Bubble Chart FX</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bubble Chart FX</em>'.
	 * @see de.dc.emf.javafx.model.javafx.BubbleChartFX
	 * @generated
	 */
	EClass getBubbleChartFX();

	/**
	 * Returns the meta object for class '{@link de.dc.emf.javafx.model.javafx.ScatterChartFX <em>Scatter Chart FX</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scatter Chart FX</em>'.
	 * @see de.dc.emf.javafx.model.javafx.ScatterChartFX
	 * @generated
	 */
	EClass getScatterChartFX();

	/**
	 * Returns the meta object for class '{@link de.dc.emf.javafx.model.javafx.BarChartFX <em>Bar Chart FX</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bar Chart FX</em>'.
	 * @see de.dc.emf.javafx.model.javafx.BarChartFX
	 * @generated
	 */
	EClass getBarChartFX();

	/**
	 * Returns the meta object for enum '{@link de.dc.emf.javafx.model.javafx.BindingType <em>Binding Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Binding Type</em>'.
	 * @see de.dc.emf.javafx.model.javafx.BindingType
	 * @generated
	 */
	EEnum getBindingType();

	/**
	 * Returns the meta object for enum '{@link de.dc.emf.javafx.model.javafx.Orientation <em>Orientation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Orientation</em>'.
	 * @see de.dc.emf.javafx.model.javafx.Orientation
	 * @generated
	 */
	EEnum getOrientation();

	/**
	 * Returns the meta object for enum '{@link de.dc.emf.javafx.model.javafx.AxisType <em>Axis Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Axis Type</em>'.
	 * @see de.dc.emf.javafx.model.javafx.AxisType
	 * @generated
	 */
	EEnum getAxisType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	JavafxFactory getJavafxFactory();

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
		 * The meta object literal for the '{@link de.dc.emf.javafx.model.javafx.impl.ProjectFXImpl <em>Project FX</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.emf.javafx.model.javafx.impl.ProjectFXImpl
		 * @see de.dc.emf.javafx.model.javafx.impl.JavafxPackageImpl#getProjectFX()
		 * @generated
		 */
		EClass PROJECT_FX = eINSTANCE.getProjectFX();

		/**
		 * The meta object literal for the '<em><b>Controls</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT_FX__CONTROLS = eINSTANCE.getProjectFX_Controls();

		/**
		 * The meta object literal for the '<em><b>Package Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT_FX__PACKAGE_PATH = eINSTANCE.getProjectFX_PackagePath();

		/**
		 * The meta object literal for the '<em><b>Models</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT_FX__MODELS = eINSTANCE.getProjectFX_Models();

		/**
		 * The meta object literal for the '<em><b>Bindings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT_FX__BINDINGS = eINSTANCE.getProjectFX_Bindings();

		/**
		 * The meta object literal for the '<em><b>Charts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT_FX__CHARTS = eINSTANCE.getProjectFX_Charts();

		/**
		 * The meta object literal for the '{@link de.dc.emf.javafx.model.javafx.impl.ControlFXImpl <em>Control FX</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.emf.javafx.model.javafx.impl.ControlFXImpl
		 * @see de.dc.emf.javafx.model.javafx.impl.JavafxPackageImpl#getControlFX()
		 * @generated
		 */
		EClass CONTROL_FX = eINSTANCE.getControlFX();

		/**
		 * The meta object literal for the '<em><b>Generate Demo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROL_FX__GENERATE_DEMO = eINSTANCE.getControlFX_GenerateDemo();

		/**
		 * The meta object literal for the '{@link de.dc.emf.javafx.model.javafx.impl.TableColumnFXImpl <em>Table Column FX</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.emf.javafx.model.javafx.impl.TableColumnFXImpl
		 * @see de.dc.emf.javafx.model.javafx.impl.JavafxPackageImpl#getTableColumnFX()
		 * @generated
		 */
		EClass TABLE_COLUMN_FX = eINSTANCE.getTableColumnFX();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE_COLUMN_FX__WIDTH = eINSTANCE.getTableColumnFX_Width();

		/**
		 * The meta object literal for the '<em><b>Used Attribute</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE_COLUMN_FX__USED_ATTRIBUTE = eINSTANCE.getTableColumnFX_UsedAttribute();

		/**
		 * The meta object literal for the '<em><b>Use Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE_COLUMN_FX__USE_FILTER = eINSTANCE.getTableColumnFX_UseFilter();

		/**
		 * The meta object literal for the '{@link de.dc.emf.javafx.model.javafx.impl.ModelFXImpl <em>Model FX</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.emf.javafx.model.javafx.impl.ModelFXImpl
		 * @see de.dc.emf.javafx.model.javafx.impl.JavafxPackageImpl#getModelFX()
		 * @generated
		 */
		EClass MODEL_FX = eINSTANCE.getModelFX();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_FX__ATTRIBUTES = eINSTANCE.getModelFX_Attributes();

		/**
		 * The meta object literal for the '{@link de.dc.emf.javafx.model.javafx.impl.AttributeFXImpl <em>Attribute FX</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.emf.javafx.model.javafx.impl.AttributeFXImpl
		 * @see de.dc.emf.javafx.model.javafx.impl.JavafxPackageImpl#getAttributeFX()
		 * @generated
		 */
		EClass ATTRIBUTE_FX = eINSTANCE.getAttributeFX();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_FX__TYPE = eINSTANCE.getAttributeFX_Type();

		/**
		 * The meta object literal for the '{@link de.dc.emf.javafx.model.javafx.impl.BeanImpl <em>Bean</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.emf.javafx.model.javafx.impl.BeanImpl
		 * @see de.dc.emf.javafx.model.javafx.impl.JavafxPackageImpl#getBean()
		 * @generated
		 */
		EClass BEAN = eINSTANCE.getBean();

		/**
		 * The meta object literal for the '{@link de.dc.emf.javafx.model.javafx.impl.DerivedBeanImpl <em>Derived Bean</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.emf.javafx.model.javafx.impl.DerivedBeanImpl
		 * @see de.dc.emf.javafx.model.javafx.impl.JavafxPackageImpl#getDerivedBean()
		 * @generated
		 */
		EClass DERIVED_BEAN = eINSTANCE.getDerivedBean();

		/**
		 * The meta object literal for the '<em><b>Instance Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DERIVED_BEAN__INSTANCE_TYPE = eINSTANCE.getDerivedBean_InstanceType();

		/**
		 * The meta object literal for the '{@link de.dc.emf.javafx.model.javafx.impl.BindingImpl <em>Binding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.emf.javafx.model.javafx.impl.BindingImpl
		 * @see de.dc.emf.javafx.model.javafx.impl.JavafxPackageImpl#getBinding()
		 * @generated
		 */
		EClass BINDING = eINSTANCE.getBinding();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BINDING__NAME = eINSTANCE.getBinding_Name();

		/**
		 * The meta object literal for the '<em><b>Property</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINDING__PROPERTY = eINSTANCE.getBinding_Property();

		/**
		 * The meta object literal for the '{@link de.dc.emf.javafx.model.javafx.impl.BindingPropertyImpl <em>Binding Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.emf.javafx.model.javafx.impl.BindingPropertyImpl
		 * @see de.dc.emf.javafx.model.javafx.impl.JavafxPackageImpl#getBindingProperty()
		 * @generated
		 */
		EClass BINDING_PROPERTY = eINSTANCE.getBindingProperty();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BINDING_PROPERTY__NAME = eINSTANCE.getBindingProperty_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BINDING_PROPERTY__TYPE = eINSTANCE.getBindingProperty_Type();

		/**
		 * The meta object literal for the '{@link de.dc.emf.javafx.model.javafx.impl.TableViewFXImpl <em>Table View FX</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.emf.javafx.model.javafx.impl.TableViewFXImpl
		 * @see de.dc.emf.javafx.model.javafx.impl.JavafxPackageImpl#getTableViewFX()
		 * @generated
		 */
		EClass TABLE_VIEW_FX = eINSTANCE.getTableViewFX();

		/**
		 * The meta object literal for the '<em><b>Show Property View</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE_VIEW_FX__SHOW_PROPERTY_VIEW = eINSTANCE.getTableViewFX_ShowPropertyView();

		/**
		 * The meta object literal for the '<em><b>Show Toolbar</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE_VIEW_FX__SHOW_TOOLBAR = eINSTANCE.getTableViewFX_ShowToolbar();

		/**
		 * The meta object literal for the '<em><b>Columns</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE_VIEW_FX__COLUMNS = eINSTANCE.getTableViewFX_Columns();

		/**
		 * The meta object literal for the '<em><b>Used Model</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE_VIEW_FX__USED_MODEL = eINSTANCE.getTableViewFX_UsedModel();

		/**
		 * The meta object literal for the '{@link de.dc.emf.javafx.model.javafx.impl.TreeViewFXImpl <em>Tree View FX</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.emf.javafx.model.javafx.impl.TreeViewFXImpl
		 * @see de.dc.emf.javafx.model.javafx.impl.JavafxPackageImpl#getTreeViewFX()
		 * @generated
		 */
		EClass TREE_VIEW_FX = eINSTANCE.getTreeViewFX();

		/**
		 * The meta object literal for the '<em><b>Show Property View</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TREE_VIEW_FX__SHOW_PROPERTY_VIEW = eINSTANCE.getTreeViewFX_ShowPropertyView();

		/**
		 * The meta object literal for the '<em><b>Used Model</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TREE_VIEW_FX__USED_MODEL = eINSTANCE.getTreeViewFX_UsedModel();

		/**
		 * The meta object literal for the '{@link de.dc.emf.javafx.model.javafx.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.emf.javafx.model.javafx.impl.NamedElementImpl
		 * @see de.dc.emf.javafx.model.javafx.impl.JavafxPackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '{@link de.dc.emf.javafx.model.javafx.impl.FilteredElementImpl <em>Filtered Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.emf.javafx.model.javafx.impl.FilteredElementImpl
		 * @see de.dc.emf.javafx.model.javafx.impl.JavafxPackageImpl#getFilteredElement()
		 * @generated
		 */
		EClass FILTERED_ELEMENT = eINSTANCE.getFilteredElement();

		/**
		 * The meta object literal for the '<em><b>Use Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILTERED_ELEMENT__USE_FILTER = eINSTANCE.getFilteredElement_UseFilter();

		/**
		 * The meta object literal for the '{@link de.dc.emf.javafx.model.javafx.impl.ChartFXImpl <em>Chart FX</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.emf.javafx.model.javafx.impl.ChartFXImpl
		 * @see de.dc.emf.javafx.model.javafx.impl.JavafxPackageImpl#getChartFX()
		 * @generated
		 */
		EClass CHART_FX = eINSTANCE.getChartFX();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHART_FX__TITLE = eINSTANCE.getChartFX_Title();

		/**
		 * The meta object literal for the '<em><b>Title Side</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHART_FX__TITLE_SIDE = eINSTANCE.getChartFX_TitleSide();

		/**
		 * The meta object literal for the '<em><b>Show Legend</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHART_FX__SHOW_LEGEND = eINSTANCE.getChartFX_ShowLegend();

		/**
		 * The meta object literal for the '<em><b>Legend Side</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHART_FX__LEGEND_SIDE = eINSTANCE.getChartFX_LegendSide();

		/**
		 * The meta object literal for the '<em><b>Series</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHART_FX__SERIES = eINSTANCE.getChartFX_Series();

		/**
		 * The meta object literal for the '{@link de.dc.emf.javafx.model.javafx.impl.XYChartFXImpl <em>XY Chart FX</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.emf.javafx.model.javafx.impl.XYChartFXImpl
		 * @see de.dc.emf.javafx.model.javafx.impl.JavafxPackageImpl#getXYChartFX()
		 * @generated
		 */
		EClass XY_CHART_FX = eINSTANCE.getXYChartFX();

		/**
		 * The meta object literal for the '<em><b>XAxis Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XY_CHART_FX__XAXIS_TYPE = eINSTANCE.getXYChartFX_XAxisType();

		/**
		 * The meta object literal for the '<em><b>YAxis Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XY_CHART_FX__YAXIS_TYPE = eINSTANCE.getXYChartFX_YAxisType();

		/**
		 * The meta object literal for the '<em><b>XAxis Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XY_CHART_FX__XAXIS_LABEL = eINSTANCE.getXYChartFX_XAxisLabel();

		/**
		 * The meta object literal for the '<em><b>YAxis Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XY_CHART_FX__YAXIS_LABEL = eINSTANCE.getXYChartFX_YAxisLabel();

		/**
		 * The meta object literal for the '{@link de.dc.emf.javafx.model.javafx.impl.ChartSeriesImpl <em>Chart Series</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.emf.javafx.model.javafx.impl.ChartSeriesImpl
		 * @see de.dc.emf.javafx.model.javafx.impl.JavafxPackageImpl#getChartSeries()
		 * @generated
		 */
		EClass CHART_SERIES = eINSTANCE.getChartSeries();

		/**
		 * The meta object literal for the '<em><b>Data List</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHART_SERIES__DATA_LIST = eINSTANCE.getChartSeries_DataList();

		/**
		 * The meta object literal for the '{@link de.dc.emf.javafx.model.javafx.impl.ChartFXDataImpl <em>Chart FX Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.emf.javafx.model.javafx.impl.ChartFXDataImpl
		 * @see de.dc.emf.javafx.model.javafx.impl.JavafxPackageImpl#getChartFXData()
		 * @generated
		 */
		EClass CHART_FX_DATA = eINSTANCE.getChartFXData();

		/**
		 * The meta object literal for the '<em><b>XValue</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHART_FX_DATA__XVALUE = eINSTANCE.getChartFXData_XValue();

		/**
		 * The meta object literal for the '<em><b>YValue</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHART_FX_DATA__YVALUE = eINSTANCE.getChartFXData_YValue();

		/**
		 * The meta object literal for the '{@link de.dc.emf.javafx.model.javafx.impl.LineChartFXImpl <em>Line Chart FX</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.emf.javafx.model.javafx.impl.LineChartFXImpl
		 * @see de.dc.emf.javafx.model.javafx.impl.JavafxPackageImpl#getLineChartFX()
		 * @generated
		 */
		EClass LINE_CHART_FX = eINSTANCE.getLineChartFX();

		/**
		 * The meta object literal for the '{@link de.dc.emf.javafx.model.javafx.impl.PieChartFXImpl <em>Pie Chart FX</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.emf.javafx.model.javafx.impl.PieChartFXImpl
		 * @see de.dc.emf.javafx.model.javafx.impl.JavafxPackageImpl#getPieChartFX()
		 * @generated
		 */
		EClass PIE_CHART_FX = eINSTANCE.getPieChartFX();

		/**
		 * The meta object literal for the '{@link de.dc.emf.javafx.model.javafx.impl.AreaChartFXImpl <em>Area Chart FX</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.emf.javafx.model.javafx.impl.AreaChartFXImpl
		 * @see de.dc.emf.javafx.model.javafx.impl.JavafxPackageImpl#getAreaChartFX()
		 * @generated
		 */
		EClass AREA_CHART_FX = eINSTANCE.getAreaChartFX();

		/**
		 * The meta object literal for the '{@link de.dc.emf.javafx.model.javafx.impl.BubbleChartFXImpl <em>Bubble Chart FX</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.emf.javafx.model.javafx.impl.BubbleChartFXImpl
		 * @see de.dc.emf.javafx.model.javafx.impl.JavafxPackageImpl#getBubbleChartFX()
		 * @generated
		 */
		EClass BUBBLE_CHART_FX = eINSTANCE.getBubbleChartFX();

		/**
		 * The meta object literal for the '{@link de.dc.emf.javafx.model.javafx.impl.ScatterChartFXImpl <em>Scatter Chart FX</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.emf.javafx.model.javafx.impl.ScatterChartFXImpl
		 * @see de.dc.emf.javafx.model.javafx.impl.JavafxPackageImpl#getScatterChartFX()
		 * @generated
		 */
		EClass SCATTER_CHART_FX = eINSTANCE.getScatterChartFX();

		/**
		 * The meta object literal for the '{@link de.dc.emf.javafx.model.javafx.impl.BarChartFXImpl <em>Bar Chart FX</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.emf.javafx.model.javafx.impl.BarChartFXImpl
		 * @see de.dc.emf.javafx.model.javafx.impl.JavafxPackageImpl#getBarChartFX()
		 * @generated
		 */
		EClass BAR_CHART_FX = eINSTANCE.getBarChartFX();

		/**
		 * The meta object literal for the '{@link de.dc.emf.javafx.model.javafx.BindingType <em>Binding Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.emf.javafx.model.javafx.BindingType
		 * @see de.dc.emf.javafx.model.javafx.impl.JavafxPackageImpl#getBindingType()
		 * @generated
		 */
		EEnum BINDING_TYPE = eINSTANCE.getBindingType();

		/**
		 * The meta object literal for the '{@link de.dc.emf.javafx.model.javafx.Orientation <em>Orientation</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.emf.javafx.model.javafx.Orientation
		 * @see de.dc.emf.javafx.model.javafx.impl.JavafxPackageImpl#getOrientation()
		 * @generated
		 */
		EEnum ORIENTATION = eINSTANCE.getOrientation();

		/**
		 * The meta object literal for the '{@link de.dc.emf.javafx.model.javafx.AxisType <em>Axis Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.emf.javafx.model.javafx.AxisType
		 * @see de.dc.emf.javafx.model.javafx.impl.JavafxPackageImpl#getAxisType()
		 * @generated
		 */
		EEnum AXIS_TYPE = eINSTANCE.getAxisType();

	}

} //JavafxPackage
