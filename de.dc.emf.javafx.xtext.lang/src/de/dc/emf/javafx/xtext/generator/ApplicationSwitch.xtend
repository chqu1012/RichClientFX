package de.dc.emf.javafx.xtext.generator

import de.dc.emf.javafx.model.javafx.LineChartFX
import de.dc.emf.javafx.model.javafx.ProjectFX
import de.dc.emf.javafx.model.javafx.util.JavafxSwitch
import org.eclipse.emf.ecore.util.EcoreUtil
import de.dc.emf.javafx.model.javafx.AxisType
import de.dc.emf.javafx.model.javafx.TableViewFX
import de.dc.emf.javafx.model.javafx.PieChartFX

class ApplicationSwitch extends JavafxSwitch<String>{
	
	override caseTableViewFX(TableViewFX object)'''
	«val packagePath = (EcoreUtil.getRootContainer(object) as ProjectFX).packagePath»
	package «packagePath».demo;
	
	import java.util.*;
	
	import «packagePath».controls.*;
	import «packagePath».model.*;
	import javafx.application.*;
	import javafx.collections.*;
	import javafx.scene.*;
	import javafx.stage.*;
	
	public class «object.name.toFirstUpper»Application extends Application{
	
		public static void main(String[] args) {
			launch(args);
		}
		
		@Override
		public void start(Stage primaryStage) throws Exception {
			«object.name.toFirstUpper» «object.name.toFirstLower» = new «object.name.toFirstUpper»();
			List<«object.usedModel.name.toFirstUpper»> masterData = new ArrayList<>();
			for (int i = 0; i < 20; i++) {
				masterData.add(new «object.usedModel.name.toFirstUpper»());
			}
			«object.name.toFirstLower».setItems(FXCollections.observableArrayList(masterData));
			Scene scene = new Scene(«object.name.toFirstLower», 600, 600);
			primaryStage.setScene(scene);
			primaryStage.show();
		}
	
	}
	'''
	
	override caseLineChartFX(LineChartFX object)'''
	«val packagePath = (EcoreUtil.getRootContainer(object) as ProjectFX).packagePath»
	package «packagePath».demo;
	
	import «packagePath».chart.*;		
	import java.util.*;
	import javafx.application.*;
	import javafx.scene.*;
	import javafx.stage.*;
	«val xAxisType = '''«IF object.XAxisType==AxisType.CATEGORY»String«ELSE»Number«ENDIF»'''»
	«val yAxisType = '''«IF object.YAxisType==AxisType.CATEGORY»String«ELSE»Number«ENDIF»'''»
	«val name = object.name.toFirstUpper»
	public class «name»Application extends Application{
	
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
			«name» chart = new «name»();
			
			for (int i = 0; i < 15; i++) {
				List<«name».Data<«xAxisType»,«yAxisType»>> list = new ArrayList<«name».Data<«xAxisType»,«yAxisType»>>();
				createData(list, i*5);
				chart.createSeries("Series "+i, list);
			}
	
			return chart;
		}
	
		private void createData(List<«name».Data<«xAxisType»,«yAxisType»>> list, int deltaXValue) {
			list.add(new «name».Data<«xAxisType»,«yAxisType»>(23+deltaXValue, 23));   
			list.add(new «name».Data<«xAxisType»,«yAxisType»>(14+deltaXValue, 14)); 
			list.add(new «name».Data<«xAxisType»,«yAxisType»>(15+deltaXValue, 15)); 
			list.add(new «name».Data<«xAxisType»,«yAxisType»>(24+deltaXValue, 24)); 
			list.add(new «name».Data<«xAxisType»,«yAxisType»>(34+deltaXValue, 34)); 
			list.add(new «name».Data<«xAxisType»,«yAxisType»>(36+deltaXValue, 36)); 
			list.add(new «name».Data<«xAxisType»,«yAxisType»>(22+deltaXValue, 22)); 
			list.add(new «name».Data<«xAxisType»,«yAxisType»>(45+deltaXValue, 45)); 
			list.add(new «name».Data<«xAxisType»,«yAxisType»>(43+deltaXValue, 43)); 
			list.add(new «name».Data<«xAxisType»,«yAxisType»>(17+deltaXValue, 17)); 
			list.add(new «name».Data<«xAxisType»,«yAxisType»>(29+deltaXValue, 29)); 
			list.add(new «name».Data<«xAxisType»,«yAxisType»>(25+deltaXValue, 25));
		}
	}
	'''

	override casePieChartFX(PieChartFX object)'''
	«val packagePath = (EcoreUtil.getRootContainer(object) as ProjectFX).packagePath»
	package «packagePath».demo;
	
	import «packagePath».chart.*;		
	import javafx.application.*;
	import javafx.scene.*;
	import javafx.scene.chart.*;
	import javafx.scene.control.*;
	import javafx.scene.input.*;
	import javafx.scene.layout.*;
	import javafx.scene.paint.*;
	import javafx.stage.*;
	«val name = object.name.toFirstUpper»
	public class «name»Application extends Application {
	 
	    @Override
	    public void start(Stage primaryStage) throws Exception {
	        «name» pieChart = new «name»();
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
	'''
	
	
}