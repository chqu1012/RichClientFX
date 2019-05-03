package de.dc.javafx.xcore.lang.ide.templates;

import de.dc.javafx.xcore.lang.ide.wizards.model.ChartModel;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class ChartTemplate {
  /**
   * {"PieChart", "AreaChart", "BarChart", "BubbleChart", "LineChart", "ScatterChart", "StackedAreaChart"}
   */
  public static String getTemplate(final ChartModel model) {
    final String chartName = model.getChartName();
    final String title = model.getTitle();
    final String xAxis = model.getxAxis();
    final String yAxis = model.getyAxis();
    final String packagePath = model.getPackagePath();
    int _chartType = model.getChartType();
    switch (_chartType) {
      case 0:
        return ChartTemplate.getPieChart(packagePath, chartName, title, xAxis, yAxis);
      case 1:
        return ChartTemplate.getAreaChart(packagePath, chartName, title, xAxis, yAxis);
      case 2:
        return ChartTemplate.getBarChart(packagePath, chartName, title, xAxis, yAxis);
      case 3:
        return ChartTemplate.getBubbleChart(packagePath, chartName, title, xAxis, yAxis);
      case 4:
        return ChartTemplate.getLineChart(packagePath, chartName, title, xAxis, yAxis);
      case 5:
        return ChartTemplate.getScatterChart(packagePath, chartName, title, xAxis, yAxis);
      case 6:
        return ChartTemplate.getStackedAreaChart(packagePath, chartName, title, xAxis, yAxis);
      case 7:
        return ChartTemplate.getDoughnutChart(packagePath, chartName, title, xAxis, yAxis);
      default:
        return "";
    }
  }
  
  public static String getPieChart(final String packagePath, final String chartName, final String title, final String xAxis, final String yAxis) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("packagePath \"");
    _builder.append(packagePath);
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("charts{");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("PieChartFX ");
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
  
  public static String getAreaChart(final String packagePath, final String chartName, final String title, final String xAxis, final String yAxis) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("packagePath \"");
    _builder.append(packagePath);
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("charts{");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("AreaChartFX ");
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
  
  public static String getBarChart(final String packagePath, final String chartName, final String title, final String xAxis, final String yAxis) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("packagePath \"");
    _builder.append(packagePath);
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("charts{");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("BarChartFX ");
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
  
  public static String getBubbleChart(final String packagePath, final String chartName, final String title, final String xAxis, final String yAxis) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("packagePath \"");
    _builder.append(packagePath);
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("charts{");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("BubbleChartFX ");
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
  
  public static String getScatterChart(final String packagePath, final String chartName, final String title, final String xAxis, final String yAxis) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("packagePath \"");
    _builder.append(packagePath);
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("charts{");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("ScatterChartFX ");
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
  
  public static String getStackedAreaChart(final String packagePath, final String chartName, final String title, final String xAxis, final String yAxis) {
    StringConcatenation _builder = new StringConcatenation();
    return _builder.toString();
  }
  
  public static String getDoughnutChart(final String packagePath, final String chartName, final String title, final String xAxis, final String yAxis) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("packagePath \"");
    _builder.append(packagePath);
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("charts{");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("DoughnutChartFX ");
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
  
  public static String getLineChart(final String packagePath, final String chartName, final String title, final String xAxis, final String yAxis) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("packagePath \"");
    _builder.append(packagePath);
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
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
