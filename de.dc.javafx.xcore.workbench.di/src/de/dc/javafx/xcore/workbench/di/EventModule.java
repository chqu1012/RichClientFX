package de.dc.javafx.xcore.workbench.di;

import com.google.inject.AbstractModule;

import de.dc.javafx.xcore.workbench.event.EmfSelectionService;
import de.dc.javafx.xcore.workbench.event.EventBroker;
import de.dc.javafx.xcore.workbench.event.IEmfSelectionService;
import de.dc.javafx.xcore.workbench.event.IEventBroker;
import de.dc.javafx.xcore.workbench.event.ISelectionService;
import de.dc.javafx.xcore.workbench.event.SelectionService;

public class EventModule extends AbstractModule {

	@Override
	protected void configure() {
		bind(IEventBroker.class).to(EventBroker.class).asEagerSingleton();
		bind(ISelectionService.class).to(SelectionService.class).asEagerSingleton();
		bind(IEmfSelectionService.class).to(EmfSelectionService.class).asEagerSingleton();
	}
}
