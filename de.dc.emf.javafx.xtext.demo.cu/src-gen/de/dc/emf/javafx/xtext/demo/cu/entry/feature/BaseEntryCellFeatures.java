package de.dc.emf.javafx.xtext.demo.cu.entry.feature;

import de.dc.emf.javafx.xtext.demo.cu.entry.model.Entry;
import de.dc.emf.javafx.xtext.demo.cu.entry.model.EntryType;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.TableColumn;
import javafx.util.Callback;

@SuppressWarnings("all")
public class BaseEntryCellFeatures implements Callback<TableColumn.CellDataFeatures<Entry, Entry>, ObservableValue<Entry>> {
  private EntryType type;
  
  public BaseEntryCellFeatures(final EntryType type) {
    this.type = type;
  }
  
  @Override
  public ObservableValue call(final TableColumn.CellDataFeatures<Entry, Entry> feature) {
    return new SimpleStringProperty(getText(feature.getValue()));
  }
  
  protected String getText(final Entry item) {
    switch (type) {
    	case Id:
    		return getId(item);
    	case Name:
    		return getName(item);
    	case Timestamp:
    		return getTimestamp(item);
    	default:
    		return "";
    	}
  }
  
  protected String getId(final Entry item) {
    return String.valueOf(item.getId());
  }
  
  protected String getName(final Entry item) {
    return String.valueOf(item.getName());
  }
  
  protected String getTimestamp(final Entry item) {
    return String.valueOf(item.getTimestamp());
  }
}
