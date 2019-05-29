package de.dc.javafx.xcore.workbench.ui.demo.ui;

import com.google.inject.Inject;

import de.dc.javafx.xcore.workbench.ToolbarItem;
import de.dc.javafx.xcore.workbench.WorkbenchFactory;
import de.dc.javafx.xcore.workbench.ui.EmfWorkbench;
import de.dc.javafx.xcore.workbench.ui.IEmfControlManager;
import de.dc.javafx.xcore.workbench.ui.IEventBroker;
import de.dc.javafx.xcore.workbench.ui.ISelectionService;
import de.dc.javafx.xcore.workbench.ui.renderer.EmfWorkbenchRenderer;
import javafx.event.ActionEvent;

public class ExampleEmfWorkbench extends EmfWorkbench{

	@Inject IEmfControlManager manager;
	@Inject ISelectionService selectionService;
	@Inject IEventBroker eventBroker;
	@Inject EmfWorkbenchRenderer renderer;
	
	
	public void render() {
		ToolbarItem runItem = WorkbenchFactory.eINSTANCE.createToolbarItem();
		runItem.setName("Run");
		toolbar.getItems().add(renderer.doSwitch(runItem));

		ToolbarItem debugItem = WorkbenchFactory.eINSTANCE.createToolbarItem();
		debugItem.setName("Debug");
		toolbar.getItems().add(renderer.doSwitch(debugItem));
	}
	
	@Override
	protected void onEditorAreaCloseMenuItem(ActionEvent event) {
		System.out.println("IEmfControlManager Instance: "+manager);
		System.out.println("ISelectionService Instance: "+selectionService);
		System.out.println("ISelectionService Instance: "+eventBroker);
		System.out.println("EmfWorkbenchRenderer Instance: "+renderer);
	}
}
