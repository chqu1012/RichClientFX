package de.dc.javafx.xcore.workbench.chart.ui;

import java.io.File;
import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.CommandParameter;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;

import de.dc.javafx.efxclipse.runtime.util.EmfUtil;
import de.dc.javafx.xcore.workbench.chart.ChartProject;
import de.dc.javafx.xcore.workbench.chart.XYValueFX;
import de.dc.javafx.xcore.workbench.chart.ui.controller.BaseChartFXEmfDetailedTreeViewController;
import de.dc.javafx.xcore.workbench.di.DIPlatform;
import de.dc.javafx.xcore.workbench.emf.IEmfManager;
import de.dc.javafx.xcore.workbench.emf.file.IEmfFileService;
import de.dc.javafx.xcore.workbench.emf.view.IEmfEditorPart;
import de.dc.javafx.xcore.workbench.event.EventContext;
import de.dc.javafx.xcore.workbench.event.EventTopic;
import de.dc.javafx.xcore.workbench.event.IEventBroker;
import de.dc.javafx.xcore.workbench.ui.factory.CommandFactory;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.TreeItem;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;

public class ChartFXEmfDetailedTreeView extends BaseChartFXEmfDetailedTreeViewController implements ChangeListener<TreeItem<Object>>, IEmfFileService, IEmfEditorPart{
	
	private ObservableList<Boolean> values = FXCollections.observableArrayList();
	private EditingDomain editingDomain;
	
	private Map<EAttribute, TextField> eattributeUIMap = new HashMap<>();
	private Map<EAttribute, TextField> childEattributesMap = new HashMap<>();
	
	private static final String EDITED_STYLE = "-fx-background-color: red; -fx-text-fill: white;";
	private ChartFXEmfTreeView treeView = new ChartFXEmfTreeView();

	public ChartFXEmfDetailedTreeView() {
		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/de/dc/javafx/xcore/workbench/chart/ui/ChartFXEmfDetailedTreeView.fxml"));
		fxmlLoader.setRoot(this);
		fxmlLoader.setController(this);
		
		try {
			fxmlLoader.load();
		} catch (IOException exception) {
			throw new RuntimeException(exception);
		}
		
		AnchorPane.setBottomAnchor(treeView, 0d);
		AnchorPane.setTopAnchor(treeView, 0d);
		AnchorPane.setLeftAnchor(treeView, 0d);
		AnchorPane.setRightAnchor(treeView, 0d);
		emfModelTreeViewContainer.getChildren().add(treeView);
		
		treeView.getTreeView().getSelectionModel().selectedItemProperty().addListener(this);
		editingDomain = treeView.getEmfManager().getEditingDomain();
		values.add(true);
		values.add(false);
	}

	@Override
	protected void onAddNewValueAction(ActionEvent event) {
	}

	@Override
	protected void onDeleteSelectionValueAction(ActionEvent event) {
		// TODO Auto-generated method stub

	}

	@Override
	protected void onEditValueAction(ActionEvent event) {
		// TODO Auto-generated method stub

	}

	@Override
	public void changed(ObservableValue<? extends TreeItem<Object>> observable, TreeItem<Object> oldValue,
			TreeItem<Object> newValue) {
		clearAllFields();
		
		Object value = newValue.getValue();
		if (value instanceof EObject) {
			EObject eObject = (EObject) value;
			
			EList<EAttribute> attributes = eObject.eClass().getEAllAttributes();
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
						executeCommand(command);
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
							executeCommand(command);
							textField.setStyle(null);
							break;
						default:
							textField.setStyle(EDITED_STYLE);
						}
					});
					acceptButton.setOnAction(event -> {
						Command command = new SetCommand(editingDomain, eObject, eAttribute, textField.getText());
						executeCommand(command);
						textField.setStyle(null);
					});
					
					eattributeUIMap.put(eAttribute, textField);
					hbox.getChildren().add(textField);
					hbox.getChildren().add(acceptButton);
				}

				attributeContainer.getChildren().add(hbox);
			}
			Button acceptAllButton = new Button("Accept All");
			acceptAllButton.setOnAction(event -> {
				eattributeUIMap.entrySet().stream().forEach(e->{
					if (e.getValue().getStyle().equals(EDITED_STYLE)) {
						Command command = new SetCommand(editingDomain, eObject, e.getKey(), e.getValue().getText());
						executeCommand(command);
						e.getValue().setStyle(null);
					}
				});
			});
			attributeContainer.getChildren().add(acceptAllButton);
			
			Collection<?> collection = editingDomain.getNewChildDescriptors(eObject, null);
			boolean showTableContainer = collection.size()==1;
			tableContainer.setVisible(showTableContainer);
			
			if (showTableContainer) {
				Object object = collection.iterator().next();
				if (object instanceof CommandParameter) {
					CommandParameter param = (CommandParameter) object;
					EObject child = (EObject) param.getValue();
					child.eClass().getEAllAttributes().forEach(e->{
						TextField textField = new TextField();
						textField.setPromptText(e.getName());
						textField.setOnKeyPressed(event -> textField.setStyle(EDITED_STYLE));
						childAttributeContainer.getChildren().add(textField);
						childEattributesMap.put(e, textField);
					});
					Button addChildButton = new Button("Add");
					addChildButton.setOnAction(e->{
						IEmfManager<ChartProject> emfManager = treeView.getEmfManager();
						String name = param.getValue().getClass().getSimpleName().replace("Impl", "");
						int id = EmfUtil.getValueByName(emfManager.getModelPackage(), name);
						EObject createdObject = emfManager.getExtendedModelFactory().create(id);
						childEattributesMap.entrySet().forEach(ks->{
							TextField textfield = ks.getValue();
							if (textfield.getStyle().equals(EDITED_STYLE)) {
								createdObject.eSet(ks.getKey(), textfield.getText());
								textfield.setText("");
								textfield.setStyle(null);
							}
						});
						Command command = AddCommand.create(editingDomain, value, id, createdObject);
						executeCommand(command);
						
						newValue.setExpanded(true);
					});
					childAttributeContainer.getChildren().add(addChildButton);
				}
			}
		}
	}
	
	private void clearAllFields() {
		attributeContainer.getChildren().clear();
		eattributeUIMap.clear();
		childAttributeContainer.getChildren().clear();
		childEattributesMap.clear();
	}

	private void executeCommand(Command command) {
		editingDomain.getCommandStack().execute(command);
		DIPlatform.getInstance(IEventBroker.class).post(new EventContext<>(EventTopic.COMMAND_STACK_REFRESH, CommandFactory.create(command)));
		Object value = treeView.getTreeView().getSelectionModel().getSelectedItem().getValue();
		if (value instanceof XYValueFX) {
			XYValueFX valueFX = (XYValueFX) value;
			value = valueFX.eContainer().eContainer();
		}
		DIPlatform.getInstance(IEventBroker.class).post(new EventContext<>("chartfx.update", value));
	}

	@Override
	public String getExtension() {
		return "chart";
	}
	
	@Override
	public void save(File file) {
		treeView.save(file);
	}
}

