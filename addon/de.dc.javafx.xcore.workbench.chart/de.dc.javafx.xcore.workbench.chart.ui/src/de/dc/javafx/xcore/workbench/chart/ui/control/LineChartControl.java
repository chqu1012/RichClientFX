package de.dc.javafx.xcore.workbench.chart.ui.control;

import de.dc.javafx.xcore.lang.lib.chart.BaseLineChart;
import javafx.scene.chart.Axis;

public class LineChartControl extends BaseLineChart<Number, Number>{

	public LineChartControl(Axis<Number> xAxis, Axis<Number> yAxis) {
		super(xAxis, yAxis);
	}
}
