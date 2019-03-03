package de.dc.emf.javafx.model.res.binding;

import javafx.beans.property.*;
import javafx.collections.*;

public class FormBinding{

	private StringProperty nameProperty = new SimpleStringProperty();	
	private IntegerProperty ageProperty = new SimpleIntegerProperty();	
	private BooleanProperty genderProperty = new SimpleBooleanProperty();	
	private ObjectProperty obProperty = new SimpleObjectProperty();	
	
	public void setNameProperty(String name) {
		nameProperty.set(name);
	}
	
	public String getNameProperty() {
		return nameProperty.get();
	}
	
	public StringProperty getName() {
		return nameProperty;
	}
	public void setName(String name) {
		this.nameProperty.set(name);
	}
	public void setAgeProperty(Integer age) {
		ageProperty.set(age);
	}
	
	public Integer getAgeProperty() {
		return ageProperty.get();
	}
	
	public IntegerProperty getAge() {
		return ageProperty;
	}
	public void setAge(Integer age) {
		this.ageProperty.set(age);
	}
	public void setGenderProperty(Boolean gender) {
		genderProperty.set(gender);
	}
	
	public Boolean getGenderProperty() {
		return genderProperty.get();
	}
	
	public BooleanProperty getGender() {
		return genderProperty;
	}
	public void setGender(Boolean gender) {
		this.genderProperty.set(gender);
	}
	public void setObProperty(Object ob) {
		obProperty.set(ob);
	}
	
	public Object getObProperty() {
		return obProperty.get();
	}
	
	public ObjectProperty getOb() {
		return obProperty;
	}
	public void setOb(Object ob) {
		this.obProperty.set(ob);
	}
}
