package de.dc.javafx.xcore.lang.edit.generator;

import de.dc.javafx.xcore.lang.edit.emfSupportDsl.Ecore;
import de.dc.javafx.xcore.lang.edit.emfSupportDsl.SupportedControl;
import de.dc.javafx.xcore.lang.edit.generator.ICustomerGenerator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class SupportedControlViewTemplate implements ICustomerGenerator<SupportedControl> {
  @Override
  public String code(final SupportedControl control) {
    StringConcatenation _builder = new StringConcatenation();
    EObject _eContainer = control.eContainer();
    final Ecore ecore = ((Ecore) _eContainer);
    _builder.newLineIfNotEmpty();
    final String packagePath = ecore.getPackagePath().replace("\'", "");
    _builder.newLineIfNotEmpty();
    _builder.append("package ");
    _builder.append(packagePath);
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("import de.dc.javafx.efxclipse.runtime.EmfTreeView;");
    _builder.newLine();
    _builder.append("import de.dc.javafx.efxclipse.runtime.model.IEmfManager;");
    _builder.newLine();
    _builder.append("import ");
    String _qualifiedName = ecore.getModelPackage().getQualifiedName();
    _builder.append(_qualifiedName);
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append("import ");
    String _qualifiedName_1 = ecore.getRootType().getQualifiedName();
    _builder.append(_qualifiedName_1);
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    final String rootName = ecore.getRootType().getSimpleName();
    _builder.newLineIfNotEmpty();
    _builder.append("public class ");
    String _name = control.getName();
    _builder.append(_name);
    _builder.append("TreeView extends EmfTreeView<");
    _builder.append(rootName);
    _builder.append("> {");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public ");
    String _name_1 = control.getName();
    _builder.append(_name_1, "\t");
    _builder.append("TreeView(IEmfManager<");
    _builder.append(rootName, "\t");
    _builder.append("> manager) {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("super(manager);");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("// addEditableFor(ModelPackage.eINSTANCE.getPage_Name());");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }
  
  @Override
  public String path(final SupportedControl control) {
    StringConcatenation _builder = new StringConcatenation();
    EObject _eContainer = control.eContainer();
    String _replace = ((Ecore) _eContainer).getPackagePath().replace("\'", "").replace(".", "/");
    _builder.append(_replace);
    _builder.append("/");
    String _name = control.getName();
    _builder.append(_name);
    _builder.append("TreeView.java");
    return _builder.toString();
  }
}
