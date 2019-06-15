package de.dc.javafx.xcore.workbench.ui.file;

import java.io.File;

public interface IEmfFileService {

	void save(File file);
	
	String getExtension();
}
