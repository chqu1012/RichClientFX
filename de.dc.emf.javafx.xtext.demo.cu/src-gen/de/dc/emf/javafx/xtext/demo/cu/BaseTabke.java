package de.dc.emf.javafx.xtext.demo.cu;

import de.dc.emf.javafx.xtext.demo.cu.feature.BaseContactCellFeatures;
import de.dc.emf.javafx.xtext.demo.cu.model.ContactType;
import java.util.HashMap;
import java.util.Map;
import javafx.beans.binding.Bindings;
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
public class BaseTabke<T> extends BorderPane {
  private ObservableList<T> masterData = FXCollections.observableArrayList();
  
  private FilteredList<T> filteredMasterData = new FilteredList<>(masterData, p->true);
  
  private Map<ContactType, TableColumn<T, T>> columns = new HashMap<>();
  
  private TableView<T> tableView =  new TableView<T>();
  
  private TextField searchTextfield = new TextField();
  
  private HBox topPane = new HBox();
  
  private StringProperty searchProperty = new SimpleStringProperty("");
  
  private TableColumn<T, T> nameColumn;
  
  private TableColumn<T, T> ageColumn;
  
  private TableColumn<T, T> genderColumn;
  
  private TableColumn<T, T> addressColumn;
  
  public BaseTabke() {
    initTableView();
    initTopPane();
    
    setTop(topPane);
    setCenter(tableView);
  }
  
  public void initTableView() {
    nameColumn = createColumn(ContactType.Name.name(), Double.valueOf(300),  new BaseContactCellFeatures(ContactType.Name));
    ageColumn = createColumn(ContactType.Age.name(), Double.valueOf(200),  new BaseContactCellFeatures(ContactType.Age));
    genderColumn = createColumn(ContactType.Gender.name(), Double.valueOf(200),  new BaseContactCellFeatures(ContactType.Gender));
    addressColumn = createColumn(ContactType.Address.name(), Double.valueOf(200),  new BaseContactCellFeatures(ContactType.Address));
    tableView.setItems(filteredMasterData);
    tableView.setOnKeyReleased(e ->{ 
    	if(getTop()==null) {
    		setTop(topPane);
    	}
    	searchProperty.set(searchProperty.get()+e.getText());
    });
  }
  
  public void initTopPane() {
    topPane.setSpacing(10d);
    topPane.setPadding(new Insets(5d));
    
    Label label = new Label("Search:");
    label.setMaxHeight(Double.MAX_VALUE);
    
    searchTextfield.setPromptText("Search for entries");
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
    TableColumn<T, T> column = new TableColumn(name);
    column.setPrefWidth(width);
    column.setCellValueFactory(cellFeatures);
    columns.put(ContactType.valueOf(name), column);
    tableView.getColumns().add(column);		
    return column;	
  }
  
  public void setInput(final ObservableList<T> items) {
    masterData.clear();
    masterData.addAll(items);
  }
  
  public void setFeatureFor(final ContactType type, final Callback<TableColumn.CellDataFeatures<T, T>, ObservableValue<T>> feature) {
    columns.get(type).setCellValueFactory(feature);
  }
  
  public ObservableList<T> getMasterData() {
    return this.masterData;
  }
  
  public FilteredList<T> getFilteredMasterData() {
    return this.filteredMasterData;
  }
}
