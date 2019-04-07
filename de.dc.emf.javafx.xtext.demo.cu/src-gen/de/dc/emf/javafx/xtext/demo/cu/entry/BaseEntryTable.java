package de.dc.emf.javafx.xtext.demo.cu.entry;

import de.dc.emf.javafx.xtext.demo.cu.entry.feature.BaseEntryCellFeatures;
import de.dc.emf.javafx.xtext.demo.cu.entry.model.EntryType;
import java.util.HashMap;
import java.util.Map;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.util.Callback;

@SuppressWarnings("all")
public class BaseEntryTable<T> extends TableView<T> {
  private ObservableList<T> masterData = FXCollections.observableArrayList();
  
  private FilteredList<T> filteredMasterData = new FilteredList<>(masterData, p->true);
  
  private Map<EntryType, TableColumn<T, T>> columns = new HashMap<>();
  
  private TableColumn<T, T> idColumn;
  
  private TableColumn<T, T> nameColumn;
  
  private TableColumn<T, T> timestampColumn;
  
  public BaseEntryTable() {
    idColumn = createColumn(EntryType.Id.name(), Double.valueOf(200),  new BaseEntryCellFeatures(EntryType.Id));
    nameColumn = createColumn(EntryType.Name.name(), Double.valueOf(300),  new BaseEntryCellFeatures(EntryType.Name));
    timestampColumn = createColumn(EntryType.Timestamp.name(), Double.valueOf(200),  new BaseEntryCellFeatures(EntryType.Timestamp));
    setItems(filteredMasterData);
  }
  
  protected TableColumn createColumn(final String name, final Double width, final Callback cellFeatures) {
    TableColumn<T, T> column = new TableColumn(name);
    column.setPrefWidth(width);
    column.setCellValueFactory(cellFeatures);
    columns.put(EntryType.valueOf(name), column);
    getColumns().add(column);		
    return column;	
  }
  
  public void setInput(final ObservableList<T> items) {
    masterData.clear();
    masterData.addAll(items);
  }
  
  public void setFeatureFor(final EntryType type, final Callback<TableColumn.CellDataFeatures<T, T>, ObservableValue<T>> feature) {
    columns.get(type).setCellValueFactory(feature);
  }
  
  public ObservableList<T> getMasterData() {
    return this.masterData;
  }
  
  public FilteredList<T> getFilteredMasterData() {
    return this.filteredMasterData;
  }
}
