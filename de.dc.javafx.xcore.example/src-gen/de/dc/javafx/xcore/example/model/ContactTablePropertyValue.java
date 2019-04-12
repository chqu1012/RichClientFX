package de.dc.javafx.xcore.example.model;

@SuppressWarnings("all")
public class ContactTablePropertyValue {
  private String property;
  
  public String getProperty() {
    return this.property;
  }
  
  public void setProperty(final String property) {
    this.property = property;
  }
  
  private String value;
  
  public String getValue() {
    return this.value;
  }
  
  public void setValue(final String value) {
    this.value = value;
  }
  
  public ContactTablePropertyValue(final String property, final String value) {
    this.property = property;
    this.value = value;
  }
}
