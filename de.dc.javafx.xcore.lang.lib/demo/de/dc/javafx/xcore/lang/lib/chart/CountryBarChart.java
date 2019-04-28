package de.dc.javafx.xcore.lang.lib.chart;

import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;

public class CountryBarChart extends BaseBarChart<String, Number> {

	public CountryBarChart() {
		super(new CategoryAxis(), new NumberAxis());
	}

	@Override
	protected String getChartTitle() {
		return "Country Summary";
	}

	@Override
	protected String getYAxisTitle() {
		return "Value";
	}

	@Override
	protected String getXAxisTitle() {
		return "Country";
	}

}
