package de.dc.emf.javafx.xtext.demo.contact.binding;

import javafx.beans.property.*;
import javafx.collections.*;

public class ContactBinding{

	private StringProperty nameProperty = new SimpleStringProperty();	
	private DoubleProperty ageProperty = new SimpleDoubleProperty();	
	private BooleanProperty genderProperty = new SimpleBooleanProperty();	
	private StringProperty addressProperty = new SimpleStringProperty();	
	
	public void setNameProperty(String name) {
		this.nameProperty.set(name);
	}
	
	public StringProperty getNameProperty() {
		return this.nameProperty;
	}
	
	public String getName() {
		return this.nameProperty.get();
	}
	public void setName(String name) {
		this.nameProperty.set(name);
	}
	public void setAgeProperty(Double age) {
		this.ageProperty.set(age);
	}
	
	public DoubleProperty getAgeProperty() {
		return this.ageProperty;
	}
	
	public Double getAge() {
		return this.ageProperty.get();
	}
	public void setAge(Double age) {
		this.ageProperty.set(age);
	}
	public void setGenderProperty(Boolean gender) {
		this.genderProperty.set(gender);
	}
	
	public BooleanProperty getGenderProperty() {
		return this.genderProperty;
	}
	
	public Boolean getGender() {
		return this.genderProperty.get();
	}
	public void setGender(Boolean gender) {
		this.genderProperty.set(gender);
	}
	public void setAddressProperty(String address) {
		this.addressProperty.set(address);
	}
	
	public StringProperty getAddressProperty() {
		return this.addressProperty;
	}
	
	public String getAddress() {
		return this.addressProperty.get();
	}
	public void setAddress(String address) {
		this.addressProperty.set(address);
	}
}
