package de.dc.javafx.xcore.workbench.chart.ui.renderer;

import java.awt.BasicStroke;
import java.awt.Color;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

import org.eclipse.emf.common.util.EList;
import org.gillius.jfxutils.chart.ChartPanManager;
import org.gillius.jfxutils.chart.JFXChartUtil;

import com.orsoncharts.Chart3D;
import com.orsoncharts.Chart3DFactory;
import com.orsoncharts.Colors;
import com.orsoncharts.Range;
import com.orsoncharts.TitleAnchor;
import com.orsoncharts.axis.NumberAxis3D;
import com.orsoncharts.axis.NumberTickSelector;
import com.orsoncharts.axis.ValueAxis3D;
import com.orsoncharts.data.DefaultKeyedValues;
import com.orsoncharts.data.StandardPieDataset3D;
import com.orsoncharts.data.category.StandardCategoryDataset3D;
import com.orsoncharts.data.function.Function3D;
import com.orsoncharts.data.xyz.XYZSeries;
import com.orsoncharts.data.xyz.XYZSeriesCollection;
import com.orsoncharts.fx.Chart3DViewer;
import com.orsoncharts.graphics3d.Dimension3D;
import com.orsoncharts.graphics3d.ViewPoint3D;
import com.orsoncharts.label.StandardXYZLabelGenerator;
import com.orsoncharts.legend.LegendAnchor;
import com.orsoncharts.plot.CategoryPlot3D;
import com.orsoncharts.plot.XYZPlot;
import com.orsoncharts.renderer.GradientColorScale;
import com.orsoncharts.renderer.category.AreaRenderer3D;
import com.orsoncharts.renderer.xyz.ScatterXYZRenderer;
import com.orsoncharts.renderer.xyz.SurfaceRenderer;
import com.orsoncharts.util.Orientation;

import de.dc.javafx.xcore.lang.lib.chart.BaseAreaChart;
import de.dc.javafx.xcore.lang.lib.chart.BaseBarChart;
import de.dc.javafx.xcore.lang.lib.chart.BaseBubbleChart;
import de.dc.javafx.xcore.lang.lib.chart.BaseLineChart;
import de.dc.javafx.xcore.lang.lib.chart.BasePieChart;
import de.dc.javafx.xcore.lang.lib.chart.BaseScatterChart;
import de.dc.javafx.xcore.lang.lib.chart.BaseXYChart;
import de.dc.javafx.xcore.workbench.chart.AreaChart3dFX;
import de.dc.javafx.xcore.workbench.chart.AreaChartFX;
import de.dc.javafx.xcore.workbench.chart.BarChart3dFX;
import de.dc.javafx.xcore.workbench.chart.BarChartFX;
import de.dc.javafx.xcore.workbench.chart.BubbleChartFX;
import de.dc.javafx.xcore.workbench.chart.CategorySeriesFX;
import de.dc.javafx.xcore.workbench.chart.CategoryValueFX;
import de.dc.javafx.xcore.workbench.chart.ChartFXConfig;
import de.dc.javafx.xcore.workbench.chart.LineChart3dFX;
import de.dc.javafx.xcore.workbench.chart.LineChartFX;
import de.dc.javafx.xcore.workbench.chart.PieChart3dFX;
import de.dc.javafx.xcore.workbench.chart.PieChartFX;
import de.dc.javafx.xcore.workbench.chart.ScatterChart3dFX;
import de.dc.javafx.xcore.workbench.chart.ScatterChartFX;
import de.dc.javafx.xcore.workbench.chart.SeriesFX;
import de.dc.javafx.xcore.workbench.chart.StackedBarChart3dFX;
import de.dc.javafx.xcore.workbench.chart.SurfaceChart3dFX;
import de.dc.javafx.xcore.workbench.chart.XYChartFX;
import de.dc.javafx.xcore.workbench.chart.XYValueFX;
import de.dc.javafx.xcore.workbench.chart.XYZChartFX;
import de.dc.javafx.xcore.workbench.chart.XYZLineChart3dFX;
import de.dc.javafx.xcore.workbench.chart.XYZSeriesFX;
import de.dc.javafx.xcore.workbench.chart.XYZValueFX;
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
	private ScriptEngineManager scriptManager = new ScriptEngineManager();

	@Override
	public Node caseXYZLineChart3dFX(XYZLineChart3dFX object) {
		XYZSeriesCollection<String> dataset = new XYZSeriesCollection<>();
		for (XYZSeriesFX seriesFX : object.getSeries()) {
			String name = seriesFX.getName() == null ? "Serie "+object.getSeries().indexOf(seriesFX) : seriesFX.getName();
			XYZSeries<String> series = new XYZSeries<>(name);
			for (XYZValueFX valueFX : seriesFX.getValues()) {
				series.add(valueFX.getX(), valueFX.getY(), valueFX.getZ());
			}
			dataset.add(series);
		}
		String title = object.getName();
		String subtitle = "";
		String x = object.getXAxisLabel();
		String y = object.getYAxisLabel();
		String z = object.getZAxisLabel();
		Chart3D chart = Chart3DFactory.createXYZLineChart(title, subtitle, dataset, x, y, z);
		chart.setViewPoint(ViewPoint3D.createAboveRightViewPoint(40));
		chart.setAntiAlias(true);
		return new Chart3DViewer(chart);
	}

	@Override
	public Node caseXYZChartFX(XYZChartFX object) {
		XYZSeriesCollection<String> dataset = new XYZSeriesCollection<>();
		for (XYZSeriesFX seriesFX : object.getSeries()) {
			String name = seriesFX.getName() == null ? "Data "+object.getSeries().indexOf(seriesFX) : seriesFX.getName();
			XYZSeries<String> series = new XYZSeries<>(name);
			for (XYZValueFX valueFX : seriesFX.getValues()) {
				series.add(valueFX.getX(), valueFX.getY(), valueFX.getZ());
			}
			dataset.add(series);
		}
		String title = object.getName();
		String subtitle = "";
		String x = object.getXAxisLabel();
		String y = object.getYAxisLabel();
		String z = object.getZAxisLabel();
		Chart3D chart = Chart3DFactory.createXYZBarChart(title, subtitle, dataset, x, y, z);
		chart.setViewPoint(ViewPoint3D.createAboveRightViewPoint(40));
		chart.setAntiAlias(true);
		return new Chart3DViewer(chart);
	}

	@Override
	public Node caseSurfaceChart3dFX(SurfaceChart3dFX object) {
		ScriptEngine engine = scriptManager.getEngineByName("nashorn");
		Function3D function = (x, z) -> {
			engine.put("x", x);
			engine.put("z", z);
			try {
				return (double) engine.eval(object.getFunction());
			} catch (ScriptException e) {
				e.printStackTrace();
			}
			return -1;
		};

		String title = object.getName();
		String subtitle = object.getFunction();
		String x = object.getXAxisLabel();
		String y = object.getYAxisLabel();
		String z = object.getZAxisLabel();
		Chart3D chart = Chart3DFactory.createSurfaceChart(title, subtitle, function, x, y, z);
		XYZPlot plot = (XYZPlot) chart.getPlot();
		plot.setDimensions(new Dimension3D(10, 5, 10));
		ValueAxis3D xAxis = plot.getXAxis();
		xAxis.setRange(-Math.PI, Math.PI);
		ValueAxis3D zAxis = plot.getZAxis();
		zAxis.setRange(-Math.PI, Math.PI);
		SurfaceRenderer renderer = (SurfaceRenderer) plot.getRenderer();
		renderer.setDrawFaceOutlines(false);
		renderer.setColorScale(new GradientColorScale(new Range(-1.0, 1.0), Color.RED, Color.YELLOW));
		chart.setAntiAlias(true);
		return new Chart3DViewer(chart);
	}

	@Override
	public Node caseStackedBarChart3dFX(StackedBarChart3dFX object) {
		StandardCategoryDataset3D<String, String, String> dataset = new StandardCategoryDataset3D<>();

		object.getSeries().forEach(series -> {
			DefaultKeyedValues<String, Double> s = new DefaultKeyedValues<>();
			series.getValues().forEach(v -> s.put(v.getName(), v.getValue()));
			String name = series.getName() == null ? "Test " + object.getSeries().indexOf(series) : series.getName();
			String rowKey = series.getRowKey() == null ? "Row" : series.getRowKey();
			dataset.addSeriesAsRow(name, rowKey, s);
		});

		String title = "Stacked Bar Chart";
		String subtitle = "Put the data source here";
		Chart3D chart = Chart3DFactory.createStackedBarChart(title, subtitle, dataset, null, null, "Value");
		return new Chart3DViewer(chart);
	}

	@Override
	public Node caseScatterChart3dFX(ScatterChart3dFX object) {
		XYZSeriesCollection<String> dataset = new XYZSeriesCollection<>();
		for (XYZSeriesFX seriesFX : object.getSeries()) {
			String name = seriesFX.getName() == null ? "Test " + object.getSeries().indexOf(seriesFX)
					: seriesFX.getName();
			XYZSeries<String> series = new XYZSeries<>(name);
			for (XYZValueFX valueFX : seriesFX.getValues()) {
				series.add(valueFX.getX(), valueFX.getY(), valueFX.getZ());
			}
			dataset.add(series);
		}
		String title = object.getName();
		String subtitle = "";
		String xAxisLabel = "X";
		String yAxisLabel = "Y";
		String zAxisLabel = "Z";
		Chart3D chart = Chart3DFactory.createScatterChart(title, subtitle, dataset, xAxisLabel, yAxisLabel, zAxisLabel);
		XYZPlot plot = (XYZPlot) chart.getPlot();
		plot.setDimensions(new Dimension3D(10.0, 4.0, 4.0));
		plot.setLegendLabelGenerator(new StandardXYZLabelGenerator(StandardXYZLabelGenerator.COUNT_TEMPLATE));
		ScatterXYZRenderer renderer = (ScatterXYZRenderer) plot.getRenderer();
		renderer.setSize(0.15);
		renderer.setColors(Colors.createIntenseColors());
		chart.setViewPoint(ViewPoint3D.createAboveLeftViewPoint(40));
		return new Chart3DViewer(chart);
	}

	@Override
	public Node casePieChart3dFX(PieChart3dFX object) {
		StandardPieDataset3D<String> dataset = new StandardPieDataset3D<>();
		for (CategorySeriesFX seriesFX : object.getSeries()) {
			for (CategoryValueFX valueFX : seriesFX.getValues()) {
				dataset.add(valueFX.getName(), valueFX.getValue());
			}
		}

		String title = object.getName();
		String subtitile = "";
		Chart3D chart = Chart3DFactory.createPieChart(title, subtitile, dataset);
		chart.setTitleAnchor(TitleAnchor.TOP_LEFT);
		chart.setLegendPosition(LegendAnchor.BOTTOM_CENTER, Orientation.HORIZONTAL);
		return new Chart3DViewer(chart);
	}

	@Override
	public Node caseLineChart3dFX(LineChart3dFX object) {
		StandardCategoryDataset3D<String, String, String> dataset = new StandardCategoryDataset3D<>();
		EList<SeriesFX> series = object.getSeries();
		for (SeriesFX serieFX : series) {
			DefaultKeyedValues<String, Double> serie = new DefaultKeyedValues<>();
			for (XYValueFX valueFX : serieFX.getValues()) {
				serie.put(String.valueOf(valueFX.getX()), valueFX.getY());
			}
			String seriesName = serieFX.getName() == null ? "No name " + series.indexOf(serieFX) : serieFX.getName();
			dataset.addSeriesAsRow(seriesName, serie);
		}

		String title = object.getName();
		String subtitle = "";
		String valueAxisLabel = object.getXAxisLabel();
		Chart3D chart = Chart3DFactory.createLineChart(title, subtitle, dataset, null, null, valueAxisLabel);
		CategoryPlot3D plot = (CategoryPlot3D) chart.getPlot();
		plot.setDimensions(new Dimension3D(18, 8, 4));
		plot.getRowAxis().setVisible(false);
		NumberAxis3D valueAxis = (NumberAxis3D) plot.getValueAxis();
		valueAxis.setTickSelector(new NumberTickSelector(true));
		plot.getRenderer().setColors(Colors.createFancyDarkColors());
		chart.setViewPoint(ViewPoint3D.createAboveViewPoint(30));
		return new Chart3DViewer(chart);
	}

	@Override
	public Node caseBarChart3dFX(BarChart3dFX object) {
		StandardCategoryDataset3D<String, String, String> dataset = new StandardCategoryDataset3D<>();
		EList<SeriesFX> series = object.getSeries();
		for (SeriesFX serieFX : series) {
			DefaultKeyedValues<String, Double> serie = new DefaultKeyedValues<>();
			for (XYValueFX valueFX : serieFX.getValues()) {
				serie.put(String.valueOf(valueFX.getX()), valueFX.getY());
			}
			String seriesName = serieFX.getName() == null ? "No name " + series.indexOf(serieFX) : serieFX.getName();
			dataset.addSeriesAsRow(seriesName, serie);
		}

		Chart3D chart = Chart3DFactory.createBarChart(object.getName(), "", dataset, null, "Month", "Value");
		chart.setChartBoxColor(new Color(255, 255, 255, 127));
		chart.setLegendAnchor(LegendAnchor.BOTTOM_RIGHT);
		CategoryPlot3D plot = (CategoryPlot3D) chart.getPlot();
		plot.setGridlinePaintForValues(Color.BLACK);
		return new Chart3DViewer(chart);
	}

	@Override
	public Node caseAreaChart3dFX(AreaChart3dFX object) {
		StandardCategoryDataset3D<String, String, String> dataset = new StandardCategoryDataset3D<>();
		EList<SeriesFX> series = object.getSeries();
		for (SeriesFX serieFX : series) {
			DefaultKeyedValues<String, Double> serie = new DefaultKeyedValues<>();
			for (XYValueFX valueFX : serieFX.getValues()) {
				serie.put(String.valueOf(valueFX.getX()), valueFX.getY());
			}
			String name = serieFX.getName() == null ? "No Name " + series.indexOf(serieFX) : serieFX.getName();
			dataset.addSeriesAsRow(name, serie);
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
