package de.dc.javafx.emfsupport.website.model.ui;

import de.dc.javafx.efxclipse.runtime.EmfTreeTableView;
import de.dc.javafx.efxclipse.runtime.model.IEmfManager;
import de.dc.javafx.emfsupport.website.model.Author;
import de.dc.javafx.emfsupport.website.model.Page;
import de.dc.javafx.emfsupport.website.model.Website;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeTableColumn;
import javafx.scene.control.TreeTableColumn.CellDataFeatures;
import javafx.util.Callback;

public class WebsiteTreeTableView extends EmfTreeTableView<Website> {

	public WebsiteTreeTableView(IEmfManager<Website> manager) {
		super(manager);
		
		TreeTableColumn<Object, Object> nameColumn = createColumn("Name");
		nameColumn.setCellValueFactory(new Callback<TreeTableColumn.CellDataFeatures<Object,Object>, ObservableValue<Object>>() {
			@Override
			public ObservableValue call(CellDataFeatures<Object, Object> param) {
				TreeItem<Object> value = param.getValue();
				Object current = value.getValue();
				if (current instanceof Page) {
					Page page = (Page) current;
					return new SimpleStringProperty(page.getName());
				}
				return new SimpleStringProperty("");
			}
		});
		TreeTableColumn<Object, Object> firstnameColumn = createColumn("Firstname");
		firstnameColumn.setCellValueFactory(new Callback<TreeTableColumn.CellDataFeatures<Object,Object>, ObservableValue<Object>>() {
			@Override
			public ObservableValue call(CellDataFeatures<Object, Object> param) {
				TreeItem<Object> value = param.getValue();
				Object current = value.getValue();
				if (current instanceof Author) {
					Author item = (Author) current;
					return new SimpleStringProperty("");
				}
				return new SimpleStringProperty(current.toString());
			}
		});
		TreeTableColumn<Object, Object> lastnameColumn = createColumn("Lastname");
		lastnameColumn.setCellValueFactory(new Callback<TreeTableColumn.CellDataFeatures<Object,Object>, ObservableValue<Object>>() {
			@Override
			public ObservableValue call(CellDataFeatures<Object, Object> param) {
				TreeItem<Object> value = param.getValue();
				Object current = value.getValue();
				if (current instanceof Author) {
					Author item = (Author) current;
					return new SimpleStringProperty(item.getLastname());
				}
				return new SimpleStringProperty("");
			}
		});
		TreeTableColumn<Object, Object> emailColumn = createColumn("email");
		emailColumn.setCellValueFactory(new Callback<TreeTableColumn.CellDataFeatures<Object,Object>, ObservableValue<Object>>() {
			@Override
			public ObservableValue call(CellDataFeatures<Object, Object> param) {
				TreeItem<Object> value = param.getValue();
				Object current = value.getValue();
				if (current instanceof Author) {
					Author item = (Author) current;
					return new SimpleStringProperty(item.getEmail());
				}
				return new SimpleStringProperty("");
			}
		});
	}

}
