package de.dc.emf.javafx.xtext.demo.cu.feature;

import java.time.format.DateTimeFormatter;

import de.dc.emf.javafx.xtext.demo.cu.entry.feature.BaseEntryCellFeatures;
import de.dc.emf.javafx.xtext.demo.cu.entry.model.Entry;
import de.dc.emf.javafx.xtext.demo.cu.entry.model.EntryType;

public class EntryCellFeatures extends BaseEntryCellFeatures{

	protected DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
	
	public EntryCellFeatures(EntryType type) {
		super(type);
	}

	@Override
	protected String getTimestamp(Entry item) {
		return dtf.format(item.getTimestamp());
	}
}
