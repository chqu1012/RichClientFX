package de.dc.javafx.xcore.workbench.ide.model.template;

import de.dc.javafx.xcore.workbench.ide.model.IdeContainer;
import de.dc.javafx.xcore.workbench.ide.model.template.IGenerator;
import de.dc.javafx.xcore.workbench.ide.model.template.SourceType;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class ManagerTemplate implements IGenerator<IdeContainer> {
  @Override
  public String gen(final IdeContainer project) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    String _packagePath = project.getPackagePath();
    _builder.append(_packagePath);
    _builder.append(".manager;");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("import org.eclipse.emf.common.notify.AdapterFactory;");
    _builder.newLine();
    _builder.append("import org.eclipse.emf.ecore.EPackage;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import ");
    String _name = project.getModelEFactory().getClass().getPackage().getName();
    _builder.append(_name);
    _builder.append(".*;");
    _builder.newLineIfNotEmpty();
    _builder.append("import ");
    String _name_1 = project.getModelEFactory().getClass().getPackage().getName();
    _builder.append(_name_1);
    _builder.append(".provider.ChartItemProviderAdapterFactory;");
    _builder.newLineIfNotEmpty();
    _builder.append("import ");
    String _packagePath_1 = project.getPackagePath();
    _builder.append(_packagePath_1);
    _builder.append(".factory.*;");
    _builder.newLineIfNotEmpty();
    _builder.append("import ");
    String _packagePath_2 = project.getPackagePath();
    _builder.append(_packagePath_2);
    _builder.append(".file.*;");
    _builder.newLineIfNotEmpty();
    _builder.append("import de.dc.javafx.xcore.workbench.emf.AbstractEmfManager;");
    _builder.newLine();
    _builder.append("import de.dc.javafx.xcore.workbench.emf.factory.ExtendedFactory;");
    _builder.newLine();
    _builder.append("import de.dc.javafx.xcore.workbench.emf.file.IEmfFile;");
    _builder.newLine();
    final String modelName = project.getModelName();
    _builder.newLineIfNotEmpty();
    _builder.append("public class ");
    _builder.append(modelName);
    _builder.append("EmfManager extends AbstractEmfManager<");
    _builder.append(modelName);
    _builder.append("> {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("protected AdapterFactory getModelItemProviderAdapterFactory() {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("return new ");
    _builder.append(modelName, "\t\t");
    _builder.append("ItemProviderAdapterFactory();");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("protected ");
    _builder.append(modelName, "\t");
    _builder.append(" initModel() {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("return ");
    _builder.append(modelName, "\t\t");
    _builder.append("Factory.eINSTANCE.createChartProject();");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("protected ChartProject createNewModelOnNullCheck() {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("return initModel();");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public EPackage getModelPackage() {");
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
    _builder.append("public ExtendedFactory getExtendedModelFactory() {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("return Extended");
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
    _builder.append("public IEmfFile<ChartProject> initFile() {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("return new ");
    _builder.append(modelName, "\t\t");
    _builder.append("File();");
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
    _builder.append("EmfManager");
    return _builder.toString();
  }
  
  @Override
  public String genPath(final IdeContainer t) {
    StringConcatenation _builder = new StringConcatenation();
    String _replace = t.getPackagePath().replace(".", "/");
    _builder.append(_replace);
    _builder.append("/manager/");
    return _builder.toString();
  }
  
  @Override
  public SourceType getSourceType() {
    return SourceType.SRC;
  }
}
