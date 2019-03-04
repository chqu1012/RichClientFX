/**
 */
package de.dc.emf.javafx.model.javafx.impl;

import de.dc.emf.javafx.model.javafx.AxisType;
import de.dc.emf.javafx.model.javafx.ChartFX;
import de.dc.emf.javafx.model.javafx.JavafxPackage;
import de.dc.emf.javafx.model.javafx.Orientation;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Chart FX</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dc.emf.javafx.model.javafx.impl.ChartFXImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link de.dc.emf.javafx.model.javafx.impl.ChartFXImpl#getTitleSide <em>Title Side</em>}</li>
 *   <li>{@link de.dc.emf.javafx.model.javafx.impl.ChartFXImpl#isShowLegend <em>Show Legend</em>}</li>
 *   <li>{@link de.dc.emf.javafx.model.javafx.impl.ChartFXImpl#getLegendSide <em>Legend Side</em>}</li>
 *   <li>{@link de.dc.emf.javafx.model.javafx.impl.ChartFXImpl#getXAxisType <em>XAxis Type</em>}</li>
 *   <li>{@link de.dc.emf.javafx.model.javafx.impl.ChartFXImpl#getYAxisType <em>YAxis Type</em>}</li>
 *   <li>{@link de.dc.emf.javafx.model.javafx.impl.ChartFXImpl#getXAxisLabel <em>XAxis Label</em>}</li>
 *   <li>{@link de.dc.emf.javafx.model.javafx.impl.ChartFXImpl#getYAxisLabel <em>YAxis Label</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ChartFXImpl extends NamedElementImpl implements ChartFX {
	/**
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_EDEFAULT = " ";

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected String title = TITLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTitleSide() <em>Title Side</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitleSide()
	 * @generated
	 * @ordered
	 */
	protected static final Orientation TITLE_SIDE_EDEFAULT = Orientation.TOP;

	/**
	 * The cached value of the '{@link #getTitleSide() <em>Title Side</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitleSide()
	 * @generated
	 * @ordered
	 */
	protected Orientation titleSide = TITLE_SIDE_EDEFAULT;

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
	 * The default value of the '{@link #getLegendSide() <em>Legend Side</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLegendSide()
	 * @generated
	 * @ordered
	 */
	protected static final Orientation LEGEND_SIDE_EDEFAULT = Orientation.BOTTOM;

	/**
	 * The cached value of the '{@link #getLegendSide() <em>Legend Side</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLegendSide()
	 * @generated
	 * @ordered
	 */
	protected Orientation legendSide = LEGEND_SIDE_EDEFAULT;

	/**
	 * The default value of the '{@link #getXAxisType() <em>XAxis Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXAxisType()
	 * @generated
	 * @ordered
	 */
	protected static final AxisType XAXIS_TYPE_EDEFAULT = AxisType.NUMBER;

	/**
	 * The cached value of the '{@link #getXAxisType() <em>XAxis Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXAxisType()
	 * @generated
	 * @ordered
	 */
	protected AxisType xAxisType = XAXIS_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getYAxisType() <em>YAxis Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYAxisType()
	 * @generated
	 * @ordered
	 */
	protected static final AxisType YAXIS_TYPE_EDEFAULT = AxisType.NUMBER;

	/**
	 * The cached value of the '{@link #getYAxisType() <em>YAxis Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYAxisType()
	 * @generated
	 * @ordered
	 */
	protected AxisType yAxisType = YAXIS_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getXAxisLabel() <em>XAxis Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXAxisLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String XAXIS_LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getXAxisLabel() <em>XAxis Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXAxisLabel()
	 * @generated
	 * @ordered
	 */
	protected String xAxisLabel = XAXIS_LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getYAxisLabel() <em>YAxis Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYAxisLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String YAXIS_LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getYAxisLabel() <em>YAxis Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYAxisLabel()
	 * @generated
	 * @ordered
	 */
	protected String yAxisLabel = YAXIS_LABEL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChartFXImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JavafxPackage.Literals.CHART_FX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitle(String newTitle) {
		String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavafxPackage.CHART_FX__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Orientation getTitleSide() {
		return titleSide;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitleSide(Orientation newTitleSide) {
		Orientation oldTitleSide = titleSide;
		titleSide = newTitleSide == null ? TITLE_SIDE_EDEFAULT : newTitleSide;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavafxPackage.CHART_FX__TITLE_SIDE, oldTitleSide,
					titleSide));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isShowLegend() {
		return showLegend;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShowLegend(boolean newShowLegend) {
		boolean oldShowLegend = showLegend;
		showLegend = newShowLegend;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavafxPackage.CHART_FX__SHOW_LEGEND, oldShowLegend,
					showLegend));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Orientation getLegendSide() {
		return legendSide;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLegendSide(Orientation newLegendSide) {
		Orientation oldLegendSide = legendSide;
		legendSide = newLegendSide == null ? LEGEND_SIDE_EDEFAULT : newLegendSide;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavafxPackage.CHART_FX__LEGEND_SIDE, oldLegendSide,
					legendSide));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AxisType getXAxisType() {
		return xAxisType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXAxisType(AxisType newXAxisType) {
		AxisType oldXAxisType = xAxisType;
		xAxisType = newXAxisType == null ? XAXIS_TYPE_EDEFAULT : newXAxisType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavafxPackage.CHART_FX__XAXIS_TYPE, oldXAxisType,
					xAxisType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AxisType getYAxisType() {
		return yAxisType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYAxisType(AxisType newYAxisType) {
		AxisType oldYAxisType = yAxisType;
		yAxisType = newYAxisType == null ? YAXIS_TYPE_EDEFAULT : newYAxisType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavafxPackage.CHART_FX__YAXIS_TYPE, oldYAxisType,
					yAxisType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getXAxisLabel() {
		return xAxisLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXAxisLabel(String newXAxisLabel) {
		String oldXAxisLabel = xAxisLabel;
		xAxisLabel = newXAxisLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavafxPackage.CHART_FX__XAXIS_LABEL, oldXAxisLabel,
					xAxisLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getYAxisLabel() {
		return yAxisLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYAxisLabel(String newYAxisLabel) {
		String oldYAxisLabel = yAxisLabel;
		yAxisLabel = newYAxisLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavafxPackage.CHART_FX__YAXIS_LABEL, oldYAxisLabel,
					yAxisLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case JavafxPackage.CHART_FX__TITLE:
			return getTitle();
		case JavafxPackage.CHART_FX__TITLE_SIDE:
			return getTitleSide();
		case JavafxPackage.CHART_FX__SHOW_LEGEND:
			return isShowLegend();
		case JavafxPackage.CHART_FX__LEGEND_SIDE:
			return getLegendSide();
		case JavafxPackage.CHART_FX__XAXIS_TYPE:
			return getXAxisType();
		case JavafxPackage.CHART_FX__YAXIS_TYPE:
			return getYAxisType();
		case JavafxPackage.CHART_FX__XAXIS_LABEL:
			return getXAxisLabel();
		case JavafxPackage.CHART_FX__YAXIS_LABEL:
			return getYAxisLabel();
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
		case JavafxPackage.CHART_FX__TITLE:
			setTitle((String) newValue);
			return;
		case JavafxPackage.CHART_FX__TITLE_SIDE:
			setTitleSide((Orientation) newValue);
			return;
		case JavafxPackage.CHART_FX__SHOW_LEGEND:
			setShowLegend((Boolean) newValue);
			return;
		case JavafxPackage.CHART_FX__LEGEND_SIDE:
			setLegendSide((Orientation) newValue);
			return;
		case JavafxPackage.CHART_FX__XAXIS_TYPE:
			setXAxisType((AxisType) newValue);
			return;
		case JavafxPackage.CHART_FX__YAXIS_TYPE:
			setYAxisType((AxisType) newValue);
			return;
		case JavafxPackage.CHART_FX__XAXIS_LABEL:
			setXAxisLabel((String) newValue);
			return;
		case JavafxPackage.CHART_FX__YAXIS_LABEL:
			setYAxisLabel((String) newValue);
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
		case JavafxPackage.CHART_FX__TITLE:
			setTitle(TITLE_EDEFAULT);
			return;
		case JavafxPackage.CHART_FX__TITLE_SIDE:
			setTitleSide(TITLE_SIDE_EDEFAULT);
			return;
		case JavafxPackage.CHART_FX__SHOW_LEGEND:
			setShowLegend(SHOW_LEGEND_EDEFAULT);
			return;
		case JavafxPackage.CHART_FX__LEGEND_SIDE:
			setLegendSide(LEGEND_SIDE_EDEFAULT);
			return;
		case JavafxPackage.CHART_FX__XAXIS_TYPE:
			setXAxisType(XAXIS_TYPE_EDEFAULT);
			return;
		case JavafxPackage.CHART_FX__YAXIS_TYPE:
			setYAxisType(YAXIS_TYPE_EDEFAULT);
			return;
		case JavafxPackage.CHART_FX__XAXIS_LABEL:
			setXAxisLabel(XAXIS_LABEL_EDEFAULT);
			return;
		case JavafxPackage.CHART_FX__YAXIS_LABEL:
			setYAxisLabel(YAXIS_LABEL_EDEFAULT);
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
		case JavafxPackage.CHART_FX__TITLE:
			return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
		case JavafxPackage.CHART_FX__TITLE_SIDE:
			return titleSide != TITLE_SIDE_EDEFAULT;
		case JavafxPackage.CHART_FX__SHOW_LEGEND:
			return showLegend != SHOW_LEGEND_EDEFAULT;
		case JavafxPackage.CHART_FX__LEGEND_SIDE:
			return legendSide != LEGEND_SIDE_EDEFAULT;
		case JavafxPackage.CHART_FX__XAXIS_TYPE:
			return xAxisType != XAXIS_TYPE_EDEFAULT;
		case JavafxPackage.CHART_FX__YAXIS_TYPE:
			return yAxisType != YAXIS_TYPE_EDEFAULT;
		case JavafxPackage.CHART_FX__XAXIS_LABEL:
			return XAXIS_LABEL_EDEFAULT == null ? xAxisLabel != null : !XAXIS_LABEL_EDEFAULT.equals(xAxisLabel);
		case JavafxPackage.CHART_FX__YAXIS_LABEL:
			return YAXIS_LABEL_EDEFAULT == null ? yAxisLabel != null : !YAXIS_LABEL_EDEFAULT.equals(yAxisLabel);
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
		result.append(" (title: ");
		result.append(title);
		result.append(", titleSide: ");
		result.append(titleSide);
		result.append(", showLegend: ");
		result.append(showLegend);
		result.append(", legendSide: ");
		result.append(legendSide);
		result.append(", xAxisType: ");
		result.append(xAxisType);
		result.append(", yAxisType: ");
		result.append(yAxisType);
		result.append(", xAxisLabel: ");
		result.append(xAxisLabel);
		result.append(", yAxisLabel: ");
		result.append(yAxisLabel);
		result.append(')');
		return result.toString();
	}

} //ChartFXImpl
