package de.dc.javafx.xcore.workbench.chart.ui.manager;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EPackage;

import de.dc.javafx.xcore.workbench.chart.ChartFactory;
import de.dc.javafx.xcore.workbench.chart.ChartPackage;
import de.dc.javafx.xcore.workbench.chart.ChartProject;
import de.dc.javafx.xcore.workbench.chart.provider.ChartItemProviderAdapterFactory;
import de.dc.javafx.xcore.workbench.chart.ui.factory.ExtendedChartFXFactory;
import de.dc.javafx.xcore.workbench.emf.AbstractEmfManager;
import de.dc.javafx.xcore.workbench.emf.factory.ExtendedFactory;

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
	public ExtendedFactory getExtendedModelFactory() {
		return ExtendedChartFXFactory.eINSTANCE;
	}
}