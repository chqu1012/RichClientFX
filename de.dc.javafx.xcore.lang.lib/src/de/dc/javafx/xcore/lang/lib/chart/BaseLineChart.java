package de.dc.javafx.xcore.lang.lib.chart;

import javafx.scene.chart.Axis;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.XYChart;

public abstract class BaseLineChart<X, Y> extends BaseXYChart<X, Y> {

	public BaseLineChart(Axis<X> xAxis, Axis<Y> yAxis) {
		super(xAxis, yAxis);
	}

	@Override
	protected XYChart<X, Y> getChart(Axis<X> xAxis, Axis<Y> yAxis) {
		return new LineChart<X, Y>(xAxis, yAxis);
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setXAxisLabel(String xAxisLabel) {
		this.xAxisLabel = xAxisLabel;
	}

	public void setYAxisLabel(String yAxisLabel) {
		this.yAxisLabel = yAxisLabel;
	}

	@Override
	protected String getChartTitle() {
		return title;
	}

	@Override
	protected String getYAxisTitle() {
		return yAxisLabel;
	}

	@Override
	protected String getXAxisTitle() {
		return xAxisLabel;
	}

}