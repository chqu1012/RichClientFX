package de.dc.javafx.xcore.lang.lib.chart;

import javafx.scene.chart.NumberAxis;

public class BudgetBubbleChart extends BaseBubbleChart<Number, Number> {

	public BudgetBubbleChart() {
		super(new NumberAxis(), new NumberAxis());
		
		if (yAxis instanceof NumberAxis) {
			NumberAxis axis = (NumberAxis) yAxis;
			axis.setTickLabelFormatter(new NumberAxis.DefaultFormatter(axis,"$ ",null));
		}
		
		chart.setAlternativeColumnFillVisible(true);
		chart.setAlternativeRowFillVisible(true);
	}

	@Override
	protected String getChartTitle() {
		return "Budget Overview BubbleChart";
	}

	@Override
	protected String getYAxisTitle() {
		return "Product Budget";
	}

	@Override
	protected String getXAxisTitle() {
		return "Weeks";
	}

}
