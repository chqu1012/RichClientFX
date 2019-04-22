package de.dc.javafx.efxclipse.runtime;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.fx.emf.edit.ui.AdapterFactoryObservableList;
import org.eclipse.fx.emf.edit.ui.AdapterFactoryTableCellFactory;
import org.eclipse.fx.emf.edit.ui.EAttributeCellEditHandler;
import org.eclipse.fx.emf.edit.ui.ProxyCellValueFactory;
import org.eclipse.fx.emf.edit.ui.dnd.CellDragAdapter;
import org.eclipse.fx.emf.edit.ui.dnd.EditingDomainCellDropAdapter;

import de.dc.javafx.efxclipse.runtime.model.IEmfManager;
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
		AdapterFactoryObservableList<Object> list = new AdapterFactoryObservableList<Object>(adapterFactory, manager.getRoot());
		setItems(list);
	}
	
	public AdapterFactoryTableCellFactory<Object, Object> createColumn(String name,int columnIndex) {
		TableColumn<Object, Object> column = new TableColumn<>(name);
		column.setCellValueFactory(new ProxyCellValueFactory<Object, Object>());
		AdapterFactoryTableCellFactory<Object, Object> cellFactory = new AdapterFactoryTableCellFactory<>(adapterFactory, columnIndex);
		cellFactory.addCellCreationListener(new CellDragAdapter());
		cellFactory.addCellCreationListener(new EditingDomainCellDropAdapter(editingDomain));
		column.setCellFactory(cellFactory);
		column.setSortable(false);
		getColumns().add(column);
		return cellFactory;
	}
	
	public void createColumn(String name, int columnIndex, EAttribute modelPackageEAttribute) {
		AdapterFactoryTableCellFactory<Object,Object> cellFactory = createColumn(name, columnIndex);
		
		// add edit support
		cellFactory.addCellEditHandler(new EAttributeCellEditHandler(modelPackageEAttribute,editingDomain));
	}
}
