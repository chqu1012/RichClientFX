package de.dc.javafx.xcore.workbench.command.ui.file;

import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EPackage;

import de.dc.javafx.xcore.workbench.command.CommandFactory;
import de.dc.javafx.xcore.workbench.command.CommandPackage;
import de.dc.javafx.xcore.workbench.command.EmfCommandHistory;
import de.dc.javafx.xcore.workbench.ui.file.EmfFile;

public class CommandFile extends EmfFile<EmfCommandHistory>{

	@Override
	protected EPackage getEPackageEInstance() {
		return CommandPackage.eINSTANCE;
	}

	@Override
	protected EFactory getEFactoryEInstance() {
		return CommandFactory.eINSTANCE;
	}

	@Override
	public String getExtension() {
		return "command";
	}

}
