package de.dc.javafx.xcore.workbench.ui.event;

public interface IEventContext<T> {

	EventTopic getEventTopic();
	
	String getEventId();
	
	T getInput();
}
