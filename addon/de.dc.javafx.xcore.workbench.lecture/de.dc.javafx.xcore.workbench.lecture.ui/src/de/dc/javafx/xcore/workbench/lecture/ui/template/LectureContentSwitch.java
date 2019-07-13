package de.dc.javafx.xcore.workbench.lecture.ui.template;

import static java.nio.charset.StandardCharsets.UTF_8;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.text.DecimalFormat;

import org.apache.commons.io.FileUtils;

import de.dc.javafx.xcore.workbench.lecture.LectureProject;
import de.dc.javafx.xcore.workbench.lecture.Section;
import de.dc.javafx.xcore.workbench.lecture.util.LectureSwitch;
import javafx.scene.web.WebEngine;

public class LectureContentSwitch extends LectureSwitch<Void>{

	public static DecimalFormat df = new DecimalFormat("000");
	private static LectureTemplate template = new LectureTemplate();
	private WebEngine engine;
	
	public LectureContentSwitch(WebEngine engine) {
		this.engine = engine;
	}
	
	@Override
	public Void caseLectureProject(LectureProject project) {
		String path = getClass().getResource("/reveal.js-3.8.0/demo.html").getFile();
		try {
			FileUtils.write(new File(path), template.gen(project), UTF_8);
			engine.load(getClass().getResource("/reveal.js-3.8.0/demo.html").toURI().toURL().toExternalForm());
		} catch (URISyntaxException | IOException e) {
			e.printStackTrace();
		}
		return super.caseLectureProject(project);
	}
	
	@Override
	public Void caseSection(Section section) {
		LectureProject project = (LectureProject) section.eContainer();
		int indexOf = project.getSections().indexOf(section);
		String format = "Section_"+df.format(indexOf);
		try {
			String path = getClass().getResource("/reveal.js-3.8.0/").toURI().getPath();
			File setionFolder = new File(path+"sections/"+format);
			if (!setionFolder.exists()) {
				setionFolder.mkdirs();
			}
		} catch ( URISyntaxException e) {
			e.printStackTrace();
		}
		return super.caseSection(section);
	}
}
