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
		
		for (int i = 0; i < 15; i++) {
			List<BudgetChartOther.Data<Number,Number>> list = new ArrayList<BudgetChartOther.Data<Number,Number>>();
			createData(list, i*5);
			chart.createSeries("Series "+i, list);
		}

		return chart;
	}

	private void createData(List<BudgetChartOther.Data<Number,Number>> list, int deltaXValue) {
		list.add(new BudgetChartOther.Data<Number,Number>(23+deltaXValue, 23));   
		list.add(new BudgetChartOther.Data<Number,Number>(14+deltaXValue, 14)); 
		list.add(new BudgetChartOther.Data<Number,Number>(15+deltaXValue, 15)); 
		list.add(new BudgetChartOther.Data<Number,Number>(24+deltaXValue, 24)); 
		list.add(new BudgetChartOther.Data<Number,Number>(34+deltaXValue, 34)); 
		list.add(new BudgetChartOther.Data<Number,Number>(36+deltaXValue, 36)); 
		list.add(new BudgetChartOther.Data<Number,Number>(22+deltaXValue, 22)); 
		list.add(new BudgetChartOther.Data<Number,Number>(45+deltaXValue, 45)); 
		list.add(new BudgetChartOther.Data<Number,Number>(43+deltaXValue, 43)); 
		list.add(new BudgetChartOther.Data<Number,Number>(17+deltaXValue, 17)); 
		list.add(new BudgetChartOther.Data<Number,Number>(29+deltaXValue, 29)); 
		list.add(new BudgetChartOther.Data<Number,Number>(25+deltaXValue, 25));
	}
}
