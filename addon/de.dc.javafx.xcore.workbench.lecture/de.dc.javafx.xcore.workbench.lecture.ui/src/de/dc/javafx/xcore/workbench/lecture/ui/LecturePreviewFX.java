package de.dc.javafx.xcore.workbench.lecture.ui;

import org.eclipse.emf.ecore.EObject;

import de.dc.javafx.xcore.workbench.event.EventContext;
import de.dc.javafx.xcore.workbench.lecture.ui.template.LectureContentSwitch;
import de.dc.javafx.xcore.workbench.lecture.ui.view.LecturePreview;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.TreeItem;

public class LecturePreviewFX extends LecturePreview {

	private LectureContentSwitch content;
	
	@Override
	public void update(EventContext<?> context) {
	}

	@Override
	public void changed(ObservableValue<?> observable, Object oldValue, Object newValue) {
		if (content==null) {
			content = new LectureContentSwitch(engine);
		}
		TreeItem<?> item = (TreeItem<?>) newValue;
		content.doSwitch((EObject) item.getValue());
	}
}
