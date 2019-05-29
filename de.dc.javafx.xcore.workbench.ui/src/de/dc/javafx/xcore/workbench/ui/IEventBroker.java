package de.dc.javafx.xcore.workbench.ui;

public interface IEventBroker {

	void register(Object obj);

	void unregister(Object obj);
	
	void post(EventContext<?> context);
}
