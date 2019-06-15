package de.dc.javafx.xcore.lang.lib.chart;

import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;

public class BudgetLineChart extends BaseLineChart<String, Number>{

	public BudgetLineChart() {
		super(new CategoryAxis(), new NumberAxis());
	}

	@Override
	public String getTitle() {
		return "Budget Overview";
	}

	@Override
	public String getyAxisLabel() {
		return "Values";
	}

	@Override
	public String getxAxisLabel() {
		return "Month";
	}

}
