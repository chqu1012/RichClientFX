package de.dc.javafx.xcore.workbench.ui.control;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;

import com.google.common.eventbus.Subscribe;

import de.dc.javafx.xcore.workbench.di.DIPlatform;
import de.dc.javafx.xcore.workbench.emf.event.IEmfSelectionService;
import de.dc.javafx.xcore.workbench.event.EventContext;
import de.dc.javafx.xcore.workbench.event.EventTopic;
import de.dc.javafx.xcore.workbench.event.IEventBroker;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.scene.layout.BorderPane;

public class EmfPropertyView extends EmfView {

	private ObservableList<EAttribute> properties = FXCollections.observableArrayList();
	private TableView<EAttribute> tableView;
	private EObject cuurentSelection;
	private EditingDomain currentEditingDomain;
	
	public EmfPropertyView() {
		DIPlatform.getInstance(IEventBroker.class).register(this);
	}

	@Override
	protected void createPartControl(BorderPane parent) {
		tableView = new TableView<>();
		TableColumn<EAttribute, String> propertyColumn = new TableColumn<>("Property");
		TableColumn<EAttribute, String> valueColumn = new TableColumn<>("Value");

		propertyColumn.setPrefWidth(200);
		valueColumn.setPrefWidth(400);
		
		propertyColumn.setCellValueFactory(param -> new SimpleStringProperty(param.getValue().getName()));
		valueColumn.setCellFactory(TextFieldTableCell.<EAttribute>forTableColumn());
		valueColumn.setOnEditCommit(evt -> {
			if(currentEditingDomain!=null) {
				EAttribute selectedAttribute = tableView.getSelectionModel().getSelectedItem();
				Object value = EcoreUtil.createFromString(selectedAttribute.getEAttributeType(), evt.getNewValue());
				SetCommand command = new SetCommand(currentEditingDomain, cuurentSelection, selectedAttribute, value);
				currentEditingDomain.getCommandStack().execute(command);
				
				DIPlatform.getInstance(IEventBroker.class).post(new EventContext<>(EventTopic.COMMAND_STACK_REFRESH, command));
			}
		});
		valueColumn.setCellValueFactory(param ->{ 
			if (cuurentSelection==null || param.getValue()==null) {
				return new SimpleStringProperty("");
			}
			return new SimpleStringProperty(cuurentSelection.eGet(param.getValue())+"");
		});

		tableView.getColumns().add(propertyColumn);
		tableView.getColumns().add(valueColumn);

		tableView.setItems(properties);
		tableView.setEditable(true);
		
		parent.setCenter(tableView);

	}

	@Subscribe
	private void updateProperties(EventContext<?> context) {
		if (context.getInput() != null) {
			currentEditingDomain= DIPlatform.getInstance(IEmfSelectionService.class).getEmfManager().get().getEditingDomain();
			Object object = context.getInput();
			if (object instanceof EObject) {
				properties.clear();
				cuurentSelection = (EObject) object;
				for (EAttribute attr : cuurentSelection.eClass().getEAllAttributes()) {
					properties.add(attr);
				}
				tableView.setItems(properties);
			}
		}
	}
}
