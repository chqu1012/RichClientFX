package de.dc.emf.javafx.xtext.demo.cu;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import de.dc.emf.javafx.xtext.demo.cu.feature.ContactCellFeatures;
import de.dc.emf.javafx.xtext.demo.cu.model.*;

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
		baseTabke.setFeatureFor(ContactType.Gender, new ContactCellFeatures(ContactType.Gender));
		baseTabke.setInput(FXCollections.observableArrayList(contacts));
		return baseTabke;
	}
}