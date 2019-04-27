package de.dc.javafx.xcore.lang.lib;

import java.util.List;
import java.util.Random;

import de.dc.javafx.xcore.lang.lib.chart.BudgetLineChart;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Parent;
import javafx.scene.chart.XYChart.Data;
import javafx.scene.chart.XYChart.Series;

public class BudgetLineChartApplication extends AbstractApplication {

	@Override
	protected Parent getRoot() {
		BudgetLineChart chart = new BudgetLineChart();
		Series<String, Number> timiLee = chart.addSerie("Timi Lee");
		Series<String, Number> paulWander = chart.addSerie("Paul Wander");
		Series<String, Number> annaBeta = chart.addSerie("Anna Beta");
		
		chart.addAllData(timiLee, getTimiLeeDataList());
		chart.addAllData(paulWander, getPaulWanderDataList());
		chart.addAllData(annaBeta, getAnnaBetaDataList());
		
		return chart;
	}

	private Random random = new Random();
	
	private List<Data<String, Number>> getTimiLeeDataList() {
		ObservableList<Data<String, Number>> dataList = FXCollections.observableArrayList();
		String[] months = {"Jan", "Feb", "Mar", "Apr", "Mai", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
		for (String month : months) {
			dataList.add(new Data<String, Number>(month, random.nextDouble()));
		}
		return dataList;
	}

	private List<Data<String, Number>> getPaulWanderDataList() {
		ObservableList<Data<String, Number>> dataList = FXCollections.observableArrayList();
		String[] months = {"Jan", "Feb", "Mar", "Apr", "Mai", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
		for (String month : months) {
			dataList.add(new Data<String, Number>(month, random.nextDouble()));
		}
		return dataList;
	}
	
	private List<Data<String, Number>> getAnnaBetaDataList() {
		ObservableList<Data<String, Number>> dataList = FXCollections.observableArrayList();
		String[] months = {"Jan", "Feb", "Mar", "Apr", "Mai", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
		for (String month : months) {
			dataList.add(new Data<String, Number>(month, random.nextDouble()));
		}
		return dataList;
	}

	public static void main(String[] args) {
		launch(args);
	}

}
