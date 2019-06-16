package de.dc.javafx.xcore.workbench.emf.file;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;

import de.dc.javafx.xcore.workbench.emf.view.IEmfEditorPart;

public class EmfFileManager implements IEmfFileManager{

	private Logger logger = Logger.getLogger(EmfFileManager.class.getSimpleName());
	
	private Map<String, IEmfEditorPart<?>> editorRegistry = new HashMap<>();

	@Override
	public Optional<IEmfEditorPart<?>> getEditorByExtension(String extension) {
		return Optional.of(editorRegistry.get(extension));
	}

	@Override
	public void register(IEmfEditorPart<?> editorPart) {
		String extension = editorPart.getExtension();
		editorRegistry.put(extension, editorPart);
		logger.log(Level.ALL, "Registrate editor part with "+extension);
	}

	@Override
	public List<String> getAllExtensions() {
		return editorRegistry.keySet().stream().collect(Collectors.toList());
	}
	
}
