package de.dc.javafx.xcore.workbench.ui.demo.ui;

import de.dc.javafx.xcore.workbench.event.ISelectionService;
import de.dc.javafx.xcore.workbench.ui.EmfWorkbenchContext;
import de.dc.javafx.xcore.workbench.ui.control.EmfView;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;

public class EmfExampleView extends EmfView implements ChangeListener{
	
	private Button button;

	@Override
	protected void createPartControl(BorderPane parent) {
		button = new Button("Press Me");
		button.setOnAction(e-> button.setText("aaa"));
		parent.setCenter(button);
		
		EmfWorkbenchContext.getInstance(ISelectionService.class).addListener(this);
	}

	@Override
	public void changed(ObservableValue observable, Object oldValue, Object newValue) {
		button.setText(newValue.toString());
	}

}
