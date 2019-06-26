package de.dc.javafx.xcore.workbench.barcode.ui.file;

import de.dc.javafx.xcore.workbench.barcode.BarcodeFXProject;
import de.dc.javafx.xcore.workbench.barcode.BarcodeFactory;
import de.dc.javafx.xcore.workbench.barcode.BarcodePackage;
import de.dc.javafx.xcore.workbench.emf.file.EmfFile;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EPackage;

@SuppressWarnings("all")
public class BarcodeFile extends EmfFile<BarcodeFXProject> {
  @Override
  public EPackage getEPackageEInstance() {
    return BarcodePackage.eINSTANCE;
  }
  
  @Override
  public EFactory getEFactoryEInstance() {
    return BarcodeFactory.eINSTANCE;
  }
  
  @Override
  public String getExtension() {
    return BarcodePackage.eNAME;
  }
}
