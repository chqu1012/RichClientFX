package de.dc.emf.javafx.model.res.binding;

import javafx.beans.property.*;
import javafx.collections.*;

public class FormBinding{

	private StringProperty namePropertyProperty = new SimpleStringProperty();	
	private IntegerProperty agePropertyProperty = new SimpleIntegerProperty();	
	private BooleanProperty genderPropertyProperty = new SimpleBooleanProperty();	
	private ObjectProperty obPropertyProperty = new SimpleObjectProperty();	
	
	public void setNamePropertyProperty(String name) {
		this.namePropertyProperty.set(name);
	}
	
	public StringProperty getNamePropertyProperty() {
		return this.namePropertyProperty;
	}
	
	public String getName() {
		return this.namePropertyProperty.get();
	}
	public void setName(String name) {
		this.namePropertyProperty.set(name);
	}
	public void setAgePropertyProperty(Integer age) {
		this.agePropertyProperty.set(age);
	}
	
	public IntegerProperty getAgePropertyProperty() {
		return this.agePropertyProperty;
	}
	
	public Integer getAge() {
		return this.agePropertyProperty.get();
	}
	public void setAge(Integer age) {
		this.agePropertyProperty.set(age);
	}
	public void setGenderPropertyProperty(Boolean gender) {
		this.genderPropertyProperty.set(gender);
	}
	
	public BooleanProperty getGenderPropertyProperty() {
		return this.genderPropertyProperty;
	}
	
	public Boolean getGender() {
		return this.genderPropertyProperty.get();
	}
	public void setGender(Boolean gender) {
		this.genderPropertyProperty.set(gender);
	}
	public void setObPropertyProperty(Object ob) {
		this.obPropertyProperty.set(ob);
	}
	
	public ObjectProperty getObPropertyProperty() {
		return this.obPropertyProperty;
	}
	
	public Object getOb() {
		return this.obPropertyProperty.get();
	}
	public void setOb(Object ob) {
		this.obPropertyProperty.set(ob);
	}
}
