package de.dc.emf.javafx.xtext.generator;

import de.dc.emf.javafx.model.javafx.AttributeFX;
import de.dc.emf.javafx.model.javafx.ModelFX;
import de.dc.emf.javafx.model.javafx.TableColumnFX;
import de.dc.emf.javafx.model.javafx.TableViewFX;
import de.dc.emf.javafx.model.javafx.util.JavafxSwitch;
import de.dc.emf.javafx.xtext.generator.FilePathSwitch;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.Functions.Function2;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;

@SuppressWarnings("all")
public class TableColumnSwitch extends JavafxSwitch<String> {
  @Override
  public String caseModelFX(final ModelFX object) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    String _replace = FilePathSwitch.getPackage(object).toString().replace("/", ".");
    _builder.append(_replace);
    _builder.append(".controls.cell;");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("public enum ");
    String _firstUpper = StringExtensions.toFirstUpper(object.getName());
    _builder.append(_firstUpper);
    _builder.append("Type {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    final Function1<AttributeFX, String> _function = (AttributeFX it) -> {
      return StringExtensions.toFirstUpper(it.getName());
    };
    final Function2<String, String, String> _function_1 = (String p1, String p2) -> {
      return ((p1 + ", ") + p2);
    };
    String _reduce = IterableExtensions.<String>reduce(ListExtensions.<AttributeFX, String>map(object.getAttributes(), _function), _function_1);
    _builder.append(_reduce, "\t");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }
  
  @Override
  public CharSequence caseTableViewFX(final TableViewFX object) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    String _replace = FilePathSwitch.getPackage(object).toString().replace("/", ".");
    _builder.append(_replace);
    _builder.append(".controls.cell;");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("import ");
    String _replace_1 = FilePathSwitch.getPackage(object).toString().replace("/", ".");
    _builder.append(_replace_1);
    _builder.append(".model.*;");
    _builder.newLineIfNotEmpty();
    _builder.append("import javafx.beans.property.SimpleStringProperty;");
    _builder.newLine();
    _builder.append("import javafx.beans.value.ObservableValue;");
    _builder.newLine();
    _builder.append("import javafx.scene.control.TableColumn;");
    _builder.newLine();
    _builder.append("import javafx.scene.control.TableColumn.CellDataFeatures;");
    _builder.newLine();
    _builder.append("import javafx.util.Callback;");
    _builder.newLine();
    _builder.newLine();
    StringConcatenation _builder_1 = new StringConcatenation();
    {
      ModelFX _usedModel = object.getUsedModel();
      boolean _tripleEquals = (_usedModel == null);
      if (_tripleEquals) {
        _builder_1.append("Object");
      } else {
        String _firstUpper = StringExtensions.toFirstUpper(object.getUsedModel().getName());
        _builder_1.append(_firstUpper);
      }
    }
    final String model = _builder_1.toString();
    _builder.newLineIfNotEmpty();
    _builder.append("public class Base");
    _builder.append(model);
    _builder.append("CellFeatures implements Callback<TableColumn.CellDataFeatures<");
    _builder.append(model);
    _builder.append(",");
    _builder.append(model);
    _builder.append(">, ObservableValue<");
    _builder.append(model);
    _builder.append(">>{");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("private ");
    _builder.append(model, "\t");
    _builder.append("Type type;");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public Base");
    _builder.append(model, "\t");
    _builder.append("CellFeatures(");
    _builder.append(model, "\t");
    _builder.append("Type type) {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("this.type = type;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}\t\t");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public ObservableValue call(CellDataFeatures<");
    _builder.append(model, "\t");
    _builder.append(", ");
    _builder.append(model, "\t");
    _builder.append("> param) {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("return new SimpleStringProperty(getText(param.getValue()));");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("private String getText(");
    _builder.append(model, "\t");
    _builder.append(" item) {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("switch (type) {");
    _builder.newLine();
    {
      EList<TableColumnFX> _columns = object.getColumns();
      for(final TableColumnFX col : _columns) {
        _builder.append("\t\t");
        final String fieldName = StringExtensions.toFirstUpper(col.getUsedAttribute().getName());
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t");
        _builder.append("case ");
        _builder.append(fieldName, "\t\t");
        _builder.append(":");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t");
        _builder.append("\t");
        _builder.append("return get");
        _builder.append(fieldName, "\t\t\t");
        _builder.append("(item);");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t\t");
    _builder.append("default:");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("return \"\";");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    {
      EList<TableColumnFX> _columns_1 = object.getColumns();
      for(final TableColumnFX col_1 : _columns_1) {
        _builder.append("\t");
        final String fieldName_1 = StringExtensions.toFirstUpper(col_1.getUsedAttribute().getName());
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("protected String get");
        _builder.append(fieldName_1, "\t");
        _builder.append("(");
        _builder.append(model, "\t");
        _builder.append(" item) {");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("return String.valueOf(item.get");
        _builder.append(fieldName_1, "\t\t");
        _builder.append("());");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("}");
        _builder.newLine();
      }
    }
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
}
