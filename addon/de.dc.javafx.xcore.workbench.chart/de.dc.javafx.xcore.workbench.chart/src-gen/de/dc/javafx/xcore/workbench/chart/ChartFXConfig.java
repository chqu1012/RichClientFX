/**
 */
package de.dc.javafx.xcore.workbench.chart;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>FX Config</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dc.javafx.xcore.workbench.chart.ChartFXConfig#getSideLegend <em>Side Legend</em>}</li>
 *   <li>{@link de.dc.javafx.xcore.workbench.chart.ChartFXConfig#getTitleSide <em>Title Side</em>}</li>
 *   <li>{@link de.dc.javafx.xcore.workbench.chart.ChartFXConfig#isShowLegend <em>Show Legend</em>}</li>
 *   <li>{@link de.dc.javafx.xcore.workbench.chart.ChartFXConfig#isIsAnimated <em>Is Animated</em>}</li>
 *   <li>{@link de.dc.javafx.xcore.workbench.chart.ChartFXConfig#isAlternativeColumnFillVisible <em>Alternative Column Fill Visible</em>}</li>
 *   <li>{@link de.dc.javafx.xcore.workbench.chart.ChartFXConfig#isAlternativeRowFillVisible <em>Alternative Row Fill Visible</em>}</li>
 *   <li>{@link de.dc.javafx.xcore.workbench.chart.ChartFXConfig#isHorizontalGridLinesVisible <em>Horizontal Grid Lines Visible</em>}</li>
 *   <li>{@link de.dc.javafx.xcore.workbench.chart.ChartFXConfig#isHorizontalZeroLinesVisible <em>Horizontal Zero Lines Visible</em>}</li>
 *   <li>{@link de.dc.javafx.xcore.workbench.chart.ChartFXConfig#isVerticalGridLinesVisible <em>Vertical Grid Lines Visible</em>}</li>
 *   <li>{@link de.dc.javafx.xcore.workbench.chart.ChartFXConfig#isVerticalZeroLinesVisible <em>Vertical Zero Lines Visible</em>}</li>
 * </ul>
 *
 * @see de.dc.javafx.xcore.workbench.chart.ChartPackage#getChartFXConfig()
 * @model
 * @generated
 */
public interface ChartFXConfig extends EObject {
	/**
	 * Returns the value of the '<em><b>Side Legend</b></em>' attribute.
	 * The literals are from the enumeration {@link de.dc.javafx.xcore.workbench.chart.ChartSide}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Side Legend</em>' attribute.
	 * @see de.dc.javafx.xcore.workbench.chart.ChartSide
	 * @see #setSideLegend(ChartSide)
	 * @see de.dc.javafx.xcore.workbench.chart.ChartPackage#getChartFXConfig_SideLegend()
	 * @model unique="false"
	 * @generated
	 */
	ChartSide getSideLegend();

	/**
	 * Sets the value of the '{@link de.dc.javafx.xcore.workbench.chart.ChartFXConfig#getSideLegend <em>Side Legend</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Side Legend</em>' attribute.
	 * @see de.dc.javafx.xcore.workbench.chart.ChartSide
	 * @see #getSideLegend()
	 * @generated
	 */
	void setSideLegend(ChartSide value);

	/**
	 * Returns the value of the '<em><b>Title Side</b></em>' attribute.
	 * The literals are from the enumeration {@link de.dc.javafx.xcore.workbench.chart.ChartSide}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title Side</em>' attribute.
	 * @see de.dc.javafx.xcore.workbench.chart.ChartSide
	 * @see #setTitleSide(ChartSide)
	 * @see de.dc.javafx.xcore.workbench.chart.ChartPackage#getChartFXConfig_TitleSide()
	 * @model unique="false"
	 * @generated
	 */
	ChartSide getTitleSide();

	/**
	 * Sets the value of the '{@link de.dc.javafx.xcore.workbench.chart.ChartFXConfig#getTitleSide <em>Title Side</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title Side</em>' attribute.
	 * @see de.dc.javafx.xcore.workbench.chart.ChartSide
	 * @see #getTitleSide()
	 * @generated
	 */
	void setTitleSide(ChartSide value);

	/**
	 * Returns the value of the '<em><b>Show Legend</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Show Legend</em>' attribute.
	 * @see #setShowLegend(boolean)
	 * @see de.dc.javafx.xcore.workbench.chart.ChartPackage#getChartFXConfig_ShowLegend()
	 * @model default="true" unique="false"
	 * @generated
	 */
	boolean isShowLegend();

	/**
	 * Sets the value of the '{@link de.dc.javafx.xcore.workbench.chart.ChartFXConfig#isShowLegend <em>Show Legend</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Show Legend</em>' attribute.
	 * @see #isShowLegend()
	 * @generated
	 */
	void setShowLegend(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Animated</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Animated</em>' attribute.
	 * @see #setIsAnimated(boolean)
	 * @see de.dc.javafx.xcore.workbench.chart.ChartPackage#getChartFXConfig_IsAnimated()
	 * @model default="true" unique="false"
	 * @generated
	 */
	boolean isIsAnimated();

	/**
	 * Sets the value of the '{@link de.dc.javafx.xcore.workbench.chart.ChartFXConfig#isIsAnimated <em>Is Animated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Animated</em>' attribute.
	 * @see #isIsAnimated()
	 * @generated
	 */
	void setIsAnimated(boolean value);

	/**
	 * Returns the value of the '<em><b>Alternative Column Fill Visible</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alternative Column Fill Visible</em>' attribute.
	 * @see #setAlternativeColumnFillVisible(boolean)
	 * @see de.dc.javafx.xcore.workbench.chart.ChartPackage#getChartFXConfig_AlternativeColumnFillVisible()
	 * @model default="true" unique="false"
	 * @generated
	 */
	boolean isAlternativeColumnFillVisible();

	/**
	 * Sets the value of the '{@link de.dc.javafx.xcore.workbench.chart.ChartFXConfig#isAlternativeColumnFillVisible <em>Alternative Column Fill Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alternative Column Fill Visible</em>' attribute.
	 * @see #isAlternativeColumnFillVisible()
	 * @generated
	 */
	void setAlternativeColumnFillVisible(boolean value);

	/**
	 * Returns the value of the '<em><b>Alternative Row Fill Visible</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alternative Row Fill Visible</em>' attribute.
	 * @see #setAlternativeRowFillVisible(boolean)
	 * @see de.dc.javafx.xcore.workbench.chart.ChartPackage#getChartFXConfig_AlternativeRowFillVisible()
	 * @model default="true" unique="false"
	 * @generated
	 */
	boolean isAlternativeRowFillVisible();

	/**
	 * Sets the value of the '{@link de.dc.javafx.xcore.workbench.chart.ChartFXConfig#isAlternativeRowFillVisible <em>Alternative Row Fill Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alternative Row Fill Visible</em>' attribute.
	 * @see #isAlternativeRowFillVisible()
	 * @generated
	 */
	void setAlternativeRowFillVisible(boolean value);

	/**
	 * Returns the value of the '<em><b>Horizontal Grid Lines Visible</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Horizontal Grid Lines Visible</em>' attribute.
	 * @see #setHorizontalGridLinesVisible(boolean)
	 * @see de.dc.javafx.xcore.workbench.chart.ChartPackage#getChartFXConfig_HorizontalGridLinesVisible()
	 * @model default="true" unique="false"
	 * @generated
	 */
	boolean isHorizontalGridLinesVisible();

	/**
	 * Sets the value of the '{@link de.dc.javafx.xcore.workbench.chart.ChartFXConfig#isHorizontalGridLinesVisible <em>Horizontal Grid Lines Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Horizontal Grid Lines Visible</em>' attribute.
	 * @see #isHorizontalGridLinesVisible()
	 * @generated
	 */
	void setHorizontalGridLinesVisible(boolean value);

	/**
	 * Returns the value of the '<em><b>Horizontal Zero Lines Visible</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Horizontal Zero Lines Visible</em>' attribute.
	 * @see #setHorizontalZeroLinesVisible(boolean)
	 * @see de.dc.javafx.xcore.workbench.chart.ChartPackage#getChartFXConfig_HorizontalZeroLinesVisible()
	 * @model default="true" unique="false"
	 * @generated
	 */
	boolean isHorizontalZeroLinesVisible();

	/**
	 * Sets the value of the '{@link de.dc.javafx.xcore.workbench.chart.ChartFXConfig#isHorizontalZeroLinesVisible <em>Horizontal Zero Lines Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Horizontal Zero Lines Visible</em>' attribute.
	 * @see #isHorizontalZeroLinesVisible()
	 * @generated
	 */
	void setHorizontalZeroLinesVisible(boolean value);

	/**
	 * Returns the value of the '<em><b>Vertical Grid Lines Visible</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vertical Grid Lines Visible</em>' attribute.
	 * @see #setVerticalGridLinesVisible(boolean)
	 * @see de.dc.javafx.xcore.workbench.chart.ChartPackage#getChartFXConfig_VerticalGridLinesVisible()
	 * @model default="true" unique="false"
	 * @generated
	 */
	boolean isVerticalGridLinesVisible();

	/**
	 * Sets the value of the '{@link de.dc.javafx.xcore.workbench.chart.ChartFXConfig#isVerticalGridLinesVisible <em>Vertical Grid Lines Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vertical Grid Lines Visible</em>' attribute.
	 * @see #isVerticalGridLinesVisible()
	 * @generated
	 */
	void setVerticalGridLinesVisible(boolean value);

	/**
	 * Returns the value of the '<em><b>Vertical Zero Lines Visible</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vertical Zero Lines Visible</em>' attribute.
	 * @see #setVerticalZeroLinesVisible(boolean)
	 * @see de.dc.javafx.xcore.workbench.chart.ChartPackage#getChartFXConfig_VerticalZeroLinesVisible()
	 * @model default="true" unique="false"
	 * @generated
	 */
	boolean isVerticalZeroLinesVisible();

	/**
	 * Sets the value of the '{@link de.dc.javafx.xcore.workbench.chart.ChartFXConfig#isVerticalZeroLinesVisible <em>Vertical Zero Lines Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vertical Zero Lines Visible</em>' attribute.
	 * @see #isVerticalZeroLinesVisible()
	 * @generated
	 */
	void setVerticalZeroLinesVisible(boolean value);

} // ChartFXConfig
