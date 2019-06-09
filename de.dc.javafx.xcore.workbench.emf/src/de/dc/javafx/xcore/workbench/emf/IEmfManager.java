package de.dc.javafx.xcore.workbench.emf;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.change.util.ChangeRecorder;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;

import de.dc.javafx.xcore.workbench.emf.command.CommandStackImpl;
import de.dc.javafx.xcore.workbench.emf.factory.ExtendedFactory;

public interface IEmfManager<T> {

	T getRoot();

	EditingDomain getEditingDomain();

	ComposedAdapterFactory getAdapterFactory();

	ChangeRecorder getChangeRecorder();

	CommandStackImpl getCommandStack();

	/**
	 * Get the instance of the generated model package, e.g. ModelPackage.eINSTANCE
	 * 
	 * @return
	 */
	EPackage getModelPackage();

	/**
	 * Get the instance of the extended generated model factory, the extended class
	 * ExtendedModelFactory.eINSTANCE is required for creating EObjects by
	 * classifierId, the base ModelFactory supported only EOBject creation via
	 * EClass.
	 * 
	 * ExtendedModelFactory extends ModelFactory implements ExtendedFactory
	 * 
	 * @return
	 */
	ExtendedFactory getExtendedModelFactory();
}