package de.dc.javafx.lang.chart.ui;

import de.dc.javafx.xcore.lang.lib.chart.BaseLineChart;
import javafx.scene.chart.NumberAxis;

@SuppressWarnings("all")
public class SchoolLineChart extends BaseLineChart<Number, Number> {
  public SchoolLineChart() {
    super(new NumberAxis(), new NumberAxis());
  }
  
  @Override
  public String getChartTitle() {
    return "SchoolLineChart";
  }
  
  @Override
  public String getYAxisTitle() {
    return "";
  }
  
  @Override
  public String getXAxisTitle() {
    return "";
  }
}
