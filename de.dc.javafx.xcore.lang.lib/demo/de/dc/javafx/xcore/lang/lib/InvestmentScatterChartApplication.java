package de.dc.javafx.xcore.lang.lib;

import java.util.List;

import de.dc.javafx.xcore.lang.lib.chart.InvestmentScatterChart;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Parent;
import javafx.scene.chart.XYChart.Data;
import javafx.scene.chart.XYChart.Series;

public class InvestmentScatterChartApplication extends AbstractApplication {

	@Override
	protected Parent getRoot() {
		InvestmentScatterChart chart = new InvestmentScatterChart();
		Series<Number, Number> equities = chart.addSerie("Equities");
		Series<Number, Number> mutualFunds = chart.addSerie("Mutual Funds");
		
		chart.addAllData(equities, getEquitiesList());
		chart.addAllData(mutualFunds, getMutualFundsDataList());
		return chart;
	}

	private List<Data<Number, Number>> getEquitiesList() {
		ObservableList<Data<Number, Number>> dataList = FXCollections.observableArrayList();
		dataList.add(new Data<>(4.2, 193.2));
        dataList.add(new Data<>(2.8, 33.6));
        dataList.add(new Data<>(6.2, 24.8));
        dataList.add(new Data<>(1, 14));
        dataList.add(new Data<>(1.2, 26.4));
        dataList.add(new Data<>(4.4, 114.4));
        dataList.add(new Data<>(8.5, 323));
        dataList.add(new Data<>(6.9, 289.8));
        dataList.add(new Data<>(9.9, 287.1));
        dataList.add(new Data<>(0.9, -9));
        dataList.add(new Data<>(3.2, 150.8));
        dataList.add(new Data<>(4.8, 20.8));
        dataList.add(new Data<>(7.3, -42.3));
        dataList.add(new Data<>(1.8, 81.4));
        dataList.add(new Data<>(7.3, 110.3));
        dataList.add(new Data<>(2.7, 41.2));
		return dataList;
	}

	private List<Data<Number, Number>> getMutualFundsDataList() {
		ObservableList<Data<Number, Number>> dataList = FXCollections.observableArrayList();
		dataList.add(new Data<>(5.2, 229.2));
        dataList.add(new Data<>(2.4, 37.6));
        dataList.add(new Data<>(3.2, 49.8));
        dataList.add(new Data<>(1.8, 134));
        dataList.add(new Data<>(3.2, 236.2));
        dataList.add(new Data<>(7.4, 114.1));
        dataList.add(new Data<>(3.5, 323));
        dataList.add(new Data<>(9.3, 29.9));
        dataList.add(new Data<>(8.1, 287.4));
		return dataList;
	}
	
		public static void main(String[] args) {
		launch(args);
	}

}
