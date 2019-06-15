package de.dc.javafx.xcore.workbench.chart.ui.file;

import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EPackage;

import de.dc.javafx.xcore.workbench.chart.ChartFactory;
import de.dc.javafx.xcore.workbench.chart.ChartPackage;
import de.dc.javafx.xcore.workbench.chart.ChartProject;
import de.dc.javafx.xcore.workbench.emf.file.EmfFile;

public class ChartFXFile extends EmfFile<ChartProject>{

	@Override
	public EPackage getEPackageEInstance() {
		return ChartPackage.eINSTANCE;
	}

	@Override
	public EFactory getEFactoryEInstance() {
		return ChartFactory.eINSTANCE;
	}

	@Override
	public String getExtension() {
		return "chart";
	}

}
