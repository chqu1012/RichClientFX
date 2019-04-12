package de.dc.javafx.xcore.example;

import de.dc.javafx.xcore.example.model.Contact;
import de.dc.javafx.xcore.example.model.ContactTreeViewPropertyValue;
import de.dc.javafx.xcore.example.model.ContactType;
import java.util.HashMap;
import java.util.Map;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TreeCell;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;

@SuppressWarnings("all")
public class BaseContactTreeView extends BorderPane {
  private ObservableList<ContactTreeViewPropertyValue> properties = FXCollections.observableArrayList();
  
  private TableView propertyView = new TableView<>();
  
  private AnchorPane rightPane = new AnchorPane();
  
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
    
    initRightPane();
    
    setRight(rightPane);
    setCenter(treeView);
    
    showPropertyView(true);
  }
  
  public void showPropertyView(final Boolean showPropertyView) {
    if (showPropertyView) {
    	if (getRight() == null) {
    		setRight(propertyView);
    	}
    } else {
    	setRight(null);
    }
  }
  
  public void initRightPane() {
    TableColumn<ContactTreeViewPropertyValue, Object> propertyColumn = new TableColumn<>("Property");
    propertyColumn.setCellValueFactory(new PropertyValueFactory<>("property"));
    propertyView.getColumns().add(propertyColumn);
    TableColumn<ContactTreeViewPropertyValue, Object> valueColumn = new TableColumn<>("Value");
    valueColumn.setCellValueFactory(new PropertyValueFactory<>("value"));
    propertyView.getColumns().add(valueColumn);
    
    AnchorPane.setBottomAnchor(propertyView, 0d);
    AnchorPane.setTopAnchor(propertyView, 0d);
    AnchorPane.setLeftAnchor(propertyView, 0d);
    AnchorPane.setRightAnchor(propertyView, 0d);
    						    
    for (ContactType type : ContactType.values()) {
    	properties.add(new ContactTreeViewPropertyValue(type.name(), ""));
    }
    propertyView.setItems(properties);
    
    rightPane.getChildren().add(propertyView);
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
