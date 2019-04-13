package de.dc.javafx.xcore.lang.lib;

import javafx.beans.value.ChangeListener;
import javafx.scene.Node;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.input.KeyCode;
import javafx.util.Callback;

public abstract class BaseListView<T> extends BaseView<T> {

	protected ListView<T> view;

	@Override
	protected void initView() {
		view.setItems(filteredMasterData);
	    view.getSelectionModel().selectedItemProperty().addListener((ChangeListener<T>) (obs, oldV, newV) -> {
			if (newV != null) {
				onViewSelectionChanged(oldV, newV);
				propertyView.refresh();
			}
		});
	    view.setOnKeyReleased(e -> {
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
	    
	    setRight(propertyView);
	    setCenter(view);
	    
	    showPropertyView(true);
	    showToolbar(true);
	}

	protected abstract void onViewSelectionChanged(T oldV, T newV);

	@Override
	protected Node getCenterPane() {
		view = new ListView<>();
		return view;
	}
}
