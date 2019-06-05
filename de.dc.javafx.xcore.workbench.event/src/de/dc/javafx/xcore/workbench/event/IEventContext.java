package de.dc.javafx.xcore.workbench.event;

public interface IEventContext<T> {

	EventTopic getEventTopic();
	
	String getEventId();
	
	T getInput();
}
