package de.dc.emf.javafx.xtext.demo.contact.model;

public class Contact{

	private String forename;
	private String familyName;
	private int age;
	private boolean gender;
	private String address;
	
	public Contact(){
	}
	
	public Contact(String forename, String familyName, int age, boolean gender, String address){
		this.forename=forename;
		this.familyName=familyName;
		this.age=age;
		this.gender=gender;
		this.address=address;
	}
	
	public String getForename(){
		return forename;
	}

	public void setForename(String forename) {
		this.forename = forename;
	}
	public String getFamilyName(){
		return familyName;
	}

	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}
	public int getAge(){
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	public boolean getGender(){
		return gender;
	}

	public void setGender(boolean gender) {
		this.gender = gender;
	}
	public String getAddress(){
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
}
