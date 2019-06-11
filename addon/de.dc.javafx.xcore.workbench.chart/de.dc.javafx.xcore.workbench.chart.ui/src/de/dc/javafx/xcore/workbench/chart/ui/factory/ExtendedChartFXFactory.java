package de.dc.javafx.xcore.workbench.chart.ui.factory;
import de.dc.javafx.xcore.workbench.chart.ChartFactory;
import de.dc.javafx.xcore.workbench.emf.factory.ExtendedFactory;

public interface ExtendedChartFXFactory extends ChartFactory, ExtendedFactory {

	ExtendedChartFXFactory eINSTANCE = ExtendedChartFXFactoryImpl.init();
}