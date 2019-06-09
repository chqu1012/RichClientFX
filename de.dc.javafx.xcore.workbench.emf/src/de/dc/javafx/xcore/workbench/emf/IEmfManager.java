package de.dc.javafx.xcore.workbench.emf;

import org.eclipse.emf.ecore.change.util.ChangeRecorder;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;

import de.dc.javafx.xcore.workbench.emf.command.CommandStackImpl;

public interface IEmfManager<T> {

	T getRoot();
	
	EditingDomain getEditingDomain();

	ComposedAdapterFactory getAdapterFactory();

	ChangeRecorder getChangeRecorder();
	
	CommandStackImpl getCommandStack();
	
}