/**
 */
package de.dc.javafx.xcore.workbench.lecture.impl;

import de.dc.javafx.xcore.workbench.lecture.CodeBlock;
import de.dc.javafx.xcore.workbench.lecture.Content;
import de.dc.javafx.xcore.workbench.lecture.FileContent;
import de.dc.javafx.xcore.workbench.lecture.Header;
import de.dc.javafx.xcore.workbench.lecture.HtmlElement;
import de.dc.javafx.xcore.workbench.lecture.LectureFactory;
import de.dc.javafx.xcore.workbench.lecture.LecturePackage;
import de.dc.javafx.xcore.workbench.lecture.LectureProject;
import de.dc.javafx.xcore.workbench.lecture.ListContent;
import de.dc.javafx.xcore.workbench.lecture.ListItem;
import de.dc.javafx.xcore.workbench.lecture.OrderedListContent;
import de.dc.javafx.xcore.workbench.lecture.Paragraph;
import de.dc.javafx.xcore.workbench.lecture.Section;
import de.dc.javafx.xcore.workbench.lecture.Span;
import de.dc.javafx.xcore.workbench.lecture.StringContent;
import de.dc.javafx.xcore.workbench.lecture.Transition;
import de.dc.javafx.xcore.workbench.lecture.TransitionElement;
import de.dc.javafx.xcore.workbench.lecture.UnorderedListContent;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class LecturePackageImpl extends EPackageImpl implements LecturePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lectureProjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transitionElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listContentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orderedListContentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unorderedListContentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fileContentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringContentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass htmlElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass headerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass paragraphEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass spanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass codeBlockEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum transitionEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see de.dc.javafx.xcore.workbench.lecture.LecturePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private LecturePackageImpl() {
		super(eNS_URI, LectureFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link LecturePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static LecturePackage init() {
		if (isInited)
			return (LecturePackage) EPackage.Registry.INSTANCE.getEPackage(LecturePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredLecturePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		LecturePackageImpl theLecturePackage = registeredLecturePackage instanceof LecturePackageImpl
				? (LecturePackageImpl) registeredLecturePackage
				: new LecturePackageImpl();

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theLecturePackage.createPackageContents();

		// Initialize created meta-data
		theLecturePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theLecturePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(LecturePackage.eNS_URI, theLecturePackage);
		return theLecturePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLectureProject() {
		return lectureProjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLectureProject_Sections() {
		return (EReference) lectureProjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSection() {
		return sectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSection_Name() {
		return (EAttribute) sectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSection_UseMarkDown() {
		return (EAttribute) sectionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSection_Contents() {
		return (EReference) sectionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTransitionElement() {
		return transitionElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTransitionElement_Transition() {
		return (EAttribute) transitionElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getContent() {
		return contentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getListContent() {
		return listContentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getListContent_Item() {
		return (EReference) listContentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOrderedListContent() {
		return orderedListContentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUnorderedListContent() {
		return unorderedListContentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFileContent() {
		return fileContentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFileContent_Path() {
		return (EAttribute) fileContentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStringContent() {
		return stringContentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStringContent_Body() {
		return (EAttribute) stringContentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHtmlElement() {
		return htmlElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHtmlElement_StyleClass() {
		return (EAttribute) htmlElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHtmlElement_Value() {
		return (EAttribute) htmlElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHeader() {
		return headerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHeader_Level() {
		return (EAttribute) headerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHeader_Value() {
		return (EAttribute) headerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getParagraph() {
		return paragraphEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getParagraph_Children() {
		return (EReference) paragraphEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSpan() {
		return spanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCodeBlock() {
		return codeBlockEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCodeBlock_Language() {
		return (EAttribute) codeBlockEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getListItem() {
		return listItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getListItem_Value() {
		return (EAttribute) listItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getTransition() {
		return transitionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LectureFactory getLectureFactory() {
		return (LectureFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		lectureProjectEClass = createEClass(LECTURE_PROJECT);
		createEReference(lectureProjectEClass, LECTURE_PROJECT__SECTIONS);

		sectionEClass = createEClass(SECTION);
		createEAttribute(sectionEClass, SECTION__NAME);
		createEAttribute(sectionEClass, SECTION__USE_MARK_DOWN);
		createEReference(sectionEClass, SECTION__CONTENTS);

		transitionElementEClass = createEClass(TRANSITION_ELEMENT);
		createEAttribute(transitionElementEClass, TRANSITION_ELEMENT__TRANSITION);

		contentEClass = createEClass(CONTENT);

		listContentEClass = createEClass(LIST_CONTENT);
		createEReference(listContentEClass, LIST_CONTENT__ITEM);

		orderedListContentEClass = createEClass(ORDERED_LIST_CONTENT);

		unorderedListContentEClass = createEClass(UNORDERED_LIST_CONTENT);

		fileContentEClass = createEClass(FILE_CONTENT);
		createEAttribute(fileContentEClass, FILE_CONTENT__PATH);

		stringContentEClass = createEClass(STRING_CONTENT);
		createEAttribute(stringContentEClass, STRING_CONTENT__BODY);

		htmlElementEClass = createEClass(HTML_ELEMENT);
		createEAttribute(htmlElementEClass, HTML_ELEMENT__STYLE_CLASS);
		createEAttribute(htmlElementEClass, HTML_ELEMENT__VALUE);

		headerEClass = createEClass(HEADER);
		createEAttribute(headerEClass, HEADER__LEVEL);
		createEAttribute(headerEClass, HEADER__VALUE);

		paragraphEClass = createEClass(PARAGRAPH);
		createEReference(paragraphEClass, PARAGRAPH__CHILDREN);

		spanEClass = createEClass(SPAN);

		codeBlockEClass = createEClass(CODE_BLOCK);
		createEAttribute(codeBlockEClass, CODE_BLOCK__LANGUAGE);

		listItemEClass = createEClass(LIST_ITEM);
		createEAttribute(listItemEClass, LIST_ITEM__VALUE);

		// Create enums
		transitionEEnum = createEEnum(TRANSITION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		EcorePackage theEcorePackage = (EcorePackage) EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		sectionEClass.getESuperTypes().add(this.getTransitionElement());
		listContentEClass.getESuperTypes().add(this.getContent());
		orderedListContentEClass.getESuperTypes().add(this.getListContent());
		unorderedListContentEClass.getESuperTypes().add(this.getListContent());
		fileContentEClass.getESuperTypes().add(this.getContent());
		stringContentEClass.getESuperTypes().add(this.getContent());
		headerEClass.getESuperTypes().add(this.getContent());
		paragraphEClass.getESuperTypes().add(this.getContent());
		paragraphEClass.getESuperTypes().add(this.getHtmlElement());
		spanEClass.getESuperTypes().add(this.getHtmlElement());
		codeBlockEClass.getESuperTypes().add(this.getHtmlElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(lectureProjectEClass, LectureProject.class, "LectureProject", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLectureProject_Sections(), this.getSection(), null, "sections", null, 0, -1,
				LectureProject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sectionEClass, Section.class, "Section", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSection_Name(), theEcorePackage.getEString(), "name", null, 0, 1, Section.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getSection_UseMarkDown(), theEcorePackage.getEBoolean(), "useMarkDown", "false", 0, 1,
				Section.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getSection_Contents(), this.getContent(), null, "contents", null, 0, -1, Section.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(transitionElementEClass, TransitionElement.class, "TransitionElement", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTransitionElement_Transition(), this.getTransition(), "transition", null, 0, 1,
				TransitionElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(contentEClass, Content.class, "Content", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(listContentEClass, ListContent.class, "ListContent", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getListContent_Item(), this.getListItem(), null, "item", null, 0, -1, ListContent.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(orderedListContentEClass, OrderedListContent.class, "OrderedListContent", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(unorderedListContentEClass, UnorderedListContent.class, "UnorderedListContent", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(fileContentEClass, FileContent.class, "FileContent", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFileContent_Path(), theEcorePackage.getEString(), "path", null, 0, 1, FileContent.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(stringContentEClass, StringContent.class, "StringContent", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStringContent_Body(), theEcorePackage.getEString(), "body", "", 0, 1, StringContent.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(htmlElementEClass, HtmlElement.class, "HtmlElement", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHtmlElement_StyleClass(), theEcorePackage.getEString(), "styleClass", "", 0, 1,
				HtmlElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getHtmlElement_Value(), theEcorePackage.getEString(), "value", "", 0, 1, HtmlElement.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(headerEClass, Header.class, "Header", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHeader_Level(), theEcorePackage.getEInt(), "level", null, 0, 1, Header.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHeader_Value(), theEcorePackage.getEString(), "value", "", 0, 1, Header.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(paragraphEClass, Paragraph.class, "Paragraph", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getParagraph_Children(), this.getHtmlElement(), null, "children", null, 0, -1, Paragraph.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(spanEClass, Span.class, "Span", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(codeBlockEClass, CodeBlock.class, "CodeBlock", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCodeBlock_Language(), theEcorePackage.getEString(), "language", "java", 0, 1, CodeBlock.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(listItemEClass, ListItem.class, "ListItem", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getListItem_Value(), theEcorePackage.getEString(), "value", "", 0, 1, ListItem.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(transitionEEnum, Transition.class, "Transition");
		addEEnumLiteral(transitionEEnum, Transition.NONE);
		addEEnumLiteral(transitionEEnum, Transition.SLIDE);
		addEEnumLiteral(transitionEEnum, Transition.FADE);
		addEEnumLiteral(transitionEEnum, Transition.CONVEX);
		addEEnumLiteral(transitionEEnum, Transition.CONCAVE);
		addEEnumLiteral(transitionEEnum, Transition.ZOOM);

		// Create resource
		createResource(eNS_URI);
	}

} //LecturePackageImpl
