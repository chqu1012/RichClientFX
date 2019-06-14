package de.dc.javafx.xcore.workbench.ui.demo.ui.preview;

import java.util.Random;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;

import de.dc.javafx.xcore.code.preview.ui.FXPreview;
import de.dc.javafx.xcore.workbench.chart.LineChartFX;
import de.dc.javafx.xcore.workbench.chart.SeriesFX;
import de.dc.javafx.xcore.workbench.chart.XYValueFX;
import de.dc.javafx.xcore.workbench.ui.demo.ui.control.CustomLineChart;
import de.dc.javafx.xcore.workbench.ui.demo.ui.control.ZoomableScrollPane;
import javafx.beans.value.ObservableValue;
import javafx.scene.chart.XYChart;
import javafx.scene.chart.XYChart.Series;
import javafx.scene.control.TreeItem;

public class ChartFXPreview extends FXPreview {

	private Random random = new Random();
	
	@Override
	public void changed(ObservableValue<? extends Object> obs, Object oldValue, Object newValue) {
		if (newValue instanceof TreeItem) {
			TreeItem treeItem = (TreeItem) newValue;
			Object value = treeItem.getValue();
			if (value instanceof EObject) {
				EObject eObject = EcoreUtil.getRootContainer((EObject) value);
				if (eObject instanceof LineChartFX) {
					LineChartFX chartFX = (LineChartFX) eObject;
					
					// creating the chart
					CustomLineChart lineChart = new CustomLineChart();
					ZoomableScrollPane pane = new ZoomableScrollPane(lineChart);
					
					lineChart.getChart().setTitle(chartFX.getName());
					lineChart.getXAxis().setLabel(chartFX.getXAxisLabel());
					lineChart.getYAxis().setLabel(chartFX.getYAxisLabel());
					
					for (SeriesFX seriesFX : chartFX.getSeries()) {
						Series<Number, Number> series = lineChart.addSerie(seriesFX.getName());
						for (XYValueFX item : seriesFX.getValues()) {
							Double x = Double.parseDouble(item.getX());
							Double y = Double.parseDouble(item.getY());
							series.getData().add(new XYChart.Data<Number, Number>(x, y));
						}
					}
					
					createDummyValues(lineChart.addSerie("Test1"));				
					createDummyValues(lineChart.addSerie("Test2"));				
					createDummyValues(lineChart.addSerie("Test3"));				
					createDummyValues(lineChart.addSerie("Test3"));				
					
					setCenter(pane);
				}
			}
		}
	}

	private void createDummyValues(Series series) {
		// populating the series with Data<>
		series.getData().add(new XYChart.Data<>(1, random.nextInt()));
		series.getData().add(new XYChart.Data<>(2, random.nextInt()));
		series.getData().add(new XYChart.Data<>(3, random.nextInt()));
		series.getData().add(new XYChart.Data<>(4, random.nextInt()));
		series.getData().add(new XYChart.Data<>(5, random.nextInt()));
		series.getData().add(new XYChart.Data<>(6, random.nextInt()));
		series.getData().add(new XYChart.Data<>(7, random.nextInt()));
		series.getData().add(new XYChart.Data<>(8, random.nextInt()));
		series.getData().add(new XYChart.Data<>(9, random.nextInt()));
		series.getData().add(new XYChart.Data<>(10, random.nextInt()));
		series.getData().add(new XYChart.Data<>(11, random.nextInt()));
		series.getData().add(new XYChart.Data<>(12, random.nextInt()));
	}
}
