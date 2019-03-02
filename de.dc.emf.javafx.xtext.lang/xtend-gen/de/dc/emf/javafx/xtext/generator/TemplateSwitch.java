package de.dc.emf.javafx.xtext.generator;

import de.dc.emf.javafx.model.javafx.AttributeFX;
import de.dc.emf.javafx.model.javafx.ModelFX;
import de.dc.emf.javafx.model.javafx.ProjectFX;
import de.dc.emf.javafx.model.javafx.TableColumnFX;
import de.dc.emf.javafx.model.javafx.TableViewFX;
import de.dc.emf.javafx.model.javafx.util.JavafxSwitch;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.Functions.Function2;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;

@SuppressWarnings("all")
public class TemplateSwitch extends JavafxSwitch<String> {
  @Override
  public String caseModelFX(final ModelFX object) {
    StringConcatenation _builder = new StringConcatenation();
    EObject _rootContainer = EcoreUtil.getRootContainer(object.eContainer());
    final String packagePath = ((ProjectFX) _rootContainer).getPackagePath();
    _builder.newLineIfNotEmpty();
    _builder.append("package ");
    _builder.append(packagePath);
    _builder.append(".model;");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("public class ");
    String _firstUpper = StringExtensions.toFirstUpper(object.getName());
    _builder.append(_firstUpper);
    _builder.append("{");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    {
      EList<AttributeFX> _attributes = object.getAttributes();
      for(final AttributeFX field : _attributes) {
        _builder.append("\t");
        _builder.append("private ");
        String _type = field.getType();
        _builder.append(_type, "\t");
        _builder.append(" ");
        String _firstLower = StringExtensions.toFirstLower(field.getName());
        _builder.append(_firstLower, "\t");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public ");
    String _firstUpper_1 = StringExtensions.toFirstUpper(object.getName());
    _builder.append(_firstUpper_1, "\t");
    _builder.append("(){");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    final Function1<AttributeFX, String> _function = (AttributeFX it) -> {
      String _type_1 = it.getType();
      String _plus = (_type_1 + " ");
      String _firstLower_1 = StringExtensions.toFirstLower(it.getName());
      return (_plus + _firstLower_1);
    };
    final Function2<String, String, String> _function_1 = (String p1, String p2) -> {
      return ((p1 + ", ") + p2);
    };
    final String parameters = IterableExtensions.<String>reduce(ListExtensions.<AttributeFX, String>map(object.getAttributes(), _function), _function_1);
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("public ");
    String _firstUpper_2 = StringExtensions.toFirstUpper(object.getName());
    _builder.append(_firstUpper_2, "\t");
    _builder.append("(");
    _builder.append(parameters, "\t");
    _builder.append("){");
    _builder.newLineIfNotEmpty();
    {
      EList<AttributeFX> _attributes_1 = object.getAttributes();
      for(final AttributeFX field_1 : _attributes_1) {
        _builder.append("\t\t");
        _builder.append("this.");
        String _firstLower_1 = StringExtensions.toFirstLower(field_1.getName());
        _builder.append(_firstLower_1, "\t\t");
        _builder.append("=");
        String _firstLower_2 = StringExtensions.toFirstLower(field_1.getName());
        _builder.append(_firstLower_2, "\t\t");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    {
      EList<AttributeFX> _attributes_2 = object.getAttributes();
      for(final AttributeFX field_2 : _attributes_2) {
        _builder.append("\t");
        _builder.append("public ");
        String _type_1 = field_2.getType();
        _builder.append(_type_1, "\t");
        _builder.append(" get");
        String _firstUpper_3 = StringExtensions.toFirstUpper(field_2.getName());
        _builder.append(_firstUpper_3, "\t");
        _builder.append("(){");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("return ");
        String _firstLower_3 = StringExtensions.toFirstLower(field_2.getName());
        _builder.append(_firstLower_3, "\t\t");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("}");
        _builder.newLine();
        _builder.newLine();
        _builder.append("\t");
        _builder.append("public void set");
        String _firstUpper_4 = StringExtensions.toFirstUpper(field_2.getName());
        _builder.append(_firstUpper_4, "\t");
        _builder.append("(");
        String _type_2 = field_2.getType();
        _builder.append(_type_2, "\t");
        _builder.append(" ");
        String _firstLower_4 = StringExtensions.toFirstLower(field_2.getName());
        _builder.append(_firstLower_4, "\t");
        _builder.append(") {");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("this.");
        String _firstLower_5 = StringExtensions.toFirstLower(field_2.getName());
        _builder.append(_firstLower_5, "\t\t");
        _builder.append(" = ");
        String _firstLower_6 = StringExtensions.toFirstLower(field_2.getName());
        _builder.append(_firstLower_6, "\t\t");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("}");
        _builder.newLine();
      }
    }
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }
  
  @Override
  public String caseTableViewFX(final TableViewFX object) {
    StringConcatenation _builder = new StringConcatenation();
    EObject _rootContainer = EcoreUtil.getRootContainer(object.eContainer());
    final String packagePath = ((ProjectFX) _rootContainer).getPackagePath();
    _builder.newLineIfNotEmpty();
    _builder.append("package ");
    _builder.append(packagePath);
    _builder.append(".controls;");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("import ");
    _builder.append(packagePath);
    _builder.append(".controls.cell.*;");
    _builder.newLineIfNotEmpty();
    _builder.append("import ");
    _builder.append(packagePath);
    _builder.append(".model.*;");
    _builder.newLineIfNotEmpty();
    _builder.append("import javafx.scene.control.*;");
    _builder.newLine();
    _builder.append("import javafx.beans.value.ObservableValue;");
    _builder.newLine();
    _builder.append("import javafx.util.Callback;");
    _builder.newLine();
    _builder.newLine();
    StringConcatenation _builder_1 = new StringConcatenation();
    {
      ModelFX _usedModel = object.getUsedModel();
      boolean _tripleNotEquals = (_usedModel != null);
      if (_tripleNotEquals) {
        String _name = object.getUsedModel().getName();
        _builder_1.append(_name);
      } else {
        _builder_1.append("Object");
      }
    }
    final String model = _builder_1.toString();
    _builder.newLineIfNotEmpty();
    final String modelName = StringExtensions.toFirstUpper(object.getUsedModel().getName());
    _builder.newLineIfNotEmpty();
    _builder.append("public abstract class Base");
    String _firstUpper = StringExtensions.toFirstUpper(object.getName());
    _builder.append(_firstUpper);
    _builder.append(" extends TableView<");
    _builder.append(model);
    _builder.append(">{");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    {
      EList<TableColumnFX> _columns = object.getColumns();
      for(final TableColumnFX column : _columns) {
        _builder.append("\t");
        _builder.append("protected TableColumn<");
        _builder.append(model, "\t");
        _builder.append(", ");
        _builder.append(model, "\t");
        _builder.append("> ");
        String _firstLower = StringExtensions.toFirstLower(column.getName());
        _builder.append(_firstLower, "\t");
        _builder.append("Column;");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public Base");
    String _firstUpper_1 = StringExtensions.toFirstUpper(object.getName());
    _builder.append(_firstUpper_1, "\t");
    _builder.append("() {");
    _builder.newLineIfNotEmpty();
    {
      EList<TableColumnFX> _columns_1 = object.getColumns();
      for(final TableColumnFX column_1 : _columns_1) {
        _builder.append("\t\t");
        String _firstLower_1 = StringExtensions.toFirstLower(column_1.getName());
        _builder.append(_firstLower_1, "\t\t");
        _builder.append("Column = createColumn(\"");
        String _firstUpper_2 = StringExtensions.toFirstUpper(column_1.getName());
        _builder.append(_firstUpper_2, "\t\t");
        _builder.append("\", ");
        int _width = column_1.getWidth();
        _builder.append(_width, "\t\t");
        _builder.append(",  new Base");
        _builder.append(modelName, "\t\t");
        _builder.append("CellFeatures(");
        _builder.append(modelName, "\t\t");
        _builder.append("Type.");
        String _firstUpper_3 = StringExtensions.toFirstUpper(column_1.getUsedAttribute().getName());
        _builder.append(_firstUpper_3, "\t\t");
        _builder.append("));");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("protected TableColumn<");
    _builder.append(model, "\t");
    _builder.append(",");
    _builder.append(model, "\t");
    _builder.append("> createColumn(String name, double width, Callback<TableColumn.CellDataFeatures<");
    _builder.append(model, "\t");
    _builder.append(",");
    _builder.append(model, "\t");
    _builder.append(">, ObservableValue<");
    _builder.append(model, "\t");
    _builder.append(">> cellFeatures) {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("TableColumn<");
    _builder.append(model, "\t\t");
    _builder.append(", ");
    _builder.append(model, "\t\t");
    _builder.append("> column = new TableColumn<");
    _builder.append(model, "\t\t");
    _builder.append(", ");
    _builder.append(model, "\t\t");
    _builder.append(">(name);");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("column.setPrefWidth(width);");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("column.setCellValueFactory(cellFeatures);");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("getColumns().add(column);");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("return column;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }
  
  @Override
  public String caseTableColumnFX(final TableColumnFX object) {
    StringConcatenation _builder = new StringConcatenation();
    EObject _rootContainer = EcoreUtil.getRootContainer(object.eContainer());
    final String packagePath = ((ProjectFX) _rootContainer).getPackagePath();
    _builder.newLineIfNotEmpty();
    EObject _eContainer = object.eContainer();
    final TableViewFX table = ((TableViewFX) _eContainer);
    _builder.newLineIfNotEmpty();
    final ModelFX model = table.getUsedModel();
    _builder.newLineIfNotEmpty();
    _builder.append("package ");
    _builder.append(packagePath);
    _builder.append(".controls.cell;");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("import ");
    _builder.append(packagePath);
    _builder.append(".model.*;");
    _builder.newLineIfNotEmpty();
    _builder.append("import javafx.scene.control.*;");
    _builder.newLine();
    _builder.newLine();
    StringConcatenation _builder_1 = new StringConcatenation();
    {
      boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(model.getName());
      if (_isNullOrEmpty) {
        _builder_1.append("Object");
      } else {
        String _firstUpper = StringExtensions.toFirstUpper(model.getName());
        _builder_1.append(_firstUpper);
      }
    }
    final String name = _builder_1.toString();
    _builder.newLineIfNotEmpty();
    _builder.append("public class Base");
    String _firstUpper_1 = StringExtensions.toFirstUpper(model.getName());
    _builder.append(_firstUpper_1);
    String _firstUpper_2 = StringExtensions.toFirstUpper(object.getUsedAttribute().getName());
    _builder.append(_firstUpper_2);
    _builder.append("CellFeatures extends TableCell<");
    _builder.append(name);
    _builder.append(", ");
    _builder.append(name);
    _builder.append("> {");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("protected void updateItem(");
    _builder.append(name, "\t");
    _builder.append(" item, boolean empty) {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("super.updateItem(item, empty);");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("if (item==null && empty) {");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("setText(null);");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}else {");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("setText(String.valueOf(item.get");
    String _firstUpper_3 = StringExtensions.toFirstUpper(object.getName());
    _builder.append(_firstUpper_3, "\t\t\t");
    _builder.append("()));");
    _builder.newLineIfNotEmpty();
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
}
