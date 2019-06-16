package de.dc.javafx.xcore.workbench.emf.file;

import java.util.List;
import java.util.Optional;

import de.dc.javafx.xcore.workbench.emf.view.IEmfEditorPart;

public interface IEmfFileManager {

	void register(IEmfEditorPart<?> editorPart);
	
	Optional<IEmfEditorPart<?>> getEditorByExtension(String extension);
	
	List<String> getAllExtensions();
}
