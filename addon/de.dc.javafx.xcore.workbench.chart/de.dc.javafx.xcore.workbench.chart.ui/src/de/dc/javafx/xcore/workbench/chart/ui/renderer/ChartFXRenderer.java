package de.dc.javafx.xcore.workbench.chart.ui.renderer;

import org.gillius.jfxutils.chart.ChartPanManager;
import org.gillius.jfxutils.chart.JFXChartUtil;

import de.dc.javafx.xcore.workbench.chart.ChartFXConfig;
import de.dc.javafx.xcore.workbench.chart.LineChartFX;
import de.dc.javafx.xcore.workbench.chart.SeriesFX;
import de.dc.javafx.xcore.workbench.chart.XYValueFX;
import de.dc.javafx.xcore.workbench.chart.ui.control.LineChartControl;
import de.dc.javafx.xcore.workbench.chart.util.ChartSwitch;
import javafx.geometry.Side;
import javafx.scene.Node;
import javafx.scene.chart.Chart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.chart.XYChart.Series;
import javafx.scene.input.MouseButton;

public class ChartFXRenderer extends ChartSwitch<Node> {

	private Chart chart;

	@Override
	public Node caseLineChartFX(LineChartFX object) {
		LineChartControl control = new LineChartControl(new NumberAxis(), new NumberAxis());
		chart = control.getChart();
		control.setTitle(object.getName());
		control.setXAxisLabel(object.getXAxisLabel());
		control.setYAxisLabel(object.getYAxisLabel());

		for (SeriesFX seriesFX : object.getSeries()) {
			Series<Number, Number> series = control.addSerie(seriesFX.getName());
			for (XYValueFX item : seriesFX.getValues()) {
				Double x = Double.parseDouble(item.getX());
				Double y = Double.parseDouble(item.getY());
				series.getData().add(new XYChart.Data<Number, Number>(x, y));
			}
		}

		enablePanning(true);
		enableZooming(true);
		caseChartFXConfig(object.getConfig());
		return chart;
	}

	private void enablePanning(boolean enabled) {
		if (chart instanceof XYChart && enabled) {
			XYChart<Object, Object> xyChart = (XYChart) chart;
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
		if (chart instanceof XYChart && enabled) {
			XYChart<Object, Object> xyChart = (XYChart) chart;
			JFXChartUtil.setupZooming(xyChart, mouseEvent -> {
				if (mouseEvent.getButton() != MouseButton.PRIMARY || mouseEvent.isShortcutDown())
					mouseEvent.consume();
			});
			JFXChartUtil.addDoublePrimaryClickAutoRangeHandler(xyChart);
		}
	}

	@Override
	public Node caseChartFXConfig(ChartFXConfig config) {
		if (config!=null) {
			chart.setLegendVisible(config.isShowLegend());
			chart.setLegendSide(Side.valueOf(config.getSideLegend().getName()));
			chart.setTitleSide(Side.valueOf(config.getTitleSide().getName()));
			if (chart instanceof XYChart) {
				XYChart<Object, Object> xyChart = (XYChart) chart;
				xyChart.setAlternativeColumnFillVisible(config.isAlternativeColumnFillVisible());
				xyChart.setAlternativeRowFillVisible(config.isAlternativeRowFillVisible());
				xyChart.setHorizontalGridLinesVisible(config.isHorizontalGridLinesVisible());
				xyChart.setHorizontalZeroLineVisible(config.isHorizontalZeroLinesVisible());
				xyChart.setVerticalGridLinesVisible(config.isVerticalGridLinesVisible());
				xyChart.setVerticalZeroLineVisible(config.isVerticalZeroLinesVisible());
			}
		}
		return chart;
	}
}
