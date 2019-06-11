/**
 */
package de.dc.spring.bootstrap.blog.model.impl;

import de.dc.spring.bootstrap.blog.model.*;

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
public class ModelFactoryImpl extends EFactoryImpl implements ModelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ModelFactory init() {
		try {
			ModelFactory theModelFactory = (ModelFactory) EPackage.Registry.INSTANCE.getEFactory(ModelPackage.eNS_URI);
			if (theModelFactory != null) {
				return theModelFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ModelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelFactoryImpl() {
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
		case ModelPackage.BLOG:
			return createBlog();
		case ModelPackage.TILE_SMALL_SECTION:
			return createTileSmallSection();
		case ModelPackage.STORY_SECTION:
			return createStorySection();
		case ModelPackage.OVERIVEW_SECTION:
			return createOverivewSection();
		case ModelPackage.TITLE_BIG_SECTION:
			return createTitleBigSection();
		case ModelPackage.ABOUT_SECTION:
			return createAboutSection();
		case ModelPackage.WORKFLOW_SECTION:
			return createWorkflowSection();
		case ModelPackage.GALLERY_SECTION:
			return createGallerySection();
		case ModelPackage.GALLERY_MATERIAL_SECTION:
			return createGalleryMaterialSection();
		case ModelPackage.TILE:
			return createTile();
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
	public Blog createBlog() {
		BlogImpl blog = new BlogImpl();
		return blog;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TileSmallSection createTileSmallSection() {
		TileSmallSectionImpl tileSmallSection = new TileSmallSectionImpl();
		return tileSmallSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StorySection createStorySection() {
		StorySectionImpl storySection = new StorySectionImpl();
		return storySection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OverivewSection createOverivewSection() {
		OverivewSectionImpl overivewSection = new OverivewSectionImpl();
		return overivewSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TitleBigSection createTitleBigSection() {
		TitleBigSectionImpl titleBigSection = new TitleBigSectionImpl();
		return titleBigSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AboutSection createAboutSection() {
		AboutSectionImpl aboutSection = new AboutSectionImpl();
		return aboutSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WorkflowSection createWorkflowSection() {
		WorkflowSectionImpl workflowSection = new WorkflowSectionImpl();
		return workflowSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GallerySection createGallerySection() {
		GallerySectionImpl gallerySection = new GallerySectionImpl();
		return gallerySection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GalleryMaterialSection createGalleryMaterialSection() {
		GalleryMaterialSectionImpl galleryMaterialSection = new GalleryMaterialSectionImpl();
		return galleryMaterialSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Tile createTile() {
		TileImpl tile = new TileImpl();
		return tile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ModelPackage getModelPackage() {
		return (ModelPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ModelPackage getPackage() {
		return ModelPackage.eINSTANCE;
	}

} //ModelFactoryImpl
