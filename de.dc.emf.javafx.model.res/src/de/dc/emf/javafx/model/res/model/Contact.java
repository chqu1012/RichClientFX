package de.dc.emf.javafx.model.res.model;

public class Contact extends BaseContact<Person>{

	public Contact(Person p) {
		super(p);
	}
	
	@Override
	public void map(Person t) {
		setAge(t.getAge());
		setName(t.getName());
	}

}
