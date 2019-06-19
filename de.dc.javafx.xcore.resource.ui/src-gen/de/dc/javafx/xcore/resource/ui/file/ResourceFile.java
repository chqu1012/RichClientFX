package de.dc.javafx.xcore.resource.ui.file;

import de.dc.javafx.xcore.resource.ResourceFactory;
import de.dc.javafx.xcore.resource.ResourcePackage;
import de.dc.javafx.xcore.resource.Workspace;
import de.dc.javafx.xcore.workbench.emf.file.EmfFile;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EPackage;

@SuppressWarnings("all")
public class ResourceFile extends EmfFile<Workspace> {
  @Override
  public EPackage getEPackageEInstance() {
    return ResourcePackage.eINSTANCE;
  }
  
  @Override
  public EFactory getEFactoryEInstance() {
    return ResourceFactory.eINSTANCE;
  }
  
  @Override
  public String getExtension() {
    return ResourcePackage.eNAME;
  }
}
