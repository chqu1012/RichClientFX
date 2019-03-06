package de.dc.emf.javafx.xtext.demo.chart.demo;

import de.dc.emf.javafx.xtext.demo.chart.chart.*;		
import java.util.*;
import javafx.application.*;
import javafx.scene.*;
import javafx.stage.*;
public class BudgetChartOtherApplication extends Application{

	private int x = 5;
	
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
			chart.createSeries("Series "+i, getData());
		}

		return chart;
	}

	private List<BudgetChartOther.Data<Number,Number>> getData() {
		List<BudgetChartOther.Data<Number,Number>> list = new ArrayList<BudgetChartOther.Data<Number,Number>>();
		list.add(new BudgetChartOther.Data<Number,Number>(10+x, 20));   
		list.add(new BudgetChartOther.Data<Number,Number>(20+x, 23));   
		list.add(new BudgetChartOther.Data<Number,Number>(25+x, 25));   
		list.add(new BudgetChartOther.Data<Number,Number>(30+x, 30));   
		x=x+5;
		return list;
	}
}
