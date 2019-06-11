package de.dc.spring.bootstrap.blog.model.gen;

@SuppressWarnings("all")
public interface IGenerator<T extends Object> {
  public abstract String gen(final T t);
}
