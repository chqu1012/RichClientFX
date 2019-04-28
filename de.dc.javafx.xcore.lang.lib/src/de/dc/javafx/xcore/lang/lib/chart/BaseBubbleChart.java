package de.dc.javafx.xcore.lang.lib.chart;

import javafx.scene.chart.Axis;
import javafx.scene.chart.BubbleChart;
import javafx.scene.chart.XYChart;

public abstract class BaseBubbleChart<X,Y> extends BaseXYChart<X, Y> {

	public BaseBubbleChart(Axis<X> xAxis, Axis<Y> yAxis) {
		super(xAxis, yAxis);
	}

	@Override
	protected XYChart<X, Y> getChart(Axis<X> xAxis, Axis<Y> yAxis) {
		return new BubbleChart<>(xAxis, yAxis);
	}

}
