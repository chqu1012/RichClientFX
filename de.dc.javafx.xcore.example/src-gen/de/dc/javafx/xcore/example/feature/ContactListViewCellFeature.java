package de.dc.javafx.xcore.example.feature;

import de.dc.javafx.xcore.example.model.Contact;
import de.dc.javafx.xcore.lang.lib.feature.ListCellFeature;

@SuppressWarnings("all")
public class ContactListViewCellFeature extends ListCellFeature<Contact> {
  @Override
  public String getValue(final Contact item) {
    return item.toString();
  }
}
