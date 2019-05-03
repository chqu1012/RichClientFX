package de.dc.javafx.xcore.lang.ide.templates;

import de.dc.javafx.xcore.lang.ide.wizards.model.TableModel;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class TableViewTemplate {
  public static String getTemplate(final TableModel model) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("packagePath \"");
    String _packagePath = model.getPackagePath();
    _builder.append(_packagePath);
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("controls{ ");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("TableViewFX { ");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("name: ");
    String _name = model.getName();
    _builder.append(_name, "\t\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("// usedModel: Contact");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("// column(name: Firstname usedAttribute:\"Contact.firstname\" useFilter)");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("showPropertyView: ");
    boolean _isShowPropertyView = model.isShowPropertyView();
    _builder.append(_isShowPropertyView, "\t\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("showToolbar: ");
    boolean _isShowToolbar = model.isShowToolbar();
    _builder.append(_isShowToolbar, "\t\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("generateDemo: ");
    boolean _isGenerateDemo = model.isGenerateDemo();
    _builder.append(_isGenerateDemo, "\t\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("} ");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }
}
