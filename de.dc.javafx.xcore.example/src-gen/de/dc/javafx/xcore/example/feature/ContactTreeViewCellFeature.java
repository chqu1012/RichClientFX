package de.dc.javafx.xcore.example.feature;

import de.dc.javafx.xcore.example.model.Contact;
import de.dc.javafx.xcore.lang.lib.feature.TreeCellFeature;

@SuppressWarnings("all")
public class ContactTreeViewCellFeature extends TreeCellFeature<Contact> {
  @Override
  public String getValue(final Contact item) {
    return item.getName()==null?"":item.getName();
  }
}
