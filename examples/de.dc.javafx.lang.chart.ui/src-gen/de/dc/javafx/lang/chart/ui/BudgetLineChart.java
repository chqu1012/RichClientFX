package de.dc.javafx.lang.chart.ui;

import de.dc.javafx.xcore.lang.lib.chart.BaseLineChart;
import javafx.scene.chart.NumberAxis;

@SuppressWarnings("all")
public class BudgetLineChart extends BaseLineChart<Number, Number> {
  public BudgetLineChart() {
    super(new NumberAxis(), new NumberAxis());
  }
  
  @Override
  public String getChartTitle() {
    return "Budget Overview";
  }
  
  @Override
  public String getYAxisTitle() {
    return "Months";
  }
  
  @Override
  public String getXAxisTitle() {
    return "Values";
  }
}
