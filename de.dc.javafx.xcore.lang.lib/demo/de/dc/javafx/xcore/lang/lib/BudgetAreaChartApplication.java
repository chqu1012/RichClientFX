package de.dc.javafx.xcore.lang.lib;

import java.util.List;
import java.util.Random;

import de.dc.javafx.xcore.lang.lib.chart.BudgetAreaChart;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Parent;
import javafx.scene.chart.XYChart.Data;
import javafx.scene.chart.XYChart.Series;

public class BudgetAreaChartApplication extends AbstractApplication {

	@Override
	protected Parent getRoot() {
		BudgetAreaChart chart = new BudgetAreaChart();
		Series<Number, Number> timiLee = chart.addSerie("Timi Lee");
		Series<Number, Number> paulWander = chart.addSerie("Paul Wander");
		Series<Number, Number> annaBeta = chart.addSerie("Anna Beta");
		
		chart.addAllData(timiLee, getTimiLeeDataList());
		chart.addAllData(paulWander, getPaulWanderDataList());
		chart.addAllData(annaBeta, getAnnaBetaDataList());
		return chart;
	}

	private Random random = new Random();
	
	private List<Data<Number, Number>> getTimiLeeDataList() {
		ObservableList<Data<Number, Number>> dataList = FXCollections.observableArrayList();
		for (int i = 0; i < 30; i++) {
			dataList.add(new Data<Number, Number>(i, random.nextDouble()));
		}
		return dataList;
	}

	private List<Data<Number, Number>> getPaulWanderDataList() {
		ObservableList<Data<Number, Number>> dataList = FXCollections.observableArrayList();
		for (int i = 0; i < 30; i++) {
			dataList.add(new Data<Number, Number>(i, random.nextDouble()));
		}
		return dataList;
	}
	
	private List<Data<Number, Number>> getAnnaBetaDataList() {
		ObservableList<Data<Number, Number>> dataList = FXCollections.observableArrayList();
		for (int i = 0; i < 30; i++) {
			dataList.add(new Data<Number, Number>(i, random.nextDouble()));
		}
		return dataList;
	}

	public static void main(String[] args) {
		launch(args);
	}

}
