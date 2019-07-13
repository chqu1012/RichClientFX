package de.dc.javafx.xcore.workbench.lecture.ui;

import static java.nio.charset.StandardCharsets.UTF_8;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.text.DecimalFormat;

import org.apache.commons.io.FileUtils;
import org.eclipse.emf.ecore.EObject;

import de.dc.javafx.xcore.workbench.event.EventContext;
import de.dc.javafx.xcore.workbench.lecture.LectureProject;
import de.dc.javafx.xcore.workbench.lecture.Section;
import de.dc.javafx.xcore.workbench.lecture.ui.template.LectureTemplate;
import de.dc.javafx.xcore.workbench.lecture.ui.view.LecturePreview;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.TreeItem;

public class LecturePreviewFX extends LecturePreview {

	private LectureTemplate template = new LectureTemplate();
	private DecimalFormat df = new DecimalFormat("000");
	
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
				FileUtils.write(new File(path), template.gen(p), UTF_8);
				engine.load(getClass().getResource("/reveal.js-3.8.0/demo.html").toURI().toURL().toExternalForm());
			} catch (URISyntaxException | IOException e) {
				e.printStackTrace();
			}
		}else if (item.getValue() instanceof Section) {
			Section section = (Section) item.getValue();
			LectureProject project = (LectureProject) section.eContainer();
			int indexOf = project.getSections().indexOf(section);
			String format = "Section_"+df.format(indexOf);
			try {
				String path = getClass().getResource("/reveal.js-3.8.0/").toURI().getPath();
				File setionFolder = new File(path+"sections/"+format);
				setionFolder.mkdirs();
			} catch ( URISyntaxException e) {
				e.printStackTrace();
			}
		}
	}
}
