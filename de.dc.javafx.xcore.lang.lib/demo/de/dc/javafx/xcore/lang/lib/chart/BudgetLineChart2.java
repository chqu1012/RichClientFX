package de.dc.javafx.xcore.lang.lib.chart;

import javafx.scene.chart.NumberAxis;

public class BudgetLineChart2 extends BaseLineChart<Number, Number>{

	public BudgetLineChart2() {
		super(new NumberAxis(), new NumberAxis());
		
		setStyle("-fx-background-color: white");
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
