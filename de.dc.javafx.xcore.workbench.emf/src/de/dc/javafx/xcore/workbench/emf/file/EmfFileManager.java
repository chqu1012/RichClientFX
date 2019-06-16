package de.dc.javafx.xcore.workbench.emf.file;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;

import de.dc.javafx.xcore.workbench.emf.view.IEmfEditorPart;

public class EmfFileManager implements IEmfFileManager{

	private Map<String, IEmfEditorPart> editorRegistry = new HashMap<>();

	@Override
	public void register(IEmfFile<? extends EObject> file) {
		
	}

	@Override
	public IEmfEditorPart getEditorByExtension(String extension) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
