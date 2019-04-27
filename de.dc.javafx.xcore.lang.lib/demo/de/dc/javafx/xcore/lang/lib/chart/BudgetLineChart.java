package de.dc.javafx.xcore.lang.lib.chart;

import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;

public class BudgetLineChart extends BaseLineChart<String, Number>{

	public BudgetLineChart() {
		super(new CategoryAxis(), new NumberAxis());
	}

	@Override
	protected String getChartTitle() {
		return "Budget Overview";
	}

	@Override
	protected String getYAxisTitle() {
		return "Values";
	}

	@Override
	protected String getXAxisTitle() {
		return "Month";
	}

}
