package de.dc.javafx.xcore.lang.ide.templates;

import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class ChartTemplate {
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
