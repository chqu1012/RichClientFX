package de.dc.emf.javafx.xtext.demo.chart.chart;

import javafx.geometry.*;
import javafx.scene.chart.*;
import java.util.*;

public class BaseBudgetChartOther extends LineChart<Number, Number> {

	public BaseBudgetChartOther() {
		super(new NumberAxis(), new NumberAxis());
		setLegendSide(Side.TOP);
		setLegendVisible(true);
		setTitle("Other Budget Chart");		
		setTitleSide(Side.TOP);
		
		getXAxis().setLabel("Budget");
		getYAxis().setLabel("Month");
	}
	
	public void createSeries(String name, List<Data<Number, Number>> list) {
		XYChart.Series<Number, Number> series = new XYChart.Series<Number, Number>();
        series.setName(name);		

        series.getData().addAll(list);
        getData().add(series);
	}
}
