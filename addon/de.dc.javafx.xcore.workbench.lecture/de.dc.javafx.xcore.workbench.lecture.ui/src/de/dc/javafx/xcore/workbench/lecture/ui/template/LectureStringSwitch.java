package de.dc.javafx.xcore.workbench.lecture.ui.template;

import static java.nio.charset.StandardCharsets.UTF_8;
import static java.util.Optional.ofNullable;
import static org.apache.commons.lang3.StringUtils.EMPTY;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

import de.dc.javafx.xcore.workbench.lecture.FileContent;
import de.dc.javafx.xcore.workbench.lecture.StringContent;
import de.dc.javafx.xcore.workbench.lecture.util.LectureSwitch;

public class LectureStringSwitch extends LectureSwitch<String>{

	@Override
	public String caseFileContent(FileContent object) {
		try {
			String path = getClass().getResource("/reveal.js-3.8.0/sections/"+object.getPath()).getFile();
			return FileUtils.readFileToString(new File(path), UTF_8);
		} catch (IOException e) {
			return EMPTY;
		}
	}
	
	@Override
	public String caseStringContent(StringContent object) {
		return ofNullable(object.getBody()).orElse(EMPTY);
	}
}
