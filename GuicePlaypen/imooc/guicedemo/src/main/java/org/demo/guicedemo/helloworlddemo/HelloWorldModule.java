package org.demo.guicedemo.helloworlddemo;

import java.io.PrintStream;
import java.util.List;

import org.demo.guicedemo.Applets;
import org.demo.guicedemo.Args;
import org.demo.guicedemo.MyApplet;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.google.inject.multibindings.MapBinder;
import com.google.inject.name.Names;

public class HelloWorldModule extends AbstractModule {

	@Override
	protected void configure() {
		//MapBinder.newMapBinder(binder(), String.class, MyApplet.class).addBinding("hello")
		// 		.to(StringWritingApplet.class);
		
		Applets.register(binder()).named("hello").to(StringWritingApplet.class);
		
		// bind(MyApplet.class).annotatedWith(Names.named("hello")).to(StringWritingApplet.class);
		bind(MyDestination.class).to(PrinterStreamWriter.class);
		bind(PrintStream.class).toInstance(System.out);

		// bind(String.class).annotatedWith(Output.class).toInstance("Hello World");
	}

	@Provides
	@Output
	String getOutputString(@Args List<String> args) {
		// return "Hello World";
		return args.get(0);
	}
}
