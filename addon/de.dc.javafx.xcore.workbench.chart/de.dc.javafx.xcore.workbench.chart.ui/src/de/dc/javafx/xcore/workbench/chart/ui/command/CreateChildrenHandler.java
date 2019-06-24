package de.dc.javafx.xcore.workbench.chart.ui.command;

import java.util.Collection;
import java.util.Optional;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.CommandParameter;

import de.dc.javafx.xcore.workbench.di.DIPlatform;
import de.dc.javafx.xcore.workbench.emf.IEmfManager;
import de.dc.javafx.xcore.workbench.emf.file.IEmfFileManager;
import de.dc.javafx.xcore.workbench.emf.ui.EmfDetailedTreeView;
import de.dc.javafx.xcore.workbench.emf.ui.EmfTreeModelView;
import de.dc.javafx.xcore.workbench.emf.ui.factory.CommandFactory;
import de.dc.javafx.xcore.workbench.emf.ui.feature.EmfTreeModelViewCommand;
import de.dc.javafx.xcore.workbench.emf.ui.util.EmfUtil;
import de.dc.javafx.xcore.workbench.emf.view.IEmfEditorPart;
import de.dc.javafx.xcore.workbench.event.EventContext;
import de.dc.javafx.xcore.workbench.event.EventTopic;
import de.dc.javafx.xcore.workbench.event.IEventBroker;

public class CreateChildrenHandler extends EmfTreeModelViewCommand{

	public static final String ID = "de.dc.javafx.xcore.workbench.chart.ui.command.CreateChildrenHandler";
	

	@Override
	protected void executeSelection(EObject selection) {
		Optional<IEmfEditorPart<?>> activeEditor = DIPlatform.getInstance(IEmfFileManager.class).getActiveEditor();
		activeEditor.ifPresent(editor->{
			if (editor instanceof EmfDetailedTreeView) {
				EmfDetailedTreeView<?> view = (EmfDetailedTreeView) editor;
				EmfTreeModelView<?> tree = view.getTreeView();
				IEmfManager<?> manager = tree.getEmfManager();
				Collection<?> collection = manager.getEditingDomain().getNewChildDescriptors(selection, null);
				for (Object object : collection) {
					if (object instanceof CommandParameter) {
						CommandParameter commandParameter = (CommandParameter) object;
						String name = commandParameter.getValue().getClass().getSimpleName().replace("Impl", "");
						EClassifier eClassifier = manager.getModelPackage().getEClassifier(name);
						EObject obj = manager.getExtendedModelFactory().create((EClass) eClassifier);
						
						int id = EmfUtil.getValueByName(manager.getModelPackage(), name);
						Command command = AddCommand.create(manager.getEditingDomain(), selection, id, obj);
						command.execute();
						
						DIPlatform.getInstance(IEventBroker.class).post(new EventContext<>(EventTopic.COMMAND_STACK_REFRESH, CommandFactory.create(command)));
					}
				}
			}
		});
	}
}