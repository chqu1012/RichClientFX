package de.dc.javafx.xcore.workbench.ide.model.template;

import de.dc.javafx.xcore.workbench.ide.model.IdeContainer;
import de.dc.javafx.xcore.workbench.ide.model.template.IGenerator;
import de.dc.javafx.xcore.workbench.ide.model.template.SourceType;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class FactoryImplTemplate implements IGenerator<IdeContainer> {
  @Override
  public String gen(final IdeContainer project) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    String _packagePath = project.getPackagePath();
    _builder.append(_packagePath);
    _builder.append(".factory;");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("import org.eclipse.emf.ecore.*;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import ");
    String _name = project.getModelEPackage().getClass().getPackage().getName();
    _builder.append(_name);
    _builder.append(".*;");
    _builder.newLineIfNotEmpty();
    _builder.append("import ");
    String _name_1 = project.getModelEPackage().getClass().getPackage().getName();
    _builder.append(_name_1);
    _builder.append(".impl.*;");
    _builder.newLineIfNotEmpty();
    final String modelName = project.getModelName();
    _builder.newLineIfNotEmpty();
    _builder.append("public class Extended");
    _builder.append(modelName);
    _builder.append("FactoryImpl extends ");
    _builder.append(modelName);
    _builder.append("FactoryImpl implements Extended");
    _builder.append(modelName);
    _builder.append("Factory {");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public static Extended");
    _builder.append(modelName, "\t");
    _builder.append("Factory init() {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("try {");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("Extended");
    _builder.append(modelName, "\t\t\t");
    _builder.append("Factory theResourceFactory = (Extended");
    _builder.append(modelName, "\t\t\t");
    _builder.append("Factory) EPackage.Registry.INSTANCE");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t\t\t");
    _builder.append(".getEFactory(");
    _builder.append(modelName, "\t\t\t\t\t");
    _builder.append("Package.eNS_URI);");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    _builder.append("if (theResourceFactory != null) {");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("return theResourceFactory;");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("} catch (Exception exception) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("return new Extended");
    _builder.append(modelName, "\t\t");
    _builder.append("FactoryImpl();");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("// TODO: This Method is override from the base ModelFactoryImpl, because it doesn\'t support #create method for ids");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public EObject create(int classifierId) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("switch (classifierId) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("// TODO: Should be replaced");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("default:");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("throw new IllegalArgumentException(\"The class \'\" + classifierId + \"\' is not a valid classifier, please enhanced the class \"+getClass().getSimpleName()+\"#create(classifierId) in switch case!\");");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
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
    _builder.append("Extended");
    String _modelName = t.getModelName();
    _builder.append(_modelName);
    _builder.append("FactoryImpl");
    return _builder.toString();
  }
  
  @Override
  public String genPath(final IdeContainer t) {
    StringConcatenation _builder = new StringConcatenation();
    String _replace = t.getPackagePath().replace(".", "/");
    _builder.append(_replace);
    _builder.append("/factory/");
    return _builder.toString();
  }
  
  @Override
  public SourceType getSourceType() {
    return SourceType.SRC;
  }
}
