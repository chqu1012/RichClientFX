package de.dc.javafx.xcore.workbench.ui.event;

public interface IEventBroker {

	void register(Object obj);

	void unregister(Object obj);
	
	void post(EventContext<?> context);
}
