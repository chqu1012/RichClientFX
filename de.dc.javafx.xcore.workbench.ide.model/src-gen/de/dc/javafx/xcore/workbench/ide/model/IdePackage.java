/**
 */
package de.dc.javafx.xcore.workbench.ide.model;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.dc.javafx.xcore.workbench.ide.model.IdeFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel multipleEditorPages='false' creationIcons='false' editDirectory='/de.dc.javafx.xcore.workbench.ide.model.edit/src-gen' editorDirectory='/de.dc.javafx.xcore.workbench.ide.model.editor/src-gen' richClientPlatform='true' codeFormatting='true' importerID='org.eclipse.emf.importer.ecore' runtimePlatform='RCP' fileExtensions='ide' tableProviders='true' dataTypeConverters='true' prefix='Ide' modelName='Ide' basePackage='de.dc.javafx.xcore.workbench.ide'"
 * @generated
 */
public interface IdePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "model";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.frateranatis.org/workbench/ide";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "model";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	IdePackage eINSTANCE = de.dc.javafx.xcore.workbench.ide.model.impl.IdePackageImpl.init();

	/**
	 * The meta object id for the '{@link de.dc.javafx.xcore.workbench.ide.model.impl.IdeContainerImpl <em>Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.javafx.xcore.workbench.ide.model.impl.IdeContainerImpl
	 * @see de.dc.javafx.xcore.workbench.ide.model.impl.IdePackageImpl#getIdeContainer()
	 * @generated
	 */
	int IDE_CONTAINER = 0;

	/**
	 * The feature id for the '<em><b>Package Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDE_CONTAINER__PACKAGE_PATH = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDE_CONTAINER__NAME = 1;

	/**
	 * The feature id for the '<em><b>Model Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDE_CONTAINER__MODEL_NAME = 2;

	/**
	 * The feature id for the '<em><b>Ext</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDE_CONTAINER__EXT = 3;

	/**
	 * The feature id for the '<em><b>Preview Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDE_CONTAINER__PREVIEW_NAME = 4;

	/**
	 * The feature id for the '<em><b>Model EFactory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDE_CONTAINER__MODEL_EFACTORY = 5;

	/**
	 * The feature id for the '<em><b>Model EPackage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDE_CONTAINER__MODEL_EPACKAGE = 6;

	/**
	 * The feature id for the '<em><b>Model Item Provider Adapter Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDE_CONTAINER__MODEL_ITEM_PROVIDER_ADAPTER_FACTOR = 7;

	/**
	 * The feature id for the '<em><b>Renderer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDE_CONTAINER__RENDERER = 8;

	/**
	 * The number of structural features of the '<em>Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDE_CONTAINER_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDE_CONTAINER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '<em>Model EFactory</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EFactory
	 * @see de.dc.javafx.xcore.workbench.ide.model.impl.IdePackageImpl#getModelEFactory()
	 * @generated
	 */
	int MODEL_EFACTORY = 1;

	/**
	 * The meta object id for the '<em>Model EPackage</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage
	 * @see de.dc.javafx.xcore.workbench.ide.model.impl.IdePackageImpl#getModelEPackage()
	 * @generated
	 */
	int MODEL_EPACKAGE = 2;

	/**
	 * The meta object id for the '<em>Adapter EFactory</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.notify.AdapterFactory
	 * @see de.dc.javafx.xcore.workbench.ide.model.impl.IdePackageImpl#getAdapterEFactory()
	 * @generated
	 */
	int ADAPTER_EFACTORY = 3;

	/**
	 * The meta object id for the '<em>Renderer</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.util.Switch
	 * @see de.dc.javafx.xcore.workbench.ide.model.impl.IdePackageImpl#getRenderer()
	 * @generated
	 */
	int RENDERER = 4;

	/**
	 * Returns the meta object for class '{@link de.dc.javafx.xcore.workbench.ide.model.IdeContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Container</em>'.
	 * @see de.dc.javafx.xcore.workbench.ide.model.IdeContainer
	 * @generated
	 */
	EClass getIdeContainer();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.javafx.xcore.workbench.ide.model.IdeContainer#getPackagePath <em>Package Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Package Path</em>'.
	 * @see de.dc.javafx.xcore.workbench.ide.model.IdeContainer#getPackagePath()
	 * @see #getIdeContainer()
	 * @generated
	 */
	EAttribute getIdeContainer_PackagePath();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.javafx.xcore.workbench.ide.model.IdeContainer#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.dc.javafx.xcore.workbench.ide.model.IdeContainer#getName()
	 * @see #getIdeContainer()
	 * @generated
	 */
	EAttribute getIdeContainer_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.javafx.xcore.workbench.ide.model.IdeContainer#getModelName <em>Model Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Model Name</em>'.
	 * @see de.dc.javafx.xcore.workbench.ide.model.IdeContainer#getModelName()
	 * @see #getIdeContainer()
	 * @generated
	 */
	EAttribute getIdeContainer_ModelName();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.javafx.xcore.workbench.ide.model.IdeContainer#getExt <em>Ext</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ext</em>'.
	 * @see de.dc.javafx.xcore.workbench.ide.model.IdeContainer#getExt()
	 * @see #getIdeContainer()
	 * @generated
	 */
	EAttribute getIdeContainer_Ext();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.javafx.xcore.workbench.ide.model.IdeContainer#getPreviewName <em>Preview Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Preview Name</em>'.
	 * @see de.dc.javafx.xcore.workbench.ide.model.IdeContainer#getPreviewName()
	 * @see #getIdeContainer()
	 * @generated
	 */
	EAttribute getIdeContainer_PreviewName();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.javafx.xcore.workbench.ide.model.IdeContainer#getModelEFactory <em>Model EFactory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Model EFactory</em>'.
	 * @see de.dc.javafx.xcore.workbench.ide.model.IdeContainer#getModelEFactory()
	 * @see #getIdeContainer()
	 * @generated
	 */
	EAttribute getIdeContainer_ModelEFactory();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.javafx.xcore.workbench.ide.model.IdeContainer#getModelEPackage <em>Model EPackage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Model EPackage</em>'.
	 * @see de.dc.javafx.xcore.workbench.ide.model.IdeContainer#getModelEPackage()
	 * @see #getIdeContainer()
	 * @generated
	 */
	EAttribute getIdeContainer_ModelEPackage();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.javafx.xcore.workbench.ide.model.IdeContainer#getModelItemProviderAdapterFactor <em>Model Item Provider Adapter Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Model Item Provider Adapter Factor</em>'.
	 * @see de.dc.javafx.xcore.workbench.ide.model.IdeContainer#getModelItemProviderAdapterFactor()
	 * @see #getIdeContainer()
	 * @generated
	 */
	EAttribute getIdeContainer_ModelItemProviderAdapterFactor();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.javafx.xcore.workbench.ide.model.IdeContainer#getRenderer <em>Renderer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Renderer</em>'.
	 * @see de.dc.javafx.xcore.workbench.ide.model.IdeContainer#getRenderer()
	 * @see #getIdeContainer()
	 * @generated
	 */
	EAttribute getIdeContainer_Renderer();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.emf.ecore.EFactory <em>Model EFactory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Model EFactory</em>'.
	 * @see org.eclipse.emf.ecore.EFactory
	 * @model instanceClass="org.eclipse.emf.ecore.EFactory"
	 * @generated
	 */
	EDataType getModelEFactory();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.emf.ecore.EPackage <em>Model EPackage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Model EPackage</em>'.
	 * @see org.eclipse.emf.ecore.EPackage
	 * @model instanceClass="org.eclipse.emf.ecore.EPackage"
	 * @generated
	 */
	EDataType getModelEPackage();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.emf.common.notify.AdapterFactory <em>Adapter EFactory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Adapter EFactory</em>'.
	 * @see org.eclipse.emf.common.notify.AdapterFactory
	 * @model instanceClass="org.eclipse.emf.common.notify.AdapterFactory"
	 * @generated
	 */
	EDataType getAdapterEFactory();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.emf.ecore.util.Switch <em>Renderer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Renderer</em>'.
	 * @see org.eclipse.emf.ecore.util.Switch
	 * @model instanceClass="org.eclipse.emf.ecore.util.Switch"
	 * @generated
	 */
	EDataType getRenderer();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	IdeFactory getIdeFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link de.dc.javafx.xcore.workbench.ide.model.impl.IdeContainerImpl <em>Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.javafx.xcore.workbench.ide.model.impl.IdeContainerImpl
		 * @see de.dc.javafx.xcore.workbench.ide.model.impl.IdePackageImpl#getIdeContainer()
		 * @generated
		 */
		EClass IDE_CONTAINER = eINSTANCE.getIdeContainer();

		/**
		 * The meta object literal for the '<em><b>Package Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDE_CONTAINER__PACKAGE_PATH = eINSTANCE.getIdeContainer_PackagePath();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDE_CONTAINER__NAME = eINSTANCE.getIdeContainer_Name();

		/**
		 * The meta object literal for the '<em><b>Model Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDE_CONTAINER__MODEL_NAME = eINSTANCE.getIdeContainer_ModelName();

		/**
		 * The meta object literal for the '<em><b>Ext</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDE_CONTAINER__EXT = eINSTANCE.getIdeContainer_Ext();

		/**
		 * The meta object literal for the '<em><b>Preview Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDE_CONTAINER__PREVIEW_NAME = eINSTANCE.getIdeContainer_PreviewName();

		/**
		 * The meta object literal for the '<em><b>Model EFactory</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDE_CONTAINER__MODEL_EFACTORY = eINSTANCE.getIdeContainer_ModelEFactory();

		/**
		 * The meta object literal for the '<em><b>Model EPackage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDE_CONTAINER__MODEL_EPACKAGE = eINSTANCE.getIdeContainer_ModelEPackage();

		/**
		 * The meta object literal for the '<em><b>Model Item Provider Adapter Factor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDE_CONTAINER__MODEL_ITEM_PROVIDER_ADAPTER_FACTOR = eINSTANCE
				.getIdeContainer_ModelItemProviderAdapterFactor();

		/**
		 * The meta object literal for the '<em><b>Renderer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDE_CONTAINER__RENDERER = eINSTANCE.getIdeContainer_Renderer();

		/**
		 * The meta object literal for the '<em>Model EFactory</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.ecore.EFactory
		 * @see de.dc.javafx.xcore.workbench.ide.model.impl.IdePackageImpl#getModelEFactory()
		 * @generated
		 */
		EDataType MODEL_EFACTORY = eINSTANCE.getModelEFactory();

		/**
		 * The meta object literal for the '<em>Model EPackage</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.ecore.EPackage
		 * @see de.dc.javafx.xcore.workbench.ide.model.impl.IdePackageImpl#getModelEPackage()
		 * @generated
		 */
		EDataType MODEL_EPACKAGE = eINSTANCE.getModelEPackage();

		/**
		 * The meta object literal for the '<em>Adapter EFactory</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.common.notify.AdapterFactory
		 * @see de.dc.javafx.xcore.workbench.ide.model.impl.IdePackageImpl#getAdapterEFactory()
		 * @generated
		 */
		EDataType ADAPTER_EFACTORY = eINSTANCE.getAdapterEFactory();

		/**
		 * The meta object literal for the '<em>Renderer</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.ecore.util.Switch
		 * @see de.dc.javafx.xcore.workbench.ide.model.impl.IdePackageImpl#getRenderer()
		 * @generated
		 */
		EDataType RENDERER = eINSTANCE.getRenderer();

	}

} //IdePackage
