package de.dc.emf.javafx.xtext.demo.cu.entry;

import de.dc.emf.javafx.xtext.demo.cu.entry.feature.BaseEntryCellFeatures;
import de.dc.emf.javafx.xtext.demo.cu.entry.model.Entry;
import de.dc.emf.javafx.xtext.demo.cu.entry.model.EntryType;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Predicate;
import javafx.beans.binding.Bindings;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.util.Callback;

@SuppressWarnings("all")
public class BaseEntryTable extends BorderPane {
  private ObservableList<Entry> masterData = FXCollections.observableArrayList();
  
  private FilteredList<Entry> filteredMasterData = new FilteredList<>(masterData, p->true);
  
  private Map<EntryType, TableColumn<Entry, Entry>> columns = new HashMap<>();
  
  private TableView<Entry> tableView =  new TableView<Entry>();
  
  private TextField searchTextfield = new TextField();
  
  private HBox topPane = new HBox();
  
  private StringProperty searchProperty = new SimpleStringProperty("");
  
  private TableColumn<Entry, Entry> idColumn;
  
  private TableColumn<Entry, Entry> nameColumn;
  
  private ObjectProperty<Predicate<Entry>> nameFilter = new SimpleObjectProperty<>();
  
  private TableColumn<Entry, Entry> timestampColumn;
  
  public BaseEntryTable() {
    initTableView();
    initTopPane();
    
    setTop(topPane);
    setCenter(tableView);
  }
  
  public void initTableView() {
    idColumn = createColumn(EntryType.Id.name(), Double.valueOf(200),  new BaseEntryCellFeatures(EntryType.Id));
    nameColumn = createColumn(EntryType.Name.name(), Double.valueOf(300),  new BaseEntryCellFeatures(EntryType.Name));
    timestampColumn = createColumn(EntryType.Timestamp.name(), Double.valueOf(200),  new BaseEntryCellFeatures(EntryType.Timestamp));
    nameFilter.bind(Bindings.createObjectBinding(() -> 
                current -> String.valueOf(current.getName()).toLowerCase().contains(searchTextfield.getText().toLowerCase()), 
                searchTextfield.textProperty()));
    tableView.setItems(filteredMasterData);
    tableView.setOnKeyReleased(e ->{ 
    	if(getTop()==null) {
    		setTop(topPane);
    	}
    	searchProperty.set(searchProperty.get()+e.getText());
    });
    filteredMasterData.predicateProperty().bind(Bindings.createObjectBinding(()->nameFilter.get(), nameFilter));
  }
  
  public void initTopPane() {
    topPane.setSpacing(10d);
    topPane.setPadding(new Insets(5d));
    
    Label label = new Label("Search:");
    label.setMaxHeight(Double.MAX_VALUE);
    
    searchTextfield.setPromptText("Search for Entrys");
    searchTextfield.textProperty().bindBidirectional(searchProperty);
    
    Label filterLabel = new Label("Filter Result:");
    filterLabel.setMaxHeight(Double.MAX_VALUE);
    
    Label filterResultlabel = new Label("0");
    filterResultlabel.setMaxHeight(Double.MAX_VALUE);
    filterResultlabel.textProperty().bind(Bindings.size(filteredMasterData).asString());						
    Label emtyLabel = new Label("");
    emtyLabel.setMaxHeight(Double.MAX_VALUE);
    emtyLabel.setMaxWidth(Double.MAX_VALUE);
    HBox.setHgrow(emtyLabel, Priority.ALWAYS);
    
    Button closeButton = new Button("Close");
    closeButton.setOnAction(e -> {
    	setTop(null);
    	searchProperty.set("");
    });
    
    topPane.getChildren().addAll(label, searchTextfield, filterLabel, filterResultlabel, emtyLabel, closeButton);
  }
  
  protected TableColumn createColumn(final String name, final Double width, final Callback cellFeatures) {
    TableColumn<Entry, Entry> column = new TableColumn(name);
    column.setPrefWidth(width);
    column.setCellValueFactory(cellFeatures);
    columns.put(EntryType.valueOf(name), column);
    tableView.getColumns().add(column);		
    return column;	
  }
  
  public void setInput(final ObservableList<Entry> items) {
    masterData.clear();
    masterData.addAll(items);
  }
  
  public void setFeatureFor(final EntryType type, final Callback<TableColumn.CellDataFeatures<Entry, Entry>, ObservableValue<Entry>> feature) {
    columns.get(type).setCellValueFactory(feature);
  }
  
  public ObservableList<Entry> getMasterData() {
    return this.masterData;
  }
  
  public FilteredList<Entry> getFilteredMasterData() {
    return this.filteredMasterData;
  }
}
