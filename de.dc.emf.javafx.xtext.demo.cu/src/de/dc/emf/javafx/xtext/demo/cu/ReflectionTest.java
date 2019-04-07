package de.dc.emf.javafx.xtext.demo.cu;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import de.dc.emf.javafx.xtext.demo.cu.feature.ContactCellFeatures;
import de.dc.emf.javafx.xtext.demo.cu.model.ContactType;

public class ReflectionTest {

	public static void main(String[] args) {
		try {
			Constructor<ContactCellFeatures> constructor = ContactCellFeatures.class.getConstructor(ContactType.class);
			
			ContactType type = ContactType.valueOf("Address");
			
			Class clz = Class.forName(type.getClass().getName());
			Object o = Enum.valueOf(clz, "Address");
			ContactCellFeatures contactCellFeatures = constructor.newInstance(o);
		} catch (NoSuchMethodException | SecurityException | InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
