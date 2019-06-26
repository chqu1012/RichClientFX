package de.dc.javafx.xcore.workbench.barcode.ui.manager;

import de.dc.javafx.xcore.workbench.barcode.BarcodeFXProject;
import de.dc.javafx.xcore.workbench.barcode.BarcodeFactory;
import de.dc.javafx.xcore.workbench.barcode.BarcodePackage;
import de.dc.javafx.xcore.workbench.barcode.provider.BarcodeItemProviderAdapterFactory;
import de.dc.javafx.xcore.workbench.barcode.ui.file.BarcodeFile;
import de.dc.javafx.xcore.workbench.emf.AbstractEmfManager;
import de.dc.javafx.xcore.workbench.emf.file.IEmfFile;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EPackage;

@SuppressWarnings("all")
public class BarcodeEmfManager extends AbstractEmfManager<BarcodeFXProject> {
  @Override
  protected AdapterFactory getModelItemProviderAdapterFactory() {
    return new BarcodeItemProviderAdapterFactory();
  }
  
  @Override
  protected BarcodeFXProject initModel() {
    return BarcodeFactory.eINSTANCE.createBarcodeFXProject();
  }
  
  @Override
  public EPackage getModelPackage() {
    return BarcodePackage.eINSTANCE;
  }
  
  @Override
  public EFactory getExtendedModelFactory() {
    return BarcodeFactory.eINSTANCE;
  }
  
  @Override
  public IEmfFile<BarcodeFXProject> initFile() {
    return new BarcodeFile();
  }
}
