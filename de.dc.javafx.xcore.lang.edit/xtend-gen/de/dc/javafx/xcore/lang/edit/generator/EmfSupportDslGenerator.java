package de.dc.javafx.xcore.lang.edit.generator;

import com.google.inject.Inject;
import de.dc.javafx.xcore.lang.edit.configuration.SourceOutputConfigurationProvider;
import de.dc.javafx.xcore.lang.edit.emfSupportDsl.Ecore;
import de.dc.javafx.xcore.lang.edit.generator.ApplicationTemplate;
import de.dc.javafx.xcore.lang.edit.generator.ModelViewTemplate;
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
  
  @Override
  public void doGenerate(final Resource input, final IFileSystemAccess fsa) {
    this.jvmModelGenerator.doGenerate(input, fsa);
    final Function1<EObject, Boolean> _function = (EObject it) -> {
      return Boolean.valueOf((it instanceof Ecore));
    };
    final Procedure1<EObject> _function_1 = (EObject content) -> {
      final Ecore ecore = ((Ecore) content);
      fsa.generateFile(this.applicationTemplate.path(ecore), SourceOutputConfigurationProvider.DEFAULT_SRC, this.applicationTemplate.code(ecore));
      fsa.generateFile(this.modelViewTemplate.path(ecore), SourceOutputConfigurationProvider.DEFAULT_SRC, this.modelViewTemplate.code(ecore));
    };
    IteratorExtensions.<EObject>forEach(IteratorExtensions.<EObject>filter(input.getContents().get(0).eAllContents(), _function), _function_1);
  }
}
