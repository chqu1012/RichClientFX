/**
 */
package de.dc.javafx.xcore.workbench.chart;

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
 * @see de.dc.javafx.xcore.workbench.chart.ChartFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel multipleEditorPages='false' creationIcons='false' editDirectory='/de.dc.javafx.xcore.workbench.chart.edit/src-gen' editorDirectory='/de.dc.javafx.xcore.workbench.chart.editor/src-gen' richClientPlatform='true' codeFormatting='true' importerID='org.eclipse.emf.importer.ecore' runtimePlatform='RCP' fileExtensions='chart' basePackage='de.dc.javafx.xcore.workbench'"
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
	 * The meta object id for the '{@link de.dc.javafx.xcore.workbench.chart.impl.ChartFXImpl <em>FX</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.javafx.xcore.workbench.chart.impl.ChartFXImpl
	 * @see de.dc.javafx.xcore.workbench.chart.impl.ChartPackageImpl#getChartFX()
	 * @generated
	 */
	int CHART_FX = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART_FX__NAME = 0;

	/**
	 * The feature id for the '<em><b>Show Legend</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART_FX__SHOW_LEGEND = 1;

	/**
	 * The number of structural features of the '<em>FX</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART_FX_FEATURE_COUNT = 2;

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
	int XY_CHART_FX = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XY_CHART_FX__NAME = CHART_FX__NAME;

	/**
	 * The feature id for the '<em><b>Show Legend</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XY_CHART_FX__SHOW_LEGEND = CHART_FX__SHOW_LEGEND;

	/**
	 * The feature id for the '<em><b>XAxis Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XY_CHART_FX__XAXIS_LABEL = CHART_FX_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>YAxis Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XY_CHART_FX__YAXIS_LABEL = CHART_FX_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XY_CHART_FX__VALUES = CHART_FX_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>XY Chart FX</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XY_CHART_FX_FEATURE_COUNT = CHART_FX_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>XY Chart FX</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XY_CHART_FX_OPERATION_COUNT = CHART_FX_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dc.javafx.xcore.workbench.chart.impl.XYValueImpl <em>XY Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.javafx.xcore.workbench.chart.impl.XYValueImpl
	 * @see de.dc.javafx.xcore.workbench.chart.impl.ChartPackageImpl#getXYValue()
	 * @generated
	 */
	int XY_VALUE = 2;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XY_VALUE__X = 0;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XY_VALUE__Y = 1;

	/**
	 * The number of structural features of the '<em>XY Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XY_VALUE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>XY Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XY_VALUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dc.javafx.xcore.workbench.chart.impl.LineChartFXImpl <em>Line Chart FX</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.javafx.xcore.workbench.chart.impl.LineChartFXImpl
	 * @see de.dc.javafx.xcore.workbench.chart.impl.ChartPackageImpl#getLineChartFX()
	 * @generated
	 */
	int LINE_CHART_FX = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_CHART_FX__NAME = XY_CHART_FX__NAME;

	/**
	 * The feature id for the '<em><b>Show Legend</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_CHART_FX__SHOW_LEGEND = XY_CHART_FX__SHOW_LEGEND;

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
	 * The feature id for the '<em><b>Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_CHART_FX__VALUES = XY_CHART_FX__VALUES;

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
	 * Returns the meta object for the attribute '{@link de.dc.javafx.xcore.workbench.chart.ChartFX#isShowLegend <em>Show Legend</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Show Legend</em>'.
	 * @see de.dc.javafx.xcore.workbench.chart.ChartFX#isShowLegend()
	 * @see #getChartFX()
	 * @generated
	 */
	EAttribute getChartFX_ShowLegend();

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
	 * Returns the meta object for the attribute '{@link de.dc.javafx.xcore.workbench.chart.XYChartFX#getXAxisLabel <em>XAxis Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>XAxis Label</em>'.
	 * @see de.dc.javafx.xcore.workbench.chart.XYChartFX#getXAxisLabel()
	 * @see #getXYChartFX()
	 * @generated
	 */
	EAttribute getXYChartFX_XAxisLabel();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.javafx.xcore.workbench.chart.XYChartFX#getYAxisLabel <em>YAxis Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>YAxis Label</em>'.
	 * @see de.dc.javafx.xcore.workbench.chart.XYChartFX#getYAxisLabel()
	 * @see #getXYChartFX()
	 * @generated
	 */
	EAttribute getXYChartFX_YAxisLabel();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dc.javafx.xcore.workbench.chart.XYChartFX#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Values</em>'.
	 * @see de.dc.javafx.xcore.workbench.chart.XYChartFX#getValues()
	 * @see #getXYChartFX()
	 * @generated
	 */
	EReference getXYChartFX_Values();

	/**
	 * Returns the meta object for class '{@link de.dc.javafx.xcore.workbench.chart.XYValue <em>XY Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XY Value</em>'.
	 * @see de.dc.javafx.xcore.workbench.chart.XYValue
	 * @generated
	 */
	EClass getXYValue();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.javafx.xcore.workbench.chart.XYValue#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see de.dc.javafx.xcore.workbench.chart.XYValue#getX()
	 * @see #getXYValue()
	 * @generated
	 */
	EAttribute getXYValue_X();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.javafx.xcore.workbench.chart.XYValue#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see de.dc.javafx.xcore.workbench.chart.XYValue#getY()
	 * @see #getXYValue()
	 * @generated
	 */
	EAttribute getXYValue_Y();

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
		 * The meta object literal for the '<em><b>Show Legend</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHART_FX__SHOW_LEGEND = eINSTANCE.getChartFX_ShowLegend();

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
		 * The meta object literal for the '<em><b>Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XY_CHART_FX__VALUES = eINSTANCE.getXYChartFX_Values();

		/**
		 * The meta object literal for the '{@link de.dc.javafx.xcore.workbench.chart.impl.XYValueImpl <em>XY Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.javafx.xcore.workbench.chart.impl.XYValueImpl
		 * @see de.dc.javafx.xcore.workbench.chart.impl.ChartPackageImpl#getXYValue()
		 * @generated
		 */
		EClass XY_VALUE = eINSTANCE.getXYValue();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XY_VALUE__X = eINSTANCE.getXYValue_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XY_VALUE__Y = eINSTANCE.getXYValue_Y();

		/**
		 * The meta object literal for the '{@link de.dc.javafx.xcore.workbench.chart.impl.LineChartFXImpl <em>Line Chart FX</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.javafx.xcore.workbench.chart.impl.LineChartFXImpl
		 * @see de.dc.javafx.xcore.workbench.chart.impl.ChartPackageImpl#getLineChartFX()
		 * @generated
		 */
		EClass LINE_CHART_FX = eINSTANCE.getLineChartFX();

	}

} //ChartPackage
