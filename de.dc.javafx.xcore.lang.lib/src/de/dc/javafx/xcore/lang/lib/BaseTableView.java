package de.dc.javafx.xcore.lang.lib;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Predicate;

import de.dc.javafx.xcore.lang.lib.feature.CellValueFeature;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.Node;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.input.KeyCode;
import javafx.util.Callback;

public abstract class BaseTableView<T> extends BaseView<T> {

	protected Map<String, TableColumn<T, T>> columns;

	protected TableView<T> tableView;

	@Override
	protected Node getCenterPane() {
		columns = new HashMap<>();
		tableView = new TableView<T>();
		return tableView;
	}

	@Override
	protected void initView() {
		initColumns();
		
		tableView.setItems(filteredMasterData);
		tableView.setOnKeyReleased(e -> {
			if (e.getCode().equals(KeyCode.ESCAPE)) {
				setTop(null);
				searchProperty.set("");
			} else if (e.getCode().equals(KeyCode.BACK_SPACE)) {
				if (getTop() == null) {
					setTop(topPane);
				}
				searchTextfield.requestFocus();
			} else {
				if (getTop() == null) {
					setTop(topPane);
				}
				searchProperty.set(searchProperty.get() + e.getText());
			}
		});

		tableView.getSelectionModel().selectedItemProperty().addListener((ChangeListener<T>) (obs, oldV, newV) -> {
			if (newV != null) {
				onTableViewSelectionChanged(oldV, newV);
				propertyView.refresh();
			}
		});

		filteredMasterData.predicateProperty().bind(initSearchfilterBinding());
	}

	protected abstract ObservableValue<? extends Predicate<? super T>> initSearchfilterBinding();

	protected abstract void initColumns();

	protected abstract void onTableViewSelectionChanged(T oldV, T newV);

	protected TableColumn<T,T> createColumn(String name, Double width, Callback<TableColumn.CellDataFeatures<T, T>, ObservableValue<T>> cellFeatures) {
		TableColumn<T, T> column = new TableColumn<T,T>(name);
		column.setPrefWidth(width);
		column.setCellValueFactory(cellFeatures);
		columns.put(name, column);
		tableView.getColumns().add(column);
		return column;
	}

}
