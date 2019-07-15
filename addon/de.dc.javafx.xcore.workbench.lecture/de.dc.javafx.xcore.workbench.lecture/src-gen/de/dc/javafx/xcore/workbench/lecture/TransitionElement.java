/**
 */
package de.dc.javafx.xcore.workbench.lecture;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dc.javafx.xcore.workbench.lecture.TransitionElement#getTransition <em>Transition</em>}</li>
 * </ul>
 *
 * @see de.dc.javafx.xcore.workbench.lecture.LecturePackage#getTransitionElement()
 * @model abstract="true"
 * @generated
 */
public interface TransitionElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Transition</b></em>' attribute.
	 * The literals are from the enumeration {@link de.dc.javafx.xcore.workbench.lecture.Transition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transition</em>' attribute.
	 * @see de.dc.javafx.xcore.workbench.lecture.Transition
	 * @see #setTransition(Transition)
	 * @see de.dc.javafx.xcore.workbench.lecture.LecturePackage#getTransitionElement_Transition()
	 * @model unique="false"
	 * @generated
	 */
	Transition getTransition();

	/**
	 * Sets the value of the '{@link de.dc.javafx.xcore.workbench.lecture.TransitionElement#getTransition <em>Transition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transition</em>' attribute.
	 * @see de.dc.javafx.xcore.workbench.lecture.Transition
	 * @see #getTransition()
	 * @generated
	 */
	void setTransition(Transition value);

} // TransitionElement
