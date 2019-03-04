package de.dc.emf.javafx.xtext.demo.chart.chart;

import javafx.geometry.*;
import javafx.scene.chart.*;
public class BudgetChartOther extends LineChart<Number, Number> {

	public BudgetChartOther() {
		super(new NumberAxis(), new NumberAxis());
		setLegendSide(Side.LEFT);
		setLegendVisible(true);
		setTitle("Other Budget Chart");		
		setTitleSide(Side.LEFT);
		
		getXAxis().setLabel("Budget");
		getYAxis().setLabel("Month");
	}
}
