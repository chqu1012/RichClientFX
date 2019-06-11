/**
 */
package de.dc.spring.bootstrap.blog.model.util;

import de.dc.spring.bootstrap.blog.model.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.dc.spring.bootstrap.blog.model.ModelPackage
 * @generated
 */
public class ModelAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ModelPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ModelPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelSwitch<Adapter> modelSwitch = new ModelSwitch<Adapter>() {
		@Override
		public Adapter caseBlog(Blog object) {
			return createBlogAdapter();
		}

		@Override
		public Adapter caseSection(Section object) {
			return createSectionAdapter();
		}

		@Override
		public Adapter caseTileSmallSection(TileSmallSection object) {
			return createTileSmallSectionAdapter();
		}

		@Override
		public Adapter caseStorySection(StorySection object) {
			return createStorySectionAdapter();
		}

		@Override
		public Adapter caseOverivewSection(OverivewSection object) {
			return createOverivewSectionAdapter();
		}

		@Override
		public Adapter caseTitleBigSection(TitleBigSection object) {
			return createTitleBigSectionAdapter();
		}

		@Override
		public Adapter caseAboutSection(AboutSection object) {
			return createAboutSectionAdapter();
		}

		@Override
		public Adapter caseWorkflowSection(WorkflowSection object) {
			return createWorkflowSectionAdapter();
		}

		@Override
		public Adapter caseGallerySection(GallerySection object) {
			return createGallerySectionAdapter();
		}

		@Override
		public Adapter caseGalleryMaterialSection(GalleryMaterialSection object) {
			return createGalleryMaterialSectionAdapter();
		}

		@Override
		public Adapter caseTile(Tile object) {
			return createTileAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dc.spring.bootstrap.blog.model.Blog <em>Blog</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dc.spring.bootstrap.blog.model.Blog
	 * @generated
	 */
	public Adapter createBlogAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dc.spring.bootstrap.blog.model.Section <em>Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dc.spring.bootstrap.blog.model.Section
	 * @generated
	 */
	public Adapter createSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dc.spring.bootstrap.blog.model.TileSmallSection <em>Tile Small Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dc.spring.bootstrap.blog.model.TileSmallSection
	 * @generated
	 */
	public Adapter createTileSmallSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dc.spring.bootstrap.blog.model.StorySection <em>Story Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dc.spring.bootstrap.blog.model.StorySection
	 * @generated
	 */
	public Adapter createStorySectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dc.spring.bootstrap.blog.model.OverivewSection <em>Overivew Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dc.spring.bootstrap.blog.model.OverivewSection
	 * @generated
	 */
	public Adapter createOverivewSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dc.spring.bootstrap.blog.model.TitleBigSection <em>Title Big Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dc.spring.bootstrap.blog.model.TitleBigSection
	 * @generated
	 */
	public Adapter createTitleBigSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dc.spring.bootstrap.blog.model.AboutSection <em>About Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dc.spring.bootstrap.blog.model.AboutSection
	 * @generated
	 */
	public Adapter createAboutSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dc.spring.bootstrap.blog.model.WorkflowSection <em>Workflow Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dc.spring.bootstrap.blog.model.WorkflowSection
	 * @generated
	 */
	public Adapter createWorkflowSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dc.spring.bootstrap.blog.model.GallerySection <em>Gallery Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dc.spring.bootstrap.blog.model.GallerySection
	 * @generated
	 */
	public Adapter createGallerySectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dc.spring.bootstrap.blog.model.GalleryMaterialSection <em>Gallery Material Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dc.spring.bootstrap.blog.model.GalleryMaterialSection
	 * @generated
	 */
	public Adapter createGalleryMaterialSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dc.spring.bootstrap.blog.model.Tile <em>Tile</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dc.spring.bootstrap.blog.model.Tile
	 * @generated
	 */
	public Adapter createTileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ModelAdapterFactory
