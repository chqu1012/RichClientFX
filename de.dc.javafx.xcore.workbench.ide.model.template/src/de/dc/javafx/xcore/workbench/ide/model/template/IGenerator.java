package de.dc.javafx.xcore.workbench.ide.model.template;

public interface IGenerator<T> {

	String gen(T t);
	
	String genPath(T t);
	
	String genName(T t);
	 
	SourceType getSourceType();
}
