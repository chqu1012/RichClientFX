package de.dc.javafx.xcore.example;

import de.dc.javafx.xcore.example.feature.NameListCellFeature;
import de.dc.javafx.xcore.example.model.Contact;
import de.dc.javafx.xcore.example.model.ContactListViewType;
import de.dc.javafx.xcore.lang.lib.BaseListView;
import de.dc.javafx.xcore.lang.lib.feature.ListCellFeature;
import de.dc.javafx.xcore.lang.lib.model.PropertyValue;
import javafx.collections.ObservableList;

@SuppressWarnings("all")
public class BaseContactListView extends BaseListView<Contact> {
  @Override
  public ListCellFeature<Contact> getCellFeature() {
    return new NameListCellFeature();
  }
  
  @Override
  public void initProperties(final ObservableList<PropertyValue> properties) {
    // TODO: To customize the propertyview details, enhanced the ContactListViewType
    for (ContactListViewType type : ContactListViewType.values()) {
    	properties.add(new PropertyValue(type.name(), ""));
    }
  }
  
  @Override
  protected void onViewSelectionChanged(final Contact oldV, final Contact newV) {
    // TODO: Implement the fields to show in propertyview
    // properties.get(0).setValue("Hello World"); 
  }
}
