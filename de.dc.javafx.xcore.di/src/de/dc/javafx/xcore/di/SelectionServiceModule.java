package de.dc.javafx.xcore.di;

import com.google.inject.AbstractModule;

public class SelectionServiceModule extends AbstractModule {
	@Override
	protected void configure() {
		bind(SelectionService.class).to(SelectionServiceImpl.class).asEagerSingleton();
		bind(IEventBroker.class).to(EventBroker.class).asEagerSingleton();
	}
}