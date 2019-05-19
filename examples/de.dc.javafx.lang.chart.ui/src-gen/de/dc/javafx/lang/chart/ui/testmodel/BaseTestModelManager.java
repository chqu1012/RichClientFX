package de.dc.javafx.lang.chart.ui.testmodel;

import de.dc.javafx.efxclipse.runtime.command.CommandStackImpl;
import de.dc.javafx.efxclipse.runtime.model.IEmfManager;
import de.dc.javafx.emfsupport.website.model.ModelFactory;
import de.dc.javafx.emfsupport.website.model.Website;
import de.dc.javafx.emfsupport.website.model.provider.ModelItemProviderAdapterFactory;
import org.eclipse.emf.ecore.change.util.ChangeRecorder;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.ReflectiveItemProviderAdapterFactory;
import org.eclipse.emf.edit.provider.resource.ResourceItemProviderAdapterFactory;

@SuppressWarnings("all")
public class BaseTestModelManager implements IEmfManager<Website> {
  private Website root;
  
  private EditingDomain editingDomain;
  
  private ComposedAdapterFactory adapterFactory;
  
  private ChangeRecorder changeRecorder;
  
  private CommandStackImpl commandStack;
  
  public BaseTestModelManager() {
    adapterFactory = new ComposedAdapterFactory(ComposedAdapterFactory.Descriptor.Registry.INSTANCE);
    adapterFactory.addAdapterFactory(new ModelItemProviderAdapterFactory());
    adapterFactory.addAdapterFactory(new ResourceItemProviderAdapterFactory());
    adapterFactory.addAdapterFactory(new ReflectiveItemProviderAdapterFactory());
    
    commandStack = new CommandStackImpl();
    editingDomain = new AdapterFactoryEditingDomain(adapterFactory, commandStack);
    changeRecorder = new ChangeRecorder();
  }
  
  public Website getRoot() {
    if (root==null) {
      root = ModelFactory.eINSTANCE.createWebsite();
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
