package de.dc.javafx.xcore.lang.lib;

import java.util.List;

import de.dc.javafx.xcore.lang.lib.chart.CountryBarChart;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Parent;
import javafx.scene.chart.XYChart.Data;
import javafx.scene.chart.XYChart.Series;

public class CountryBarChartApplication extends AbstractApplication {

    final static String austria = "Austria";
    final static String brazil = "Brazil";
    final static String france = "France";
    final static String italy = "Italy";
    final static String usa = "USA";
	
	@Override
	protected Parent getRoot() {
		CountryBarChart chart = new CountryBarChart();
		chart.enabledThreshold(false);
		
		Series<String, Number> series2003 = chart.addSerie("2003");
		Series<String, Number> series2004 = chart.addSerie("2004");
		Series<String, Number> series2005 = chart.addSerie("2005");
		
		chart.addAllData(series2003, get2003DataList());
		chart.addAllData(series2004, get2004DataList());
		chart.addAllData(series2005, get2005DataList());
		
		return chart;
	}

	private List<Data<String, Number>> get2003DataList() {
		ObservableList<Data<String, Number>> dataList = FXCollections.observableArrayList();
		dataList.add(new Data<>(austria, 25601.34));
        dataList.add(new Data<>(brazil, 20148.82));
        dataList.add(new Data<>(france, 10000));
        dataList.add(new Data<>(italy, 35407.15));
        dataList.add(new Data<>(usa, 12000));    
		return dataList;
	}

	private List<Data<String, Number>> get2004DataList() {
		ObservableList<Data<String, Number>> dataList = FXCollections.observableArrayList();
		dataList.add(new Data<>(austria, 57401.85));
        dataList.add(new Data<>(brazil, 41941.19));
        dataList.add(new Data<>(france, 45263.37));
        dataList.add(new Data<>(italy, 117320.16));
        dataList.add(new Data<>(usa, 14845.27)); 
		return dataList;
	}
	
	private List<Data<String, Number>> get2005DataList() {
		ObservableList<Data<String, Number>> dataList = FXCollections.observableArrayList();
        dataList.add(new Data<>(austria, 45000.65));
        dataList.add(new Data<>(brazil, 44835.76));
        dataList.add(new Data<>(france, 18722.18));
        dataList.add(new Data<>(italy, 17557.31));
        dataList.add(new Data<>(usa, 92633.68));  
		return dataList;
	}

	public static void main(String[] args) {
		launch(args);
	}

}
