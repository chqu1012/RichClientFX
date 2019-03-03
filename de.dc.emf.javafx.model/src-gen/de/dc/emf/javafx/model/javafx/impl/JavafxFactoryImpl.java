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
		case JavafxPackage.NAMED_ELEMENT:
			return createNamedElement();
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
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProjectFX createProjectFX() {
		ProjectFXImpl projectFX = new ProjectFXImpl();
		return projectFX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedElement createNamedElement() {
		NamedElementImpl namedElement = new NamedElementImpl();
		return namedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TableViewFX createTableViewFX() {
		TableViewFXImpl tableViewFX = new TableViewFXImpl();
		return tableViewFX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TableColumnFX createTableColumnFX() {
		TableColumnFXImpl tableColumnFX = new TableColumnFXImpl();
		return tableColumnFX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeFX createAttributeFX() {
		AttributeFXImpl attributeFX = new AttributeFXImpl();
		return attributeFX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bean createBean() {
		BeanImpl bean = new BeanImpl();
		return bean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DerivedBean createDerivedBean() {
		DerivedBeanImpl derivedBean = new DerivedBeanImpl();
		return derivedBean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Binding createBinding() {
		BindingImpl binding = new BindingImpl();
		return binding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BindingProperty createBindingProperty() {
		BindingPropertyImpl bindingProperty = new BindingPropertyImpl();
		return bindingProperty;
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
