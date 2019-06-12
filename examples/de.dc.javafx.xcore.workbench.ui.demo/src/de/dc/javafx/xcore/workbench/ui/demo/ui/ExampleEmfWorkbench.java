package de.dc.javafx.xcore.workbench.ui.demo.ui;

import org.eclipse.fx.ui.controls.styledtext.StyleRange;
import org.eclipse.fx.ui.controls.styledtext.StyledTextArea;

import com.google.inject.Inject;

import de.dc.javafx.xcore.resource.File;
import de.dc.javafx.xcore.workbench.chart.ui.ChartFXEmfDetailTreeView;
import de.dc.javafx.xcore.workbench.chart.ui.ChartFXEmfTreeView;
import de.dc.javafx.xcore.workbench.emf.event.IEmfSelectionService;
import de.dc.javafx.xcore.workbench.event.EventContext;
import de.dc.javafx.xcore.workbench.event.EventTopic;
import de.dc.javafx.xcore.workbench.event.IEventBroker;
import de.dc.javafx.xcore.workbench.ui.IEmfControlManager;
import de.dc.javafx.xcore.workbench.ui.control.EmfWorkbench;
import de.dc.javafx.xcore.workbench.ui.renderer.EmfWorkbenchRenderer;
import de.dc.spring.bootstrap.blog.model.Tile;
import de.dc.spring.bootstrap.blog.model.ui.BlogEmfTreeView;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.scene.control.Tab;
import javafx.scene.input.MouseEvent;

public class ExampleEmfWorkbench extends EmfWorkbench{

	@Inject IEmfControlManager manager;
	@Inject IEmfSelectionService selectionService;
	@Inject IEventBroker eventBroker;
	@Inject EmfWorkbenchRenderer renderer;
	
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
	protected void onEditorAreaCloseMenuItem(ActionEvent event) {
		super.onEditorAreaCloseMenuItem(event);
		System.out.println("IEmfControlManager Instance: "+manager);
		System.out.println("ISelectionService Instance: "+selectionService);
		System.out.println("ISelectionService Instance: "+eventBroker);
		System.out.println("EmfWorkbenchRenderer Instance: "+renderer);
	}

	@Override
	public void changed(ObservableValue<? extends Object> arg0, Object arg1, Object arg2) {
		
	}
	
	@Override
	public void openFile(EventContext<?> context) {
		Object input = context.getInput();
		if (context.getEventTopic() == EventTopic.OPEN_EDITOR ) {
			String filename = showTabTextByObject(input)== null ? "" : showTabTextByObject(input);
			if (!filename.isEmpty() && !isFileOpen(filename)) {
				Node content = null;
				if (filename.endsWith(".blog")) {
					content = new BlogEmfTreeView();
				}else if (filename.endsWith(".chart")) {
//					content = new ChartFXEmfTreeView();
					content = new ChartFXEmfDetailTreeView();
				}else {
					StyledTextArea styledTextArea = new StyledTextArea();
					styledTextArea.getContent().setText("This is a styled text!\nThis is the 2nd line with data\nBlaBla");
					styledTextArea.setStyleRanges(
							new StyleRange("text-highlight",0,30,null,null)
							, new StyleRange("text-highlight",34,5,null,null)
							);
					content = styledTextArea;
				}
				
				Tab editorTab = new Tab(filename);
				editorTab.setContent(content);
				editorArea.getTabs().add(editorTab);
			}
			getTabByName(filename).ifPresent(e -> editorArea.getSelectionModel().select(e));
		}
	}

	@Override
	protected String showTabTextByObject(Object input) {
		if (input instanceof File) {
			File file = (File) input;
			return file.getName();
		}else if(input instanceof Tile) {
			Tile tile = (Tile) input;
			return tile.getTitle();
		}
		return "";
	}

}
