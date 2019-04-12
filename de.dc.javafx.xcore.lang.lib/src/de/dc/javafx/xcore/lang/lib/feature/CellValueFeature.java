package de.dc.javafx.xcore.lang.lib.feature;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableColumn.CellDataFeatures;
import javafx.util.Callback;

public abstract class CellValueFeature<T> implements Callback<TableColumn.CellDataFeatures<T, T>, ObservableValue<T>> {

	@Override
	public ObservableValue call(CellDataFeatures<T, T> param) {
		T value = param.getValue();
		String content = getText(value) == null? "" : getText(value);
		return new SimpleStringProperty(content);
	}

	protected abstract String getText(T value);

}
