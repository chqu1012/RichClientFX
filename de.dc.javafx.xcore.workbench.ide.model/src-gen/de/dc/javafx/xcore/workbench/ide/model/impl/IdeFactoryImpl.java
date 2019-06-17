/**
 */
package de.dc.javafx.xcore.workbench.ide.model.impl;

import de.dc.javafx.xcore.workbench.ide.model.*;

import org.eclipse.emf.common.notify.AdapterFactory;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class IdeFactoryImpl extends EFactoryImpl implements IdeFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IdeFactory init() {
		try {
			IdeFactory theIdeFactory = (IdeFactory) EPackage.Registry.INSTANCE.getEFactory(IdePackage.eNS_URI);
			if (theIdeFactory != null) {
				return theIdeFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new IdeFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IdeFactoryImpl() {
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
		case IdePackage.IDE_CONTAINER:
			return createIdeContainer();
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
		case IdePackage.MODEL_EFACTORY:
			return createModelEFactoryFromString(eDataType, initialValue);
		case IdePackage.MODEL_EPACKAGE:
			return createModelEPackageFromString(eDataType, initialValue);
		case IdePackage.ADAPTER_EFACTORY:
			return createAdapterEFactoryFromString(eDataType, initialValue);
		case IdePackage.RENDERER:
			return createRendererFromString(eDataType, initialValue);
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
		case IdePackage.MODEL_EFACTORY:
			return convertModelEFactoryToString(eDataType, instanceValue);
		case IdePackage.MODEL_EPACKAGE:
			return convertModelEPackageToString(eDataType, instanceValue);
		case IdePackage.ADAPTER_EFACTORY:
			return convertAdapterEFactoryToString(eDataType, instanceValue);
		case IdePackage.RENDERER:
			return convertRendererToString(eDataType, instanceValue);
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
	public IdeContainer createIdeContainer() {
		IdeContainerImpl ideContainer = new IdeContainerImpl();
		return ideContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EFactory createModelEFactory(String literal) {
		return (EFactory) super.createFromString(IdePackage.Literals.MODEL_EFACTORY, literal);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EFactory createModelEFactoryFromString(EDataType eDataType, String initialValue) {
		return createModelEFactory(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertModelEFactory(EFactory instanceValue) {
		return super.convertToString(IdePackage.Literals.MODEL_EFACTORY, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertModelEFactoryToString(EDataType eDataType, Object instanceValue) {
		return convertModelEFactory((EFactory) instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EPackage createModelEPackage(String literal) {
		return (EPackage) super.createFromString(IdePackage.Literals.MODEL_EPACKAGE, literal);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EPackage createModelEPackageFromString(EDataType eDataType, String initialValue) {
		return createModelEPackage(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertModelEPackage(EPackage instanceValue) {
		return super.convertToString(IdePackage.Literals.MODEL_EPACKAGE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertModelEPackageToString(EDataType eDataType, Object instanceValue) {
		return convertModelEPackage((EPackage) instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AdapterFactory createAdapterEFactory(String literal) {
		return (AdapterFactory) super.createFromString(IdePackage.Literals.ADAPTER_EFACTORY, literal);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdapterFactory createAdapterEFactoryFromString(EDataType eDataType, String initialValue) {
		return createAdapterEFactory(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertAdapterEFactory(AdapterFactory instanceValue) {
		return super.convertToString(IdePackage.Literals.ADAPTER_EFACTORY, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAdapterEFactoryToString(EDataType eDataType, Object instanceValue) {
		return convertAdapterEFactory((AdapterFactory) instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Switch createRenderer(String literal) {
		return (Switch) super.createFromString(IdePackage.Literals.RENDERER, literal);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Switch createRendererFromString(EDataType eDataType, String initialValue) {
		return createRenderer(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertRenderer(Switch instanceValue) {
		return super.convertToString(IdePackage.Literals.RENDERER, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRendererToString(EDataType eDataType, Object instanceValue) {
		return convertRenderer((Switch) instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IdePackage getIdePackage() {
		return (IdePackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static IdePackage getPackage() {
		return IdePackage.eINSTANCE;
	}

} //IdeFactoryImpl
