package de.dc.javafx.xcore.workbench.ui.demo.module;

import com.google.inject.AbstractModule;

import de.dc.javafx.xcore.workbench.ui.demo.command.RunCommand;

public class CommandsModule extends AbstractModule{

	@Override
	protected void configure() {
		bind(RunCommand.class).asEagerSingleton();
	}

}
