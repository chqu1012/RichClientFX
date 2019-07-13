package de.dc.javafx.xcore.workbench.lecture.ui.template;

import static java.nio.charset.StandardCharsets.UTF_8;
import static java.util.Optional.ofNullable;
import static org.apache.commons.lang3.StringUtils.EMPTY;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

import de.dc.javafx.xcore.workbench.lecture.FileContent;
import de.dc.javafx.xcore.workbench.lecture.LectureProject;
import de.dc.javafx.xcore.workbench.lecture.ListItem;
import de.dc.javafx.xcore.workbench.lecture.OrderedListContent;
import de.dc.javafx.xcore.workbench.lecture.Section;
import de.dc.javafx.xcore.workbench.lecture.StringContent;
import de.dc.javafx.xcore.workbench.lecture.UnorderedListContent;
import de.dc.javafx.xcore.workbench.lecture.util.LectureSwitch;

public class LectureStringSwitch extends LectureSwitch<String>{

	@Override
	public String caseFileContent(FileContent object) {
		try {
			Section section = (Section) object.eContainer();
			LectureProject project = (LectureProject) section.eContainer();
			int indexOf = project.getSections().indexOf(section);
			String basePath = "/reveal.js-3.8.0/sections/Section_"+LectureContentSwitch.df.format(indexOf);
			String path = getClass().getResource(basePath+"/"+object.getPath()).getFile();
			return FileUtils.readFileToString(new File(path), UTF_8);
		} catch (IOException e) {
			return EMPTY;
		}
	}

	@Override
	public String caseOrderedListContent(OrderedListContent object) {
		StringBuilder sb = new StringBuilder();
		sb.append("<ol>").append("\n");
		for (ListItem item : object.getItem()) {
			sb.append(caseListItem(item));
		}
		sb.append("</ol>");
		return sb.toString();
	}
	
	@Override
	public String caseUnorderedListContent(UnorderedListContent object) {
		StringBuilder sb = new StringBuilder();
		sb.append("<ul>").append("\n");
		for (ListItem item : object.getItem()) {
			sb.append(caseListItem(item));
		}
		sb.append("</ul>");
		return sb.toString();
	}
	
	@Override
	public String caseListItem(ListItem object) {
		return object.getValue()==null? EMPTY : "<li>"+object.getValue()+"</li>\n";
	}
	
	@Override
	public String caseStringContent(StringContent object) {
		return ofNullable(object.getBody()).orElse(EMPTY);
	}
}
