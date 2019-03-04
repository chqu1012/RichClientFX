/**
 */
package de.dc.emf.javafx.model.javafx.util;

import de.dc.emf.javafx.model.javafx.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.dc.emf.javafx.model.javafx.JavafxPackage
 * @generated
 */
public class JavafxAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static JavafxPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavafxAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = JavafxPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JavafxSwitch<Adapter> modelSwitch = new JavafxSwitch<Adapter>() {
		@Override
		public Adapter caseProjectFX(ProjectFX object) {
			return createProjectFXAdapter();
		}

		@Override
		public Adapter caseControlFX(ControlFX object) {
			return createControlFXAdapter();
		}

		@Override
		public Adapter caseTableColumnFX(TableColumnFX object) {
			return createTableColumnFXAdapter();
		}

		@Override
		public Adapter caseModelFX(ModelFX object) {
			return createModelFXAdapter();
		}

		@Override
		public Adapter caseAttributeFX(AttributeFX object) {
			return createAttributeFXAdapter();
		}

		@Override
		public Adapter caseBean(Bean object) {
			return createBeanAdapter();
		}

		@Override
		public Adapter caseDerivedBean(DerivedBean object) {
			return createDerivedBeanAdapter();
		}

		@Override
		public Adapter caseBinding(Binding object) {
			return createBindingAdapter();
		}

		@Override
		public Adapter caseBindingProperty(BindingProperty object) {
			return createBindingPropertyAdapter();
		}

		@Override
		public Adapter caseTableViewFX(TableViewFX object) {
			return createTableViewFXAdapter();
		}

		@Override
		public Adapter caseNamedElement(NamedElement object) {
			return createNamedElementAdapter();
		}

		@Override
		public Adapter caseFilteredElement(FilteredElement object) {
			return createFilteredElementAdapter();
		}

		@Override
		public Adapter caseChartFX(ChartFX object) {
			return createChartFXAdapter();
		}

		@Override
		public Adapter caseLineChartFX(LineChartFX object) {
			return createLineChartFXAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dc.emf.javafx.model.javafx.ProjectFX <em>Project FX</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dc.emf.javafx.model.javafx.ProjectFX
	 * @generated
	 */
	public Adapter createProjectFXAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dc.emf.javafx.model.javafx.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dc.emf.javafx.model.javafx.NamedElement
	 * @generated
	 */
	public Adapter createNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dc.emf.javafx.model.javafx.FilteredElement <em>Filtered Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dc.emf.javafx.model.javafx.FilteredElement
	 * @generated
	 */
	public Adapter createFilteredElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dc.emf.javafx.model.javafx.ChartFX <em>Chart FX</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dc.emf.javafx.model.javafx.ChartFX
	 * @generated
	 */
	public Adapter createChartFXAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dc.emf.javafx.model.javafx.LineChartFX <em>Line Chart FX</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dc.emf.javafx.model.javafx.LineChartFX
	 * @generated
	 */
	public Adapter createLineChartFXAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dc.emf.javafx.model.javafx.ControlFX <em>Control FX</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dc.emf.javafx.model.javafx.ControlFX
	 * @generated
	 */
	public Adapter createControlFXAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dc.emf.javafx.model.javafx.TableViewFX <em>Table View FX</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dc.emf.javafx.model.javafx.TableViewFX
	 * @generated
	 */
	public Adapter createTableViewFXAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dc.emf.javafx.model.javafx.TableColumnFX <em>Table Column FX</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dc.emf.javafx.model.javafx.TableColumnFX
	 * @generated
	 */
	public Adapter createTableColumnFXAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dc.emf.javafx.model.javafx.ModelFX <em>Model FX</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dc.emf.javafx.model.javafx.ModelFX
	 * @generated
	 */
	public Adapter createModelFXAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dc.emf.javafx.model.javafx.AttributeFX <em>Attribute FX</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dc.emf.javafx.model.javafx.AttributeFX
	 * @generated
	 */
	public Adapter createAttributeFXAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dc.emf.javafx.model.javafx.Bean <em>Bean</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dc.emf.javafx.model.javafx.Bean
	 * @generated
	 */
	public Adapter createBeanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dc.emf.javafx.model.javafx.DerivedBean <em>Derived Bean</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dc.emf.javafx.model.javafx.DerivedBean
	 * @generated
	 */
	public Adapter createDerivedBeanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dc.emf.javafx.model.javafx.Binding <em>Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dc.emf.javafx.model.javafx.Binding
	 * @generated
	 */
	public Adapter createBindingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dc.emf.javafx.model.javafx.BindingProperty <em>Binding Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dc.emf.javafx.model.javafx.BindingProperty
	 * @generated
	 */
	public Adapter createBindingPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //JavafxAdapterFactory
