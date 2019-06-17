/**
 */
package de.dc.javafx.xcore.workbench.chart;

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
 * @see de.dc.javafx.xcore.workbench.chart.ChartFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel multipleEditorPages='false' creationIcons='false' editDirectory='/de.dc.javafx.xcore.workbench.chart.edit/src-gen' editorDirectory='/de.dc.javafx.xcore.workbench.chart.editor/src-gen' richClientPlatform='true' codeFormatting='true' importerID='org.eclipse.emf.importer.ecore' runtimePlatform='RCP' fileExtensions='chart' tableProviders='true' dataTypeConverters='true' basePackage='de.dc.javafx.xcore.workbench'"
 * @generated
 */
public interface ChartPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "chart";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.frateranatis.org/workbench/chart";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "chart";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ChartPackage eINSTANCE = de.dc.javafx.xcore.workbench.chart.impl.ChartPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.dc.javafx.xcore.workbench.chart.impl.ChartProjectImpl <em>Project</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.javafx.xcore.workbench.chart.impl.ChartProjectImpl
	 * @see de.dc.javafx.xcore.workbench.chart.impl.ChartPackageImpl#getChartProject()
	 * @generated
	 */
	int CHART_PROJECT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART_PROJECT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Charts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART_PROJECT__CHARTS = 1;

	/**
	 * The number of structural features of the '<em>Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART_PROJECT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART_PROJECT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dc.javafx.xcore.workbench.chart.impl.ChartFXImpl <em>FX</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.javafx.xcore.workbench.chart.impl.ChartFXImpl
	 * @see de.dc.javafx.xcore.workbench.chart.impl.ChartPackageImpl#getChartFX()
	 * @generated
	 */
	int CHART_FX = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART_FX__NAME = 0;

	/**
	 * The feature id for the '<em><b>XAxis Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART_FX__XAXIS_LABEL = 1;

	/**
	 * The feature id for the '<em><b>YAxis Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART_FX__YAXIS_LABEL = 2;

	/**
	 * The feature id for the '<em><b>ZAxis Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART_FX__ZAXIS_LABEL = 3;

	/**
	 * The feature id for the '<em><b>Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART_FX__CONFIG = 4;

	/**
	 * The number of structural features of the '<em>FX</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART_FX_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>FX</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART_FX_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dc.javafx.xcore.workbench.chart.impl.XYChartFXImpl <em>XY Chart FX</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.javafx.xcore.workbench.chart.impl.XYChartFXImpl
	 * @see de.dc.javafx.xcore.workbench.chart.impl.ChartPackageImpl#getXYChartFX()
	 * @generated
	 */
	int XY_CHART_FX = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XY_CHART_FX__NAME = CHART_FX__NAME;

	/**
	 * The feature id for the '<em><b>XAxis Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XY_CHART_FX__XAXIS_LABEL = CHART_FX__XAXIS_LABEL;

	/**
	 * The feature id for the '<em><b>YAxis Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XY_CHART_FX__YAXIS_LABEL = CHART_FX__YAXIS_LABEL;

	/**
	 * The feature id for the '<em><b>ZAxis Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XY_CHART_FX__ZAXIS_LABEL = CHART_FX__ZAXIS_LABEL;

	/**
	 * The feature id for the '<em><b>Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XY_CHART_FX__CONFIG = CHART_FX__CONFIG;

	/**
	 * The feature id for the '<em><b>Series</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XY_CHART_FX__SERIES = CHART_FX_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>XY Chart FX</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XY_CHART_FX_FEATURE_COUNT = CHART_FX_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>XY Chart FX</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XY_CHART_FX_OPERATION_COUNT = CHART_FX_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dc.javafx.xcore.workbench.chart.impl.CategoryChartFXImpl <em>Category Chart FX</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.javafx.xcore.workbench.chart.impl.CategoryChartFXImpl
	 * @see de.dc.javafx.xcore.workbench.chart.impl.ChartPackageImpl#getCategoryChartFX()
	 * @generated
	 */
	int CATEGORY_CHART_FX = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_CHART_FX__NAME = CHART_FX__NAME;

	/**
	 * The feature id for the '<em><b>XAxis Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_CHART_FX__XAXIS_LABEL = CHART_FX__XAXIS_LABEL;

	/**
	 * The feature id for the '<em><b>YAxis Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_CHART_FX__YAXIS_LABEL = CHART_FX__YAXIS_LABEL;

	/**
	 * The feature id for the '<em><b>ZAxis Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_CHART_FX__ZAXIS_LABEL = CHART_FX__ZAXIS_LABEL;

	/**
	 * The feature id for the '<em><b>Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_CHART_FX__CONFIG = CHART_FX__CONFIG;

	/**
	 * The feature id for the '<em><b>Series</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_CHART_FX__SERIES = CHART_FX_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Category Chart FX</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_CHART_FX_FEATURE_COUNT = CHART_FX_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Category Chart FX</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_CHART_FX_OPERATION_COUNT = CHART_FX_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dc.javafx.xcore.workbench.chart.impl.CategorySeriesFXImpl <em>Category Series FX</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.javafx.xcore.workbench.chart.impl.CategorySeriesFXImpl
	 * @see de.dc.javafx.xcore.workbench.chart.impl.ChartPackageImpl#getCategorySeriesFX()
	 * @generated
	 */
	int CATEGORY_SERIES_FX = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_SERIES_FX__NAME = 0;

	/**
	 * The feature id for the '<em><b>Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_SERIES_FX__VALUES = 1;

	/**
	 * The number of structural features of the '<em>Category Series FX</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_SERIES_FX_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Category Series FX</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_SERIES_FX_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dc.javafx.xcore.workbench.chart.impl.SeriesFXImpl <em>Series FX</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.javafx.xcore.workbench.chart.impl.SeriesFXImpl
	 * @see de.dc.javafx.xcore.workbench.chart.impl.ChartPackageImpl#getSeriesFX()
	 * @generated
	 */
	int SERIES_FX = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERIES_FX__NAME = 0;

	/**
	 * The feature id for the '<em><b>Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERIES_FX__VALUES = 1;

	/**
	 * The number of structural features of the '<em>Series FX</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERIES_FX_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Series FX</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERIES_FX_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dc.javafx.xcore.workbench.chart.impl.XYValueFXImpl <em>XY Value FX</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.javafx.xcore.workbench.chart.impl.XYValueFXImpl
	 * @see de.dc.javafx.xcore.workbench.chart.impl.ChartPackageImpl#getXYValueFX()
	 * @generated
	 */
	int XY_VALUE_FX = 6;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XY_VALUE_FX__X = 0;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XY_VALUE_FX__Y = 1;

	/**
	 * The number of structural features of the '<em>XY Value FX</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XY_VALUE_FX_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>XY Value FX</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XY_VALUE_FX_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dc.javafx.xcore.workbench.chart.impl.CategoryValueFXImpl <em>Category Value FX</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.javafx.xcore.workbench.chart.impl.CategoryValueFXImpl
	 * @see de.dc.javafx.xcore.workbench.chart.impl.ChartPackageImpl#getCategoryValueFX()
	 * @generated
	 */
	int CATEGORY_VALUE_FX = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_VALUE_FX__NAME = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_VALUE_FX__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Category Value FX</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_VALUE_FX_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Category Value FX</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_VALUE_FX_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dc.javafx.xcore.workbench.chart.impl.LineChartFXImpl <em>Line Chart FX</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.javafx.xcore.workbench.chart.impl.LineChartFXImpl
	 * @see de.dc.javafx.xcore.workbench.chart.impl.ChartPackageImpl#getLineChartFX()
	 * @generated
	 */
	int LINE_CHART_FX = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_CHART_FX__NAME = XY_CHART_FX__NAME;

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
	 * The feature id for the '<em><b>ZAxis Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_CHART_FX__ZAXIS_LABEL = XY_CHART_FX__ZAXIS_LABEL;

	/**
	 * The feature id for the '<em><b>Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_CHART_FX__CONFIG = XY_CHART_FX__CONFIG;

	/**
	 * The feature id for the '<em><b>Series</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_CHART_FX__SERIES = XY_CHART_FX__SERIES;

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
	 * The meta object id for the '{@link de.dc.javafx.xcore.workbench.chart.impl.AreaChartFXImpl <em>Area Chart FX</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.javafx.xcore.workbench.chart.impl.AreaChartFXImpl
	 * @see de.dc.javafx.xcore.workbench.chart.impl.ChartPackageImpl#getAreaChartFX()
	 * @generated
	 */
	int AREA_CHART_FX = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA_CHART_FX__NAME = XY_CHART_FX__NAME;

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
	 * The feature id for the '<em><b>ZAxis Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA_CHART_FX__ZAXIS_LABEL = XY_CHART_FX__ZAXIS_LABEL;

	/**
	 * The feature id for the '<em><b>Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA_CHART_FX__CONFIG = XY_CHART_FX__CONFIG;

	/**
	 * The feature id for the '<em><b>Series</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA_CHART_FX__SERIES = XY_CHART_FX__SERIES;

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
	 * The meta object id for the '{@link de.dc.javafx.xcore.workbench.chart.impl.ScatterChartFXImpl <em>Scatter Chart FX</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.javafx.xcore.workbench.chart.impl.ScatterChartFXImpl
	 * @see de.dc.javafx.xcore.workbench.chart.impl.ChartPackageImpl#getScatterChartFX()
	 * @generated
	 */
	int SCATTER_CHART_FX = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCATTER_CHART_FX__NAME = XY_CHART_FX__NAME;

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
	 * The feature id for the '<em><b>ZAxis Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCATTER_CHART_FX__ZAXIS_LABEL = XY_CHART_FX__ZAXIS_LABEL;

	/**
	 * The feature id for the '<em><b>Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCATTER_CHART_FX__CONFIG = XY_CHART_FX__CONFIG;

	/**
	 * The feature id for the '<em><b>Series</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCATTER_CHART_FX__SERIES = XY_CHART_FX__SERIES;

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
	 * The meta object id for the '{@link de.dc.javafx.xcore.workbench.chart.impl.BubbleChartFXImpl <em>Bubble Chart FX</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.javafx.xcore.workbench.chart.impl.BubbleChartFXImpl
	 * @see de.dc.javafx.xcore.workbench.chart.impl.ChartPackageImpl#getBubbleChartFX()
	 * @generated
	 */
	int BUBBLE_CHART_FX = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUBBLE_CHART_FX__NAME = XY_CHART_FX__NAME;

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
	 * The feature id for the '<em><b>ZAxis Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUBBLE_CHART_FX__ZAXIS_LABEL = XY_CHART_FX__ZAXIS_LABEL;

	/**
	 * The feature id for the '<em><b>Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUBBLE_CHART_FX__CONFIG = XY_CHART_FX__CONFIG;

	/**
	 * The feature id for the '<em><b>Series</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUBBLE_CHART_FX__SERIES = XY_CHART_FX__SERIES;

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
	 * The meta object id for the '{@link de.dc.javafx.xcore.workbench.chart.impl.BarChartFXImpl <em>Bar Chart FX</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.javafx.xcore.workbench.chart.impl.BarChartFXImpl
	 * @see de.dc.javafx.xcore.workbench.chart.impl.ChartPackageImpl#getBarChartFX()
	 * @generated
	 */
	int BAR_CHART_FX = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAR_CHART_FX__NAME = CATEGORY_CHART_FX__NAME;

	/**
	 * The feature id for the '<em><b>XAxis Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAR_CHART_FX__XAXIS_LABEL = CATEGORY_CHART_FX__XAXIS_LABEL;

	/**
	 * The feature id for the '<em><b>YAxis Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAR_CHART_FX__YAXIS_LABEL = CATEGORY_CHART_FX__YAXIS_LABEL;

	/**
	 * The feature id for the '<em><b>ZAxis Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAR_CHART_FX__ZAXIS_LABEL = CATEGORY_CHART_FX__ZAXIS_LABEL;

	/**
	 * The feature id for the '<em><b>Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAR_CHART_FX__CONFIG = CATEGORY_CHART_FX__CONFIG;

	/**
	 * The feature id for the '<em><b>Series</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAR_CHART_FX__SERIES = CATEGORY_CHART_FX__SERIES;

	/**
	 * The number of structural features of the '<em>Bar Chart FX</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAR_CHART_FX_FEATURE_COUNT = CATEGORY_CHART_FX_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Bar Chart FX</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAR_CHART_FX_OPERATION_COUNT = CATEGORY_CHART_FX_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dc.javafx.xcore.workbench.chart.impl.PieChartFXImpl <em>Pie Chart FX</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.javafx.xcore.workbench.chart.impl.PieChartFXImpl
	 * @see de.dc.javafx.xcore.workbench.chart.impl.ChartPackageImpl#getPieChartFX()
	 * @generated
	 */
	int PIE_CHART_FX = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIE_CHART_FX__NAME = CATEGORY_CHART_FX__NAME;

	/**
	 * The feature id for the '<em><b>XAxis Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIE_CHART_FX__XAXIS_LABEL = CATEGORY_CHART_FX__XAXIS_LABEL;

	/**
	 * The feature id for the '<em><b>YAxis Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIE_CHART_FX__YAXIS_LABEL = CATEGORY_CHART_FX__YAXIS_LABEL;

	/**
	 * The feature id for the '<em><b>ZAxis Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIE_CHART_FX__ZAXIS_LABEL = CATEGORY_CHART_FX__ZAXIS_LABEL;

	/**
	 * The feature id for the '<em><b>Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIE_CHART_FX__CONFIG = CATEGORY_CHART_FX__CONFIG;

	/**
	 * The feature id for the '<em><b>Series</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIE_CHART_FX__SERIES = CATEGORY_CHART_FX__SERIES;

	/**
	 * The number of structural features of the '<em>Pie Chart FX</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIE_CHART_FX_FEATURE_COUNT = CATEGORY_CHART_FX_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Pie Chart FX</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIE_CHART_FX_OPERATION_COUNT = CATEGORY_CHART_FX_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dc.javafx.xcore.workbench.chart.impl.AreaChart3DFXImpl <em>Area Chart3 DFX</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.javafx.xcore.workbench.chart.impl.AreaChart3DFXImpl
	 * @see de.dc.javafx.xcore.workbench.chart.impl.ChartPackageImpl#getAreaChart3DFX()
	 * @generated
	 */
	int AREA_CHART3_DFX = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA_CHART3_DFX__NAME = XY_CHART_FX__NAME;

	/**
	 * The feature id for the '<em><b>XAxis Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA_CHART3_DFX__XAXIS_LABEL = XY_CHART_FX__XAXIS_LABEL;

	/**
	 * The feature id for the '<em><b>YAxis Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA_CHART3_DFX__YAXIS_LABEL = XY_CHART_FX__YAXIS_LABEL;

	/**
	 * The feature id for the '<em><b>ZAxis Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA_CHART3_DFX__ZAXIS_LABEL = XY_CHART_FX__ZAXIS_LABEL;

	/**
	 * The feature id for the '<em><b>Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA_CHART3_DFX__CONFIG = XY_CHART_FX__CONFIG;

	/**
	 * The feature id for the '<em><b>Series</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA_CHART3_DFX__SERIES = XY_CHART_FX__SERIES;

	/**
	 * The number of structural features of the '<em>Area Chart3 DFX</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA_CHART3_DFX_FEATURE_COUNT = XY_CHART_FX_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Area Chart3 DFX</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA_CHART3_DFX_OPERATION_COUNT = XY_CHART_FX_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dc.javafx.xcore.workbench.chart.impl.ChartFXConfigImpl <em>FX Config</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.javafx.xcore.workbench.chart.impl.ChartFXConfigImpl
	 * @see de.dc.javafx.xcore.workbench.chart.impl.ChartPackageImpl#getChartFXConfig()
	 * @generated
	 */
	int CHART_FX_CONFIG = 15;

	/**
	 * The feature id for the '<em><b>Side Legend</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART_FX_CONFIG__SIDE_LEGEND = 0;

	/**
	 * The feature id for the '<em><b>Title Side</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART_FX_CONFIG__TITLE_SIDE = 1;

	/**
	 * The feature id for the '<em><b>Show Legend</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART_FX_CONFIG__SHOW_LEGEND = 2;

	/**
	 * The feature id for the '<em><b>Is Animated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART_FX_CONFIG__IS_ANIMATED = 3;

	/**
	 * The feature id for the '<em><b>Alternative Column Fill Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART_FX_CONFIG__ALTERNATIVE_COLUMN_FILL_VISIBLE = 4;

	/**
	 * The feature id for the '<em><b>Alternative Row Fill Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART_FX_CONFIG__ALTERNATIVE_ROW_FILL_VISIBLE = 5;

	/**
	 * The feature id for the '<em><b>Horizontal Grid Lines Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART_FX_CONFIG__HORIZONTAL_GRID_LINES_VISIBLE = 6;

	/**
	 * The feature id for the '<em><b>Horizontal Zero Lines Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART_FX_CONFIG__HORIZONTAL_ZERO_LINES_VISIBLE = 7;

	/**
	 * The feature id for the '<em><b>Vertical Grid Lines Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART_FX_CONFIG__VERTICAL_GRID_LINES_VISIBLE = 8;

	/**
	 * The feature id for the '<em><b>Vertical Zero Lines Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART_FX_CONFIG__VERTICAL_ZERO_LINES_VISIBLE = 9;

	/**
	 * The number of structural features of the '<em>FX Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART_FX_CONFIG_FEATURE_COUNT = 10;

	/**
	 * The number of operations of the '<em>FX Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART_FX_CONFIG_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dc.javafx.xcore.workbench.chart.ChartSide <em>Side</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.javafx.xcore.workbench.chart.ChartSide
	 * @see de.dc.javafx.xcore.workbench.chart.impl.ChartPackageImpl#getChartSide()
	 * @generated
	 */
	int CHART_SIDE = 16;

	/**
	 * Returns the meta object for class '{@link de.dc.javafx.xcore.workbench.chart.ChartProject <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Project</em>'.
	 * @see de.dc.javafx.xcore.workbench.chart.ChartProject
	 * @generated
	 */
	EClass getChartProject();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.javafx.xcore.workbench.chart.ChartProject#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.dc.javafx.xcore.workbench.chart.ChartProject#getName()
	 * @see #getChartProject()
	 * @generated
	 */
	EAttribute getChartProject_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dc.javafx.xcore.workbench.chart.ChartProject#getCharts <em>Charts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Charts</em>'.
	 * @see de.dc.javafx.xcore.workbench.chart.ChartProject#getCharts()
	 * @see #getChartProject()
	 * @generated
	 */
	EReference getChartProject_Charts();

	/**
	 * Returns the meta object for class '{@link de.dc.javafx.xcore.workbench.chart.ChartFX <em>FX</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>FX</em>'.
	 * @see de.dc.javafx.xcore.workbench.chart.ChartFX
	 * @generated
	 */
	EClass getChartFX();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.javafx.xcore.workbench.chart.ChartFX#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.dc.javafx.xcore.workbench.chart.ChartFX#getName()
	 * @see #getChartFX()
	 * @generated
	 */
	EAttribute getChartFX_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.javafx.xcore.workbench.chart.ChartFX#getXAxisLabel <em>XAxis Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>XAxis Label</em>'.
	 * @see de.dc.javafx.xcore.workbench.chart.ChartFX#getXAxisLabel()
	 * @see #getChartFX()
	 * @generated
	 */
	EAttribute getChartFX_XAxisLabel();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.javafx.xcore.workbench.chart.ChartFX#getYAxisLabel <em>YAxis Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>YAxis Label</em>'.
	 * @see de.dc.javafx.xcore.workbench.chart.ChartFX#getYAxisLabel()
	 * @see #getChartFX()
	 * @generated
	 */
	EAttribute getChartFX_YAxisLabel();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.javafx.xcore.workbench.chart.ChartFX#getZAxisLabel <em>ZAxis Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ZAxis Label</em>'.
	 * @see de.dc.javafx.xcore.workbench.chart.ChartFX#getZAxisLabel()
	 * @see #getChartFX()
	 * @generated
	 */
	EAttribute getChartFX_ZAxisLabel();

	/**
	 * Returns the meta object for the containment reference '{@link de.dc.javafx.xcore.workbench.chart.ChartFX#getConfig <em>Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Config</em>'.
	 * @see de.dc.javafx.xcore.workbench.chart.ChartFX#getConfig()
	 * @see #getChartFX()
	 * @generated
	 */
	EReference getChartFX_Config();

	/**
	 * Returns the meta object for class '{@link de.dc.javafx.xcore.workbench.chart.XYChartFX <em>XY Chart FX</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XY Chart FX</em>'.
	 * @see de.dc.javafx.xcore.workbench.chart.XYChartFX
	 * @generated
	 */
	EClass getXYChartFX();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dc.javafx.xcore.workbench.chart.XYChartFX#getSeries <em>Series</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Series</em>'.
	 * @see de.dc.javafx.xcore.workbench.chart.XYChartFX#getSeries()
	 * @see #getXYChartFX()
	 * @generated
	 */
	EReference getXYChartFX_Series();

	/**
	 * Returns the meta object for class '{@link de.dc.javafx.xcore.workbench.chart.CategoryChartFX <em>Category Chart FX</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Category Chart FX</em>'.
	 * @see de.dc.javafx.xcore.workbench.chart.CategoryChartFX
	 * @generated
	 */
	EClass getCategoryChartFX();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dc.javafx.xcore.workbench.chart.CategoryChartFX#getSeries <em>Series</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Series</em>'.
	 * @see de.dc.javafx.xcore.workbench.chart.CategoryChartFX#getSeries()
	 * @see #getCategoryChartFX()
	 * @generated
	 */
	EReference getCategoryChartFX_Series();

	/**
	 * Returns the meta object for class '{@link de.dc.javafx.xcore.workbench.chart.CategorySeriesFX <em>Category Series FX</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Category Series FX</em>'.
	 * @see de.dc.javafx.xcore.workbench.chart.CategorySeriesFX
	 * @generated
	 */
	EClass getCategorySeriesFX();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.javafx.xcore.workbench.chart.CategorySeriesFX#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.dc.javafx.xcore.workbench.chart.CategorySeriesFX#getName()
	 * @see #getCategorySeriesFX()
	 * @generated
	 */
	EAttribute getCategorySeriesFX_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dc.javafx.xcore.workbench.chart.CategorySeriesFX#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Values</em>'.
	 * @see de.dc.javafx.xcore.workbench.chart.CategorySeriesFX#getValues()
	 * @see #getCategorySeriesFX()
	 * @generated
	 */
	EReference getCategorySeriesFX_Values();

	/**
	 * Returns the meta object for class '{@link de.dc.javafx.xcore.workbench.chart.SeriesFX <em>Series FX</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Series FX</em>'.
	 * @see de.dc.javafx.xcore.workbench.chart.SeriesFX
	 * @generated
	 */
	EClass getSeriesFX();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.javafx.xcore.workbench.chart.SeriesFX#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.dc.javafx.xcore.workbench.chart.SeriesFX#getName()
	 * @see #getSeriesFX()
	 * @generated
	 */
	EAttribute getSeriesFX_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dc.javafx.xcore.workbench.chart.SeriesFX#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Values</em>'.
	 * @see de.dc.javafx.xcore.workbench.chart.SeriesFX#getValues()
	 * @see #getSeriesFX()
	 * @generated
	 */
	EReference getSeriesFX_Values();

	/**
	 * Returns the meta object for class '{@link de.dc.javafx.xcore.workbench.chart.XYValueFX <em>XY Value FX</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XY Value FX</em>'.
	 * @see de.dc.javafx.xcore.workbench.chart.XYValueFX
	 * @generated
	 */
	EClass getXYValueFX();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.javafx.xcore.workbench.chart.XYValueFX#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see de.dc.javafx.xcore.workbench.chart.XYValueFX#getX()
	 * @see #getXYValueFX()
	 * @generated
	 */
	EAttribute getXYValueFX_X();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.javafx.xcore.workbench.chart.XYValueFX#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see de.dc.javafx.xcore.workbench.chart.XYValueFX#getY()
	 * @see #getXYValueFX()
	 * @generated
	 */
	EAttribute getXYValueFX_Y();

	/**
	 * Returns the meta object for class '{@link de.dc.javafx.xcore.workbench.chart.CategoryValueFX <em>Category Value FX</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Category Value FX</em>'.
	 * @see de.dc.javafx.xcore.workbench.chart.CategoryValueFX
	 * @generated
	 */
	EClass getCategoryValueFX();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.javafx.xcore.workbench.chart.CategoryValueFX#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.dc.javafx.xcore.workbench.chart.CategoryValueFX#getName()
	 * @see #getCategoryValueFX()
	 * @generated
	 */
	EAttribute getCategoryValueFX_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.javafx.xcore.workbench.chart.CategoryValueFX#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see de.dc.javafx.xcore.workbench.chart.CategoryValueFX#getValue()
	 * @see #getCategoryValueFX()
	 * @generated
	 */
	EAttribute getCategoryValueFX_Value();

	/**
	 * Returns the meta object for class '{@link de.dc.javafx.xcore.workbench.chart.LineChartFX <em>Line Chart FX</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Line Chart FX</em>'.
	 * @see de.dc.javafx.xcore.workbench.chart.LineChartFX
	 * @generated
	 */
	EClass getLineChartFX();

	/**
	 * Returns the meta object for class '{@link de.dc.javafx.xcore.workbench.chart.AreaChartFX <em>Area Chart FX</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Area Chart FX</em>'.
	 * @see de.dc.javafx.xcore.workbench.chart.AreaChartFX
	 * @generated
	 */
	EClass getAreaChartFX();

	/**
	 * Returns the meta object for class '{@link de.dc.javafx.xcore.workbench.chart.ScatterChartFX <em>Scatter Chart FX</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scatter Chart FX</em>'.
	 * @see de.dc.javafx.xcore.workbench.chart.ScatterChartFX
	 * @generated
	 */
	EClass getScatterChartFX();

	/**
	 * Returns the meta object for class '{@link de.dc.javafx.xcore.workbench.chart.BubbleChartFX <em>Bubble Chart FX</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bubble Chart FX</em>'.
	 * @see de.dc.javafx.xcore.workbench.chart.BubbleChartFX
	 * @generated
	 */
	EClass getBubbleChartFX();

	/**
	 * Returns the meta object for class '{@link de.dc.javafx.xcore.workbench.chart.BarChartFX <em>Bar Chart FX</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bar Chart FX</em>'.
	 * @see de.dc.javafx.xcore.workbench.chart.BarChartFX
	 * @generated
	 */
	EClass getBarChartFX();

	/**
	 * Returns the meta object for class '{@link de.dc.javafx.xcore.workbench.chart.PieChartFX <em>Pie Chart FX</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pie Chart FX</em>'.
	 * @see de.dc.javafx.xcore.workbench.chart.PieChartFX
	 * @generated
	 */
	EClass getPieChartFX();

	/**
	 * Returns the meta object for class '{@link de.dc.javafx.xcore.workbench.chart.AreaChart3DFX <em>Area Chart3 DFX</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Area Chart3 DFX</em>'.
	 * @see de.dc.javafx.xcore.workbench.chart.AreaChart3DFX
	 * @generated
	 */
	EClass getAreaChart3DFX();

	/**
	 * Returns the meta object for class '{@link de.dc.javafx.xcore.workbench.chart.ChartFXConfig <em>FX Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>FX Config</em>'.
	 * @see de.dc.javafx.xcore.workbench.chart.ChartFXConfig
	 * @generated
	 */
	EClass getChartFXConfig();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.javafx.xcore.workbench.chart.ChartFXConfig#getSideLegend <em>Side Legend</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Side Legend</em>'.
	 * @see de.dc.javafx.xcore.workbench.chart.ChartFXConfig#getSideLegend()
	 * @see #getChartFXConfig()
	 * @generated
	 */
	EAttribute getChartFXConfig_SideLegend();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.javafx.xcore.workbench.chart.ChartFXConfig#getTitleSide <em>Title Side</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title Side</em>'.
	 * @see de.dc.javafx.xcore.workbench.chart.ChartFXConfig#getTitleSide()
	 * @see #getChartFXConfig()
	 * @generated
	 */
	EAttribute getChartFXConfig_TitleSide();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.javafx.xcore.workbench.chart.ChartFXConfig#isShowLegend <em>Show Legend</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Show Legend</em>'.
	 * @see de.dc.javafx.xcore.workbench.chart.ChartFXConfig#isShowLegend()
	 * @see #getChartFXConfig()
	 * @generated
	 */
	EAttribute getChartFXConfig_ShowLegend();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.javafx.xcore.workbench.chart.ChartFXConfig#isIsAnimated <em>Is Animated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Animated</em>'.
	 * @see de.dc.javafx.xcore.workbench.chart.ChartFXConfig#isIsAnimated()
	 * @see #getChartFXConfig()
	 * @generated
	 */
	EAttribute getChartFXConfig_IsAnimated();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.javafx.xcore.workbench.chart.ChartFXConfig#isAlternativeColumnFillVisible <em>Alternative Column Fill Visible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alternative Column Fill Visible</em>'.
	 * @see de.dc.javafx.xcore.workbench.chart.ChartFXConfig#isAlternativeColumnFillVisible()
	 * @see #getChartFXConfig()
	 * @generated
	 */
	EAttribute getChartFXConfig_AlternativeColumnFillVisible();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.javafx.xcore.workbench.chart.ChartFXConfig#isAlternativeRowFillVisible <em>Alternative Row Fill Visible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alternative Row Fill Visible</em>'.
	 * @see de.dc.javafx.xcore.workbench.chart.ChartFXConfig#isAlternativeRowFillVisible()
	 * @see #getChartFXConfig()
	 * @generated
	 */
	EAttribute getChartFXConfig_AlternativeRowFillVisible();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.javafx.xcore.workbench.chart.ChartFXConfig#isHorizontalGridLinesVisible <em>Horizontal Grid Lines Visible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Horizontal Grid Lines Visible</em>'.
	 * @see de.dc.javafx.xcore.workbench.chart.ChartFXConfig#isHorizontalGridLinesVisible()
	 * @see #getChartFXConfig()
	 * @generated
	 */
	EAttribute getChartFXConfig_HorizontalGridLinesVisible();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.javafx.xcore.workbench.chart.ChartFXConfig#isHorizontalZeroLinesVisible <em>Horizontal Zero Lines Visible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Horizontal Zero Lines Visible</em>'.
	 * @see de.dc.javafx.xcore.workbench.chart.ChartFXConfig#isHorizontalZeroLinesVisible()
	 * @see #getChartFXConfig()
	 * @generated
	 */
	EAttribute getChartFXConfig_HorizontalZeroLinesVisible();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.javafx.xcore.workbench.chart.ChartFXConfig#isVerticalGridLinesVisible <em>Vertical Grid Lines Visible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vertical Grid Lines Visible</em>'.
	 * @see de.dc.javafx.xcore.workbench.chart.ChartFXConfig#isVerticalGridLinesVisible()
	 * @see #getChartFXConfig()
	 * @generated
	 */
	EAttribute getChartFXConfig_VerticalGridLinesVisible();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.javafx.xcore.workbench.chart.ChartFXConfig#isVerticalZeroLinesVisible <em>Vertical Zero Lines Visible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vertical Zero Lines Visible</em>'.
	 * @see de.dc.javafx.xcore.workbench.chart.ChartFXConfig#isVerticalZeroLinesVisible()
	 * @see #getChartFXConfig()
	 * @generated
	 */
	EAttribute getChartFXConfig_VerticalZeroLinesVisible();

	/**
	 * Returns the meta object for enum '{@link de.dc.javafx.xcore.workbench.chart.ChartSide <em>Side</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Side</em>'.
	 * @see de.dc.javafx.xcore.workbench.chart.ChartSide
	 * @generated
	 */
	EEnum getChartSide();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ChartFactory getChartFactory();

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
		 * The meta object literal for the '{@link de.dc.javafx.xcore.workbench.chart.impl.ChartProjectImpl <em>Project</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.javafx.xcore.workbench.chart.impl.ChartProjectImpl
		 * @see de.dc.javafx.xcore.workbench.chart.impl.ChartPackageImpl#getChartProject()
		 * @generated
		 */
		EClass CHART_PROJECT = eINSTANCE.getChartProject();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHART_PROJECT__NAME = eINSTANCE.getChartProject_Name();

		/**
		 * The meta object literal for the '<em><b>Charts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHART_PROJECT__CHARTS = eINSTANCE.getChartProject_Charts();

		/**
		 * The meta object literal for the '{@link de.dc.javafx.xcore.workbench.chart.impl.ChartFXImpl <em>FX</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.javafx.xcore.workbench.chart.impl.ChartFXImpl
		 * @see de.dc.javafx.xcore.workbench.chart.impl.ChartPackageImpl#getChartFX()
		 * @generated
		 */
		EClass CHART_FX = eINSTANCE.getChartFX();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHART_FX__NAME = eINSTANCE.getChartFX_Name();

		/**
		 * The meta object literal for the '<em><b>XAxis Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHART_FX__XAXIS_LABEL = eINSTANCE.getChartFX_XAxisLabel();

		/**
		 * The meta object literal for the '<em><b>YAxis Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHART_FX__YAXIS_LABEL = eINSTANCE.getChartFX_YAxisLabel();

		/**
		 * The meta object literal for the '<em><b>ZAxis Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHART_FX__ZAXIS_LABEL = eINSTANCE.getChartFX_ZAxisLabel();

		/**
		 * The meta object literal for the '<em><b>Config</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHART_FX__CONFIG = eINSTANCE.getChartFX_Config();

		/**
		 * The meta object literal for the '{@link de.dc.javafx.xcore.workbench.chart.impl.XYChartFXImpl <em>XY Chart FX</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.javafx.xcore.workbench.chart.impl.XYChartFXImpl
		 * @see de.dc.javafx.xcore.workbench.chart.impl.ChartPackageImpl#getXYChartFX()
		 * @generated
		 */
		EClass XY_CHART_FX = eINSTANCE.getXYChartFX();

		/**
		 * The meta object literal for the '<em><b>Series</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XY_CHART_FX__SERIES = eINSTANCE.getXYChartFX_Series();

		/**
		 * The meta object literal for the '{@link de.dc.javafx.xcore.workbench.chart.impl.CategoryChartFXImpl <em>Category Chart FX</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.javafx.xcore.workbench.chart.impl.CategoryChartFXImpl
		 * @see de.dc.javafx.xcore.workbench.chart.impl.ChartPackageImpl#getCategoryChartFX()
		 * @generated
		 */
		EClass CATEGORY_CHART_FX = eINSTANCE.getCategoryChartFX();

		/**
		 * The meta object literal for the '<em><b>Series</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATEGORY_CHART_FX__SERIES = eINSTANCE.getCategoryChartFX_Series();

		/**
		 * The meta object literal for the '{@link de.dc.javafx.xcore.workbench.chart.impl.CategorySeriesFXImpl <em>Category Series FX</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.javafx.xcore.workbench.chart.impl.CategorySeriesFXImpl
		 * @see de.dc.javafx.xcore.workbench.chart.impl.ChartPackageImpl#getCategorySeriesFX()
		 * @generated
		 */
		EClass CATEGORY_SERIES_FX = eINSTANCE.getCategorySeriesFX();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATEGORY_SERIES_FX__NAME = eINSTANCE.getCategorySeriesFX_Name();

		/**
		 * The meta object literal for the '<em><b>Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATEGORY_SERIES_FX__VALUES = eINSTANCE.getCategorySeriesFX_Values();

		/**
		 * The meta object literal for the '{@link de.dc.javafx.xcore.workbench.chart.impl.SeriesFXImpl <em>Series FX</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.javafx.xcore.workbench.chart.impl.SeriesFXImpl
		 * @see de.dc.javafx.xcore.workbench.chart.impl.ChartPackageImpl#getSeriesFX()
		 * @generated
		 */
		EClass SERIES_FX = eINSTANCE.getSeriesFX();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERIES_FX__NAME = eINSTANCE.getSeriesFX_Name();

		/**
		 * The meta object literal for the '<em><b>Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERIES_FX__VALUES = eINSTANCE.getSeriesFX_Values();

		/**
		 * The meta object literal for the '{@link de.dc.javafx.xcore.workbench.chart.impl.XYValueFXImpl <em>XY Value FX</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.javafx.xcore.workbench.chart.impl.XYValueFXImpl
		 * @see de.dc.javafx.xcore.workbench.chart.impl.ChartPackageImpl#getXYValueFX()
		 * @generated
		 */
		EClass XY_VALUE_FX = eINSTANCE.getXYValueFX();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XY_VALUE_FX__X = eINSTANCE.getXYValueFX_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XY_VALUE_FX__Y = eINSTANCE.getXYValueFX_Y();

		/**
		 * The meta object literal for the '{@link de.dc.javafx.xcore.workbench.chart.impl.CategoryValueFXImpl <em>Category Value FX</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.javafx.xcore.workbench.chart.impl.CategoryValueFXImpl
		 * @see de.dc.javafx.xcore.workbench.chart.impl.ChartPackageImpl#getCategoryValueFX()
		 * @generated
		 */
		EClass CATEGORY_VALUE_FX = eINSTANCE.getCategoryValueFX();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATEGORY_VALUE_FX__NAME = eINSTANCE.getCategoryValueFX_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATEGORY_VALUE_FX__VALUE = eINSTANCE.getCategoryValueFX_Value();

		/**
		 * The meta object literal for the '{@link de.dc.javafx.xcore.workbench.chart.impl.LineChartFXImpl <em>Line Chart FX</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.javafx.xcore.workbench.chart.impl.LineChartFXImpl
		 * @see de.dc.javafx.xcore.workbench.chart.impl.ChartPackageImpl#getLineChartFX()
		 * @generated
		 */
		EClass LINE_CHART_FX = eINSTANCE.getLineChartFX();

		/**
		 * The meta object literal for the '{@link de.dc.javafx.xcore.workbench.chart.impl.AreaChartFXImpl <em>Area Chart FX</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.javafx.xcore.workbench.chart.impl.AreaChartFXImpl
		 * @see de.dc.javafx.xcore.workbench.chart.impl.ChartPackageImpl#getAreaChartFX()
		 * @generated
		 */
		EClass AREA_CHART_FX = eINSTANCE.getAreaChartFX();

		/**
		 * The meta object literal for the '{@link de.dc.javafx.xcore.workbench.chart.impl.ScatterChartFXImpl <em>Scatter Chart FX</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.javafx.xcore.workbench.chart.impl.ScatterChartFXImpl
		 * @see de.dc.javafx.xcore.workbench.chart.impl.ChartPackageImpl#getScatterChartFX()
		 * @generated
		 */
		EClass SCATTER_CHART_FX = eINSTANCE.getScatterChartFX();

		/**
		 * The meta object literal for the '{@link de.dc.javafx.xcore.workbench.chart.impl.BubbleChartFXImpl <em>Bubble Chart FX</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.javafx.xcore.workbench.chart.impl.BubbleChartFXImpl
		 * @see de.dc.javafx.xcore.workbench.chart.impl.ChartPackageImpl#getBubbleChartFX()
		 * @generated
		 */
		EClass BUBBLE_CHART_FX = eINSTANCE.getBubbleChartFX();

		/**
		 * The meta object literal for the '{@link de.dc.javafx.xcore.workbench.chart.impl.BarChartFXImpl <em>Bar Chart FX</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.javafx.xcore.workbench.chart.impl.BarChartFXImpl
		 * @see de.dc.javafx.xcore.workbench.chart.impl.ChartPackageImpl#getBarChartFX()
		 * @generated
		 */
		EClass BAR_CHART_FX = eINSTANCE.getBarChartFX();

		/**
		 * The meta object literal for the '{@link de.dc.javafx.xcore.workbench.chart.impl.PieChartFXImpl <em>Pie Chart FX</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.javafx.xcore.workbench.chart.impl.PieChartFXImpl
		 * @see de.dc.javafx.xcore.workbench.chart.impl.ChartPackageImpl#getPieChartFX()
		 * @generated
		 */
		EClass PIE_CHART_FX = eINSTANCE.getPieChartFX();

		/**
		 * The meta object literal for the '{@link de.dc.javafx.xcore.workbench.chart.impl.AreaChart3DFXImpl <em>Area Chart3 DFX</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.javafx.xcore.workbench.chart.impl.AreaChart3DFXImpl
		 * @see de.dc.javafx.xcore.workbench.chart.impl.ChartPackageImpl#getAreaChart3DFX()
		 * @generated
		 */
		EClass AREA_CHART3_DFX = eINSTANCE.getAreaChart3DFX();

		/**
		 * The meta object literal for the '{@link de.dc.javafx.xcore.workbench.chart.impl.ChartFXConfigImpl <em>FX Config</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.javafx.xcore.workbench.chart.impl.ChartFXConfigImpl
		 * @see de.dc.javafx.xcore.workbench.chart.impl.ChartPackageImpl#getChartFXConfig()
		 * @generated
		 */
		EClass CHART_FX_CONFIG = eINSTANCE.getChartFXConfig();

		/**
		 * The meta object literal for the '<em><b>Side Legend</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHART_FX_CONFIG__SIDE_LEGEND = eINSTANCE.getChartFXConfig_SideLegend();

		/**
		 * The meta object literal for the '<em><b>Title Side</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHART_FX_CONFIG__TITLE_SIDE = eINSTANCE.getChartFXConfig_TitleSide();

		/**
		 * The meta object literal for the '<em><b>Show Legend</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHART_FX_CONFIG__SHOW_LEGEND = eINSTANCE.getChartFXConfig_ShowLegend();

		/**
		 * The meta object literal for the '<em><b>Is Animated</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHART_FX_CONFIG__IS_ANIMATED = eINSTANCE.getChartFXConfig_IsAnimated();

		/**
		 * The meta object literal for the '<em><b>Alternative Column Fill Visible</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHART_FX_CONFIG__ALTERNATIVE_COLUMN_FILL_VISIBLE = eINSTANCE
				.getChartFXConfig_AlternativeColumnFillVisible();

		/**
		 * The meta object literal for the '<em><b>Alternative Row Fill Visible</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHART_FX_CONFIG__ALTERNATIVE_ROW_FILL_VISIBLE = eINSTANCE
				.getChartFXConfig_AlternativeRowFillVisible();

		/**
		 * The meta object literal for the '<em><b>Horizontal Grid Lines Visible</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHART_FX_CONFIG__HORIZONTAL_GRID_LINES_VISIBLE = eINSTANCE
				.getChartFXConfig_HorizontalGridLinesVisible();

		/**
		 * The meta object literal for the '<em><b>Horizontal Zero Lines Visible</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHART_FX_CONFIG__HORIZONTAL_ZERO_LINES_VISIBLE = eINSTANCE
				.getChartFXConfig_HorizontalZeroLinesVisible();

		/**
		 * The meta object literal for the '<em><b>Vertical Grid Lines Visible</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHART_FX_CONFIG__VERTICAL_GRID_LINES_VISIBLE = eINSTANCE.getChartFXConfig_VerticalGridLinesVisible();

		/**
		 * The meta object literal for the '<em><b>Vertical Zero Lines Visible</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHART_FX_CONFIG__VERTICAL_ZERO_LINES_VISIBLE = eINSTANCE.getChartFXConfig_VerticalZeroLinesVisible();

		/**
		 * The meta object literal for the '{@link de.dc.javafx.xcore.workbench.chart.ChartSide <em>Side</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.javafx.xcore.workbench.chart.ChartSide
		 * @see de.dc.javafx.xcore.workbench.chart.impl.ChartPackageImpl#getChartSide()
		 * @generated
		 */
		EEnum CHART_SIDE = eINSTANCE.getChartSide();

	}

} //ChartPackage
