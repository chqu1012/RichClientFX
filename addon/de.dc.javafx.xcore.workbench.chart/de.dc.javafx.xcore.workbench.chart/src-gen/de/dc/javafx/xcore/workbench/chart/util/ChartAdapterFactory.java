/**
 */
package de.dc.javafx.xcore.workbench.chart.util;

import de.dc.javafx.xcore.workbench.chart.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.dc.javafx.xcore.workbench.chart.ChartPackage
 * @generated
 */
public class ChartAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ChartPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChartAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ChartPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChartSwitch<Adapter> modelSwitch = new ChartSwitch<Adapter>() {
		@Override
		public Adapter caseChartProject(ChartProject object) {
			return createChartProjectAdapter();
		}

		@Override
		public Adapter caseChartFX(ChartFX object) {
			return createChartFXAdapter();
		}

		@Override
		public Adapter caseXYChartFX(XYChartFX object) {
			return createXYChartFXAdapter();
		}

		@Override
		public Adapter caseCategoryChartFX(CategoryChartFX object) {
			return createCategoryChartFXAdapter();
		}

		@Override
		public Adapter caseCategoryRowChartFX(CategoryRowChartFX object) {
			return createCategoryRowChartFXAdapter();
		}

		@Override
		public Adapter caseXYZChartFX(XYZChartFX object) {
			return createXYZChartFXAdapter();
		}

		@Override
		public Adapter caseXYZSeriesFX(XYZSeriesFX object) {
			return createXYZSeriesFXAdapter();
		}

		@Override
		public Adapter caseCategorySeriesFX(CategorySeriesFX object) {
			return createCategorySeriesFXAdapter();
		}

		@Override
		public Adapter caseCategoryRowSeriesFX(CategoryRowSeriesFX object) {
			return createCategoryRowSeriesFXAdapter();
		}

		@Override
		public Adapter caseSeriesFX(SeriesFX object) {
			return createSeriesFXAdapter();
		}

		@Override
		public Adapter caseXYValueFX(XYValueFX object) {
			return createXYValueFXAdapter();
		}

		@Override
		public Adapter caseXYZValueFX(XYZValueFX object) {
			return createXYZValueFXAdapter();
		}

		@Override
		public Adapter caseCategoryValueFX(CategoryValueFX object) {
			return createCategoryValueFXAdapter();
		}

		@Override
		public Adapter caseLineChartFX(LineChartFX object) {
			return createLineChartFXAdapter();
		}

		@Override
		public Adapter caseAreaChartFX(AreaChartFX object) {
			return createAreaChartFXAdapter();
		}

		@Override
		public Adapter caseScatterChartFX(ScatterChartFX object) {
			return createScatterChartFXAdapter();
		}

		@Override
		public Adapter caseBubbleChartFX(BubbleChartFX object) {
			return createBubbleChartFXAdapter();
		}

		@Override
		public Adapter caseBarChartFX(BarChartFX object) {
			return createBarChartFXAdapter();
		}

		@Override
		public Adapter casePieChartFX(PieChartFX object) {
			return createPieChartFXAdapter();
		}

		@Override
		public Adapter caseAreaChart3dFX(AreaChart3dFX object) {
			return createAreaChart3dFXAdapter();
		}

		@Override
		public Adapter caseBarChart3dFX(BarChart3dFX object) {
			return createBarChart3dFXAdapter();
		}

		@Override
		public Adapter caseLineChart3dFX(LineChart3dFX object) {
			return createLineChart3dFXAdapter();
		}

		@Override
		public Adapter casePieChart3dFX(PieChart3dFX object) {
			return createPieChart3dFXAdapter();
		}

		@Override
		public Adapter caseScatterChart3dFX(ScatterChart3dFX object) {
			return createScatterChart3dFXAdapter();
		}

		@Override
		public Adapter caseStackedBarChart3dFX(StackedBarChart3dFX object) {
			return createStackedBarChart3dFXAdapter();
		}

		@Override
		public Adapter caseXYZBarChart3dFX(XYZBarChart3dFX object) {
			return createXYZBarChart3dFXAdapter();
		}

		@Override
		public Adapter caseXYZLineChart3dFX(XYZLineChart3dFX object) {
			return createXYZLineChart3dFXAdapter();
		}

		@Override
		public Adapter caseSurfaceChart3dFX(SurfaceChart3dFX object) {
			return createSurfaceChart3dFXAdapter();
		}

		@Override
		public Adapter caseChartFXConfig(ChartFXConfig object) {
			return createChartFXConfigAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dc.javafx.xcore.workbench.chart.ChartProject <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dc.javafx.xcore.workbench.chart.ChartProject
	 * @generated
	 */
	public Adapter createChartProjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dc.javafx.xcore.workbench.chart.ChartFX <em>FX</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dc.javafx.xcore.workbench.chart.ChartFX
	 * @generated
	 */
	public Adapter createChartFXAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dc.javafx.xcore.workbench.chart.XYChartFX <em>XY Chart FX</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dc.javafx.xcore.workbench.chart.XYChartFX
	 * @generated
	 */
	public Adapter createXYChartFXAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dc.javafx.xcore.workbench.chart.CategoryChartFX <em>Category Chart FX</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dc.javafx.xcore.workbench.chart.CategoryChartFX
	 * @generated
	 */
	public Adapter createCategoryChartFXAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dc.javafx.xcore.workbench.chart.CategoryRowChartFX <em>Category Row Chart FX</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dc.javafx.xcore.workbench.chart.CategoryRowChartFX
	 * @generated
	 */
	public Adapter createCategoryRowChartFXAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dc.javafx.xcore.workbench.chart.XYZChartFX <em>XYZ Chart FX</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dc.javafx.xcore.workbench.chart.XYZChartFX
	 * @generated
	 */
	public Adapter createXYZChartFXAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dc.javafx.xcore.workbench.chart.XYZSeriesFX <em>XYZ Series FX</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dc.javafx.xcore.workbench.chart.XYZSeriesFX
	 * @generated
	 */
	public Adapter createXYZSeriesFXAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dc.javafx.xcore.workbench.chart.CategorySeriesFX <em>Category Series FX</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dc.javafx.xcore.workbench.chart.CategorySeriesFX
	 * @generated
	 */
	public Adapter createCategorySeriesFXAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dc.javafx.xcore.workbench.chart.CategoryRowSeriesFX <em>Category Row Series FX</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dc.javafx.xcore.workbench.chart.CategoryRowSeriesFX
	 * @generated
	 */
	public Adapter createCategoryRowSeriesFXAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dc.javafx.xcore.workbench.chart.SeriesFX <em>Series FX</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dc.javafx.xcore.workbench.chart.SeriesFX
	 * @generated
	 */
	public Adapter createSeriesFXAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dc.javafx.xcore.workbench.chart.XYValueFX <em>XY Value FX</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dc.javafx.xcore.workbench.chart.XYValueFX
	 * @generated
	 */
	public Adapter createXYValueFXAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dc.javafx.xcore.workbench.chart.XYZValueFX <em>XYZ Value FX</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dc.javafx.xcore.workbench.chart.XYZValueFX
	 * @generated
	 */
	public Adapter createXYZValueFXAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dc.javafx.xcore.workbench.chart.CategoryValueFX <em>Category Value FX</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dc.javafx.xcore.workbench.chart.CategoryValueFX
	 * @generated
	 */
	public Adapter createCategoryValueFXAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dc.javafx.xcore.workbench.chart.LineChartFX <em>Line Chart FX</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dc.javafx.xcore.workbench.chart.LineChartFX
	 * @generated
	 */
	public Adapter createLineChartFXAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dc.javafx.xcore.workbench.chart.AreaChartFX <em>Area Chart FX</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dc.javafx.xcore.workbench.chart.AreaChartFX
	 * @generated
	 */
	public Adapter createAreaChartFXAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dc.javafx.xcore.workbench.chart.ScatterChartFX <em>Scatter Chart FX</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dc.javafx.xcore.workbench.chart.ScatterChartFX
	 * @generated
	 */
	public Adapter createScatterChartFXAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dc.javafx.xcore.workbench.chart.BubbleChartFX <em>Bubble Chart FX</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dc.javafx.xcore.workbench.chart.BubbleChartFX
	 * @generated
	 */
	public Adapter createBubbleChartFXAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dc.javafx.xcore.workbench.chart.BarChartFX <em>Bar Chart FX</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dc.javafx.xcore.workbench.chart.BarChartFX
	 * @generated
	 */
	public Adapter createBarChartFXAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dc.javafx.xcore.workbench.chart.PieChartFX <em>Pie Chart FX</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dc.javafx.xcore.workbench.chart.PieChartFX
	 * @generated
	 */
	public Adapter createPieChartFXAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dc.javafx.xcore.workbench.chart.AreaChart3dFX <em>Area Chart3d FX</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dc.javafx.xcore.workbench.chart.AreaChart3dFX
	 * @generated
	 */
	public Adapter createAreaChart3dFXAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dc.javafx.xcore.workbench.chart.BarChart3dFX <em>Bar Chart3d FX</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dc.javafx.xcore.workbench.chart.BarChart3dFX
	 * @generated
	 */
	public Adapter createBarChart3dFXAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dc.javafx.xcore.workbench.chart.LineChart3dFX <em>Line Chart3d FX</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dc.javafx.xcore.workbench.chart.LineChart3dFX
	 * @generated
	 */
	public Adapter createLineChart3dFXAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dc.javafx.xcore.workbench.chart.PieChart3dFX <em>Pie Chart3d FX</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dc.javafx.xcore.workbench.chart.PieChart3dFX
	 * @generated
	 */
	public Adapter createPieChart3dFXAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dc.javafx.xcore.workbench.chart.ScatterChart3dFX <em>Scatter Chart3d FX</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dc.javafx.xcore.workbench.chart.ScatterChart3dFX
	 * @generated
	 */
	public Adapter createScatterChart3dFXAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dc.javafx.xcore.workbench.chart.StackedBarChart3dFX <em>Stacked Bar Chart3d FX</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dc.javafx.xcore.workbench.chart.StackedBarChart3dFX
	 * @generated
	 */
	public Adapter createStackedBarChart3dFXAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dc.javafx.xcore.workbench.chart.XYZBarChart3dFX <em>XYZ Bar Chart3d FX</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dc.javafx.xcore.workbench.chart.XYZBarChart3dFX
	 * @generated
	 */
	public Adapter createXYZBarChart3dFXAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dc.javafx.xcore.workbench.chart.XYZLineChart3dFX <em>XYZ Line Chart3d FX</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dc.javafx.xcore.workbench.chart.XYZLineChart3dFX
	 * @generated
	 */
	public Adapter createXYZLineChart3dFXAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dc.javafx.xcore.workbench.chart.SurfaceChart3dFX <em>Surface Chart3d FX</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dc.javafx.xcore.workbench.chart.SurfaceChart3dFX
	 * @generated
	 */
	public Adapter createSurfaceChart3dFXAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dc.javafx.xcore.workbench.chart.ChartFXConfig <em>FX Config</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dc.javafx.xcore.workbench.chart.ChartFXConfig
	 * @generated
	 */
	public Adapter createChartFXConfigAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ChartAdapterFactory
