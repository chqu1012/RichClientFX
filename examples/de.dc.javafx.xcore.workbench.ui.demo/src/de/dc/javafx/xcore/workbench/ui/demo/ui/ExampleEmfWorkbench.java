package de.dc.javafx.xcore.workbench.ui.demo.ui;

import java.util.Optional;

import org.apache.commons.io.FilenameUtils;

import com.google.inject.Inject;

import de.dc.javafx.xcore.resource.File;
import de.dc.javafx.xcore.workbench.di.DIPlatform;
import de.dc.javafx.xcore.workbench.emf.event.IEmfSelectionService;
import de.dc.javafx.xcore.workbench.emf.file.IEmfFileManager;
import de.dc.javafx.xcore.workbench.emf.view.IEmfEditorPart;
import de.dc.javafx.xcore.workbench.event.EventContext;
import de.dc.javafx.xcore.workbench.event.EventTopic;
import de.dc.javafx.xcore.workbench.event.IEventBroker;
import de.dc.javafx.xcore.workbench.ui.IEmfControlManager;
import de.dc.javafx.xcore.workbench.ui.control.EmfWorkbench;
import de.dc.javafx.xcore.workbench.ui.renderer.EmfWorkbenchRenderer;
import de.dc.spring.bootstrap.blog.model.Tile;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.scene.control.Tab;
import javafx.scene.input.MouseEvent;

public class ExampleEmfWorkbench extends EmfWorkbench {

	@Inject
	IEmfControlManager manager;
	@Inject
	IEmfSelectionService selectionService;
	@Inject
	IEventBroker eventBroker;
	@Inject
	EmfWorkbenchRenderer renderer;

	public void render() {
		renderer.setWorkbench(this);
		renderer.doSwitch(getWorkbench());
		renderer.doSwitch(getWorkbench().getToolbar());
	}

	public void onRunControlMouseClicked(ActionEvent e) {
		System.out.println(e);
	}

	public void onDebugControlMouseClicked(MouseEvent e) {
		System.out.println(e);
	}

	@Override
	public void changed(ObservableValue<? extends Object> arg0, Object arg1, Object arg2) {

	}

	@Override
	public void openFile(EventContext<?> context) {
		Object input = context.getInput();
		if (context.getEventTopic() == EventTopic.OPEN_EDITOR) {
			String filename = showTabTextByObject(input) == null ? "" : showTabTextByObject(input);
			if (!filename.isEmpty() && !isFileOpen(filename)) {
				Optional<IEmfEditorPart<?>> editorPart = DIPlatform.getInstance(IEmfFileManager.class)
						.getEditorByExtension(FilenameUtils.getExtension(filename));
				if (editorPart!=null) {
					editorPart.ifPresent(editor -> {
						if (input instanceof File) {
							File fileInput = (File) input;
							Tab editorTab = new Tab(fileInput.getName());
							getCurrentPerspective().getEditorArea().getTabs().add(editorTab);
						}else if (input instanceof String) {
							Tab editorTab = new Tab((String) input);
							editor.load(new java.io.File((String) input));
							editorTab.setContent((Node) editor);
							getCurrentPerspective().getEditorArea().getTabs().add(editorTab);
						}
					});
				}
			}
			getTabByName(filename).ifPresent(e -> getCurrentPerspective().getEditorArea().getSelectionModel().select(e));
		}
	}

	@Override
	protected String showTabTextByObject(Object input) {
		if (input instanceof File) {
			File file = (File) input;
			return file.getName();
		} else if (input instanceof Tile) {
			Tile tile = (Tile) input;
			return tile.getTitle();
		}else if (input instanceof String) {
			return (String) input;
		}
		return "";
	}

}
