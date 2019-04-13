package de.dc.javafx.xcore.lang.lib.feature;

import javafx.scene.control.TreeCell;
import javafx.scene.control.TreeView;
import javafx.util.Callback;

public abstract class TreeCellFeature<T> implements Callback<TreeView<T>, TreeCell<T>>{

	@Override
	public TreeCell<T> call(TreeView<T> param) {
		return new TreeCell<T>() {
			@Override
			protected void updateItem(T item, boolean empty) {
				super.updateItem(item, empty);
				if (item==null || empty) {
					setText(null);
				}
				else {
					setText(getValue(item));
				}
			}
		};
	}

	protected abstract String getValue(T item);
}
