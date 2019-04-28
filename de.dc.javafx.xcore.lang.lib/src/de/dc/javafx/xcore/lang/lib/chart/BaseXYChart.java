package de.dc.javafx.xcore.lang.lib.chart;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.geometry.Point2D;
import javafx.scene.Cursor;
import javafx.scene.Node;
import javafx.scene.chart.Axis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.chart.XYChart.Data;
import javafx.scene.chart.XYChart.Series;
import javafx.scene.control.Label;
import javafx.scene.effect.DropShadow;
import javafx.scene.input.MouseButton;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Path;
import javafx.scene.shape.Rectangle;

public abstract class BaseXYChart<X, Y> extends StackPane {

	protected XYChart<X, Y> chart;
	protected Map<String, Series<X, Y>> series = new HashMap<>();
	protected DropShadow ds = new DropShadow();

	final double SCALE_DELTA = 1.1;
	private Rectangle zoomRect;
	protected Axis<X> xAxis;
	protected Axis<Y> yAxis;

	public BaseXYChart(Axis<X> xAxis, Axis<Y> yAxis) {
		this.xAxis = xAxis;
		this.yAxis = yAxis;
		chart = getChart(xAxis, yAxis);
		xAxis.setLabel(getXAxisTitle());
		yAxis.setLabel(getYAxisTitle());

		chart.setTitle(getChartTitle());

		zoomRect = new Rectangle();
		zoomRect.setManaged(false);
		zoomRect.setFill(Color.LIGHTSEAGREEN.deriveColor(0, 1, 1, 0.5));

		xAxis.setAutoRanging(true);
		yAxis.setAutoRanging(true);

		setUpZooming(zoomRect);

		chart.setOnMouseClicked(e -> {
			if (e.getButton().equals(MouseButton.SECONDARY)) {
				xAxis.setAutoRanging(true);
				yAxis.setAutoRanging(true);
			}else {
				doZoom(zoomRect);
			}
		});
		
		getChildren().addAll(chart, zoomRect);

		ds.setColor(Color.LIGHTGRAY);
		ds.setSpread(0.5);
	}

	protected abstract XYChart<X, Y> getChart(Axis<X> xAxis, Axis<Y> yAxis);

	protected abstract String getChartTitle();

	protected abstract String getYAxisTitle();

	protected abstract String getXAxisTitle();

	private void setUpZooming(final Rectangle rect) {
		final ObjectProperty<Point2D> mouseAnchor = new SimpleObjectProperty<>();
		chart.setOnMousePressed(event -> {
			mouseAnchor.set(new Point2D(event.getX(), event.getY()));
			rect.setWidth(0);
			rect.setHeight(0);
		});
		chart.setOnMouseDragged(event -> {
			double x = event.getX();
			double y = event.getY();
			rect.setX(Math.min(x, mouseAnchor.get().getX()));
			rect.setY(Math.min(y, mouseAnchor.get().getY()));
			rect.setWidth(Math.abs(x - mouseAnchor.get().getX()));
			rect.setHeight(Math.abs(y - mouseAnchor.get().getY()));
		});
	}

	private void doZoom(Rectangle zoomRect) {
		Point2D zoomTopLeft = new Point2D(zoomRect.getX(), zoomRect.getY());
		Point2D zoomBottomRight = new Point2D(zoomRect.getX() + zoomRect.getWidth(),
				zoomRect.getY() + zoomRect.getHeight());
		final NumberAxis yAxis = (NumberAxis) chart.getYAxis();
		Point2D yAxisInScene = yAxis.localToScene(0, 0);
		final NumberAxis xAxis = (NumberAxis) chart.getXAxis();
		Point2D xAxisInScene = xAxis.localToScene(0, 0);

		xAxis.setAutoRanging(false);
		yAxis.setAutoRanging(false);

		double xOffset = zoomTopLeft.getX() - yAxisInScene.getX();
		double yOffset = zoomBottomRight.getY() - xAxisInScene.getY();
		double xAxisScale = xAxis.getScale();
		double yAxisScale = yAxis.getScale();
		xAxis.setLowerBound(xAxis.getLowerBound() + xOffset / xAxisScale);
		xAxis.setUpperBound(xAxis.getLowerBound() + zoomRect.getWidth() / xAxisScale);
		yAxis.setLowerBound(yAxis.getLowerBound() + yOffset / yAxisScale);
		yAxis.setUpperBound(yAxis.getLowerBound() - zoomRect.getHeight() / yAxisScale);
		zoomRect.setWidth(0);
		zoomRect.setHeight(0);
	}

	public Series<X, Y> addSerie(String name) {
		Series<X, Y> serie = new Series<X, Y>();
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
}
