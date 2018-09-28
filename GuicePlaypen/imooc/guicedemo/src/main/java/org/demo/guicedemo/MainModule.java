package org.demo.guicedemo;

import org.demo.guicedemo.helloworlddemo.HelloWorldModule;

import com.google.inject.AbstractModule;

public class MainModule extends AbstractModule {

	@Override
	protected void configure() {
		install(new HelloWorldModule());
	}

}
