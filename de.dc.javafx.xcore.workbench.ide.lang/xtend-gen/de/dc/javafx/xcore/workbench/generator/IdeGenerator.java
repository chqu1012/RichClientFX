package de.dc.javafx.xcore.workbench.generator;

import com.google.common.collect.Iterables;
import com.google.inject.Inject;
import de.dc.javafx.xcore.workbench.ide.Editable;
import de.dc.javafx.xcore.workbench.ide.IdeContainer;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.xbase.compiler.JvmModelGenerator;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;

@SuppressWarnings("all")
public class IdeGenerator implements IGenerator {
  @Inject
  JvmModelGenerator jvmModelGenerator;
  
  @Inject
  @Extension
  private IQualifiedNameProvider _iQualifiedNameProvider;
  
  @Override
  public void doGenerate(final Resource input, final IFileSystemAccess fsa) {
    this.jvmModelGenerator.doGenerate(input, fsa);
    Iterable<IdeContainer> _filter = Iterables.<IdeContainer>filter(IteratorExtensions.<EObject>toIterable(input.getAllContents()), IdeContainer.class);
    for (final IdeContainer ide : _filter) {
      {
        StringConcatenation _builder = new StringConcatenation();
        String _replace = ide.getPackagePath().replace(".", "/");
        _builder.append(_replace);
        _builder.append("/");
        String _name = ide.getName();
        _builder.append(_name);
        _builder.append("EmfTreeModelView.java");
        final String path = _builder.toString();
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append("package ");
        String _packagePath = ide.getPackagePath();
        _builder_1.append(_packagePath);
        _builder_1.append(";");
        _builder_1.newLineIfNotEmpty();
        _builder_1.newLine();
        _builder_1.append("import com.google.common.eventbus.Subscribe;");
        _builder_1.newLine();
        _builder_1.append("import de.dc.javafx.xcore.code.preview.ui.FXPreview;");
        _builder_1.newLine();
        _builder_1.append("import ");
        String _qualifiedName = ide.getIdePackage().getQualifiedName();
        _builder_1.append(_qualifiedName);
        _builder_1.append(";");
        _builder_1.newLineIfNotEmpty();
        _builder_1.append("import ");
        String _qualifiedName_1 = ide.getIdeRootModel().getQualifiedName();
        _builder_1.append(_qualifiedName_1);
        _builder_1.append(";");
        _builder_1.newLineIfNotEmpty();
        _builder_1.append("import ");
        String _packagePath_1 = ide.getPackagePath();
        _builder_1.append(_packagePath_1);
        _builder_1.append(".manager.*;");
        _builder_1.newLineIfNotEmpty();
        _builder_1.append("import ");
        String _packagePath_2 = ide.getPackagePath();
        _builder_1.append(_packagePath_2);
        _builder_1.append(".view.*;");
        _builder_1.newLineIfNotEmpty();
        _builder_1.append("import de.dc.javafx.xcore.workbench.di.DIPlatform;");
        _builder_1.newLine();
        _builder_1.append("import de.dc.javafx.xcore.workbench.emf.IEmfManager;");
        _builder_1.newLine();
        _builder_1.append("import de.dc.javafx.xcore.workbench.emf.ui.EmfTreeModelView;");
        _builder_1.newLine();
        _builder_1.append("import de.dc.javafx.xcore.workbench.event.*;");
        _builder_1.newLine();
        _builder_1.append("import javafx.scene.control.MenuItem;");
        _builder_1.newLine();
        final String model = ide.getIdeRootModel().getSimpleName();
        _builder_1.newLineIfNotEmpty();
        _builder_1.append("public class ");
        String _name_1 = ide.getName();
        _builder_1.append(_name_1);
        _builder_1.append("EmfTreeModelView extends EmfTreeModelView<");
        _builder_1.append(model);
        _builder_1.append("> {");
        _builder_1.newLineIfNotEmpty();
        _builder_1.append("\t");
        _builder_1.newLine();
        _builder_1.append("\t");
        _builder_1.append("public ");
        String _name_2 = ide.getName();
        _builder_1.append(_name_2, "\t");
        _builder_1.append("EmfTreeModelView() {");
        _builder_1.newLineIfNotEmpty();
        _builder_1.append("\t\t");
        _builder_1.append("// Set edit mode for several attributes");
        _builder_1.newLine();
        {
          EList<Editable> _editables = ide.getEditables();
          for(final Editable n : _editables) {
            {
              EList<String> _methodName = n.getMethodName();
              for(final String methodName : _methodName) {
                _builder_1.append("\t\t");
                _builder_1.append("addEditableFor(");
                String _simpleName = ide.getIdePackage().getSimpleName();
                _builder_1.append(_simpleName, "\t\t");
                _builder_1.append(".eINSTANCE.");
                _builder_1.append(methodName, "\t\t");
                _builder_1.append("());");
                _builder_1.newLineIfNotEmpty();
              }
            }
          }
        }
        _builder_1.newLine();
        _builder_1.append("\t\t");
        _builder_1.append("MenuItem openPreviewMenuItem = new MenuItem(getEmfManager().getModelPackage().getName()+\" Preview\");");
        _builder_1.newLine();
        _builder_1.append("\t\t");
        _builder_1.append("openPreviewMenuItem.setOnAction(e->{");
        _builder_1.newLine();
        _builder_1.append("\t\t\t");
        _builder_1.append("DIPlatform.getInstance(IEventBroker.class).post(new EventContext<FXPreview>(\"open.preview\", new ");
        String _name_3 = ide.getName();
        _builder_1.append(_name_3, "\t\t\t");
        _builder_1.append("Preview()));");
        _builder_1.newLineIfNotEmpty();
        _builder_1.append("\t\t");
        _builder_1.append("});");
        _builder_1.newLine();
        _builder_1.append("\t\t");
        _builder_1.append("openWithMenu.getItems().add(openPreviewMenuItem);");
        _builder_1.newLine();
        _builder_1.append("\t\t");
        _builder_1.newLine();
        _builder_1.append("\t\t");
        _builder_1.append("DIPlatform.getInstance(IEventBroker.class).register(this);");
        _builder_1.newLine();
        _builder_1.append("\t");
        _builder_1.append("}");
        _builder_1.newLine();
        _builder_1.newLine();
        _builder_1.append("\t");
        _builder_1.append("@Override");
        _builder_1.newLine();
        _builder_1.append("\t");
        _builder_1.append("public IEmfManager<");
        _builder_1.append(model, "\t");
        _builder_1.append("> getEmfManager() {");
        _builder_1.newLineIfNotEmpty();
        _builder_1.append("\t\t");
        _builder_1.append("if (emfManager==null) {");
        _builder_1.newLine();
        _builder_1.append("\t\t\t");
        _builder_1.append("emfManager = new ");
        String _name_4 = ide.getName();
        _builder_1.append(_name_4, "\t\t\t");
        _builder_1.append("EmfManager();");
        _builder_1.newLineIfNotEmpty();
        _builder_1.append("\t\t");
        _builder_1.append("}");
        _builder_1.newLine();
        _builder_1.append("\t\t");
        _builder_1.append("return emfManager;");
        _builder_1.newLine();
        _builder_1.append("\t");
        _builder_1.append("}");
        _builder_1.newLine();
        _builder_1.newLine();
        _builder_1.append("\t");
        _builder_1.append("@Subscribe");
        _builder_1.newLine();
        _builder_1.append("\t");
        _builder_1.append("public void updateViewByEventBroker(EventContext<EmfCommand> context) {");
        _builder_1.newLine();
        _builder_1.append("\t\t");
        _builder_1.append("if (context.getEventTopic()==EventTopic.COMMAND_STACK_REFRESH) {");
        _builder_1.newLine();
        _builder_1.append("\t\t\t");
        _builder_1.append("if (context.getInput() instanceof EmfCommand) {");
        _builder_1.newLine();
        _builder_1.append("//\t\t\t\tmanager.getRoot().getValues().add(context.getInput());");
        _builder_1.newLine();
        _builder_1.append("\t\t\t");
        _builder_1.append("}");
        _builder_1.newLine();
        _builder_1.append("\t\t");
        _builder_1.append("}");
        _builder_1.newLine();
        _builder_1.append("\t");
        _builder_1.append("}");
        _builder_1.newLine();
        _builder_1.append("}");
        _builder_1.newLine();
        final String code = _builder_1.toString();
        fsa.generateFile(path, code);
      }
    }
  }
}
