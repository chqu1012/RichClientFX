/**
 */
package de.dc.spring.bootstrap.blog.model;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see de.dc.spring.bootstrap.blog.model.ModelFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel multipleEditorPages='false' creationIcons='false' editDirectory='/de.dc.spring.bootstrap.blog.model.edit/src-gen' editorDirectory='/de.dc.spring.bootstrap.blog.model.editor/src-gen' richClientPlatform='true' codeFormatting='true' importerID='org.eclipse.emf.importer.ecore' runtimePlatform='RCP' fileExtensions='blog' basePackage='de.dc.spring.bootstrap.blog'"
 * @generated
 */
public interface ModelPackage extends EPackage {
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
	String eNS_URI = "http://www.frateranatis.org/bootstrap/blog";

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
	ModelPackage eINSTANCE = de.dc.spring.bootstrap.blog.model.impl.ModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.dc.spring.bootstrap.blog.model.impl.BlogImpl <em>Blog</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.spring.bootstrap.blog.model.impl.BlogImpl
	 * @see de.dc.spring.bootstrap.blog.model.impl.ModelPackageImpl#getBlog()
	 * @generated
	 */
	int BLOG = 0;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOG__TITLE = 0;

	/**
	 * The feature id for the '<em><b>Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOG__SECTIONS = 1;

	/**
	 * The number of structural features of the '<em>Blog</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOG_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Blog</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOG_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dc.spring.bootstrap.blog.model.impl.SectionImpl <em>Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.spring.bootstrap.blog.model.impl.SectionImpl
	 * @see de.dc.spring.bootstrap.blog.model.impl.ModelPackageImpl#getSection()
	 * @generated
	 */
	int SECTION = 1;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__UUID = 0;

	/**
	 * The number of structural features of the '<em>Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dc.spring.bootstrap.blog.model.impl.TileSmallSectionImpl <em>Tile Small Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.spring.bootstrap.blog.model.impl.TileSmallSectionImpl
	 * @see de.dc.spring.bootstrap.blog.model.impl.ModelPackageImpl#getTileSmallSection()
	 * @generated
	 */
	int TILE_SMALL_SECTION = 2;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TILE_SMALL_SECTION__UUID = SECTION__UUID;

	/**
	 * The feature id for the '<em><b>Tiles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TILE_SMALL_SECTION__TILES = SECTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Tile Small Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TILE_SMALL_SECTION_FEATURE_COUNT = SECTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Tile Small Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TILE_SMALL_SECTION_OPERATION_COUNT = SECTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dc.spring.bootstrap.blog.model.impl.StorySectionImpl <em>Story Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.spring.bootstrap.blog.model.impl.StorySectionImpl
	 * @see de.dc.spring.bootstrap.blog.model.impl.ModelPackageImpl#getStorySection()
	 * @generated
	 */
	int STORY_SECTION = 3;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_SECTION__UUID = SECTION__UUID;

	/**
	 * The number of structural features of the '<em>Story Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_SECTION_FEATURE_COUNT = SECTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Story Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_SECTION_OPERATION_COUNT = SECTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dc.spring.bootstrap.blog.model.impl.OverivewSectionImpl <em>Overivew Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.spring.bootstrap.blog.model.impl.OverivewSectionImpl
	 * @see de.dc.spring.bootstrap.blog.model.impl.ModelPackageImpl#getOverivewSection()
	 * @generated
	 */
	int OVERIVEW_SECTION = 4;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERIVEW_SECTION__UUID = SECTION__UUID;

	/**
	 * The number of structural features of the '<em>Overivew Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERIVEW_SECTION_FEATURE_COUNT = SECTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Overivew Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERIVEW_SECTION_OPERATION_COUNT = SECTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dc.spring.bootstrap.blog.model.impl.TitleBigSectionImpl <em>Title Big Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.spring.bootstrap.blog.model.impl.TitleBigSectionImpl
	 * @see de.dc.spring.bootstrap.blog.model.impl.ModelPackageImpl#getTitleBigSection()
	 * @generated
	 */
	int TITLE_BIG_SECTION = 5;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLE_BIG_SECTION__UUID = SECTION__UUID;

	/**
	 * The number of structural features of the '<em>Title Big Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLE_BIG_SECTION_FEATURE_COUNT = SECTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Title Big Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLE_BIG_SECTION_OPERATION_COUNT = SECTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dc.spring.bootstrap.blog.model.impl.AboutSectionImpl <em>About Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.spring.bootstrap.blog.model.impl.AboutSectionImpl
	 * @see de.dc.spring.bootstrap.blog.model.impl.ModelPackageImpl#getAboutSection()
	 * @generated
	 */
	int ABOUT_SECTION = 6;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABOUT_SECTION__UUID = SECTION__UUID;

	/**
	 * The number of structural features of the '<em>About Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABOUT_SECTION_FEATURE_COUNT = SECTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>About Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABOUT_SECTION_OPERATION_COUNT = SECTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dc.spring.bootstrap.blog.model.impl.WorkflowSectionImpl <em>Workflow Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.spring.bootstrap.blog.model.impl.WorkflowSectionImpl
	 * @see de.dc.spring.bootstrap.blog.model.impl.ModelPackageImpl#getWorkflowSection()
	 * @generated
	 */
	int WORKFLOW_SECTION = 7;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_SECTION__UUID = SECTION__UUID;

	/**
	 * The number of structural features of the '<em>Workflow Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_SECTION_FEATURE_COUNT = SECTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Workflow Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_SECTION_OPERATION_COUNT = SECTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dc.spring.bootstrap.blog.model.impl.GallerySectionImpl <em>Gallery Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.spring.bootstrap.blog.model.impl.GallerySectionImpl
	 * @see de.dc.spring.bootstrap.blog.model.impl.ModelPackageImpl#getGallerySection()
	 * @generated
	 */
	int GALLERY_SECTION = 8;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY_SECTION__UUID = SECTION__UUID;

	/**
	 * The number of structural features of the '<em>Gallery Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY_SECTION_FEATURE_COUNT = SECTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Gallery Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY_SECTION_OPERATION_COUNT = SECTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dc.spring.bootstrap.blog.model.impl.GalleryMaterialSectionImpl <em>Gallery Material Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.spring.bootstrap.blog.model.impl.GalleryMaterialSectionImpl
	 * @see de.dc.spring.bootstrap.blog.model.impl.ModelPackageImpl#getGalleryMaterialSection()
	 * @generated
	 */
	int GALLERY_MATERIAL_SECTION = 9;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY_MATERIAL_SECTION__UUID = SECTION__UUID;

	/**
	 * The number of structural features of the '<em>Gallery Material Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY_MATERIAL_SECTION_FEATURE_COUNT = SECTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Gallery Material Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY_MATERIAL_SECTION_OPERATION_COUNT = SECTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dc.spring.bootstrap.blog.model.impl.TileImpl <em>Tile</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.spring.bootstrap.blog.model.impl.TileImpl
	 * @see de.dc.spring.bootstrap.blog.model.impl.ModelPackageImpl#getTile()
	 * @generated
	 */
	int TILE = 10;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TILE__TITLE = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TILE__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TILE__LINK = 2;

	/**
	 * The feature id for the '<em><b>Day</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TILE__DAY = 3;

	/**
	 * The feature id for the '<em><b>Month</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TILE__MONTH = 4;

	/**
	 * The feature id for the '<em><b>Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TILE__YEAR = 5;

	/**
	 * The feature id for the '<em><b>Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TILE__IMAGE = 6;

	/**
	 * The number of structural features of the '<em>Tile</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TILE_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Tile</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TILE_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link de.dc.spring.bootstrap.blog.model.Blog <em>Blog</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Blog</em>'.
	 * @see de.dc.spring.bootstrap.blog.model.Blog
	 * @generated
	 */
	EClass getBlog();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.spring.bootstrap.blog.model.Blog#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see de.dc.spring.bootstrap.blog.model.Blog#getTitle()
	 * @see #getBlog()
	 * @generated
	 */
	EAttribute getBlog_Title();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dc.spring.bootstrap.blog.model.Blog#getSections <em>Sections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sections</em>'.
	 * @see de.dc.spring.bootstrap.blog.model.Blog#getSections()
	 * @see #getBlog()
	 * @generated
	 */
	EReference getBlog_Sections();

	/**
	 * Returns the meta object for class '{@link de.dc.spring.bootstrap.blog.model.Section <em>Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Section</em>'.
	 * @see de.dc.spring.bootstrap.blog.model.Section
	 * @generated
	 */
	EClass getSection();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.spring.bootstrap.blog.model.Section#getUuid <em>Uuid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uuid</em>'.
	 * @see de.dc.spring.bootstrap.blog.model.Section#getUuid()
	 * @see #getSection()
	 * @generated
	 */
	EAttribute getSection_Uuid();

	/**
	 * Returns the meta object for class '{@link de.dc.spring.bootstrap.blog.model.TileSmallSection <em>Tile Small Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tile Small Section</em>'.
	 * @see de.dc.spring.bootstrap.blog.model.TileSmallSection
	 * @generated
	 */
	EClass getTileSmallSection();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dc.spring.bootstrap.blog.model.TileSmallSection#getTiles <em>Tiles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tiles</em>'.
	 * @see de.dc.spring.bootstrap.blog.model.TileSmallSection#getTiles()
	 * @see #getTileSmallSection()
	 * @generated
	 */
	EReference getTileSmallSection_Tiles();

	/**
	 * Returns the meta object for class '{@link de.dc.spring.bootstrap.blog.model.StorySection <em>Story Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Story Section</em>'.
	 * @see de.dc.spring.bootstrap.blog.model.StorySection
	 * @generated
	 */
	EClass getStorySection();

	/**
	 * Returns the meta object for class '{@link de.dc.spring.bootstrap.blog.model.OverivewSection <em>Overivew Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Overivew Section</em>'.
	 * @see de.dc.spring.bootstrap.blog.model.OverivewSection
	 * @generated
	 */
	EClass getOverivewSection();

	/**
	 * Returns the meta object for class '{@link de.dc.spring.bootstrap.blog.model.TitleBigSection <em>Title Big Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Title Big Section</em>'.
	 * @see de.dc.spring.bootstrap.blog.model.TitleBigSection
	 * @generated
	 */
	EClass getTitleBigSection();

	/**
	 * Returns the meta object for class '{@link de.dc.spring.bootstrap.blog.model.AboutSection <em>About Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>About Section</em>'.
	 * @see de.dc.spring.bootstrap.blog.model.AboutSection
	 * @generated
	 */
	EClass getAboutSection();

	/**
	 * Returns the meta object for class '{@link de.dc.spring.bootstrap.blog.model.WorkflowSection <em>Workflow Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Workflow Section</em>'.
	 * @see de.dc.spring.bootstrap.blog.model.WorkflowSection
	 * @generated
	 */
	EClass getWorkflowSection();

	/**
	 * Returns the meta object for class '{@link de.dc.spring.bootstrap.blog.model.GallerySection <em>Gallery Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gallery Section</em>'.
	 * @see de.dc.spring.bootstrap.blog.model.GallerySection
	 * @generated
	 */
	EClass getGallerySection();

	/**
	 * Returns the meta object for class '{@link de.dc.spring.bootstrap.blog.model.GalleryMaterialSection <em>Gallery Material Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gallery Material Section</em>'.
	 * @see de.dc.spring.bootstrap.blog.model.GalleryMaterialSection
	 * @generated
	 */
	EClass getGalleryMaterialSection();

	/**
	 * Returns the meta object for class '{@link de.dc.spring.bootstrap.blog.model.Tile <em>Tile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tile</em>'.
	 * @see de.dc.spring.bootstrap.blog.model.Tile
	 * @generated
	 */
	EClass getTile();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.spring.bootstrap.blog.model.Tile#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see de.dc.spring.bootstrap.blog.model.Tile#getTitle()
	 * @see #getTile()
	 * @generated
	 */
	EAttribute getTile_Title();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.spring.bootstrap.blog.model.Tile#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see de.dc.spring.bootstrap.blog.model.Tile#getDescription()
	 * @see #getTile()
	 * @generated
	 */
	EAttribute getTile_Description();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.spring.bootstrap.blog.model.Tile#getLink <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Link</em>'.
	 * @see de.dc.spring.bootstrap.blog.model.Tile#getLink()
	 * @see #getTile()
	 * @generated
	 */
	EAttribute getTile_Link();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.spring.bootstrap.blog.model.Tile#getDay <em>Day</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Day</em>'.
	 * @see de.dc.spring.bootstrap.blog.model.Tile#getDay()
	 * @see #getTile()
	 * @generated
	 */
	EAttribute getTile_Day();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.spring.bootstrap.blog.model.Tile#getMonth <em>Month</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Month</em>'.
	 * @see de.dc.spring.bootstrap.blog.model.Tile#getMonth()
	 * @see #getTile()
	 * @generated
	 */
	EAttribute getTile_Month();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.spring.bootstrap.blog.model.Tile#getYear <em>Year</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Year</em>'.
	 * @see de.dc.spring.bootstrap.blog.model.Tile#getYear()
	 * @see #getTile()
	 * @generated
	 */
	EAttribute getTile_Year();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.spring.bootstrap.blog.model.Tile#getImage <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Image</em>'.
	 * @see de.dc.spring.bootstrap.blog.model.Tile#getImage()
	 * @see #getTile()
	 * @generated
	 */
	EAttribute getTile_Image();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ModelFactory getModelFactory();

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
		 * The meta object literal for the '{@link de.dc.spring.bootstrap.blog.model.impl.BlogImpl <em>Blog</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.spring.bootstrap.blog.model.impl.BlogImpl
		 * @see de.dc.spring.bootstrap.blog.model.impl.ModelPackageImpl#getBlog()
		 * @generated
		 */
		EClass BLOG = eINSTANCE.getBlog();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BLOG__TITLE = eINSTANCE.getBlog_Title();

		/**
		 * The meta object literal for the '<em><b>Sections</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOG__SECTIONS = eINSTANCE.getBlog_Sections();

		/**
		 * The meta object literal for the '{@link de.dc.spring.bootstrap.blog.model.impl.SectionImpl <em>Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.spring.bootstrap.blog.model.impl.SectionImpl
		 * @see de.dc.spring.bootstrap.blog.model.impl.ModelPackageImpl#getSection()
		 * @generated
		 */
		EClass SECTION = eINSTANCE.getSection();

		/**
		 * The meta object literal for the '<em><b>Uuid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECTION__UUID = eINSTANCE.getSection_Uuid();

		/**
		 * The meta object literal for the '{@link de.dc.spring.bootstrap.blog.model.impl.TileSmallSectionImpl <em>Tile Small Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.spring.bootstrap.blog.model.impl.TileSmallSectionImpl
		 * @see de.dc.spring.bootstrap.blog.model.impl.ModelPackageImpl#getTileSmallSection()
		 * @generated
		 */
		EClass TILE_SMALL_SECTION = eINSTANCE.getTileSmallSection();

		/**
		 * The meta object literal for the '<em><b>Tiles</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TILE_SMALL_SECTION__TILES = eINSTANCE.getTileSmallSection_Tiles();

		/**
		 * The meta object literal for the '{@link de.dc.spring.bootstrap.blog.model.impl.StorySectionImpl <em>Story Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.spring.bootstrap.blog.model.impl.StorySectionImpl
		 * @see de.dc.spring.bootstrap.blog.model.impl.ModelPackageImpl#getStorySection()
		 * @generated
		 */
		EClass STORY_SECTION = eINSTANCE.getStorySection();

		/**
		 * The meta object literal for the '{@link de.dc.spring.bootstrap.blog.model.impl.OverivewSectionImpl <em>Overivew Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.spring.bootstrap.blog.model.impl.OverivewSectionImpl
		 * @see de.dc.spring.bootstrap.blog.model.impl.ModelPackageImpl#getOverivewSection()
		 * @generated
		 */
		EClass OVERIVEW_SECTION = eINSTANCE.getOverivewSection();

		/**
		 * The meta object literal for the '{@link de.dc.spring.bootstrap.blog.model.impl.TitleBigSectionImpl <em>Title Big Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.spring.bootstrap.blog.model.impl.TitleBigSectionImpl
		 * @see de.dc.spring.bootstrap.blog.model.impl.ModelPackageImpl#getTitleBigSection()
		 * @generated
		 */
		EClass TITLE_BIG_SECTION = eINSTANCE.getTitleBigSection();

		/**
		 * The meta object literal for the '{@link de.dc.spring.bootstrap.blog.model.impl.AboutSectionImpl <em>About Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.spring.bootstrap.blog.model.impl.AboutSectionImpl
		 * @see de.dc.spring.bootstrap.blog.model.impl.ModelPackageImpl#getAboutSection()
		 * @generated
		 */
		EClass ABOUT_SECTION = eINSTANCE.getAboutSection();

		/**
		 * The meta object literal for the '{@link de.dc.spring.bootstrap.blog.model.impl.WorkflowSectionImpl <em>Workflow Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.spring.bootstrap.blog.model.impl.WorkflowSectionImpl
		 * @see de.dc.spring.bootstrap.blog.model.impl.ModelPackageImpl#getWorkflowSection()
		 * @generated
		 */
		EClass WORKFLOW_SECTION = eINSTANCE.getWorkflowSection();

		/**
		 * The meta object literal for the '{@link de.dc.spring.bootstrap.blog.model.impl.GallerySectionImpl <em>Gallery Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.spring.bootstrap.blog.model.impl.GallerySectionImpl
		 * @see de.dc.spring.bootstrap.blog.model.impl.ModelPackageImpl#getGallerySection()
		 * @generated
		 */
		EClass GALLERY_SECTION = eINSTANCE.getGallerySection();

		/**
		 * The meta object literal for the '{@link de.dc.spring.bootstrap.blog.model.impl.GalleryMaterialSectionImpl <em>Gallery Material Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.spring.bootstrap.blog.model.impl.GalleryMaterialSectionImpl
		 * @see de.dc.spring.bootstrap.blog.model.impl.ModelPackageImpl#getGalleryMaterialSection()
		 * @generated
		 */
		EClass GALLERY_MATERIAL_SECTION = eINSTANCE.getGalleryMaterialSection();

		/**
		 * The meta object literal for the '{@link de.dc.spring.bootstrap.blog.model.impl.TileImpl <em>Tile</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.spring.bootstrap.blog.model.impl.TileImpl
		 * @see de.dc.spring.bootstrap.blog.model.impl.ModelPackageImpl#getTile()
		 * @generated
		 */
		EClass TILE = eINSTANCE.getTile();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TILE__TITLE = eINSTANCE.getTile_Title();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TILE__DESCRIPTION = eINSTANCE.getTile_Description();

		/**
		 * The meta object literal for the '<em><b>Link</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TILE__LINK = eINSTANCE.getTile_Link();

		/**
		 * The meta object literal for the '<em><b>Day</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TILE__DAY = eINSTANCE.getTile_Day();

		/**
		 * The meta object literal for the '<em><b>Month</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TILE__MONTH = eINSTANCE.getTile_Month();

		/**
		 * The meta object literal for the '<em><b>Year</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TILE__YEAR = eINSTANCE.getTile_Year();

		/**
		 * The meta object literal for the '<em><b>Image</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TILE__IMAGE = eINSTANCE.getTile_Image();

	}

} //ModelPackage
