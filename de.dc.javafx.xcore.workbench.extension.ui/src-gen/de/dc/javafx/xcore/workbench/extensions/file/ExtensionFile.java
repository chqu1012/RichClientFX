package de.dc.javafx.xcore.workbench.extensions.file;

import de.dc.javafx.xcore.workbench.emf.file.EmfFile;
import de.dc.javafx.xcore.workbench.extensions.ExtensionManager;
import de.dc.javafx.xcore.workbench.extensions.ExtensionsFactory;
import de.dc.javafx.xcore.workbench.extensions.ExtensionsPackage;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EPackage;

@SuppressWarnings("all")
public class ExtensionFile extends EmfFile<ExtensionManager> {
  @Override
  public EPackage getEPackageEInstance() {
    return ExtensionsPackage.eINSTANCE;
  }
  
  @Override
  public EFactory getEFactoryEInstance() {
    return ExtensionsFactory.eINSTANCE;
  }
  
  @Override
  public String getExtension() {
    return ExtensionsPackage.eNAME;
  }
}
