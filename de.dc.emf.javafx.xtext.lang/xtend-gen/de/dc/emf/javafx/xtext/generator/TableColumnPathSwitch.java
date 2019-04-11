package de.dc.emf.javafx.xtext.generator;

import de.dc.emf.javafx.model.javafx.ModelFX;
import de.dc.emf.javafx.model.javafx.TableViewFX;
import de.dc.emf.javafx.model.javafx.util.JavafxSwitch;
import de.dc.emf.javafx.xtext.generator.FilePathSwitch;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.StringExtensions;

@SuppressWarnings("all")
public class TableColumnPathSwitch extends JavafxSwitch<String> {
  @Override
  public String caseModelFX(final ModelFX object) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _package = FilePathSwitch.getPackage(object);
    _builder.append(_package);
    _builder.append("/controls/cell/");
    String _firstUpper = StringExtensions.toFirstUpper(object.getName());
    _builder.append(_firstUpper);
    _builder.append("Type.java");
    return _builder.toString();
  }
  
  @Override
  public CharSequence caseTableViewFX(final TableViewFX object) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _package = FilePathSwitch.getPackage(object);
    _builder.append(_package);
    _builder.append("/controls/cell/Base");
    String _firstUpper = StringExtensions.toFirstUpper(object.getUsedModel().getName());
    _builder.append(_firstUpper);
    _builder.append("CellFeatures.java");
    return _builder;
  }
}
