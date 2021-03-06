/**
 */
package de.dc.emf.javafx.model.javafx;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Chart FX</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dc.emf.javafx.model.javafx.ChartFX#getTitle <em>Title</em>}</li>
 *   <li>{@link de.dc.emf.javafx.model.javafx.ChartFX#getTitleSide <em>Title Side</em>}</li>
 *   <li>{@link de.dc.emf.javafx.model.javafx.ChartFX#isShowLegend <em>Show Legend</em>}</li>
 *   <li>{@link de.dc.emf.javafx.model.javafx.ChartFX#getLegendSide <em>Legend Side</em>}</li>
 *   <li>{@link de.dc.emf.javafx.model.javafx.ChartFX#getSeries <em>Series</em>}</li>
 * </ul>
 *
 * @see de.dc.emf.javafx.model.javafx.JavafxPackage#getChartFX()
 * @model abstract="true"
 * @generated
 */
public interface ChartFX extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * The default value is <code>" "</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see de.dc.emf.javafx.model.javafx.JavafxPackage#getChartFX_Title()
	 * @model default=" " unique="false"
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link de.dc.emf.javafx.model.javafx.ChartFX#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Title Side</b></em>' attribute.
	 * The default value is <code>"Top"</code>.
	 * The literals are from the enumeration {@link de.dc.emf.javafx.model.javafx.Orientation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title Side</em>' attribute.
	 * @see de.dc.emf.javafx.model.javafx.Orientation
	 * @see #setTitleSide(Orientation)
	 * @see de.dc.emf.javafx.model.javafx.JavafxPackage#getChartFX_TitleSide()
	 * @model default="Top" unique="false"
	 * @generated
	 */
	Orientation getTitleSide();

	/**
	 * Sets the value of the '{@link de.dc.emf.javafx.model.javafx.ChartFX#getTitleSide <em>Title Side</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title Side</em>' attribute.
	 * @see de.dc.emf.javafx.model.javafx.Orientation
	 * @see #getTitleSide()
	 * @generated
	 */
	void setTitleSide(Orientation value);

	/**
	 * Returns the value of the '<em><b>Show Legend</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Show Legend</em>' attribute.
	 * @see #setShowLegend(boolean)
	 * @see de.dc.emf.javafx.model.javafx.JavafxPackage#getChartFX_ShowLegend()
	 * @model default="true" unique="false"
	 * @generated
	 */
	boolean isShowLegend();

	/**
	 * Sets the value of the '{@link de.dc.emf.javafx.model.javafx.ChartFX#isShowLegend <em>Show Legend</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Show Legend</em>' attribute.
	 * @see #isShowLegend()
	 * @generated
	 */
	void setShowLegend(boolean value);

	/**
	 * Returns the value of the '<em><b>Legend Side</b></em>' attribute.
	 * The default value is <code>"Bottom"</code>.
	 * The literals are from the enumeration {@link de.dc.emf.javafx.model.javafx.Orientation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Legend Side</em>' attribute.
	 * @see de.dc.emf.javafx.model.javafx.Orientation
	 * @see #setLegendSide(Orientation)
	 * @see de.dc.emf.javafx.model.javafx.JavafxPackage#getChartFX_LegendSide()
	 * @model default="Bottom" unique="false"
	 * @generated
	 */
	Orientation getLegendSide();

	/**
	 * Sets the value of the '{@link de.dc.emf.javafx.model.javafx.ChartFX#getLegendSide <em>Legend Side</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Legend Side</em>' attribute.
	 * @see de.dc.emf.javafx.model.javafx.Orientation
	 * @see #getLegendSide()
	 * @generated
	 */
	void setLegendSide(Orientation value);

	/**
	 * Returns the value of the '<em><b>Series</b></em>' containment reference list.
	 * The list contents are of type {@link de.dc.emf.javafx.model.javafx.ChartSeries}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Series</em>' containment reference list.
	 * @see de.dc.emf.javafx.model.javafx.JavafxPackage#getChartFX_Series()
	 * @model containment="true"
	 * @generated
	 */
	EList<ChartSeries> getSeries();

} // ChartFX
