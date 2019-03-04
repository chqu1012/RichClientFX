package de.dc.emf.javafx.xtext.demo.chart.chart;

import javafx.geometry.*;
import javafx.scene.chart.*;
public class BudgetChart extends LineChart<Number, Number> {

	public BudgetChart() {
		super(new NumberAxis(), new NumberAxis());
		setLegendSide(Side.BOTTOM);
		setLegendVisible(true);
		setTitle(" ");		
		setTitleSide(Side.BOTTOM);
		
		getXAxis().setLabel("");
		getYAxis().setLabel("");
	}
}
