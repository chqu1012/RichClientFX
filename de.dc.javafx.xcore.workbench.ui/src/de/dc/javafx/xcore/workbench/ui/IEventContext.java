package de.dc.javafx.xcore.workbench.ui;

public interface IEventContext<T> {

	EventTopic getEventTopic();
	
	T getInput();
}
