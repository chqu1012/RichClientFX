package de.dc.javafx.xcore.workbench.ide.model.template;

import de.dc.javafx.xcore.workbench.ide.model.IdeContainer;
import de.dc.javafx.xcore.workbench.ide.model.template.IGenerator;
import de.dc.javafx.xcore.workbench.ide.model.template.SourceType;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class FactoryTemplate implements IGenerator<IdeContainer> {
  @Override
  public String gen(final IdeContainer t) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    String _packagePath = t.getPackagePath();
    _builder.append(_packagePath);
    _builder.append(".factory;");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("import ");
    String _canonicalName = t.getModelItemProviderAdapterFactor().getClass().getCanonicalName();
    _builder.append(_canonicalName);
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append("import ");
    String _packagePath_1 = t.getPackagePath();
    _builder.append(_packagePath_1);
    _builder.append(".factory.Extended");
    String _modelName = t.getModelName();
    _builder.append(_modelName);
    _builder.append("Factory;");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("public interface Extended");
    String _modelName_1 = t.getModelName();
    _builder.append(_modelName_1);
    _builder.append("Factory extends ");
    String _modelName_2 = t.getModelName();
    _builder.append(_modelName_2);
    _builder.append("Factory, ExtendedFactory {");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("Extended");
    String _modelName_3 = t.getModelName();
    _builder.append(_modelName_3, "\t");
    _builder.append("Factory eINSTANCE = Extended");
    String _modelName_4 = t.getModelName();
    _builder.append(_modelName_4, "\t");
    _builder.append("FactoryImpl.init();");
    _builder.newLineIfNotEmpty();
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
    _builder.append("Factory");
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
