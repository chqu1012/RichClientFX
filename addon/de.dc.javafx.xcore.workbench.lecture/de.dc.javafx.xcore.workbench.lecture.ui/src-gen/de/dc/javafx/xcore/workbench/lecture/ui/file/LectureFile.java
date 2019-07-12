package de.dc.javafx.xcore.workbench.lecture.ui.file;

import de.dc.javafx.xcore.workbench.emf.file.EmfFile;
import de.dc.javafx.xcore.workbench.lecture.LectureFactory;
import de.dc.javafx.xcore.workbench.lecture.LecturePackage;
import de.dc.javafx.xcore.workbench.lecture.LectureProject;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EPackage;

@SuppressWarnings("all")
public class LectureFile extends EmfFile<LectureProject> {
  @Override
  public EPackage getEPackageEInstance() {
    return LecturePackage.eINSTANCE;
  }
  
  @Override
  public EFactory getEFactoryEInstance() {
    return LectureFactory.eINSTANCE;
  }
  
  @Override
  public String getExtension() {
    return LecturePackage.eNAME;
  }
}
