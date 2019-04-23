/******************************************************************************* 
 * Copyright (c) 2013 TESIS DYNAware GmbH and others. 
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Eclipse Public License v1.0 
 * which accompanies this distribution, and is available at 
 * http://www.eclipse.org/legal/epl-v10.html 
 * 
 * Contributors: 
 *     Torsten Sommer <torsten.sommer@tesis.de> - initial API and implementation 
 *******************************************************************************/
package de.dc.javafx.efxclipse.runtime;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.fx.emf.edit.ui.AdapterFactoryTreeItem;
import org.eclipse.fx.emf.edit.ui.AdapterFactoryTreeTableCellFactory;
import org.eclipse.fx.emf.edit.ui.EAttributeCellEditHandler;
import org.eclipse.fx.emf.edit.ui.TreeTableProxyCellValueFactory;
import org.eclipse.fx.emf.edit.ui.dnd.CellDragAdapter;
import org.eclipse.fx.emf.edit.ui.dnd.EditingDomainCellDropAdapter;

import de.dc.javafx.efxclipse.runtime.model.IEmfManager;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TreeTableColumn;
import javafx.scene.control.TreeTableView;

public class EmfTreeTableView<T> extends TreeTableView<Object>{

	protected EditingDomain editingDomain;
	protected AdapterFactory adapterFactory;

	public EmfTreeTableView(IEmfManager<T> manager) {
		editingDomain = manager.getEditingDomain();
		adapterFactory = manager.getAdapterFactory();

		getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
		setRoot(new AdapterFactoryTreeItem<>(manager.getRoot(), adapterFactory));

		setShowRoot(false);
		
		// add edit support
		setEditable(true);
	}
	
	public TreeTableColumn<Object, Object> createColumn(String name){
		TreeTableColumn<Object, Object> column = new TreeTableColumn<>(name);
//		AdapterFactoryTreeTableCellFactory<Object, Object> firstNameCellFactory = new AdapterFactoryTreeTableCellFactory<>(adapterFactory, 0);
//		CellDragAdapter dragAdapter = new CellDragAdapter();
//		EditingDomainCellDropAdapter dropAdapter = new EditingDomainCellDropAdapter(editingDomain);
//		firstNameCellFactory.addCellCreationListener(dragAdapter);
//		firstNameCellFactory.addCellCreationListener(dropAdapter);
//		column.setCellFactory(firstNameCellFactory);
		column.setSortable(false);
		column.setCellValueFactory(new TreeTableProxyCellValueFactory());
		
		getColumns().add(column);
		return column;
	}
	
	public void addEditableFor(TreeTableColumn<T, T> column, EAttribute attribute) {
//		column.addCellEditHandler(new EAttributeCellEditHandler(attribute, editingDomain));
	}

}
