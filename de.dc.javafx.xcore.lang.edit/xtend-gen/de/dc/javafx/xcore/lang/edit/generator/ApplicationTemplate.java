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
    _builder.append(".demo;");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("import java.io.File;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import ");
    String _replace_1 = ecore.getPackagePath().replace("\'", "");
    _builder.append(_replace_1);
    _builder.append(".*;");
    _builder.newLineIfNotEmpty();
    _builder.append("import ");
    String _replace_2 = ecore.getPackagePath().replace("\'", "");
    _builder.append(_replace_2);
    _builder.append(".view.*;");
    _builder.newLineIfNotEmpty();
    _builder.append("import de.dc.javafx.xcore.di.ApplicationContext;");
    _builder.newLine();
    _builder.append("import de.dc.javafx.xcore.lang.lib.AbstractApplication;");
    _builder.newLine();
    _builder.append("import javafx.scene.Parent;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public class ");
    String _name = ecore.getName();
    _builder.append(_name);
    _builder.append("ViewApplication extends AbstractApplication{");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public Parent getRoot() {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("Base");
    String _name_1 = ecore.getName();
    _builder.append(_name_1, "\t\t");
    _builder.append("Manager manager = new Base");
    String _name_2 = ecore.getName();
    _builder.append(_name_2, "\t\t");
    _builder.append("Manager();");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("return new ");
    String _name_3 = ecore.getName();
    _builder.append(_name_3, "\t\t");
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
    _builder.append("ApplicationContext.init();");
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
    _builder.append("/demo/");
    String _name = ecore.getName();
    _builder.append(_name);
    _builder.append("ViewApplication.java");
    return _builder.toString();
  }
}
