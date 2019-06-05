package de.dc.javafx.xcore.workbench.ui.demo.ui;

import com.google.inject.Inject;

import de.dc.javafx.xcore.workbench.event.ISelectionService;
import de.dc.javafx.xcore.workbench.ui.EmfWorkbenchContext;
import de.dc.javafx.xcore.workbench.ui.control.EmfView;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;

public class EmfExampleTableView extends EmfView {

	@Inject ISelectionService service;
	
	public static class Person {

		private final SimpleStringProperty vorname;
		private final SimpleStringProperty nachname;
		private final SimpleIntegerProperty alter;

		private Person(String vName, String nName, int alter) {
			this.vorname = new SimpleStringProperty(vName);
			this.nachname = new SimpleStringProperty(nName);
			this.alter = new SimpleIntegerProperty(alter);
		}

		public String getVorname() {
			return vorname.get();
		}

		public void setVorname(String fName) {
			vorname.set(fName);
		}

		public String getNachname() {
			return nachname.get();
		}

		public void setLastName(String fName) {
			nachname.set(fName);
		}

		public int getAlter() {
			return alter.get();
		}

		public void setAlter(int fAlter) {
			alter.set(fAlter);
		}
	}

	@Override
	protected void createPartControl(BorderPane parent) {
		TableView table = new TableView();
		ObservableList<Person> data = FXCollections.observableArrayList(new Person("Denis", "Panjuta", 28),
				new Person("Hans", "Wurst", 25), new Person("Dieter", "Mieter", 33));

		table.setEditable(true);
		
		TableColumn vorNameCol = new TableColumn("Vorname");
		TableColumn nachNameCol = new TableColumn("Nachname");
		TableColumn alterCol = new TableColumn("Alter");

		table.getColumns().addAll(vorNameCol, nachNameCol, alterCol);

		vorNameCol.setMinWidth(100);
		vorNameCol.setCellValueFactory(new PropertyValueFactory<>("vorname"));

		nachNameCol.setMinWidth(100);
		nachNameCol.setCellValueFactory(new PropertyValueFactory<>("nachname"));

		alterCol.setMinWidth(100);
		alterCol.setCellValueFactory(new PropertyValueFactory<>("alter"));

		table.setItems(data);
		
		EmfWorkbenchContext.getInstance(ISelectionService.class).registerProvider(table.getSelectionModel().selectedItemProperty());

		parent.setCenter(table);
	}
}
