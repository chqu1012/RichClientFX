package de.dc.javafx.xcore.workbench.di;

import com.google.inject.AbstractModule;

import de.dc.javafx.xcore.workbench.emf.event.EmfSelectionService;
import de.dc.javafx.xcore.workbench.emf.event.IEmfSelectionService;
import de.dc.javafx.xcore.workbench.event.EventBroker;
import de.dc.javafx.xcore.workbench.event.IEventBroker;

public class EventModule extends AbstractModule {

	@Override
	protected void configure() {
		bind(IEventBroker.class).to(EventBroker.class).asEagerSingleton();
		bind(IEmfSelectionService.class).to(EmfSelectionService.class).asEagerSingleton();
	}
}
