package de.dc.javafx.xcore.workbench.event;

import com.google.common.eventbus.EventBus;

public class EventBroker implements IEventBroker{

	private EventBus eventBus = new EventBus();
	
	@Override
	public void register(Object obj) {
		eventBus.register(obj);
	}

	@Override
	public void post(EventContext<?> context) {
		eventBus.post(context);
	}

	@Override
	public void unregister(Object obj) {
		eventBus.unregister(obj);		
	}

}
