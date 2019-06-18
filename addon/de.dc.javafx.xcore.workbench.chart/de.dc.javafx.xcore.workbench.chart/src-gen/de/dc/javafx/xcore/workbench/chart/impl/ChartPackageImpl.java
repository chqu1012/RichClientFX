/**
 */
package de.dc.javafx.xcore.workbench.chart.impl;

import de.dc.javafx.xcore.workbench.chart.AreaChart3dFX;
import de.dc.javafx.xcore.workbench.chart.AreaChartFX;
import de.dc.javafx.xcore.workbench.chart.BarChart3dFX;
import de.dc.javafx.xcore.workbench.chart.BarChartFX;
import de.dc.javafx.xcore.workbench.chart.BubbleChartFX;
import de.dc.javafx.xcore.workbench.chart.CategoryChartFX;
import de.dc.javafx.xcore.workbench.chart.CategorySeriesFX;
import de.dc.javafx.xcore.workbench.chart.CategoryValueFX;
import de.dc.javafx.xcore.workbench.chart.ChartFX;
import de.dc.javafx.xcore.workbench.chart.ChartFXConfig;
import de.dc.javafx.xcore.workbench.chart.ChartFactory;
import de.dc.javafx.xcore.workbench.chart.ChartPackage;
import de.dc.javafx.xcore.workbench.chart.ChartProject;
import de.dc.javafx.xcore.workbench.chart.ChartSide;
import de.dc.javafx.xcore.workbench.chart.LineChartFX;
import de.dc.javafx.xcore.workbench.chart.PieChartFX;
import de.dc.javafx.xcore.workbench.chart.ScatterChartFX;
import de.dc.javafx.xcore.workbench.chart.SeriesFX;
import de.dc.javafx.xcore.workbench.chart.XYChartFX;
import de.dc.javafx.xcore.workbench.chart.XYValueFX;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ChartPackageImpl extends EPackageImpl implements ChartPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass chartProjectEClass = null;

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
	private EClass categoryChartFXEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass categorySeriesFXEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass seriesFXEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xyValueFXEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass categoryValueFXEClass = null;

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
	private EClass areaChartFXEClass = null;

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
	private EClass bubbleChartFXEClass = null;

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
	private EClass pieChartFXEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass areaChart3dFXEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass barChart3dFXEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass chartFXConfigEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum chartSideEEnum = null;

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
	 * @see de.dc.javafx.xcore.workbench.chart.ChartPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ChartPackageImpl() {
		super(eNS_URI, ChartFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ChartPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ChartPackage init() {
		if (isInited)
			return (ChartPackage) EPackage.Registry.INSTANCE.getEPackage(ChartPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredChartPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ChartPackageImpl theChartPackage = registeredChartPackage instanceof ChartPackageImpl
				? (ChartPackageImpl) registeredChartPackage
				: new ChartPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theChartPackage.createPackageContents();

		// Initialize created meta-data
		theChartPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theChartPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ChartPackage.eNS_URI, theChartPackage);
		return theChartPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getChartProject() {
		return chartProjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getChartProject_Name() {
		return (EAttribute) chartProjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getChartProject_Charts() {
		return (EReference) chartProjectEClass.getEStructuralFeatures().get(1);
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
	public EAttribute getChartFX_Name() {
		return (EAttribute) chartFXEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getChartFX_XAxisLabel() {
		return (EAttribute) chartFXEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getChartFX_YAxisLabel() {
		return (EAttribute) chartFXEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getChartFX_ZAxisLabel() {
		return (EAttribute) chartFXEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getChartFX_Config() {
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
	public EReference getXYChartFX_Series() {
		return (EReference) xyChartFXEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCategoryChartFX() {
		return categoryChartFXEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCategoryChartFX_Series() {
		return (EReference) categoryChartFXEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCategorySeriesFX() {
		return categorySeriesFXEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCategorySeriesFX_Name() {
		return (EAttribute) categorySeriesFXEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCategorySeriesFX_Values() {
		return (EReference) categorySeriesFXEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSeriesFX() {
		return seriesFXEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSeriesFX_Name() {
		return (EAttribute) seriesFXEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSeriesFX_Values() {
		return (EReference) seriesFXEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getXYValueFX() {
		return xyValueFXEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getXYValueFX_X() {
		return (EAttribute) xyValueFXEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getXYValueFX_Y() {
		return (EAttribute) xyValueFXEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCategoryValueFX() {
		return categoryValueFXEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCategoryValueFX_Name() {
		return (EAttribute) categoryValueFXEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCategoryValueFX_Value() {
		return (EAttribute) categoryValueFXEClass.getEStructuralFeatures().get(1);
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
	public EClass getAreaChartFX() {
		return areaChartFXEClass;
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
	public EClass getBubbleChartFX() {
		return bubbleChartFXEClass;
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
	public EClass getPieChartFX() {
		return pieChartFXEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAreaChart3dFX() {
		return areaChart3dFXEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBarChart3dFX() {
		return barChart3dFXEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getChartFXConfig() {
		return chartFXConfigEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getChartFXConfig_SideLegend() {
		return (EAttribute) chartFXConfigEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getChartFXConfig_TitleSide() {
		return (EAttribute) chartFXConfigEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getChartFXConfig_ShowLegend() {
		return (EAttribute) chartFXConfigEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getChartFXConfig_IsAnimated() {
		return (EAttribute) chartFXConfigEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getChartFXConfig_AlternativeColumnFillVisible() {
		return (EAttribute) chartFXConfigEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getChartFXConfig_AlternativeRowFillVisible() {
		return (EAttribute) chartFXConfigEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getChartFXConfig_HorizontalGridLinesVisible() {
		return (EAttribute) chartFXConfigEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getChartFXConfig_HorizontalZeroLinesVisible() {
		return (EAttribute) chartFXConfigEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getChartFXConfig_VerticalGridLinesVisible() {
		return (EAttribute) chartFXConfigEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getChartFXConfig_VerticalZeroLinesVisible() {
		return (EAttribute) chartFXConfigEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getChartSide() {
		return chartSideEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ChartFactory getChartFactory() {
		return (ChartFactory) getEFactoryInstance();
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
		chartProjectEClass = createEClass(CHART_PROJECT);
		createEAttribute(chartProjectEClass, CHART_PROJECT__NAME);
		createEReference(chartProjectEClass, CHART_PROJECT__CHARTS);

		chartFXEClass = createEClass(CHART_FX);
		createEAttribute(chartFXEClass, CHART_FX__NAME);
		createEAttribute(chartFXEClass, CHART_FX__XAXIS_LABEL);
		createEAttribute(chartFXEClass, CHART_FX__YAXIS_LABEL);
		createEAttribute(chartFXEClass, CHART_FX__ZAXIS_LABEL);
		createEReference(chartFXEClass, CHART_FX__CONFIG);

		xyChartFXEClass = createEClass(XY_CHART_FX);
		createEReference(xyChartFXEClass, XY_CHART_FX__SERIES);

		categoryChartFXEClass = createEClass(CATEGORY_CHART_FX);
		createEReference(categoryChartFXEClass, CATEGORY_CHART_FX__SERIES);

		categorySeriesFXEClass = createEClass(CATEGORY_SERIES_FX);
		createEAttribute(categorySeriesFXEClass, CATEGORY_SERIES_FX__NAME);
		createEReference(categorySeriesFXEClass, CATEGORY_SERIES_FX__VALUES);

		seriesFXEClass = createEClass(SERIES_FX);
		createEAttribute(seriesFXEClass, SERIES_FX__NAME);
		createEReference(seriesFXEClass, SERIES_FX__VALUES);

		xyValueFXEClass = createEClass(XY_VALUE_FX);
		createEAttribute(xyValueFXEClass, XY_VALUE_FX__X);
		createEAttribute(xyValueFXEClass, XY_VALUE_FX__Y);

		categoryValueFXEClass = createEClass(CATEGORY_VALUE_FX);
		createEAttribute(categoryValueFXEClass, CATEGORY_VALUE_FX__NAME);
		createEAttribute(categoryValueFXEClass, CATEGORY_VALUE_FX__VALUE);

		lineChartFXEClass = createEClass(LINE_CHART_FX);

		areaChartFXEClass = createEClass(AREA_CHART_FX);

		scatterChartFXEClass = createEClass(SCATTER_CHART_FX);

		bubbleChartFXEClass = createEClass(BUBBLE_CHART_FX);

		barChartFXEClass = createEClass(BAR_CHART_FX);

		pieChartFXEClass = createEClass(PIE_CHART_FX);

		areaChart3dFXEClass = createEClass(AREA_CHART3D_FX);

		barChart3dFXEClass = createEClass(BAR_CHART3D_FX);

		chartFXConfigEClass = createEClass(CHART_FX_CONFIG);
		createEAttribute(chartFXConfigEClass, CHART_FX_CONFIG__SIDE_LEGEND);
		createEAttribute(chartFXConfigEClass, CHART_FX_CONFIG__TITLE_SIDE);
		createEAttribute(chartFXConfigEClass, CHART_FX_CONFIG__SHOW_LEGEND);
		createEAttribute(chartFXConfigEClass, CHART_FX_CONFIG__IS_ANIMATED);
		createEAttribute(chartFXConfigEClass, CHART_FX_CONFIG__ALTERNATIVE_COLUMN_FILL_VISIBLE);
		createEAttribute(chartFXConfigEClass, CHART_FX_CONFIG__ALTERNATIVE_ROW_FILL_VISIBLE);
		createEAttribute(chartFXConfigEClass, CHART_FX_CONFIG__HORIZONTAL_GRID_LINES_VISIBLE);
		createEAttribute(chartFXConfigEClass, CHART_FX_CONFIG__HORIZONTAL_ZERO_LINES_VISIBLE);
		createEAttribute(chartFXConfigEClass, CHART_FX_CONFIG__VERTICAL_GRID_LINES_VISIBLE);
		createEAttribute(chartFXConfigEClass, CHART_FX_CONFIG__VERTICAL_ZERO_LINES_VISIBLE);

		// Create enums
		chartSideEEnum = createEEnum(CHART_SIDE);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		xyChartFXEClass.getESuperTypes().add(this.getChartFX());
		categoryChartFXEClass.getESuperTypes().add(this.getChartFX());
		lineChartFXEClass.getESuperTypes().add(this.getXYChartFX());
		areaChartFXEClass.getESuperTypes().add(this.getXYChartFX());
		scatterChartFXEClass.getESuperTypes().add(this.getXYChartFX());
		bubbleChartFXEClass.getESuperTypes().add(this.getXYChartFX());
		barChartFXEClass.getESuperTypes().add(this.getCategoryChartFX());
		pieChartFXEClass.getESuperTypes().add(this.getCategoryChartFX());
		areaChart3dFXEClass.getESuperTypes().add(this.getXYChartFX());
		barChart3dFXEClass.getESuperTypes().add(this.getXYChartFX());

		// Initialize classes, features, and operations; add parameters
		initEClass(chartProjectEClass, ChartProject.class, "ChartProject", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getChartProject_Name(), theEcorePackage.getEString(), "name", null, 0, 1, ChartProject.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getChartProject_Charts(), this.getChartFX(), null, "charts", null, 0, -1, ChartProject.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(chartFXEClass, ChartFX.class, "ChartFX", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getChartFX_Name(), theEcorePackage.getEString(), "name", null, 0, 1, ChartFX.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getChartFX_XAxisLabel(), theEcorePackage.getEString(), "xAxisLabel", "", 0, 1, ChartFX.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getChartFX_YAxisLabel(), theEcorePackage.getEString(), "yAxisLabel", "", 0, 1, ChartFX.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getChartFX_ZAxisLabel(), theEcorePackage.getEString(), "zAxisLabel", "", 0, 1, ChartFX.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getChartFX_Config(), this.getChartFXConfig(), null, "config", null, 0, 1, ChartFX.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(xyChartFXEClass, XYChartFX.class, "XYChartFX", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getXYChartFX_Series(), this.getSeriesFX(), null, "series", null, 0, -1, XYChartFX.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(categoryChartFXEClass, CategoryChartFX.class, "CategoryChartFX", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCategoryChartFX_Series(), this.getCategorySeriesFX(), null, "series", null, 0, -1,
				CategoryChartFX.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(categorySeriesFXEClass, CategorySeriesFX.class, "CategorySeriesFX", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCategorySeriesFX_Name(), theEcorePackage.getEString(), "name", null, 0, 1,
				CategorySeriesFX.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getCategorySeriesFX_Values(), this.getCategoryValueFX(), null, "values", null, 0, -1,
				CategorySeriesFX.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(seriesFXEClass, SeriesFX.class, "SeriesFX", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSeriesFX_Name(), theEcorePackage.getEString(), "name", null, 0, 1, SeriesFX.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getSeriesFX_Values(), this.getXYValueFX(), null, "values", null, 0, -1, SeriesFX.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(xyValueFXEClass, XYValueFX.class, "XYValueFX", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getXYValueFX_X(), theEcorePackage.getEDouble(), "x", "0", 0, 1, XYValueFX.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXYValueFX_Y(), theEcorePackage.getEDouble(), "y", "0", 0, 1, XYValueFX.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(categoryValueFXEClass, CategoryValueFX.class, "CategoryValueFX", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCategoryValueFX_Name(), theEcorePackage.getEString(), "name", "", 0, 1, CategoryValueFX.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getCategoryValueFX_Value(), theEcorePackage.getEDouble(), "value", "0", 0, 1,
				CategoryValueFX.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(lineChartFXEClass, LineChartFX.class, "LineChartFX", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(areaChartFXEClass, AreaChartFX.class, "AreaChartFX", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(scatterChartFXEClass, ScatterChartFX.class, "ScatterChartFX", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(bubbleChartFXEClass, BubbleChartFX.class, "BubbleChartFX", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(barChartFXEClass, BarChartFX.class, "BarChartFX", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(pieChartFXEClass, PieChartFX.class, "PieChartFX", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(areaChart3dFXEClass, AreaChart3dFX.class, "AreaChart3dFX", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(barChart3dFXEClass, BarChart3dFX.class, "BarChart3dFX", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(chartFXConfigEClass, ChartFXConfig.class, "ChartFXConfig", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getChartFXConfig_SideLegend(), this.getChartSide(), "sideLegend", null, 0, 1,
				ChartFXConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getChartFXConfig_TitleSide(), this.getChartSide(), "titleSide", null, 0, 1, ChartFXConfig.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getChartFXConfig_ShowLegend(), theEcorePackage.getEBoolean(), "showLegend", "true", 0, 1,
				ChartFXConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getChartFXConfig_IsAnimated(), theEcorePackage.getEBoolean(), "isAnimated", "true", 0, 1,
				ChartFXConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getChartFXConfig_AlternativeColumnFillVisible(), theEcorePackage.getEBoolean(),
				"alternativeColumnFillVisible", "true", 0, 1, ChartFXConfig.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getChartFXConfig_AlternativeRowFillVisible(), theEcorePackage.getEBoolean(),
				"alternativeRowFillVisible", "true", 0, 1, ChartFXConfig.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getChartFXConfig_HorizontalGridLinesVisible(), theEcorePackage.getEBoolean(),
				"horizontalGridLinesVisible", "true", 0, 1, ChartFXConfig.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getChartFXConfig_HorizontalZeroLinesVisible(), theEcorePackage.getEBoolean(),
				"horizontalZeroLinesVisible", "true", 0, 1, ChartFXConfig.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getChartFXConfig_VerticalGridLinesVisible(), theEcorePackage.getEBoolean(),
				"verticalGridLinesVisible", "true", 0, 1, ChartFXConfig.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getChartFXConfig_VerticalZeroLinesVisible(), theEcorePackage.getEBoolean(),
				"verticalZeroLinesVisible", "true", 0, 1, ChartFXConfig.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(chartSideEEnum, ChartSide.class, "ChartSide");
		addEEnumLiteral(chartSideEEnum, ChartSide.TOP);
		addEEnumLiteral(chartSideEEnum, ChartSide.BOTTOM);
		addEEnumLiteral(chartSideEEnum, ChartSide.LEFT);
		addEEnumLiteral(chartSideEEnum, ChartSide.RIGHT);

		// Create resource
		createResource(eNS_URI);
	}

} //ChartPackageImpl
