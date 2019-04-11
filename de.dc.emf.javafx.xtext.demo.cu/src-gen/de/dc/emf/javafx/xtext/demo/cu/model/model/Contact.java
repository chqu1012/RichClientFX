package de.dc.emf.javafx.xtext.demo.cu.model.model;

@SuppressWarnings("all")
public class Contact {
  private String name;
  
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
  
  private String address;
  
  public String getAddress() {
    return this.address;
  }
  
  public void setAddress(final String address) {
    this.address = address;
  }
}
