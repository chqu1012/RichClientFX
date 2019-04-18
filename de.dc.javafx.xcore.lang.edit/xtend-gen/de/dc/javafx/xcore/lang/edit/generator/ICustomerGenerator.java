package de.dc.javafx.xcore.lang.edit.generator;

@SuppressWarnings("all")
public interface ICustomerGenerator<T extends Object> {
  public abstract String path(final T input);
  
  public abstract String code(final T input);
}
