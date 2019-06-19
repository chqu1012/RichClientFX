package de.dc.javafx.xcore.workbench.ui.demo.ui;

import de.dc.javafx.xcore.workbench.di.DIPlatform;
import de.dc.javafx.xcore.workbench.emf.event.IEmfSelectionService;
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
		
		DIPlatform.getInstance(IEmfSelectionService.class).addListener(this);
	}

	@Override
	public void changed(ObservableValue observable, Object oldValue, Object newValue) {
		if (newValue!=null) {
			button.setText(newValue.toString());
		}
	}

}
