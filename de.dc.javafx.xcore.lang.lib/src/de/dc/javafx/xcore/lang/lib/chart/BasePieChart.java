package de.dc.javafx.xcore.lang.lib.chart;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.EventHandler;
import javafx.scene.Cursor;
import javafx.scene.chart.PieChart;
import javafx.scene.effect.DropShadow;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;

public abstract class BasePieChart extends PieChart {

	protected DropShadow ds = new DropShadow();

	public BasePieChart() {
		super(FXCollections.observableArrayList());

		setTitle(getChartTitle());

		ds.setColor(Color.LIGHTGRAY);
		ds.setSpread(0.75);
	}

	protected abstract String getChartTitle();

	public void add(String name, double value) {
		getData().add(new Data(name, value));
	}

	public void addAll(ObservableList<Data> dataList) {
		getData().addAll(dataList);
		for (final PieChart.Data data : getData()) {
			data.getNode().setOnMouseEntered(arg0 -> {
				data.getNode().setEffect(ds);
				data.getNode().setCursor(Cursor.HAND);
			});
			data.getNode().setOnMouseExited(arg0 -> {
				data.getNode().setEffect(null);
				data.getNode().setCursor(Cursor.DEFAULT);
			});
			data.getNode().addEventHandler(MouseEvent.MOUSE_PRESSED, new EventHandler<MouseEvent>() {
				@Override
				public void handle(MouseEvent e) {
					System.out.println(String.valueOf(data.getPieValue()) + "%");
				}
			});
		}
	}
}