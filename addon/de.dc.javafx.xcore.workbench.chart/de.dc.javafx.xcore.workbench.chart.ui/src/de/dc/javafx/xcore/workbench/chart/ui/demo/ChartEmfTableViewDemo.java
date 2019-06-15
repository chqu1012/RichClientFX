package de.dc.javafx.xcore.workbench.chart.ui.demo;

import de.dc.javafx.xcore.workbench.chart.ChartFactory;
import de.dc.javafx.xcore.workbench.chart.ChartPackage;
import de.dc.javafx.xcore.workbench.chart.SeriesFX;
import de.dc.javafx.xcore.workbench.chart.XYValueFX;
import de.dc.javafx.xcore.workbench.chart.ui.ChartFXEmfTableView;
import de.dc.javafx.xcore.workbench.chart.ui.manager.LineChartFXEmfManager;
import de.dc.javafx.xcore.workbench.di.DIPlatform;
import de.dc.javafx.xcore.workbench.ui.WorkbenchModule;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
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
			value.setX(Double.parseDouble(i+""));
			value.setY(Double.parseDouble(i * 10 + ""));
			manager.getRoot().getValues().add(value);
		}
		ChartFXEmfTableView table = new ChartFXEmfTableView(manager);
		TableColumn<SeriesFX, Object> nameColumn = table.createColumn("X-Value",0);
		table.setEditable(nameColumn, ChartPackage.Literals.XY_VALUE_FX__X);
		
		TableColumn<SeriesFX, Object> valueColumn = table.createColumn("Y-Value",1);
		table.setEditable(valueColumn, ChartPackage.Literals.XY_VALUE_FX__Y);
		
		primaryStage.setScene(new Scene(table, 1200, 800));
		primaryStage.show();
	}
}