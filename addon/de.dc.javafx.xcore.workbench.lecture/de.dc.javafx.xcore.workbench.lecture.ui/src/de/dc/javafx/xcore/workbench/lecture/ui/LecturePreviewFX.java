package de.dc.javafx.xcore.workbench.lecture.ui;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URISyntaxException;

import org.apache.commons.io.FileUtils;

import com.google.common.base.Charsets;

import de.dc.javafx.xcore.workbench.event.EventContext;
import de.dc.javafx.xcore.workbench.lecture.LectureProject;
import de.dc.javafx.xcore.workbench.lecture.ui.template.LectureTemplate;
import de.dc.javafx.xcore.workbench.lecture.ui.view.LecturePreview;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.TreeItem;
import javafx.scene.web.WebView;

public class LecturePreviewFX extends LecturePreview {

	private LectureTemplate template = new LectureTemplate();

	@Override
	public void update(EventContext context) {
	}

	@Override
	public void changed(ObservableValue observable, Object oldValue, Object newValue) {
		TreeItem item = (TreeItem) newValue;
		if (item.getValue() instanceof LectureProject) {
			LectureProject p = (LectureProject) item.getValue();
			String path = getClass().getResource("/reveal.js-3.8.0/demo.html").getFile();
			try {
				FileUtils.write(new File(path), template.gen(p), Charsets.UTF_8);
				engine.load(getClass().getResource("/reveal.js-3.8.0/demo.html").toURI().toURL().toExternalForm());
			} catch (URISyntaxException | IOException e) {
				e.printStackTrace();
			}
		}
	}
}
