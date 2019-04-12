package de.dc.javafx.xcore.lang.generator;

import com.google.inject.Inject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.xbase.compiler.JvmModelGenerator;
import org.eclipse.xtext.xbase.lib.InputOutput;

@SuppressWarnings("all")
public class JavaFXDslGenerator implements IGenerator {
  @Inject
  private JvmModelGenerator jvmModelGenerator;
  
  @Override
  public void doGenerate(final Resource input, final IFileSystemAccess fsa) {
    InputOutput.<String>println("GENERATE");
  }
}
