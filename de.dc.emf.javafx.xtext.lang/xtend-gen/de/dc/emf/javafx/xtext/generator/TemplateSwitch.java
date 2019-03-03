package de.dc.emf.javafx.xtext.generator;

import com.google.common.base.Objects;
import de.dc.emf.javafx.model.javafx.AttributeFX;
import de.dc.emf.javafx.model.javafx.Bean;
import de.dc.emf.javafx.model.javafx.Binding;
import de.dc.emf.javafx.model.javafx.BindingProperty;
import de.dc.emf.javafx.model.javafx.BindingType;
import de.dc.emf.javafx.model.javafx.DerivedBean;
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
  public String caseDerivedBean(final DerivedBean object) {
    StringConcatenation _builder = new StringConcatenation();
    EObject _rootContainer = EcoreUtil.getRootContainer(object.eContainer());
    final String packagePath = ((ProjectFX) _rootContainer).getPackagePath();
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("package ");
    _builder.append(packagePath, "\t");
    _builder.append(".model;");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public abstract class Base");
    String _firstUpper = StringExtensions.toFirstUpper(object.getName());
    _builder.append(_firstUpper, "\t");
    _builder.append("<T>{");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    {
      EList<AttributeFX> _attributes = object.getAttributes();
      for(final AttributeFX field : _attributes) {
        _builder.append("\t\t");
        _builder.append("private ");
        String _type = field.getType();
        _builder.append(_type, "\t\t");
        _builder.append(" ");
        String _firstLower = StringExtensions.toFirstLower(field.getName());
        _builder.append(_firstLower, "\t\t");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("public Base");
    String _firstUpper_1 = StringExtensions.toFirstUpper(object.getName());
    _builder.append(_firstUpper_1, "\t\t");
    _builder.append("(){");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("public Base");
    String _firstUpper_2 = StringExtensions.toFirstUpper(object.getName());
    _builder.append(_firstUpper_2, "\t\t");
    _builder.append("(T t) {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    _builder.append("map(t);");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
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
    _builder.append("\t\t");
    _builder.append("public Base");
    String _firstUpper_3 = StringExtensions.toFirstUpper(object.getName());
    _builder.append(_firstUpper_3, "\t\t");
    _builder.append("(");
    _builder.append(parameters, "\t\t");
    _builder.append("){");
    _builder.newLineIfNotEmpty();
    {
      EList<AttributeFX> _attributes_1 = object.getAttributes();
      for(final AttributeFX field_1 : _attributes_1) {
        _builder.append("\t\t\t");
        _builder.append("this.");
        String _firstLower_1 = StringExtensions.toFirstLower(field_1.getName());
        _builder.append(_firstLower_1, "\t\t\t");
        _builder.append("=");
        String _firstLower_2 = StringExtensions.toFirstLower(field_1.getName());
        _builder.append(_firstLower_2, "\t\t\t");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("protected abstract void map(T t);");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    {
      EList<AttributeFX> _attributes_2 = object.getAttributes();
      for(final AttributeFX field_2 : _attributes_2) {
        _builder.append("\t\t");
        _builder.append("public ");
        String _type_1 = field_2.getType();
        _builder.append(_type_1, "\t\t");
        _builder.append(" get");
        String _firstUpper_4 = StringExtensions.toFirstUpper(field_2.getName());
        _builder.append(_firstUpper_4, "\t\t");
        _builder.append("(){");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t");
        _builder.append("\t");
        _builder.append("return ");
        String _firstLower_3 = StringExtensions.toFirstLower(field_2.getName());
        _builder.append(_firstLower_3, "\t\t\t");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t");
        _builder.append("}");
        _builder.newLine();
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("public void set");
        String _firstUpper_5 = StringExtensions.toFirstUpper(field_2.getName());
        _builder.append(_firstUpper_5, "\t\t");
        _builder.append("(");
        String _type_2 = field_2.getType();
        _builder.append(_type_2, "\t\t");
        _builder.append(" ");
        String _firstLower_4 = StringExtensions.toFirstLower(field_2.getName());
        _builder.append(_firstLower_4, "\t\t");
        _builder.append(") {");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t");
        _builder.append("\t");
        _builder.append("this.");
        String _firstLower_5 = StringExtensions.toFirstLower(field_2.getName());
        _builder.append(_firstLower_5, "\t\t\t");
        _builder.append(" = ");
        String _firstLower_6 = StringExtensions.toFirstLower(field_2.getName());
        _builder.append(_firstLower_6, "\t\t\t");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t");
        _builder.append("}");
        _builder.newLine();
      }
    }
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }
  
  @Override
  public String caseBean(final Bean object) {
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
  public String caseBinding(final Binding object) {
    StringConcatenation _builder = new StringConcatenation();
    EObject _rootContainer = EcoreUtil.getRootContainer(object);
    final String packagePath = ((ProjectFX) _rootContainer).getPackagePath();
    _builder.newLineIfNotEmpty();
    _builder.append("package ");
    _builder.append(packagePath);
    _builder.append(".binding;");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("import javafx.beans.property.*;");
    _builder.newLine();
    _builder.append("import javafx.collections.*;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public class ");
    String _firstUpper = StringExtensions.toFirstUpper(object.getName());
    _builder.append(_firstUpper);
    _builder.append("{");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    {
      EList<BindingProperty> _property = object.getProperty();
      for(final BindingProperty property : _property) {
        {
          BindingType _type = property.getType();
          boolean _equals = Objects.equal(_type, BindingType.OBSERVABLE_LIST);
          if (_equals) {
            _builder.append("\t");
            _builder.append("private ObservableList ");
            String _firstLower = StringExtensions.toFirstLower(property.getName());
            _builder.append(_firstLower, "\t");
            _builder.append(" = FXCollections.observableArrayList();");
            _builder.newLineIfNotEmpty();
          } else {
            _builder.append("\t");
            _builder.append("private ");
            BindingType _type_1 = property.getType();
            _builder.append(_type_1, "\t");
            _builder.append(" ");
            String _firstLower_1 = StringExtensions.toFirstLower(property.getName());
            _builder.append(_firstLower_1, "\t");
            _builder.append(" = new Simple");
            BindingType _type_2 = property.getType();
            _builder.append(_type_2, "\t");
            _builder.append("();\t");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    _builder.append("\t");
    _builder.newLine();
    {
      EList<BindingProperty> _property_1 = object.getProperty();
      for(final BindingProperty property_1 : _property_1) {
        _builder.append("\t");
        _builder.append("public void set");
        String _firstUpper_1 = StringExtensions.toFirstUpper(property_1.getName());
        _builder.append(_firstUpper_1, "\t");
        _builder.append("(");
        String _replace = property_1.getType().toString().replace("Property", "");
        _builder.append(_replace, "\t");
        _builder.append(" ");
        String _replace_1 = StringExtensions.toFirstLower(property_1.getName()).replace("Property", "");
        _builder.append(_replace_1, "\t");
        _builder.append(") {");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        String _firstLower_2 = StringExtensions.toFirstLower(property_1.getName());
        _builder.append(_firstLower_2, "\t\t");
        _builder.append(".set(");
        String _replace_2 = StringExtensions.toFirstLower(property_1.getName()).replace("Property", "");
        _builder.append(_replace_2, "\t\t");
        _builder.append(");");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("}");
        _builder.newLine();
        _builder.append("\t");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("public ");
        String _replace_3 = property_1.getType().toString().replace("Property", "");
        _builder.append(_replace_3, "\t");
        _builder.append(" get");
        String _firstUpper_2 = StringExtensions.toFirstUpper(property_1.getName());
        _builder.append(_firstUpper_2, "\t");
        _builder.append("() {");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("return ");
        String _firstLower_3 = StringExtensions.toFirstLower(property_1.getName());
        _builder.append(_firstLower_3, "\t\t");
        _builder.append(".get();");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("}");
        _builder.newLine();
        _builder.append("\t");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("public ");
        BindingType _type_3 = property_1.getType();
        _builder.append(_type_3, "\t");
        _builder.append(" get");
        String _replace_4 = StringExtensions.toFirstUpper(property_1.getName()).replace("Property", "");
        _builder.append(_replace_4, "\t");
        _builder.append("() {");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("return ");
        String _firstLower_4 = StringExtensions.toFirstLower(property_1.getName());
        _builder.append(_firstLower_4, "\t\t");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("}");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("public void set");
        String _replace_5 = StringExtensions.toFirstUpper(property_1.getName()).replace("Property", "");
        _builder.append(_replace_5, "\t");
        _builder.append("(");
        String _replace_6 = property_1.getType().toString().replace("Property", "");
        _builder.append(_replace_6, "\t");
        _builder.append(" ");
        String _replace_7 = StringExtensions.toFirstLower(property_1.getName()).replace("Property", "");
        _builder.append(_replace_7, "\t");
        _builder.append(") {");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("this.");
        String _firstLower_5 = StringExtensions.toFirstLower(property_1.getName());
        _builder.append(_firstLower_5, "\t\t");
        _builder.append(".set(");
        String _replace_8 = StringExtensions.toFirstLower(property_1.getName()).replace("Property", "");
        _builder.append(_replace_8, "\t\t");
        _builder.append(");");
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
}
