package de.dc.spring.bootstrap.blog.model.ui.factory;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import de.dc.spring.bootstrap.blog.model.ModelPackage;
import de.dc.spring.bootstrap.blog.model.impl.ModelFactoryImpl;

public class ExtendedBlogFactoryImpl extends ModelFactoryImpl implements ExtendedBlogFactory {

	public static ExtendedBlogFactory init() {
		try {
			ExtendedBlogFactory theResourceFactory = (ExtendedBlogFactory) EPackage.Registry.INSTANCE
					.getEFactory(ModelPackage.eNS_URI);
			if (theResourceFactory != null) {
				return theResourceFactory;
			}
		} catch (Exception exception) {
		}
		return new ExtendedBlogFactoryImpl();
	}

	@Override
	public EObject create(int classifierId) {
		switch (classifierId) {
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
			throw new IllegalArgumentException("The class '" + classifierId + "' is not a valid classifier, please enhanced the class "+ExtendedBlogFactoryImpl.class.getSimpleName()+"#create(classifierId) in switch case!");
		}
	}
	
}
