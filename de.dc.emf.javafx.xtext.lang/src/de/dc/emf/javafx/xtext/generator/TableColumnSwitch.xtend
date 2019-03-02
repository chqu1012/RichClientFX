package de.dc.emf.javafx.xtext.generator

import de.dc.emf.javafx.model.javafx.ModelFX
import de.dc.emf.javafx.model.javafx.TableViewFX
import de.dc.emf.javafx.model.javafx.util.JavafxSwitch

class TableColumnSwitch extends JavafxSwitch<String>{
	
	override caseModelFX(ModelFX object)'''
	package «FilePathSwitch.getPackage(object).toString.replace('/', '.')».controls.cell;
	
	public enum «object.name.toFirstUpper»Type {
		«object.attributes.map[it.name.toFirstUpper].reduce[p1, p2|p1+', '+p2]»;
	}
	'''

	override caseTableViewFX(TableViewFX object)'''
	package «FilePathSwitch.getPackage(object).toString.replace('/','.')».controls.cell;
	
	import «FilePathSwitch.getPackage(object).toString.replace('/','.')».model.*;
	import javafx.beans.property.SimpleStringProperty;
	import javafx.beans.value.ObservableValue;
	import javafx.scene.control.TableColumn;
	import javafx.scene.control.TableColumn.CellDataFeatures;
	import javafx.util.Callback;
	
	«val model = '''«IF object.usedModel===null»Object«ELSE»«object.usedModel.name.toFirstUpper»«ENDIF»'''»
	public class Base«model»CellFeatures implements Callback<TableColumn.CellDataFeatures<«model»,«model»>, ObservableValue<«model»>>{
		
		private «model»Type type;
		
		public Base«model»CellFeatures(«model»Type type) {
			this.type = type;
		}		
	
		@Override
		public ObservableValue call(CellDataFeatures<«model», «model»> param) {
			return new SimpleStringProperty(getText(param.getValue()));
		}
		
		private String getText(«model» item) {
			switch (type) {
			«FOR col : object.columns»
			«val fieldName = col.usedAttribute.name.toFirstUpper»
			case «fieldName»:
				return get«fieldName»(item);
			«ENDFOR»
			default:
				return "";
			}
		}
	
		«FOR col : object.columns»
		«val fieldName = col.usedAttribute.name.toFirstUpper»
		protected String get«fieldName»(«model» item) {
			return String.valueOf(item.get«fieldName»());
		}
		«ENDFOR»
	
	}
	'''
	
}