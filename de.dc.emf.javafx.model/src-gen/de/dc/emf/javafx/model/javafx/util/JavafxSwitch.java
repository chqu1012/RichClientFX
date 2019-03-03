/**
 */
package de.dc.emf.javafx.model.javafx.util;

import de.dc.emf.javafx.model.javafx.*;

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
 * @see de.dc.emf.javafx.model.javafx.JavafxPackage
 * @generated
 */
public class JavafxSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static JavafxPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavafxSwitch() {
		if (modelPackage == null) {
			modelPackage = JavafxPackage.eINSTANCE;
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
		case JavafxPackage.PROJECT_FX: {
			ProjectFX projectFX = (ProjectFX) theEObject;
			T result = caseProjectFX(projectFX);
			if (result == null)
				result = caseNamedElement(projectFX);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case JavafxPackage.CONTROL_FX: {
			ControlFX controlFX = (ControlFX) theEObject;
			T result = caseControlFX(controlFX);
			if (result == null)
				result = caseNamedElement(controlFX);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case JavafxPackage.TABLE_COLUMN_FX: {
			TableColumnFX tableColumnFX = (TableColumnFX) theEObject;
			T result = caseTableColumnFX(tableColumnFX);
			if (result == null)
				result = caseNamedElement(tableColumnFX);
			if (result == null)
				result = caseFilteredElement(tableColumnFX);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case JavafxPackage.MODEL_FX: {
			ModelFX modelFX = (ModelFX) theEObject;
			T result = caseModelFX(modelFX);
			if (result == null)
				result = caseNamedElement(modelFX);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case JavafxPackage.ATTRIBUTE_FX: {
			AttributeFX attributeFX = (AttributeFX) theEObject;
			T result = caseAttributeFX(attributeFX);
			if (result == null)
				result = caseNamedElement(attributeFX);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case JavafxPackage.BEAN: {
			Bean bean = (Bean) theEObject;
			T result = caseBean(bean);
			if (result == null)
				result = caseModelFX(bean);
			if (result == null)
				result = caseNamedElement(bean);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case JavafxPackage.DERIVED_BEAN: {
			DerivedBean derivedBean = (DerivedBean) theEObject;
			T result = caseDerivedBean(derivedBean);
			if (result == null)
				result = caseModelFX(derivedBean);
			if (result == null)
				result = caseNamedElement(derivedBean);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case JavafxPackage.BINDING: {
			Binding binding = (Binding) theEObject;
			T result = caseBinding(binding);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case JavafxPackage.BINDING_PROPERTY: {
			BindingProperty bindingProperty = (BindingProperty) theEObject;
			T result = caseBindingProperty(bindingProperty);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case JavafxPackage.TABLE_VIEW_FX: {
			TableViewFX tableViewFX = (TableViewFX) theEObject;
			T result = caseTableViewFX(tableViewFX);
			if (result == null)
				result = caseControlFX(tableViewFX);
			if (result == null)
				result = caseFilteredElement(tableViewFX);
			if (result == null)
				result = caseNamedElement(tableViewFX);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case JavafxPackage.NAMED_ELEMENT: {
			NamedElement namedElement = (NamedElement) theEObject;
			T result = caseNamedElement(namedElement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case JavafxPackage.FILTERED_ELEMENT: {
			FilteredElement filteredElement = (FilteredElement) theEObject;
			T result = caseFilteredElement(filteredElement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Project FX</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Project FX</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProjectFX(ProjectFX object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedElement(NamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Filtered Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Filtered Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFilteredElement(FilteredElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Control FX</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Control FX</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseControlFX(ControlFX object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Table View FX</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Table View FX</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTableViewFX(TableViewFX object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Table Column FX</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Table Column FX</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTableColumnFX(TableColumnFX object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model FX</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model FX</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelFX(ModelFX object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute FX</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute FX</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttributeFX(AttributeFX object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bean</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bean</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBean(Bean object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Derived Bean</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Derived Bean</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDerivedBean(DerivedBean object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBinding(Binding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binding Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binding Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBindingProperty(BindingProperty object) {
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

} //JavafxSwitch
