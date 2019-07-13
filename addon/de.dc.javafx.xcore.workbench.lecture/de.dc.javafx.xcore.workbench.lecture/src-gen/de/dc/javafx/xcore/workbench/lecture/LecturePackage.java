/**
 */
package de.dc.javafx.xcore.workbench.lecture;

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
 * @see de.dc.javafx.xcore.workbench.lecture.LectureFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel multipleEditorPages='false' creationIcons='false' editDirectory='/de.dc.javafx.xcore.workbench.lecture.edit/src-gen' editorDirectory='/de.dc.javafx.xcore.workbench.lecture.editor/src-gen' richClientPlatform='true' codeFormatting='true' importerID='org.eclipse.emf.importer.ecore' runtimePlatform='RCP' fileExtensions='lecture' tableProviders='true' dataTypeConverters='true' basePackage='de.dc.javafx.xcore.workbench'"
 * @generated
 */
public interface LecturePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "lecture";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.frateranatis.org/workbench/lecture";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "lecture";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LecturePackage eINSTANCE = de.dc.javafx.xcore.workbench.lecture.impl.LecturePackageImpl.init();

	/**
	 * The meta object id for the '{@link de.dc.javafx.xcore.workbench.lecture.impl.LectureProjectImpl <em>Project</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.javafx.xcore.workbench.lecture.impl.LectureProjectImpl
	 * @see de.dc.javafx.xcore.workbench.lecture.impl.LecturePackageImpl#getLectureProject()
	 * @generated
	 */
	int LECTURE_PROJECT = 0;

	/**
	 * The feature id for the '<em><b>Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LECTURE_PROJECT__SECTIONS = 0;

	/**
	 * The number of structural features of the '<em>Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LECTURE_PROJECT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LECTURE_PROJECT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dc.javafx.xcore.workbench.lecture.impl.SectionImpl <em>Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.javafx.xcore.workbench.lecture.impl.SectionImpl
	 * @see de.dc.javafx.xcore.workbench.lecture.impl.LecturePackageImpl#getSection()
	 * @generated
	 */
	int SECTION = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Use Mark Down</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__USE_MARK_DOWN = 1;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__CONTENTS = 2;

	/**
	 * The number of structural features of the '<em>Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dc.javafx.xcore.workbench.lecture.impl.ContentImpl <em>Content</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.javafx.xcore.workbench.lecture.impl.ContentImpl
	 * @see de.dc.javafx.xcore.workbench.lecture.impl.LecturePackageImpl#getContent()
	 * @generated
	 */
	int CONTENT = 2;

	/**
	 * The number of structural features of the '<em>Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dc.javafx.xcore.workbench.lecture.impl.ListContentImpl <em>List Content</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.javafx.xcore.workbench.lecture.impl.ListContentImpl
	 * @see de.dc.javafx.xcore.workbench.lecture.impl.LecturePackageImpl#getListContent()
	 * @generated
	 */
	int LIST_CONTENT = 3;

	/**
	 * The feature id for the '<em><b>Item</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_CONTENT__ITEM = CONTENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>List Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_CONTENT_FEATURE_COUNT = CONTENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>List Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_CONTENT_OPERATION_COUNT = CONTENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dc.javafx.xcore.workbench.lecture.impl.FileContentImpl <em>File Content</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.javafx.xcore.workbench.lecture.impl.FileContentImpl
	 * @see de.dc.javafx.xcore.workbench.lecture.impl.LecturePackageImpl#getFileContent()
	 * @generated
	 */
	int FILE_CONTENT = 4;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_CONTENT__PATH = CONTENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>File Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_CONTENT_FEATURE_COUNT = CONTENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>File Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_CONTENT_OPERATION_COUNT = CONTENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dc.javafx.xcore.workbench.lecture.impl.StringContentImpl <em>String Content</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.javafx.xcore.workbench.lecture.impl.StringContentImpl
	 * @see de.dc.javafx.xcore.workbench.lecture.impl.LecturePackageImpl#getStringContent()
	 * @generated
	 */
	int STRING_CONTENT = 5;

	/**
	 * The feature id for the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_CONTENT__BODY = CONTENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>String Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_CONTENT_FEATURE_COUNT = CONTENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>String Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_CONTENT_OPERATION_COUNT = CONTENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dc.javafx.xcore.workbench.lecture.impl.ListItemImpl <em>List Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.javafx.xcore.workbench.lecture.impl.ListItemImpl
	 * @see de.dc.javafx.xcore.workbench.lecture.impl.LecturePackageImpl#getListItem()
	 * @generated
	 */
	int LIST_ITEM = 6;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ITEM__VALUE = 0;

	/**
	 * The number of structural features of the '<em>List Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ITEM_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>List Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ITEM_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link de.dc.javafx.xcore.workbench.lecture.LectureProject <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Project</em>'.
	 * @see de.dc.javafx.xcore.workbench.lecture.LectureProject
	 * @generated
	 */
	EClass getLectureProject();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dc.javafx.xcore.workbench.lecture.LectureProject#getSections <em>Sections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sections</em>'.
	 * @see de.dc.javafx.xcore.workbench.lecture.LectureProject#getSections()
	 * @see #getLectureProject()
	 * @generated
	 */
	EReference getLectureProject_Sections();

	/**
	 * Returns the meta object for class '{@link de.dc.javafx.xcore.workbench.lecture.Section <em>Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Section</em>'.
	 * @see de.dc.javafx.xcore.workbench.lecture.Section
	 * @generated
	 */
	EClass getSection();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.javafx.xcore.workbench.lecture.Section#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.dc.javafx.xcore.workbench.lecture.Section#getName()
	 * @see #getSection()
	 * @generated
	 */
	EAttribute getSection_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.javafx.xcore.workbench.lecture.Section#isUseMarkDown <em>Use Mark Down</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Use Mark Down</em>'.
	 * @see de.dc.javafx.xcore.workbench.lecture.Section#isUseMarkDown()
	 * @see #getSection()
	 * @generated
	 */
	EAttribute getSection_UseMarkDown();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dc.javafx.xcore.workbench.lecture.Section#getContents <em>Contents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contents</em>'.
	 * @see de.dc.javafx.xcore.workbench.lecture.Section#getContents()
	 * @see #getSection()
	 * @generated
	 */
	EReference getSection_Contents();

	/**
	 * Returns the meta object for class '{@link de.dc.javafx.xcore.workbench.lecture.Content <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Content</em>'.
	 * @see de.dc.javafx.xcore.workbench.lecture.Content
	 * @generated
	 */
	EClass getContent();

	/**
	 * Returns the meta object for class '{@link de.dc.javafx.xcore.workbench.lecture.ListContent <em>List Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List Content</em>'.
	 * @see de.dc.javafx.xcore.workbench.lecture.ListContent
	 * @generated
	 */
	EClass getListContent();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dc.javafx.xcore.workbench.lecture.ListContent#getItem <em>Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Item</em>'.
	 * @see de.dc.javafx.xcore.workbench.lecture.ListContent#getItem()
	 * @see #getListContent()
	 * @generated
	 */
	EReference getListContent_Item();

	/**
	 * Returns the meta object for class '{@link de.dc.javafx.xcore.workbench.lecture.FileContent <em>File Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File Content</em>'.
	 * @see de.dc.javafx.xcore.workbench.lecture.FileContent
	 * @generated
	 */
	EClass getFileContent();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.javafx.xcore.workbench.lecture.FileContent#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see de.dc.javafx.xcore.workbench.lecture.FileContent#getPath()
	 * @see #getFileContent()
	 * @generated
	 */
	EAttribute getFileContent_Path();

	/**
	 * Returns the meta object for class '{@link de.dc.javafx.xcore.workbench.lecture.StringContent <em>String Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Content</em>'.
	 * @see de.dc.javafx.xcore.workbench.lecture.StringContent
	 * @generated
	 */
	EClass getStringContent();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.javafx.xcore.workbench.lecture.StringContent#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Body</em>'.
	 * @see de.dc.javafx.xcore.workbench.lecture.StringContent#getBody()
	 * @see #getStringContent()
	 * @generated
	 */
	EAttribute getStringContent_Body();

	/**
	 * Returns the meta object for class '{@link de.dc.javafx.xcore.workbench.lecture.ListItem <em>List Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List Item</em>'.
	 * @see de.dc.javafx.xcore.workbench.lecture.ListItem
	 * @generated
	 */
	EClass getListItem();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.javafx.xcore.workbench.lecture.ListItem#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see de.dc.javafx.xcore.workbench.lecture.ListItem#getValue()
	 * @see #getListItem()
	 * @generated
	 */
	EAttribute getListItem_Value();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	LectureFactory getLectureFactory();

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
		 * The meta object literal for the '{@link de.dc.javafx.xcore.workbench.lecture.impl.LectureProjectImpl <em>Project</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.javafx.xcore.workbench.lecture.impl.LectureProjectImpl
		 * @see de.dc.javafx.xcore.workbench.lecture.impl.LecturePackageImpl#getLectureProject()
		 * @generated
		 */
		EClass LECTURE_PROJECT = eINSTANCE.getLectureProject();

		/**
		 * The meta object literal for the '<em><b>Sections</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LECTURE_PROJECT__SECTIONS = eINSTANCE.getLectureProject_Sections();

		/**
		 * The meta object literal for the '{@link de.dc.javafx.xcore.workbench.lecture.impl.SectionImpl <em>Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.javafx.xcore.workbench.lecture.impl.SectionImpl
		 * @see de.dc.javafx.xcore.workbench.lecture.impl.LecturePackageImpl#getSection()
		 * @generated
		 */
		EClass SECTION = eINSTANCE.getSection();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECTION__NAME = eINSTANCE.getSection_Name();

		/**
		 * The meta object literal for the '<em><b>Use Mark Down</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECTION__USE_MARK_DOWN = eINSTANCE.getSection_UseMarkDown();

		/**
		 * The meta object literal for the '<em><b>Contents</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECTION__CONTENTS = eINSTANCE.getSection_Contents();

		/**
		 * The meta object literal for the '{@link de.dc.javafx.xcore.workbench.lecture.impl.ContentImpl <em>Content</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.javafx.xcore.workbench.lecture.impl.ContentImpl
		 * @see de.dc.javafx.xcore.workbench.lecture.impl.LecturePackageImpl#getContent()
		 * @generated
		 */
		EClass CONTENT = eINSTANCE.getContent();

		/**
		 * The meta object literal for the '{@link de.dc.javafx.xcore.workbench.lecture.impl.ListContentImpl <em>List Content</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.javafx.xcore.workbench.lecture.impl.ListContentImpl
		 * @see de.dc.javafx.xcore.workbench.lecture.impl.LecturePackageImpl#getListContent()
		 * @generated
		 */
		EClass LIST_CONTENT = eINSTANCE.getListContent();

		/**
		 * The meta object literal for the '<em><b>Item</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIST_CONTENT__ITEM = eINSTANCE.getListContent_Item();

		/**
		 * The meta object literal for the '{@link de.dc.javafx.xcore.workbench.lecture.impl.FileContentImpl <em>File Content</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.javafx.xcore.workbench.lecture.impl.FileContentImpl
		 * @see de.dc.javafx.xcore.workbench.lecture.impl.LecturePackageImpl#getFileContent()
		 * @generated
		 */
		EClass FILE_CONTENT = eINSTANCE.getFileContent();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE_CONTENT__PATH = eINSTANCE.getFileContent_Path();

		/**
		 * The meta object literal for the '{@link de.dc.javafx.xcore.workbench.lecture.impl.StringContentImpl <em>String Content</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.javafx.xcore.workbench.lecture.impl.StringContentImpl
		 * @see de.dc.javafx.xcore.workbench.lecture.impl.LecturePackageImpl#getStringContent()
		 * @generated
		 */
		EClass STRING_CONTENT = eINSTANCE.getStringContent();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_CONTENT__BODY = eINSTANCE.getStringContent_Body();

		/**
		 * The meta object literal for the '{@link de.dc.javafx.xcore.workbench.lecture.impl.ListItemImpl <em>List Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.javafx.xcore.workbench.lecture.impl.ListItemImpl
		 * @see de.dc.javafx.xcore.workbench.lecture.impl.LecturePackageImpl#getListItem()
		 * @generated
		 */
		EClass LIST_ITEM = eINSTANCE.getListItem();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIST_ITEM__VALUE = eINSTANCE.getListItem_Value();

	}

} //LecturePackage
