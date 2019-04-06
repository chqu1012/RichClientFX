package de.dc.emf.javafx.xtext.demo.cu;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.util.Callback;

@SuppressWarnings("all")
public class BaseTabke<T> extends TableView<T> {
  private ObservableList masterData = FXCollections.observableArrayList();
  
  private FilteredList filteredMasterData = new FilteredList<>(masterData, p->true);
  
  private TableColumn<T, T> nameColumn;
  
  private TableColumn<T, T> ageColumn;
  
  private TableColumn<T, T> genderColumn;
  
  private TableColumn<T, T> addressColumn;
  
  public BaseTabke() {
    nameColumn = createColumn(ContactType.Name.name(), Double.valueOf(200),  new BaseContactCellFeatures(ContactType.Name));
    ageColumn = createColumn(ContactType.Age.name(), Double.valueOf(200),  new BaseContactCellFeatures(ContactType.Age));
    genderColumn = createColumn(ContactType.Gender.name(), Double.valueOf(200),  new BaseContactCellFeatures(ContactType.Gender));
    addressColumn = createColumn(ContactType.Address.name(), Double.valueOf(200),  new BaseContactCellFeatures(ContactType.Address));
    setItems(filteredMasterData);
  }
  
  protected TableColumn createColumn(final String name, final Double width, final Callback cellFeatures) {
    TableColumn<T, T> column = new TableColumn(name);
    column.setPrefWidth(width);
    column.setCellValueFactory(cellFeatures);
    getColumns().add(column);		
    return column;	
  }
  
  protected void setInput(final ObservableList<T> items) {
    masterData.clear();
    masterData.addAll(items);
  }
}
