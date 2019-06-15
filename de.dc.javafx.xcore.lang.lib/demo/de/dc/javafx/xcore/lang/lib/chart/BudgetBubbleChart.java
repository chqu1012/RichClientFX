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
	public String getTitle() {
		return "Budget Overview BubbleChart";
	}

	@Override
	public String getyAxisLabel() {
		return "Product Budget";
	}

	@Override
	public String getxAxisLabel() {
		return "Weeks";
	}

}
