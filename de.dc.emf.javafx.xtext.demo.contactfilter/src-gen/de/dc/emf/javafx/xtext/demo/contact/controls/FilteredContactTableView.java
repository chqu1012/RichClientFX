package de.dc.emf.javafx.xtext.demo.contact.controls;

import de.dc.emf.javafx.xtext.demo.contact.model.*;
import javafx.beans.binding.Bindings;
import javafx.collections.*;
import javafx.collections.transformation.FilteredList;
import javafx.scene.control.*;
import javafx.scene.layout.*;
public class FilteredContactTableView extends VBox {

	private boolean showFilterText = true;	
	private boolean showCountOfItemsLabel = true;	
	private TextField searchText;
	private ContactTableView contactTableView;
	
	private ObservableList<Contact> contactList = FXCollections.observableArrayList();
	private FilteredList<Contact> contactFilteredList = new FilteredList<>(contactList, p->true);
	
	public FilteredContactTableView() {
		initSearchText();
		initTableView();
		initCountOfItemsLabel();
	}

	private void initTableView() {
		contactTableView = new ContactTableView();
		contactTableView.setItems(contactFilteredList);
		VBox.setVgrow(contactTableView, Priority.ALWAYS);
		getChildren().add(contactTableView);
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
