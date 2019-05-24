package de.dc.javafx.xcore.di;

import java.util.logging.Level;
import java.util.logging.Logger;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Module;

public class ApplicationContext {

	private static final Logger LOG = Logger.getLogger(ApplicationContext.class.getSimpleName());
	
	private static Module[] modules;
	private static Injector injector;

	static {
		synchronized (ApplicationContext.class) {
			modules = new Module[] { new SelectionServiceModule() };
		}
	}

	private ApplicationContext() {
	}

	public static void init() {
		injector = Guice.createInjector(modules);
		LOG.log(Level.ALL, "Initialize Guice for ApplicationContext with SelectionServiceModul!");
	}

	public static <T> T getInstance(Class<T> type) {
		T instance = null;
		try {
			instance = injector.getInstance(type);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return instance;
	}
}