/**
 */
package de.dc.javafx.xcore.workbench.lecture;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
	 * The meta object id for the '{@link de.dc.javafx.xcore.workbench.lecture.impl.TransitionElementImpl <em>Transition Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.javafx.xcore.workbench.lecture.impl.TransitionElementImpl
	 * @see de.dc.javafx.xcore.workbench.lecture.impl.LecturePackageImpl#getTransitionElement()
	 * @generated
	 */
	int TRANSITION_ELEMENT = 2;

	/**
	 * The feature id for the '<em><b>Transition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_ELEMENT__TRANSITION = 0;

	/**
	 * The number of structural features of the '<em>Transition Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Transition Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_ELEMENT_OPERATION_COUNT = 0;

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
	 * The feature id for the '<em><b>Transition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__TRANSITION = TRANSITION_ELEMENT__TRANSITION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__NAME = TRANSITION_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Use Mark Down</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__USE_MARK_DOWN = TRANSITION_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__CONTENTS = TRANSITION_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION_FEATURE_COUNT = TRANSITION_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION_OPERATION_COUNT = TRANSITION_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dc.javafx.xcore.workbench.lecture.impl.ContentImpl <em>Content</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.javafx.xcore.workbench.lecture.impl.ContentImpl
	 * @see de.dc.javafx.xcore.workbench.lecture.impl.LecturePackageImpl#getContent()
	 * @generated
	 */
	int CONTENT = 3;

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
	int LIST_CONTENT = 4;

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
	 * The meta object id for the '{@link de.dc.javafx.xcore.workbench.lecture.impl.OrderedListContentImpl <em>Ordered List Content</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.javafx.xcore.workbench.lecture.impl.OrderedListContentImpl
	 * @see de.dc.javafx.xcore.workbench.lecture.impl.LecturePackageImpl#getOrderedListContent()
	 * @generated
	 */
	int ORDERED_LIST_CONTENT = 5;

	/**
	 * The feature id for the '<em><b>Item</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_LIST_CONTENT__ITEM = LIST_CONTENT__ITEM;

	/**
	 * The number of structural features of the '<em>Ordered List Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_LIST_CONTENT_FEATURE_COUNT = LIST_CONTENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Ordered List Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_LIST_CONTENT_OPERATION_COUNT = LIST_CONTENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dc.javafx.xcore.workbench.lecture.impl.UnorderedListContentImpl <em>Unordered List Content</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.javafx.xcore.workbench.lecture.impl.UnorderedListContentImpl
	 * @see de.dc.javafx.xcore.workbench.lecture.impl.LecturePackageImpl#getUnorderedListContent()
	 * @generated
	 */
	int UNORDERED_LIST_CONTENT = 6;

	/**
	 * The feature id for the '<em><b>Item</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNORDERED_LIST_CONTENT__ITEM = LIST_CONTENT__ITEM;

	/**
	 * The number of structural features of the '<em>Unordered List Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNORDERED_LIST_CONTENT_FEATURE_COUNT = LIST_CONTENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Unordered List Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNORDERED_LIST_CONTENT_OPERATION_COUNT = LIST_CONTENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dc.javafx.xcore.workbench.lecture.impl.FileContentImpl <em>File Content</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.javafx.xcore.workbench.lecture.impl.FileContentImpl
	 * @see de.dc.javafx.xcore.workbench.lecture.impl.LecturePackageImpl#getFileContent()
	 * @generated
	 */
	int FILE_CONTENT = 7;

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
	int STRING_CONTENT = 8;

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
	 * The meta object id for the '{@link de.dc.javafx.xcore.workbench.lecture.impl.HtmlElementImpl <em>Html Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.javafx.xcore.workbench.lecture.impl.HtmlElementImpl
	 * @see de.dc.javafx.xcore.workbench.lecture.impl.LecturePackageImpl#getHtmlElement()
	 * @generated
	 */
	int HTML_ELEMENT = 9;

	/**
	 * The feature id for the '<em><b>Style Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTML_ELEMENT__STYLE_CLASS = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTML_ELEMENT__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Html Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTML_ELEMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Html Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTML_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dc.javafx.xcore.workbench.lecture.impl.HeaderImpl <em>Header</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.javafx.xcore.workbench.lecture.impl.HeaderImpl
	 * @see de.dc.javafx.xcore.workbench.lecture.impl.LecturePackageImpl#getHeader()
	 * @generated
	 */
	int HEADER = 10;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER__LEVEL = CONTENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER__VALUE = CONTENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Header</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_FEATURE_COUNT = CONTENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Header</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_OPERATION_COUNT = CONTENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dc.javafx.xcore.workbench.lecture.impl.ParagraphImpl <em>Paragraph</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.javafx.xcore.workbench.lecture.impl.ParagraphImpl
	 * @see de.dc.javafx.xcore.workbench.lecture.impl.LecturePackageImpl#getParagraph()
	 * @generated
	 */
	int PARAGRAPH = 11;

	/**
	 * The feature id for the '<em><b>Style Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGRAPH__STYLE_CLASS = CONTENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGRAPH__VALUE = CONTENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGRAPH__CHILDREN = CONTENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Paragraph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGRAPH_FEATURE_COUNT = CONTENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Paragraph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGRAPH_OPERATION_COUNT = CONTENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dc.javafx.xcore.workbench.lecture.impl.SpanImpl <em>Span</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.javafx.xcore.workbench.lecture.impl.SpanImpl
	 * @see de.dc.javafx.xcore.workbench.lecture.impl.LecturePackageImpl#getSpan()
	 * @generated
	 */
	int SPAN = 12;

	/**
	 * The feature id for the '<em><b>Style Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPAN__STYLE_CLASS = HTML_ELEMENT__STYLE_CLASS;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPAN__VALUE = HTML_ELEMENT__VALUE;

	/**
	 * The number of structural features of the '<em>Span</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPAN_FEATURE_COUNT = HTML_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Span</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPAN_OPERATION_COUNT = HTML_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dc.javafx.xcore.workbench.lecture.impl.CodeBlockImpl <em>Code Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.javafx.xcore.workbench.lecture.impl.CodeBlockImpl
	 * @see de.dc.javafx.xcore.workbench.lecture.impl.LecturePackageImpl#getCodeBlock()
	 * @generated
	 */
	int CODE_BLOCK = 13;

	/**
	 * The feature id for the '<em><b>Style Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_BLOCK__STYLE_CLASS = HTML_ELEMENT__STYLE_CLASS;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_BLOCK__VALUE = HTML_ELEMENT__VALUE;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_BLOCK__LANGUAGE = HTML_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Code Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_BLOCK_FEATURE_COUNT = HTML_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Code Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_BLOCK_OPERATION_COUNT = HTML_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dc.javafx.xcore.workbench.lecture.impl.ListItemImpl <em>List Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.javafx.xcore.workbench.lecture.impl.ListItemImpl
	 * @see de.dc.javafx.xcore.workbench.lecture.impl.LecturePackageImpl#getListItem()
	 * @generated
	 */
	int LIST_ITEM = 14;

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
	 * The meta object id for the '{@link de.dc.javafx.xcore.workbench.lecture.Transition <em>Transition</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.javafx.xcore.workbench.lecture.Transition
	 * @see de.dc.javafx.xcore.workbench.lecture.impl.LecturePackageImpl#getTransition()
	 * @generated
	 */
	int TRANSITION = 15;

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
	 * Returns the meta object for class '{@link de.dc.javafx.xcore.workbench.lecture.TransitionElement <em>Transition Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition Element</em>'.
	 * @see de.dc.javafx.xcore.workbench.lecture.TransitionElement
	 * @generated
	 */
	EClass getTransitionElement();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.javafx.xcore.workbench.lecture.TransitionElement#getTransition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transition</em>'.
	 * @see de.dc.javafx.xcore.workbench.lecture.TransitionElement#getTransition()
	 * @see #getTransitionElement()
	 * @generated
	 */
	EAttribute getTransitionElement_Transition();

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
	 * Returns the meta object for class '{@link de.dc.javafx.xcore.workbench.lecture.OrderedListContent <em>Ordered List Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ordered List Content</em>'.
	 * @see de.dc.javafx.xcore.workbench.lecture.OrderedListContent
	 * @generated
	 */
	EClass getOrderedListContent();

	/**
	 * Returns the meta object for class '{@link de.dc.javafx.xcore.workbench.lecture.UnorderedListContent <em>Unordered List Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unordered List Content</em>'.
	 * @see de.dc.javafx.xcore.workbench.lecture.UnorderedListContent
	 * @generated
	 */
	EClass getUnorderedListContent();

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
	 * Returns the meta object for class '{@link de.dc.javafx.xcore.workbench.lecture.HtmlElement <em>Html Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Html Element</em>'.
	 * @see de.dc.javafx.xcore.workbench.lecture.HtmlElement
	 * @generated
	 */
	EClass getHtmlElement();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.javafx.xcore.workbench.lecture.HtmlElement#getStyleClass <em>Style Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style Class</em>'.
	 * @see de.dc.javafx.xcore.workbench.lecture.HtmlElement#getStyleClass()
	 * @see #getHtmlElement()
	 * @generated
	 */
	EAttribute getHtmlElement_StyleClass();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.javafx.xcore.workbench.lecture.HtmlElement#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see de.dc.javafx.xcore.workbench.lecture.HtmlElement#getValue()
	 * @see #getHtmlElement()
	 * @generated
	 */
	EAttribute getHtmlElement_Value();

	/**
	 * Returns the meta object for class '{@link de.dc.javafx.xcore.workbench.lecture.Header <em>Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Header</em>'.
	 * @see de.dc.javafx.xcore.workbench.lecture.Header
	 * @generated
	 */
	EClass getHeader();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.javafx.xcore.workbench.lecture.Header#getLevel <em>Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Level</em>'.
	 * @see de.dc.javafx.xcore.workbench.lecture.Header#getLevel()
	 * @see #getHeader()
	 * @generated
	 */
	EAttribute getHeader_Level();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.javafx.xcore.workbench.lecture.Header#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see de.dc.javafx.xcore.workbench.lecture.Header#getValue()
	 * @see #getHeader()
	 * @generated
	 */
	EAttribute getHeader_Value();

	/**
	 * Returns the meta object for class '{@link de.dc.javafx.xcore.workbench.lecture.Paragraph <em>Paragraph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Paragraph</em>'.
	 * @see de.dc.javafx.xcore.workbench.lecture.Paragraph
	 * @generated
	 */
	EClass getParagraph();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dc.javafx.xcore.workbench.lecture.Paragraph#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see de.dc.javafx.xcore.workbench.lecture.Paragraph#getChildren()
	 * @see #getParagraph()
	 * @generated
	 */
	EReference getParagraph_Children();

	/**
	 * Returns the meta object for class '{@link de.dc.javafx.xcore.workbench.lecture.Span <em>Span</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Span</em>'.
	 * @see de.dc.javafx.xcore.workbench.lecture.Span
	 * @generated
	 */
	EClass getSpan();

	/**
	 * Returns the meta object for class '{@link de.dc.javafx.xcore.workbench.lecture.CodeBlock <em>Code Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Code Block</em>'.
	 * @see de.dc.javafx.xcore.workbench.lecture.CodeBlock
	 * @generated
	 */
	EClass getCodeBlock();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.javafx.xcore.workbench.lecture.CodeBlock#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Language</em>'.
	 * @see de.dc.javafx.xcore.workbench.lecture.CodeBlock#getLanguage()
	 * @see #getCodeBlock()
	 * @generated
	 */
	EAttribute getCodeBlock_Language();

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
	 * Returns the meta object for enum '{@link de.dc.javafx.xcore.workbench.lecture.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Transition</em>'.
	 * @see de.dc.javafx.xcore.workbench.lecture.Transition
	 * @generated
	 */
	EEnum getTransition();

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
		 * The meta object literal for the '{@link de.dc.javafx.xcore.workbench.lecture.impl.TransitionElementImpl <em>Transition Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.javafx.xcore.workbench.lecture.impl.TransitionElementImpl
		 * @see de.dc.javafx.xcore.workbench.lecture.impl.LecturePackageImpl#getTransitionElement()
		 * @generated
		 */
		EClass TRANSITION_ELEMENT = eINSTANCE.getTransitionElement();

		/**
		 * The meta object literal for the '<em><b>Transition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION_ELEMENT__TRANSITION = eINSTANCE.getTransitionElement_Transition();

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
		 * The meta object literal for the '{@link de.dc.javafx.xcore.workbench.lecture.impl.OrderedListContentImpl <em>Ordered List Content</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.javafx.xcore.workbench.lecture.impl.OrderedListContentImpl
		 * @see de.dc.javafx.xcore.workbench.lecture.impl.LecturePackageImpl#getOrderedListContent()
		 * @generated
		 */
		EClass ORDERED_LIST_CONTENT = eINSTANCE.getOrderedListContent();

		/**
		 * The meta object literal for the '{@link de.dc.javafx.xcore.workbench.lecture.impl.UnorderedListContentImpl <em>Unordered List Content</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.javafx.xcore.workbench.lecture.impl.UnorderedListContentImpl
		 * @see de.dc.javafx.xcore.workbench.lecture.impl.LecturePackageImpl#getUnorderedListContent()
		 * @generated
		 */
		EClass UNORDERED_LIST_CONTENT = eINSTANCE.getUnorderedListContent();

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
		 * The meta object literal for the '{@link de.dc.javafx.xcore.workbench.lecture.impl.HtmlElementImpl <em>Html Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.javafx.xcore.workbench.lecture.impl.HtmlElementImpl
		 * @see de.dc.javafx.xcore.workbench.lecture.impl.LecturePackageImpl#getHtmlElement()
		 * @generated
		 */
		EClass HTML_ELEMENT = eINSTANCE.getHtmlElement();

		/**
		 * The meta object literal for the '<em><b>Style Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HTML_ELEMENT__STYLE_CLASS = eINSTANCE.getHtmlElement_StyleClass();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HTML_ELEMENT__VALUE = eINSTANCE.getHtmlElement_Value();

		/**
		 * The meta object literal for the '{@link de.dc.javafx.xcore.workbench.lecture.impl.HeaderImpl <em>Header</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.javafx.xcore.workbench.lecture.impl.HeaderImpl
		 * @see de.dc.javafx.xcore.workbench.lecture.impl.LecturePackageImpl#getHeader()
		 * @generated
		 */
		EClass HEADER = eINSTANCE.getHeader();

		/**
		 * The meta object literal for the '<em><b>Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEADER__LEVEL = eINSTANCE.getHeader_Level();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEADER__VALUE = eINSTANCE.getHeader_Value();

		/**
		 * The meta object literal for the '{@link de.dc.javafx.xcore.workbench.lecture.impl.ParagraphImpl <em>Paragraph</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.javafx.xcore.workbench.lecture.impl.ParagraphImpl
		 * @see de.dc.javafx.xcore.workbench.lecture.impl.LecturePackageImpl#getParagraph()
		 * @generated
		 */
		EClass PARAGRAPH = eINSTANCE.getParagraph();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAGRAPH__CHILDREN = eINSTANCE.getParagraph_Children();

		/**
		 * The meta object literal for the '{@link de.dc.javafx.xcore.workbench.lecture.impl.SpanImpl <em>Span</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.javafx.xcore.workbench.lecture.impl.SpanImpl
		 * @see de.dc.javafx.xcore.workbench.lecture.impl.LecturePackageImpl#getSpan()
		 * @generated
		 */
		EClass SPAN = eINSTANCE.getSpan();

		/**
		 * The meta object literal for the '{@link de.dc.javafx.xcore.workbench.lecture.impl.CodeBlockImpl <em>Code Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.javafx.xcore.workbench.lecture.impl.CodeBlockImpl
		 * @see de.dc.javafx.xcore.workbench.lecture.impl.LecturePackageImpl#getCodeBlock()
		 * @generated
		 */
		EClass CODE_BLOCK = eINSTANCE.getCodeBlock();

		/**
		 * The meta object literal for the '<em><b>Language</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CODE_BLOCK__LANGUAGE = eINSTANCE.getCodeBlock_Language();

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

		/**
		 * The meta object literal for the '{@link de.dc.javafx.xcore.workbench.lecture.Transition <em>Transition</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.javafx.xcore.workbench.lecture.Transition
		 * @see de.dc.javafx.xcore.workbench.lecture.impl.LecturePackageImpl#getTransition()
		 * @generated
		 */
		EEnum TRANSITION = eINSTANCE.getTransition();

	}

} //LecturePackage
