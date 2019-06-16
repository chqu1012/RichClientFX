package de.dc.javafx.xcore.workbench.emf.file;

import org.eclipse.emf.ecore.EObject;

import de.dc.javafx.xcore.workbench.emf.view.IEmfEditorPart;

public interface IEmfFileManager {

	void register(IEmfFile<? extends EObject> file);
	
	IEmfEditorPart getEditorByExtension(String extension);
}
