package de.dc.javafx.xcore.workbench.ui.control;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.fx.emf.edit.ui.AdapterFactoryObservableList;
import org.eclipse.fx.emf.edit.ui.AdapterFactoryTableCellFactory;
import org.eclipse.fx.emf.edit.ui.ProxyCellValueFactory;
import org.eclipse.fx.emf.edit.ui.dnd.CellDragAdapter;
import org.eclipse.fx.emf.edit.ui.dnd.EditingDomainCellDropAdapter;

import de.dc.javafx.xcore.workbench.emf.IEmfManager;
import de.dc.javafx.xcore.workbench.emf.ui.handler.EAttributeCellEditHandler;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class EmfTableView<T> extends TableView<T>{

	protected IEmfManager<T> manager;
	protected EditingDomain editingDomain;
	protected ComposedAdapterFactory adapterFactory;

	public EmfTableView(IEmfManager<T> manager) {
		this.manager = manager;
		this.adapterFactory = manager.getAdapterFactory();
		this.editingDomain = manager.getEditingDomain();
		setEditable(true);
		AdapterFactoryObservableList<T> list = new AdapterFactoryObservableList<>(adapterFactory, manager.getRoot());
		setItems(list);
	}
	
	public TableColumn<T, Object> createColumn(String name, int columnIndex) {
		TableColumn<T, Object> column = new TableColumn<>(name);
		column.setCellValueFactory(new ProxyCellValueFactory<T, Object>());
		AdapterFactoryTableCellFactory<T, Object> cellFactory = new AdapterFactoryTableCellFactory<>(adapterFactory, columnIndex);
		cellFactory.addCellCreationListener(new CellDragAdapter());
		cellFactory.addCellCreationListener(new EditingDomainCellDropAdapter(editingDomain));
		column.setCellFactory(cellFactory);
		column.setSortable(false);
		getColumns().add(column);
		return column;
	}
	
	public void setEditable(TableColumn<T, Object> column, EAttribute modelPackageEAttribute) {
		// add edit support
		AdapterFactoryTableCellFactory<T, Object> cellFactory = (AdapterFactoryTableCellFactory<T, Object>) column.getCellFactory();
		cellFactory.addCellEditHandler(new EAttributeCellEditHandler(modelPackageEAttribute,editingDomain));
	}
}
