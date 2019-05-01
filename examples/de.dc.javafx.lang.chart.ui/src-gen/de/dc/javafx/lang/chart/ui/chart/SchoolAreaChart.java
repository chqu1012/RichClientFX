package de.dc.javafx.lang.chart.ui.chart;

import de.dc.javafx.xcore.lang.lib.chart.BaseAreaChart;
import javafx.scene.chart.NumberAxis;

@SuppressWarnings("all")
public class SchoolAreaChart extends BaseAreaChart<Number, Number> {
  public SchoolAreaChart() {
    super(new NumberAxis(), new NumberAxis());
  }
  
  @Override
  public String getChartTitle() {
    return "School Overview";
  }
  
  @Override
  public String getYAxisTitle() {
    return "Values";
  }
  
  @Override
  public String getXAxisTitle() {
    return "Pupils";
  }
}
