package de.dc.javafx.xcore.workbench.ui;
import com.google.inject.AbstractModule;

public class BaseEmfModule extends AbstractModule{

	@Override
	protected void configure() {
		bind(IEmfControlManager.class).to(EmfControlManager.class).asEagerSingleton();
		bind(IEventBroker.class).to(EventBroker.class).asEagerSingleton();
		bind(ISelectionService.class).to(SelectionService.class).asEagerSingleton();
	}

}
