package de.dc.emf.javafx.model.res.controls.cell;

import de.dc.emf.javafx.model.res.model.Person;
import javafx.scene.control.TableCell;

public class NameColumnCellFeatures extends TableCell<Person, Person> {

	@Override
	protected void updateItem(Person item, boolean empty) {
		super.updateItem(item, empty);
		if (item==null && empty) {
			setText(null);
		}else {
			setText(item.getName());
		}
	}
}
