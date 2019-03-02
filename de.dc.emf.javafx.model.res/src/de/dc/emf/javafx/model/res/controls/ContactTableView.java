package de.dc.emf.javafx.model.res.controls;

public class ContactTableView extends BaseContactTableView {
	
	public ContactTableView() {
		nameColumn.setStyle("-fx-alignment: center_right");
		ageColumn.setStyle("-fx-alignment: center");
		genderColumn.setStyle("-fx-alignment: center_left");
	}
}
