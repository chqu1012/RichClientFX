package de.dc.javafx.xcore.lang.lib.chart;

import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;

public class CountryBarChart extends BaseBarChart<String, Number> {

	public CountryBarChart() {
		super(new CategoryAxis(), new NumberAxis());
	}

	@Override
	public String getTitle() {
		return "Country Summary";
	}

	@Override
	public String getyAxisLabel() {
		return "Value";
	}

	@Override
	public String getxAxisLabel() {
		return "Country";
	}

}
