package de.dc.javafx.xcore.workbench.ui.dialog.template;

import de.dc.javafx.xcore.workbench.ui.dialog.model.IdeModel;
import java.util.List;
import org.eclipse.jdt.core.IMethod;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class IdeFileContentTemplate {
  public static String getContent(final IdeModel model) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    String _packagePath = model.getPackagePath();
    _builder.append(_packagePath);
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("class ");
    String _name = model.getName();
    _builder.append(_name);
    _builder.append("{");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("IdeFactory: ");
    String _eFactory = model.geteFactory();
    _builder.append(_eFactory, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("IdePackage: ");
    String _ePackage = model.getePackage();
    _builder.append(_ePackage, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("IdeItemProviderAdapterFactory: ");
    String _itemProviderAdapterFactory = model.getItemProviderAdapterFactory();
    _builder.append(_itemProviderAdapterFactory, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("IdeRootModel: ");
    String _rootModel = model.getRootModel();
    _builder.append(_rootModel, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("IdeModelSwitch: ");
    String _modelSwitch = model.getModelSwitch();
    _builder.append(_modelSwitch, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("Editable{");
    _builder.newLine();
    {
      List<IMethod> _editableAttributes = model.getEditableAttributes();
      for(final IMethod n : _editableAttributes) {
        _builder.append("\t\t");
        _builder.append("IdePackage->");
        _builder.append(n, "\t\t");
        _builder.append("()");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("generateDemo");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }
}
