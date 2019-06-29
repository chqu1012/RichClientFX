package de.dc.javafx.xcore.workbench.emf.ui;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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

public class EmfSelectionViewer extends SelectionViewer implements ChangeListener<Object> {

	public static final String ID = "de.dc.javafx.xcore.workbench.emf.ui.EmfSelectionViewer";

	private ObservableList<SelectionProperty> attributeProperties = FXCollections.observableArrayList();
	private ObservableList<SelectionProperty> methodsProperties = FXCollections.observableArrayList();

	private FilteredList<SelectionProperty> fitleredAttributeProperties = new FilteredList<>(attributeProperties,
			p -> true);
	private FilteredList<SelectionProperty> fitleredMethodsProperties = new FilteredList<>(methodsProperties,
			p -> true);

	private TreeItem<SelectionProperty> root = new TreeItem<>();

	public EmfSelectionViewer() {
		DIPlatform.getInstance(IEmfSelectionService.class).addListener(this);

		attributeNameColumn.setCellValueFactory(new PropertyValueFactory<SelectionProperty, String>("name"));
		attributeValueColumn.setCellValueFactory(new PropertyValueFactory<SelectionProperty, String>("value"));
		attributeTableView.setItems(fitleredAttributeProperties);

		methodNameColumn.setCellValueFactory(new PropertyValueFactory<SelectionProperty, String>("name"));
		methodValueColumn.setCellValueFactory(new PropertyValueFactory<SelectionProperty, String>("value"));
		methodTableVIew.setItems(fitleredMethodsProperties);

		typeNameColumn.setCellValueFactory(new TreeItemPropertyValueFactory<SelectionProperty, String>("className"));
		typeMethodColumn.setCellValueFactory(new TreeItemPropertyValueFactory<SelectionProperty, String>("name"));
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
		value.setClassName(newValue.getClass().getSimpleName());
		root.setValue(value);
		root.setExpanded(true);
		initTreeMethod(root, newValue);
	}

	private void initTreeMethod(TreeItem<SelectionProperty> root, Object newValue) {
		Class<?> clazz = newValue.getClass();
		while (clazz != Object.class && clazz != MinimalEObjectImpl.class) {
			SelectionProperty newRoot = new SelectionProperty();
			newRoot.setClassName(newValue.getClass().getSimpleName());
			TreeItem<SelectionProperty> newRootItem = new TreeItem<>(newRoot);
			newRootItem.setExpanded(true);
			root.getChildren().add(newRootItem);

			for (Method method : clazz.getDeclaredMethods()) {
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
					newRootItem.getChildren().add(new TreeItem<SelectionProperty>(item));
				} catch (IllegalArgumentException | IllegalAccessException | InvocationTargetException e) {
					e.printStackTrace();
				}
			}
			clazz = clazz.getSuperclass();
			newRoot.setClassName(clazz.getSimpleName());
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
				e.printStackTrace();
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
			clazz = clazz.getSuperclass();
		}
		return fields;
	}

	private <T> List<Method> getMethods(T t) {
		List<Method> methods = new ArrayList<>();
		Class<?> clazz = t.getClass();
		while (clazz != Object.class) {
			methods.addAll(Arrays.asList(clazz.getDeclaredMethods()));
			clazz = clazz.getSuperclass();
		}
		return methods;
	}
}
