package de.dc.javafx.xcore.workbench.emf.file;

import java.io.File;

public interface IEmfFileService {

	void save(File file);
	
	String getExtension();
}
