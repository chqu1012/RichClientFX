package de.dc.javafx.xcore.di;

public interface EventContext<T> {

	EventTopic getEventTopic();
	
	T getInput();
}
