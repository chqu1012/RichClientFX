package de.dc.javafx.xcore.di;

public interface IEventContext<T> {

	EventTopic getEventTopic();
	
	T getInput();
}
