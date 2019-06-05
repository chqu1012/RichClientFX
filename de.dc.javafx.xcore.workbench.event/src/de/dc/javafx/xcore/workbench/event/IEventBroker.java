package de.dc.javafx.xcore.workbench.event;

public interface IEventBroker {

	void register(Object obj);

	void unregister(Object obj);
	
	void post(EventContext<?> context);
}
