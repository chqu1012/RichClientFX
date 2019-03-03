package de.dc.emf.javafx.xtext.generator;

import de.dc.emf.javafx.model.javafx.TableViewFX;
import de.dc.emf.javafx.model.javafx.util.JavafxSwitch;
import de.dc.emf.javafx.xtext.generator.FilePathSwitch;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.StringExtensions;

@SuppressWarnings("all")
public class FilteredElementPathSwitch extends JavafxSwitch<String> {
  @Override
  public String caseTableViewFX(final TableViewFX object) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _package = FilePathSwitch.getPackage(object);
    _builder.append(_package);
    _builder.append("/controls/Filtered");
    String _firstUpper = StringExtensions.toFirstUpper(object.getName());
    _builder.append(_firstUpper);
    _builder.append(".java");
    return _builder.toString();
  }
}
