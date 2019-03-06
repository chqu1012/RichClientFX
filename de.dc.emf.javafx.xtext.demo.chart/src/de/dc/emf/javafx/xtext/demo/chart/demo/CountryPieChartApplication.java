package de.dc.emf.javafx.xtext.demo.chart.demo;

import de.dc.emf.javafx.xtext.demo.chart.chart.*;		
import javafx.application.*;
import javafx.scene.*;
import javafx.scene.chart.*;
import javafx.scene.control.*;
import javafx.scene.input.*;
import javafx.scene.layout.*;
import javafx.scene.paint.*;
import javafx.stage.*;
public class CountryPieChartApplication extends Application {
 
    @Override
    public void start(Stage primaryStage) throws Exception {
        CountryPieChart pieChart = new CountryPieChart();
        pieChart.addSlice("USA", 17947195);     
        pieChart.addSlice("EU", 11540278);      
        pieChart.addSlice("China", 10982829);   
        pieChart.addSlice("Japan", 4116242);    
        pieChart.addSlice("Others", 28584442);  

        final Label caption = new Label("");
        caption.setTextFill(Color.WHITE);
        caption.setStyle("-fx-font: 12 arial;");
 
        for (final PieChart.Data data : pieChart.getData()) {
            data.getNode().addEventHandler(MouseEvent.MOUSE_MOVED, e -> {
			    caption.setTranslateX(e.getSceneX());
			    caption.setTranslateY(e.getSceneY());
			    caption.setText(String.valueOf(data.getPieValue()));
			});
        }
 
        AnchorPane root = new AnchorPane();
        root.getChildren().addAll(pieChart, caption);
        
        Scene scene = new Scene(root, 400, 300);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
 
    public static void main(String[] args) {
        launch(args);
    }
}
