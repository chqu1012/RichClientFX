package de.dc.javafx.xcore.workbench.ui.demo.ui.preview;

import de.dc.javafx.xcore.code.preview.ui.FXPreview;
import de.dc.javafx.xcore.workbench.chart.LineChartFX;
import javafx.beans.value.ObservableValue;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.TreeItem;

public class ChartFXPreview extends FXPreview {

	@Override
	public void changed(ObservableValue<? extends Object> obs, Object oldValue, Object newValue) {
		if (newValue instanceof TreeItem) {
			TreeItem treeItem = (TreeItem) newValue;
			Object value = treeItem.getValue();
			if (value instanceof LineChartFX) {
				LineChartFX chartFX = (LineChartFX) value;
				final NumberAxis xAxis = new NumberAxis();
				final NumberAxis yAxis = new NumberAxis();
				xAxis.setLabel(chartFX.getName());
				// creating the chart
				final LineChart<Number, Number> lineChart = new LineChart<>(xAxis, yAxis);

				lineChart.setTitle(chartFX.getName());
				// defining a series
				XYChart.Series<Number, Number> series = new XYChart.Series<>();
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

				lineChart.getData().add(series);

				setCenter(lineChart);
			}
		}
	}
}
