package de.dc.emf.javafx.xtext.demo.chart.demo;

import de.dc.emf.javafx.xtext.demo.chart.chart.*;		
import java.util.*;
import javafx.application.*;
import javafx.scene.*;
import javafx.stage.*;
public class StudentsOverviewChartApplication extends Application{

	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		Parent root = getRoot();
		primaryStage.setScene(new Scene(root , 1000, 800));
		primaryStage.show();
	}
	
	protected Parent getRoot() {
		StudentsOverviewChart chart = new StudentsOverviewChart();
		return chart;
	}
}
