package de.dc.javafx.xcore.workbench.chart.ui;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;

import de.dc.javafx.xcore.workbench.chart.XYValueFX;
import de.dc.javafx.xcore.workbench.di.DIPlatform;
import de.dc.javafx.xcore.workbench.emf.ui.factory.CommandFactory;
import de.dc.javafx.xcore.workbench.event.EventContext;
import de.dc.javafx.xcore.workbench.event.EventTopic;
import de.dc.javafx.xcore.workbench.event.IEventBroker;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.Separator;
import javafx.scene.control.SplitPane;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.TreeItem;
import javafx.scene.input.KeyCode;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class ChartFXEmfDetailTreeView extends SplitPane implements ChangeListener<TreeItem<Object>>{

	ChartFXEmfTreeView treeView = new ChartFXEmfTreeView();
	VBox vbox = new VBox(10.0);
	ObservableList<Boolean> values = FXCollections.observableArrayList();
	
	private EditingDomain editingDomain;
	private Map<EAttribute, TextField> eattributeUIMap = new HashMap<>();
	private static final String EDITED_STYLE = "-fx-background-color: red; -fx-text-fill: white;";
	
	
	public ChartFXEmfDetailTreeView() {
		setDividerPositions(0.25);
		getItems().add(treeView);
		getItems().add(vbox);
		
		vbox.setPadding(new Insets(5));
		
		treeView.getTreeView().getSelectionModel().selectedItemProperty().addListener(this);
		editingDomain = treeView.getEmfManager().getEditingDomain();
		values.add(true);
		values.add(false);
	}

	@Override
	public void changed(ObservableValue<? extends TreeItem<Object>> observable, TreeItem<Object> oldValue,
			TreeItem<Object> newValue) {
		vbox.getChildren().clear();
		eattributeUIMap.clear();
		
		Object value = newValue.getValue();
		if (value instanceof EObject) {
			EObject eObject = (EObject) value;
			EList<EAttribute> attributes = eObject.eClass().getEAllAttributes();
			vbox.getChildren().add(new Label("Press Enter to accept the Value"));
			vbox.getChildren().add(new Separator(Orientation.HORIZONTAL));
			for (EAttribute eAttribute : attributes) {
				HBox hbox = new HBox(5.0);
				Label label = new Label(eAttribute.getName());
				label.setPrefWidth(100);
				hbox.getChildren().add(label);
				
				if (eAttribute.getEType().getName().equals("EBoolean")) {
					Boolean booleanValue = eObject.eGet(eAttribute)==null? true : (boolean) eObject.eGet(eAttribute);
					
					ComboBox<Boolean> comboBox = new ComboBox<>(values);
					comboBox.getSelectionModel().select(booleanValue);
					comboBox.getSelectionModel().selectedItemProperty().addListener((ChangeListener<Boolean>) (observable1, oldValue1, newValue1) -> {
						Boolean selection = comboBox.getSelectionModel().getSelectedItem();
						Command command = new SetCommand(editingDomain, eObject, eAttribute, selection);
						editingDomain.getCommandStack().execute(command);
						
						DIPlatform.getInstance(IEventBroker.class).post(new EventContext<>(EventTopic.COMMAND_STACK_REFRESH, CommandFactory.create(command)));
					});
					hbox.getChildren().add(comboBox);
				}else {
					Button acceptButton = new Button("Accept");
					String stringValue = eObject.eGet(eAttribute)==null? "" : eObject.eGet(eAttribute).toString();
					TextField textField = new TextField(stringValue);
					textField.setOnKeyPressed(event -> {
						KeyCode code = event.getCode();
						switch (code) {
						case TAB:
							break;
						case CONTROL:
							break;
						case SHIFT:
							break;
						case ENTER:
							Command command = new SetCommand(editingDomain, eObject, eAttribute, textField.getText());
							editingDomain.getCommandStack().execute(command);
							
							DIPlatform.getInstance(IEventBroker.class).post(new EventContext<>(EventTopic.COMMAND_STACK_REFRESH, CommandFactory.create(command)));
							textField.setStyle(null);
							break;
						default:
							textField.setStyle(EDITED_STYLE);
						}
					});
					acceptButton.setOnAction(event -> {
						Command command = new SetCommand(editingDomain, eObject, eAttribute, textField.getText());
						editingDomain.getCommandStack().execute(command);
						
						DIPlatform.getInstance(IEventBroker.class).post(new EventContext<>(EventTopic.COMMAND_STACK_REFRESH, CommandFactory.create(command)));
						textField.setStyle(null);
					});
					
					eattributeUIMap.put(eAttribute, textField);
					hbox.getChildren().add(textField);
					hbox.getChildren().add(acceptButton);
				}

				vbox.getChildren().add(hbox);
			}
			Button acceptAllButton = new Button("Accept All");
			acceptAllButton.setOnAction(event -> {
				eattributeUIMap.entrySet().stream().forEach(e->{
					if (e.getValue().getStyle().equals(EDITED_STYLE)) {
						Command command = new SetCommand(editingDomain, eObject, e.getKey(), e.getValue().getText());
						editingDomain.getCommandStack().execute(command);
						
						DIPlatform.getInstance(IEventBroker.class).post(new EventContext<>(EventTopic.COMMAND_STACK_REFRESH, CommandFactory.create(command)));
						e.getValue().setStyle(null);
					}
				});
			});
			vbox.getChildren().add(acceptAllButton);
			
			HBox tableHbox = new HBox(5.0);
			ObservableList<XYValueFX> items = FXCollections.observableArrayList();
			tableHbox.getChildren().add(new TableView<XYValueFX>(items));
			vbox.getChildren().add(tableHbox);
			
			VBox buttonPane = new VBox(5.0);
			Button addButton = new Button("Add");
			addButton.setOnAction(event -> {
				final Stage dialog = new Stage();
		        dialog.setTitle("Confirmation");
		        Button yes = new Button("Yes");
		        Button no = new Button("No");

		        Label displayLabel = new Label("What do you want to do ?");
		        displayLabel.setFont(Font.font(null, FontWeight.BOLD, 14));

		        dialog.initModality(Modality.NONE);
		        dialog.initOwner(new Stage());

		        HBox dialogHbox = new HBox(20);
		        dialogHbox.setAlignment(Pos.CENTER);

		        VBox dialogVbox1 = new VBox(20);
		        dialogVbox1.setAlignment(Pos.CENTER_LEFT);

		        VBox dialogVbox2 = new VBox(20);
		        dialogVbox2.setAlignment(Pos.CENTER_RIGHT);

		        dialogHbox.getChildren().add(displayLabel);
		        dialogVbox1.getChildren().add(yes);
		        dialogVbox2.getChildren().add(no);

		        yes.addEventHandler(MouseEvent.MOUSE_CLICKED,
		                new EventHandler<MouseEvent>() {
		                    @Override
		                    public void handle(MouseEvent e) {
		                        // inside here you can use the minimize or close the previous stage//
		                        dialog.close();
		                    }
		                });
		        no.addEventHandler(MouseEvent.MOUSE_CLICKED,
		                new EventHandler<MouseEvent>() {
		                    @Override
		                    public void handle(MouseEvent e) {
		                        dialog.close();
		                    }
		                });

		        dialogHbox.getChildren().addAll(dialogVbox1, dialogVbox2);
		        Scene dialogScene = new Scene(dialogHbox, 500, 40);
		        dialogScene.getStylesheets().add("//style sheet of your choice");
		        dialog.setScene(dialogScene);
		        dialog.show();
			});
			buttonPane.getChildren().add(addButton);
			tableHbox.getChildren().add(buttonPane);
		}
	}
}
