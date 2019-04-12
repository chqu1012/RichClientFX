package de.dc.javafx.xcore.example;

import de.dc.javafx.xcore.example.model.Contact;
import java.util.HashMap;
import java.util.Map;
import javafx.scene.control.TreeCell;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.layout.BorderPane;

@SuppressWarnings("all")
public class BaseContactTreeView extends BorderPane {
  protected TreeItem<Contact> rootNode = new TreeItem<Contact>();
  
  protected Map<String, TreeItem<Contact>> registry = new HashMap<String, TreeItem<Contact>>();
  
  protected TreeView<Contact> treeView = new TreeView<>();
  
  public static final String ROOT_KEY = "root";
  
  public BaseContactTreeView() {
    treeView.setShowRoot(false);
    treeView.setCellFactory(p -> new TreeCell<Contact>() {
    	@Override
    	protected void updateItem(Contact item, boolean empty) {
    		super.updateItem(item, empty);
    		if (item==null || empty) {
    			setText(null);
    		}else {
    			setText(item.getName());
    		}
    	}
    });
    
    registry.put(ROOT_KEY, rootNode);
    treeView.setRoot(rootNode);
    
    setCenter(treeView);
  }
  
  public void addItemTo(final String parentKey, final Contact item) {
    TreeItem<Contact> node = registry.get(parentKey);
    if (node!=null) {
    	TreeItem<Contact> treeItem = new TreeItem<>(item);
    	node.getChildren().add(treeItem);
    	registry.put(item.getName(), treeItem);
    }
  }
}
