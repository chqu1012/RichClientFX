package de.dc.javafx.xcore.workbench.ui.control;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.fx.emf.edit.ui.AdapterFactoryObservableList;
import org.eclipse.fx.emf.edit.ui.AdapterFactoryTableCellFactory;
import org.eclipse.fx.emf.edit.ui.EAttributeCellEditHandler;
import org.eclipse.fx.emf.edit.ui.ProxyCellValueFactory;

import de.dc.javafx.xcore.workbench.emf.IEmfManager;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class EmfTableView<T> extends TableView<Object>{

	protected IEmfManager<T> manager;
	protected EditingDomain editingDomain;
	protected ComposedAdapterFactory adapterFactory;

	public EmfTableView(IEmfManager<T> manager) {
		this.manager = manager;
		this.adapterFactory = manager.getAdapterFactory();
		this.editingDomain = manager.getEditingDomain();
		setEditable(true);
		AdapterFactoryObservableList<Object> list = new AdapterFactoryObservableList<>(adapterFactory, manager.getRoot());
		setItems(list);
	}
	
	public TableColumn<Object, Object> createColumn(String name) {
		TableColumn<Object, Object> column = new TableColumn<>(name);
		column.setCellValueFactory(new ProxyCellValueFactory<Object, Object>());
		// TODO: Not showing column values
//		AdapterFactoryTableCellFactory<Object, Object> cellFactory = new AdapterFactoryTableCellFactory<>(adapterFactory, columnIndex);
//		cellFactory.addCellCreationListener(new CellDragAdapter());
//		cellFactory.addCellCreationListener(new EditingDomainCellDropAdapter(editingDomain));
//		column.setCellFactory(cellFactory);
		column.setSortable(false);
		getColumns().add(column);
		return column;
	}
	
	public void setEditable(TableColumn<Object, Object> column, EAttribute modelPackageEAttribute) {
		// add edit support
		AdapterFactoryTableCellFactory<Object, Object> cellFactory = (AdapterFactoryTableCellFactory<Object, Object>) column.getCellFactory();
		cellFactory.addCellEditHandler(new EAttributeCellEditHandler(modelPackageEAttribute,editingDomain));
	}
}
