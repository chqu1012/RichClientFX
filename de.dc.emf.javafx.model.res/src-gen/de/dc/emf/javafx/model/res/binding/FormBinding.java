package de.dc.emf.javafx.model.res.binding;

import javafx.beans.property.*;
import javafx.collections.*;

public class FormBinding{

	private StringProperty nameProperty = new SimpleStringProperty();	
	private IntegerProperty ageProperty = new SimpleIntegerProperty();	
	private BooleanProperty genderProperty = new SimpleBooleanProperty();	
	private ObjectProperty obProperty = new SimpleObjectProperty();	
	
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
	public void setAgeProperty(Integer age) {
		this.ageProperty.set(age);
	}
	
	public IntegerProperty getAgeProperty() {
		return this.ageProperty;
	}
	
	public Integer getAge() {
		return this.ageProperty.get();
	}
	public void setAge(Integer age) {
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
	public void setObProperty(Object ob) {
		this.obProperty.set(ob);
	}
	
	public ObjectProperty getObProperty() {
		return this.obProperty;
	}
	
	public Object getOb() {
		return this.obProperty.get();
	}
	public void setOb(Object ob) {
		this.obProperty.set(ob);
	}
}
