package de.dc.javafx.xcore.lang.lib;

public abstract class BaseTile extends AbstractFxmlAnchorControl{

	protected String key;
	
	public BaseTile(String key) {
		this.key = key;
	}
	
	public String getKey() {
		return key;
	}
	
	public void setKey(String key) {
		this.key=key;
	}
}
