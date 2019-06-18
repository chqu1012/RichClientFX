package de.dc.javafx.xcore.workbench.command.ui.manager;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EPackage;

import de.dc.javafx.xcore.workbench.command.CommandFactory;
import de.dc.javafx.xcore.workbench.command.CommandPackage;
import de.dc.javafx.xcore.workbench.command.EmfCommandHistory;
import de.dc.javafx.xcore.workbench.command.provider.CommandItemProviderAdapterFactory;
import de.dc.javafx.xcore.workbench.command.ui.file.CommandFile;
import de.dc.javafx.xcore.workbench.emf.AbstractEmfManager;
import de.dc.javafx.xcore.workbench.emf.file.IEmfFile;

public class CommandEmfManager extends AbstractEmfManager<EmfCommandHistory> {
	@Override
	protected AdapterFactory getModelItemProviderAdapterFactory() {
		return new CommandItemProviderAdapterFactory();
	}

	@Override
	protected EmfCommandHistory initModel() {
		return CommandFactory.eINSTANCE.createEmfCommandHistory();
	}

	@Override
	protected EmfCommandHistory createNewModelOnNullCheck() {
		return initModel();
	}

	@Override
	public EPackage getModelPackage() {
		return CommandPackage.eINSTANCE;
	}

	@Override
	public EFactory getExtendedModelFactory() {
		return CommandFactory.eINSTANCE;
	}

	@Override
	public IEmfFile<EmfCommandHistory> initFile() {
		return new CommandFile();
	}
}