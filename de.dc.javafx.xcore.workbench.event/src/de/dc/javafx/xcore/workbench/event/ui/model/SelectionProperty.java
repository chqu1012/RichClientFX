package de.dc.javafx.xcore.workbench.event.ui.model;

public class SelectionProperty {

	private String name;
	private String value;
	private Object object;

	public SelectionProperty() {
	}

	public SelectionProperty(String name, String value, String object) {
		this.name = name;
		this.value = value;
		this.object = object;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public Object getObject() {
		return object;
	}

	public void setObject(Object object) {
		this.object = object;
	}
	
}
