package de.dc.javafx.xcore.workbench.ui.demo.ui.preview;

import java.util.Random;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;

import com.google.common.eventbus.Subscribe;

import de.dc.javafx.xcore.code.preview.ui.FXPreview;
import de.dc.javafx.xcore.workbench.chart.LineChartFX;
import de.dc.javafx.xcore.workbench.chart.SeriesFX;
import de.dc.javafx.xcore.workbench.chart.XYValueFX;
import de.dc.javafx.xcore.workbench.di.DIPlatform;
import de.dc.javafx.xcore.workbench.event.EventContext;
import de.dc.javafx.xcore.workbench.event.IEventBroker;
import de.dc.javafx.xcore.workbench.ui.demo.ui.control.CustomLineChart;
import de.dc.javafx.xcore.workbench.ui.demo.ui.control.ZoomableScrollPane;
import javafx.beans.value.ObservableValue;
import javafx.scene.chart.XYChart;
import javafx.scene.chart.XYChart.Series;
import javafx.scene.control.TreeItem;

public class ChartFXPreview extends FXPreview {

	public ChartFXPreview() {
		DIPlatform.getInstance(IEventBroker.class).register(this);
	}
	
	@Subscribe
	public void updateChart(EventContext<Object> context) {
		if (context.getEventId()!=null && context.getEventId().equals("chartfx.update")) {
			Object input = context.getInput();
			renderLineChart(input);
		}
	}
	
	@Override
	public void changed(ObservableValue<? extends Object> obs, Object oldValue, Object newValue) {
		if (newValue instanceof TreeItem) {
			TreeItem<Object> treeItem = (TreeItem) newValue;
			Object value = treeItem.getValue();
			if (value instanceof EObject) {
				EObject eObject = EcoreUtil.getRootContainer((EObject) value);
				renderLineChart(eObject);
			}
		}
	}

	private void renderLineChart(Object object) {
		if (object instanceof LineChartFX) {
			LineChartFX chartFX = (LineChartFX) object;
			CustomLineChart lineChart = new CustomLineChart();
			ZoomableScrollPane pane = new ZoomableScrollPane(lineChart);
			
			lineChart.getChart().setTitle(chartFX.getName());
			lineChart.getXAxis().setLabel(chartFX.getXAxisLabel());
			lineChart.getYAxis().setLabel(chartFX.getYAxisLabel());
			lineChart.getChart().setLegendVisible(chartFX.isShowLegend());
			
			for (SeriesFX seriesFX : chartFX.getSeries()) {
				Series<Number, Number> series = lineChart.addSerie(seriesFX.getName());
				for (XYValueFX item : seriesFX.getValues()) {
					Double x = Double.parseDouble(item.getX());
					Double y = Double.parseDouble(item.getY());
					series.getData().add(new XYChart.Data<Number, Number>(x, y));
				}
			}
			
			setCenter(pane);
		}
	}
}
