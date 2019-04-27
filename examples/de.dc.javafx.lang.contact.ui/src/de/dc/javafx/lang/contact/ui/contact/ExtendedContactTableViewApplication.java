package de.dc.javafx.lang.contact.ui.contact;

import java.util.Random;

import de.dc.emf.javafx.xtext.demo.contact.BaseContactTableView;
import de.dc.emf.javafx.xtext.demo.contact.demo.ContactTableViewApplication;
import de.dc.emf.javafx.xtext.demo.contact.model.Contact;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Parent;

public class ExtendedContactTableViewApplication extends ContactTableViewApplication {

	private String[] firstnames = {"Alex", "Peter", "Ron", "Carl", "Florian", "James", "Robert", "Rene", "Toni", "Steve"};
	private String[] lastnames = {"Janes", "Mulla", "Raster", "Reer", "Rufo", "Vanda", "Mans", "Hew", "Let", "Parker"};
	private Random random = new Random();
	
	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public Parent getRoot() {
		BaseContactTableView view = new BaseContactTableView();
		ObservableList<Contact> items = FXCollections.observableArrayList();
		for (int i = 0; i < 30; i++) {
			Contact item = new Contact();
			fillItem(i, item);
			items.add(item);
		}
		view.setInput(items);
		return view;
	}
	
	protected void fillItem(int i, Contact item) {
		int age = Math.abs(random.nextInt());
		boolean gender = age % 2 ==0;
		String firstname = firstnames[age%10];
		String lastname = lastnames[age%10];
		item.setAge(age);
		item.setGender(gender);
		item.setLastname(lastname);
		item.setFirstname(firstname);
	}
}
