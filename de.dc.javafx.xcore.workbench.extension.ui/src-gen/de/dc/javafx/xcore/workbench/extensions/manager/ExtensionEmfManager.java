package de.dc.javafx.xcore.workbench.extensions.manager;

import de.dc.javafx.xcore.workbench.emf.AbstractEmfManager;
import de.dc.javafx.xcore.workbench.emf.file.IEmfFile;
import de.dc.javafx.xcore.workbench.extensions.ExtensionManager;
import de.dc.javafx.xcore.workbench.extensions.ExtensionsFactory;
import de.dc.javafx.xcore.workbench.extensions.ExtensionsPackage;
import de.dc.javafx.xcore.workbench.extensions.file.ExtensionFile;
import de.dc.javafx.xcore.workbench.extensions.provider.ExtensionsItemProviderAdapterFactory;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EPackage;

@SuppressWarnings("all")
public class ExtensionEmfManager extends AbstractEmfManager<ExtensionManager> {
  @Override
  protected AdapterFactory getModelItemProviderAdapterFactory() {
    return new ExtensionsItemProviderAdapterFactory();
  }
  
  @Override
  protected ExtensionManager initModel() {
    return ExtensionsFactory.eINSTANCE.createExtensionManager();
  }
  
  @Override
  public EPackage getModelPackage() {
    return ExtensionsPackage.eINSTANCE;
  }
  
  @Override
  public EFactory getExtendedModelFactory() {
    return ExtensionsFactory.eINSTANCE;
  }
  
  @Override
  public IEmfFile<ExtensionManager> initFile() {
    return new ExtensionFile();
  }
}
