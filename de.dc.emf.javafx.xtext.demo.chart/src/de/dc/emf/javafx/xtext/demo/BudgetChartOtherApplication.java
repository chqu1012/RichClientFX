package de.dc.emf.javafx.xtext.demo;

import de.dc.emf.javafx.xtext.demo.chart.chart.BudgetChartOther;
import javafx.scene.Parent;

public class BudgetChartOtherApplication extends BaseChartApplication{

	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	protected Parent getRoot() {
		return new BudgetChartOther();
	}

}
