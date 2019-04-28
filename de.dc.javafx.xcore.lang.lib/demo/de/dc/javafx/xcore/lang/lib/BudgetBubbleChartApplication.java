package de.dc.javafx.xcore.lang.lib;

import java.util.List;

import de.dc.javafx.xcore.lang.lib.chart.BudgetBubbleChart;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Parent;
import javafx.scene.chart.XYChart.Data;
import javafx.scene.chart.XYChart.Series;

public class BudgetBubbleChartApplication extends AbstractApplication {

	@Override
	protected Parent getRoot() {
		BudgetBubbleChart chart = new BudgetBubbleChart();
		Series<Number, Number> product1 = chart.addSerie("Product 1");
		Series<Number, Number> product2 = chart.addSerie("Product 2");
		
		chart.addAllData(product1, getProduct1List());
		chart.addAllData(product2, getProduct2List());
		
		return chart;
	}

	private List<Data<Number, Number>> getProduct1List() {
		ObservableList<Data<Number, Number>> dataList = FXCollections.observableArrayList();
		dataList.add(new Data<Number, Number>(3, 35));
		dataList.add(new Data<Number, Number>(12, 60));
		dataList.add(new Data<Number, Number>(15, 15));
		dataList.add(new Data<Number, Number>(22, 30));
		dataList.add(new Data<Number, Number>(28, 20));
		dataList.add(new Data<Number, Number>(35, 41));
		dataList.add(new Data<Number, Number>(42, 17));
		dataList.add(new Data<Number, Number>(49, 30));
		return dataList;
	}

	private List<Data<Number, Number>> getProduct2List() {
		ObservableList<Data<Number, Number>> dataList = FXCollections.observableArrayList();
		dataList.add(new Data<Number, Number>(8, 15));
		dataList.add(new Data<Number, Number>(13, 23));
		dataList.add(new Data<Number, Number>(15, 45));
		dataList.add(new Data<Number, Number>(24, 30));
		dataList.add(new Data<Number, Number>(38, 78));
		dataList.add(new Data<Number, Number>(40, 41));
		dataList.add(new Data<Number, Number>(45, 57));
		dataList.add(new Data<Number, Number>(47, 23));
		return dataList;
	}

	public static void main(String[] args) {
		launch(args);
	}

}
