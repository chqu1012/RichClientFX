package de.dc.javafx.xcore.workbench.ui.demo.ui;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Field;

import org.apache.commons.io.IOUtils;

import de.dc.javafx.xcore.code.preview.ui.FXPreview;
import de.dc.javafx.xcore.workbench.ui.demo.ui.EmfExampleTableView.Person;
import javafx.beans.value.ObservableValue;

public class ExtendedFXPreview extends FXPreview {
	
	@Override
	public void changed(ObservableValue<? extends Object> obs, Object oldValue, Object newValue) {
		if (newValue instanceof Person) {
			Person p = (Person) newValue;
			try {
				String code = IOUtils.toString(new FileInputStream(new File("templates/PersonTemplate.tpl")), "UTF-8");
				Field[] declaredFields = p.getClass().getDeclaredFields();
				for (Field field : declaredFields) {
					field.setAccessible(true);
					System.out.println("%"+field.getName().toUpperCase()+"%");
					code = code.replaceAll("%"+field.getName().toUpperCase()+"%", field.get(p).toString());
				}
				setContent(code);
			} catch (IOException | IllegalArgumentException | IllegalAccessException e) {
				e.printStackTrace();
			}
		}
	}

}
