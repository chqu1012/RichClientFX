package de.dc.emf.javafx.xtext.generator

import de.dc.emf.javafx.model.javafx.util.JavafxSwitch
import de.dc.emf.javafx.model.javafx.TableViewFX
import org.eclipse.emf.ecore.util.EcoreUtil
import de.dc.emf.javafx.model.javafx.ProjectFX

class FilteredElementSwitch extends JavafxSwitch<String>{
	
	override caseTableViewFX(TableViewFX object)'''
	«val packagePath = (EcoreUtil.getRootContainer(object) as ProjectFX).packagePath»
	package «packagePath».controls;
	
	import «packagePath».model.*;
	import javafx.beans.binding.Bindings;
	import javafx.collections.*;
	import javafx.collections.transformation.FilteredList;
	import javafx.scene.control.*;
	import javafx.scene.layout.*;
	«val tableName = object.name.toFirstUpper»
	«val modelName = object.usedModel.name.toFirstUpper»
	public class Filtered«tableName» extends VBox {
	
		protected boolean showFilterText = true;	
		protected boolean showCountOfItemsLabel = true;	
		private TextField searchText;
		private «tableName» «object.name.toFirstLower»;
		
		private ObservableList<«modelName»> «modelName.toFirstLower»List = FXCollections.observableArrayList();
		private FilteredList<«modelName»> «modelName.toFirstLower»FilteredList = new FilteredList<>(«modelName.toFirstLower»List, p->true);
		
		public Filtered«tableName»() {
			initSearchText();
			initTableView();
			initCountOfItemsLabel();
		}
	
		private void initTableView() {
			«object.name.toFirstLower» = new «tableName»();
			«object.name.toFirstLower».setItems(«modelName.toFirstLower»FilteredList);
			VBox.setVgrow(«object.name.toFirstLower», Priority.ALWAYS);
			getChildren().add(«object.name.toFirstLower»);
		}
	
		private void initSearchText() {
			if (showFilterText) {
				searchText = new TextField();
				searchText.setPromptText("Search for «modelName.toFirstLower»(s)");
				searchText.setOnKeyReleased(event->onSearchTextKeyReleased());
				getChildren().add(searchText);
			}
		}
	
		private void initCountOfItemsLabel() {
			if (showCountOfItemsLabel) {
				HBox hbox = new HBox();
				hbox.setSpacing(10);
				Label countOfList = new Label();
				hbox.getChildren().add(new Label("Count of «modelName»(s):"));
				hbox.getChildren().add(countOfList);
				getChildren().add(hbox);
				countOfList.textProperty().bind(Bindings.size(«modelName.toFirstLower»List).asString());
			}
		}
		
		private void onSearchTextKeyReleased() {
			contactFilteredList.setPredicate(item->{
				if (item==null) {
					return false;
				}
				String searchString = searchText.getText().toLowerCase();
				«FOR column : object.columns»
				«IF column.useFilter»
				String «column.name.toFirstLower»Search = String.valueOf(item.get«column.name.toFirstUpper»()).toLowerCase();
				if («column.name.toFirstLower»Search.contains(searchString)) {
					return true;
				}
				«ENDIF»
				«ENDFOR»
				return false;
			});
		}
	
		public void setItems(ObservableList<«modelName»> list) {
			«modelName.toFirstLower»List.clear();
			«modelName.toFirstLower»List.addAll(list);
		}
	}
	'''
	
}