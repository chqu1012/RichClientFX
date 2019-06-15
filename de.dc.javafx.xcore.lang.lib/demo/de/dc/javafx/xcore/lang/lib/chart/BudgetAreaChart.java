package de.dc.javafx.xcore.lang.lib.chart;

import javafx.scene.chart.NumberAxis;

public class BudgetAreaChart extends BaseAreaChart<Number, Number> {

	public BudgetAreaChart() {
		super(new NumberAxis(), new NumberAxis());
	}

	@Override
	public String getTitle() {
		return "Budget Overview AreaChart";
	}

	@Override
	public String getxAxisLabel() {
		return "Months";
	}
	

	@Override
	public String getyAxisLabel() {
		return "Values";
	}
}
