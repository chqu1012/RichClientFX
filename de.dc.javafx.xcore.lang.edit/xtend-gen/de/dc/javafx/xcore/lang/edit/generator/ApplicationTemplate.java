package de.dc.javafx.xcore.lang.edit.generator;

import de.dc.javafx.xcore.lang.edit.emfSupportDsl.Ecore;
import de.dc.javafx.xcore.lang.edit.generator.ICustomerGenerator;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class ApplicationTemplate implements ICustomerGenerator<Ecore> {
  @Override
  public String code(final Ecore ecore) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    String _replace = ecore.getPackagePath().replace("\'", "");
    _builder.append(_replace);
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("import de.dc.javafx.efxclipse.runtime.EMFModelView;");
    _builder.newLine();
    _builder.append("import de.dc.javafx.efxclipse.runtime.model.IEmfManager;");
    _builder.newLine();
    _builder.append("import java.io.File;");
    _builder.newLine();
    _builder.append("import ");
    String _qualifiedName = ecore.getRootType().getQualifiedName();
    _builder.append(_qualifiedName);
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("public class ");
    String _name = ecore.getName();
    _builder.append(_name);
    _builder.append("ViewApplication extends Base");
    String _name_1 = ecore.getName();
    _builder.append(_name_1);
    _builder.append("ViewApplication{");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public EMFModelView<");
    String _simpleName = ecore.getRootType().getSimpleName();
    _builder.append(_simpleName, "\t");
    _builder.append("> getView(IEmfManager<");
    String _simpleName_1 = ecore.getRootType().getSimpleName();
    _builder.append(_simpleName_1, "\t");
    _builder.append("> manager) {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("return new ");
    String _name_2 = ecore.getName();
    _builder.append(_name_2, "\t\t");
    _builder.append("ModelView(manager);");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public static void main(String[] args) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("// TODO: Should be implement dynamically!");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("new File(\"./workspace\").mkdirs();");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("launch(args);");
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
    String _name = ecore.getName();
    _builder.append(_name);
    _builder.append("ViewApplication.java");
    return _builder.toString();
  }
}
