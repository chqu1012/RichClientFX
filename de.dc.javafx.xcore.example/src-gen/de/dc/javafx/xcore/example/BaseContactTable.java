package de.dc.javafx.xcore.example;

import de.dc.javafx.xcore.example.feature.BaseContactCellFeatures;
import de.dc.javafx.xcore.example.model.Contact;
import de.dc.javafx.xcore.example.model.ContactType;
import de.dc.javafx.xcore.example.model.PropertyValue;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Predicate;
import javafx.beans.binding.Bindings;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.beans.value.ChangeListener;
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
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.util.Callback;

@SuppressWarnings("all")
public class BaseContactTable extends BorderPane {
  private ObservableList<Contact> masterData = FXCollections.observableArrayList();
  
  private FilteredList<Contact> filteredMasterData = new FilteredList<>(masterData, p->true);
  
  private Map<ContactType, TableColumn<Contact, Contact>> columns = new HashMap<>();
  
  private TableView<Contact> tableView =  new TableView<Contact>();
  
  private TextField searchTextfield = new TextField();
  
  private HBox topPane = new HBox();
  
  private AnchorPane rightPane = new AnchorPane();
  
  private StringProperty searchProperty = new SimpleStringProperty("");
  
  private TableView propertyView = new TableView<>();
  
  private ObservableList<PropertyValue> properties = FXCollections.observableArrayList();
  
  private TableColumn<Contact, Contact> nameColumn;
  
  private TableColumn<Contact, Contact> ageColumn;
  
  private ObjectProperty<Predicate<Contact>> ageFilter = new SimpleObjectProperty<>();
  
  private TableColumn<Contact, Contact> genderColumn;
  
  private TableColumn<Contact, Contact> addressColumn;
  
  public BaseContactTable() {
    initTableView();
    initTopPane();
    initRightPane();
    
    setTop(topPane);
    setCenter(tableView);
    
    showPropertyView(false);
    showToolbar(true);
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
  
  public void showToolbar(final Boolean showToolbar) {
    if (showToolbar) {
    	if (getTop() == null) {
    		setTop(topPane);
    	}
    } else {
    	setTop(null);
    }
  }
  
  public void initTableView() {
    nameColumn = createColumn(ContactType.Name.name(), Double.valueOf(200),  new BaseContactCellFeatures(ContactType.Name));
    ageColumn = createColumn(ContactType.Age.name(), Double.valueOf(200),  new BaseContactCellFeatures(ContactType.Age));
    genderColumn = createColumn(ContactType.Gender.name(), Double.valueOf(200),  new BaseContactCellFeatures(ContactType.Gender));
    addressColumn = createColumn(ContactType.Address.name(), Double.valueOf(200),  new BaseContactCellFeatures(ContactType.Address));
    ageFilter.bind(Bindings.createObjectBinding(() -> 
                current -> String.valueOf(current.getAge()).toLowerCase().contains(searchTextfield.getText().toLowerCase()), 
                searchTextfield.textProperty()));
    tableView.setItems(filteredMasterData);
    tableView.setOnKeyReleased(e ->{ 
    	if (e.getCode().equals(KeyCode.ESCAPE)) {
    		setTop(null);
    		searchProperty.set("");
    	}else if(e.getCode().equals(KeyCode.BACK_SPACE)){
    		if(getTop()==null) {
    			setTop(topPane);
    		}
    		searchTextfield.requestFocus();
    	}else {
    		if(getTop()==null) {
    			setTop(topPane);
    		}
    		searchProperty.set(searchProperty.get()+e.getText());
    	}
    });
    
    tableView.getSelectionModel().selectedItemProperty().addListener((ChangeListener<Contact>) (obs, oldV, newV) -> {
    	if(newV!=null){
    		properties.get(0).setValue(String.valueOf(newV.getName()));
    		properties.get(1).setValue(String.valueOf(newV.getAge()));
    		properties.get(2).setValue(String.valueOf(newV.getGender()));
    		properties.get(3).setValue(String.valueOf(newV.getAddress()));
    		propertyView.refresh();
    	}
    });
    
    filteredMasterData.predicateProperty().bind(Bindings.createObjectBinding(()->ageFilter.get(), ageFilter));
  }
  
  public void initRightPane() {
    TableColumn<PropertyValue, Object> propertyColumn = new TableColumn<>("Property");
    propertyColumn.setCellValueFactory(new PropertyValueFactory<>("property"));
    propertyView.getColumns().add(propertyColumn);
    TableColumn<PropertyValue, Object> valueColumn = new TableColumn<>("Value");
    valueColumn.setCellValueFactory(new PropertyValueFactory<>("value"));
    propertyView.getColumns().add(valueColumn);
    
    AnchorPane.setBottomAnchor(propertyView, 0d);
    AnchorPane.setTopAnchor(propertyView, 0d);
    AnchorPane.setLeftAnchor(propertyView, 0d);
    AnchorPane.setRightAnchor(propertyView, 0d);
    						    
    for (ContactType type : ContactType.values()) {
    	properties.add(new PropertyValue(type.name(), ""));
    }
    propertyView.setItems(properties);
    
    rightPane.getChildren().add(propertyView);
  }
  
  public void initTopPane() {
    topPane.setSpacing(10d);
    topPane.setPadding(new Insets(5d));
    
    Label label = new Label("Search:");
    label.setMaxHeight(Double.MAX_VALUE);
    
    searchTextfield.setPromptText("Search for Contacts by Age");
    searchTextfield.textProperty().bindBidirectional(searchProperty);
    HBox.setHgrow(searchTextfield, Priority.ALWAYS);
    
    Label filterLabel = new Label("Filter Result:");
    filterLabel.setMaxHeight(Double.MAX_VALUE);
    
    Label filterResultlabel = new Label("0");
    filterResultlabel.setMaxHeight(Double.MAX_VALUE);
    filterResultlabel.textProperty().bind(Bindings.size(filteredMasterData).asString());						
    Label emtyLabel = new Label("");
    emtyLabel.setMaxHeight(Double.MAX_VALUE);
    emtyLabel.setMaxWidth(Double.MAX_VALUE);
    HBox.setHgrow(emtyLabel, Priority.ALWAYS);
    
    			    Button showPropertyButton = new Button("Show Property View");
    showPropertyButton.setOnAction(e->{
    	if(getRight()==null) {
    		setRight(rightPane);
    		showPropertyButton.setText("Show Property View");
    	}else {
    		setRight(null);
    		showPropertyButton.setText("Hide Property View");
    	}
    });
    
    Button closeButton = new Button("Close");
    closeButton.setOnAction(e -> {
    	setTop(null);
    	searchProperty.set("");
    });
    
    topPane.getChildren().addAll(label, searchTextfield, filterLabel, filterResultlabel, emtyLabel, showPropertyButton, closeButton);
  }
  
  protected TableColumn createColumn(final String name, final Double width, final Callback cellFeatures) {
    TableColumn<Contact, Contact> column = new TableColumn(name);
    column.setPrefWidth(width);
    column.setCellValueFactory(cellFeatures);
    columns.put(ContactType.valueOf(name), column);
    tableView.getColumns().add(column);		
    return column;	
  }
  
  public void setInput(final ObservableList<Contact> items) {
    masterData.clear();
    masterData.addAll(items);
  }
  
  public void setFeatureFor(final ContactType type, final Callback<TableColumn.CellDataFeatures<Contact, Contact>, ObservableValue<Contact>> feature) {
    columns.get(type).setCellValueFactory(feature);
  }
  
  public ObservableList<Contact> getMasterData() {
    return this.masterData;
  }
  
  public FilteredList<Contact> getFilteredMasterData() {
    return this.filteredMasterData;
  }
}
