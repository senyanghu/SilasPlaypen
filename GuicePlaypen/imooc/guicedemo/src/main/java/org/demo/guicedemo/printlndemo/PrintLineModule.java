package org.demo.guicedemo.printlndemo;

import org.demo.guicedemo.Applets;
import org.demo.guicedemo.MyApplet;
import org.demo.guicedemo.helloworlddemo.StringWritingApplet;

import com.google.inject.AbstractModule;
import com.google.inject.multibindings.MapBinder;
import com.google.inject.name.Names;

public class PrintLineModule extends AbstractModule {
	@Override
	protected void configure() {
		// MapBinder.newMapBinder(binder(), String.class,
		// MyApplet.class).addBinding("println").to(PrintLineApplet.class);
		Applets.register(binder()).named("println").to(PrintLineApplet.class);
		// bind(MyApplet.class).annotatedWith(Names.named("println")).to(PrintLineApplet.class);
	}
}
