package de.dc.javafx.xcore.workbench.ui;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;

import de.dc.javafx.xcore.workbench.ui.event.IEmfCommand;

public class EmfCommandManager{

	private Logger log = Logger.getLogger(EmfCommandManager.class.getSimpleName());
	private Map<String, IEmfCommand> commandRegistry = new HashMap<String, IEmfCommand>();
	
	public void register(String id, Class<? extends IEmfCommand> command) {
		try {
			commandRegistry.put(id, command.newInstance());
		} catch (InstantiationException | IllegalAccessException e) {
			log.log(Level.SEVERE, "Failed to register command "+e.getMessage());
		}
	}
	
	public Optional<IEmfCommand> findBy(String id){
		return Optional.of(commandRegistry.get(id));
	}
	
	public void execute(String id) {
		findBy(id).ifPresent(IEmfCommand::execute);			
	}
}
