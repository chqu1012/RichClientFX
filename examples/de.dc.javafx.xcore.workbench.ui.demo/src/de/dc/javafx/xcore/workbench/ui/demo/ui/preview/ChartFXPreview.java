package de.dc.javafx.xcore.workbench.ui.demo.ui.preview;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;

import de.dc.javafx.xcore.code.preview.ui.FXPreview;
import de.dc.javafx.xcore.workbench.chart.LineChartFX;
import de.dc.javafx.xcore.workbench.chart.SeriesFX;
import de.dc.javafx.xcore.workbench.chart.XYValueFX;
import de.dc.javafx.xcore.workbench.ui.demo.ui.control.CustomLineChart;
import javafx.beans.value.ObservableValue;
import javafx.scene.chart.XYChart;
import javafx.scene.chart.XYChart.Series;
import javafx.scene.control.TreeItem;

public class ChartFXPreview extends FXPreview {

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
					
					for (SeriesFX seriesFX : chartFX.getSeries()) {
						Series<Number, Number> series = lineChart.addSerie(seriesFX.getName());
						for (XYValueFX item : seriesFX.getValues()) {
							Double x = Double.parseDouble(item.getX());
							Double y = Double.parseDouble(item.getY());
							series.getData().add(new XYChart.Data<Number, Number>(x, y));
						}
					}
					
					Series series = lineChart.addSerie("Test");
					series.setName("My portfolio");
					// populating the series with Data<>
					series.getData().add(new XYChart.Data<>(1, 23));
					series.getData().add(new XYChart.Data<>(2, 14));
					series.getData().add(new XYChart.Data<>(3, 15));
					series.getData().add(new XYChart.Data<>(4, 24));
					series.getData().add(new XYChart.Data<>(5, 34));
					series.getData().add(new XYChart.Data<>(6, 36));
					series.getData().add(new XYChart.Data<>(7, 22));
					series.getData().add(new XYChart.Data<>(8, 45));
					series.getData().add(new XYChart.Data<>(9, 43));
					series.getData().add(new XYChart.Data<>(10, 17));
					series.getData().add(new XYChart.Data<>(11, 29));
					series.getData().add(new XYChart.Data<>(12, 25));				
					
					setCenter(lineChart);
				}
			}
		}
	}
}
