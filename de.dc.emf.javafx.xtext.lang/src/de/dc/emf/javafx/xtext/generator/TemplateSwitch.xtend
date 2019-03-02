package de.dc.emf.javafx.xtext.generator

import de.dc.emf.javafx.model.javafx.util.JavafxSwitch
import de.dc.emf.javafx.model.javafx.ModelFX
import de.dc.emf.javafx.model.javafx.ProjectFX
import de.dc.emf.javafx.model.javafx.TableViewFX
import de.dc.emf.javafx.model.javafx.TableColumnFX
import org.eclipse.emf.ecore.util.EcoreUtil

class TemplateSwitch extends JavafxSwitch<String>{
	
	override caseModelFX(ModelFX object)'''
	«val packagePath = (EcoreUtil.getRootContainer(object.eContainer) as ProjectFX).packagePath»
	package «packagePath».model;
	
	public class «object.name.toFirstUpper»{
	
		«FOR field : object.attributes»
		private «field.type» «field.name.toFirstLower»;
		«ENDFOR»
		
		public «object.name.toFirstUpper»(){
		}
		
		«val parameters = object.attributes.map[it.type+' '+it.name.toFirstLower].reduce[p1, p2|p1+', '+p2]»
		public «object.name.toFirstUpper»(«parameters»){
			«FOR field : object.attributes»
			this.«field.name.toFirstLower»=«field.name.toFirstLower»;
			«ENDFOR»
		}
		
		«FOR field : object.attributes»
		public «field.type» get«field.name.toFirstUpper()»(){
			return «field.name.toFirstLower»;
		}

		public void set«field.name.toFirstUpper»(«field.type» «field.name.toFirstLower») {
			this.«field.name.toFirstLower» = «field.name.toFirstLower»;
		}
		«ENDFOR»
	}
	'''
	
	override caseTableViewFX(TableViewFX object)'''
	«val packagePath = (EcoreUtil.getRootContainer(object.eContainer) as ProjectFX).packagePath»
	package «packagePath».controls;
	
	import «packagePath».controls.cell.*;
	import «packagePath».model.*;
	import javafx.scene.control.*;
	import javafx.beans.value.ObservableValue;
	import javafx.util.Callback;
	
	«val model = '''«IF object.usedModel!==null»«object.usedModel.name»«ELSE»Object«ENDIF»'''»
	«val modelName = object.usedModel.name.toFirstUpper»
	public abstract class Base«object.name.toFirstUpper» extends TableView<«model»>{
		
		«FOR column : object.columns»
		protected TableColumn<«model», «model»> «column.name.toFirstLower»Column;
		«ENDFOR»
		
		public Base«object.name.toFirstUpper»() {
			«FOR column : object.columns»
			«column.name.toFirstLower»Column = createColumn("«column.name.toFirstUpper»", «column.width»,  new Base«modelName»CellFeatures(«modelName»Type.«column.usedAttribute.name.toFirstUpper»));
			«ENDFOR»
		}
	
		protected TableColumn<«model»,«model»> createColumn(String name, double width, Callback<TableColumn.CellDataFeatures<«model»,«model»>, ObservableValue<«model»>> cellFeatures) {
			TableColumn<«model», «model»> column = new TableColumn<«model», «model»>(name);
			column.setPrefWidth(width);
			column.setCellValueFactory(cellFeatures);
			getColumns().add(column);
			return column;
		}
	}
	'''	
	
	override caseTableColumnFX(TableColumnFX object)'''
	«val packagePath = (EcoreUtil.getRootContainer(object.eContainer) as ProjectFX).packagePath»
	«val table = object.eContainer as TableViewFX»
	«val model = table.usedModel»
	package «packagePath».controls.cell;
	
	import «packagePath».model.*;
	import javafx.scene.control.*;
	
	«val name = '''«IF model.name.isNullOrEmpty»Object«ELSE»«model.name.toFirstUpper»«ENDIF»'''»
	public class Base«model.name.toFirstUpper»«object.usedAttribute.name.toFirstUpper»CellFeatures extends TableCell<«name», «name»> {
	
		@Override
		protected void updateItem(«name» item, boolean empty) {
			super.updateItem(item, empty);
			if (item==null && empty) {
				setText(null);
			}else {
				setText(String.valueOf(item.get«object.name.toFirstUpper»()));
			}
		}
	}
	'''
}