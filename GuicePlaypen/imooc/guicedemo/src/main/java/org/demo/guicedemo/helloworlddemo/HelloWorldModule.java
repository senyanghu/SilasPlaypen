package org.demo.guicedemo.helloworlddemo;

import java.io.PrintStream;

import org.demo.guicedemo.MyApplet;

import com.google.inject.AbstractModule;

public class HelloWorldModule extends AbstractModule {

	@Override
	protected void configure() {
		bind(MyApplet.class).to(StringWritingApplet.class);
		bind(MyDestination.class).to(PrinterStreamWriter.class);
		bind(PrintStream.class).toInstance(System.out);
		
		bind(String.class).annotatedWith(Output.class).toInstance("Hello World");
	}
}
