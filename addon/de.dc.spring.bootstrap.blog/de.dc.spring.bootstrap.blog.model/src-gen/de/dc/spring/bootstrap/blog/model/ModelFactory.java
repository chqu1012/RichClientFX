/**
 */
package de.dc.spring.bootstrap.blog.model;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.dc.spring.bootstrap.blog.model.ModelPackage
 * @generated
 */
public interface ModelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ModelFactory eINSTANCE = de.dc.spring.bootstrap.blog.model.impl.ModelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Blog</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Blog</em>'.
	 * @generated
	 */
	Blog createBlog();

	/**
	 * Returns a new object of class '<em>Tile Small Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tile Small Section</em>'.
	 * @generated
	 */
	TileSmallSection createTileSmallSection();

	/**
	 * Returns a new object of class '<em>Story Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Story Section</em>'.
	 * @generated
	 */
	StorySection createStorySection();

	/**
	 * Returns a new object of class '<em>Overivew Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Overivew Section</em>'.
	 * @generated
	 */
	OverivewSection createOverivewSection();

	/**
	 * Returns a new object of class '<em>Title Big Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Title Big Section</em>'.
	 * @generated
	 */
	TitleBigSection createTitleBigSection();

	/**
	 * Returns a new object of class '<em>About Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>About Section</em>'.
	 * @generated
	 */
	AboutSection createAboutSection();

	/**
	 * Returns a new object of class '<em>Workflow Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Workflow Section</em>'.
	 * @generated
	 */
	WorkflowSection createWorkflowSection();

	/**
	 * Returns a new object of class '<em>Gallery Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gallery Section</em>'.
	 * @generated
	 */
	GallerySection createGallerySection();

	/**
	 * Returns a new object of class '<em>Gallery Material Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gallery Material Section</em>'.
	 * @generated
	 */
	GalleryMaterialSection createGalleryMaterialSection();

	/**
	 * Returns a new object of class '<em>Tile</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tile</em>'.
	 * @generated
	 */
	Tile createTile();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ModelPackage getModelPackage();

} //ModelFactory
