package de.dc.javafx.xcore.workbench.ui.demo.ui;

import com.google.inject.Inject;

import de.dc.javafx.xcore.resource.File;
import de.dc.javafx.xcore.workbench.emf.event.IEmfSelectionService;
import de.dc.javafx.xcore.workbench.event.IEventBroker;
import de.dc.javafx.xcore.workbench.ui.IEmfControlManager;
import de.dc.javafx.xcore.workbench.ui.control.EmfWorkbench;
import de.dc.javafx.xcore.workbench.ui.renderer.EmfWorkbenchRenderer;
import de.dc.spring.bootstrap.blog.model.Tile;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
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
		// TODO Auto-generated method stub
		
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
