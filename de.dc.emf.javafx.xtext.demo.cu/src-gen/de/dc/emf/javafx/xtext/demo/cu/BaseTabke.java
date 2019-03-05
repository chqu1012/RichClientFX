package de.dc.emf.javafx.xtext.demo.cu;

import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

@SuppressWarnings("all")
public class BaseTabke extends TableView {
  private ObservableList masterData;
  
  private FilteredList filteredMasterData;
  
  private TableColumn nameColumn;
  
  private TableColumn ageColumn;
  
  private TableColumn genderColumn;
  
  private TableColumn addressColumn;
}
