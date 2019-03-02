package de.dc.emf.javafx.xtext.generator;

import de.dc.emf.javafx.model.javafx.AttributeFX;
import de.dc.emf.javafx.model.javafx.ControlFX;
import de.dc.emf.javafx.model.javafx.ModelFX;
import de.dc.emf.javafx.model.javafx.NamedElement;
import de.dc.emf.javafx.model.javafx.ProjectFX;
import de.dc.emf.javafx.model.javafx.TableColumnFX;
import de.dc.emf.javafx.model.javafx.TableViewFX;
import de.dc.emf.javafx.model.javafx.util.JavafxSwitch;

@SuppressWarnings("all")
public class EnableGeneratorSwitch extends JavafxSwitch<Boolean> {
  @Override
  public Boolean caseAttributeFX(final AttributeFX object) {
    return Boolean.valueOf(false);
  }
  
  @Override
  public Boolean caseControlFX(final ControlFX object) {
    return Boolean.valueOf(false);
  }
  
  @Override
  public Boolean caseNamedElement(final NamedElement object) {
    return Boolean.valueOf(false);
  }
  
  @Override
  public Boolean caseProjectFX(final ProjectFX object) {
    return Boolean.valueOf(false);
  }
  
  @Override
  public Boolean caseModelFX(final ModelFX object) {
    return Boolean.valueOf(true);
  }
  
  @Override
  public Boolean caseTableColumnFX(final TableColumnFX object) {
    return Boolean.valueOf(true);
  }
  
  @Override
  public Boolean caseTableViewFX(final TableViewFX object) {
    return Boolean.valueOf(true);
  }
}
