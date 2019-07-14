package de.dc.javafx.xcore.workbench.emf.ui;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.CommandParameter;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.IItemLabelProvider;

import de.dc.javafx.xcore.workbench.di.DIPlatform;
import de.dc.javafx.xcore.workbench.emf.IEmfManager;
import de.dc.javafx.xcore.workbench.emf.ui.controller.BaseEmfDetailedTreeViewController;
import de.dc.javafx.xcore.workbench.emf.ui.factory.CommandFactory;
import de.dc.javafx.xcore.workbench.emf.ui.util.EmfUtil;
import de.dc.javafx.xcore.workbench.emf.view.IEmfEditorPart;
import de.dc.javafx.xcore.workbench.event.EventContext;
import de.dc.javafx.xcore.workbench.event.EventTopic;
import de.dc.javafx.xcore.workbench.event.IEventBroker;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Tooltip;
import javafx.scene.control.TreeItem;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;

public abstract class EmfDetailedTreeView<T> extends BaseEmfDetailedTreeViewController
		implements ChangeListener<TreeItem<Object>>, IEmfEditorPart<T> {

	private ObservableList<Boolean> values = FXCollections.observableArrayList();
	private EditingDomain editingDomain;

	private Map<EAttribute, TextField> eattributeUIMap = new HashMap<>();
	private Map<EAttribute, TextField> childEattributesMap = new HashMap<>();

	private static final String EDITED_STYLE = "-fx-background-color: red; -fx-text-fill: white;";
	protected EmfTreeModelView<T> treeView;

	public EmfDetailedTreeView() {
		FXMLLoader fxmlLoader = new FXMLLoader(
				getClass().getResource("/de/dc/javafx/xcore/workbench/emf/ui/EmfDetailedTreeView.fxml"));
		fxmlLoader.setRoot(this);
		fxmlLoader.setController(this);

		try {
			fxmlLoader.load();
		} catch (IOException exception) {
			throw new RuntimeException(exception);
		}

		treeView = initEmfModelTreeView();
		treeView.getTreeView().getSelectionModel().selectedItemProperty().addListener(this);
		editingDomain = treeView.getEmfManager().getEditingDomain();

		AnchorPane.setBottomAnchor(treeView, 0d);
		AnchorPane.setTopAnchor(treeView, 0d);
		AnchorPane.setLeftAnchor(treeView, 0d);
		AnchorPane.setRightAnchor(treeView, 0d);
		emfModelTreeViewContainer.getChildren().add(treeView);

		values.add(true);
		values.add(false);
	}

	public EmfTreeModelView<T> getTreeView(){
		return treeView;
	}
	
	protected void addToToolbar(Node node) {
		toolbar.getChildren().add(node);
	}

	protected abstract EmfTreeModelView<T> initEmfModelTreeView();

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

			initAttributeFormular(eObject);
			initChildPropertiesToolbar(eObject);
			initTableContent(newValue, value, eObject);
		}
	}

	private void initChildPropertiesToolbar(EObject eObject) {
		IEmfManager<T> manager = treeView.getEmfManager();
		Collection<?> collection = editingDomain.getNewChildDescriptors(eObject, null);
		childToolbar.getChildren().clear();
		for (Object object : collection) {
			if (object instanceof CommandParameter) {
				CommandParameter commandParameter = (CommandParameter) object;
				String name = commandParameter.getValue().getClass().getSimpleName().replace("Impl", "");
				String menuText = ((IItemLabelProvider) manager.getAdapterFactory().adapt(commandParameter.getValue(),
						IItemLabelProvider.class)).getText(commandParameter.getValue());
				Object icon = ((IItemLabelProvider) manager.getAdapterFactory().adapt(commandParameter.getValue(),
						IItemLabelProvider.class)).getImage(commandParameter.getValue());
				
				Button button = new Button();
				button.setTooltip(new Tooltip(menuText));
				button.setGraphic(new ImageView(new Image(((URL) icon).toExternalForm())));
				button.setOnAction(event -> {
					EClassifier eClassifier = manager.getModelPackage().getEClassifier(name);
					EObject obj = manager.getExtendedModelFactory().create((EClass) eClassifier);

					int id = EmfUtil.getValueByName(manager.getModelPackage(), name);
					Command command = AddCommand.create(editingDomain, eObject, id, obj);
					command.execute();

					DIPlatform.getInstance(IEventBroker.class).post(new EventContext<>(EventTopic.COMMAND_STACK_REFRESH, CommandFactory.create(command)));
					treeView.getTreeView().getSelectionModel().getSelectedItem().setExpanded(true);
					
					ObservableList<TreeItem<Object>> children = treeView.getTreeView().getSelectionModel().getSelectedItem().getChildren();
					treeView.getTreeView().getSelectionModel().select(children.get(children.size()-1));
				});
				childToolbar.getChildren().add(button);
			}
		}
	}

	private void initTableContent(TreeItem<Object> newValue, Object value, EObject eObject) {
		Collection<?> collection = editingDomain.getNewChildDescriptors(eObject, null);
		boolean showTableContainer = collection.size() == 1;
		tableContainer.setVisible(showTableContainer);

		if (showTableContainer) {
			Object object = collection.iterator().next();
			if (object instanceof CommandParameter) {
				CommandParameter param = (CommandParameter) object;
				EObject child = (EObject) param.getValue();
				child.eClass().getEAllAttributes().forEach(e -> {
					TextField textField = new TextField();
					textField.setPromptText(e.getName());
					textField.setOnKeyPressed(event -> textField.setStyle(EDITED_STYLE));
					childAttributeContainer.getChildren().add(textField);
					childEattributesMap.put(e, textField);
				});
				Button addChildButton = new Button("Add");
				addChildButton.setOnAction(e -> {
					IEmfManager<T> emfManager = treeView.getEmfManager();
					String name = param.getValue().getClass().getSimpleName().replace("Impl", "");

					EClassifier eClassifier = treeView.getEmfManager().getModelPackage().getEClassifier(name);
					EObject obj = treeView.getEmfManager().getExtendedModelFactory().create((EClass) eClassifier);

					int id = EmfUtil.getValueByName(emfManager.getModelPackage(), name);
					EObject createdObject = emfManager.getExtendedModelFactory().create(obj.eClass());
					childEattributesMap.entrySet().forEach(ks -> {
						TextField textfield = ks.getValue();
						if (textfield.getStyle().equals(EDITED_STYLE)) {
							if (ks.getKey().getEType().getName().contains("Double")) {
								createdObject.eSet(ks.getKey(), Double.parseDouble(textfield.getText()));
							} else {
								createdObject.eSet(ks.getKey(), textfield.getText());
							}
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

	private void initAttributeFormular(EObject eObject) {
		EList<EAttribute> attributes = eObject.eClass().getEAllAttributes();
		for (EAttribute eAttribute : attributes) {
			HBox hbox = new HBox(5.0);
			Label label = new Label(eAttribute.getName());
			label.setPrefWidth(100);
			hbox.getChildren().add(label);
			
			if (eAttribute.getEType().getName().equals("EBoolean")) {
				Boolean booleanValue = eObject.eGet(eAttribute) == null ? true : (boolean) eObject.eGet(eAttribute);

				ComboBox<Boolean> comboBox = new ComboBox<>(values);
				comboBox.getSelectionModel().select(booleanValue);
				comboBox.getSelectionModel().selectedItemProperty()
						.addListener((ChangeListener<Boolean>) (observable1, oldValue1, newValue1) -> {
							Boolean selection = comboBox.getSelectionModel().getSelectedItem();
							Command command = new SetCommand(editingDomain, eObject, eAttribute, selection);
							executeCommand(command);
						});
				hbox.getChildren().add(comboBox);
			}else if (eAttribute.getEType() instanceof EEnum) {
				EEnum enumeration = (EEnum) eAttribute.getEAttributeType();
				EList<EEnumLiteral> literals = enumeration.getELiterals();

				EEnumLiteral selectedLiteral = enumeration.getEEnumLiteral(eAttribute.getDefaultValueLiteral());
				
				ComboBox<Enumerator> enumCombo = new ComboBox<>(FXCollections.observableArrayList(literals));
				enumCombo.getSelectionModel().select(selectedLiteral);
				enumCombo.getSelectionModel().selectedItemProperty()
						.addListener((ChangeListener<Enumerator>) (observable1, oldValue1, newValue1) -> {
							Enumerator selection = enumCombo.getSelectionModel().getSelectedItem();
							Command command = new SetCommand(editingDomain, eObject, eAttribute, selection);
							executeCommand(command);
						});
				hbox.getChildren().add(enumCombo);
			}else {
				Button acceptButton = new Button("Accept");
				String stringValue = eObject.eGet(eAttribute) == null ? "" : eObject.eGet(eAttribute).toString();
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
						setValue(eObject, eAttribute, textField);
						break;
					default:
						textField.setStyle(EDITED_STYLE);
					}
				});
				acceptButton.setOnAction(event -> setValue(eObject, eAttribute, textField));

				eattributeUIMap.put(eAttribute, textField);
				hbox.getChildren().add(textField);
				hbox.getChildren().add(acceptButton);
			}

			attributeContainer.getChildren().add(hbox);
		}
		Button acceptAllButton = new Button("Accept All");
		acceptAllButton.setOnAction(event -> {
			eattributeUIMap.entrySet().stream().forEach(e -> {
				if (e.getValue().getStyle().equals(EDITED_STYLE)) {
					setValue(eObject, e.getKey(),  e.getValue());
				}
			});
		});
		attributeContainer.getChildren().add(acceptAllButton);
	}

	private void setValue(EObject eObject, EAttribute eAttribute, TextField textField) {
		Command command = null;
		if (eAttribute.getEType().getName().contains("Double")) {
			command = new SetCommand(editingDomain, eObject, eAttribute,
					Double.parseDouble(textField.getText()));
		} else if (eAttribute.getEType().getName().contains("Integer") || eAttribute.getEType().getName().contains("Int")) {
			command = new SetCommand(editingDomain, eObject, eAttribute,
					Integer.parseInt(textField.getText()));
		}else {
			command = new SetCommand(editingDomain, eObject, eAttribute, textField.getText());
		}
		executeCommand(command);
		textField.setStyle(null);
	}

	private void clearAllFields() {
		attributeContainer.getChildren().clear();
		eattributeUIMap.clear();
		childAttributeContainer.getChildren().clear();
		childEattributesMap.clear();
	}

	private void executeCommand(Command command) {
		editingDomain.getCommandStack().execute(command);
		DIPlatform.getInstance(IEventBroker.class)
				.post(new EventContext<>(EventTopic.COMMAND_STACK_REFRESH, CommandFactory.create(command)));
		Object value = treeView.getTreeView().getSelectionModel().getSelectedItem().getValue();
		DIPlatform.getInstance(IEventBroker.class).post(new EventContext<>("chartfx.update", value));
	}

	@Override
	public String getExtension() {
		return treeView.getEmfManager().getModelPackage().getName();
	}

	@Override
	public void save(File file) {
		treeView.save(file);
	}

	@Override
	public T load(File file) {
		return treeView.load(file);
	}
}
