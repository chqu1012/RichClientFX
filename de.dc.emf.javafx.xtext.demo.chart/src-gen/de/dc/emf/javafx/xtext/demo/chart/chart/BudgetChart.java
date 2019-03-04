package de.dc.emf.javafx.xtext.demo.chart.chart;

import javafx.geometry.*;
import javafx.scene.chart.*;
import java.util.*;

public class BudgetChart extends LineChart<Number, Number> {

	public BudgetChart() {
		super(new NumberAxis(), new NumberAxis());
		setLegendSide(Side.BOTTOM);
		setLegendVisible(true);
		setTitle(" ");		
		setTitleSide(Side.TOP);
		
		getXAxis().setLabel("");
		getYAxis().setLabel("");
	}
	
	public void createSeries(String name, List<Data<Number, Number>> list) {
		XYChart.Series<Number, Number> series = new XYChart.Series<Number, Number>();
        series.setName(name);		

        series.getData().addAll(list);
        getData().add(series);
	}
}