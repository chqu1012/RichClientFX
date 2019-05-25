package de.dc.javafx.efxclipse.runtime.command;

public class OpenEditorCommand implements IOpenEditorCommand{

	private String content;
	
	@Override
	public void open(String content) {
		this.setContent(content);
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
	
}
