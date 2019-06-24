package de.dc.javafx.xcore.resource.ui.manager;

import de.dc.javafx.xcore.resource.RecentlyOpenFileHistory;
import de.dc.javafx.xcore.resource.ResourceFactory;
import de.dc.javafx.xcore.resource.ResourcePackage;
import de.dc.javafx.xcore.resource.provider.ResourceItemProviderAdapterFactory;
import de.dc.javafx.xcore.resource.ui.file.ResourceFile;
import de.dc.javafx.xcore.workbench.emf.AbstractEmfManager;
import de.dc.javafx.xcore.workbench.emf.file.IEmfFile;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EPackage;

@SuppressWarnings("all")
public class ResourceEmfManager extends AbstractEmfManager<RecentlyOpenFileHistory> {
  @Override
  protected AdapterFactory getModelItemProviderAdapterFactory() {
    return new ResourceItemProviderAdapterFactory();
  }
  
  @Override
  protected RecentlyOpenFileHistory initModel() {
    return ResourceFactory.eINSTANCE.createRecentlyOpenFileHistory();
  }
  
  @Override
  public EPackage getModelPackage() {
    return ResourcePackage.eINSTANCE;
  }
  
  @Override
  public EFactory getExtendedModelFactory() {
    return ResourceFactory.eINSTANCE;
  }
  
  @Override
  public IEmfFile<RecentlyOpenFileHistory> initFile() {
    return new ResourceFile();
  }
}
