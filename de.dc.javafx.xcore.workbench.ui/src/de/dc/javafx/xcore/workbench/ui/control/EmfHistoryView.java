package de.dc.javafx.xcore.workbench.ui.control;

import java.util.EventObject;
import java.util.Optional;
import java.util.logging.Logger;

import org.eclipse.emf.common.command.CommandStackListener;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;

import com.google.common.eventbus.Subscribe;

import de.dc.javafx.xcore.workbench.di.DIPlatform;
import de.dc.javafx.xcore.workbench.emf.IEmfManager;
import de.dc.javafx.xcore.workbench.emf.command.CommandStackImpl;
import de.dc.javafx.xcore.workbench.emf.event.IEmfSelectionService;
import de.dc.javafx.xcore.workbench.event.EventContext;
import de.dc.javafx.xcore.workbench.event.EventTopic;
import de.dc.javafx.xcore.workbench.event.IEventBroker;
import de.dc.javafx.xcore.workbench.ui.factory.CommandListCellFactory;
import de.dc.javafx.xcore.workbench.ui.model.EmfHistoryCommand;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ListView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;

public class EmfHistoryView extends EmfView implements CommandStackListener {

	private Logger log = Logger.getLogger(EmfHistoryView.class.getSimpleName());

	protected ListView<EmfHistoryCommand> historyList;
	protected IEmfManager<?> emfManager;

	private ComposedAdapterFactory adapterFactory;

	private CommandStackImpl commandStack;

	@Override
	protected void createPartControl(BorderPane parent) {
		DIPlatform.getInstance(IEventBroker.class).register(this);
		historyList = new ListView<>();
		parent.setCenter(historyList);
	}

	private void initHistoryListView() {
		if (emfManager == null) {
			emfManager = DIPlatform.getInstance(IEmfSelectionService.class).getEmfManager().get();
			adapterFactory = emfManager.getAdapterFactory();
			commandStack = (CommandStackImpl) emfManager.getEditingDomain().getCommandStack();
			commandStack.addCommandStackListener(this);
			historyList.setCellFactory(new CommandListCellFactory(adapterFactory, commandStack));
			historyList.setEditable(false);

			historyList.setOnMouseClicked(e -> onHistoryListViewClicked(e));
		}
	}

	protected void onHistoryListViewClicked(MouseEvent event) {
		if (event.getClickCount() == 2) {
			Alert alert = new Alert(AlertType.CONFIRMATION);
			alert.setTitle("Confirmation Dialog");
			alert.setHeaderText("Undo for current selection");
			alert.setContentText("Are you ok with this?");

			Optional<ButtonType> result = alert.showAndWait();
			result.ifPresent(res -> {
				if (res == ButtonType.OK) {
					EmfHistoryCommand selection = historyList.getSelectionModel().getSelectedItem();
					if (selection != null) {
						selection.undo();
						log.info("Undo successfully executed!");
					}
				}
			});
		}
	}

	@Override
	public void commandStackChanged(EventObject event) {
		updateHistoryListView(new EventContext<>(EventTopic.COMMAND_STACK_REFRESH, null));
	}

	@Subscribe
	public void updateHistoryListView(EventContext<EmfHistoryCommand> context) {
		if (context.getEventTopic() == EventTopic.COMMAND_STACK_REFRESH) {
			initHistoryListView();
			Object input = context.getInput();
			if (input != null && input instanceof EmfHistoryCommand) {
				historyList.getItems().add(0, (EmfHistoryCommand) input);
			}
		}
	}
}
