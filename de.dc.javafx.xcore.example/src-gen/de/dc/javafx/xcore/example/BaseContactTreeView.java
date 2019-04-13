package de.dc.javafx.xcore.example;

import de.dc.javafx.xcore.example.feature.ContactTreeViewCellFeature;
import de.dc.javafx.xcore.example.model.Contact;
import de.dc.javafx.xcore.example.model.ContactTreeViewType;
import de.dc.javafx.xcore.lang.lib.BaseTreeView;
import de.dc.javafx.xcore.lang.lib.feature.TreeCellFeature;
import de.dc.javafx.xcore.lang.lib.model.PropertyValue;
import javafx.collections.ObservableList;
import javafx.scene.control.TreeItem;

@SuppressWarnings("all")
public class BaseContactTreeView extends BaseTreeView<Contact> {
  @Override
  public TreeCellFeature<Contact> getCellFeature() {
    return new ContactTreeViewCellFeature();
  }
  
  @Override
  public void initProperties(final ObservableList<PropertyValue> properties) {
    for (ContactTreeViewType type : ContactTreeViewType.values()) {
    	properties.add(new PropertyValue(type.name(), ""));
    }
  }
  
  @Override
  protected void onTreeViewSelectionChanged(final TreeItem<Contact> oldV, final TreeItem<Contact> newV) {
    // TODO: Implement the fields to show in propertyview
    // properties.get(0).setValue("Hello World");
  }
}
