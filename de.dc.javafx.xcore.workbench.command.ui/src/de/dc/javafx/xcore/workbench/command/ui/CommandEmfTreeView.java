package de.dc.javafx.xcore.workbench.command.ui;
import com.google.common.eventbus.Subscribe;

import de.dc.javafx.xcore.workbench.command.CommandPackage;
import de.dc.javafx.xcore.workbench.command.EmfCommand;
import de.dc.javafx.xcore.workbench.command.EmfCommandHistory;
import de.dc.javafx.xcore.workbench.command.ui.cell.CommandCellFactory;
import de.dc.javafx.xcore.workbench.command.ui.file.CommandFile;
import de.dc.javafx.xcore.workbench.command.ui.manager.CommandEmfManager;
import de.dc.javafx.xcore.workbench.di.DIPlatform;
import de.dc.javafx.xcore.workbench.emf.IEmfManager;
import de.dc.javafx.xcore.workbench.emf.file.EmfFile;
import de.dc.javafx.xcore.workbench.event.EventContext;
import de.dc.javafx.xcore.workbench.event.EventTopic;
import de.dc.javafx.xcore.workbench.event.IEventBroker;
import de.dc.javafx.xcore.workbench.ui.control.EmfTreeModelView;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.TreeCell;
import javafx.scene.control.TreeView;
import javafx.util.Callback;

public class CommandEmfTreeView extends EmfTreeModelView<EmfCommandHistory> {

	public CommandEmfTreeView() {
		// Set edit mode for several attributes
		addEditableFor(CommandPackage.eINSTANCE.getEmfCommand_Name());
		addEditableFor(CommandPackage.eINSTANCE.getEmfResult_Name());
		
		treeView.setCellFactory(new Callback<TreeView<Object>, TreeCell<Object>>() {
			@Override
			public TreeCell call(TreeView<Object> param) {
				return new CommandCellFactory(manager.getAdapterFactory());
			}
		});
		
		DIPlatform.getInstance(IEventBroker.class).register(this);

		clearDefaultContextMenu();
	}

	// Workaround to not used the new menu item
	@Override
	public void changed(ObservableValue<? extends Object> arg0, Object arg1, Object newValue) {
	}
	
	@Override
	protected IEmfManager<EmfCommandHistory> getEmfManager() {
		return new CommandEmfManager();
	}

	@Override
	protected EmfFile<EmfCommandHistory> initEmfFile() {
		return new CommandFile();
	}
	
	@Subscribe
	public void updateViewByEventBroker(EventContext<EmfCommand> context) {
		if (context.getEventTopic()==EventTopic.COMMAND_STACK_REFRESH) {
			if (context.getInput() instanceof EmfCommand) {
				manager.getRoot().getCommands().add(context.getInput());
			}
		}
	}
}