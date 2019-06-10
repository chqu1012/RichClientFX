package de.dc.javafx.xcore.workbench.command.ui.factory;
import de.dc.javafx.xcore.workbench.command.CommandFactory;
import de.dc.javafx.xcore.workbench.emf.factory.ExtendedFactory;

public interface ExtendedCommandFactory extends CommandFactory, ExtendedFactory {

	ExtendedCommandFactory eINSTANCE = ExtendedCommandFactoryImpl.init();
}