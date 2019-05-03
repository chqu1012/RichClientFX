package de.dc.javafx.lang.contact.ui.model;

@SuppressWarnings("all")
public class Contact {
  private String firstname;
  
  public String getFirstname() {
    return this.firstname;
  }
  
  public void setFirstname(final String firstname) {
    this.firstname = firstname;
  }
  
  private String lastname;
  
  public String getLastname() {
    return this.lastname;
  }
  
  public void setLastname(final String lastname) {
    this.lastname = lastname;
  }
  
  private Integer age;
  
  public Integer getAge() {
    return this.age;
  }
  
  public void setAge(final Integer age) {
    this.age = age;
  }
  
  private Boolean gender;
  
  public Boolean getGender() {
    return this.gender;
  }
  
  public void setGender(final Boolean gender) {
    this.gender = gender;
  }
}
