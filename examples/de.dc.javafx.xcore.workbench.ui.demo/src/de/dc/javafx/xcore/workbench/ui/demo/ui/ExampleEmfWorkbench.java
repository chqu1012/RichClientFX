package de.dc.javafx.xcore.workbench.ui.demo.ui;

import com.google.inject.Inject;

import de.dc.javafx.xcore.workbench.event.IEventBroker;
import de.dc.javafx.xcore.workbench.event.ISelectionService;
import de.dc.javafx.xcore.workbench.ui.IEmfControlManager;
import de.dc.javafx.xcore.workbench.ui.control.EmfWorkbench;
import de.dc.javafx.xcore.workbench.ui.renderer.EmfWorkbenchRenderer;
import javafx.event.ActionEvent;
import javafx.scene.input.MouseEvent;

public class ExampleEmfWorkbench extends EmfWorkbench{

	@Inject IEmfControlManager manager;
	@Inject ISelectionService selectionService;
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
		System.out.println("IEmfControlManager Instance: "+manager);
		System.out.println("ISelectionService Instance: "+selectionService);
		System.out.println("ISelectionService Instance: "+eventBroker);
		System.out.println("EmfWorkbenchRenderer Instance: "+renderer);
	}
}
