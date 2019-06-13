package de.dc.javafx.xcore.workbench.chart.ui.demo;

import de.dc.javafx.xcore.workbench.chart.ChartFactory;
import de.dc.javafx.xcore.workbench.chart.XYValueFX;
import de.dc.javafx.xcore.workbench.chart.ui.ChartFXEmfTableView;
import de.dc.javafx.xcore.workbench.chart.ui.manager.LineChartFXEmfManager;
import de.dc.javafx.xcore.workbench.di.DIPlatform;
import de.dc.javafx.xcore.workbench.ui.WorkbenchModule;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ChartEmfTableViewDemo extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		DIPlatform.add(new WorkbenchModule());
		DIPlatform.init();

		LineChartFXEmfManager manager = new LineChartFXEmfManager();
		for (int i = 0; i < 20; i++) {
			XYValueFX value = ChartFactory.eINSTANCE.createXYValueFX();
			value.setX(i + "");
			value.setY(i * 10 + "");
			manager.getRoot().getValues().add(value);
		}
		ChartFXEmfTableView table = new ChartFXEmfTableView(manager);
		table.createColumn("Name");
		table.createColumn("Value");

		primaryStage.setScene(new Scene(table, 1200, 800));
		primaryStage.show();
	}
}