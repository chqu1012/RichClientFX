package de.dc.javafx.xcore.lang.lib;

import de.dc.javafx.xcore.lang.lib.model.PropertyValue;
import javafx.beans.binding.Bindings;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;

public abstract class BaseView<T> extends BorderPane {

	protected ObservableList<T> masterData = FXCollections.observableArrayList();

	protected FilteredList<T> filteredMasterData = new FilteredList<>(masterData, p -> true);

	protected TextField searchTextfield = new TextField();

	protected HBox topPane = new HBox();

	protected StringProperty searchProperty = new SimpleStringProperty("");

	protected TableView<PropertyValue> propertyView = new TableView<>();

	protected ObservableList<PropertyValue> properties = FXCollections.observableArrayList();

	private Boolean showToolbar = true;

	private Boolean showPropertyView = true;

	public BaseView() {
	    initTopPane();
	    initRightPane();
	    
	    setCenter(getCenterPane());
	    initView();
	    
	    showPropertyView(true);
	    showToolbar(true);
	  }

	protected abstract void initView();

	protected abstract Node getCenterPane();

	public void showPropertyView(final Boolean showPropertyView) {
		this.showPropertyView = showPropertyView;
		if (showPropertyView) {
			if (getRight() == null) {
				setRight(propertyView);
			}
		} else {
			setRight(null);
		}
	}

	public void showToolbar(final Boolean showToolbar) {
		this.showToolbar = showToolbar;
		if (showToolbar) {
			if (getTop() == null) {
				setTop(topPane);
			}
		} else {
			setTop(null);
		}
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

		initProperties(properties);
		propertyView.setItems(properties);
	}

	protected abstract void initProperties(ObservableList<PropertyValue> properties);

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
		showPropertyButton.setOnAction(e -> {
			if (showPropertyView) {
				if (getRight() == null) {
					setRight(propertyView);
					showPropertyButton.setText("Hide Property View");
				} else {
					setRight(null);
					showPropertyButton.setText("Show Property View");
				}
			}
		});

		Button closeButton = new Button("Close");
		closeButton.setOnAction(e -> {
			setTop(null);
			searchProperty.set("");
		});

		topPane.getChildren().addAll(label, searchTextfield, filterLabel, filterResultlabel, emtyLabel,
				showPropertyButton, closeButton);
		
		setTop(topPane);
	}

	public void setInput(final ObservableList<T> items) {
		masterData.clear();
		masterData.addAll(items);
	}

	public ObservableList<T> getMasterData() {
		return this.masterData;
	}

	public FilteredList<T> getFilteredMasterData() {
		return this.filteredMasterData;
	}
}
