package de.dc.javafx.xcore.workbench.command.ui.factory;
import org.eclipse.emf.common.command.Command;

import de.dc.javafx.xcore.workbench.command.CommandFactory;
import de.dc.javafx.xcore.workbench.command.EmfCommand;
import de.dc.javafx.xcore.workbench.emf.factory.ExtendedFactory;

public interface ExtendedCommandFactory extends CommandFactory, ExtendedFactory {

	ExtendedCommandFactory eINSTANCE = ExtendedCommandFactoryImpl.init();
	
	EmfCommand create(Command command, String name, String description);
}