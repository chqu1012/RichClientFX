/**
 */
package de.dc.emf.javafx.model.javafx.impl;

import de.dc.emf.javafx.model.javafx.AreaChartFX;
import de.dc.emf.javafx.model.javafx.AttributeFX;
import de.dc.emf.javafx.model.javafx.AxisType;
import de.dc.emf.javafx.model.javafx.BarChartFX;
import de.dc.emf.javafx.model.javafx.Bean;
import de.dc.emf.javafx.model.javafx.Binding;
import de.dc.emf.javafx.model.javafx.BindingProperty;
import de.dc.emf.javafx.model.javafx.BindingType;
import de.dc.emf.javafx.model.javafx.BubbleChartFX;
import de.dc.emf.javafx.model.javafx.ChartFX;
import de.dc.emf.javafx.model.javafx.ChartFXData;
import de.dc.emf.javafx.model.javafx.ChartSeries;
import de.dc.emf.javafx.model.javafx.ControlFX;
import de.dc.emf.javafx.model.javafx.DerivedBean;
import de.dc.emf.javafx.model.javafx.FilteredElement;
import de.dc.emf.javafx.model.javafx.JavafxFactory;
import de.dc.emf.javafx.model.javafx.JavafxPackage;
import de.dc.emf.javafx.model.javafx.LineChartFX;
import de.dc.emf.javafx.model.javafx.ModelFX;
import de.dc.emf.javafx.model.javafx.NamedElement;
import de.dc.emf.javafx.model.javafx.Orientation;
import de.dc.emf.javafx.model.javafx.PieChartFX;
import de.dc.emf.javafx.model.javafx.ProjectFX;
import de.dc.emf.javafx.model.javafx.ScatterChartFX;
import de.dc.emf.javafx.model.javafx.TableColumnFX;
import de.dc.emf.javafx.model.javafx.TableViewFX;
import de.dc.emf.javafx.model.javafx.TreeViewFX;
import de.dc.emf.javafx.model.javafx.XYChartFX;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.xtext.common.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class JavafxPackageImpl extends EPackageImpl implements JavafxPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass projectFXEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass controlFXEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tableColumnFXEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelFXEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeFXEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass beanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass derivedBeanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bindingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bindingPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tableViewFXEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass treeViewFXEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass filteredElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass chartFXEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xyChartFXEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass chartSeriesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass chartFXDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lineChartFXEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pieChartFXEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass areaChartFXEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bubbleChartFXEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scatterChartFXEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass barChartFXEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum bindingTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum orientationEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum axisTypeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see de.dc.emf.javafx.model.javafx.JavafxPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private JavafxPackageImpl() {
		super(eNS_URI, JavafxFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link JavafxPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static JavafxPackage init() {
		if (isInited)
			return (JavafxPackage) EPackage.Registry.INSTANCE.getEPackage(JavafxPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredJavafxPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		JavafxPackageImpl theJavafxPackage = registeredJavafxPackage instanceof JavafxPackageImpl
				? (JavafxPackageImpl) registeredJavafxPackage
				: new JavafxPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();
		TypesPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theJavafxPackage.createPackageContents();

		// Initialize created meta-data
		theJavafxPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theJavafxPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(JavafxPackage.eNS_URI, theJavafxPackage);
		return theJavafxPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProjectFX() {
		return projectFXEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProjectFX_Controls() {
		return (EReference) projectFXEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProjectFX_PackagePath() {
		return (EAttribute) projectFXEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProjectFX_Models() {
		return (EReference) projectFXEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProjectFX_Bindings() {
		return (EReference) projectFXEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProjectFX_Charts() {
		return (EReference) projectFXEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getControlFX() {
		return controlFXEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getControlFX_GenerateDemo() {
		return (EAttribute) controlFXEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTableColumnFX() {
		return tableColumnFXEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTableColumnFX_Width() {
		return (EAttribute) tableColumnFXEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTableColumnFX_UsedAttribute() {
		return (EReference) tableColumnFXEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTableColumnFX_UseFilter() {
		return (EAttribute) tableColumnFXEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getModelFX() {
		return modelFXEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getModelFX_Attributes() {
		return (EReference) modelFXEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAttributeFX() {
		return attributeFXEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAttributeFX_Type() {
		return (EAttribute) attributeFXEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBean() {
		return beanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDerivedBean() {
		return derivedBeanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDerivedBean_InstanceType() {
		return (EAttribute) derivedBeanEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBinding() {
		return bindingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBinding_Name() {
		return (EAttribute) bindingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBinding_Property() {
		return (EReference) bindingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBindingProperty() {
		return bindingPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBindingProperty_Name() {
		return (EAttribute) bindingPropertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBindingProperty_Type() {
		return (EAttribute) bindingPropertyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTableViewFX() {
		return tableViewFXEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTableViewFX_ShowPropertyView() {
		return (EAttribute) tableViewFXEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTableViewFX_ShowToolbar() {
		return (EAttribute) tableViewFXEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTableViewFX_Columns() {
		return (EReference) tableViewFXEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTableViewFX_UsedModel() {
		return (EReference) tableViewFXEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTreeViewFX() {
		return treeViewFXEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTreeViewFX_ShowPropertyView() {
		return (EAttribute) treeViewFXEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTreeViewFX_UsedModel() {
		return (EReference) treeViewFXEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNamedElement() {
		return namedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNamedElement_Name() {
		return (EAttribute) namedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFilteredElement() {
		return filteredElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFilteredElement_UseFilter() {
		return (EAttribute) filteredElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getChartFX() {
		return chartFXEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getChartFX_Title() {
		return (EAttribute) chartFXEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getChartFX_TitleSide() {
		return (EAttribute) chartFXEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getChartFX_ShowLegend() {
		return (EAttribute) chartFXEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getChartFX_LegendSide() {
		return (EAttribute) chartFXEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getChartFX_Series() {
		return (EReference) chartFXEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getXYChartFX() {
		return xyChartFXEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getXYChartFX_XAxisType() {
		return (EAttribute) xyChartFXEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getXYChartFX_YAxisType() {
		return (EAttribute) xyChartFXEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getXYChartFX_XAxisLabel() {
		return (EAttribute) xyChartFXEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getXYChartFX_YAxisLabel() {
		return (EAttribute) xyChartFXEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getChartSeries() {
		return chartSeriesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getChartSeries_DataList() {
		return (EReference) chartSeriesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getChartFXData() {
		return chartFXDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getChartFXData_XValue() {
		return (EAttribute) chartFXDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getChartFXData_YValue() {
		return (EAttribute) chartFXDataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLineChartFX() {
		return lineChartFXEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPieChartFX() {
		return pieChartFXEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAreaChartFX() {
		return areaChartFXEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBubbleChartFX() {
		return bubbleChartFXEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getScatterChartFX() {
		return scatterChartFXEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBarChartFX() {
		return barChartFXEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getBindingType() {
		return bindingTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getOrientation() {
		return orientationEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getAxisType() {
		return axisTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public JavafxFactory getJavafxFactory() {
		return (JavafxFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		projectFXEClass = createEClass(PROJECT_FX);
		createEReference(projectFXEClass, PROJECT_FX__CONTROLS);
		createEAttribute(projectFXEClass, PROJECT_FX__PACKAGE_PATH);
		createEReference(projectFXEClass, PROJECT_FX__MODELS);
		createEReference(projectFXEClass, PROJECT_FX__BINDINGS);
		createEReference(projectFXEClass, PROJECT_FX__CHARTS);

		controlFXEClass = createEClass(CONTROL_FX);
		createEAttribute(controlFXEClass, CONTROL_FX__GENERATE_DEMO);

		tableColumnFXEClass = createEClass(TABLE_COLUMN_FX);
		createEAttribute(tableColumnFXEClass, TABLE_COLUMN_FX__WIDTH);
		createEReference(tableColumnFXEClass, TABLE_COLUMN_FX__USED_ATTRIBUTE);
		createEAttribute(tableColumnFXEClass, TABLE_COLUMN_FX__USE_FILTER);

		modelFXEClass = createEClass(MODEL_FX);
		createEReference(modelFXEClass, MODEL_FX__ATTRIBUTES);

		attributeFXEClass = createEClass(ATTRIBUTE_FX);
		createEAttribute(attributeFXEClass, ATTRIBUTE_FX__TYPE);

		beanEClass = createEClass(BEAN);

		derivedBeanEClass = createEClass(DERIVED_BEAN);
		createEAttribute(derivedBeanEClass, DERIVED_BEAN__INSTANCE_TYPE);

		bindingEClass = createEClass(BINDING);
		createEAttribute(bindingEClass, BINDING__NAME);
		createEReference(bindingEClass, BINDING__PROPERTY);

		bindingPropertyEClass = createEClass(BINDING_PROPERTY);
		createEAttribute(bindingPropertyEClass, BINDING_PROPERTY__NAME);
		createEAttribute(bindingPropertyEClass, BINDING_PROPERTY__TYPE);

		tableViewFXEClass = createEClass(TABLE_VIEW_FX);
		createEAttribute(tableViewFXEClass, TABLE_VIEW_FX__SHOW_PROPERTY_VIEW);
		createEAttribute(tableViewFXEClass, TABLE_VIEW_FX__SHOW_TOOLBAR);
		createEReference(tableViewFXEClass, TABLE_VIEW_FX__COLUMNS);
		createEReference(tableViewFXEClass, TABLE_VIEW_FX__USED_MODEL);

		treeViewFXEClass = createEClass(TREE_VIEW_FX);
		createEAttribute(treeViewFXEClass, TREE_VIEW_FX__SHOW_PROPERTY_VIEW);
		createEReference(treeViewFXEClass, TREE_VIEW_FX__USED_MODEL);

		namedElementEClass = createEClass(NAMED_ELEMENT);
		createEAttribute(namedElementEClass, NAMED_ELEMENT__NAME);

		filteredElementEClass = createEClass(FILTERED_ELEMENT);
		createEAttribute(filteredElementEClass, FILTERED_ELEMENT__USE_FILTER);

		chartFXEClass = createEClass(CHART_FX);
		createEAttribute(chartFXEClass, CHART_FX__TITLE);
		createEAttribute(chartFXEClass, CHART_FX__TITLE_SIDE);
		createEAttribute(chartFXEClass, CHART_FX__SHOW_LEGEND);
		createEAttribute(chartFXEClass, CHART_FX__LEGEND_SIDE);
		createEReference(chartFXEClass, CHART_FX__SERIES);

		xyChartFXEClass = createEClass(XY_CHART_FX);
		createEAttribute(xyChartFXEClass, XY_CHART_FX__XAXIS_TYPE);
		createEAttribute(xyChartFXEClass, XY_CHART_FX__YAXIS_TYPE);
		createEAttribute(xyChartFXEClass, XY_CHART_FX__XAXIS_LABEL);
		createEAttribute(xyChartFXEClass, XY_CHART_FX__YAXIS_LABEL);

		chartSeriesEClass = createEClass(CHART_SERIES);
		createEReference(chartSeriesEClass, CHART_SERIES__DATA_LIST);

		chartFXDataEClass = createEClass(CHART_FX_DATA);
		createEAttribute(chartFXDataEClass, CHART_FX_DATA__XVALUE);
		createEAttribute(chartFXDataEClass, CHART_FX_DATA__YVALUE);

		lineChartFXEClass = createEClass(LINE_CHART_FX);

		pieChartFXEClass = createEClass(PIE_CHART_FX);

		areaChartFXEClass = createEClass(AREA_CHART_FX);

		bubbleChartFXEClass = createEClass(BUBBLE_CHART_FX);

		scatterChartFXEClass = createEClass(SCATTER_CHART_FX);

		barChartFXEClass = createEClass(BAR_CHART_FX);

		// Create enums
		bindingTypeEEnum = createEEnum(BINDING_TYPE);
		orientationEEnum = createEEnum(ORIENTATION);
		axisTypeEEnum = createEEnum(AXIS_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		EcorePackage theEcorePackage = (EcorePackage) EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
		TypesPackage theTypesPackage = (TypesPackage) EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		projectFXEClass.getESuperTypes().add(this.getNamedElement());
		controlFXEClass.getESuperTypes().add(this.getNamedElement());
		tableColumnFXEClass.getESuperTypes().add(this.getNamedElement());
		modelFXEClass.getESuperTypes().add(this.getNamedElement());
		attributeFXEClass.getESuperTypes().add(this.getNamedElement());
		beanEClass.getESuperTypes().add(this.getModelFX());
		derivedBeanEClass.getESuperTypes().add(this.getModelFX());
		tableViewFXEClass.getESuperTypes().add(this.getControlFX());
		treeViewFXEClass.getESuperTypes().add(this.getControlFX());
		chartFXEClass.getESuperTypes().add(this.getNamedElement());
		xyChartFXEClass.getESuperTypes().add(this.getChartFX());
		chartSeriesEClass.getESuperTypes().add(this.getNamedElement());
		lineChartFXEClass.getESuperTypes().add(this.getXYChartFX());
		pieChartFXEClass.getESuperTypes().add(this.getChartFX());
		areaChartFXEClass.getESuperTypes().add(this.getXYChartFX());
		bubbleChartFXEClass.getESuperTypes().add(this.getXYChartFX());
		scatterChartFXEClass.getESuperTypes().add(this.getXYChartFX());
		barChartFXEClass.getESuperTypes().add(this.getChartFX());

		// Initialize classes, features, and operations; add parameters
		initEClass(projectFXEClass, ProjectFX.class, "ProjectFX", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProjectFX_Controls(), this.getControlFX(), null, "controls", null, 0, -1, ProjectFX.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProjectFX_PackagePath(), theEcorePackage.getEString(), "packagePath", null, 0, 1,
				ProjectFX.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getProjectFX_Models(), this.getModelFX(), null, "models", null, 0, -1, ProjectFX.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProjectFX_Bindings(), this.getBinding(), null, "bindings", null, 0, -1, ProjectFX.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProjectFX_Charts(), this.getChartFX(), null, "charts", null, 0, -1, ProjectFX.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(controlFXEClass, ControlFX.class, "ControlFX", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getControlFX_GenerateDemo(), theEcorePackage.getEBoolean(), "generateDemo", "false", 0, 1,
				ControlFX.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(tableColumnFXEClass, TableColumnFX.class, "TableColumnFX", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTableColumnFX_Width(), theEcorePackage.getEInt(), "width", "200", 0, 1, TableColumnFX.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getTableColumnFX_UsedAttribute(), this.getAttributeFX(), null, "usedAttribute", null, 0, 1,
				TableColumnFX.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTableColumnFX_UseFilter(), theEcorePackage.getEBoolean(), "useFilter", null, 0, 1,
				TableColumnFX.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(modelFXEClass, ModelFX.class, "ModelFX", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModelFX_Attributes(), this.getAttributeFX(), null, "attributes", null, 0, -1, ModelFX.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attributeFXEClass, AttributeFX.class, "AttributeFX", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAttributeFX_Type(), theEcorePackage.getEString(), "type", null, 0, 1, AttributeFX.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(beanEClass, Bean.class, "Bean", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(derivedBeanEClass, DerivedBean.class, "DerivedBean", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDerivedBean_InstanceType(), theEcorePackage.getEString(), "instanceType", null, 0, 1,
				DerivedBean.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(bindingEClass, Binding.class, "Binding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBinding_Name(), theEcorePackage.getEString(), "name", null, 0, 1, Binding.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getBinding_Property(), this.getBindingProperty(), null, "property", null, 0, -1, Binding.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bindingPropertyEClass, BindingProperty.class, "BindingProperty", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBindingProperty_Name(), theEcorePackage.getEString(), "name", null, 0, 1,
				BindingProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getBindingProperty_Type(), this.getBindingType(), "type", null, 0, 1, BindingProperty.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(tableViewFXEClass, TableViewFX.class, "TableViewFX", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTableViewFX_ShowPropertyView(), theEcorePackage.getEBoolean(), "showPropertyView", "true", 0,
				1, TableViewFX.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getTableViewFX_ShowToolbar(), theEcorePackage.getEBoolean(), "showToolbar", "true", 0, 1,
				TableViewFX.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getTableViewFX_Columns(), this.getTableColumnFX(), null, "columns", null, 0, -1,
				TableViewFX.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTableViewFX_UsedModel(), theTypesPackage.getJvmTypeReference(), null, "usedModel", null, 0, 1,
				TableViewFX.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(treeViewFXEClass, TreeViewFX.class, "TreeViewFX", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTreeViewFX_ShowPropertyView(), theEcorePackage.getEBoolean(), "showPropertyView", "true", 0,
				1, TreeViewFX.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getTreeViewFX_UsedModel(), theTypesPackage.getJvmTypeReference(), null, "usedModel", null, 0, 1,
				TreeViewFX.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(namedElementEClass, NamedElement.class, "NamedElement", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamedElement_Name(), theEcorePackage.getEString(), "name", null, 0, 1, NamedElement.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(filteredElementEClass, FilteredElement.class, "FilteredElement", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFilteredElement_UseFilter(), theEcorePackage.getEBoolean(), "useFilter", null, 0, 1,
				FilteredElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(chartFXEClass, ChartFX.class, "ChartFX", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getChartFX_Title(), theEcorePackage.getEString(), "title", " ", 0, 1, ChartFX.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getChartFX_TitleSide(), this.getOrientation(), "titleSide", "Top", 0, 1, ChartFX.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getChartFX_ShowLegend(), theEcorePackage.getEBoolean(), "showLegend", "true", 0, 1,
				ChartFX.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getChartFX_LegendSide(), this.getOrientation(), "legendSide", "Bottom", 0, 1, ChartFX.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getChartFX_Series(), this.getChartSeries(), null, "series", null, 0, -1, ChartFX.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(xyChartFXEClass, XYChartFX.class, "XYChartFX", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getXYChartFX_XAxisType(), this.getAxisType(), "xAxisType", null, 0, 1, XYChartFX.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getXYChartFX_YAxisType(), this.getAxisType(), "yAxisType", null, 0, 1, XYChartFX.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getXYChartFX_XAxisLabel(), theEcorePackage.getEString(), "xAxisLabel", null, 0, 1,
				XYChartFX.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getXYChartFX_YAxisLabel(), theEcorePackage.getEString(), "yAxisLabel", null, 0, 1,
				XYChartFX.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(chartSeriesEClass, ChartSeries.class, "ChartSeries", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getChartSeries_DataList(), this.getChartFXData(), null, "dataList", null, 0, -1,
				ChartSeries.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(chartFXDataEClass, ChartFXData.class, "ChartFXData", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getChartFXData_XValue(), theEcorePackage.getEString(), "xValue", null, 0, 1, ChartFXData.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getChartFXData_YValue(), theEcorePackage.getEString(), "yValue", null, 0, 1, ChartFXData.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(lineChartFXEClass, LineChartFX.class, "LineChartFX", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(pieChartFXEClass, PieChartFX.class, "PieChartFX", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(areaChartFXEClass, AreaChartFX.class, "AreaChartFX", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(bubbleChartFXEClass, BubbleChartFX.class, "BubbleChartFX", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(scatterChartFXEClass, ScatterChartFX.class, "ScatterChartFX", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(barChartFXEClass, BarChartFX.class, "BarChartFX", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(bindingTypeEEnum, BindingType.class, "BindingType");
		addEEnumLiteral(bindingTypeEEnum, BindingType.STRING_PROPERTY);
		addEEnumLiteral(bindingTypeEEnum, BindingType.INTEGER_PROPERTY);
		addEEnumLiteral(bindingTypeEEnum, BindingType.DOUBLE_PROPERTY);
		addEEnumLiteral(bindingTypeEEnum, BindingType.FLOAT_PROPERTY);
		addEEnumLiteral(bindingTypeEEnum, BindingType.BOOLEAN_PROPERTY);
		addEEnumLiteral(bindingTypeEEnum, BindingType.OBJECT_PROPERTY);
		addEEnumLiteral(bindingTypeEEnum, BindingType.OBSERVABLE_LIST);

		initEEnum(orientationEEnum, Orientation.class, "Orientation");
		addEEnumLiteral(orientationEEnum, Orientation.LEFT);
		addEEnumLiteral(orientationEEnum, Orientation.RIGHT);
		addEEnumLiteral(orientationEEnum, Orientation.TOP);
		addEEnumLiteral(orientationEEnum, Orientation.BOTTOM);

		initEEnum(axisTypeEEnum, AxisType.class, "AxisType");
		addEEnumLiteral(axisTypeEEnum, AxisType.NUMBER);
		addEEnumLiteral(axisTypeEEnum, AxisType.CATEGORY);

		// Create resource
		createResource(eNS_URI);
	}

} //JavafxPackageImpl
