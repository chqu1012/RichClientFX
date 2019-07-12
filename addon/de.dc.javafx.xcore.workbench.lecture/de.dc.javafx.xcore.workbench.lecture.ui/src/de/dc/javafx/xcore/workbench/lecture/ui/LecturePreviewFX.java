package de.dc.javafx.xcore.workbench.lecture.ui;

import java.net.MalformedURLException;
import java.net.URISyntaxException;

import de.dc.javafx.xcore.workbench.event.EventContext;
import de.dc.javafx.xcore.workbench.lecture.ui.view.LecturePreview;
import javafx.beans.value.ObservableValue;
import javafx.scene.web.WebView;

public class LecturePreviewFX extends LecturePreview{

	@Override
	public void update(EventContext context) {
		System.out.println("update");
	}
	
	@Override
	public void changed(ObservableValue observable, Object oldValue, Object newValue) {
		System.out.println("Changed");
		
		try {
			engine.load(getClass().getResource("/reveal.js-3.8.0/demo.html").toURI().toURL().toExternalForm());
		} catch (MalformedURLException | URISyntaxException e) {
			e.printStackTrace();
		}
	}
}
