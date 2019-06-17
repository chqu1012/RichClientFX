package de.dc.javafx.xcore.workbench.chart.ui.renderer;

import java.awt.BasicStroke;
import java.awt.Color;

import org.gillius.jfxutils.chart.ChartPanManager;
import org.gillius.jfxutils.chart.JFXChartUtil;

import com.orsoncharts.Chart3D;
import com.orsoncharts.Chart3DFactory;
import com.orsoncharts.data.DefaultKeyedValues;
import com.orsoncharts.data.category.StandardCategoryDataset3D;
import com.orsoncharts.fx.Chart3DViewer;
import com.orsoncharts.plot.CategoryPlot3D;
import com.orsoncharts.renderer.category.AreaRenderer3D;
import com.orsoncharts.style.ChartStyle;
import com.orsoncharts.style.StandardChartStyle;
import com.orsoncharts.table.RectanglePainter;
import com.orsoncharts.table.StandardRectanglePainter;

import de.dc.javafx.xcore.lang.lib.chart.BaseAreaChart;
import de.dc.javafx.xcore.lang.lib.chart.BaseBarChart;
import de.dc.javafx.xcore.lang.lib.chart.BaseBubbleChart;
import de.dc.javafx.xcore.lang.lib.chart.BaseLineChart;
import de.dc.javafx.xcore.lang.lib.chart.BasePieChart;
import de.dc.javafx.xcore.lang.lib.chart.BaseScatterChart;
import de.dc.javafx.xcore.lang.lib.chart.BaseXYChart;
import de.dc.javafx.xcore.workbench.chart.AreaChart3DFX;
import de.dc.javafx.xcore.workbench.chart.AreaChartFX;
import de.dc.javafx.xcore.workbench.chart.BarChartFX;
import de.dc.javafx.xcore.workbench.chart.BubbleChartFX;
import de.dc.javafx.xcore.workbench.chart.CategorySeriesFX;
import de.dc.javafx.xcore.workbench.chart.CategoryValueFX;
import de.dc.javafx.xcore.workbench.chart.ChartFXConfig;
import de.dc.javafx.xcore.workbench.chart.LineChartFX;
import de.dc.javafx.xcore.workbench.chart.PieChartFX;
import de.dc.javafx.xcore.workbench.chart.ScatterChartFX;
import de.dc.javafx.xcore.workbench.chart.SeriesFX;
import de.dc.javafx.xcore.workbench.chart.XYChartFX;
import de.dc.javafx.xcore.workbench.chart.XYValueFX;
import de.dc.javafx.xcore.workbench.chart.util.ChartSwitch;
import javafx.geometry.Side;
import javafx.scene.Node;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.Chart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.chart.XYChart.Series;
import javafx.scene.input.MouseButton;

public class ChartFXRenderer extends ChartSwitch<Node> {

	private Chart currentChart;

	@Override
	public Node caseAreaChart3DFX(AreaChart3DFX object) {
		StandardCategoryDataset3D<String, String, String> dataset = new StandardCategoryDataset3D<>();
		for (SeriesFX serieFX : object.getSeries()) {
			DefaultKeyedValues<String, Double> serie = new DefaultKeyedValues<>();
			for (XYValueFX valueFX : serieFX.getValues()) {
				serie.put(String.valueOf(valueFX.getX()), valueFX.getY());
			}
			dataset.addSeriesAsRow(serieFX.getName(), serie);
		}

		String xAxisLabel = object.getXAxisLabel();
		String yAxisLabel = object.getYAxisLabel();
		String zAxisLabel = object.getZAxisLabel();
		String subtitle = "";
		Chart3D chart = Chart3DFactory.createAreaChart(object.getName(), subtitle, dataset, xAxisLabel, yAxisLabel,
				zAxisLabel);
		chart.setChartBoxColor(new Color(255, 255, 255, 128));
		CategoryPlot3D plot = (CategoryPlot3D) chart.getPlot();
		plot.getRowAxis().setVisible(false);
		plot.setGridlineStrokeForValues(
				new BasicStroke(0.5f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND, 4.0f, new float[] { 2f, 2f }, 0f));
		AreaRenderer3D renderer = (AreaRenderer3D) plot.getRenderer();
		renderer.setBaseColor(Color.darkGray);

		return new Chart3DViewer(chart);
	}

	@Override
	public Node caseBarChartFX(BarChartFX object) {
		BaseBarChart<String, Number> chart = new BaseBarChart<>(new CategoryAxis(), new NumberAxis());
		currentChart = chart.getChart();
		caseChartFXConfig(object.getConfig());
		for (CategorySeriesFX s : object.getSeries()) {
			Series<String, Number> series = chart.addSerie(s.getName());
			for (CategoryValueFX item : s.getValues()) {
				series.getData().add(new XYChart.Data<String, Number>(String.valueOf(item.getName()), item.getValue()));
			}
		}
		return chart;
	}

	@Override
	public Node casePieChartFX(PieChartFX object) {
		BasePieChart chart = new BasePieChart();
		currentChart = chart;
		caseChartFXConfig(object.getConfig());
		for (CategorySeriesFX s : object.getSeries()) {
			for (CategoryValueFX value : s.getValues()) {
				chart.add(value.getName(), value.getValue());
			}
		}
		return chart;
	}

	@Override
	public Node caseBubbleChartFX(BubbleChartFX object) {
		BaseBubbleChart<Number, Number> chart = new BaseBubbleChart<>(new NumberAxis(), new NumberAxis());
		currentChart = chart.getChart();
		initChart(object, chart);
		return chart;
	}

	@Override
	public Node caseScatterChartFX(ScatterChartFX object) {
		BaseScatterChart<Number, Number> chart = new BaseScatterChart<>(new NumberAxis(), new NumberAxis());
		currentChart = chart.getChart();
		initChart(object, chart);
		return chart;
	}

	@Override
	public Node caseAreaChartFX(AreaChartFX object) {
		BaseAreaChart<Number, Number> chart = new BaseAreaChart<>(new NumberAxis(), new NumberAxis());
		currentChart = chart.getChart();
		initChart(object, chart);
		return chart;
	}

	private void initChart(XYChartFX object, BaseXYChart<Number, Number> chart) {
		caseChartFXConfig(object.getConfig());
		initSeries(object, chart);
		enablePanning(true);
		enableZooming(true);
	}

	private void initSeries(XYChartFX object, BaseXYChart<Number, Number> chart) {
		for (SeriesFX seriesFX : object.getSeries()) {
			Series<Number, Number> series = chart.addSerie(seriesFX.getName());
			for (XYValueFX item : seriesFX.getValues()) {
				series.getData().add(new XYChart.Data<Number, Number>(item.getX(), item.getY()));
			}
		}
	}

	@Override
	public Node caseLineChartFX(LineChartFX object) {
		BaseLineChart<Number, Number> chart = new BaseLineChart<>(new NumberAxis(), new NumberAxis());
		currentChart = chart.getChart();
		initChart(object, chart);
		return chart;
	}

	private void enablePanning(boolean enabled) {
		if (currentChart instanceof XYChart && enabled) {
			XYChart<Object, Object> xyChart = (XYChart) currentChart;
			ChartPanManager panner = new ChartPanManager(xyChart);
			panner.setMouseFilter(mouseEvent -> {
				if (mouseEvent.getButton() == MouseButton.SECONDARY
						|| (mouseEvent.getButton() == MouseButton.PRIMARY && mouseEvent.isShortcutDown())) {
				} else {
					mouseEvent.consume();
				}
			});
			panner.start();
		}
	}

	private void enableZooming(boolean enabled) {
		if (currentChart instanceof XYChart && enabled) {
			XYChart<Object, Object> xyChart = (XYChart) currentChart;
			JFXChartUtil.setupZooming(xyChart, mouseEvent -> {
				if (mouseEvent.getButton() != MouseButton.PRIMARY || mouseEvent.isShortcutDown())
					mouseEvent.consume();
			});
			JFXChartUtil.addDoublePrimaryClickAutoRangeHandler(xyChart);
		}
	}

	@Override
	public Node caseChartFXConfig(ChartFXConfig config) {
		if (config != null) {
			currentChart.setLegendVisible(config.isShowLegend());
			currentChart.setLegendSide(Side.valueOf(config.getSideLegend().getName()));
			currentChart.setTitleSide(Side.valueOf(config.getTitleSide().getName()));
			if (currentChart instanceof XYChart) {
				XYChart<Object, Object> xyChart = (XYChart) currentChart;
				xyChart.setAlternativeColumnFillVisible(config.isAlternativeColumnFillVisible());
				xyChart.setAlternativeRowFillVisible(config.isAlternativeRowFillVisible());
				xyChart.setHorizontalGridLinesVisible(config.isHorizontalGridLinesVisible());
				xyChart.setHorizontalZeroLineVisible(config.isHorizontalZeroLinesVisible());
				xyChart.setVerticalGridLinesVisible(config.isVerticalGridLinesVisible());
				xyChart.setVerticalZeroLineVisible(config.isVerticalZeroLinesVisible());
			}
		}
		return currentChart;
	}
}
