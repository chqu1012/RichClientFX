package de.dc.emf.javafx.xtext.generator;

import de.dc.emf.javafx.model.javafx.AttributeFX;
import de.dc.emf.javafx.model.javafx.Bean;
import de.dc.emf.javafx.model.javafx.Binding;
import de.dc.emf.javafx.model.javafx.BindingProperty;
import de.dc.emf.javafx.model.javafx.ChartFX;
import de.dc.emf.javafx.model.javafx.ChartFXData;
import de.dc.emf.javafx.model.javafx.ControlFX;
import de.dc.emf.javafx.model.javafx.DerivedBean;
import de.dc.emf.javafx.model.javafx.ModelFX;
import de.dc.emf.javafx.model.javafx.NamedElement;
import de.dc.emf.javafx.model.javafx.ProjectFX;
import de.dc.emf.javafx.model.javafx.TableColumnFX;
import de.dc.emf.javafx.model.javafx.TableViewFX;
import de.dc.emf.javafx.model.javafx.util.JavafxSwitch;

@SuppressWarnings("all")
public class EnableGeneratorSwitch extends JavafxSwitch<Boolean> {
  @Override
  public boolean caseAttributeFX(final AttributeFX object) {
    return false;
  }
  
  @Override
  public Boolean caseControlFX(final ControlFX object) {
    return Boolean.valueOf(false);
  }
  
  @Override
  public boolean caseNamedElement(final NamedElement object) {
    return false;
  }
  
  @Override
  public boolean caseProjectFX(final ProjectFX object) {
    return false;
  }
  
  @Override
  public boolean caseTableColumnFX(final TableColumnFX object) {
    return false;
  }
  
  @Override
  public boolean caseBindingProperty(final BindingProperty object) {
    return false;
  }
  
  @Override
  public boolean caseChartFXData(final ChartFXData object) {
    return false;
  }
  
  @Override
  public Boolean caseChartFX(final ChartFX object) {
    return Boolean.valueOf(true);
  }
  
  @Override
  public boolean caseDerivedBean(final DerivedBean object) {
    return true;
  }
  
  @Override
  public boolean caseBean(final Bean object) {
    return true;
  }
  
  @Override
  public boolean caseBinding(final Binding object) {
    return true;
  }
  
  @Override
  public Boolean caseModelFX(final ModelFX object) {
    return Boolean.valueOf(true);
  }
  
  @Override
  public boolean caseTableViewFX(final TableViewFX object) {
    return true;
  }
}
