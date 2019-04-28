package de.dc.javafx.xcore.lang.lib;

import de.dc.javafx.xcore.lang.lib.chart.FruitDoughnutChart;
import javafx.collections.FXCollections;
import javafx.scene.Parent;
import javafx.scene.chart.PieChart;

public class FruitDoughnutChartApplication extends AbstractApplication{

	@Override
	protected Parent getRoot() {
		FruitDoughnutChart chart = new FruitDoughnutChart();
		chart.addAll(FXCollections.observableArrayList(
                new PieChart.Data("Grapefruit", 13),
                new PieChart.Data("Oranges", 25),
                new PieChart.Data("Plums", 10),
                new PieChart.Data("Pears", 22),
                new PieChart.Data("Apples", 30)));
		return chart;
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
