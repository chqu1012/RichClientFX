package de.dc.emf.javafx.xtext.demo.contact.controls;

import de.dc.emf.javafx.xtext.demo.contact.model.*;
import de.dc.emf.javafx.xtext.demo.contact.controls.cell.*;
import javafx.beans.binding.Bindings;
import javafx.collections.*;
import javafx.collections.*;
import javafx.beans.value.*;
import javafx.util.*;
import javafx.collections.transformation.FilteredList;
import javafx.scene.control.*;
import javafx.scene.layout.*;
public class BaseContactTableView extends VBox {

	protected TableColumn<Contact, Contact> forenameColumn;
	protected TableColumn<Contact, Contact> familyNameColumn;
	protected TableColumn<Contact, Contact> ageColumn;
	protected TableColumn<Contact, Contact> addressColumn;
	protected boolean showFilterText = true;	
	protected boolean showCountOfItemsLabel = true;	
	private TextField searchText;
	private TableView<Contact> contactTableView;
	
	private ObservableList<Contact> contactList = FXCollections.observableArrayList();
	private FilteredList<Contact> contactFilteredList = new FilteredList<>(contactList, p->true);
	
	public BaseContactTableView() {
		initSearchText();
		initTableView();
		initCountOfItemsLabel();
	}

	private void initTableView() {
		contactTableView = new TableView<Contact>();
		contactTableView.setItems(contactFilteredList);
		VBox.setVgrow(contactTableView, Priority.ALWAYS);
		getChildren().add(contactTableView);
		forenameColumn = createColumn("Forename", 100,  new BaseContactCellFeatures(ContactType.Forename));
		familyNameColumn = createColumn("FamilyName", 100,  new BaseContactCellFeatures(ContactType.FamilyName));
		ageColumn = createColumn("Age", 200,  new BaseContactCellFeatures(ContactType.Age));
		addressColumn = createColumn("Address", 50,  new BaseContactCellFeatures(ContactType.Address));
	}

	protected TableColumn<Contact,Contact> createColumn(String name, double width, Callback<TableColumn.CellDataFeatures<Contact,Contact>, ObservableValue<Contact>> cellFeatures) {
		TableColumn<Contact, Contact> column = new TableColumn<Contact, Contact>(name);
		column.setPrefWidth(width);
		column.setCellValueFactory(cellFeatures);
		contactTableView.getColumns().add(column);
		return column;
	}

	private void initSearchText() {
		if (showFilterText) {
			searchText = new TextField();
			searchText.setPromptText("Search for contact(s)");
			searchText.setOnKeyReleased(event->onSearchTextKeyReleased());
			getChildren().add(searchText);
		}
	}

	private void initCountOfItemsLabel() {
		if (showCountOfItemsLabel) {
			HBox hbox = new HBox();
			hbox.setSpacing(10);
			Label countOfList = new Label();
			hbox.getChildren().add(new Label("Count of Contact(s):"));
			hbox.getChildren().add(countOfList);
			getChildren().add(hbox);
			countOfList.textProperty().bind(Bindings.size(contactList).asString());
		}
	}
	
	private void onSearchTextKeyReleased() {
		contactFilteredList.setPredicate(item->{
			if (item==null) {
				return false;
			}
			String searchString = searchText.getText().toLowerCase();
			String forenameSearch = String.valueOf(item.getForename()).toLowerCase();
			if (forenameSearch.contains(searchString)) {
				return true;
			}
			String familyNameSearch = String.valueOf(item.getFamilyName()).toLowerCase();
			if (familyNameSearch.contains(searchString)) {
				return true;
			}
			String ageSearch = String.valueOf(item.getAge()).toLowerCase();
			if (ageSearch.contains(searchString)) {
				return true;
			}
			String addressSearch = String.valueOf(item.getAddress()).toLowerCase();
			if (addressSearch.contains(searchString)) {
				return true;
			}
			return false;
		});
	}

	public void setItems(ObservableList<Contact> list) {
		contactList.clear();
		contactList.addAll(list);
	}
}
