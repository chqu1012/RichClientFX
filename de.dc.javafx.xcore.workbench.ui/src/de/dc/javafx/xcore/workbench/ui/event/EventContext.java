package de.dc.javafx.xcore.workbench.ui.event;

public class EventContext<T> implements IEventContext<T> {

	private EventTopic topic;
	private T input;
	
	public EventContext(EventTopic topic, T input) {
		this.topic = topic;
		this.input = input;
	}
	
	@Override
	public EventTopic getEventTopic() {
		return topic;
	}

	@Override
	public T getInput() {
		return input;
	}

}
