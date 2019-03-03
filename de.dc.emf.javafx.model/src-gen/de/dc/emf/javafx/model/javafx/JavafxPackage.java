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
	int NAMED_ELEMENT = 10;

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
	 * The number of structural features of the '<em>Project FX</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_FX_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 4;

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
	 * The number of structural features of the '<em>Control FX</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FX_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Control FX</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FX_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

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
	 * The feature id for the '<em><b>Use Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_COLUMN_FX__USE_FILTER = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_COLUMN_FX__WIDTH = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Used Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_COLUMN_FX__USED_ATTRIBUTE = NAMED_ELEMENT_FEATURE_COUNT + 2;

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
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_VIEW_FX__NAME = CONTROL_FX__NAME;

	/**
	 * The feature id for the '<em><b>Use Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_VIEW_FX__USE_FILTER = CONTROL_FX_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Columns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_VIEW_FX__COLUMNS = CONTROL_FX_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Used Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_VIEW_FX__USED_MODEL = CONTROL_FX_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Table View FX</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_VIEW_FX_FEATURE_COUNT = CONTROL_FX_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Table View FX</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_VIEW_FX_OPERATION_COUNT = CONTROL_FX_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dc.emf.javafx.model.javafx.impl.FilteredElementImpl <em>Filtered Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.emf.javafx.model.javafx.impl.FilteredElementImpl
	 * @see de.dc.emf.javafx.model.javafx.impl.JavafxPackageImpl#getFilteredElement()
	 * @generated
	 */
	int FILTERED_ELEMENT = 11;

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
	 * The meta object id for the '{@link de.dc.emf.javafx.model.javafx.BindingType <em>Binding Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.emf.javafx.model.javafx.BindingType
	 * @see de.dc.emf.javafx.model.javafx.impl.JavafxPackageImpl#getBindingType()
	 * @generated
	 */
	int BINDING_TYPE = 12;

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
	 * Returns the meta object for class '{@link de.dc.emf.javafx.model.javafx.ControlFX <em>Control FX</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control FX</em>'.
	 * @see de.dc.emf.javafx.model.javafx.ControlFX
	 * @generated
	 */
	EClass getControlFX();

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
	 * Returns the meta object for the reference '{@link de.dc.emf.javafx.model.javafx.TableViewFX#getUsedModel <em>Used Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Used Model</em>'.
	 * @see de.dc.emf.javafx.model.javafx.TableViewFX#getUsedModel()
	 * @see #getTableViewFX()
	 * @generated
	 */
	EReference getTableViewFX_UsedModel();

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
	 * Returns the meta object for enum '{@link de.dc.emf.javafx.model.javafx.BindingType <em>Binding Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Binding Type</em>'.
	 * @see de.dc.emf.javafx.model.javafx.BindingType
	 * @generated
	 */
	EEnum getBindingType();

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
		 * The meta object literal for the '{@link de.dc.emf.javafx.model.javafx.impl.ControlFXImpl <em>Control FX</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.emf.javafx.model.javafx.impl.ControlFXImpl
		 * @see de.dc.emf.javafx.model.javafx.impl.JavafxPackageImpl#getControlFX()
		 * @generated
		 */
		EClass CONTROL_FX = eINSTANCE.getControlFX();

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
		 * The meta object literal for the '<em><b>Columns</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE_VIEW_FX__COLUMNS = eINSTANCE.getTableViewFX_Columns();

		/**
		 * The meta object literal for the '<em><b>Used Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE_VIEW_FX__USED_MODEL = eINSTANCE.getTableViewFX_UsedModel();

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
		 * The meta object literal for the '{@link de.dc.emf.javafx.model.javafx.BindingType <em>Binding Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.emf.javafx.model.javafx.BindingType
		 * @see de.dc.emf.javafx.model.javafx.impl.JavafxPackageImpl#getBindingType()
		 * @generated
		 */
		EEnum BINDING_TYPE = eINSTANCE.getBindingType();

	}

} //JavafxPackage
