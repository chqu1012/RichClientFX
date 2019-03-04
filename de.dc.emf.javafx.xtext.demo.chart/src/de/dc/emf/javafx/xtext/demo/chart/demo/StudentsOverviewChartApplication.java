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
			List<StudentsOverviewChart.Data<String,Number>> list = new ArrayList<StudentsOverviewChart.Data<String,Number>>();
			createData(list, i*5);
			chart.createSeries("Series "+i, list);
		}

		return chart;
	}

	private void createData(List<StudentsOverviewChart.Data<String,Number>> list, int deltaXValue) {
		list.add(new StudentsOverviewChart.Data<String,Number>("Abs", 23));   
		list.add(new StudentsOverviewChart.Data<String,Number>("Abs", 14)); 
		list.add(new StudentsOverviewChart.Data<String,Number>("Abs", 15)); 
		list.add(new StudentsOverviewChart.Data<String,Number>("Abs", 24)); 
		list.add(new StudentsOverviewChart.Data<String,Number>("Abs", 34)); 
		list.add(new StudentsOverviewChart.Data<String,Number>("Abs", 36)); 
		list.add(new StudentsOverviewChart.Data<String,Number>("BSC", 22)); 
		list.add(new StudentsOverviewChart.Data<String,Number>("BSC", 45)); 
		list.add(new StudentsOverviewChart.Data<String,Number>("BSC", 43)); 
		list.add(new StudentsOverviewChart.Data<String,Number>("BSC", 17)); 
		list.add(new StudentsOverviewChart.Data<String,Number>("BSC", 29)); 
		list.add(new StudentsOverviewChart.Data<String,Number>("BSC", 25));
	}
}
