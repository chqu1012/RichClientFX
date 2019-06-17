package de.dc.javafx.xcore.workbench.ide.model.template;

import de.dc.javafx.xcore.workbench.ide.model.IdeContainer;
import de.dc.javafx.xcore.workbench.ide.model.template.IGenerator;
import de.dc.javafx.xcore.workbench.ide.model.template.SourceType;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class FileTemplate implements IGenerator<IdeContainer> {
  @Override
  public String gen(final IdeContainer project) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    String _packagePath = project.getPackagePath();
    _builder.append(_packagePath);
    _builder.append(".file;");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("import org.eclipse.emf.ecore.*;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import ");
    String _name = project.getModelEFactory().getClass().getPackage().getName();
    _builder.append(_name);
    _builder.append(".*;");
    _builder.newLineIfNotEmpty();
    _builder.append("import de.dc.javafx.xcore.workbench.emf.file.EmfFile;");
    _builder.newLine();
    final String modelName = project.getModelName();
    _builder.newLineIfNotEmpty();
    _builder.append("public class ");
    _builder.append(modelName);
    _builder.append("File extends EmfFile<");
    _builder.append(modelName);
    _builder.append(">{");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public EPackage getEPackageEInstance() {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("return ");
    _builder.append(modelName, "\t\t");
    _builder.append("Package.eINSTANCE;");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public EFactory getEFactoryEInstance() {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("return ");
    _builder.append(modelName, "\t\t");
    _builder.append("Factory.eINSTANCE;");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public String getExtension() {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("return \"");
    String _ext = project.getExt();
    _builder.append(_ext, "\t\t");
    _builder.append("\";");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }
  
  @Override
  public String genName(final IdeContainer t) {
    StringConcatenation _builder = new StringConcatenation();
    String _modelName = t.getModelName();
    _builder.append(_modelName);
    _builder.append("File");
    return _builder.toString();
  }
  
  @Override
  public String genPath(final IdeContainer t) {
    StringConcatenation _builder = new StringConcatenation();
    String _replace = t.getPackagePath().replace(".", "/");
    _builder.append(_replace);
    _builder.append("/file/");
    return _builder.toString();
  }
  
  @Override
  public SourceType getSourceType() {
    return SourceType.SRC;
  }
}
