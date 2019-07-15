package de.dc.javafx.xcore.workbench.lecture.ui.template;

import static de.dc.javafx.xcore.workbench.lecture.Transition.NONE;
import static java.lang.String.format;
import static java.util.Optional.ofNullable;
import static org.apache.commons.lang3.StringUtils.EMPTY;

import de.dc.javafx.xcore.workbench.lecture.CodeBlock;
import de.dc.javafx.xcore.workbench.lecture.Content;
import de.dc.javafx.xcore.workbench.lecture.FileContent;
import de.dc.javafx.xcore.workbench.lecture.Header;
import de.dc.javafx.xcore.workbench.lecture.HtmlElement;
import de.dc.javafx.xcore.workbench.lecture.LectureProject;
import de.dc.javafx.xcore.workbench.lecture.Link;
import de.dc.javafx.xcore.workbench.lecture.ListItem;
import de.dc.javafx.xcore.workbench.lecture.OrderedListContent;
import de.dc.javafx.xcore.workbench.lecture.Paragraph;
import de.dc.javafx.xcore.workbench.lecture.Section;
import de.dc.javafx.xcore.workbench.lecture.Span;
import de.dc.javafx.xcore.workbench.lecture.StringContent;
import de.dc.javafx.xcore.workbench.lecture.UnorderedListContent;
import de.dc.javafx.xcore.workbench.lecture.util.LectureSwitch;

public class LectureStringSwitch extends LectureSwitch<String>{

	@Override
	public String caseFileContent(FileContent object) {
		Section section = (Section) object.eContainer();
		LectureProject project = (LectureProject) section.eContainer();
		int indexOf = project.getSections().indexOf(section);
		return "sections/Section_"+LectureContentSwitch.df.format(indexOf)+"/"+object.getPath();
	}
	
	@Override
	public String caseHeader(Header object) {
		int lvl = object.getLevel();
		String value = object.getValue();
		return format("<h%s>%s</h%s>", lvl, value, lvl);
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
	
	@Override
	public String caseParagraph(Paragraph object) {
		String styleClass = object.getStyleClass().isEmpty()? "": "class=\""+object.getStyleClass()+"\"";
		
		StringBuilder sb = new StringBuilder();
		for (HtmlElement element : object.getChildren()) {
			sb.append(doSwitch(element)).append("\n");
		}
		return "<p "+styleClass+">"+object.getValue()+sb.toString()+"</p>";
	}
	
	@Override
	public String caseSpan(Span object) {
		String styleClass = object.getStyleClass().isEmpty()? "": "class=\""+object.getStyleClass()+"\"";
		return "<span "+styleClass+">"+object.getValue()+"</span>";
	}
	
	@Override
	public String caseSection(Section section) {
		String markdown = "";
		if (section.isUseMarkDown()) {
			markdown = "data-markdown=\""+caseFileContent((FileContent) section.getContents().stream().filter(e-> e instanceof FileContent).findFirst().get())+"\"";
			markdown = markdown + " data-separator=\"^\\r?\\n\\r?\\n\\r?\\n\" data-separator-vertical=\"^\\r?\\n\\r?\\n\"";
		}
		String transistion = section.getTransition()!= NONE ? " data-transition=\""+section.getTransition().getLiteral()+"\"" : EMPTY;
		
		StringBuilder sb = new StringBuilder("<section "+markdown+transistion+">");
		if (!section.isUseMarkDown()) {
			sb.append("<h1>"+section.getName()+"</h1>").append("\n");
			sb.append("<p>").append("\n");
			for (Content content : section.getContents()) {
				sb.append(doSwitch(content)).append("\n");
			}
			sb.append("</p>").append("\n");
		}
		sb.append("</section>");
		return sb.toString();
	}
	
	@Override
	public String caseCodeBlock(CodeBlock object) {
		String language = object.getLanguage();
		return "<pre><code class=\"hljs "+language +"\" style=\"word-wrap: break-word;\">"+object.getValue()+"</code></pre>";
	}
	
	@Override
	public String caseLink(Link object) {
		return "<a href=\""+object.getHref()+"\" class=\""+object.getStyleClass()+"\">"+object.getValue()+"</a>";
	}
}
