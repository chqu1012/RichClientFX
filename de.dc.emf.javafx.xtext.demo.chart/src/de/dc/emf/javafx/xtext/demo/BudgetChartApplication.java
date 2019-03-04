package de.dc.emf.javafx.xtext.demo;

import de.dc.emf.javafx.xtext.demo.chart.chart.BudgetChart;
import javafx.scene.Parent;

public class BudgetChartApplication extends BaseChartApplication{

	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	protected Parent getRoot() {
		return new BudgetChart();
	}

}
