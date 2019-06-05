package de.dc.javafx.xcore.resource.ui.view;

import java.util.Collection;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.CommandParameter;

import de.dc.javafx.efxclipse.runtime.EMFModelTreeView;
import de.dc.javafx.efxclipse.runtime.model.IEmfManager;
import de.dc.javafx.efxclipse.runtime.util.EmfUtil;
import de.dc.javafx.xcore.resource.File;
import de.dc.javafx.xcore.resource.ResourcePackage;
import de.dc.javafx.xcore.resource.Workspace;
import de.dc.javafx.xcore.resource.ui.factory.ExtendedResourceFactory;
import de.dc.javafx.xcore.workbench.event.EventContext;
import de.dc.javafx.xcore.workbench.event.EventTopic;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TreeItem;
import javafx.scene.input.MouseEvent;

public class ProjectExplorerTreeView extends EMFModelTreeView<Workspace> {

	public ProjectExplorerTreeView() {
		addEditingSupport();
	}

	public ProjectExplorerTreeView(IEmfManager<Workspace> manager) {
		super(manager);

		addEditingSupport();
	}

	private void addEditingSupport() {
		addEditableFor(ResourcePackage.eINSTANCE.getProject_Name());
		addEditableFor(ResourcePackage.eINSTANCE.getFolder_Name());
		addEditableFor(ResourcePackage.eINSTANCE.getFile_Name());
		addEditableFor(ResourcePackage.eINSTANCE.getPackageFolder_Name());
	}
	
	@Override
	public void changed(ObservableValue<? extends Object> arg0, Object arg1, Object newValue) {
		if (newValue instanceof TreeItem<?>) {
			TreeItem<?> treeItem = (TreeItem<?>) newValue;
			Object value = treeItem.getValue();
			newMenu.getItems().clear();
			Collection<?> collection = editingDomain.getNewChildDescriptors(value, null);
			for (Object object : collection) {
				if (object instanceof CommandParameter) {
					CommandParameter commandParameter = (CommandParameter) object;
					String name = commandParameter.getValue().getClass().getSimpleName().replace("Impl", "");
					MenuItem item = new MenuItem(name);
					item.setOnAction(event -> {
						int id = EmfUtil.getValueByName(ResourcePackage.eINSTANCE, name);
						Command command = AddCommand.create(editingDomain, value, id,
								ExtendedResourceFactory.eINSTANCE.create(id));
						command.execute();
						eventBroker.post(new EventContext<>(EventTopic.COMMAND_STACK_REFRESH, command));
						treeItem.setExpanded(true);
					});
					newMenu.getItems().add(item);
				}
			}
		}
	}

	@Override
	protected void onTreeViewMouseClicked(MouseEvent event) {
		if (treeView.isEditable()) {
			treeView.setEditable(false);
		}
		if (event.getClickCount() == 2) {
			TreeItem<Object> selection = treeView.getSelectionModel().getSelectedItem();
			if (selection.getValue() instanceof File) {
				File file = (File) selection.getValue();
				eventBroker.post(new EventContext<File>(EventTopic.OPEN_EDITOR, file));
			}
		}
	}

	@Override
	protected IEmfManager<Workspace> getEmfManager() {
		return null;
	}
}
