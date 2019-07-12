package de.dc.javafx.xcore.workbench.generator.template;

import de.dc.javafx.xcore.workbench.generator.template.IIdeGenerator;
import de.dc.javafx.xcore.workbench.ide.IdeContainer;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class PluginExtensionTemplate implements IIdeGenerator<IdeContainer> {
  @Override
  public String gen(final IdeContainer t) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
    _builder.newLine();
    _builder.append("<extensions:ExtensionManager xmi:version=\"2.0\" xmlns:xmi=\"http://www.omg.org/XMI\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:extensions=\"http://www.frateranatis.org/workbench/extensions\">");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("<extensionPoints xsi:type=\"extensions:ViewExtension\">");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("<views Id=\"de.dc.javafx.xcore.workbench.lecture.ui.view.");
    String _name = t.getName();
    _builder.append(_name, "    ");
    _builder.append("Preview\" name=\"");
    String _name_1 = t.getName();
    _builder.append(_name_1, "    ");
    _builder.append(" Preview\" extensionUri=\"de.dc.javafx.xcore.workbench.lecture.ui.view.LecturePreview\"/>");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("<views Id=\"de.dc.javafx.xcore.resource.ui.view.RecentlyOpenFileHistoryView\" name=\"Recently Open Files History\" extensionUri=\"de.dc.javafx.xcore.resource.ui.view.RecentlyOpenFileHistoryView\"/>");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("<views Id=\"de.dc.javafx.xcore.workbench.emf.ui.EmfSelectionViewer\" name=\"Selection Viewer\" extensionUri=\"de.dc.javafx.xcore.workbench.emf.ui.EmfSelectionViewer\"/>");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("</extensionPoints>");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("<extensionPoints xsi:type=\"extensions:PerspectiveExtension\">");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("<perspectives Id=\"");
    String _packagePath = t.getPackagePath();
    _builder.append(_packagePath, "    ");
    _builder.append(".");
    String _name_2 = t.getName();
    _builder.append(_name_2, "    ");
    _builder.append("Perspective\" name=\"");
    String _name_3 = t.getName();
    _builder.append(_name_3, "    ");
    _builder.append(" Perspective\" left=\"//@extensionPoints.0/@views.1\" right=\"//@extensionPoints.0/@views.2\" bottom=\"//@extensionPoints.0/@views.0\"/>");
    _builder.newLineIfNotEmpty();
    _builder.append("  ");
    _builder.append("</extensionPoints>");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("<extensionPoints xsi:type=\"extensions:EditorExtension\">");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("<editors Id=\"");
    String _packagePath_1 = t.getPackagePath();
    _builder.append(_packagePath_1, "    ");
    _builder.append(".");
    String _name_4 = t.getName();
    _builder.append(_name_4, "    ");
    _builder.append("EmfDetailedTreeView\" name=\"");
    String _name_5 = t.getName();
    _builder.append(_name_5, "    ");
    _builder.append(" Editor\" extensionUri=\"");
    String _packagePath_2 = t.getPackagePath();
    _builder.append(_packagePath_2, "    ");
    _builder.append(".");
    String _name_6 = t.getName();
    _builder.append(_name_6, "    ");
    _builder.append("EmfDetailedTreeView\" fileExtension=\"");
    String _lowerCase = t.getName().toLowerCase();
    _builder.append(_lowerCase, "    ");
    _builder.append("\"/>");
    _builder.newLineIfNotEmpty();
    _builder.append("  ");
    _builder.append("</extensionPoints>");
    _builder.newLine();
    _builder.append("</extensions:ExtensionManager>");
    _builder.newLine();
    return _builder.toString();
  }
}
