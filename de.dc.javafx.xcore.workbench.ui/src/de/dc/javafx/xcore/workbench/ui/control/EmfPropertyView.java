package de.dc.javafx.xcore.workbench.ui.control;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;

import com.google.common.eventbus.Subscribe;

import de.dc.javafx.xcore.workbench.di.DIPlatform;
import de.dc.javafx.xcore.workbench.event.EventContext;
import de.dc.javafx.xcore.workbench.event.IEventBroker;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TreeItem;
import javafx.scene.layout.BorderPane;

public class EmfPropertyView extends EmfView {

	private ObservableList<EAttribute> properties = FXCollections.observableArrayList();
	private TableView<EAttribute> tableView;
	private EObject cuurentSelection;

	public EmfPropertyView() {
		DIPlatform.getInstance(IEventBroker.class).register(this);
	}

	@Override
	protected void createPartControl(BorderPane parent) {
		tableView = new TableView<>();
		TableColumn<EAttribute, String> propertyColumn = new TableColumn<>("Property");
		TableColumn<EAttribute, String> valueColumn = new TableColumn<>("Value");

		propertyColumn.setCellValueFactory(param -> new SimpleStringProperty(param.getValue().getName()));
		valueColumn.setCellValueFactory(param ->{ 
			if (cuurentSelection==null || param.getValue()==null) {
				return new SimpleStringProperty("");
			}
			return new SimpleStringProperty(cuurentSelection.eGet(param.getValue())+"");
		});

		tableView.getColumns().add(propertyColumn);
		tableView.getColumns().add(valueColumn);

		tableView.setItems(properties);

		parent.setCenter(tableView);

	}

	@Subscribe
	private void updateProperties(EventContext<?> context) {
		properties.clear();
		if (context.getInput() != null) {
			Object object = context.getInput();
			if (object instanceof EObject) {
				cuurentSelection = (EObject) object;
				for (EAttribute attr : cuurentSelection.eClass().getEAllAttributes()) {
					properties.add(attr);
				}
				tableView.setItems(properties);
			}
		}
	}
}
