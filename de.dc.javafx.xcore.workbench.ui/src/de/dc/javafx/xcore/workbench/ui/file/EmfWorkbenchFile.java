package de.dc.javafx.xcore.workbench.ui.file;

import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EPackage;

import de.dc.javafx.xcore.workbench.Workbench;
import de.dc.javafx.xcore.workbench.WorkbenchFactory;
import de.dc.javafx.xcore.workbench.WorkbenchPackage;
import de.dc.javafx.xcore.workbench.emf.file.EmfFile;

public class EmfWorkbenchFile extends EmfFile<Workbench>{

	@Override
	public EPackage getEPackageEInstance() {
		return WorkbenchPackage.eINSTANCE;
	}

	@Override
	public EFactory getEFactoryEInstance() {
		return WorkbenchFactory.eINSTANCE;
	}

	@Override
	public String getExtension() {
		return "workbench";
	}
}