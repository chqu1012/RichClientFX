package de.dc.emf.javafx.xtext.demo.cu.entry.model;

import java.time.LocalDateTime;

@SuppressWarnings("all")
public class Entry {
  private int id;
  
  public int getId() {
    return this.id;
  }
  
  public void setId(final int id) {
    this.id = id;
  }
  
  private String name;
  
  public String getName() {
    return this.name;
  }
  
  public void setName(final String name) {
    this.name = name;
  }
  
  private LocalDateTime timestamp;
  
  public LocalDateTime getTimestamp() {
    return this.timestamp;
  }
  
  public void setTimestamp(final LocalDateTime timestamp) {
    this.timestamp = timestamp;
  }
}
