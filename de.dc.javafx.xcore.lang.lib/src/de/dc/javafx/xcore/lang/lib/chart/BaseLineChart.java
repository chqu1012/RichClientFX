package de.dc.javafx.xcore.lang.lib.chart;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javafx.scene.Cursor;
import javafx.scene.Node;
import javafx.scene.chart.Axis;
import javafx.scene.chart.LineChart;
import javafx.scene.control.Label;
import javafx.scene.effect.DropShadow;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Path;

public abstract class BaseLineChart<X, Y> extends LineChart<X, Y> {

	protected Map<String, Series<X, Y>> series = new HashMap<>();
	protected DropShadow ds = new DropShadow();
	
	public BaseLineChart(Axis<X> xAxis, Axis<Y> yAxis) {
		super(xAxis, yAxis);
		xAxis.setLabel(getXAxisTitle());
		yAxis.setLabel(getYAxisTitle());

		setTitle(getChartTitle());
		
		ds.setColor(Color.LIGHTGRAY);
		ds.setSpread(0.5);
	}

	protected abstract String getChartTitle();

	protected abstract String getYAxisTitle();

	protected abstract String getXAxisTitle();

	public Series<X, Y> addSerie(String name) {
		Series<X, Y> serie = new Series<X, Y>();
		serie.setName(name);

		getData().add(serie);
		darkenSeriesOnHover(serie);
		series.put(name, serie);
		return serie;
	}

	public Series<X, Y> findSeriesByName(String name) {
		return series.get(name);
	}

	public void addData(Series<X, Y> serie, Data<X, Y> data) {
		data.setNode(new HoveredThresholdNode(data.getXValue().toString(), data.getYValue().toString()));
		serie.getData().add(data);
	}

	public void addAllData(Series<X, Y> serie, List<Data<X, Y>> dataList) {
		dataList.stream()
				.forEach(e -> e.setNode(new HoveredThresholdNode(e.getXValue().toString(), e.getYValue().toString())));
		serie.getData().addAll(dataList);
	}

	private void darkenSeriesOnHover(Series<X, Y> series) {
		Node seriesNode = series.getNode();
		if (seriesNode != null && seriesNode instanceof Path) {
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
			setPrefSize(15, 15);
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
}
