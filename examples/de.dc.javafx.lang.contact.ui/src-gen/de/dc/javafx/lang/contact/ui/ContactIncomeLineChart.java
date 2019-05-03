package de.dc.javafx.lang.contact.ui;

import de.dc.javafx.xcore.lang.lib.chart.BaseLineChart;
import javafx.scene.chart.NumberAxis;

@SuppressWarnings("all")
public class ContactIncomeLineChart extends BaseLineChart<Number, Number> {
  public ContactIncomeLineChart() {
    super(new NumberAxis(), new NumberAxis());
  }
  
  @Override
  public String getChartTitle() {
    return "Contact Income";
  }
  
  @Override
  public String getYAxisTitle() {
    return "Values";
  }
  
  @Override
  public String getXAxisTitle() {
    return "Months";
  }
}
