/**
 */
package de.dc.emf.javafx.model.javafx.impl;

import de.dc.emf.javafx.model.javafx.*;

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
public class JavafxFactoryImpl extends EFactoryImpl implements JavafxFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static JavafxFactory init() {
		try {
			JavafxFactory theJavafxFactory = (JavafxFactory) EPackage.Registry.INSTANCE
					.getEFactory(JavafxPackage.eNS_URI);
			if (theJavafxFactory != null) {
				return theJavafxFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new JavafxFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavafxFactoryImpl() {
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
		case JavafxPackage.PROJECT_FX:
			return createProjectFX();
		case JavafxPackage.TABLE_COLUMN_FX:
			return createTableColumnFX();
		case JavafxPackage.ATTRIBUTE_FX:
			return createAttributeFX();
		case JavafxPackage.BEAN:
			return createBean();
		case JavafxPackage.DERIVED_BEAN:
			return createDerivedBean();
		case JavafxPackage.BINDING:
			return createBinding();
		case JavafxPackage.BINDING_PROPERTY:
			return createBindingProperty();
		case JavafxPackage.TABLE_VIEW_FX:
			return createTableViewFX();
		case JavafxPackage.FILTERED_TABLE_VIEW_FX:
			return createFilteredTableViewFX();
		case JavafxPackage.NAMED_ELEMENT:
			return createNamedElement();
		case JavafxPackage.FILTERED_ELEMENT:
			return createFilteredElement();
		case JavafxPackage.CHART_SERIES:
			return createChartSeries();
		case JavafxPackage.CHART_FX_DATA:
			return createChartFXData();
		case JavafxPackage.LINE_CHART_FX:
			return createLineChartFX();
		case JavafxPackage.PIE_CHART_FX:
			return createPieChartFX();
		case JavafxPackage.AREA_CHART_FX:
			return createAreaChartFX();
		case JavafxPackage.BUBBLE_CHART_FX:
			return createBubbleChartFX();
		case JavafxPackage.SCATTER_CHART_FX:
			return createScatterChartFX();
		case JavafxPackage.BAR_CHART_FX:
			return createBarChartFX();
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
		case JavafxPackage.BINDING_TYPE:
			return createBindingTypeFromString(eDataType, initialValue);
		case JavafxPackage.ORIENTATION:
			return createOrientationFromString(eDataType, initialValue);
		case JavafxPackage.AXIS_TYPE:
			return createAxisTypeFromString(eDataType, initialValue);
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
		case JavafxPackage.BINDING_TYPE:
			return convertBindingTypeToString(eDataType, instanceValue);
		case JavafxPackage.ORIENTATION:
			return convertOrientationToString(eDataType, instanceValue);
		case JavafxPackage.AXIS_TYPE:
			return convertAxisTypeToString(eDataType, instanceValue);
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
	public ProjectFX createProjectFX() {
		ProjectFXImpl projectFX = new ProjectFXImpl();
		return projectFX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TableColumnFX createTableColumnFX() {
		TableColumnFXImpl tableColumnFX = new TableColumnFXImpl();
		return tableColumnFX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AttributeFX createAttributeFX() {
		AttributeFXImpl attributeFX = new AttributeFXImpl();
		return attributeFX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bean createBean() {
		BeanImpl bean = new BeanImpl();
		return bean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DerivedBean createDerivedBean() {
		DerivedBeanImpl derivedBean = new DerivedBeanImpl();
		return derivedBean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Binding createBinding() {
		BindingImpl binding = new BindingImpl();
		return binding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BindingProperty createBindingProperty() {
		BindingPropertyImpl bindingProperty = new BindingPropertyImpl();
		return bindingProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TableViewFX createTableViewFX() {
		TableViewFXImpl tableViewFX = new TableViewFXImpl();
		return tableViewFX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FilteredTableViewFX createFilteredTableViewFX() {
		FilteredTableViewFXImpl filteredTableViewFX = new FilteredTableViewFXImpl();
		return filteredTableViewFX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NamedElement createNamedElement() {
		NamedElementImpl namedElement = new NamedElementImpl();
		return namedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FilteredElement createFilteredElement() {
		FilteredElementImpl filteredElement = new FilteredElementImpl();
		return filteredElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ChartSeries createChartSeries() {
		ChartSeriesImpl chartSeries = new ChartSeriesImpl();
		return chartSeries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ChartFXData createChartFXData() {
		ChartFXDataImpl chartFXData = new ChartFXDataImpl();
		return chartFXData;
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
	public BarChartFX createBarChartFX() {
		BarChartFXImpl barChartFX = new BarChartFXImpl();
		return barChartFX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BindingType createBindingTypeFromString(EDataType eDataType, String initialValue) {
		BindingType result = BindingType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBindingTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Orientation createOrientationFromString(EDataType eDataType, String initialValue) {
		Orientation result = Orientation.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOrientationToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AxisType createAxisTypeFromString(EDataType eDataType, String initialValue) {
		AxisType result = AxisType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAxisTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public JavafxPackage getJavafxPackage() {
		return (JavafxPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static JavafxPackage getPackage() {
		return JavafxPackage.eINSTANCE;
	}

} //JavafxFactoryImpl
