package de.dc.javafx.emfsupport.website.model.ui.view;

import java.util.Collection;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.CommandParameter;

import de.dc.javafx.efxclipse.runtime.EMFModelTreeView;
import de.dc.javafx.efxclipse.runtime.model.IEmfManager;
import de.dc.javafx.efxclipse.runtime.util.EmfUtil;

import de.dc.javafx.emfsupport.website.model.ModelPackage;
import de.dc.javafx.emfsupport.website.model.ui.factory.*;
import de.dc.javafx.emfsupport.website.model.Website;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.*;

public class PageTreeView extends EMFModelTreeView<Website> {

	public PageTreeView(IEmfManager<Website> manager) {
		super(manager);
		
		// add edit support
		treeView.setEditable(true);
		// addEditableFor(ModelPackage.eINSTANCE.getPage_Name());
	}
	
	@Override
	public void changed(ObservableValue<? extends Object> arg0, Object arg1, Object newValue) {
		if (newValue instanceof TreeItem<?>) {
			TreeItem<?> treeItem = (TreeItem<?>) newValue;
	    	Object value = ((TreeItem<?>) newValue).getValue();
	    	newMenu.getItems().clear();
			Collection<?> collection = editingDomain.getNewChildDescriptors(value, null);
			for (Object object : collection) {
				if (object instanceof CommandParameter) {
					CommandParameter commandParameter = (CommandParameter)object;
					String name = commandParameter.getValue().getClass().getSimpleName().replace("Impl", "");
					MenuItem item = new MenuItem(name);
					item.setOnAction(event -> {
						int id = EmfUtil.getValueByName(ModelPackage.eINSTANCE, name);
						Command command = AddCommand.create(editingDomain, value, id, ExtendedModelFactory.eINSTANCE.create(id));
						command.execute();
						treeItem.setExpanded(true);
					});
					newMenu.getItems().add(item);
				}
			}
	    }
	}
}
