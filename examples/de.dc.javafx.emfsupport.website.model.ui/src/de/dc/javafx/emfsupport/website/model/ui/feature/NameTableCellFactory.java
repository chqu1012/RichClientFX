package de.dc.javafx.emfsupport.website.model.ui.feature;

import de.dc.javafx.emfsupport.website.model.Page;
import de.dc.javafx.xcore.lang.lib.feature.CellValueFeature;

public class NameTableCellFactory extends CellValueFeature<Object>{

	@Override
	protected String getText(Object value) {
		if (value instanceof Page) {
			Page page = (Page) value;
			return page.getName();
		}
		return "";
	}

}
