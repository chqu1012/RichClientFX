/**
 */
package de.dc.javafx.xcore.workbench.ide.model;

import org.eclipse.emf.common.notify.AdapterFactory;

import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dc.javafx.xcore.workbench.ide.model.IdeContainer#getPackagePath <em>Package Path</em>}</li>
 *   <li>{@link de.dc.javafx.xcore.workbench.ide.model.IdeContainer#getName <em>Name</em>}</li>
 *   <li>{@link de.dc.javafx.xcore.workbench.ide.model.IdeContainer#getModelName <em>Model Name</em>}</li>
 *   <li>{@link de.dc.javafx.xcore.workbench.ide.model.IdeContainer#getExt <em>Ext</em>}</li>
 *   <li>{@link de.dc.javafx.xcore.workbench.ide.model.IdeContainer#getPreviewName <em>Preview Name</em>}</li>
 *   <li>{@link de.dc.javafx.xcore.workbench.ide.model.IdeContainer#getModelEFactory <em>Model EFactory</em>}</li>
 *   <li>{@link de.dc.javafx.xcore.workbench.ide.model.IdeContainer#getModelEPackage <em>Model EPackage</em>}</li>
 *   <li>{@link de.dc.javafx.xcore.workbench.ide.model.IdeContainer#getModelItemProviderAdapterFactor <em>Model Item Provider Adapter Factor</em>}</li>
 *   <li>{@link de.dc.javafx.xcore.workbench.ide.model.IdeContainer#getRenderer <em>Renderer</em>}</li>
 * </ul>
 *
 * @see de.dc.javafx.xcore.workbench.ide.model.IdePackage#getIdeContainer()
 * @model
 * @generated
 */
public interface IdeContainer extends EObject {
	/**
	 * Returns the value of the '<em><b>Package Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Package Path</em>' attribute.
	 * @see #setPackagePath(String)
	 * @see de.dc.javafx.xcore.workbench.ide.model.IdePackage#getIdeContainer_PackagePath()
	 * @model unique="false"
	 * @generated
	 */
	String getPackagePath();

	/**
	 * Sets the value of the '{@link de.dc.javafx.xcore.workbench.ide.model.IdeContainer#getPackagePath <em>Package Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Package Path</em>' attribute.
	 * @see #getPackagePath()
	 * @generated
	 */
	void setPackagePath(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see de.dc.javafx.xcore.workbench.ide.model.IdePackage#getIdeContainer_Name()
	 * @model unique="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.dc.javafx.xcore.workbench.ide.model.IdeContainer#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Model Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model Name</em>' attribute.
	 * @see #setModelName(String)
	 * @see de.dc.javafx.xcore.workbench.ide.model.IdePackage#getIdeContainer_ModelName()
	 * @model unique="false"
	 * @generated
	 */
	String getModelName();

	/**
	 * Sets the value of the '{@link de.dc.javafx.xcore.workbench.ide.model.IdeContainer#getModelName <em>Model Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model Name</em>' attribute.
	 * @see #getModelName()
	 * @generated
	 */
	void setModelName(String value);

	/**
	 * Returns the value of the '<em><b>Ext</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ext</em>' attribute.
	 * @see #setExt(String)
	 * @see de.dc.javafx.xcore.workbench.ide.model.IdePackage#getIdeContainer_Ext()
	 * @model unique="false"
	 * @generated
	 */
	String getExt();

	/**
	 * Sets the value of the '{@link de.dc.javafx.xcore.workbench.ide.model.IdeContainer#getExt <em>Ext</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ext</em>' attribute.
	 * @see #getExt()
	 * @generated
	 */
	void setExt(String value);

	/**
	 * Returns the value of the '<em><b>Preview Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Preview Name</em>' attribute.
	 * @see #setPreviewName(String)
	 * @see de.dc.javafx.xcore.workbench.ide.model.IdePackage#getIdeContainer_PreviewName()
	 * @model unique="false"
	 * @generated
	 */
	String getPreviewName();

	/**
	 * Sets the value of the '{@link de.dc.javafx.xcore.workbench.ide.model.IdeContainer#getPreviewName <em>Preview Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Preview Name</em>' attribute.
	 * @see #getPreviewName()
	 * @generated
	 */
	void setPreviewName(String value);

	/**
	 * Returns the value of the '<em><b>Model EFactory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model EFactory</em>' attribute.
	 * @see #setModelEFactory(EFactory)
	 * @see de.dc.javafx.xcore.workbench.ide.model.IdePackage#getIdeContainer_ModelEFactory()
	 * @model unique="false" dataType="de.dc.javafx.xcore.workbench.ide.model.ModelEFactory"
	 * @generated
	 */
	EFactory getModelEFactory();

	/**
	 * Sets the value of the '{@link de.dc.javafx.xcore.workbench.ide.model.IdeContainer#getModelEFactory <em>Model EFactory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model EFactory</em>' attribute.
	 * @see #getModelEFactory()
	 * @generated
	 */
	void setModelEFactory(EFactory value);

	/**
	 * Returns the value of the '<em><b>Model EPackage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model EPackage</em>' attribute.
	 * @see #setModelEPackage(EPackage)
	 * @see de.dc.javafx.xcore.workbench.ide.model.IdePackage#getIdeContainer_ModelEPackage()
	 * @model unique="false" dataType="de.dc.javafx.xcore.workbench.ide.model.ModelEPackage"
	 * @generated
	 */
	EPackage getModelEPackage();

	/**
	 * Sets the value of the '{@link de.dc.javafx.xcore.workbench.ide.model.IdeContainer#getModelEPackage <em>Model EPackage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model EPackage</em>' attribute.
	 * @see #getModelEPackage()
	 * @generated
	 */
	void setModelEPackage(EPackage value);

	/**
	 * Returns the value of the '<em><b>Model Item Provider Adapter Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model Item Provider Adapter Factor</em>' attribute.
	 * @see #setModelItemProviderAdapterFactor(AdapterFactory)
	 * @see de.dc.javafx.xcore.workbench.ide.model.IdePackage#getIdeContainer_ModelItemProviderAdapterFactor()
	 * @model unique="false" dataType="de.dc.javafx.xcore.workbench.ide.model.AdapterEFactory"
	 * @generated
	 */
	AdapterFactory getModelItemProviderAdapterFactor();

	/**
	 * Sets the value of the '{@link de.dc.javafx.xcore.workbench.ide.model.IdeContainer#getModelItemProviderAdapterFactor <em>Model Item Provider Adapter Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model Item Provider Adapter Factor</em>' attribute.
	 * @see #getModelItemProviderAdapterFactor()
	 * @generated
	 */
	void setModelItemProviderAdapterFactor(AdapterFactory value);

	/**
	 * Returns the value of the '<em><b>Renderer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Renderer</em>' attribute.
	 * @see #setRenderer(Switch)
	 * @see de.dc.javafx.xcore.workbench.ide.model.IdePackage#getIdeContainer_Renderer()
	 * @model unique="false" dataType="de.dc.javafx.xcore.workbench.ide.model.Renderer"
	 * @generated
	 */
	Switch getRenderer();

	/**
	 * Sets the value of the '{@link de.dc.javafx.xcore.workbench.ide.model.IdeContainer#getRenderer <em>Renderer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Renderer</em>' attribute.
	 * @see #getRenderer()
	 * @generated
	 */
	void setRenderer(Switch value);

} // IdeContainer
