package de.dc.javafx.xcore.lang.edit.generator;

import com.google.inject.Inject;
import de.dc.javafx.xcore.lang.edit.configuration.SourceOutputConfigurationProvider;
import de.dc.javafx.xcore.lang.edit.emfSupportDsl.Ecore;
import de.dc.javafx.xcore.lang.edit.emfSupportDsl.SupportedControl;
import de.dc.javafx.xcore.lang.edit.generator.ApplicationTemplate;
import de.dc.javafx.xcore.lang.edit.generator.ExtendedFactoryImplTemplate;
import de.dc.javafx.xcore.lang.edit.generator.ExtendedFactoryTemplate;
import de.dc.javafx.xcore.lang.edit.generator.ModelViewTemplate;
import de.dc.javafx.xcore.lang.edit.generator.SupportedControlApplicationTemplate;
import de.dc.javafx.xcore.lang.edit.generator.SupportedControlViewTemplate;
import java.util.function.Consumer;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.xbase.compiler.JvmModelGenerator;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
public class EmfSupportDslGenerator implements IGenerator {
  @Inject
  private JvmModelGenerator jvmModelGenerator;
  
  @Inject
  private ApplicationTemplate applicationTemplate;
  
  @Inject
  private ModelViewTemplate modelViewTemplate;
  
  @Inject
  private SupportedControlApplicationTemplate supportedCotnrolApplicationTemplate;
  
  @Inject
  private SupportedControlViewTemplate supportedCotnrolViewTemplate;
  
  @Inject
  private ExtendedFactoryTemplate extFactoryTemplate;
  
  @Inject
  private ExtendedFactoryImplTemplate extFactoryImplTemplate;
  
  @Override
  public void doGenerate(final Resource input, final IFileSystemAccess fsa) {
    this.jvmModelGenerator.doGenerate(input, fsa);
    final String src = SourceOutputConfigurationProvider.DEFAULT_SRC;
    final Function1<EObject, Boolean> _function = (EObject it) -> {
      return Boolean.valueOf((it instanceof Ecore));
    };
    final Procedure1<EObject> _function_1 = (EObject content) -> {
      final Ecore ecore = ((Ecore) content);
      fsa.generateFile(this.applicationTemplate.path(ecore), src, this.applicationTemplate.code(ecore));
      fsa.generateFile(this.modelViewTemplate.path(ecore), src, this.modelViewTemplate.code(ecore));
      fsa.generateFile(this.extFactoryTemplate.path(ecore), src, this.extFactoryTemplate.code(ecore));
      fsa.generateFile(this.extFactoryImplTemplate.path(ecore), src, this.extFactoryImplTemplate.code(ecore));
      final Consumer<SupportedControl> _function_2 = (SupportedControl i) -> {
        final String path = this.supportedCotnrolApplicationTemplate.path(i);
        final String code = this.supportedCotnrolApplicationTemplate.code(i);
        fsa.generateFile(path, src, code);
      };
      ecore.getSupportedControls().forEach(_function_2);
      final Consumer<SupportedControl> _function_3 = (SupportedControl i) -> {
        final String path = this.supportedCotnrolViewTemplate.path(i);
        final String code = this.supportedCotnrolViewTemplate.code(i);
        fsa.generateFile(path, src, code);
      };
      ecore.getSupportedControls().forEach(_function_3);
    };
    IteratorExtensions.<EObject>forEach(IteratorExtensions.<EObject>filter(input.getContents().get(0).eAllContents(), _function), _function_1);
  }
}
