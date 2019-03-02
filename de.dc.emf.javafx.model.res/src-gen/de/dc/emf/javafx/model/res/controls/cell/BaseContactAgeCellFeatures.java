package de.dc.emf.javafx.model.res.controls.cell;

import de.dc.emf.javafx.model.res.model.*;
import javafx.scene.control.*;

public class BaseContactAgeCellFeatures extends TableCell<Contact, Contact> {

	@Override
	protected void updateItem(Contact item, boolean empty) {
		super.updateItem(item, empty);
		if (item==null && empty) {
			setText(null);
		}else {
			setText(String.valueOf(item.getAge()));
		}
	}
}
