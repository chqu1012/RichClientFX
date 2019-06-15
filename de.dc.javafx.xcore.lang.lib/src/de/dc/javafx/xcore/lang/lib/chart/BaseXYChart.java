package de.dc.javafx.xcore.lang.lib.chart;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javafx.scene.Cursor;
import javafx.scene.Node;
import javafx.scene.chart.Axis;
import javafx.scene.chart.XYChart;
import javafx.scene.chart.XYChart.Data;
import javafx.scene.chart.XYChart.Series;
import javafx.scene.control.Label;
import javafx.scene.effect.DropShadow;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Path;

public abstract class BaseXYChart<X, Y> extends StackPane {

	protected XYChart<X, Y> chart;
	protected Map<String, Series<X, Y>> series = new HashMap<>();
	protected DropShadow ds = new DropShadow();

	static final double SCALE_DELTA = 1.1;
	protected Axis<X> xAxis;
	protected Axis<Y> yAxis;
	protected boolean enabledThreshold = true;
	
	protected String title;
	protected String xAxisLabel;
	protected String yAxisLabel;
	
	public BaseXYChart(Axis<X> xAxis, Axis<Y> yAxis) {
		this.xAxis = xAxis;
		this.yAxis = yAxis;
		chart = getChart(xAxis, yAxis);
		xAxis.setLabel(getXAxisTitle());
		yAxis.setLabel(getYAxisTitle());

		chart.setTitle(getChartTitle());

		getChildren().add(chart);
		
		ds.setColor(Color.LIGHTGRAY);
		ds.setSpread(0.5);
	}

	protected abstract XYChart<X, Y> getChart(Axis<X> xAxis, Axis<Y> yAxis);

	protected abstract String getChartTitle();

	protected abstract String getYAxisTitle();

	protected abstract String getXAxisTitle();
	
	public void enabledThreshold(boolean enableThreshold) {
		this.enabledThreshold = enableThreshold;
	}

	public Series<X, Y> addSerie(String name) {
		Series<X, Y> serie = new Series<>();
		serie.setName(name);

		chart.getData().add(serie);
		darkenSeriesOnHover(serie);
		series.put(name, serie);
		return serie;
	}

	public Series<X, Y> findSeriesByName(String name) {
		return series.get(name);
	}

	public void addData(Series<X, Y> serie, Data<X, Y> data) {
		if (enabledThreshold) {
			data.setNode(new HoveredThresholdNode(data.getXValue().toString(), data.getYValue().toString()));
		}
		serie.getData().add(data);
	}

	public void addAllData(Series<X, Y> serie, List<Data<X, Y>> dataList) {
		if (enabledThreshold) {
			dataList.stream()
			.forEach(e -> e.setNode(new HoveredThresholdNode(e.getXValue().toString(), e.getYValue().toString())));
		}
		serie.getData().addAll(dataList);
	}

	private void darkenSeriesOnHover(Series<X, Y> series) {
		Node seriesNode = series.getNode();
		if (seriesNode instanceof Path) {
			seriesNode.setOnMouseEntered(arg0 -> {
				seriesNode.setEffect(ds);
				seriesNode.setCursor(Cursor.HAND);
			});
			seriesNode.setOnMouseExited(arg0 -> {
				seriesNode.setEffect(null);
				seriesNode.setCursor(Cursor.DEFAULT);
			});
		}
	}

	class HoveredThresholdNode extends StackPane {
		HoveredThresholdNode(String priorValue, String value) {
			setPrefSize(10, 10);
			Label label = new Label(value + " | " + priorValue);
			label.getStyleClass().addAll("default-color0", "chart-line-symbol", "chart-series-line");
			label.setStyle("-fx-font-size: 20; -fx-font-weight: bold;");
			label.setTextFill(Color.FIREBRICK);
			label.setMinSize(Label.USE_PREF_SIZE, Label.USE_PREF_SIZE);
			setOnMouseEntered(mouseEvent -> {
				getChildren().setAll(label);
				setCursor(Cursor.NONE);
				toFront();
			});
			setOnMouseExited(mouseEvent -> {
				getChildren().clear();
				setCursor(Cursor.CROSSHAIR);
			});
		}
	}
	
	public XYChart<X, Y> getChart() {
		return chart;
	}
	
	public Axis<X> getXAxis() {
		return xAxis;
	}

	public Axis<Y> getYAxis() {
		return yAxis;
	}
}
