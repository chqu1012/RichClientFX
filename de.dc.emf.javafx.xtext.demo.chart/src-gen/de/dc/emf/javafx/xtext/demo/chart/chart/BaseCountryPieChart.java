package de.dc.emf.javafx.xtext.demo.chart.chart;

import javafx.geometry.Side;
import javafx.scene.chart.PieChart;

public class BaseCountryPieChart extends PieChart{

	public BaseCountryPieChart() {
		setLegendSide(Side.BOTTOM);
		setLegendVisible(true);
		setTitle("Hello Pie Chart FX");		
		setTitleSide(Side.TOP);
		
		setStartAngle(30);
	}
	
	public void addSlice(String category, double value) {
		getData().add(new Data(category, value));
	}
}
