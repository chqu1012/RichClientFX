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
		
		for (int i = 0; i < 15; i++) {
			chart.createSeries("Series "+i, getData());
		}

		return chart;
	}

	private List<StudentsOverviewChart.Data<Number,Number>> getData() {
		List<StudentsOverviewChart.Data<Number,Number>> list = new ArrayList<StudentsOverviewChart.Data<Number,Number>>();
		return list;
	}
}
