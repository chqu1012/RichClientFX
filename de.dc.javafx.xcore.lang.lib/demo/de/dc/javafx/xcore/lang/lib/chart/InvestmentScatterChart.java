package de.dc.javafx.xcore.lang.lib.chart;

import javafx.scene.chart.NumberAxis;

public class InvestmentScatterChart extends BaseScatterChart<Number, Number> {

	public InvestmentScatterChart() {
		super(new NumberAxis(), new NumberAxis());
	}

	@Override
	protected String getChartTitle() {
		return "Investment Overview";
	}

	@Override
	protected String getYAxisTitle() {
		return "Returns to date";
	}

	@Override
	protected String getXAxisTitle() {
		return "Age (years)";
	}

}
