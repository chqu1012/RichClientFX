package de.dc.javafx.xcore.lang.lib.feature;

import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.util.Callback;

public abstract class ListCellFeature<T> implements Callback<ListView<T>, ListCell<T>> {

	@Override
	public ListCell<T> call(ListView<T> param) {
		return new ListCell<T>() {
			@Override
			protected void updateItem(T item, boolean empty) {
				super.updateItem(item, empty);
				if (item==null || empty) {
					setText(null);
				}else {
					setText(getValue(item));
				}
			}
		};
	}

	protected abstract String getValue(T item);
}
