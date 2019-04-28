package de.dc.javafx.xcore.lang.lib.chart;

import javafx.scene.chart.NumberAxis;

public class BudgetLineChart2 extends BaseLineChart<Number, Number>{

	public BudgetLineChart2() {
		super(new NumberAxis(), new NumberAxis());
		
		setStyle("-fx-background-color: white");
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
