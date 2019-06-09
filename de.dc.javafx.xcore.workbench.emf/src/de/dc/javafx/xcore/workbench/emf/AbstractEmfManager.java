package de.dc.javafx.xcore.workbench.emf;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.change.util.ChangeRecorder;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.ReflectiveItemProviderAdapterFactory;
import org.eclipse.emf.edit.provider.resource.ResourceItemProviderAdapterFactory;

import de.dc.javafx.xcore.workbench.emf.command.CommandStackImpl;

public abstract class AbstractEmfManager<T> implements IEmfManager<T> {

	protected T root;

	private EditingDomain editingDomain;

	private ComposedAdapterFactory adapterFactory;

	private ChangeRecorder changeRecorder;
	
	private CommandStackImpl commandStack;
	
	public AbstractEmfManager() {
		adapterFactory = new ComposedAdapterFactory(ComposedAdapterFactory.Descriptor.Registry.INSTANCE);
		adapterFactory.addAdapterFactory(getModelItemProviderAdapterFactory());
		adapterFactory.addAdapterFactory(new ResourceItemProviderAdapterFactory());
		adapterFactory.addAdapterFactory(new ReflectiveItemProviderAdapterFactory());
		
		commandStack = new CommandStackImpl();
		editingDomain = new AdapterFactoryEditingDomain(adapterFactory, commandStack);
		changeRecorder = new ChangeRecorder();
		root = initModel();	
	}
	
	protected abstract AdapterFactory getModelItemProviderAdapterFactory();

	protected abstract T initModel();
	
	protected T createNewModelOnNullCheck() {
		return initModel();
	}

	@Override
	public T getRoot() {
		if (root == null) {
			root = createNewModelOnNullCheck();
		}
		return root;
	}


	@Override
	public EditingDomain getEditingDomain() {
		return editingDomain;
	}

	@Override
	public ComposedAdapterFactory getAdapterFactory() {
		return adapterFactory;
	}

	@Override
	public ChangeRecorder getChangeRecorder() {
		return changeRecorder;
	}

	@Override
	public CommandStackImpl getCommandStack() {
		return commandStack;
	}
	
	
}
