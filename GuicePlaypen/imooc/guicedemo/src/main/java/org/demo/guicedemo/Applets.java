package org.demo.guicedemo;

import org.demo.guicedemo.helloworlddemo.MyDestination;

import com.google.inject.Binder;
import com.google.inject.binder.LinkedBindingBuilder;
import com.google.inject.multibindings.MapBinder;

public class Applets {

	public static class AppletRegister {
		private final Binder binder;

		private AppletRegister(Binder binder) {
			super();
			this.binder = binder;
		}

		public LinkedBindingBuilder<MyApplet> named(String name) {
			return MapBinder.newMapBinder(binder, String.class, MyApplet.class).addBinding(name);
		}
	}

	public static AppletRegister register(Binder binder) {
		return new AppletRegister(binder);
	}
}