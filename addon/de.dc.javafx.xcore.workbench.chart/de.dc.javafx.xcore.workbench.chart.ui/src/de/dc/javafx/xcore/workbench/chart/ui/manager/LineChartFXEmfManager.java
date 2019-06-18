package de.dc.javafx.xcore.workbench.chart.ui.manager;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EPackage;

import de.dc.javafx.xcore.workbench.chart.ChartFactory;
import de.dc.javafx.xcore.workbench.chart.ChartPackage;
import de.dc.javafx.xcore.workbench.chart.SeriesFX;
import de.dc.javafx.xcore.workbench.chart.provider.ChartItemProviderAdapterFactory;
import de.dc.javafx.xcore.workbench.chart.ui.file.ChartFXFile;
import de.dc.javafx.xcore.workbench.emf.AbstractEmfManager;
import de.dc.javafx.xcore.workbench.emf.file.IEmfFile;

public class LineChartFXEmfManager extends AbstractEmfManager<SeriesFX> {
	
	@Override
	protected SeriesFX initModel() {
		return ChartFactory.eINSTANCE.createSeriesFX();
	}

	@Override
	protected SeriesFX createNewModelOnNullCheck() {
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
	protected AdapterFactory getModelItemProviderAdapterFactory() {
		return new ChartItemProviderAdapterFactory();
	}

	@Override
	public IEmfFile initFile() {
		return new ChartFXFile();
	}
}