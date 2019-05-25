package de.dc.javafx.xcore.lang.edit.generator

import de.dc.javafx.xcore.lang.edit.emfSupportDsl.Ecore
import de.dc.javafx.xcore.lang.edit.emfSupportDsl.SupportedControl

class SupportedControlViewTemplate implements ICustomerGenerator<SupportedControl>{
	
	override code(SupportedControl control)'''
		«val ecore = control.eContainer as Ecore»
		«val packagePath = ecore.packagePath.replace('\'', '')»
		package «packagePath».view;
		
		import java.util.Collection;
		
		import org.eclipse.emf.common.command.Command;
		import org.eclipse.emf.edit.command.AddCommand;
		import org.eclipse.emf.edit.command.CommandParameter;
		
		import de.dc.javafx.efxclipse.runtime.EMFModelTreeView;
		import de.dc.javafx.efxclipse.runtime.model.IEmfManager;
		import de.dc.javafx.efxclipse.runtime.util.EmfUtil;
		
		import «ecore.modelPackage.qualifiedName»;
		import «packagePath».factory.*;
		import «ecore.rootType.qualifiedName»;
		import javafx.beans.value.ObservableValue;
		import javafx.scene.control.*;
		
		«val rootName = ecore.rootType.simpleName»
		public class «control.name»TreeView extends EMFModelTreeView<«rootName»> {
		
			public «control.name»TreeView(IEmfManager<«rootName»> manager) {
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
								int id = EmfUtil.getValueByName(«ecore.modelPackage.simpleName».eINSTANCE, name);
								Command command = AddCommand.create(editingDomain, value, id, Extended«ecore.modelFactory.simpleName».eINSTANCE.create(id));
								command.execute();
								treeItem.setExpanded(true);
							});
							newMenu.getItems().add(item);
						}
					}
			    }
			}
		}
		'''
		
		override path(SupportedControl control)'''«(control.eContainer as Ecore).packagePath.replace('\'', '').replace('.', '/')»/view/«control.name»TreeView.java'''
}