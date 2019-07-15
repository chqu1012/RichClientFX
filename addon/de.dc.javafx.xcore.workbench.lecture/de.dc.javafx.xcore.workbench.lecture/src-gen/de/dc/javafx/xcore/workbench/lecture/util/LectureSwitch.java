/**
 */
package de.dc.javafx.xcore.workbench.lecture.util;

import de.dc.javafx.xcore.workbench.lecture.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see de.dc.javafx.xcore.workbench.lecture.LecturePackage
 * @generated
 */
public class LectureSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static LecturePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LectureSwitch() {
		if (modelPackage == null) {
			modelPackage = LecturePackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case LecturePackage.LECTURE_PROJECT: {
			LectureProject lectureProject = (LectureProject) theEObject;
			T result = caseLectureProject(lectureProject);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case LecturePackage.SECTION: {
			Section section = (Section) theEObject;
			T result = caseSection(section);
			if (result == null)
				result = caseContent(section);
			if (result == null)
				result = caseTransitionElement(section);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case LecturePackage.TRANSITION_ELEMENT: {
			TransitionElement transitionElement = (TransitionElement) theEObject;
			T result = caseTransitionElement(transitionElement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case LecturePackage.CONTENT: {
			Content content = (Content) theEObject;
			T result = caseContent(content);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case LecturePackage.LIST_CONTENT: {
			ListContent listContent = (ListContent) theEObject;
			T result = caseListContent(listContent);
			if (result == null)
				result = caseContent(listContent);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case LecturePackage.ORDERED_LIST_CONTENT: {
			OrderedListContent orderedListContent = (OrderedListContent) theEObject;
			T result = caseOrderedListContent(orderedListContent);
			if (result == null)
				result = caseListContent(orderedListContent);
			if (result == null)
				result = caseContent(orderedListContent);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case LecturePackage.UNORDERED_LIST_CONTENT: {
			UnorderedListContent unorderedListContent = (UnorderedListContent) theEObject;
			T result = caseUnorderedListContent(unorderedListContent);
			if (result == null)
				result = caseListContent(unorderedListContent);
			if (result == null)
				result = caseContent(unorderedListContent);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case LecturePackage.FILE_CONTENT: {
			FileContent fileContent = (FileContent) theEObject;
			T result = caseFileContent(fileContent);
			if (result == null)
				result = caseContent(fileContent);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case LecturePackage.STRING_CONTENT: {
			StringContent stringContent = (StringContent) theEObject;
			T result = caseStringContent(stringContent);
			if (result == null)
				result = caseContent(stringContent);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case LecturePackage.HTML_ELEMENT: {
			HtmlElement htmlElement = (HtmlElement) theEObject;
			T result = caseHtmlElement(htmlElement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case LecturePackage.HEADER: {
			Header header = (Header) theEObject;
			T result = caseHeader(header);
			if (result == null)
				result = caseContent(header);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case LecturePackage.PARAGRAPH: {
			Paragraph paragraph = (Paragraph) theEObject;
			T result = caseParagraph(paragraph);
			if (result == null)
				result = caseContent(paragraph);
			if (result == null)
				result = caseHtmlElement(paragraph);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case LecturePackage.SPAN: {
			Span span = (Span) theEObject;
			T result = caseSpan(span);
			if (result == null)
				result = caseHtmlElement(span);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case LecturePackage.CODE_BLOCK: {
			CodeBlock codeBlock = (CodeBlock) theEObject;
			T result = caseCodeBlock(codeBlock);
			if (result == null)
				result = caseHtmlElement(codeBlock);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case LecturePackage.LINK: {
			Link link = (Link) theEObject;
			T result = caseLink(link);
			if (result == null)
				result = caseHtmlElement(link);
			if (result == null)
				result = caseContent(link);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case LecturePackage.LIST_ITEM: {
			ListItem listItem = (ListItem) theEObject;
			T result = caseListItem(listItem);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Project</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Project</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLectureProject(LectureProject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSection(Section object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transition Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transition Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransitionElement(TransitionElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Content</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Content</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContent(Content object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Content</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Content</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListContent(ListContent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ordered List Content</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ordered List Content</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrderedListContent(OrderedListContent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unordered List Content</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unordered List Content</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnorderedListContent(UnorderedListContent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>File Content</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>File Content</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFileContent(FileContent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Content</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Content</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringContent(StringContent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Html Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Html Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHtmlElement(HtmlElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Header</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Header</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHeader(Header object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Paragraph</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Paragraph</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParagraph(Paragraph object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Span</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Span</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpan(Span object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Code Block</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Code Block</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCodeBlock(CodeBlock object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLink(Link object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListItem(ListItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //LectureSwitch
