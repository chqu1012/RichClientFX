package de.dc.javafx.xcore.lang.ide.wizards.model;

public class TableModel {

	private String packagePath;
	private String name;
	private boolean showPropertyView;
	private boolean showToolbar;
	private boolean generateDemo;

	public String getPackagePath() {
		return packagePath;
	}

	public void setPackagePath(String packagePath) {
		this.packagePath = packagePath;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isShowPropertyView() {
		return showPropertyView;
	}

	public void setShowPropertyView(boolean showPropertyView) {
		this.showPropertyView = showPropertyView;
	}

	public boolean isShowToolbar() {
		return showToolbar;
	}

	public void setShowToolbar(boolean showToolbar) {
		this.showToolbar = showToolbar;
	}

	public boolean isGenerateDemo() {
		return generateDemo;
	}

	public void setGenerateDemo(boolean generateDemo) {
		this.generateDemo = generateDemo;
	}

}
