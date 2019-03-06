package de.dc.emf.javafx.xtext.demo.chart.chart;

import javafx.geometry.*;
import javafx.scene.chart.*;
import java.util.*;

public class BaseStudentsOverviewChart extends LineChart<Number, Number> {

	public BaseStudentsOverviewChart() {
		super(new NumberAxis(), new NumberAxis());
		setLegendSide(Side.BOTTOM);
		setLegendVisible(true);
		setTitle("Students in the year 2019");		
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
