package de.dc.javafx.xcore.lang.lib.chart;

import javafx.scene.chart.AreaChart;
import javafx.scene.chart.Axis;
import javafx.scene.chart.XYChart;

public class BaseAreaChart<X, Y> extends BaseXYChart<X, Y> {

	public BaseAreaChart(Axis<X> xAxis, Axis<Y> yAxis) {
		super(xAxis, yAxis);
	}

	@Override
	protected XYChart<X, Y> getChart(Axis<X> xAxis, Axis<Y> yAxis) {
		if (chart==null) {
			chart = new AreaChart<>(xAxis, yAxis);
		}
		return chart;
	}
}
