package de.dc.javafx.xcore.workbench.ide.model.template;

import de.dc.javafx.xcore.workbench.ide.model.IdeContainer;
import de.dc.javafx.xcore.workbench.ide.model.template.IGenerator;
import de.dc.javafx.xcore.workbench.ide.model.template.SourceType;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class PreviewTemplate implements IGenerator<IdeContainer> {
  @Override
  public String gen(final IdeContainer project) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    String _packagePath = project.getPackagePath();
    _builder.append(_packagePath);
    _builder.append(".view;");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("import org.eclipse.emf.ecore.*;");
    _builder.newLine();
    _builder.append("import org.eclipse.emf.ecore.util.*;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import com.google.common.eventbus.Subscribe;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import de.dc.javafx.xcore.code.preview.ui.FXPreview;");
    _builder.newLine();
    _builder.append("import ");
    String _packagePath_1 = project.getPackagePath();
    _builder.append(_packagePath_1);
    _builder.append(".renderer.*;");
    _builder.newLineIfNotEmpty();
    _builder.append("import de.dc.javafx.xcore.workbench.di.DIPlatform;");
    _builder.newLine();
    _builder.append("import de.dc.javafx.xcore.workbench.event.*;");
    _builder.newLine();
    _builder.append("import javafx.beans.value.ObservableValue;");
    _builder.newLine();
    _builder.append("import javafx.scene.control.TreeItem;");
    _builder.newLine();
    final String modelName = project.getModelName();
    _builder.newLineIfNotEmpty();
    _builder.append("public class ");
    _builder.append(modelName);
    _builder.append("Preview extends FXPreview{");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("private ");
    _builder.append(modelName, "\t");
    _builder.append("Renderer renderer = new ");
    _builder.append(modelName, "\t");
    _builder.append("Renderer();");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public static final String TOPIC_UPDATE = \"");
    _builder.append(modelName, "\t");
    _builder.append(".update.preview\";");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public ");
    _builder.append(modelName, "\t");
    _builder.append("Preview() {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("DIPlatform.getInstance(IEventBroker.class).register(this);");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("@Subscribe");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public void updateChart(EventContext<Object> context) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("if (context.getEventId()!=null && context.getEventId().equals(TOPIC_UPDATE)) {");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("Object input = context.getInput();");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("setCenter(renderer.doSwitch((EObject) input));");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public void changed(ObservableValue<? extends Object> obs, Object oldValue, Object newValue) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("if (newValue instanceof TreeItem) {");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("TreeItem<Object> treeItem = (TreeItem) newValue;");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("Object value = treeItem.getValue();");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("if (value instanceof EObject) {");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("setCenter(renderer.doSwitch((EObject) value));");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("}");
    _builder.newLine();
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
  
  @Override
  public String genName(final IdeContainer t) {
    StringConcatenation _builder = new StringConcatenation();
    String _modelName = t.getModelName();
    _builder.append(_modelName);
    _builder.append("Preview");
    return _builder.toString();
  }
  
  @Override
  public String genPath(final IdeContainer t) {
    StringConcatenation _builder = new StringConcatenation();
    String _replace = t.getPackagePath().replace(".", "/");
    _builder.append(_replace);
    _builder.append("/view/");
    return _builder.toString();
  }
  
  @Override
  public SourceType getSourceType() {
    return SourceType.SRC;
  }
}
