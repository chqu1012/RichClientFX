/**
 */
package de.dc.javafx.xcore.workbench.chart.impl;

import de.dc.javafx.xcore.workbench.chart.ChartFXConfig;
import de.dc.javafx.xcore.workbench.chart.ChartPackage;
import de.dc.javafx.xcore.workbench.chart.ChartSide;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>FX Config</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dc.javafx.xcore.workbench.chart.impl.ChartFXConfigImpl#getSideLegend <em>Side Legend</em>}</li>
 *   <li>{@link de.dc.javafx.xcore.workbench.chart.impl.ChartFXConfigImpl#getTitleSide <em>Title Side</em>}</li>
 *   <li>{@link de.dc.javafx.xcore.workbench.chart.impl.ChartFXConfigImpl#isShowLegend <em>Show Legend</em>}</li>
 *   <li>{@link de.dc.javafx.xcore.workbench.chart.impl.ChartFXConfigImpl#isIsAnimated <em>Is Animated</em>}</li>
 *   <li>{@link de.dc.javafx.xcore.workbench.chart.impl.ChartFXConfigImpl#isAlternativeColumnFillVisible <em>Alternative Column Fill Visible</em>}</li>
 *   <li>{@link de.dc.javafx.xcore.workbench.chart.impl.ChartFXConfigImpl#isAlternativeRowFillVisible <em>Alternative Row Fill Visible</em>}</li>
 *   <li>{@link de.dc.javafx.xcore.workbench.chart.impl.ChartFXConfigImpl#isHorizontalGridLinesVisible <em>Horizontal Grid Lines Visible</em>}</li>
 *   <li>{@link de.dc.javafx.xcore.workbench.chart.impl.ChartFXConfigImpl#isHorizontalZeroLinesVisible <em>Horizontal Zero Lines Visible</em>}</li>
 *   <li>{@link de.dc.javafx.xcore.workbench.chart.impl.ChartFXConfigImpl#isVerticalGridLinesVisible <em>Vertical Grid Lines Visible</em>}</li>
 *   <li>{@link de.dc.javafx.xcore.workbench.chart.impl.ChartFXConfigImpl#isVerticalZeroLinesVisible <em>Vertical Zero Lines Visible</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ChartFXConfigImpl extends MinimalEObjectImpl.Container implements ChartFXConfig {
	/**
	 * The default value of the '{@link #getSideLegend() <em>Side Legend</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSideLegend()
	 * @generated
	 * @ordered
	 */
	protected static final ChartSide SIDE_LEGEND_EDEFAULT = ChartSide.TOP;

	/**
	 * The cached value of the '{@link #getSideLegend() <em>Side Legend</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSideLegend()
	 * @generated
	 * @ordered
	 */
	protected ChartSide sideLegend = SIDE_LEGEND_EDEFAULT;

	/**
	 * The default value of the '{@link #getTitleSide() <em>Title Side</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitleSide()
	 * @generated
	 * @ordered
	 */
	protected static final ChartSide TITLE_SIDE_EDEFAULT = ChartSide.TOP;

	/**
	 * The cached value of the '{@link #getTitleSide() <em>Title Side</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitleSide()
	 * @generated
	 * @ordered
	 */
	protected ChartSide titleSide = TITLE_SIDE_EDEFAULT;

	/**
	 * The default value of the '{@link #isShowLegend() <em>Show Legend</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isShowLegend()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SHOW_LEGEND_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isShowLegend() <em>Show Legend</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isShowLegend()
	 * @generated
	 * @ordered
	 */
	protected boolean showLegend = SHOW_LEGEND_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsAnimated() <em>Is Animated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsAnimated()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_ANIMATED_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isIsAnimated() <em>Is Animated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsAnimated()
	 * @generated
	 * @ordered
	 */
	protected boolean isAnimated = IS_ANIMATED_EDEFAULT;

	/**
	 * The default value of the '{@link #isAlternativeColumnFillVisible() <em>Alternative Column Fill Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAlternativeColumnFillVisible()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ALTERNATIVE_COLUMN_FILL_VISIBLE_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isAlternativeColumnFillVisible() <em>Alternative Column Fill Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAlternativeColumnFillVisible()
	 * @generated
	 * @ordered
	 */
	protected boolean alternativeColumnFillVisible = ALTERNATIVE_COLUMN_FILL_VISIBLE_EDEFAULT;

	/**
	 * The default value of the '{@link #isAlternativeRowFillVisible() <em>Alternative Row Fill Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAlternativeRowFillVisible()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ALTERNATIVE_ROW_FILL_VISIBLE_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isAlternativeRowFillVisible() <em>Alternative Row Fill Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAlternativeRowFillVisible()
	 * @generated
	 * @ordered
	 */
	protected boolean alternativeRowFillVisible = ALTERNATIVE_ROW_FILL_VISIBLE_EDEFAULT;

	/**
	 * The default value of the '{@link #isHorizontalGridLinesVisible() <em>Horizontal Grid Lines Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHorizontalGridLinesVisible()
	 * @generated
	 * @ordered
	 */
	protected static final boolean HORIZONTAL_GRID_LINES_VISIBLE_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isHorizontalGridLinesVisible() <em>Horizontal Grid Lines Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHorizontalGridLinesVisible()
	 * @generated
	 * @ordered
	 */
	protected boolean horizontalGridLinesVisible = HORIZONTAL_GRID_LINES_VISIBLE_EDEFAULT;

	/**
	 * The default value of the '{@link #isHorizontalZeroLinesVisible() <em>Horizontal Zero Lines Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHorizontalZeroLinesVisible()
	 * @generated
	 * @ordered
	 */
	protected static final boolean HORIZONTAL_ZERO_LINES_VISIBLE_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isHorizontalZeroLinesVisible() <em>Horizontal Zero Lines Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHorizontalZeroLinesVisible()
	 * @generated
	 * @ordered
	 */
	protected boolean horizontalZeroLinesVisible = HORIZONTAL_ZERO_LINES_VISIBLE_EDEFAULT;

	/**
	 * The default value of the '{@link #isVerticalGridLinesVisible() <em>Vertical Grid Lines Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVerticalGridLinesVisible()
	 * @generated
	 * @ordered
	 */
	protected static final boolean VERTICAL_GRID_LINES_VISIBLE_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isVerticalGridLinesVisible() <em>Vertical Grid Lines Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVerticalGridLinesVisible()
	 * @generated
	 * @ordered
	 */
	protected boolean verticalGridLinesVisible = VERTICAL_GRID_LINES_VISIBLE_EDEFAULT;

	/**
	 * The default value of the '{@link #isVerticalZeroLinesVisible() <em>Vertical Zero Lines Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVerticalZeroLinesVisible()
	 * @generated
	 * @ordered
	 */
	protected static final boolean VERTICAL_ZERO_LINES_VISIBLE_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isVerticalZeroLinesVisible() <em>Vertical Zero Lines Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVerticalZeroLinesVisible()
	 * @generated
	 * @ordered
	 */
	protected boolean verticalZeroLinesVisible = VERTICAL_ZERO_LINES_VISIBLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChartFXConfigImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ChartPackage.Literals.CHART_FX_CONFIG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ChartSide getSideLegend() {
		return sideLegend;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSideLegend(ChartSide newSideLegend) {
		ChartSide oldSideLegend = sideLegend;
		sideLegend = newSideLegend == null ? SIDE_LEGEND_EDEFAULT : newSideLegend;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChartPackage.CHART_FX_CONFIG__SIDE_LEGEND,
					oldSideLegend, sideLegend));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ChartSide getTitleSide() {
		return titleSide;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTitleSide(ChartSide newTitleSide) {
		ChartSide oldTitleSide = titleSide;
		titleSide = newTitleSide == null ? TITLE_SIDE_EDEFAULT : newTitleSide;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChartPackage.CHART_FX_CONFIG__TITLE_SIDE,
					oldTitleSide, titleSide));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isShowLegend() {
		return showLegend;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setShowLegend(boolean newShowLegend) {
		boolean oldShowLegend = showLegend;
		showLegend = newShowLegend;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChartPackage.CHART_FX_CONFIG__SHOW_LEGEND,
					oldShowLegend, showLegend));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsAnimated() {
		return isAnimated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsAnimated(boolean newIsAnimated) {
		boolean oldIsAnimated = isAnimated;
		isAnimated = newIsAnimated;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChartPackage.CHART_FX_CONFIG__IS_ANIMATED,
					oldIsAnimated, isAnimated));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isAlternativeColumnFillVisible() {
		return alternativeColumnFillVisible;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAlternativeColumnFillVisible(boolean newAlternativeColumnFillVisible) {
		boolean oldAlternativeColumnFillVisible = alternativeColumnFillVisible;
		alternativeColumnFillVisible = newAlternativeColumnFillVisible;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ChartPackage.CHART_FX_CONFIG__ALTERNATIVE_COLUMN_FILL_VISIBLE, oldAlternativeColumnFillVisible,
					alternativeColumnFillVisible));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isAlternativeRowFillVisible() {
		return alternativeRowFillVisible;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAlternativeRowFillVisible(boolean newAlternativeRowFillVisible) {
		boolean oldAlternativeRowFillVisible = alternativeRowFillVisible;
		alternativeRowFillVisible = newAlternativeRowFillVisible;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ChartPackage.CHART_FX_CONFIG__ALTERNATIVE_ROW_FILL_VISIBLE, oldAlternativeRowFillVisible,
					alternativeRowFillVisible));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isHorizontalGridLinesVisible() {
		return horizontalGridLinesVisible;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHorizontalGridLinesVisible(boolean newHorizontalGridLinesVisible) {
		boolean oldHorizontalGridLinesVisible = horizontalGridLinesVisible;
		horizontalGridLinesVisible = newHorizontalGridLinesVisible;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ChartPackage.CHART_FX_CONFIG__HORIZONTAL_GRID_LINES_VISIBLE, oldHorizontalGridLinesVisible,
					horizontalGridLinesVisible));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isHorizontalZeroLinesVisible() {
		return horizontalZeroLinesVisible;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHorizontalZeroLinesVisible(boolean newHorizontalZeroLinesVisible) {
		boolean oldHorizontalZeroLinesVisible = horizontalZeroLinesVisible;
		horizontalZeroLinesVisible = newHorizontalZeroLinesVisible;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ChartPackage.CHART_FX_CONFIG__HORIZONTAL_ZERO_LINES_VISIBLE, oldHorizontalZeroLinesVisible,
					horizontalZeroLinesVisible));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isVerticalGridLinesVisible() {
		return verticalGridLinesVisible;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVerticalGridLinesVisible(boolean newVerticalGridLinesVisible) {
		boolean oldVerticalGridLinesVisible = verticalGridLinesVisible;
		verticalGridLinesVisible = newVerticalGridLinesVisible;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ChartPackage.CHART_FX_CONFIG__VERTICAL_GRID_LINES_VISIBLE, oldVerticalGridLinesVisible,
					verticalGridLinesVisible));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isVerticalZeroLinesVisible() {
		return verticalZeroLinesVisible;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVerticalZeroLinesVisible(boolean newVerticalZeroLinesVisible) {
		boolean oldVerticalZeroLinesVisible = verticalZeroLinesVisible;
		verticalZeroLinesVisible = newVerticalZeroLinesVisible;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ChartPackage.CHART_FX_CONFIG__VERTICAL_ZERO_LINES_VISIBLE, oldVerticalZeroLinesVisible,
					verticalZeroLinesVisible));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ChartPackage.CHART_FX_CONFIG__SIDE_LEGEND:
			return getSideLegend();
		case ChartPackage.CHART_FX_CONFIG__TITLE_SIDE:
			return getTitleSide();
		case ChartPackage.CHART_FX_CONFIG__SHOW_LEGEND:
			return isShowLegend();
		case ChartPackage.CHART_FX_CONFIG__IS_ANIMATED:
			return isIsAnimated();
		case ChartPackage.CHART_FX_CONFIG__ALTERNATIVE_COLUMN_FILL_VISIBLE:
			return isAlternativeColumnFillVisible();
		case ChartPackage.CHART_FX_CONFIG__ALTERNATIVE_ROW_FILL_VISIBLE:
			return isAlternativeRowFillVisible();
		case ChartPackage.CHART_FX_CONFIG__HORIZONTAL_GRID_LINES_VISIBLE:
			return isHorizontalGridLinesVisible();
		case ChartPackage.CHART_FX_CONFIG__HORIZONTAL_ZERO_LINES_VISIBLE:
			return isHorizontalZeroLinesVisible();
		case ChartPackage.CHART_FX_CONFIG__VERTICAL_GRID_LINES_VISIBLE:
			return isVerticalGridLinesVisible();
		case ChartPackage.CHART_FX_CONFIG__VERTICAL_ZERO_LINES_VISIBLE:
			return isVerticalZeroLinesVisible();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case ChartPackage.CHART_FX_CONFIG__SIDE_LEGEND:
			setSideLegend((ChartSide) newValue);
			return;
		case ChartPackage.CHART_FX_CONFIG__TITLE_SIDE:
			setTitleSide((ChartSide) newValue);
			return;
		case ChartPackage.CHART_FX_CONFIG__SHOW_LEGEND:
			setShowLegend((Boolean) newValue);
			return;
		case ChartPackage.CHART_FX_CONFIG__IS_ANIMATED:
			setIsAnimated((Boolean) newValue);
			return;
		case ChartPackage.CHART_FX_CONFIG__ALTERNATIVE_COLUMN_FILL_VISIBLE:
			setAlternativeColumnFillVisible((Boolean) newValue);
			return;
		case ChartPackage.CHART_FX_CONFIG__ALTERNATIVE_ROW_FILL_VISIBLE:
			setAlternativeRowFillVisible((Boolean) newValue);
			return;
		case ChartPackage.CHART_FX_CONFIG__HORIZONTAL_GRID_LINES_VISIBLE:
			setHorizontalGridLinesVisible((Boolean) newValue);
			return;
		case ChartPackage.CHART_FX_CONFIG__HORIZONTAL_ZERO_LINES_VISIBLE:
			setHorizontalZeroLinesVisible((Boolean) newValue);
			return;
		case ChartPackage.CHART_FX_CONFIG__VERTICAL_GRID_LINES_VISIBLE:
			setVerticalGridLinesVisible((Boolean) newValue);
			return;
		case ChartPackage.CHART_FX_CONFIG__VERTICAL_ZERO_LINES_VISIBLE:
			setVerticalZeroLinesVisible((Boolean) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case ChartPackage.CHART_FX_CONFIG__SIDE_LEGEND:
			setSideLegend(SIDE_LEGEND_EDEFAULT);
			return;
		case ChartPackage.CHART_FX_CONFIG__TITLE_SIDE:
			setTitleSide(TITLE_SIDE_EDEFAULT);
			return;
		case ChartPackage.CHART_FX_CONFIG__SHOW_LEGEND:
			setShowLegend(SHOW_LEGEND_EDEFAULT);
			return;
		case ChartPackage.CHART_FX_CONFIG__IS_ANIMATED:
			setIsAnimated(IS_ANIMATED_EDEFAULT);
			return;
		case ChartPackage.CHART_FX_CONFIG__ALTERNATIVE_COLUMN_FILL_VISIBLE:
			setAlternativeColumnFillVisible(ALTERNATIVE_COLUMN_FILL_VISIBLE_EDEFAULT);
			return;
		case ChartPackage.CHART_FX_CONFIG__ALTERNATIVE_ROW_FILL_VISIBLE:
			setAlternativeRowFillVisible(ALTERNATIVE_ROW_FILL_VISIBLE_EDEFAULT);
			return;
		case ChartPackage.CHART_FX_CONFIG__HORIZONTAL_GRID_LINES_VISIBLE:
			setHorizontalGridLinesVisible(HORIZONTAL_GRID_LINES_VISIBLE_EDEFAULT);
			return;
		case ChartPackage.CHART_FX_CONFIG__HORIZONTAL_ZERO_LINES_VISIBLE:
			setHorizontalZeroLinesVisible(HORIZONTAL_ZERO_LINES_VISIBLE_EDEFAULT);
			return;
		case ChartPackage.CHART_FX_CONFIG__VERTICAL_GRID_LINES_VISIBLE:
			setVerticalGridLinesVisible(VERTICAL_GRID_LINES_VISIBLE_EDEFAULT);
			return;
		case ChartPackage.CHART_FX_CONFIG__VERTICAL_ZERO_LINES_VISIBLE:
			setVerticalZeroLinesVisible(VERTICAL_ZERO_LINES_VISIBLE_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case ChartPackage.CHART_FX_CONFIG__SIDE_LEGEND:
			return sideLegend != SIDE_LEGEND_EDEFAULT;
		case ChartPackage.CHART_FX_CONFIG__TITLE_SIDE:
			return titleSide != TITLE_SIDE_EDEFAULT;
		case ChartPackage.CHART_FX_CONFIG__SHOW_LEGEND:
			return showLegend != SHOW_LEGEND_EDEFAULT;
		case ChartPackage.CHART_FX_CONFIG__IS_ANIMATED:
			return isAnimated != IS_ANIMATED_EDEFAULT;
		case ChartPackage.CHART_FX_CONFIG__ALTERNATIVE_COLUMN_FILL_VISIBLE:
			return alternativeColumnFillVisible != ALTERNATIVE_COLUMN_FILL_VISIBLE_EDEFAULT;
		case ChartPackage.CHART_FX_CONFIG__ALTERNATIVE_ROW_FILL_VISIBLE:
			return alternativeRowFillVisible != ALTERNATIVE_ROW_FILL_VISIBLE_EDEFAULT;
		case ChartPackage.CHART_FX_CONFIG__HORIZONTAL_GRID_LINES_VISIBLE:
			return horizontalGridLinesVisible != HORIZONTAL_GRID_LINES_VISIBLE_EDEFAULT;
		case ChartPackage.CHART_FX_CONFIG__HORIZONTAL_ZERO_LINES_VISIBLE:
			return horizontalZeroLinesVisible != HORIZONTAL_ZERO_LINES_VISIBLE_EDEFAULT;
		case ChartPackage.CHART_FX_CONFIG__VERTICAL_GRID_LINES_VISIBLE:
			return verticalGridLinesVisible != VERTICAL_GRID_LINES_VISIBLE_EDEFAULT;
		case ChartPackage.CHART_FX_CONFIG__VERTICAL_ZERO_LINES_VISIBLE:
			return verticalZeroLinesVisible != VERTICAL_ZERO_LINES_VISIBLE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (sideLegend: ");
		result.append(sideLegend);
		result.append(", titleSide: ");
		result.append(titleSide);
		result.append(", showLegend: ");
		result.append(showLegend);
		result.append(", isAnimated: ");
		result.append(isAnimated);
		result.append(", alternativeColumnFillVisible: ");
		result.append(alternativeColumnFillVisible);
		result.append(", alternativeRowFillVisible: ");
		result.append(alternativeRowFillVisible);
		result.append(", horizontalGridLinesVisible: ");
		result.append(horizontalGridLinesVisible);
		result.append(", horizontalZeroLinesVisible: ");
		result.append(horizontalZeroLinesVisible);
		result.append(", verticalGridLinesVisible: ");
		result.append(verticalGridLinesVisible);
		result.append(", verticalZeroLinesVisible: ");
		result.append(verticalZeroLinesVisible);
		result.append(')');
		return result.toString();
	}

} //ChartFXConfigImpl
