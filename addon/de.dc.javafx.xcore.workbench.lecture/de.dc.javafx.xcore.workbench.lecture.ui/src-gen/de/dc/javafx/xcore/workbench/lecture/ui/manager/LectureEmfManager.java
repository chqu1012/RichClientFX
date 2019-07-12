package de.dc.javafx.xcore.workbench.lecture.ui.manager;

import de.dc.javafx.xcore.workbench.emf.AbstractEmfManager;
import de.dc.javafx.xcore.workbench.emf.file.IEmfFile;
import de.dc.javafx.xcore.workbench.lecture.LectureFactory;
import de.dc.javafx.xcore.workbench.lecture.LecturePackage;
import de.dc.javafx.xcore.workbench.lecture.LectureProject;
import de.dc.javafx.xcore.workbench.lecture.provider.LectureItemProviderAdapterFactory;
import de.dc.javafx.xcore.workbench.lecture.ui.file.LectureFile;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EPackage;

@SuppressWarnings("all")
public class LectureEmfManager extends AbstractEmfManager<LectureProject> {
  @Override
  protected AdapterFactory getModelItemProviderAdapterFactory() {
    return new LectureItemProviderAdapterFactory();
  }
  
  @Override
  protected LectureProject initModel() {
    return LectureFactory.eINSTANCE.createLectureProject();
  }
  
  @Override
  public EPackage getModelPackage() {
    return LecturePackage.eINSTANCE;
  }
  
  @Override
  public EFactory getExtendedModelFactory() {
    return LectureFactory.eINSTANCE;
  }
  
  @Override
  public IEmfFile<LectureProject> initFile() {
    return new LectureFile();
  }
}
