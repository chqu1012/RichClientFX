package de.dc.javafx.xcore.workbench.emf.ui;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import de.dc.javafx.xcore.workbench.di.DIPlatform;
import de.dc.javafx.xcore.workbench.emf.event.IEmfSelectionService;
import de.dc.javafx.xcore.workbench.event.ui.SelectionViewer;
import de.dc.javafx.xcore.workbench.event.ui.model.SelectionProperty;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.scene.control.TreeItem;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TreeItemPropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class EmfSelectionViewer extends SelectionViewer implements ChangeListener<Object> {

	private static final Logger LOG = Logger.getLogger(EmfSelectionViewer.class); 
	
	public static final String ID = "de.dc.javafx.xcore.workbench.emf.ui.EmfSelectionViewer";

	private ObservableList<SelectionProperty> attributeProperties = FXCollections.observableArrayList();
	private ObservableList<SelectionProperty> methodsProperties = FXCollections.observableArrayList();

	private FilteredList<SelectionProperty> fitleredAttributeProperties = new FilteredList<>(attributeProperties,
			p -> true);
	private FilteredList<SelectionProperty> fitleredMethodsProperties = new FilteredList<>(methodsProperties,
			p -> true);


	private static final Image classIcon = new Image(EmfSelectionViewer.class.getResourceAsStream("/de/dc/javafx/xcore/workbench/emf/ui/icons/class_obj.png"));
	private static final Image methodIcon = new Image(EmfSelectionViewer.class.getResourceAsStream("/de/dc/javafx/xcore/workbench/emf/ui/icons/methpub_obj.png"));
	private static final Image interfaceIcon = new Image(EmfSelectionViewer.class.getResourceAsStream("/de/dc/javafx/xcore/workbench/emf/ui/icons/int_obj.png"));
	
	private static final Image publicFieldIcon = new Image(EmfSelectionViewer.class.getResourceAsStream("/de/dc/javafx/xcore/workbench/emf/ui/icons/field_public_obj.png"));
	private static final Image privateFieldIcon = new Image(EmfSelectionViewer.class.getResourceAsStream("/de/dc/javafx/xcore/workbench/emf/ui/icons/field_private_obj.png"));
	private static final Image protectedFieldIcon = new Image(EmfSelectionViewer.class.getResourceAsStream("/de/dc/javafx/xcore/workbench/emf/ui/icons/field_protected_obj.png"));

	private TreeItem<SelectionProperty> root = new TreeItem<>();

	public EmfSelectionViewer() {
		DIPlatform.getInstance(IEmfSelectionService.class).addListener(this);

		attributeNameColumn.setCellValueFactory(new PropertyValueFactory<SelectionProperty, String>("name"));
		attributeValueColumn.setCellValueFactory(new PropertyValueFactory<SelectionProperty, String>("value"));
		attributeTableView.setItems(fitleredAttributeProperties);

		methodNameColumn.setCellValueFactory(new PropertyValueFactory<SelectionProperty, String>("name"));
		methodValueColumn.setCellValueFactory(new PropertyValueFactory<SelectionProperty, String>("value"));
		methodTableVIew.setItems(fitleredMethodsProperties);

		typeNameColumn.setCellValueFactory(new TreeItemPropertyValueFactory<SelectionProperty, String>("name"));
		typeValueColumn.setCellValueFactory(new TreeItemPropertyValueFactory<SelectionProperty, String>("value"));
		typeTreeTableView.setRoot(root);

		showNullValuesCheckBox.selectedProperty()
				.addListener((ChangeListener<Boolean>) (observable, oldValue, newValue) -> {
					if (newValue) {
						fitleredMethodsProperties.setPredicate(t -> true);
						fitleredAttributeProperties.setPredicate(t -> true);
					} else {
						fitleredMethodsProperties.setPredicate(t -> !t.getValue().equals("null"));
						fitleredAttributeProperties.setPredicate(t -> !t.getValue().equals("null"));
					}
				});
		
		searchText.textProperty().addListener((ChangeListener<String>) (arg0, arg1, newValue) -> {
			fitleredAttributeProperties.setPredicate(p-> p.getName().toLowerCase().contains(newValue));
			fitleredMethodsProperties.setPredicate(p->p.getName().toLowerCase().contains(newValue));
		});
	}

	@Override
	public void changed(ObservableValue<? extends Object> observable, Object oldValue, Object newValue) {
		if (newValue instanceof TreeItem) {
			TreeItem<?> item = (TreeItem<?>) newValue;
			Object selection = item.getValue();
			selectedTypeLabel.setText(selection.getClass().getCanonicalName());
			attributeProperties.clear();
			methodsProperties.clear();
			root.getChildren().clear();

			initAttributes(item.getValue());
			initMethods(item.getValue());
			initTreeMethods(item.getValue());
		}
	}

	private void initTreeMethods(Object newValue) {
		SelectionProperty value = new SelectionProperty();
		value.setName(newValue.getClass().getSimpleName());
		root.setValue(value);
		root.setGraphic(new ImageView(classIcon));
		root.setExpanded(true);
		initTreeMethod(root, newValue);
	}

	private void initTreeMethod(TreeItem<SelectionProperty> root, Object newValue) {
		Class<?> clazz = newValue.getClass();

		addFields(root, newValue);
		addInterfaces(root, newValue);
		
		TreeItem<SelectionProperty> currentParentItem = root;
		
		while (clazz != Object.class && !clazz.isAssignableFrom(MinimalEObjectImpl.class)) {
			SelectionProperty newRoot = new SelectionProperty();
			newRoot.setName(clazz.getSimpleName());
			TreeItem<SelectionProperty> newRootItem = new TreeItem<>(newRoot, new ImageView(classIcon));
			newRootItem.setExpanded(true);
			currentParentItem.getChildren().add(newRootItem);

			currentParentItem = newRootItem;
			addMethods(newValue, clazz, newRootItem);

			clazz = clazz.getSuperclass();
			newRoot.setName(clazz.getSimpleName());
		}

	}

	private void addInterfaces(TreeItem<SelectionProperty> root, Object newValue) {
		for (Class<?> intferface : newValue.getClass().getInterfaces()) {
			SelectionProperty selectionProperty = new SelectionProperty();
			selectionProperty.setName(intferface.getSimpleName());
			selectionProperty.setObject(intferface);
			TreeItem<SelectionProperty> interfaceTreeItem = new TreeItem<>(selectionProperty, new ImageView(interfaceIcon));
			addFields(interfaceTreeItem, newValue);
			addMethods(newValue, intferface, interfaceTreeItem);
			
			root.getChildren().add(interfaceTreeItem);
		}
	}

	private void addMethods(Object newValue, Class<?> object, TreeItem<SelectionProperty> objectTreeItem) {
		for (Method method : object.getDeclaredMethods()) {
			method.setAccessible(true);
			try {
				SelectionProperty item = new SelectionProperty();
				String name = method.getName();
				Object value = null;
				if (method.getParameterCount() == 0) {
					value = method.invoke(newValue);
				}
				item.setName(name+"()");
				item.setValue(String.valueOf(value));
				item.setObject(newValue);
				objectTreeItem.getChildren().add(new TreeItem<SelectionProperty>(item, new ImageView(methodIcon)));
			} catch (IllegalArgumentException | IllegalAccessException | InvocationTargetException e) {
				e.printStackTrace();
			}
		}
	}

	private void addFields(TreeItem<SelectionProperty> root, Object newValue) {
		for (Field field : newValue.getClass().getDeclaredFields()) {
			SelectionProperty selectionProperty = new SelectionProperty();
			selectionProperty.setName(field.getName());
			selectionProperty.setObject(field);
			TreeItem<SelectionProperty> fieldTreeItem = new TreeItem<>(selectionProperty, new ImageView(getImageByFieldVisibility(field)));
			root.getChildren().add(fieldTreeItem);
		}
	}

	private Image getImageByFieldVisibility(Field field) {
		switch (field.getModifiers()) {
		case Modifier.PUBLIC:
			return publicFieldIcon;
		case Modifier.PRIVATE:
			return privateFieldIcon;
		case Modifier.PROTECTED:
			return protectedFieldIcon;
		default:
			return publicFieldIcon;
		}
	}
	
	private void initMethods(Object newValue) {
		List<Method> declaredMethods = getMethods(newValue);
		for (Method method : declaredMethods) {
			method.setAccessible(true);
			try {
				SelectionProperty item = new SelectionProperty();
				String name = method.getName();
				Object value = null;
				if (method.getParameterCount() == 0) {
					value = method.invoke(newValue);
				}
				item.setName(name);
				item.setValue(String.valueOf(value));
				item.setObject(newValue);
				methodsProperties.add(item);
			} catch (IllegalArgumentException | IllegalAccessException | InvocationTargetException e) {
				LOG.error("Failed to invoke method "+method.getName() +" for the class "+newValue.getClass().getName(), e);
			}
		}
		methodsProperties.sort((o1, o2) -> o1.getName().compareTo(o2.getName()));

	}

	private void initAttributes(Object newValue) {
		List<Field> declaredFields = getFields(newValue);
		for (Field field : declaredFields) {
			field.setAccessible(true);
			try {
				SelectionProperty item = new SelectionProperty();
				String name = field.getName();
				Object value = field.get(newValue);
				item.setName(name);
				item.setValue(String.valueOf(value));
				item.setObject(newValue);
				attributeProperties.add(item);
			} catch (IllegalArgumentException | IllegalAccessException e) {
				e.printStackTrace();
			}
		}
		attributeProperties.sort((o1, o2) -> o1.getName().compareTo(o2.getName()));
	}

	private <T> List<Field> getFields(T t) {
		List<Field> fields = new ArrayList<>();
		Class<?> clazz = t.getClass();
		while (clazz != Object.class) {
			fields.addAll(Arrays.asList(clazz.getDeclaredFields()));
			if (showAllSuperClassFieldsCheckBox.isSelected()) {
				clazz = clazz.getSuperclass();
			}else {
				clazz = Object.class;
			}
		}
		return fields;
	}

	private <T> List<Method> getMethods(T t) {
		List<Method> methods = new ArrayList<>();
		Class<?> clazz = t.getClass();
		while (clazz != Object.class) {
			methods.addAll(Arrays.asList(clazz.getDeclaredMethods()));
			if (showAllSuperClassFieldsCheckBox.isSelected()) {
				clazz = clazz.getSuperclass();
			}else {
				clazz = Object.class;
			}
		}
		return methods;
	}
}
