package de.dc.javafx.xcore.workbench.command.ui.factory;
import java.time.LocalDateTime;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import de.dc.javafx.xcore.workbench.command.CommandPackage;
import de.dc.javafx.xcore.workbench.command.EmfCommand;
import de.dc.javafx.xcore.workbench.command.EmfResult;
import de.dc.javafx.xcore.workbench.command.impl.CommandFactoryImpl;

public class ExtendedCommandFactoryImpl extends CommandFactoryImpl implements ExtendedCommandFactory {

	public static ExtendedCommandFactory init() {
		try {
			ExtendedCommandFactory theResourceFactory = (ExtendedCommandFactory) EPackage.Registry.INSTANCE
					.getEFactory(CommandPackage.eNS_URI);
			if (theResourceFactory != null) {
				return theResourceFactory;
			}
		} catch (Exception exception) {
		}
		return new ExtendedCommandFactoryImpl();
	}

	// Todo: This Method is override from the base ModelFactoryImpl, because it doesn't support #create method for ids
	@Override
	public EObject create(int classifierId) {
		switch (classifierId) {
		case CommandPackage.EMF_COMMAND_HISTORY:
			return createEmfCommandHistory();
		case CommandPackage.EMF_COMMAND:
			return createEmfCommand();
		case CommandPackage.EMF_RESULT:
			return createEmfResult();
		default:
			throw new IllegalArgumentException("The class '" + classifierId + "' is not a valid classifier, please enhanced the class "+getClass().getSimpleName()+"#create(classifierId) in switch case!");
		}
	}

	@Override
	public EmfCommand create(Command command, String name, String description) {
		EmfCommand emfCommand = createEmfCommand();
		emfCommand.setCommand(command);
		emfCommand.setName(command.getLabel());
		emfCommand.setDescription(description);
		emfCommand.setTimestamp(LocalDateTime.now());
		
		command.getResult().forEach(e->{
			EmfResult result = createEmfResult();
			result.setName("");
			result.setObject(e);
			emfCommand.getResults().add(result);
		});
		
		return emfCommand;
	}
	
}