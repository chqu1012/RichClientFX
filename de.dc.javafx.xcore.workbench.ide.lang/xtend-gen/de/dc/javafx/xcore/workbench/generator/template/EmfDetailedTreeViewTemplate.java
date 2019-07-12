package de.dc.javafx.xcore.workbench.generator.template;

import de.dc.javafx.xcore.workbench.generator.template.IIdeGenerator;
import de.dc.javafx.xcore.workbench.ide.IdeContainer;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class EmfDetailedTreeViewTemplate implements IIdeGenerator<IdeContainer> {
  @Override
  public String gen(final IdeContainer t) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    String _packagePath = t.getPackagePath();
    _builder.append(_packagePath);
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    final String model = t.getIdeRootModel().getSimpleName();
    _builder.newLineIfNotEmpty();
    _builder.append("import de.dc.javafx.xcore.workbench.emf.ui.*;");
    _builder.newLine();
    _builder.append("import ");
    String _qualifiedName = t.getIdeRootModel().getQualifiedName();
    _builder.append(_qualifiedName);
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("public class ");
    String _name = t.getName();
    _builder.append(_name);
    _builder.append("EmfDetailedTreeView extends EmfDetailedTreeView<");
    _builder.append(model);
    _builder.append(">{");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("protected EmfTreeModelView<");
    _builder.append(model, "\t");
    _builder.append("> initEmfModelTreeView() {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("return new ");
    String _name_1 = t.getName();
    _builder.append(_name_1, "\t\t");
    _builder.append("EmfTreeModelView();");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }
}
