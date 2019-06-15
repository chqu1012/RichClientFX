package de.dc.javafx.xcore.lang.lib.chart;

import javafx.scene.chart.NumberAxis;

public class InvestmentScatterChart extends BaseScatterChart<Number, Number> {

	public InvestmentScatterChart() {
		super(new NumberAxis(), new NumberAxis());
	}

	@Override
	public String getTitle() {
		return "Investment Overview";
	}

	@Override
	public String getyAxisLabel() {
		return "Returns to date";
	}

	@Override
	public String getxAxisLabel() {
		return "Age (years)";
	}

}
