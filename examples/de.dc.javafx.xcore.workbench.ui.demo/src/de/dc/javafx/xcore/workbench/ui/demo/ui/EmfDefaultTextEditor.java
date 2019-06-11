package de.dc.javafx.xcore.workbench.ui.demo.ui;

import de.dc.javafx.xcore.workbench.di.DIPlatform;
import de.dc.javafx.xcore.workbench.emf.event.IEmfSelectionService;
import de.dc.javafx.xcore.workbench.ui.demo.ui.EmfExampleTableView.Person;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.Tab;
import javafx.scene.control.TextArea;
import javafx.scene.layout.AnchorPane;

public class EmfDefaultTextEditor extends Tab implements ChangeListener{

	private TextArea textArea = new TextArea();
	
	public EmfDefaultTextEditor() {
		setText("Default Text Editor*");
		AnchorPane anchorPane = new AnchorPane();
		anchorPane.getChildren().add(textArea);
		
		AnchorPane.setBottomAnchor(textArea, 0d);
		AnchorPane.setTopAnchor(textArea, 0d);
		AnchorPane.setLeftAnchor(textArea, 0d);
		AnchorPane.setRightAnchor(textArea, 0d);
		
		setContent(textArea);
		
		DIPlatform.getInstance(IEmfSelectionService.class).addListener(this);
	}

	@Override
	public void changed(ObservableValue observable, Object oldValue, Object newValue) {
		if (newValue instanceof Person) {
			Person person = (Person) newValue;
			textArea.appendText(person.getVorname()+", "+person.getNachname()+", "+person.getAlter());
			textArea.appendText("\n");
		}
	}
	
	
}
