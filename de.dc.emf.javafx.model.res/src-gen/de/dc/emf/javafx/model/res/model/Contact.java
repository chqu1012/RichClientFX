package de.dc.emf.javafx.model.res.model;

public class Contact{

	private String name;
	private int age;
	private Boolean gender;
	
	public Contact(){
	}
	
	public Contact(String name, int age, Boolean gender){
		this.name=name;
		this.age=age;
		this.gender=gender;
	}
	
	public String getName(){
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public int getAge(){
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	public Boolean getGender(){
		return gender;
	}

	public void setGender(Boolean gender) {
		this.gender = gender;
	}
}
