package de.dc.emf.javafx.xtext.generator

import de.dc.emf.javafx.model.javafx.LineChartFX
import de.dc.emf.javafx.model.javafx.ProjectFX
import de.dc.emf.javafx.model.javafx.util.JavafxSwitch
import org.eclipse.emf.ecore.util.EcoreUtil
import de.dc.emf.javafx.model.javafx.AxisType

class ApplicationSwitch extends JavafxSwitch<String>{
	
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
	
}