/**
 */
package de.dc.javafx.xcore.workbench.ide.model.impl;

import de.dc.javafx.xcore.workbench.ide.model.IdeContainer;
import de.dc.javafx.xcore.workbench.ide.model.IdePackage;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dc.javafx.xcore.workbench.ide.model.impl.IdeContainerImpl#getPackagePath <em>Package Path</em>}</li>
 *   <li>{@link de.dc.javafx.xcore.workbench.ide.model.impl.IdeContainerImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.dc.javafx.xcore.workbench.ide.model.impl.IdeContainerImpl#getModelName <em>Model Name</em>}</li>
 *   <li>{@link de.dc.javafx.xcore.workbench.ide.model.impl.IdeContainerImpl#getExt <em>Ext</em>}</li>
 *   <li>{@link de.dc.javafx.xcore.workbench.ide.model.impl.IdeContainerImpl#getPreviewName <em>Preview Name</em>}</li>
 *   <li>{@link de.dc.javafx.xcore.workbench.ide.model.impl.IdeContainerImpl#getModelEFactory <em>Model EFactory</em>}</li>
 *   <li>{@link de.dc.javafx.xcore.workbench.ide.model.impl.IdeContainerImpl#getModelEPackage <em>Model EPackage</em>}</li>
 *   <li>{@link de.dc.javafx.xcore.workbench.ide.model.impl.IdeContainerImpl#getModelItemProviderAdapterFactor <em>Model Item Provider Adapter Factor</em>}</li>
 *   <li>{@link de.dc.javafx.xcore.workbench.ide.model.impl.IdeContainerImpl#getRenderer <em>Renderer</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IdeContainerImpl extends MinimalEObjectImpl.Container implements IdeContainer {
	/**
	 * The default value of the '{@link #getPackagePath() <em>Package Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackagePath()
	 * @generated
	 * @ordered
	 */
	protected static final String PACKAGE_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPackagePath() <em>Package Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackagePath()
	 * @generated
	 * @ordered
	 */
	protected String packagePath = PACKAGE_PATH_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getModelName() <em>Model Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelName()
	 * @generated
	 * @ordered
	 */
	protected static final String MODEL_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getModelName() <em>Model Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelName()
	 * @generated
	 * @ordered
	 */
	protected String modelName = MODEL_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getExt() <em>Ext</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExt()
	 * @generated
	 * @ordered
	 */
	protected static final String EXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExt() <em>Ext</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExt()
	 * @generated
	 * @ordered
	 */
	protected String ext = EXT_EDEFAULT;

	/**
	 * The default value of the '{@link #getPreviewName() <em>Preview Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreviewName()
	 * @generated
	 * @ordered
	 */
	protected static final String PREVIEW_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPreviewName() <em>Preview Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreviewName()
	 * @generated
	 * @ordered
	 */
	protected String previewName = PREVIEW_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getModelEFactory() <em>Model EFactory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelEFactory()
	 * @generated
	 * @ordered
	 */
	protected static final EFactory MODEL_EFACTORY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getModelEFactory() <em>Model EFactory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelEFactory()
	 * @generated
	 * @ordered
	 */
	protected EFactory modelEFactory = MODEL_EFACTORY_EDEFAULT;

	/**
	 * The default value of the '{@link #getModelEPackage() <em>Model EPackage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelEPackage()
	 * @generated
	 * @ordered
	 */
	protected static final EPackage MODEL_EPACKAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getModelEPackage() <em>Model EPackage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelEPackage()
	 * @generated
	 * @ordered
	 */
	protected EPackage modelEPackage = MODEL_EPACKAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getModelItemProviderAdapterFactor() <em>Model Item Provider Adapter Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelItemProviderAdapterFactor()
	 * @generated
	 * @ordered
	 */
	protected static final AdapterFactory MODEL_ITEM_PROVIDER_ADAPTER_FACTOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getModelItemProviderAdapterFactor() <em>Model Item Provider Adapter Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelItemProviderAdapterFactor()
	 * @generated
	 * @ordered
	 */
	protected AdapterFactory modelItemProviderAdapterFactor = MODEL_ITEM_PROVIDER_ADAPTER_FACTOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getRenderer() <em>Renderer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRenderer()
	 * @generated
	 * @ordered
	 */
	protected static final Switch RENDERER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRenderer() <em>Renderer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRenderer()
	 * @generated
	 * @ordered
	 */
	protected Switch renderer = RENDERER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IdeContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IdePackage.Literals.IDE_CONTAINER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPackagePath() {
		return packagePath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPackagePath(String newPackagePath) {
		String oldPackagePath = packagePath;
		packagePath = newPackagePath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IdePackage.IDE_CONTAINER__PACKAGE_PATH,
					oldPackagePath, packagePath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IdePackage.IDE_CONTAINER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getModelName() {
		return modelName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setModelName(String newModelName) {
		String oldModelName = modelName;
		modelName = newModelName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IdePackage.IDE_CONTAINER__MODEL_NAME, oldModelName,
					modelName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getExt() {
		return ext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExt(String newExt) {
		String oldExt = ext;
		ext = newExt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IdePackage.IDE_CONTAINER__EXT, oldExt, ext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPreviewName() {
		return previewName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPreviewName(String newPreviewName) {
		String oldPreviewName = previewName;
		previewName = newPreviewName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IdePackage.IDE_CONTAINER__PREVIEW_NAME,
					oldPreviewName, previewName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EFactory getModelEFactory() {
		return modelEFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setModelEFactory(EFactory newModelEFactory) {
		EFactory oldModelEFactory = modelEFactory;
		modelEFactory = newModelEFactory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IdePackage.IDE_CONTAINER__MODEL_EFACTORY,
					oldModelEFactory, modelEFactory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EPackage getModelEPackage() {
		return modelEPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setModelEPackage(EPackage newModelEPackage) {
		EPackage oldModelEPackage = modelEPackage;
		modelEPackage = newModelEPackage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IdePackage.IDE_CONTAINER__MODEL_EPACKAGE,
					oldModelEPackage, modelEPackage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AdapterFactory getModelItemProviderAdapterFactor() {
		return modelItemProviderAdapterFactor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setModelItemProviderAdapterFactor(AdapterFactory newModelItemProviderAdapterFactor) {
		AdapterFactory oldModelItemProviderAdapterFactor = modelItemProviderAdapterFactor;
		modelItemProviderAdapterFactor = newModelItemProviderAdapterFactor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					IdePackage.IDE_CONTAINER__MODEL_ITEM_PROVIDER_ADAPTER_FACTOR, oldModelItemProviderAdapterFactor,
					modelItemProviderAdapterFactor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Switch getRenderer() {
		return renderer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRenderer(Switch newRenderer) {
		Switch oldRenderer = renderer;
		renderer = newRenderer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IdePackage.IDE_CONTAINER__RENDERER, oldRenderer,
					renderer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case IdePackage.IDE_CONTAINER__PACKAGE_PATH:
			return getPackagePath();
		case IdePackage.IDE_CONTAINER__NAME:
			return getName();
		case IdePackage.IDE_CONTAINER__MODEL_NAME:
			return getModelName();
		case IdePackage.IDE_CONTAINER__EXT:
			return getExt();
		case IdePackage.IDE_CONTAINER__PREVIEW_NAME:
			return getPreviewName();
		case IdePackage.IDE_CONTAINER__MODEL_EFACTORY:
			return getModelEFactory();
		case IdePackage.IDE_CONTAINER__MODEL_EPACKAGE:
			return getModelEPackage();
		case IdePackage.IDE_CONTAINER__MODEL_ITEM_PROVIDER_ADAPTER_FACTOR:
			return getModelItemProviderAdapterFactor();
		case IdePackage.IDE_CONTAINER__RENDERER:
			return getRenderer();
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
		case IdePackage.IDE_CONTAINER__PACKAGE_PATH:
			setPackagePath((String) newValue);
			return;
		case IdePackage.IDE_CONTAINER__NAME:
			setName((String) newValue);
			return;
		case IdePackage.IDE_CONTAINER__MODEL_NAME:
			setModelName((String) newValue);
			return;
		case IdePackage.IDE_CONTAINER__EXT:
			setExt((String) newValue);
			return;
		case IdePackage.IDE_CONTAINER__PREVIEW_NAME:
			setPreviewName((String) newValue);
			return;
		case IdePackage.IDE_CONTAINER__MODEL_EFACTORY:
			setModelEFactory((EFactory) newValue);
			return;
		case IdePackage.IDE_CONTAINER__MODEL_EPACKAGE:
			setModelEPackage((EPackage) newValue);
			return;
		case IdePackage.IDE_CONTAINER__MODEL_ITEM_PROVIDER_ADAPTER_FACTOR:
			setModelItemProviderAdapterFactor((AdapterFactory) newValue);
			return;
		case IdePackage.IDE_CONTAINER__RENDERER:
			setRenderer((Switch) newValue);
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
		case IdePackage.IDE_CONTAINER__PACKAGE_PATH:
			setPackagePath(PACKAGE_PATH_EDEFAULT);
			return;
		case IdePackage.IDE_CONTAINER__NAME:
			setName(NAME_EDEFAULT);
			return;
		case IdePackage.IDE_CONTAINER__MODEL_NAME:
			setModelName(MODEL_NAME_EDEFAULT);
			return;
		case IdePackage.IDE_CONTAINER__EXT:
			setExt(EXT_EDEFAULT);
			return;
		case IdePackage.IDE_CONTAINER__PREVIEW_NAME:
			setPreviewName(PREVIEW_NAME_EDEFAULT);
			return;
		case IdePackage.IDE_CONTAINER__MODEL_EFACTORY:
			setModelEFactory(MODEL_EFACTORY_EDEFAULT);
			return;
		case IdePackage.IDE_CONTAINER__MODEL_EPACKAGE:
			setModelEPackage(MODEL_EPACKAGE_EDEFAULT);
			return;
		case IdePackage.IDE_CONTAINER__MODEL_ITEM_PROVIDER_ADAPTER_FACTOR:
			setModelItemProviderAdapterFactor(MODEL_ITEM_PROVIDER_ADAPTER_FACTOR_EDEFAULT);
			return;
		case IdePackage.IDE_CONTAINER__RENDERER:
			setRenderer(RENDERER_EDEFAULT);
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
		case IdePackage.IDE_CONTAINER__PACKAGE_PATH:
			return PACKAGE_PATH_EDEFAULT == null ? packagePath != null : !PACKAGE_PATH_EDEFAULT.equals(packagePath);
		case IdePackage.IDE_CONTAINER__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case IdePackage.IDE_CONTAINER__MODEL_NAME:
			return MODEL_NAME_EDEFAULT == null ? modelName != null : !MODEL_NAME_EDEFAULT.equals(modelName);
		case IdePackage.IDE_CONTAINER__EXT:
			return EXT_EDEFAULT == null ? ext != null : !EXT_EDEFAULT.equals(ext);
		case IdePackage.IDE_CONTAINER__PREVIEW_NAME:
			return PREVIEW_NAME_EDEFAULT == null ? previewName != null : !PREVIEW_NAME_EDEFAULT.equals(previewName);
		case IdePackage.IDE_CONTAINER__MODEL_EFACTORY:
			return MODEL_EFACTORY_EDEFAULT == null ? modelEFactory != null
					: !MODEL_EFACTORY_EDEFAULT.equals(modelEFactory);
		case IdePackage.IDE_CONTAINER__MODEL_EPACKAGE:
			return MODEL_EPACKAGE_EDEFAULT == null ? modelEPackage != null
					: !MODEL_EPACKAGE_EDEFAULT.equals(modelEPackage);
		case IdePackage.IDE_CONTAINER__MODEL_ITEM_PROVIDER_ADAPTER_FACTOR:
			return MODEL_ITEM_PROVIDER_ADAPTER_FACTOR_EDEFAULT == null ? modelItemProviderAdapterFactor != null
					: !MODEL_ITEM_PROVIDER_ADAPTER_FACTOR_EDEFAULT.equals(modelItemProviderAdapterFactor);
		case IdePackage.IDE_CONTAINER__RENDERER:
			return RENDERER_EDEFAULT == null ? renderer != null : !RENDERER_EDEFAULT.equals(renderer);
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
		result.append(" (packagePath: ");
		result.append(packagePath);
		result.append(", name: ");
		result.append(name);
		result.append(", modelName: ");
		result.append(modelName);
		result.append(", ext: ");
		result.append(ext);
		result.append(", previewName: ");
		result.append(previewName);
		result.append(", modelEFactory: ");
		result.append(modelEFactory);
		result.append(", modelEPackage: ");
		result.append(modelEPackage);
		result.append(", modelItemProviderAdapterFactor: ");
		result.append(modelItemProviderAdapterFactor);
		result.append(", renderer: ");
		result.append(renderer);
		result.append(')');
		return result.toString();
	}

} //IdeContainerImpl
