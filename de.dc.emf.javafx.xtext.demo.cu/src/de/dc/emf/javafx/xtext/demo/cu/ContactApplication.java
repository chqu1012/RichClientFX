package de.dc.emf.javafx.xtext.demo.cu;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import de.dc.emf.javafx.xtext.demo.cu.entry.BaseEntryTable;
import de.dc.emf.javafx.xtext.demo.cu.entry.model.Entry;
import de.dc.emf.javafx.xtext.demo.cu.entry.model.EntryType;
import de.dc.emf.javafx.xtext.demo.cu.feature.ContactCellFeatures;
import de.dc.emf.javafx.xtext.demo.cu.feature.EntryCellFeatures;
import de.dc.emf.javafx.xtext.demo.cu.model.Contact;
import de.dc.emf.javafx.xtext.demo.cu.model.ContactType;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.geometry.Orientation;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.SplitPane;
import javafx.stage.Stage;

public class ContactApplication extends Application{

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
		BaseTabke<Contact> baseTabke = new BaseTabke<Contact>();
		List<Contact> contacts = prepareContactData();
		baseTabke.setFeatureFor(ContactType.Gender, new ContactCellFeatures(ContactType.Gender));
		baseTabke.setInput(FXCollections.observableArrayList(contacts));
		
		BaseEntryTable<Entry> entryTable = new BaseEntryTable<>();
		List<Entry> entries = prepareEntryData();
		entryTable.setFeatureFor(EntryType.Timestamp, new EntryCellFeatures(EntryType.Timestamp));
		entryTable.setInput(FXCollections.observableArrayList(entries));
		
		SplitPane parent = new SplitPane();
		parent.setOrientation(Orientation.VERTICAL);
		parent.getItems().addAll(baseTabke, entryTable);
		return parent;
	}

	private List<Entry> prepareEntryData() {
		Random random = new Random();
		ArrayList<Entry> entries = new ArrayList<>();
		for (int i = 0; i < 50 ; i++) {
			Entry entry = new Entry();
			entry.setId(random.nextInt());
			entry.setName(String.valueOf(random.nextLong()));
			entry.setTimestamp(LocalDateTime.now());
			entries.add(entry );
		}
		return entries;
	}

	private List<Contact> prepareContactData() {
		Random random = new Random();
		List<Contact> contacts = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			Contact contact = new Contact();
			contact.setAddress("Neverland "+random.nextInt());
			contact.setAge(random.nextInt());
			contact.setGender(random.nextBoolean());
			contact.setName("PEter Hackson");
			contacts.add(contact);
		}
		return contacts;
	}
}