/**
 */
package de.dc.javafx.xcore.workbench.chart.impl;

import de.dc.javafx.xcore.workbench.chart.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
public class ChartFactoryImpl extends EFactoryImpl implements ChartFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ChartFactory init() {
		try {
			ChartFactory theChartFactory = (ChartFactory) EPackage.Registry.INSTANCE.getEFactory(ChartPackage.eNS_URI);
			if (theChartFactory != null) {
				return theChartFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ChartFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChartFactoryImpl() {
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
		case ChartPackage.CHART_PROJECT:
			return createChartProject();
		case ChartPackage.CATEGORY_SERIES_FX:
			return createCategorySeriesFX();
		case ChartPackage.SERIES_FX:
			return createSeriesFX();
		case ChartPackage.XY_VALUE_FX:
			return createXYValueFX();
		case ChartPackage.CATEGORY_VALUE_FX:
			return createCategoryValueFX();
		case ChartPackage.LINE_CHART_FX:
			return createLineChartFX();
		case ChartPackage.AREA_CHART_FX:
			return createAreaChartFX();
		case ChartPackage.SCATTER_CHART_FX:
			return createScatterChartFX();
		case ChartPackage.BUBBLE_CHART_FX:
			return createBubbleChartFX();
		case ChartPackage.BAR_CHART_FX:
			return createBarChartFX();
		case ChartPackage.PIE_CHART_FX:
			return createPieChartFX();
		case ChartPackage.CHART_FX_CONFIG:
			return createChartFXConfig();
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
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case ChartPackage.CHART_SIDE:
			return createChartSideFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case ChartPackage.CHART_SIDE:
			return convertChartSideToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ChartProject createChartProject() {
		ChartProjectImpl chartProject = new ChartProjectImpl();
		return chartProject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CategorySeriesFX createCategorySeriesFX() {
		CategorySeriesFXImpl categorySeriesFX = new CategorySeriesFXImpl();
		return categorySeriesFX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SeriesFX createSeriesFX() {
		SeriesFXImpl seriesFX = new SeriesFXImpl();
		return seriesFX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XYValueFX createXYValueFX() {
		XYValueFXImpl xyValueFX = new XYValueFXImpl();
		return xyValueFX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CategoryValueFX createCategoryValueFX() {
		CategoryValueFXImpl categoryValueFX = new CategoryValueFXImpl();
		return categoryValueFX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LineChartFX createLineChartFX() {
		LineChartFXImpl lineChartFX = new LineChartFXImpl();
		return lineChartFX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AreaChartFX createAreaChartFX() {
		AreaChartFXImpl areaChartFX = new AreaChartFXImpl();
		return areaChartFX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ScatterChartFX createScatterChartFX() {
		ScatterChartFXImpl scatterChartFX = new ScatterChartFXImpl();
		return scatterChartFX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BubbleChartFX createBubbleChartFX() {
		BubbleChartFXImpl bubbleChartFX = new BubbleChartFXImpl();
		return bubbleChartFX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BarChartFX createBarChartFX() {
		BarChartFXImpl barChartFX = new BarChartFXImpl();
		return barChartFX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PieChartFX createPieChartFX() {
		PieChartFXImpl pieChartFX = new PieChartFXImpl();
		return pieChartFX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ChartFXConfig createChartFXConfig() {
		ChartFXConfigImpl chartFXConfig = new ChartFXConfigImpl();
		return chartFXConfig;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ChartSide createChartSide(String literal) {
		ChartSide result = ChartSide.get(literal);
		if (result == null)
			throw new IllegalArgumentException("The value '" + literal + "' is not a valid enumerator of '"
					+ ChartPackage.Literals.CHART_SIDE.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChartSide createChartSideFromString(EDataType eDataType, String initialValue) {
		return createChartSide(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertChartSide(ChartSide instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertChartSideToString(EDataType eDataType, Object instanceValue) {
		return convertChartSide((ChartSide) instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ChartPackage getChartPackage() {
		return (ChartPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ChartPackage getPackage() {
		return ChartPackage.eINSTANCE;
	}

} //ChartFactoryImpl
