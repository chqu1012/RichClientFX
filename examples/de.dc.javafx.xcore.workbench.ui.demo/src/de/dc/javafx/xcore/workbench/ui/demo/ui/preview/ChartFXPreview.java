package de.dc.javafx.xcore.workbench.ui.demo.ui.preview;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.gillius.jfxutils.chart.ChartPanManager;
import org.gillius.jfxutils.chart.JFXChartUtil;

import com.google.common.eventbus.Subscribe;

import de.dc.javafx.xcore.code.preview.ui.FXPreview;
import de.dc.javafx.xcore.workbench.chart.ChartFXConfig;
import de.dc.javafx.xcore.workbench.chart.ChartSide;
import de.dc.javafx.xcore.workbench.chart.LineChartFX;
import de.dc.javafx.xcore.workbench.chart.SeriesFX;
import de.dc.javafx.xcore.workbench.chart.XYValueFX;
import de.dc.javafx.xcore.workbench.di.DIPlatform;
import de.dc.javafx.xcore.workbench.event.EventContext;
import de.dc.javafx.xcore.workbench.event.IEventBroker;
import de.dc.javafx.xcore.workbench.ui.demo.ui.control.CustomLineChart;
import javafx.beans.value.ObservableValue;
import javafx.geometry.Side;
import javafx.scene.chart.XYChart;
import javafx.scene.chart.XYChart.Series;
import javafx.scene.control.TreeItem;
import javafx.scene.input.MouseButton;

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
			
			XYChart<Number, Number> chart = lineChart.getChart();
			chart.setTitle(chartFX.getName());
			lineChart.getXAxis().setLabel(chartFX.getXAxisLabel());
			lineChart.getYAxis().setLabel(chartFX.getYAxisLabel());

			ChartFXConfig config = chartFX.getConfig();
			if (config!=null) {
				chart.setLegendVisible(config.isShowLegend());
				chart.setLegendSide(Side.valueOf(config.getSideLegend().getName()));
				chart.setTitleSide(Side.valueOf(config.getTitleSide().getName()));
				chart.setAlternativeColumnFillVisible(config.isAlternativeColumnFillVisible());
				chart.setAlternativeRowFillVisible(config.isAlternativeRowFillVisible());
				chart.setHorizontalGridLinesVisible(config.isHorizontalGridLinesVisible());
				chart.setHorizontalZeroLineVisible(config.isHorizontalZeroLinesVisible());
				chart.setVerticalGridLinesVisible(config.isVerticalGridLinesVisible());
				chart.setVerticalZeroLineVisible(config.isVerticalZeroLinesVisible());
			}
			
			for (SeriesFX seriesFX : chartFX.getSeries()) {
				Series<Number, Number> series = lineChart.addSerie(seriesFX.getName());
				for (XYValueFX item : seriesFX.getValues()) {
					Double x = Double.parseDouble(item.getX());
					Double y = Double.parseDouble(item.getY());
					series.getData().add(new XYChart.Data<Number, Number>(x, y));
				}
			}

			//Panning works via either secondary (right) mouse or primary with ctrl held down
			ChartPanManager panner = new ChartPanManager( chart );
			panner.setMouseFilter( mouseEvent -> {
				if ( mouseEvent.getButton() == MouseButton.SECONDARY ||
						 ( mouseEvent.getButton() == MouseButton.PRIMARY &&
						   mouseEvent.isShortcutDown() ) ) {
					//let it through
				} else {
					mouseEvent.consume();
				}
			} );
			panner.start();

			//Zooming works only via primary mouse button without ctrl held down
			JFXChartUtil.setupZooming( chart, mouseEvent -> {
				if ( mouseEvent.getButton() != MouseButton.PRIMARY ||
				     mouseEvent.isShortcutDown() )
					mouseEvent.consume();
			} );

			JFXChartUtil.addDoublePrimaryClickAutoRangeHandler( chart );
			setCenter(lineChart);
		}
	}
}
