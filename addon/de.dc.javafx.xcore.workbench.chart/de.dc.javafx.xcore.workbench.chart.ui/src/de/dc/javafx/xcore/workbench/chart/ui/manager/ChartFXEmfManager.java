package de.dc.javafx.xcore.workbench.chart.ui.manager;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EPackage;

import de.dc.javafx.xcore.workbench.chart.ChartFactory;
import de.dc.javafx.xcore.workbench.chart.ChartPackage;
import de.dc.javafx.xcore.workbench.chart.ChartProject;
import de.dc.javafx.xcore.workbench.chart.provider.ChartItemProviderAdapterFactory;
import de.dc.javafx.xcore.workbench.chart.ui.file.ChartFXFile;
import de.dc.javafx.xcore.workbench.emf.AbstractEmfManager;
import de.dc.javafx.xcore.workbench.emf.file.IEmfFile;

public class ChartFXEmfManager extends AbstractEmfManager<ChartProject> {
	@Override
	protected AdapterFactory getModelItemProviderAdapterFactory() {
		return new ChartItemProviderAdapterFactory();
	}

	@Override
	protected ChartProject initModel() {
		return ChartFactory.eINSTANCE.createChartProject();
	}

	@Override
	protected ChartProject createNewModelOnNullCheck() {
		return initModel();
	}

	@Override
	public EPackage getModelPackage() {
		return ChartPackage.eINSTANCE;
	}

	@Override
	public EFactory getExtendedModelFactory() {
		return ChartFactory.eINSTANCE;
	}

	@Override
	public IEmfFile<ChartProject> initFile() {
		return new ChartFXFile();
	}
}