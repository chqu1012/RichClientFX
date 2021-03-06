/**
 */
package de.dc.javafx.xcore.workbench.chart.util;

import de.dc.javafx.xcore.workbench.chart.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see de.dc.javafx.xcore.workbench.chart.ChartPackage
 * @generated
 */
public class ChartSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ChartPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChartSwitch() {
		if (modelPackage == null) {
			modelPackage = ChartPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case ChartPackage.CHART_PROJECT: {
			ChartProject chartProject = (ChartProject) theEObject;
			T result = caseChartProject(chartProject);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ChartPackage.CHART_FX: {
			ChartFX chartFX = (ChartFX) theEObject;
			T result = caseChartFX(chartFX);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ChartPackage.XY_CHART_FX: {
			XYChartFX xyChartFX = (XYChartFX) theEObject;
			T result = caseXYChartFX(xyChartFX);
			if (result == null)
				result = caseChartFX(xyChartFX);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ChartPackage.CATEGORY_CHART_FX: {
			CategoryChartFX categoryChartFX = (CategoryChartFX) theEObject;
			T result = caseCategoryChartFX(categoryChartFX);
			if (result == null)
				result = caseChartFX(categoryChartFX);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ChartPackage.CATEGORY_ROW_CHART_FX: {
			CategoryRowChartFX categoryRowChartFX = (CategoryRowChartFX) theEObject;
			T result = caseCategoryRowChartFX(categoryRowChartFX);
			if (result == null)
				result = caseChartFX(categoryRowChartFX);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ChartPackage.XYZ_CHART_FX: {
			XYZChartFX xyzChartFX = (XYZChartFX) theEObject;
			T result = caseXYZChartFX(xyzChartFX);
			if (result == null)
				result = caseChartFX(xyzChartFX);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ChartPackage.XYZ_SERIES_FX: {
			XYZSeriesFX xyzSeriesFX = (XYZSeriesFX) theEObject;
			T result = caseXYZSeriesFX(xyzSeriesFX);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ChartPackage.CATEGORY_SERIES_FX: {
			CategorySeriesFX categorySeriesFX = (CategorySeriesFX) theEObject;
			T result = caseCategorySeriesFX(categorySeriesFX);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ChartPackage.CATEGORY_ROW_SERIES_FX: {
			CategoryRowSeriesFX categoryRowSeriesFX = (CategoryRowSeriesFX) theEObject;
			T result = caseCategoryRowSeriesFX(categoryRowSeriesFX);
			if (result == null)
				result = caseCategorySeriesFX(categoryRowSeriesFX);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ChartPackage.SERIES_FX: {
			SeriesFX seriesFX = (SeriesFX) theEObject;
			T result = caseSeriesFX(seriesFX);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ChartPackage.XY_VALUE_FX: {
			XYValueFX xyValueFX = (XYValueFX) theEObject;
			T result = caseXYValueFX(xyValueFX);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ChartPackage.XYZ_VALUE_FX: {
			XYZValueFX xyzValueFX = (XYZValueFX) theEObject;
			T result = caseXYZValueFX(xyzValueFX);
			if (result == null)
				result = caseXYValueFX(xyzValueFX);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ChartPackage.CATEGORY_VALUE_FX: {
			CategoryValueFX categoryValueFX = (CategoryValueFX) theEObject;
			T result = caseCategoryValueFX(categoryValueFX);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ChartPackage.LINE_CHART_FX: {
			LineChartFX lineChartFX = (LineChartFX) theEObject;
			T result = caseLineChartFX(lineChartFX);
			if (result == null)
				result = caseXYChartFX(lineChartFX);
			if (result == null)
				result = caseChartFX(lineChartFX);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ChartPackage.AREA_CHART_FX: {
			AreaChartFX areaChartFX = (AreaChartFX) theEObject;
			T result = caseAreaChartFX(areaChartFX);
			if (result == null)
				result = caseXYChartFX(areaChartFX);
			if (result == null)
				result = caseChartFX(areaChartFX);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ChartPackage.SCATTER_CHART_FX: {
			ScatterChartFX scatterChartFX = (ScatterChartFX) theEObject;
			T result = caseScatterChartFX(scatterChartFX);
			if (result == null)
				result = caseXYChartFX(scatterChartFX);
			if (result == null)
				result = caseChartFX(scatterChartFX);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ChartPackage.BUBBLE_CHART_FX: {
			BubbleChartFX bubbleChartFX = (BubbleChartFX) theEObject;
			T result = caseBubbleChartFX(bubbleChartFX);
			if (result == null)
				result = caseXYChartFX(bubbleChartFX);
			if (result == null)
				result = caseChartFX(bubbleChartFX);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ChartPackage.BAR_CHART_FX: {
			BarChartFX barChartFX = (BarChartFX) theEObject;
			T result = caseBarChartFX(barChartFX);
			if (result == null)
				result = caseCategoryChartFX(barChartFX);
			if (result == null)
				result = caseChartFX(barChartFX);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ChartPackage.PIE_CHART_FX: {
			PieChartFX pieChartFX = (PieChartFX) theEObject;
			T result = casePieChartFX(pieChartFX);
			if (result == null)
				result = caseCategoryChartFX(pieChartFX);
			if (result == null)
				result = caseChartFX(pieChartFX);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ChartPackage.AREA_CHART3D_FX: {
			AreaChart3dFX areaChart3dFX = (AreaChart3dFX) theEObject;
			T result = caseAreaChart3dFX(areaChart3dFX);
			if (result == null)
				result = caseXYChartFX(areaChart3dFX);
			if (result == null)
				result = caseChartFX(areaChart3dFX);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ChartPackage.BAR_CHART3D_FX: {
			BarChart3dFX barChart3dFX = (BarChart3dFX) theEObject;
			T result = caseBarChart3dFX(barChart3dFX);
			if (result == null)
				result = caseXYChartFX(barChart3dFX);
			if (result == null)
				result = caseChartFX(barChart3dFX);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ChartPackage.LINE_CHART3D_FX: {
			LineChart3dFX lineChart3dFX = (LineChart3dFX) theEObject;
			T result = caseLineChart3dFX(lineChart3dFX);
			if (result == null)
				result = caseXYChartFX(lineChart3dFX);
			if (result == null)
				result = caseChartFX(lineChart3dFX);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ChartPackage.PIE_CHART3D_FX: {
			PieChart3dFX pieChart3dFX = (PieChart3dFX) theEObject;
			T result = casePieChart3dFX(pieChart3dFX);
			if (result == null)
				result = caseCategoryChartFX(pieChart3dFX);
			if (result == null)
				result = caseChartFX(pieChart3dFX);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ChartPackage.SCATTER_CHART3D_FX: {
			ScatterChart3dFX scatterChart3dFX = (ScatterChart3dFX) theEObject;
			T result = caseScatterChart3dFX(scatterChart3dFX);
			if (result == null)
				result = caseXYZChartFX(scatterChart3dFX);
			if (result == null)
				result = caseChartFX(scatterChart3dFX);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ChartPackage.STACKED_BAR_CHART3D_FX: {
			StackedBarChart3dFX stackedBarChart3dFX = (StackedBarChart3dFX) theEObject;
			T result = caseStackedBarChart3dFX(stackedBarChart3dFX);
			if (result == null)
				result = caseCategoryRowChartFX(stackedBarChart3dFX);
			if (result == null)
				result = caseChartFX(stackedBarChart3dFX);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ChartPackage.XYZ_BAR_CHART3D_FX: {
			XYZBarChart3dFX xyzBarChart3dFX = (XYZBarChart3dFX) theEObject;
			T result = caseXYZBarChart3dFX(xyzBarChart3dFX);
			if (result == null)
				result = caseXYZChartFX(xyzBarChart3dFX);
			if (result == null)
				result = caseChartFX(xyzBarChart3dFX);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ChartPackage.XYZ_LINE_CHART3D_FX: {
			XYZLineChart3dFX xyzLineChart3dFX = (XYZLineChart3dFX) theEObject;
			T result = caseXYZLineChart3dFX(xyzLineChart3dFX);
			if (result == null)
				result = caseXYZChartFX(xyzLineChart3dFX);
			if (result == null)
				result = caseChartFX(xyzLineChart3dFX);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ChartPackage.SURFACE_CHART3D_FX: {
			SurfaceChart3dFX surfaceChart3dFX = (SurfaceChart3dFX) theEObject;
			T result = caseSurfaceChart3dFX(surfaceChart3dFX);
			if (result == null)
				result = caseCategoryRowChartFX(surfaceChart3dFX);
			if (result == null)
				result = caseChartFX(surfaceChart3dFX);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ChartPackage.CHART_FX_CONFIG: {
			ChartFXConfig chartFXConfig = (ChartFXConfig) theEObject;
			T result = caseChartFXConfig(chartFXConfig);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Project</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Project</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChartProject(ChartProject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>FX</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>FX</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChartFX(ChartFX object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>XY Chart FX</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XY Chart FX</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXYChartFX(XYChartFX object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Category Chart FX</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Category Chart FX</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCategoryChartFX(CategoryChartFX object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Category Row Chart FX</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Category Row Chart FX</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCategoryRowChartFX(CategoryRowChartFX object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>XYZ Chart FX</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XYZ Chart FX</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXYZChartFX(XYZChartFX object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>XYZ Series FX</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XYZ Series FX</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXYZSeriesFX(XYZSeriesFX object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Category Series FX</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Category Series FX</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCategorySeriesFX(CategorySeriesFX object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Category Row Series FX</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Category Row Series FX</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCategoryRowSeriesFX(CategoryRowSeriesFX object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Series FX</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Series FX</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSeriesFX(SeriesFX object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>XY Value FX</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XY Value FX</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXYValueFX(XYValueFX object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>XYZ Value FX</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XYZ Value FX</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXYZValueFX(XYZValueFX object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Category Value FX</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Category Value FX</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCategoryValueFX(CategoryValueFX object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Line Chart FX</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Line Chart FX</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLineChartFX(LineChartFX object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Area Chart FX</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Area Chart FX</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAreaChartFX(AreaChartFX object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Scatter Chart FX</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Scatter Chart FX</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScatterChartFX(ScatterChartFX object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bubble Chart FX</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bubble Chart FX</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBubbleChartFX(BubbleChartFX object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bar Chart FX</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bar Chart FX</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBarChartFX(BarChartFX object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pie Chart FX</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pie Chart FX</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePieChartFX(PieChartFX object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Area Chart3d FX</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Area Chart3d FX</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAreaChart3dFX(AreaChart3dFX object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bar Chart3d FX</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bar Chart3d FX</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBarChart3dFX(BarChart3dFX object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Line Chart3d FX</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Line Chart3d FX</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLineChart3dFX(LineChart3dFX object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pie Chart3d FX</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pie Chart3d FX</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePieChart3dFX(PieChart3dFX object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Scatter Chart3d FX</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Scatter Chart3d FX</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScatterChart3dFX(ScatterChart3dFX object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stacked Bar Chart3d FX</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stacked Bar Chart3d FX</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStackedBarChart3dFX(StackedBarChart3dFX object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>XYZ Bar Chart3d FX</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XYZ Bar Chart3d FX</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXYZBarChart3dFX(XYZBarChart3dFX object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>XYZ Line Chart3d FX</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XYZ Line Chart3d FX</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXYZLineChart3dFX(XYZLineChart3dFX object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Surface Chart3d FX</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Surface Chart3d FX</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSurfaceChart3dFX(SurfaceChart3dFX object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>FX Config</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>FX Config</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChartFXConfig(ChartFXConfig object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //ChartSwitch
