package de.dc.javafx.xcore.example.model;

@SuppressWarnings("all")
public class Contact {

	public Contact() {
	}
	
	private String address;

	private String name;

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Contact(String name, int age, boolean gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	public String getName() {
		return this.name;
	}

	public void setName(final String name) {
		this.name = name;
	}

	private int age;

	public int getAge() {
		return this.age;
	}

	public void setAge(final int age) {
		this.age = age;
	}

	private boolean gender;

	public boolean getGender() {
		return this.gender;
	}

	public void setGender(final boolean gender) {
		this.gender = gender;
	}
}
