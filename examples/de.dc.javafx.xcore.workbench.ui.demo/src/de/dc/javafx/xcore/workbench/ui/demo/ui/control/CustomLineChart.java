package de.dc.javafx.xcore.workbench.ui.demo.ui.control;

import de.dc.javafx.xcore.lang.lib.chart.BaseLineChart;
import javafx.scene.chart.Axis;
import javafx.scene.chart.NumberAxis;

public class CustomLineChart extends BaseLineChart{

	public CustomLineChart() {
		super(new NumberAxis(), new NumberAxis());
	}

	@Override
	protected String getChartTitle() {
		return "Test";
	}

	@Override
	protected String getYAxisTitle() {
		return "Value";
	}

	@Override
	protected String getXAxisTitle() {
		return "Months";
	}

}
