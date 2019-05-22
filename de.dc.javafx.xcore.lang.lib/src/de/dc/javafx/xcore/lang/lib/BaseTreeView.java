package de.dc.javafx.xcore.lang.lib;

import java.util.HashMap;
import java.util.Map;

import de.dc.javafx.xcore.lang.lib.feature.TreeCellFeature;
import de.dc.javafx.xcore.lang.lib.model.TreeElement;
import javafx.beans.value.ChangeListener;
import javafx.scene.Node;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.input.KeyCode;

public abstract class BaseTreeView<T extends TreeElement> extends BaseView<T> {

	protected TreeItem<T> rootNode;

	protected Map<String, TreeItem<T>> registry;

	protected TreeView<T> treeView;

	public static final String ROOT_KEY = "root";

	@Override
	protected void initView() {
		treeView.setShowRoot(false);
		treeView.setCellFactory(getCellFeature());
	    registry.put(ROOT_KEY, rootNode);
	    treeView.setRoot(rootNode);
	    treeView.getSelectionModel().selectedItemProperty().addListener((ChangeListener<TreeItem<T>>) (obs, oldV, newV) -> {
			if (newV != null) {
				onTreeViewSelectionChanged(oldV, newV);
				propertyView.refresh();
			}
		});
	    treeView.setOnKeyReleased(e -> {
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
	    setCenter(treeView);
	    
	    showPropertyView(true);
	    showToolbar(true);
	}

	protected abstract void onTreeViewSelectionChanged(TreeItem<T> oldV, TreeItem<T> newV);

	protected abstract TreeCellFeature<T> getCellFeature();
	
	@Override
	protected Node getCenterPane() {
		rootNode = new TreeItem<>();
		registry = new HashMap<>();
		treeView = new TreeView<>();
		return treeView;
	}

	  public void addItemTo(String parentKey, T item) {
	    TreeItem<T> node = registry.get(parentKey);
	    if (node!=null) {
	    	TreeItem<T> treeItem = new TreeItem<>(item);
	    	node.getChildren().add(treeItem);
	    	registry.put(item.getName(), treeItem);
	    }
	  }
}
