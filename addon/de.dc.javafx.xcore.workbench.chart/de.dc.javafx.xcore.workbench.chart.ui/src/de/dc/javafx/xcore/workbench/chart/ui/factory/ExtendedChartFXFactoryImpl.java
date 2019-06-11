package de.dc.javafx.xcore.workbench.chart.ui.factory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import de.dc.javafx.xcore.workbench.chart.ChartPackage;
import de.dc.javafx.xcore.workbench.chart.impl.ChartFactoryImpl;

public class ExtendedChartFXFactoryImpl extends ChartFactoryImpl implements ExtendedChartFXFactory {

	public static ExtendedChartFXFactory init() {
		try {
			ExtendedChartFXFactory theResourceFactory = (ExtendedChartFXFactory) EPackage.Registry.INSTANCE
					.getEFactory(ChartPackage.eNS_URI);
			if (theResourceFactory != null) {
				return theResourceFactory;
			}
		} catch (Exception exception) {
		}
		return new ExtendedChartFXFactoryImpl();
	}

	// Todo: This Method is override from the base ModelFactoryImpl, because it doesn't support #create method for ids
	@Override
	public EObject create(int classifierId) {
		switch (classifierId) {
		case ChartPackage.XY_VALUE:
			return createXYValue();
		case ChartPackage.LINE_CHART_FX:
			return createLineChartFX();
		default:
			throw new IllegalArgumentException("The class '" + classifierId + "' is not a valid classifier, please enhanced the class "+getClass().getSimpleName()+"#create(classifierId) in switch case!");
		}
	}
}