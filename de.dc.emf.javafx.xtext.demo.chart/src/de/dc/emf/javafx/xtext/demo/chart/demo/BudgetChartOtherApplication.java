package de.dc.emf.javafx.xtext.demo.chart.demo;

import de.dc.emf.javafx.xtext.demo.chart.chart.*;		
import java.util.*;
import javafx.application.*;
import javafx.scene.*;
import javafx.stage.*;
public class BudgetChartOtherApplication extends Application{

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
		BudgetChartOther chart = new BudgetChartOther();
		List<BudgetChartOther.Data<Number,Number>> exampleData2List = new ArrayList<BudgetChartOther.Data<Number,Number>>();
		exampleData2List.add(new BudgetChartOther.Data<Number,Number>(0, 5));   
		exampleData2List.add(new BudgetChartOther.Data<Number,Number>(10, 20));   
		exampleData2List.add(new BudgetChartOther.Data<Number,Number>(20, 23));   
		exampleData2List.add(new BudgetChartOther.Data<Number,Number>(25, 25));   
		exampleData2List.add(new BudgetChartOther.Data<Number,Number>(30, 30));   
		chart.createSeries("exampleData2", exampleData2List);
		List<BudgetChartOther.Data<Number,Number>> exampleData10List = new ArrayList<BudgetChartOther.Data<Number,Number>>();
		exampleData10List.add(new BudgetChartOther.Data<Number,Number>(0, 5));   
		exampleData10List.add(new BudgetChartOther.Data<Number,Number>(25, 5));   
		exampleData10List.add(new BudgetChartOther.Data<Number,Number>(40, 7));   
		exampleData10List.add(new BudgetChartOther.Data<Number,Number>(80, 9));   
		chart.createSeries("exampleData10", exampleData10List);
		List<BudgetChartOther.Data<Number,Number>> exampleData15List = new ArrayList<BudgetChartOther.Data<Number,Number>>();
		exampleData15List.add(new BudgetChartOther.Data<Number,Number>(0, 5));   
		exampleData15List.add(new BudgetChartOther.Data<Number,Number>(5, 10));   
		exampleData15List.add(new BudgetChartOther.Data<Number,Number>(20, 15));   
		exampleData15List.add(new BudgetChartOther.Data<Number,Number>(40, 25));   
		exampleData15List.add(new BudgetChartOther.Data<Number,Number>(80, 29));   
		chart.createSeries("exampleData15", exampleData15List);
		return chart;
	}
}
