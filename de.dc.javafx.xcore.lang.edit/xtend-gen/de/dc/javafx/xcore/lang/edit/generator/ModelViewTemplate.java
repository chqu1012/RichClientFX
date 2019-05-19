package de.dc.javafx.xcore.lang.edit.generator;

import de.dc.javafx.xcore.lang.edit.emfSupportDsl.Ecore;
import de.dc.javafx.xcore.lang.edit.generator.ICustomerGenerator;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class ModelViewTemplate implements ICustomerGenerator<Ecore> {
  @Override
  public String code(final Ecore ecore) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    String _replace = ecore.getPackagePath().replace("\'", "");
    _builder.append(_replace);
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("import de.dc.javafx.efxclipse.runtime.model.IEmfManager;");
    _builder.newLine();
    _builder.append("import ");
    String _qualifiedName = ecore.getRootType().getQualifiedName();
    _builder.append(_qualifiedName);
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("public class ");
    String _simpleName = ecore.getRootType().getSimpleName();
    _builder.append(_simpleName);
    _builder.append("ModelView extends Base");
    String _name = ecore.getName();
    _builder.append(_name);
    _builder.append("View {");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public  ");
    String _simpleName_1 = ecore.getRootType().getSimpleName();
    _builder.append(_simpleName_1, "\t");
    _builder.append("ModelView(IEmfManager<");
    String _simpleName_2 = ecore.getRootType().getSimpleName();
    _builder.append(_simpleName_2, "\t");
    _builder.append("> manager) {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("super(manager);");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }
  
  @Override
  public String path(final Ecore ecore) {
    StringConcatenation _builder = new StringConcatenation();
    String _replace = ecore.getPackagePath().replace(".", "/").replace("\'", "");
    _builder.append(_replace);
    _builder.append("/");
    String _simpleName = ecore.getRootType().getSimpleName();
    _builder.append(_simpleName);
    _builder.append("ModelView.java");
    return _builder.toString();
  }
}
