/**
 */
package de.dc.emf.javafx.model.javafx.impl;

import de.dc.emf.javafx.model.javafx.*;

import org.eclipse.emf.ecore.EClass;
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
		case JavafxPackage.NAMED_ELEMENT:
			return createNamedElement();
		case JavafxPackage.TABLE_VIEW_FX:
			return createTableViewFX();
		case JavafxPackage.TABLE_COLUMN_FX:
			return createTableColumnFX();
		case JavafxPackage.ATTRIBUTE_FX:
			return createAttributeFX();
		case JavafxPackage.BEAN:
			return createBean();
		case JavafxPackage.DERIVED_BEAN:
			return createDerivedBean();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
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
