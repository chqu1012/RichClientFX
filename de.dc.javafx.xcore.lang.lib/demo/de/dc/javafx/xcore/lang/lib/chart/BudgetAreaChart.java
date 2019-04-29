package de.dc.javafx.xcore.lang.lib.chart;

import javafx.scene.chart.NumberAxis;

public class BudgetAreaChart extends BaseAreaChart<Number, Number> {

	public BudgetAreaChart() {
		super(new NumberAxis(), new NumberAxis());
	}

	@Override
	protected String getChartTitle() {
		return "Budget Overview AreaChart";
	}

	@Override
	protected String getYAxisTitle() {
		return "Months";
	}

	@Override
	protected String getXAxisTitle() {
		return "Values";
	}
}
