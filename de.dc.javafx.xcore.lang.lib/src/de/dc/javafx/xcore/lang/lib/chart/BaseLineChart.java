package de.dc.javafx.xcore.lang.lib.chart;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javafx.scene.chart.Axis;
import javafx.scene.chart.LineChart;

public abstract class BaseLineChart<X, Y> extends LineChart<X, Y> {

	protected Map<String, Series<X,Y>> series = new HashMap<>();
	
	public BaseLineChart(Axis<X> xAxis, Axis<Y> yAxis) {
		super(xAxis, yAxis);
        xAxis.setLabel(getXAxisTitle());
        yAxis.setLabel(getYAxisTitle());

        setTitle(getChartTitle());
	}
	
	protected abstract String getChartTitle();

	protected abstract String getYAxisTitle();

	protected abstract String getXAxisTitle();

	public Series<X, Y> addSerie(String name) {
		Series<X, Y> serie = new Series<X, Y>();
		serie.setName(name);
		
		getData().add(serie);
		series.put(name, serie);
		return serie;
	}
	
	public Series<X, Y> findSeriesByName(String name){
		return series.get(name);
	}
	
	public void addData(Series<X, Y> serie, Data<X,Y> data) {
		serie.getData().add(data);
	}

	public void addAllData(Series<X, Y> serie, List<Data<X,Y>> dataList) {
		serie.getData().addAll(dataList);
	}
}
