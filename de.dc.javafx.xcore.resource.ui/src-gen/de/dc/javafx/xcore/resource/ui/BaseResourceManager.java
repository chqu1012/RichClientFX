package de.dc.javafx.xcore.resource.ui;

import de.dc.javafx.efxclipse.runtime.command.CommandStackImpl;
import de.dc.javafx.efxclipse.runtime.model.IEmfManager;
import de.dc.javafx.xcore.resource.ResourceFactory;
import de.dc.javafx.xcore.resource.Workspace;
import de.dc.javafx.xcore.resource.provider.ResourceItemProviderAdapterFactory;
import org.eclipse.emf.ecore.change.util.ChangeRecorder;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.ReflectiveItemProviderAdapterFactory;

@SuppressWarnings("all")
public class BaseResourceManager implements IEmfManager<Workspace> {
  private Workspace root;
  
  private EditingDomain editingDomain;
  
  private ComposedAdapterFactory adapterFactory;
  
  private ChangeRecorder changeRecorder;
  
  private CommandStackImpl commandStack;
  
  public BaseResourceManager() {
    adapterFactory = new ComposedAdapterFactory(ComposedAdapterFactory.Descriptor.Registry.INSTANCE);
    adapterFactory.addAdapterFactory(new ResourceItemProviderAdapterFactory());
    adapterFactory.addAdapterFactory(new org.eclipse.emf.edit.provider.resource.ResourceItemProviderAdapterFactory());
    adapterFactory.addAdapterFactory(new ReflectiveItemProviderAdapterFactory());
    
    commandStack = new CommandStackImpl();
    editingDomain = new AdapterFactoryEditingDomain(adapterFactory, commandStack);
    changeRecorder = new ChangeRecorder();
  }
  
  public Workspace getRoot() {
    if (root==null) {
      root = ResourceFactory.eINSTANCE.createWorkspace();
    }
    return root;
  }
  
  public EditingDomain getEditingDomain() {
    return this.editingDomain;
  }
  
  public ComposedAdapterFactory getAdapterFactory() {
    return this.adapterFactory;
  }
  
  public ChangeRecorder getChangeRecorder() {
    return this.changeRecorder;
  }
  
  public CommandStackImpl getCommandStack() {
    return this.commandStack;
  }
}
