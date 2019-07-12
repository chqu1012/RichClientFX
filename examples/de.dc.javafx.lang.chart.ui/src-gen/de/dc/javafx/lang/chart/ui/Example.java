package de.dc.javafx.lang.chart.ui;

import de.dc.javafx.xcore.lang.lib.chart.BaseLineChart;
import javafx.scene.chart.NumberAxis;

@SuppressWarnings("all")
public class Example extends BaseLineChart<Number, Number> {
  public Example() {
    super(new NumberAxis(), new NumberAxis());
  }
  
  @Override
  public String getChartTitle() {
    return "Example";
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
