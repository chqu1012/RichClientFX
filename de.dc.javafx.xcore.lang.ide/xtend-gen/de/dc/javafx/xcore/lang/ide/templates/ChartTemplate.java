package de.dc.javafx.xcore.lang.ide.templates;

import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class ChartTemplate {
  /**
   * {"PieChart", "AreaChart", "BarChart", "BubbleChart", "LineChart", "ScatterChart", "StackedAreaChart"}
   */
  public static String getTemplate(final int chartType, final String chartName, final String title, final String xAxis, final String yAxis) {
    switch (chartType) {
      case 0:
        return ChartTemplate.getPieChart(chartName, title, xAxis, yAxis);
      case 1:
        return ChartTemplate.getAreaChart(chartName, title, xAxis, yAxis);
      case 2:
        return ChartTemplate.getBarChart(chartName, title, xAxis, yAxis);
      case 3:
        return ChartTemplate.getBubbleChart(chartName, title, xAxis, yAxis);
      case 4:
        return ChartTemplate.getLineChart(chartName, title, xAxis, yAxis);
      case 5:
        return ChartTemplate.getScatterChart(chartName, title, xAxis, yAxis);
      case 6:
        return ChartTemplate.getStackedAreaChart(chartName, title, xAxis, yAxis);
      case 7:
        return ChartTemplate.getDoughnutChart(chartName, title, xAxis, yAxis);
      default:
        return "";
    }
  }
  
  public static String getPieChart(final String chartName, final String title, final String xAxis, final String yAxis) {
    StringConcatenation _builder = new StringConcatenation();
    return _builder.toString();
  }
  
  public static String getAreaChart(final String chartName, final String title, final String xAxis, final String yAxis) {
    StringConcatenation _builder = new StringConcatenation();
    return _builder.toString();
  }
  
  public static String getBarChart(final String chartName, final String title, final String xAxis, final String yAxis) {
    StringConcatenation _builder = new StringConcatenation();
    return _builder.toString();
  }
  
  public static String getBubbleChart(final String chartName, final String title, final String xAxis, final String yAxis) {
    StringConcatenation _builder = new StringConcatenation();
    return _builder.toString();
  }
  
  public static String getScatterChart(final String chartName, final String title, final String xAxis, final String yAxis) {
    StringConcatenation _builder = new StringConcatenation();
    return _builder.toString();
  }
  
  public static String getStackedAreaChart(final String chartName, final String title, final String xAxis, final String yAxis) {
    StringConcatenation _builder = new StringConcatenation();
    return _builder.toString();
  }
  
  public static String getDoughnutChart(final String chartName, final String title, final String xAxis, final String yAxis) {
    StringConcatenation _builder = new StringConcatenation();
    return _builder.toString();
  }
  
  public static String getLineChart(final String chartName, final String title, final String xAxis, final String yAxis) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("packagePath \"packagePath\"");
    _builder.newLine();
    _builder.newLine();
    _builder.append("charts{");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("LineChartFX ");
    _builder.append(chartName, "\t");
    _builder.append("{");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("title \"");
    _builder.append(title, "\t\t");
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("xAxisLabel \"");
    _builder.append(xAxis, "\t\t");
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("yAxisLabel \"");
    _builder.append(yAxis, "\t\t");
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }
}
